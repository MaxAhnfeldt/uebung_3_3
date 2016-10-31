
public class BMIBerechnung {

	public static void main(String[] args) {

		int Geschlecht = 0;// 1 ist männlich, 2 ist weiblich
		double Alter = 0;
		double Gewicht =0;
		double Groeße =0;
		double BMI = 0;

		BMI = (Gewicht / (Groeße * Groeße));

		if (Geschlecht == 1) {
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
			} else if (Alter >= 55) {
				if (BMI > 29) {
					System.out.println("Ihr BMI beträgt: " + BMI + "und ist zu hoch!");
				} else {
					if (BMI >= 24) {
						System.out.println("Ihr BMI beträgt: " + BMI + "und ist zu okay!");
					} else {
						System.out.println("Ihr BMI beträgt: " + BMI + "und ist zu niedrig!");
					}
				}
			} else if (Alter >= 45) {
				if (BMI > 28) {
					System.out.println("Ihr BMI beträgt: " + BMI + "und ist zu hoch!");
				} else {
					if (BMI >= 23) {
						System.out.println("Ihr BMI beträgt: " + BMI + "und ist zu okay!");
					} else {
						System.out.println("Ihr BMI beträgt: " + BMI + "und ist zu niedrig!");
					}
				}
			} else if (Alter >= 35) {
				if (BMI > 27) {
					System.out.println("Ihr BMI beträgt: " + BMI + "und ist zu hoch!");
				} else {
					if (BMI >= 22) {
						System.out.println("Ihr BMI beträgt: " + BMI + "und ist zu okay!");
					} else {
						System.out.println("Ihr BMI beträgt: " + BMI + "und ist zu niedrig!");
					}
				}
			} else if (Alter >= 25) {
				if (BMI > 26) {
					System.out.println("Ihr BMI beträgt: " + BMI + "und ist zu hoch!");
				} else {
					if (BMI >= 21) {
						System.out.println("Ihr BMI beträgt: " + BMI + "und ist zu okay!");
					} else {
						System.out.println("Ihr BMI beträgt: " + BMI + "und ist zu niedrig!");
					}
				}
			} else if (BMI > 25) {
				System.out.println("Ihr BMI beträgt: " + BMI + "und ist zu hoch!");
			} else {
				if (BMI >= 20) {
					System.out.println("Ihr BMI beträgt: " + BMI + "und ist zu okay!");
				} else {
					System.out.println("Ihr BMI beträgt: " + BMI + "und ist zu niedrig!");
				}
			}
		} else {
			if (Alter > 64) {
				if (BMI > 29) {
					System.out.println("Ihr BMI beträgt: " + BMI + "und ist zu hoch!");
				} else {
					if (BMI >= 24) {
						System.out.println("Ihr BMI beträgt: " + BMI + "und ist zu okay!");
					} else {
						System.out.println("Ihr BMI beträgt: " + BMI + "und ist zu niedrig!");
					}
				}
			} else if (Alter >= 55) {
				if (BMI > 28) {
					System.out.println("Ihr BMI beträgt: " + BMI + "und ist zu hoch!");
				} else {
					if (BMI >= 23) {
						System.out.println("Ihr BMI beträgt: " + BMI + "und ist zu okay!");
					} else {
						System.out.println("Ihr BMI beträgt: " + BMI + "und ist zu niedrig!");
					}
				}
			} else if (Alter >= 45) {
				if (BMI > 27) {
					System.out.println("Ihr BMI beträgt: " + BMI + "und ist zu hoch!");
				} else {
					if (BMI >= 22) {
						System.out.println("Ihr BMI beträgt: " + BMI + "und ist zu okay!");
					} else {
						System.out.println("Ihr BMI beträgt: " + BMI + "und ist zu niedrig!");
					}
				}
			} else if (Alter >= 35) {
				if (BMI > 26) {
					System.out.println("Ihr BMI beträgt: " + BMI + "und ist zu hoch!");
				} else {
					if (BMI >= 21) {
						System.out.println("Ihr BMI beträgt: " + BMI + "und ist zu okay!");
					} else {
						System.out.println("Ihr BMI beträgt: " + BMI + "und ist zu niedrig!");
					}
				}
			} else if (Alter >= 25) {
				if (BMI > 25) {
					System.out.println("Ihr BMI beträgt: " + BMI + "und ist zu hoch!");
				} else {
					if (BMI >= 20) {
						System.out.println("Ihr BMI beträgt: " + BMI + "und ist zu okay!");
					} else {
						System.out.println("Ihr BMI beträgt: " + BMI + "und ist zu niedrig!");
					}
				}
			} else if (BMI > 24) {
				System.out.println("Ihr BMI beträgt: " + BMI + "und ist zu hoch!");
			} else {
				if (BMI >= 19) {
					System.out.println("Ihr BMI beträgt: " + BMI + "und ist zu okay!");
				} else {
					System.out.println("Ihr BMI beträgt: " + BMI + "und ist zu niedrig!");
				}
			}
		}
	}
}
