package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import tools.Params;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class BaseClass {
    public WebDriver driver;
    public WebDriverWait wait;
    static   Map<String, String> hashMap = new HashMap<String, String>();
    Faker faker = new Faker();
    Params params = new Params();
    Set<Cookie> cookies;
    Cookie cookieObj;
    public BaseClass(WebDriver driver) {
        this.driver = driver;
        wait =  new WebDriverWait(driver, 15);
    }



    public void clickOnElement(WebElement element) {
        element.click();
    }
    public void sendKeysData(WebElement element, String text) {
        element.sendKeys(text);
    }
    public void chooseSelectValue(WebElement selector, String value ) {
        Select select = new Select(selector);
        select.selectByValue(value);
    }
    public String getFirstName() {
        return faker.name().firstName();
    }
    public String getLastName() {
        return faker.name().lastName();
    }
    public String getPhone() {
        return faker.phoneNumber().phoneNumber();
    }
    public String getAddress() {
        return faker.address().streetName();
    }
    public String getCity() {
        return faker.address().city();
    }
    public String getPostcode() { return faker.address().zipCode(); }
    public void clickOnButtonWithValue(String value) {
        driver.findElement(By.xpath("//*[@value = '"+ value +"']")).click();

    }
    public void clickOnButtonWithText(String text) {
        driver.findElement(By.xpath("//*[text() = '" + text + "']"));
    }
    public void getUserCookies(){
        Set<Cookie> cookies = driver.manage().getCookies();
    }


    public void getUserCookie() {
     /* Set<Cookie>*/ cookies = driver.manage().getCookies();
        cookieObj = driver.manage().getCookieNamed("PHPSESSID");
        System.out.println(cookieObj);
        System.out.println(cookies.size());
        for (Cookie cookie: cookies){
            System.out.println(cookie.getName() + " " + cookie.getValue());
        }

    }
    public void addUserCookie() {

        driver.manage().addCookie(cookieObj);
        System.out.println(cookies.size());
    }
    //TODO cookies https://www.youtube.com/watch?v=TjLU9Iq9AeE
//    public void createCookieFile() {
//        File file = new File("Cookies.data");
//        try
//        {
//            // Delete old file if exists
//            file.delete();
//            file.createNewFile();
//            FileWriter fileWrite = new FileWriter(file);
//            BufferedWriter Bwrite = new BufferedWriter(fileWrite);
//            // loop for getting the cookie information
//
//            // loop for getting the cookie information
//            for(Cookie ck : driver.manage().getCookies())
//            {
//                Bwrite.write((ck.getName()+";"+ck.getValue()+";"+ck.getDomain()+";"+ck.getPath()+";"+ck.getExpiry()+";"+ck.isSecure()));
//                Bwrite.newLine();
//            }
//            Bwrite.close();
//            fileWrite.close();
//
//        }
//        catch(Exception ex)
//        {
//            ex.printStackTrace();
//        }
//    }
//    public void readCookieFile() {
//        try{
//
//            File file = new File("Cookies.data");
//            FileReader fileReader = new FileReader(file);
//            BufferedReader Buffreader = new BufferedReader(fileReader);
//            String strline;
//            while((strline=Buffreader.readLine())!=null){
//                StringTokenizer token = new StringTokenizer(strline,";");
//                while(token.hasMoreTokens()){
//                    String name = token.nextToken();
//                    String value = token.nextToken();
//                    String domain = token.nextToken();
//                    String path = token.nextToken();
//                    Date expiry = null;
//
//                    String val;
//                    if(!(val=token.nextToken()).equals("null"))
//                    {
//                        expiry = new Date(val);
//                    }
//                    Boolean isSecure = new Boolean(token.nextToken()).
//                            booleanValue();
//                    Cookie ck = new Cookie(name,value,domain,path,expiry,isSecure);
//                    System.out.println(ck);
//                    driver.manage().addCookie(ck); // This will add the stored cookie to your current session
//                }
//            }
//        }catch(Exception ex){
//            ex.printStackTrace();
//        }
//        driver.get(params.LOGIN_URL);
//    }
    }



