package question3;

public class TestBrowserHistory {
    public static void main(String[] args) {
        BrowserHistory browser = new
                BrowserHistory("home.html");// Start with home.html
        browser.visit("page1.html"); // Current URL Page page1.html
        browser.visit("page2.html"); // Current URL Page page2.html
        browser.back(); // Back to: page1.html
        browser.back(); // Back to: home.html
        browser.back(); // No back page
        browser.forward(); // Forward to: page1.html
        browser.forward(); // Forward to: page2.html
        browser.forward();//No forward history.
        browser.visit("page3.html"); // Current URL page

        // more testing
        browser.visit("page4.html"); // Current URL page
        browser.forward(); // no forward to go since we've just visited a new page. forward history from previous was cleared.
    }
}
