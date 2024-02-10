package intro;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello world!");

		//degisken isimlendirmeleri java'da camelCase yazilir
		String ortaMetin = "Ilginizi cekebilir";
		String altMetin = "vade suresi";
		System.out.println("ortaMetin");//Tirnak icine yazdigini yazdirir
		System.out.println(ortaMetin);//Degiskeni yazdirir
		
	//integer
		int vade=12;//tam sayilar
		double dolarDun = 18.14;
		double dolarBugun = 18.10;//Virgullu degiskenlerde kullanilir
		
		boolean dolarDustuMu = false;//true-false 
		
		String okYonu = "";
		
		if (dolarBugun<dolarDun) {//true olursa asagi satiri calistirir
			okYonu = "down.svg";
			System.out.println(okYonu);
		} else if (dolarBugun>dolarDun){// if calismazsa calisir, ikisinden biri mutlaka calisir
			okYonu="up.svg";
			System.out.println(okYonu);
		}else { dolarBugun=dolarDun){
			okYonu= "equal.svg";
			System.out.println(okYonu);
		}
		
		
		//array 
		String[] krediler = { "Hizli Kredi", "Maasini Halkbanktan", "Mutlu Emekli"};
		
		System.out.println(krediler[0]);
		System.out.println(krediler[1]);
		System.out.println(krediler[2]);

		for (int i = 0; i < krediler.length; i++) {//i++ => i+1
			System.out.println(krediler[i]);
		}
		
		
	}

}
