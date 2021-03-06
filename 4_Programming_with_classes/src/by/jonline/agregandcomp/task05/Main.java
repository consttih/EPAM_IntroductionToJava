package by.jonline.agregandcomp.task05;

public class Main {

	public static void main(String[] args) {
		
		TravelPackage dubai_rt = new TravelPackage("Dubai", "Rest", "Plane", "RO", 7);
		TravelPackage dubai_sh = new TravelPackage("Dubai", "Shopping", "Plane", "HB", 4);
		TravelPackage heviz_rv = new TravelPackage("Heviz", "Recovery", "Plane", "AL", 14);
		TravelPackage paris_ex = new TravelPackage("Paris", "Excursions", "Plane", "BB", 8);
		TravelPackage paris_sh = new TravelPackage("Paris", "Shopping", "Plane", "HB", 6);
		TravelPackage msc_tver_kruiz = new TravelPackage("Moscow-Tver", "Kruiz", "Cruise ship", "AL", 3);
		
		TravelPackage[] for_tr_ag = new TravelPackage[] {dubai_rt, dubai_sh, heviz_rv, paris_ex, paris_sh, msc_tver_kruiz};
		
		TravelAgency super_rest = new TravelAgency(for_tr_ag);
		
		TravelPackage[] rest;
		rest = super_rest.sortedByType("rest");
		super_rest.writePackages(rest);
		System.out.println();
		
		TravelPackage[] shopping;
		shopping = super_rest.sortedByType("shopping");
		super_rest.writePackages(shopping);
		System.out.println();
		
		TravelPackage[] plane;
		plane = super_rest.sortedByTransport("plane");
		super_rest.writePackages(plane);
		System.out.println();
		
		TravelPackage[] four_days;
		four_days = super_rest.sortedByDays(4);
		super_rest.writePackages(four_days);
		System.out.println();
		
		TravelPackage[] for_you;
		for_you = super_rest.sortedByAllAspects("shopping", "plane", "HB", 4);
		super_rest.writePackages(for_you);
		

	}

}
