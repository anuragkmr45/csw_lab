package kuch;

enum Cars {
	BMW,
	JEEP,
	AUDI,
	VOLKSWAGEN,
	NANO,
	FIAT;
}


public class Enumeg {
	public static void main(String args[])
	{
        
		Cars c;
		c = Cars.AUDI;
        
		switch (c) {

		case BMW:
			System.out.println(c.ordinal());
			break;
		case JEEP:
        System.out.println(c.ordinal());
			break;
		case AUDI:
        System.out.println(c.ordinal());
			break;
		case VOLKSWAGEN:
        System.out.println(c.ordinal());
			break;
		case NANO:
        System.out.println(c.ordinal());
			break;
		case FIAT:
        System.out.println(c.ordinal());

		default:
			System.out.println("time pass");
			break;
		}
	}
}
