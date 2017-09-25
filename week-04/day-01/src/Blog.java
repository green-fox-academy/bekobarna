import java.util.ArrayList;
import java.util.List;

public class Blog {

    List<BlogPost> blogs = new ArrayList<>();

    BlogPost lordOfFlies = new BlogPost();
    BlogPost romeoAndJuliet = new BlogPost();
    BlogPost hamlet = new BlogPost();
    BlogPost origo = new BlogPost();
    BlogPost index = new BlogPost();

    public void add (BlogPost blogPost) {
        blogs.add(lordOfFlies);
        blogs.add(romeoAndJuliet);
        blogs.add(hamlet);
        blogs.add(origo);
        blogs.add(index);
    }

    public void delete (int i) {
        blogs.remove(i);
    }


}
