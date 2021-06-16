class Dad {

    public String name;
    public int age;

    void dadDetail(){

        name = "abdul razak";
        age = 49;
    }

    void display(){

        System.out.println("name : " + name);
        System.out.println("age : " + age);

    }
}

class Child extends Dad{

    String location;

    void childDetail(){
        name = "Luqman Hakim";
        age = 19;
        location = "Kuala Terengganu";
    }

    void display(){
        super.display();
        System.out.println("Location : " + location);
      
    }
}

class revision3A {

    public static void main(String[] args) {
        
        Dad d = new Dad();
        Child c = new Child();

        d.dadDetail();
        d.display();
        c.childDetail();
        c.display();
       
    }
}