package cn.edu.bjut.offer3;

public class FindNumInArray {
	
	static int[][] array = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
	
	public boolean findNumInArray(int num){
		int j = array[0].length - 1;
		int i = 0;
		while(i < array.length && j >= 0){
			System.out.println(array[i][j]);
			if(array[i][j] < num){
				i++;
				continue;
			}
			if(array[i][j] > num){
				j--;
				continue;
			}
			if(array[i][j] == num){
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindNumInArray question = new FindNumInArray();
		question.findNumInArray(10);
	}

}
