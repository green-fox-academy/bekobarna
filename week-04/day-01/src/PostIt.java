public class PostIt {
    String backgroundColor;
    String text;
    String textColor;


    public static void main(String[] args) {

        PostIt Idea1 = new PostIt();
        Idea1.backgroundColor = "orange";
        Idea1.text = "Idea1";
        Idea1.textColor = "blue";

        PostIt Awesome = new PostIt();
        Awesome.backgroundColor = "pink";
        Awesome.text = "Awesome";
        Awesome.textColor = "black";

        PostIt SuperB = new PostIt();
        SuperB.backgroundColor = "yellow";
        SuperB.text = "SuperB";
        SuperB.textColor = "green";

        System.out.println(Idea1.backgroundColor +  " " + Idea1.text +  " " + Idea1.textColor);
        System.out.println(Awesome.backgroundColor +  " " + Awesome.text +  " "  + Awesome.textColor);
        System.out.println(SuperB.backgroundColor +  " " + SuperB.text +  " " + SuperB.textColor);
        
    }
}
