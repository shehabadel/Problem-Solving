/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shuffledstring;

/**
 *
 * @author Gabry
 */

import java.util.ArrayList;
import java.util.Random;
public class ShuffledString {
    public static void main(String[] args)
    {
        Solution solution = new Solution("abc","def");
        System.out.println(solution.solve("abdcef"));

    }


}
class Solution{
String str1, str2,str3=" ";
Solution(String str1, String str2)
{
    this.str1=str1;
    this.str2=str2;
}
public String solve(String check){
    Random rand = new Random();
    String str4 = new String();
    if(str1.length() == str2.length())
    {
        str3 = str1.concat(str2);
        for (int i=0; i<str3.length(); i++)
        {
            //temp holds character from the string for comparison if it is repeated or not.
           String temp=Character.toString(str3.charAt(rand.nextInt(str3.length())));
           //In case the character is not repeated, then append it to str4
           if(str4.indexOf(temp)==-1){
            str4 += temp; 
           }
       //In case character is repeated, repeat the loop
        else
        {
                i=i-1;
                }
        }
        
    }
    else if(str1.length()<str2.length())
    {
        str3 = str1.concat(str2.substring(0,str1.length()));
        for (int i=0; i<str3.length(); i++)
        {
            //temp holds character from the string for comparison if it is repeated or not.
           String temp=Character.toString(str3.charAt(rand.nextInt(str3.length())));
           //In case the character is not repeated, then append it to str4
           if(str4.indexOf(temp)==-1){
            str4 += temp; 
           }
       //In case character is repeated, repeat the loop
        else
        {
                i=i-1;
                }
        }
        str4+=str2.substring(str1.length(), str2.length());
        //add the remaining characters to the end of str4
        return str4;
    }
    else if(str1.length()>str2.length())
    {
        str3 = str2.concat(str1.substring(0,str2.length()));
        for (int i=0; i<str3.length(); i++)
        {
            //temp holds character from the string for comparison if it is repeated or not.
           String temp=Character.toString(str3.charAt(rand.nextInt(str3.length())));
           //In case the character is not repeated, then append it to str4
           if(str4.indexOf(temp)==-1){
            str4 += temp; 
           }
       //In case character is repeated, repeat the loop
        else
        {
                i=i-1;
                }
        }
        //add the remaining characters to the end of str4
        str4+=str1.substring(str2.length(), str1.length());
        return str4;
    }
    System.out.println(str4);
    return check.matches(str4)? "true" : "false";
}
}
