package codingTest.keyPad;
import java.lang.Math;

public class KeyPad2 {
	
    public String solution(int[] numbers, String hand) {
    	 String answer = "";
         int[] fleft = {0,3};
         int[] fright = {2,3};
         
         for(int i=0;i<numbers.length;i++) {
             String which = "";
         	int number = numbers[i];
         	int[] tpos = {0,(number-1)/3};//L
         	if(number==1|number==4|number==7) {
         		which="L";
         	}else if(number==3|number==6|number==9){
         		tpos[0] = 2;
         		which="R";
         	}else {
         		tpos[0] =1;
         		if(number==0) tpos[1]=3; 
         		
         		int ldist = distance(tpos,fleft);
         		int rdist = distance(tpos,fright);
         		if (rdist<ldist) which="R";
         		else if (ldist<rdist) which="L";
         		else {
        			if (hand.equals("right")) which="R";
        			else which="L";
         		}
         	}
         answer+=which;
         if (which.equals("L")) fleft = tpos;
         else fright = tpos;
         
         }
         
 		return answer;
 	}
     
     public int distance(int[] tpos, int[] fpos) {
 		return Math.abs(tpos[0]-fpos[0])+Math.abs(tpos[1]-fpos[1]);
     }
 	

 }
