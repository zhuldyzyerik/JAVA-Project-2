package Project2;

public class WebDriverTester {
    public static void main(String[] args) {
        WebDriver[] webDriver={new ChromeDriver(), new Firefox(), new Safari()};
        for (WebDriver wd:webDriver) {
            wd.getTitle();
            wd.open();
            wd.close();

        }







    }    }