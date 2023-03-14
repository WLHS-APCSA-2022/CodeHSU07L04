import java.sql.Array;
import java.util.ArrayList;

public class ArrayListFun {
    public static void main(String[] args) {
        ArrayList<Integer> testList = new ArrayList<Integer>();
        testList.add(3);
        testList.add(6);
        testList.add(9);
        testList.add(12);
        System.out.println("Before: " + testList);
        addElement(testList);
        System.out.println("After: " + testList);

    }

    /**
     * If an element is odd, you will add that number + 2 after it
     * e.g. [3,6,9,12] -> [3,5,6,9,11,12]
     * @param list
     */
    public static void addElement(ArrayList<Integer> list){
        for(int i = 0; i<list.size(); i++){
            int currentItem = list.get(i);
            if(currentItem%2 == 1){
                list.add(i+1,currentItem+2);
                i+=1; //have to increment past the element you added or you will get an infinite loop
            }
        }
    }
}