package Collections;

import java.util.Enumeration;
import java.util.Vector;
public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> vector=new Vector();
        vector.addElement(90);
        vector.addElement(10);
        vector.addElement(20);
        vector.addElement(30);

        System.out.println(vector);
        Enumeration elements = vector.elements(); // better way is to store it in object type Object O = v.elements()
        while(elements.hasMoreElements()) // check whether there are more elements left in Vector vector being accessed by enumeration
        {
            Integer data = (Integer) elements.nextElement();
            System.out.println(data);
        }
    }
}
