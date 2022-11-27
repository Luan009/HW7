package de.uni.koeln.sse.se;

public class MovingCostsVisitor implements Visitor{
	
public void visitGlass(Glass g) {
		
		double price = 0;
		
		switch(g.getTickness()) {
		
		case 1: price += (2*g.getLenght());		
				break;
		
				
		case 2: price += (1.20*g.getLenght());	
				break;
		
				
		case 3: price += (0.70*g.getLenght());	
				break;
		
		
		}
		
		System.out.println("Total Cost for " + g.getName() + " is: " + price);

	}

	
	public void visitFurniture(Furniture f) {
		
		double price = 0;
		
		price+= (4*f.getWeight());
		
		System.out.println("Total Cost for " + f.getName() + " is: " + price);
		
		
	}

	
	public void visitElectronic(Electronic e) {
		
		double price = 0;
		
		if(e.getFragile() == true) {
			
			price+= (e.getWeight()*2);
			
		} else {
			
			price+= (e.getWeight()*3);
			
		}
		
		System.out.println("Total Cost for " + e.getName() + " is: " + price);

		
		
	}



}
