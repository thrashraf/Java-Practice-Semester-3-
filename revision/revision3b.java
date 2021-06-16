
 interface class1 {

    double PI = 3.142;

     public void printVolume();
    
}

class calculate implements class1{

    double radius = 5;

    public void printVolume(){

        double volumeOfSphere = ((4.0/3.0) * PI * (radius * radius * radius));
        System.out.println("volume of sphere is "+ volumeOfSphere);
    }
}

class revision3b extends calculate{

    double height = 5;

    @Override
    public void printVolume() {
       
        double volumeOfCylinder = (PI * (radius * radius) *height);
        System.out.println("volume of cylinder is " + volumeOfCylinder);
        
    }

    public static void main(String[] args) {
        
        revision3 s = new revision3();

        s.printVolume();
        
        
    }
}