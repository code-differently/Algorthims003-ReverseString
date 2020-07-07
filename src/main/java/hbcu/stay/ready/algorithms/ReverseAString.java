package hbcu.stay.ready.algorithms;

public class ReverseAString {

    public String reverseAString(String input){
        //only first letters of words are capital, nothing else
        input = input.toLowerCase();
        //first reverse
        char [] charArr = input.toCharArray();
        //only go to halfway point, going to swap it
        for(int index = 0; index < input.length() / 2; index++) {
            char temp = charArr[index];
            charArr[index] = charArr[input.length() - 1 -index];
            charArr[input.length() - 1 - index] = temp;
        }

        //put capital letters
        for(int index = 0; index < input.length(); index++) {
            if(index == 0) {
                charArr[index] = Character.toUpperCase(charArr[index]);
            }
            if(charArr[index] == ' ') {
                charArr[index + 1] = Character.toUpperCase(charArr[index + 1]);
            }
        }
        return String.valueOf(charArr);
    }


}
