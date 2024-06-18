package seleniumPrograms;

import java.util.PriorityQueue;

public class JavaNoSuchElementException {

    public static void main(String[] args) {


        PriorityQueue<String> pqObj = new PriorityQueue<String>();

        //System.out.println(pqObj.poll());
       // System.out.println(pqObj.remove());

        pqObj.add("Rajinikant");
        pqObj.add("Kamal");
        pqObj.add("Shahrukh Khan");
        pqObj.add("Vijay");
        pqObj.add("Ajith");

        System.out.println(pqObj);
        System.out.println("Head Element:"+pqObj.element());
        System.out.println("Remove");



        pqObj.remove();

        System.out.println("After removal: "+pqObj);

        pqObj.poll();

        System.out.println("After poll: "+pqObj);

    }
}
