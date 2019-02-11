import java.util.ArrayList;
import java.util.List;

public class Collections {
    public void haken(){
        int[] bigArr = new int[101];
        for(int i =1 ; i<=100; i++){
            bigArr[i]= i;

        }

        for (int c = 0; c<=100; c++ ){
            System.out.println("the value at index " + c + " is " + bigArr[c]);
        }


    }

    public static List<Integer> listy(){
         List<Integer> lister = new ArrayList<Integer>();

        for(int i = 100; i<1000; i++){
            lister.add(i);
        }

        for(int c = 0; c < 900; c++){
            System.out.println(lister.get(c));
        }
        return lister;
    }
    public void listTimesTen(List<Integer> listerss){
        List<Integer> listOTen = new ArrayList<Integer>();
        for( int i = 0 ; i < listerss.size(); i++){
            listerss.get(i);



            listOTen.add(listerss.get(i)*10);

        }

        for( int c = 0; c <listOTen.size(); c++){
            System.out.println(listOTen.get(c));
        }
    }
}
