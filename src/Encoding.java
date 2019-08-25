import java.util.*;

public class Encoding
{
    //int m is number of dots
    //int n is number of dashes
    public static Set<String> morseCodes(int m, int n)
    {
        Set<String> result = new TreeSet<>();

        helperMorseCoder(m, n, "", result);
        return result;
    }
    public static void helperMorseCoder(int m, int n, String str, Set<String> result){
        //base case to account for if both m and n are zero, we add nothing to the result 
        if(m == 0 && n == 0){
            result.add(str);
            return;
        }

        // if the integer for number of dots is equal to zero then we add a dash to the result
        if(n == 0){
            helperMorseCoder(m-1, n,str+".", result);
            return;
        }

        // if the integer for number of dots is equal to zero then we add a dash to the result
        if(m == 0){
            helperMorseCoder(m,n-1,str+"-", result);
            return;
        }
        //final test to make sure all cases are accounted for
        helperMorseCoder(m-1, n,str+".", result);
        helperMorseCoder(m,n-1,str+"-", result);
    }
}
