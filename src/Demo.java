import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Integer> ab = new ArrayList<>();
        System.out.println("array is "+Arrays.toString(ab.toArray()));

        int[] as =new int[]{1,2,3,4};
        System.out.println("new array is"+ as);
        ab.add(27);
        ab.add(12);
        ab.add(23);

        System.out.println("array is "+Arrays.toString(ab.toArray()));
        System.out.println(ab);
        Collections.sort(ab);
        Collections.reverse(ab);
        System.out.println(ab);

        Demo demo = new Demo();
        System.out.println(demo);

        System.out.println("class is "+demo.getClass() + "hey there "+demo.hashCode()) ;
        System.out.print(desc(5));
        System.out.println("testing testing");
    }

//    public String toString() {
//        return "hey there";
//    }

    public static int desc(int value) {
        return value;
    }
}