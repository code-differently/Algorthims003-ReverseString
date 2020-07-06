package hbcu.stay.ready.algorithms;

public class ReverseAString {

    public String reverseAString(String input){
        String newStr = "";

        input.toLowerCase();
        for(int i = input.length() - 1; i >= 0; i--)
        {
            newStr = newStr +  input.charAt(i);
        }
        String[] arr = newStr.split(" ");
        newStr = "";
        for(int i = 0; i < arr.length; i++)
        {
            newStr = newStr + " " +properCamel(arr[i]);
        }
        //i hate thiis above solution
        return newStr.substring(1);
    }
    public static String properCamel(String s)
    {
        return s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
    }


}
