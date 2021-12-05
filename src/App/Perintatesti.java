package App;

import java.util.ArrayList;
import java.util.Scanner;

import Data.Kulkuneuvo;
import Data.Mopo;

public class Perintatesti {

	public static void main(String[] args) {
		
		ArrayList<Mopo> lista = new ArrayList<>();
		
		char lisaaUusi = 'e';
		do {
			Mopo m=new Mopo();
			kysyMoponTiedot(m);
			lista.add(m);
			
			lisaaUusi = lisataankoUusiMopo();
		} while (lisaaUusi == 'k');
		
		TulostaMopo(lista);		
		
		
	}

	private static void TulostaMopo(ArrayList<Mopo> lista) {
		for (int i=0;i<lista.size();i++) {
			Mopo m = lista.get(i);
			System.out.println("Hinta: "+m.getHinta()+"€, "
			+m.getVari() + "moottorimerkki"
			+m.getMoottorimerkki()+", "+m.getTyyppi()+", "
			+"Maksiminopeus: "+m.getMaksimiNopeus()+"km/h, ");
		}
		
		
	}

	private static char lisataankoUusiMopo() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Lisätäänkö uusi mopo? (k/e) ");
		String s = sc.nextLine();
		try {
			return s.charAt(0); 
		} catch (IndexOutOfBoundsException e) {
			return 'e';
		}
	}

	private static void kysyMoponTiedot(Mopo m) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Hinta: ");
		String s = sc.nextLine();
		m.setHinta(Integer.parseInt(s));
		
		System.out.print("Väri: ");
		s = sc.nextLine();
		m.setVari(s);
		
		System.out.print("Maksimi nopeus: ");
		s = sc.nextLine();
		m.setMaksimiNopeus(Integer.parseInt(s));
		
		System.out.print("Moottorimerkki: ");
		s = sc.nextLine();
		m.setMoottorimerkki(s);
		
		System.out.print("Tyyppi: ");
		s = sc.nextLine();
		m.setTyyppi(s);
		
	}

}
