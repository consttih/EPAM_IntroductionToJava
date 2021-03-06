package by.jonline.agregandcomp.task03;

public class Main {

	public static void main(String[] args) {
		
		City minsk = new City("Minsk", 348);
		City borisov = new City("Borisov", 46);
		City soligorsk = new City("Soligorsk", 15);
		City molodechno = new City("Molodechno", 30);
		
		City[] cities_of_minsk = new City[] {minsk, borisov};
		City[] cities_of_soligorsk = new City[] {soligorsk, molodechno};
		
		District d_of_minsk = new District("Minsky district", cities_of_minsk);
		d_of_minsk.squareOfDistrict();
		District d_of_soligorsk = new District("Soligorsky district", cities_of_soligorsk);
		d_of_soligorsk.squareOfDistrict();
		
		District[] districs_of_minsk = new District[] {d_of_minsk, d_of_soligorsk};
		
		Region r_of_minsk = new Region("Minsky region", districs_of_minsk, minsk);
		r_of_minsk.squareOfRegion();
		
		
		
		City brest = new City("Brest", 145);
		City baranovichy = new City("Baranovichy", 54);
		City pinsk = new City("Pinsk", 43);
		City kobryn = new City("Kobryn", 32);
		
		City[] cities_of_brest = new City[] {brest, baranovichy};
		City[] cities_of_pinsk = new City[] {pinsk, kobryn};
		
		District d_of_brest = new District("Brestsky district", cities_of_brest);
		d_of_brest.squareOfDistrict();
		District d_of_pinsk = new District("Pinsky district", cities_of_pinsk);
		d_of_pinsk.squareOfDistrict();
		
		District[] districs_of_brest = new District[] {d_of_brest, d_of_pinsk};
		
		Region r_of_brest = new Region("Brestsky region", districs_of_brest, brest);
		r_of_brest.squareOfRegion();
	
		
		
		City vitebsk = new City("Vitebsk", 124);
		City orsha = new City("Orsha", 39);
		City novopolotsk = new City("Novopolotsk", 49);
		City polotsk = new City("Polotsk", 41);
		
		City[] cities_of_vitebsk = new City[] {vitebsk, orsha};
		City[] cities_of_novopolotsk = new City[] {novopolotsk, polotsk};
		
		District d_of_vitebsk = new District("Vitebsky district", cities_of_vitebsk);
		d_of_vitebsk.squareOfDistrict();
		District d_of_novopolotsk = new District("Novopolotsky district", cities_of_novopolotsk);
		d_of_novopolotsk.squareOfDistrict();
		
		District[] districs_of_vitebsk = new District[] {d_of_vitebsk, d_of_novopolotsk};
		
		Region r_of_vitebsk = new Region("Vitebsky region", districs_of_vitebsk, vitebsk);
		r_of_vitebsk.squareOfRegion();
		
		
		
		City gomel = new City("Gomel", 139);
		City mozyr = new City("Mozyr", 44);
		City zhlobyn = new City("Zhlobyn", 28);
		City rechytza = new City("Rechytza", 29);
		
		City[] cities_of_gomel = new City[] {gomel, mozyr,};
		City[] cities_of_zhlobyn = new City[] {zhlobyn, rechytza};
		
		District d_of_gomel = new District("Gomelsky district", cities_of_gomel);
		District d_of_zhlobyn = new District("Zhlobynsky district", cities_of_zhlobyn);
		
		District[] districs_of_gomel = new District[] {d_of_gomel, d_of_zhlobyn};
		
		Region r_of_gomel = new Region("Gomelsky region", districs_of_gomel, gomel);
		r_of_gomel.squareOfRegion();
		
		
		
		City grodno = new City("Grodno",142);
		City lida = new City("Lida", 47);
		City slonym = new City("Slonym", 41);
		City volkovysk = new City("Volkovysk", 29);
				
		City[] cities_of_grodno = new City[] {grodno, lida};
		City[] cities_of_slonym = new City[] {slonym, volkovysk};
		
		District d_of_grodno = new District("Grodnensky district", cities_of_grodno);
		District d_of_slonym = new District("Slonymsky district", cities_of_slonym);
		
		District[] districs_of_grodno = new District[] {d_of_grodno, d_of_slonym};
		
		Region r_of_grodno = new Region("Grodnensky region", districs_of_grodno, grodno);
		r_of_grodno.squareOfRegion();
		
		
		
		City mogilev = new City("Mogilev", 118);
		City bobruisk = new City("Bobruisk", 96);
		City gorky = new City("Gorky", 22);
		City osipovichi = new City("Osipovichi", 15);
		
		City[] cities_of_mogilev = new City[] {mogilev, bobruisk};
		City[] cities_of_gorky = new City[] {gorky, osipovichi};
		
		District d_of_mogilev = new District("Mogilevsky district", cities_of_mogilev);
		District d_of_gorky = new District("Gorky district", cities_of_gorky);
		
		District[] districs_of_mogilev = new District[] {d_of_mogilev, d_of_gorky};
		
		Region r_of_mogilev = new Region("Mogilevsky region", districs_of_mogilev, mogilev);
		r_of_mogilev.squareOfRegion();
		
		 
		Region[] r_of_belarus = new Region[] {r_of_minsk, r_of_brest, r_of_vitebsk, r_of_gomel, r_of_grodno, r_of_mogilev};
		State rebublic_of_belarus = new State("Rebublic of Belarus", r_of_belarus, minsk);
		
		System.out.println("Capital of Belarus is " + rebublic_of_belarus.getCapital_of_state());
		System.out.println();
		
		System.out.println("Amount of Belarus' regions is " + rebublic_of_belarus.amountOfRegions());
		System.out.println();
		
		System.out.println("Square of Belarus is " + rebublic_of_belarus.squareOfState() + " km^2");
		System.out.println();
		
		rebublic_of_belarus.capitOfReg();
		
		
	}

}
