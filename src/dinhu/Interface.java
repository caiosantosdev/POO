package dinhu;

import p1_2023.Banana;
import p1_2023.ComestivelFactory;
import p1_2023.IComestivel;
import p1_2023.Macarronada;

public interface IComestivel {
	void comer();
	double nutrientes(double carbo);
}


public class Banana implements IComestivel {
	private int carbo = 10;
	@Override
	public void comer() {
		System.out.println("Banana comestivel");
	}
	
	@Override
	public double nutrientes(double pesoConsumido) {
		System.out.println("carboidratos: " + (carbo*pesoConsumido));
		return (carbo*pesoConsumido);
	}
	
}

public class Macarronada implements IComestivel {
	private int carbo = 5;
	@Override
	public void comer() {
		System.out.println("Feijoada comestivel");
	}
	
	@Override
	public double nutrientes(double pesoConsumido) {
		System.out.println("carboidratos: " + (carbo*pesoConsumido));
		return (carbo*pesoConsumido);
	}
}

public static class ComestivelFactory {
	public static IComestivel BANANA = new Banana();
	public static IComestivel MACARRONADA = new Macarronada();
}

public static void main(String[] args)
{
	double carboIngerido = 0.0;
	
	IComestivel comestivel = ComestivelFactory.BANANA;
	comestivel.comer();
	double carboBanana = comestivel.nutrientes(5.0);
	carboIngerido += carboBanana;
	
	comestivel = ComestivelFactory.MACARRONADA;
	comestivel.comer();
	double carboMacarronada = comestivel.nutrientes(10.0);
	carboIngerido += carboMacarronada;
	
	System.out.println(carboIngerido);
	
	
}
