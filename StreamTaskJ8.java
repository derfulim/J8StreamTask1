import java.util.stream.*;
public class StreamTaskJ8{
	public static void main(String[] args) {
		//Сделать массив int. Из него получить IntStream.
		int arr [] = {8,3,5,1};
		IntStream intStream = IntStream.of(8,3,5,1);
		//Найти среднее значение элементов массива
		//System.out.println(intStream.average());
		//Найти минимальный элемент, значение и индекс
		int min = intStream.min().getAsInt();
		System.out.println(min);
		//Посчитать количество элементов равных нулю
		//System.out.println(intStream.filter(o -> o ==0).count());
		//Посчитать количество элементов больше нуля
		//System.out.println(intStream.filter(o -> o >0).count());
		//Помножить элементы массива на число
	//intStream.map(o -> o*2).forEach(System.out::println);
	int minIndex = IntStream.range(0,arr.length).
	filter(o->min==arr[o]).
	findFirst().getAsInt();
	System.out.println(minIndex);	
	}
}