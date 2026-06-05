public class Count {
    public static void main(String[] args) {
        long number= 19836232;
        int count=0;
        long temp=number;
       while(number>0){

           number=number/10;
          count++;
       }
        System.out.println(count);
    }

}
