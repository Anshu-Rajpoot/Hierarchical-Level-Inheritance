class Shape{
    public void area(){
        System.out.println("Display Area");
    }
}
class Triangle extends Shape{
    public void area(int l , int b){
        System.out.println("Area of Triangle");
        System.out.println(0.5*l*b);
    }
}
class circle extends Shape{
    public void area(int r){
        System.out.println("Area of Circle");
        System.out.println(3.14*r*r);
    }
}

public class HierarchialInheritance{
    public static void main(String args[]){
        Shape s=new Shape();
        s.area();
        Triangle t=new Triangle();
        t.area(2,3);
        circle c=new circle();
        c.area(2);
    }
}