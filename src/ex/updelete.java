package ex;
import javax.sound.midi.Soundbank;
import java.lang.reflect.Array;
import java.util.*;
public class updelete {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        List<String> a = new ArrayList<>();
    //    Map<String,Integer> b = new HashMap<>();
        System.out.println("Enter string:");
        String s1 = input.nextLine();
        String[] p = s1.split(" ");
        for(String i : p)
            a.add(i);
        for(String i : a)
            System.out.println(i);
        System.out.println("Enter first words and then its index to replace with earlier string:");
        String s2 = input.nextLine();
        String[] q = s2.split(" ");
        List<Integer> ind = new ArrayList<>();
        List<String> str = new ArrayList<>();
        int d=0;
        for(int i=0;i<q.length;i++)
        {  try{
            d =Integer.parseInt(q[i]);
            ind.add(d);
            p[d] = q[i-1];
        }
        catch(Exception e){
            str.add(q[i]);
        }
        }

        for(String i:p)
            System.out.println(i);
    }

}
