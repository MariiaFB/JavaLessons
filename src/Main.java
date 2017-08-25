import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quanity = 5;
        String[] s = new String[quanity];
        for(int i = 0; i < quanity; i++){
        	s[i] = sc.nextLine(); 
        	
        }
        
        System.out.println("Массив чисел в обратном порядке");
        int[] m = new int[quanity];
        for(int i = 0; i < quanity; i++){
        	m[i] = Integer.parseInt(s[quanity-1-i]);
        	
            System.out.print(+ m[i] + " ");
        }
        
        System.out.println("");
        System.out.println("Сортировка методом пузырька ");
        bubbleSort(m);
        for (int i = 0; i<5; i++){
        	System.out.print(m[i] + " ");
        }
	}
	public static void bubbleSort(int[] arr) {
		for (int i = arr.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (arr[j] > arr[j + 1]) {
					int tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
				}
			}
		}
	}
}
