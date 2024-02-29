package CollectionFrameWork;

public class Generic2 {
    public static void main(String[] args) {
        temp("KLeer");
        temp(12);
        temp1("i");

    }
//<> datatype restrict can be done
    public static <T>void temp(T x){
        System.out.println(x);
    }

    public static <Keerthy> void temp1(Keerthy i){
        System.out.println(i);
    }

}


