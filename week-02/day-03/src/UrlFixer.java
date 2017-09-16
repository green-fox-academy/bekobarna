// Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
// Also, the URL is missing a crutial component, find out what it is and insert it too!
// Try to solve it more than once using different String functions!

public class UrlFixer {
    public static void main(String... args){
        String url = "https//www.reddit.com/r/nevertellmethebots";
        url = url.replace("https//www.reddit.com/r/nevertellmethebots", "https://www.reddit.com/r/nevertellmetheodds");
        System.out.println(url);
    }
}


/*
public class UrlFixer {
    public static void main(String... args){
      String url = "https//www.reddit.com/r/nevertellmethebots";

      StringBuilder str = new StringBuilder(url);
      str.replace(38,42, "odds" );
      str.insert(5, ":");
      System.out.println(str);
    }
}
*/
