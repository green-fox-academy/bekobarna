public class Trees {

  public static void main(String[] args) {
    String type = "";
    String leafColor = "";
    int age = 0;
    String sex = "";
    System.out.println(Birch(type, leafColor, age,sex));
    System.out.println("");
    System.out.println(Palm(type, leafColor, age,sex));
    System.out.println("");
    System.out.println(Pine(type, leafColor, age,sex));
    System.out.println("");
    System.out.println(Apple(type, leafColor, age,sex));
    System.out.println("");
    System.out.println(GiantSequoia(type, leafColor, age,sex));
  }

  public static String Birch (String type, String leafColor, int age, String sex) {
    type = "birch";
    leafColor = "green";
    age = 14;
    sex = "male";
    return "It`s a " + age + " year old " + sex + " " + type + " with " + leafColor +  " leaves.";
  }

  public static String Palm (String type, String leafColor, int age, String sex) {
    type = "palm";
    leafColor = "green";
    age = 2;
    sex = "female";
    return "It`s a " + age + " year old " + sex + " " + type + " with " + leafColor +  " leaves.";
  }

  public static String Pine (String type, String leafColor, int age, String sex) {
    type = "pine";
    leafColor = "grey";
    age = 62;
    sex = "female";
    return "It`s a " + age + " year old " + sex + " " + type + " with " + leafColor +  " leaves.";
  }

  public static String Apple (String type, String leafColor, int age, String sex) {
    type = "apple";
    leafColor = "yellow";
    age = 10;
    sex = "male";
    return "It`s a " + age + " year old " + sex + " " + type + " with " + leafColor +  " leaves.";
  }

  public static String GiantSequoia (String type, String leafColor, int age, String sex) {
    type = "giant sequoia";
    leafColor = "green";
    age = 394;
    sex = "female";
    return "It`s a " + age + " year old " + sex + " " + type + " with " + leafColor +  " leaves.";
  }
}
