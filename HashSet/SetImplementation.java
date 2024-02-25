package HashSet;
import java.util.HashSet;
import java.util.Iterator;
public class SetImplementation{
    public static void main(String[] args) {
        HashSet <Integer> set=new HashSet<Integer>();
        // add 
        set.add(1);
        set.add(2);
        set.add(3);
        // contains --return boolean value
        System.out.println(set.contains(1));
        // remove
        set.remove(1);
        System.out.println("1 no longer exists"+set.contains(10));
        // iterator
        Iterator it =set.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
    

    } 
}