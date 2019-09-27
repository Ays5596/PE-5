package ex;

import java.util.*;
import java.lang.String;

public class Student {
    private int id;
    private String name;
    private int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Integer getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public  Integer getAge(){
        return age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    static class StudentSorter implements Comparator<Student>{
          public int compare(Student a,Student b)
          {   int Agecomp = a.getAge().compareTo(b.getAge());
              int Namecomp = a.getName().compareTo(b.getName());
              int Idcomp = a.getId().compareTo((b.getId()));
             if(Agecomp==0){
                 if(Namecomp==0)
                     return ((Idcomp==0)? Namecomp:Idcomp);
                 else{
                     return  Namecomp;
                 }
             }
             else{
                 return Agecomp;
             }

          }
    }
    public static void main(String[] args){
        Student obj1 = new Student(1, "Ayush", 23);
        Student obj2 = new Student(2, "Hemant", 22);
        Student obj3 = new Student(3, "Shailesh", 26);
        Student obj4 = new Student(4, "Bheru", 25);
        Student obj5 = new Student(5, "Pradeep", 24);


        List<Student> studentList = new ArrayList<>();
        studentList.add(obj1);
        studentList.add(obj2);
        studentList.add(obj3);
        studentList.add(obj4);
        studentList.add(obj5);

        Iterator<Student> it = studentList.iterator();
        System.out.println("Before  sorting:");
        while(it.hasNext())
            System.out.println(it.next());

        Collections.sort(studentList, new StudentSorter());
        System.out.println("After sorting:");
        for(Student i:studentList)
            System.out.println(i);
    }
}
