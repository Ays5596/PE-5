package ex;
import java.util.*;
import java.util.stream.*;
public class setSort {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string for set:");
        String str = input.nextLine();
        String[] s = str.split(" ");
        Set<String> values = new TreeSet<>();
        for(String i : s)
            values.add(i);

        System.out.println("Sorted Set: "+values);
        List<String> list = converToList(values);
        System.out.println("ArrayList: "+list);
    }
    public static <T> List<T> converToList(Set<T> set){
        List<T> list = new ArrayList<>();

        for(T i:set)
            list.add(i);
        return list;
    }
}
