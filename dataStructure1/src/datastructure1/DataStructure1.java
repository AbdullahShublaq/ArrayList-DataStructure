package datastructure1;

public class DataStructure1 {

    public static void main(String[] args) {
        CustomizeArrayList c = new CustomizeArrayList();

        System.out.println(c.size());
        c.add(5);
        c.add(0);
        c.add(10);
        System.out.println(c.size());
        c.remove(1);
        System.out.println(c.size());
        System.out.println(c.get(1));
        System.out.println(c.contains(6));
        
    }
}
