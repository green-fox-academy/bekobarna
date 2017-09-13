public class UrlFixer {
    public static void main(String... args){
        String url = "https//www.reddit.com/r/nevertellmethebots";

        // Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
        // Also, the URL is missing a crutial component, find out what it is and insert it too!
        // Try to solve it more than once using different String functions!

        url = url.replace("https//www.reddit.com/r/nevertellmethebots", "https://www.reddit.com/r/nevertellmetheodds");

        System.out.println(url);
    }
}





/*public class UrlFixer {
    public static void main(String... args){
        String url = "https//www.reddit.com/r/nevertellmethebots";

        // Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
        // Also, the URL is missing a crutial component, find out what it is and insert it too!
        // Try to solve it more than once using different String functions!

        StringBuilder str = new StringBuilder("url");
        System.out.println("url = " + str);

        // insert character value at offset 8
        str.insert(5, 's');

        // prints StringBuilder after insertion

        System.out.println(str);
    }
}*/
