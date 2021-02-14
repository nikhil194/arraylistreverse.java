import java.util.*;

public class arrayListrevers
{
    public static void main(String[] args) 
    {         
        ArrayList<String> arrlist = new ArrayList<String>(); 

        //Adding elements to ArrayList object 
        arrlist.add("A");         
        arrlist.add("B");        
        arrlist.add("C");
        arrlist.add("D");
        arrlist.add("E");         
        arrlist.add("F");


        System.out.println("Before Reverse ArrayList:");         
        System.out.println(arrlist);

        Collections.reverse(arrlist);


        System.out.println("After Reverse ArrayList:");         
        System.out.println(arrlist);
    }
}  
