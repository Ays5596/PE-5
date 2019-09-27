package ex;
import java.util.*;
import java.util.Map;
public class numCount {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string for count:");
        String str = input.nextLine();
        String[] s = str.split("[\\p{P}\\s]");
        System.out.println(s.length);
        for(String i : s)
            System.out.print(i+" ");
        Map<String, Integer> m = new HashMap<>(Collections.unmodifiableMap(new HashMap<>()));
        Integer c=0;
        for(int i =0;i<s.length;i++){
            if((s[i] != null)&&(!s[i].equals(" "))) {
                String p = s[i];
                for (int j = 0; j < s.length; j++) {
                    if (p.equals(s[j])) {
                        c++;
                        s[j] = null;
                    }
                }
                m.put(p,c);
            }
            c = 0;
        }
        System.out.println(m.toString());

    }
}
