package question3;

import java.util.Stack;

public class BrowserHistory {
    String url;

    Stack<String> history = new Stack<String>();
    Stack<String> secondary = new Stack<String>();

    BrowserHistory(String URL) {
        this.url = URL;
        history.push(url);
    }

    // visit a new URL
    public void visit(String url) {
        if (url == null) return;
        history.push(url);
        secondary.clear();
        System.out.println("Visited: " + url);
    }

    // navigate back to the previous page
    public void back() {
        if (history.size() > 1) {
            String currentUrl = history.pop();
            secondary.push(currentUrl);

            System.out.println("Back to: " + history.peek());
        } else {
            System.out.println("No history to go back to");
        }
    }

    // navigate forward to the next page
    public void forward() {
        if (!secondary.isEmpty()) {
            String currentUrl = secondary.pop();
            history.push(currentUrl);
            System.out.println("Forward to: " + currentUrl);
        } else {
            System.out.println("No forward history");
        }
    }

    // Override the toString method to display the browser history state
    @Override
    public String toString() {
        return "BrowserHistory: \n" +
                "Starting URL='" + url + '\n' +
                "History Stack: " + history + '\n' +
                "Secondary stack: " + secondary + "\n";
    }
}
