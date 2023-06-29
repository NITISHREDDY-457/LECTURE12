// Interfaces----->>>

// interface shape{
//     double pi=3.14; //public, static, final
//     double getSquare(double r);//public and abstract
// }
// class circle implements shape{
//     public double getSquare(double r){
//         return r*r;
//     }
//     void fun(){
//         System.out.println("hey,  interface shape is implemented");
//     }
// }

// public class Lecture12 {
//     public static void main(String args[]){
//         circle c1= new circle();
//         System.out.println(c.getSquare(9));
//         c1.fun();
//     }
// }
// ---------------------------------

// Interface allows multiple Inheritence
interface k{
    int x=40;
    void fun();
}
interface l{
    int x=50;
    void fun();
}
class c implements k,l{
    public void fun(){
        System.out.println("Hello, I'm  class c function");
        System.out.println(m.x); // ambiguity resloved using fully qualified name
    }
}

interface O extends k,l{ //multiple inheritence through interfaces 
    void fun();
}

class d implements O{
    public void fun(){
        System.out.println("Hello, I'm class d function ");
    }
}

public class Lecture12 {
    public static void main(String args[]){
        c c2=new c();
        c2.fun();
        d d1=new d();
        d1.fun();
    }
}