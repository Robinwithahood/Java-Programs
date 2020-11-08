import java.io.*;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class email_validater {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        String ret;
        Set<String> hs = new HashSet<String>();
        Scanner in = new Scanner(System.in);
        int i = 1;
        int nums = in.nextInt();
        String arr[];
        while(i <= nums+1){
            arr = in.nextLine().split("\\s");
            Pattern p = Pattern.compile("\\w+[@]+\\w+\\.+\\w");
            int j = 0;
            while(j < arr.length){
                Matcher m = p.matcher(arr[j]);
                boolean b = m.find();
                if(b){
                 ret = arr[j];
                 if(ret.endsWith(".") || ret.endsWith("!")){
                     ret = ret.substring(0,ret.length()-1);  
                 }
                 hs.add(ret);
                } 
                j++;
            }
            i++;
        }
        String l[] = new String[hs.size()];
        hs.toArray(l);
        int k = 0;
        Arrays.sort(l);
        while(k < l.length){
            if(k == l.length-1){
                System.out.print(l[k]);
            }
            else{
              System.out.print(l[k] + ";");   
            }
            k++;
        }        
    }
}
