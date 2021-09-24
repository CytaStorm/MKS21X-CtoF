//All parameters have to be doubles because of fractions
//Need to paramterize c/fIn/Output
//and return the c/fOutput
public class CtoFTester{
	public static double celsiusToFahrenheit(double cInput) {
		double fOutput = 32 + cInput * (9 / 5.0);
		return fOutput;
	}
	public static double fahrenheitToCelsius (double fInput) {
		double cOutput = (fInput - 32) * (5 / 9.0);
		return cOutput;
	}
		
	public static void main(String[] args) {
		System.out.println(celsiusToFahrenheit(1000));
		System.out.println(fahrenheitToCelsius(1000));
	}
}