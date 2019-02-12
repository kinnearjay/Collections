import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Streamer {

    public void streamMeDaddy(){
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        list.stream().filter( x -> x*10 == 0).collect(Collectors.<Integer>toList());
        List<Integer>  new_list = list.stream().map(x -> x * 13).collect(Collectors.toList());
        System.out.println(list.stream().reduce((x,y)->Math.max(x,y)).get());
        System.out.println(list.stream().reduce((Math::min)).get());

        list.stream().reduce((x,y)->Math.max(x,y)).get();
        for( int i = 0 ; i < new_list.size(); i++){
            System.out.println(new_list.get(i));
        }
    }

}
