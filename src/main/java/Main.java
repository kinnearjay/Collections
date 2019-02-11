import java.util.List;

public class Main {
    public static void main(String[] argv){
    Collections col = new Collections();
    col.haken();

    List<Integer> theList = col.listy();
    col.listTimesTen(theList);
    }
}
