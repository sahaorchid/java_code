public class task{

     public static void main(String []args){
        for(int i=1;i<=100;i++){
            int digit=0,digit1=0,incr=0;//loop through 1 to 100
            if(i%3==0){
                incr++;   //cheak divisible by 3 or not
                if(i%5==0){//if divisible by 3 nxt cheak divisible by 5 or not
                    System.out.println("FizzBuzz"); 
                }
                else{
                    System.out.println("Fizz"); 
                }
            }
            else if(i%5==0){
                incr++;//cheak divisible by 5 or not
                if(i%3==0){ //if divisible by 5 nxt cheak divisible by 3 or not
                    System.out.println("FizzBuzz"); 
                }
                else{
                    
                    System.out.println("Buzz"); 
                }
            }

            else{
                if(incr==0){
                    digit=i;
                    int digi=0;
                    while(digit>0){
                        if(digit%10==3){
                            System.out.println("Fizz");
                            digi++;
                            break;
                    
                        }
                        else if(digit%10==5){
                            digi++;
                            System.out.println("Buzz");
                            break;
                            
                        }
                        else{
                            digit=digit/10;
                        }
                    }
                    if(digi==0){
                        System.out.println(i);
                    }
                    
                }    

                
            }
                
                
        }
    }
}

