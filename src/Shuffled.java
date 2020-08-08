import java.util.Random;
public class Shuffled {
    public static void main(String[] args)
    {
        Solution solution = new Solution("abc","def");
        System.out.println(solution.solve());

    }


}
class Solution{
String str1, str2,str3=" ";
Solution(String str1, String str2)
{
    this.str1=str1;
    this.str2=str2;
}
public String solve(){
    Random rand = new Random();
    String str4 = new String();
    if(str1.length() == str2.length())
    {
        str3 = str1.concat(str2);
        for (int i=0; i<str3.length(); i++)
        {
            str4 += str3.charAt(rand.nextInt(str3.length()));

        }

    }
    return str4;
}
}
