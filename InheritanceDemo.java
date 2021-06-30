class Box{
    double length;
    double breadth;
    double height;

    Box(double l, double b, double h){
        length = l;
        breadth = b;
        height = h;
    }

    Box(){
        length = 0;
        breadth = 0;
        height = 0;
    }

    Box(double l){
        l = length = breadth = height;
    }

    double volume(){
        double vol = length * breadth * height;
        return vol;
    }
}

class BoxColor extends Box{
    String color;

    BoxColor(String c){
        super();
        color = c;
    }

    BoxColor(double l, double b, double h, String c){
        super(l, b, h);
        if (color == ""){
            color = "No Color";
        }

        else{
            color = c;
        }
    }

    BoxColor(){
        super();
        color = "This box does not have any color";
    }

    String boxcolor(){
        return color;
    }
}

class InheritanceDemo{
    public static void main(String args[]){
        Box mybox2 = new Box();
        
        // Accessing Instance variables and methods from Box class with Inheritance.
        double length = mybox2.length = 10;
        double breadth = mybox2.breadth = 10;
        double height = mybox2.height = 10;
        
        BoxColor mybox1 = new BoxColor(length, breadth, height, "Red");

        double volume = mybox1.volume();
        
        System.out.println("Volume: " + volume);
        System.out.println("Color: " + mybox1.color);
    }
}