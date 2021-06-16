class ABC {

    String Name = "kului";

    void Display_Info () {

        System.out.println("hi nama saya" + Name);
    }
}
/**
 * InnerABC
 */
public class intro {

    ABC ob = new ABC();

    ob.Display_Info();

    
}