
public class BMIBerechnung {

	public static void main(String[] args) {

		int Geschlecht = 1;
		double Alter = 48;
		double Gewicht = 89;
		double Groeße = 1.92;
		double BMI = 0;

		BMI = (Gewicht / (Groeße * Groeße));
		

		if (Geschlecht == 1) {//ist männlich
			if (Alter > 64) {
				if (BMI > 30) {
					System.out.println("Ihr BMI beträgt: " + BMI + "und ist zu hoch!");
				} else {
					if (BMI >= 25) {
						System.out.println("Ihr BMI beträgt: " + BMI + "und ist zu okay!");
					} else {
						System.out.println("Ihr BMI beträgt: " + BMI + "und ist zu niedrig!");
					}
				}
			}
		} else if
			(Alter >= 55) {
				if (BMI > 29) {
					System.out.println("Ihr BMI beträgt: " + BMI + "und ist zu hoch!");
				} else {
					if (BMI >= 24) {
						System.out.println("Ihr BMI beträgt: " + BMI + "und ist zu okay!");
					} else {
						System.out.println("Ihr BMI beträgt: " + BMI + "und ist zu niedrig!");
					}
				}
			}
		 else
			if (Alter >= 45) {
				if (BMI > 28) {
					System.out.println("Ihr BMI beträgt: " + BMI + "und ist zu hoch!");
				} else {
					if (BMI >= 23) {
						System.out.println("Ihr BMI beträgt: " + BMI + "und ist zu okay!");
					} else {
						System.out.println("Ihr BMI beträgt: " + BMI + "und ist zu niedrig!");
					}
				}
			}
		}
	}
