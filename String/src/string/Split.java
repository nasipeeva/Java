package string;

public class Split {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String listOfBeers = "Amstel, Zagorka, Tuborg, Becks, / !@#$%^&*&^%^&*(+_"
				+ "_(]'][;[/3658259032593280076.,...///*-++   Staropramen.";
		String[] beersArr = listOfBeers.split("[^A-Za-z]+");

		for (String beer : beersArr) {
			System.out.println(beer);
		}

	}

}
