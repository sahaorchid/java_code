public class task{

     public static void main(String []args){
        for(int i=1;i<=100;i++){ //loop through 1 to 100
            if(i%3==0){//cheak divisible by 3 or not
                if(i%5==0){//if divisible by 3 nxt cheak divisible by 5 or not
                    System.out.println("FizzBuzz"); 
                }
                else{
                    System.out.println("Fizz"); 
                }
            }
            else if(i%5==0){//cheak divisible by 5 or not
                if(i%3==0){ //if divisible by 5 nxt cheak divisible by 3 or not
                    System.out.println("FizzBuzz"); 
                }
                else{
                    System.out.println("Buzz"); 
                }
            }
            else{
                System.out.println(i); 
            }
        }
     }
}
