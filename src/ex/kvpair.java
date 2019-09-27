package ex;
import java.util.*;
public class kvpair {
    public static void main(String[] args){
        System.out.println("Enter key-value pair:");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String[] s = str.split(" ");
        Map<String,String> map = new LinkedHashMap<>();
        for(int i=0;i<s.length;i++)
            map.put(s[i], s[i++]);

        map = modi(map);
      //  System.out.println(map.toString());
    }

    public static Map<String,String> modi(Map<String,String> m){
                  String[] s1 = new String[2];
                  String[] s2 = new String[2];

                  Map<String,String> map = new LinkedHashMap<>();
                  int i=0,c=0;
        for (Map.Entry<String,String> entry : m.entrySet())
        {
            System.out.println(entry.getKey()+" "+entry.getValue());
          //  s1[i++]=entry.getKey();
           // s2[c++]=entry.getValue();
        }
        map.put(s1[0],s1[1]);
        map.put(s2[1],s2[1]);
return map;
    }
}
