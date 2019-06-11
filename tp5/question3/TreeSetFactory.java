package question3;
/*Charbel el Khoury*/
import java.util.Set;
import java.util.TreeSet;

public class TreeSetFactory<T> implements Factory<Set<T>>{

    public TreeSet<T> create(){
return new TreeSet<T>();
}

// treeset automatically sort the elements, we can add our
// own comparator in the method create, inside the new TreeSet<T>()parameter
// ex: return new TreeSet<T>(String.CASE_INSENSITIVE_ORDER);






}
