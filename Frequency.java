package week1.day2;

public class Frequency {

	public static void main(String[] args) {
		int[] arr=new int[]{3,4,2,5,1,2,6,3,6,2,4,7,1};
		int[] visitedArr=new int[arr.length];
		int visited=-1;
		for (int i = 0; i < arr.length; i++) {
			int count=1;
			for (int j = i+1; j < visitedArr.length; j++) {
				if(arr[i]==arr[j]){
					count++;
					visitedArr[j]=visited;
					}
			}
			if(visitedArr[i]!=visited){
				visitedArr[i]=count;
			} 
		}
		for (int i = 0; i < visitedArr.length; i++) {
			if(visitedArr[i]!=visited){
				System.out.println("Frequency of"+arr[i]+":"+visitedArr[i]);
			}
		}
		// TODO Auto-generated method stub

	}

}
