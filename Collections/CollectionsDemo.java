import java.util.ArrayList;
class CollectionsDemo{
    public static void main(String[] args){
        ArrayList<String> students = new ArrayList<>();
        students.add("Alisha");
        students.add("Hezal");
        students.add("Himanshi");
        students.add("Riddhi");
        System.out.println("Original list: ");
        System.out.println(students);

        students.add(2,"Rahul");
        System.out.println(students);

        students.set(2,"Vihaan");
        System.out.println(students);

        students.remove("Vihaan");
        System.out.println(students);

        System.out.println("Contains Vihaan: " + students.contains("Vihaan"));

        for(String name:students){
            System.out.println(name);
        }
    }
}