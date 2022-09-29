package 자바0913;

import java.util.Scanner;

public class 문제풀이 {

	public static int solution(int n) {
		
		int answer =0;
		long x =n; 
		if(x==1) return answer;
		while(x != 1) {
			if(x%2==0) {
				x=x/2;
				++answer;}
			else{
				x=(x*3)+1;
				++answer;}
			if(answer>500) return -1;
		}
		return answer;
	}
	
	public static void main(String[] args) {
		

	}

}
