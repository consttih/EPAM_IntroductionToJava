package by.jonline.str_as_an_array.task01;

public class Main {

	public static void main(String[] args) {
		
		String[] array_of_camel = {"greenCar", "brightSun", "bigDog", "littleCat"};
		
		String[] array_of_snake = toSnake(array_of_camel);
		
		System.out.println(String.join(", ", array_of_camel));
		System.out.println(String.join(", ", array_of_snake));

	}
	
	public static String[] toSnake(String[] array) {
		String[] array_of_snake = new String[array.length];
		for(int i = 0; i < array.length; i++) {
			StringBuilder word = new StringBuilder();
			for(int j = 0; j < array[i].length(); j++) {
				char letter = array[i].toCharArray()[j];
				
				if(Character.isLowerCase(letter)) {
					word.append(letter);
				}else {
					word.append('_').append(Character.toLowerCase(letter));
				}
			
			}
			
			array_of_snake[i] = word.toString();
		}
		
		return array_of_snake;
	}

}
