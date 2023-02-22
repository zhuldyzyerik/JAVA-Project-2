package Project2;

public interface WebDriver {
    /*
    4. Provide Implementation for the diagram below. Then
create a test class in which you need to create Objects of
ChromeDriver, FirefoxDrive and SafariDriver classes and
see which methods available to them.
     */

    void open();
    void close();
    String getTitle();

}

class ChromeDriver implements WebDriver{
    @Override
    public void open() {
        System.out.println("Open Chrome");
    }

    @Override
    public void close() {
        System.out.println("Close Chrome");
    }

    @Override
    public String getTitle() {
        return null;
    }
}
class Firefox implements WebDriver{
    @Override
    public void open() {
        System.out.println("Open FireFox");

    }

    @Override
    public void close() {
        System.out.println("Close Fire Fox");
    }

    @Override
    public String getTitle() {
        return null;
    }
}
class Safari implements WebDriver{

    @Override
    public void open() {
        System.out.println("Open Safari");
    }

    @Override
    public void close() {
        System.out.println("Close Safari");
    }

    @Override
    public String getTitle() {
        return null;
    }
}