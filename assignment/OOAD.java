//define class
public class OOAD
    {
    //define data member
    static String name;
    //define method

    public void OOADname(String name) {
        name = this.name;
    }
    public void printInfo()
    {
	 System.out.println("my name is :" + name);
    }

    public static void main(String[] args) {
        
        OOAD anal = new OOAD();

        anal.OOADname("Ashraf");

        anal.printInfo();
    }

}