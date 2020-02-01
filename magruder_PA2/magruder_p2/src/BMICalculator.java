import java.util.Scanner;



	public class BMICalculator {
		public String category;
		// this is asking what units the user wants to use
		private void readUnitType(Scanner input) {
			Scanner sc = new Scanner(System.in);

		       do {
		           System.out.println("1.Standard units.");
		           System.out.println("2.Metric units.");
		           System.out.print("Enter Choice 1 or 2 :");
		           choice = sc.nextInt();
		          // this makes sure no wrong choice is picked
		           if (choice != 1 && choice != 2) {
						System.out.print("\nPlease, enter a valid choice. Try again.\n\n");
		           
		           }
		       }
		           while (choice != 1 && choice != 2);

		}
			
		
		// this is reading the measurements 
		private void readMeasurementData(int choice,Scanner sc) {
			if(choice == 1) {
				readImperialData(sc);
			}else
			{
				readMetricData(sc);
			}
			
		}
		// this is getting the data in metric units
		private void readMetricData(Scanner sc)   {
			System.out.print("Enter Weight in Kilograms:");
            weight = sc.nextDouble();

            if (weight < 0) {
    			System.out.println("Improper weight eneterd");
    			setWeight(0);
    			return;
    		}else {
    			setWeight(weight);
    		}
    		
    		System.out.print("Enter your height in meters: ");
    		float height = sc.nextFloat();
    		
    		
    		if(height < 0) {
    			System.out.println("Improper weight entered");
    			setHeight(0);
    			return;
    		}else {
    			setHeight(height);
    		}
			
			
		}
				// this is getting the information in imperial units
		private void readImperialData(Scanner sc){
			
             while (true) {
            	 System.out.print("Enter Weight in Pounds:");
                 weight = sc.nextDouble();
             if (weight <= 0) {
     			System.out.println("Improper weight entered");
     			
     		}else {
     			setWeight(weight);
     			break;
     		}
             }
     		while(true) {
     		System.out.print("Enter your height in inches: ");
     		float height = sc.nextFloat();
     		
     		if(height <= 0) {
     			System.out.println("improper height entered");
     			
     		}else {
     			setHeight(height);
     			break;
     		}
     		
		}
		}
		// this calculates the category of the bmi and displays what category
		private void calculateBmiCategory() {
			this.category = ""; 
			if (this.bmi < 18.5)
		           this.category = "UnderWeight";
		       else if (this.bmi >= 18.5 && this.bmi <= 24.9)
		           this.category = "Normal";
		       else if (this.bmi >= 25 && this.bmi <= 29.9)
		           this.category = "OverWeight";
		       else if (this.bmi >= 30)
		           this.category = "Obese";
		      
			
		}
		
		// this just calculates the bmi 
		 public void calculateBmi() {
		       if (choice == 1) {
		          
		           this.bmi = (weight * 703) / (height * height);
		           if(this.bmi <= 0)
		           {
		        	   System.exit(0);
		           }

		       } else {
		           this.bmi = weight / (height * height);
		           if(this.bmi <= 0)
		           {
		        	   System.exit(0);
		           }
		       }
		   }

		// this just obtains the unit type data and measurement data
		public void readUserData() {
			Scanner input = new Scanner(System.in);
			
			readUnitType(input);
			readMeasurementData( choice, input);

		   }  
		// this displays the BMI
		public void displayBmi() {
				this.calculateBmiCategory();
		       System.out.println("Your BMI is:" + this.bmi);
		       System.out.println("You are " + this.category );

		}
		       
		
		
		
		
		private double weight;
		   public double getWeight() {
			return weight;
		}
		public void setWeight(double weight) {
			this.weight = weight;
		}
		public double getHeight() {
			return height;
		}
		public void setHeight(double height) {
			this.height = height;
		}
		public double getBmi() {
			return bmi;
		}
		public void setBmi(double bmi) {
			this.bmi = bmi;
		}
		public int getChoice() {
			return choice;
		}
		public void setChoice(int choice) {
			this.choice = choice;
		}
		private double height;
		   private double bmi;
		   private int choice;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BMICalculator app = new BMICalculator();
		   app.readUserData();
		   app.calculateBmi();
		   app.displayBmi();
	}

}