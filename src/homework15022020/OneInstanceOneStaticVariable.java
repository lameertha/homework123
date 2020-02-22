package homework15022020;

public class OneInstanceOneStaticVariable {
    //Declare Instance variable
    String name = "LAMEE";

    //Declare Static variable
    static int age = 30;

    //Declare Main Method
    public static void main(String[] args) {
        OneInstanceOneStaticVariable  la = new OneInstanceOneStaticVariable ();

        //Call Method
        la.data1();
        data2();
    }

    //Declare Instance Method
    public void data1() {
        System.out.println(name);
        System.out.println(age);
    }

    //Declare Static Method
    public static void data2() {

        //Create Object to Call Instance Variable
        OneInstanceOneStaticVariable  obj1 = new OneInstanceOneStaticVariable ();
        System.out.println(obj1.name);
        System.out.println(age);
    }
}


