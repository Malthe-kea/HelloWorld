import java.util.ArrayList;

public class ArrayListepik {
    public static void main(String[] args) {

        ArrayList<String> frugt = new ArrayList<String>();

        frugt.add("Mangeo");
        frugt.add("Banan");
        frugt.add("Grankogle");

        System.out.println(frugt);

        for  (int i=0; i < frugt.size(); i++) {
            System.out.println(frugt.get(i));
        }
    }
}
