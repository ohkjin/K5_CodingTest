package codingTest.keyPad;

public class KeyPadTest {

	public static void main(String[] args) {
		KeyPad test1 = new KeyPad();
		int[] a1 = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
		System.out.println(test1.solution(a1,"right"));
		
		KeyPad test2 = new KeyPad();
		int[] a2 = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
		System.out.println(test2.solution(a2,"left"));
		
		KeyPad test3 = new KeyPad();
		int[] a3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
		System.out.println(test3.solution(a3,"right"));

	}

}
//
//public class Solution {
//    public String solution(int[] numbers, String hand) {
//        String answer = "";
//        return answer;
//    }