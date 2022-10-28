import java.util.*;
 class vrc{
     public static void main(String[] args){
        
        int count = 0;
        
        Scanner sc = new Scanner(System.in);
	System.out.println("\t SENDER PROCESS\n\n\n");
        System.out.println("Enter no. of bits :");
	int num_bits=sc.nextInt();
         
       
        ArrayList<Integer> packet_bits = new ArrayList<>();
        
	System.out.println("Enter the bits :");
	for(int i=0;i<num_bits-1;i++){
		int num=sc.nextInt();
		packet_bits.add(i,num); 
	}

	for(int j=0;j<num_bits-1;j++){
		if(packet_bits.get(j) == 1){
			count++;
		}
	}
	System.out.println("Total number of 1's  is :"+ count);
      


       
        if (count%2!=0){
		packet_bits.add(num_bits-1,1);
           	System.out.println("parity bit added 1");
        }
        else{
           packet_bits.add(num_bits-1,0);
           System.out.println("parity bit added 0");
       }
       System.out.println(packet_bits);
	System.out.println("\n\n");
	System.out.println("\t RECEIVER PROCESS\n\n");
	if (count%2==0){
		
           	System.out.println("MESSAGE ACCEPTED");
        }
        else{
           System.out.println("MESSAGE REJECTED");
       }
     }
 }

