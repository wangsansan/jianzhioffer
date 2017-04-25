package cn.edu.bjut.sorts;

public class SortAges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ages = {22,35,68,15,24,65,75,45,35,25,52,54,53,45};
		SortAges question = new SortAges();
		question.sortAge(ages);
	}
	
	public void sortAge(int[] ages){
		int[] array = new int[100];
		for(int i = 0; i < array.length; i++)
			array[i] = 0;
		for(int age: ages){
			array[age]++;
		}
		
		for(int i = 0; i < array.length; i++){//因为array.length已知，其实是为公司最大年龄者，是个常数，所以虽然是两重for循环，但是时间复杂度只是O(n)
			for(int j = 0; j < array[i]; j++)
				System.out.print(i + " ");
		}
	}

}
