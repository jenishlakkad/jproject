//In JD's lecture                                                            on:- 15/10

public class For_Loop_2 {
    public static void main(String[] args) {
        for (int i = 50; i <=100 ; i+=5) {
            System.out.println(i);
        }
        System.out.println();

        for (int i = 50; i <=100 ; i++) {
            if(i%5==0)
            {
                System.out.println(i);
            }
        }
    }
}
