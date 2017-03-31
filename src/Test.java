/**
 * Created by rain on 2017/3/30.
 */

public class Test {
    public static void main(String[] args) {
        //DBmanager.CreateTable("stu");
        //DBmanager.Insert("rain",90);
        int score = DBmanager.Search("rain");
        System.out.println(score);
    }
}
