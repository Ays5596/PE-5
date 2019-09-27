package ex;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class truestr {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string:");
        String str = input.nextLine();
        String[] s = str.split("\\p{P}");
        for(String i:s)
            System.out.print(i);
        int c=0;
        Map<String, Boolean> map = new HashMap<>();
        for(int i=0;i<s.length;i++)
        {   String p = s[i];
            if (p!=null) {
                for (int j = 0; j < s.length; j++)
                {
                   // assert s[i] != null;
                    if(p.equals(s[j])){
                       c++;
                       s[j]=null;
                }
                }
                if(c>=2)
                   map.put(p,true);
                else
                    map.put(p,false);
            }
            c=0;
        }
        System.out.println(map.toString());
    }
}
