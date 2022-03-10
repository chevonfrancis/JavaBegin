package com.qa.operators;

public class Results {
	
		public int physicsResult;
		public int bioResult;
		public int chemResult;
		public int total = physicsResult + bioResult + chemResult;
		public int percentage = (total * 100) / 450;
				
			
//			constructor
			Results(int physicsResult, int bioResult, int chemResult) {
			this.physicsResult = physicsResult;
			this.bioResult = bioResult;
			this.chemResult = chemResult;
			this.total = physicsResult + bioResult + chemResult;
			
		}

	
		
		public void methodOne() {
			System.out.println("Physics: " + physicsResult);
			System.out.println("Biology: " + bioResult);
			System.out.println("Chemistry: " + chemResult);
			System.out.println("Total Results: " + total);
		
		
	}
		
		public void methodTwo() {
			this.percentage = (total * 100) / 450;
			System.out.println("Percentage: " + percentage);
			
		
		}
		
		public void methodThree() {
			if (percentage > 60) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
	}
		public void showPercentage() {
			double totalPercentage = (total * 100) / 450;
			double totalPhysics = (physicsResult * 100) / 450;
			double totalBiology = (bioResult * 100) / 450;
			double totalChem = (chemResult * 100) / 450;
		}
		public void methodFour() {
			if (totalPhysics <(.6 * 150) * 100)) {
				System.out.println("PhysicsPass");
			} else {
				System.out.println("PhysicsFail");
			}
		}	
			public void methodFive() {
			 if 
				(totalBiology < (.6 * 150) * 100) {
					System.out.println("ChemPass");	
				} else {
				System.out.println("ChemFail");
				}
}
					
			public void methodSix() {
			 if 
				(bioResult < (.6 * 150) * 100) {
				System.out.println("BioPass");
			 } else {
					System.out.println("BioFail");
			}
		}
		
}
		
			
					
					
				


