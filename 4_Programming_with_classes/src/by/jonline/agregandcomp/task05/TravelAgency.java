package by.jonline.agregandcomp.task05;

import java.util.Arrays;

public class TravelAgency {

	private TravelPackage[] list_of_trp;

	public TravelAgency(TravelPackage[] list_of_trp) {
		super();
		this.list_of_trp = list_of_trp;
	}

	public TravelPackage[] sortedByType(String type) {
		
		System.out.println("Sorted by type of trip(" + type + "): ");

		int sch = 0;

		for (int i = 0; i < list_of_trp.length; i++) {

			if (list_of_trp[i].getType().toUpperCase().compareTo(type.toUpperCase()) == 0) {

				sch++;
			}
		}

		TravelPackage[] sorted_pack = new TravelPackage[sch];
		sch = 0;

		for (int i = 0; i < list_of_trp.length; i++) {

			if (list_of_trp[i].getType().toUpperCase().compareTo(type.toUpperCase()) == 0) {

				sorted_pack[sch] = list_of_trp[i];
				sch++;
			}
		}

		return sorted_pack;
	}

	public TravelPackage[] sortedByTransport(String type) {
		
		System.out.println("Sorted by type of transport(" + type + "): ");

		int sch = 0;

		for (int i = 0; i < list_of_trp.length; i++) {

			if (list_of_trp[i].getTransport().toUpperCase().contains(type.toUpperCase()) == true) {

				sch++;
			}
		}

		TravelPackage[] sorted_pack = new TravelPackage[sch];
		sch = 0;

		for (int i = 0; i < list_of_trp.length; i++) {

			if (list_of_trp[i].getTransport().toUpperCase().contains(type.toUpperCase()) == true) {

				sorted_pack[sch] = list_of_trp[i];
				sch++;
			}
		}

		return sorted_pack;
	}

	public TravelPackage[] sortedByEat(String type) {
		
		System.out.println("Sorted by type of meal(" + type + "): ");

		int sch = 0;

		for (int i = 0; i < list_of_trp.length; i++) {

			if (list_of_trp[i].getEat_type().toUpperCase().compareTo(type.toUpperCase()) == 0) {

				sch++;
			}
		}

		TravelPackage[] sorted_pack = new TravelPackage[sch];
		sch = 0;

		for (int i = 0; i < list_of_trp.length; i++) {

			if (list_of_trp[i].getEat_type().toUpperCase().compareTo(type.toUpperCase()) == 0) {

				sorted_pack[sch] = list_of_trp[i];
				sch++;
			}
		}

		return sorted_pack;
	}

	public TravelPackage[] sortedByDays(int amount) {
		
		System.out.println("Sorted by amount of days(" + amount + "): ");

		int sch = 0;

		for (int i = 0; i < list_of_trp.length; i++) {

			if (list_of_trp[i].getAmount_of_days() == amount) {

				sch++;
			}
		}

		TravelPackage[] sorted_pack = new TravelPackage[sch];
		sch = 0;

		for (int i = 0; i < list_of_trp.length; i++) {

			if (list_of_trp[i].getAmount_of_days() == amount) {

				sorted_pack[sch] = list_of_trp[i];
				sch++;
			}
		}

		return sorted_pack;
	}

	public TravelPackage[] sortedByAllAspects(String type, String trans_type, String eat_type, int amount) {
		
		System.out.println("Sorted by all aspects: ");

		int sch = 0;

		for (int i = 0; i < list_of_trp.length; i++) {

			if ((list_of_trp[i].getType().toUpperCase().compareTo(type.toUpperCase()) == 0)
					&& (list_of_trp[i].getTransport().toUpperCase().contains(trans_type.toUpperCase()) == true)
					&& (list_of_trp[i].getEat_type().toUpperCase().compareTo(eat_type.toUpperCase()) == 0)
					&& (list_of_trp[i].getAmount_of_days() == amount)) {

				sch++;
			}
		}

		TravelPackage[] sorted_pack = new TravelPackage[sch];
		sch = 0;

		for (int i = 0; i < list_of_trp.length; i++) {

			if ((list_of_trp[i].getType().toUpperCase().compareTo(type.toUpperCase()) == 0)
					&& (list_of_trp[i].getTransport().toUpperCase().contains(trans_type.toUpperCase()) == true)
					&& (list_of_trp[i].getEat_type().toUpperCase().compareTo(eat_type.toUpperCase()) == 0)
					&& (list_of_trp[i].getAmount_of_days() == amount)) {

				sorted_pack[sch] = list_of_trp[i];
				sch++;
			}
		}

		return sorted_pack;
	}

	public TravelPackage[] getList_of_trp() {
		return list_of_trp;
	}

	public void setList_of_trp(TravelPackage[] list_of_trp) {
		this.list_of_trp = list_of_trp;
	}

	@Override
	public String toString() {
		return "TravelAgency [list_of_trp=" + Arrays.toString(list_of_trp) + "]";
	}
	
	public void writePackages(TravelPackage[] pack) {
		
		for (int i = 0; i < pack.length; i++) {
			System.out.println(pack[i].toString());
		}
	}

}
