public class ReverseNumber {
    public static void main(String[] args) {
        int number=198372;
        int temp=0;
        int ld=0;
        while(number!=0){

            ld=number%10;
            temp=temp*10+ld;
            number=number/10;
        }
        System.out.println(temp);

    }

}
