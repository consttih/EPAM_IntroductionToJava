package by.jonline.simpleclasses.task04;

public class Main {

	public static void main(String[] args) {

		Train moscow = new Train("Moscow", 153, "10:00");
		Train warsaw = new Train("Warsaw", 234, "11:34");
		Train gomel1 = new Train("Gomel", 134, "02:46");
		Train gomel2 = new Train("Gomel", 45, "11:56");
		Train kiev = new Train("Kiev", 98, "18:23");

		Train[] list_of_trains = new Train[] { moscow, warsaw, gomel1, gomel2, kiev };
		Array_Output(list_of_trains);

		System.out.println();
		System.out.println("Sorted list by number: ");
		Train[] sorted_list = Num_Sorting(list_of_trains);
		Array_Output(sorted_list);

		Train_Info(sorted_list, 98);

		System.out.println();
		System.out.println("Sorted list by destination: ");
		Train[] sorted_list2 = Dis_Sorting(list_of_trains);
		Array_Output(sorted_list2);

	};

	public static Train[] Num_Sorting(Train[] trains) {

		for (int left = 0; left < trains.length; left++) {

			int minInd = left;
			for (int i = left; i < trains.length; i++) {
				if (trains[i].getTrain_num() < trains[minInd].getTrain_num()) {
					minInd = i;
				}
				;
			}
			;

			Train tmp = trains[left];
			trains[left] = trains[minInd];
			trains[minInd] = tmp;
		}
		;

		return trains;
	};

	public static void Array_Output(Train[] trains) {

		for (int i = 0; i < trains.length; i++) {
			System.out.println(trains[i].toString());
		}
		;
	};

	public static void Train_Info(Train[] trains, int num) {
		System.out.println("\nInformaition about " + num + " train");

		int sch = 0;
		for (int i = 0; i < trains.length; i++) {
			if (trains[i].getTrain_num() == num) {
				System.out.println(trains[i].toString());
			} else {
				sch += 1;
			}
			;
		}
		;

		if (sch == 5) {
			System.out.println("there is no such train");
		}
		;

	};

	public static Train[] Dis_Sorting(Train[] trains) {

		boolean needIteration = true;
		while (needIteration) {
			needIteration = false;

			for (int i = 1; i < trains.length; i++) {

				if (trains[i].compareToPlus(trains[i - 1]) < 0) {  //метод compareTo изменён в классе Train
					Train tmp = trains[i];
					trains[i] = trains[i - 1];
					trains[i - 1] = tmp;

					needIteration = true;
				}
				;
			}
			;
		}
		;

		return trains;
	};

}
