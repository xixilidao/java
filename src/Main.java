import java.lang.reflect.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("dfsdfsdfsd");

        System.out.println("Hello World!");

        Demo1 dm = new Demo1();
        System.out.println(dm.GetName());

        Class c1 = int.class;
        Class c2 = String.class;
        System.out.println(c1.getName());
        System.out.println(c2.getSimpleName());

        Main m =new Main();
        Integer i = 0;
        //m.printClassMessage(i);

        Demo1 dm1 = new Demo1();
        m.printClassMessage(dm1);


    }

    public void printClassMessage(Object obj){
        Class c = obj.getClass();
        System.out.println("类的名称是:"+c.getName());
        Method[] ms = c.getDeclaredMethods();
        c.getDeclaredMethods();
        for (Method m1:ms
             ) {
            System.out.println(m1.getName());

            //Class [] c1 = m1.getClass();

        }

    }
}
