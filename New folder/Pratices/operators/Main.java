class father{
    static void m(){
    int age=40;
    String a="Father";
    String b="Her is my hero";
    System.out.println(age+" "+a+" "+b);
}
}
class son extends father{
    static void p (){
   
    String a="I am a Student";
    String b="son of father";
   
    System.out.println(a+" "+b);
}
}
class b1 extends son{
    static void p1(){
        System.out.println("I'm sibling of son class");
    }
}
class b2 extends son{
    static void p2(){
        System.out.println("I'm sibling of son class");
    }
}
class s extends son{
    static void p3(){
        System.out.println("I'm sibling of son class");
    }
}
class Main{
    public static void main(String []args){
        father a=new father();
        son b=new son();
        b1 bro1=new b1();
        b2 bro2=new b2();
        s s1=new s();
        b.p();
        a.m();
        bro1.p1();
        bro2.p2();
        s.p3();
    }
}
