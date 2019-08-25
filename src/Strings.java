//Hemant Thobbi
//CS 151
//This is the string class for implementing the unique methods class


public class Strings {

    public static String uniqueLetters(String str) {
        int[] count = new int[256];
        int i;
        String finalString = "";
        for(i = 0; i < str.length(); i++){
            if(str.charAt(i)!=' '){
                count[(int)str.charAt(i)]++;
            }

        }
        int n = i;

        for (i = 0; i < n; i++)
            if (count[(int)str.charAt(i)] == 1)
                finalString+=str.charAt(i);
        return finalString;
    }
    public static void main(String [] args){
        Strings.uniqueLetters("harrasses");
    }
}