/**
 * TestArray4
 */
public class TestArray4 {

    
    static int [] getEmployees(){


        int[] array = new int[6];

        array[0] = 9;
        array[1] = 11;
        array[2] = 15;
        array[3] = 19;
        array[4] = 29;
        array[5] = 55;
        return array;
    }

    public static void main(String[] args) {
        
        for (int e : getEmployees() ){

            System.out.println(e);
        }
    }
}