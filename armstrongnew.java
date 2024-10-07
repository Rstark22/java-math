public class armstrongnew {
    public static void main(String[] args) {
        int number=198;
        int original=number;
        int sum=0;

        while(number>0){
            int rem=number%10;
            sum=sum+(rem*rem*rem);
            number=number/10;
        }
        System.out.println(sum==original);

        if(sum==original){
            System.out.println( original + " is an armstrong number");
        }else{
            System.out.println("it is not an armstrong number");
        }
    }
    
}
