import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by nguyeti on 17/06/2017.
 */
class UrlLibrary implements Iterable<String> {
    private LinkedList<String> urls = new LinkedList<String>();

    public UrlLibrary() {
        urls.add("http://www.google.com");
        urls.add("http://www.nba.com");
        urls.add("http://www.facebook.com");
    }

    public LinkedList<String> getUrls() {
        return urls;
    }

    @Override
    public Iterator<String> iterator() {
        return urls.iterator();
    }
}

public class IterableExample {
    public static void main(String[] args) {
        UrlLibrary urlLibrary = new UrlLibrary();

        for (String url : urlLibrary) {
            System.out.println(url);
        }
    }
}
