package exercise1;

public class PackingInstructionVisitor implements Visitor{
	
	public void visitGlass(Glass g) {
		int h = g.getHeight();
		h++;
		int w = g.getWidth();
		w++;
		int l = g.getLenght();
		l++;
		System.out.println(g.getName() + ":should be wrapped with Bubble wraps and packed in a box with dimension: " +(int)h +"x"+(int)l+"x"+(int)w);
		
	}

	
	public void visitFurniture(Furniture f) {
		int w = f.getWidth();
		int l = f.getLenght();
		System.out.println(f.getName() + ": should be covered with waterproof covers with area of: " + l + "x" + w);

	
	}

	
	public void visitElectronic(Electronic e) {
		int h = e.getHeight();
		h++;
		int l = e.getLenght();
		l++;
		int w = e.getWidth();
		w++;
		
		System.out.println(e.getName() + ": should be covered with Polyethylene foam film and packed in a box with dimension: "+ h+ "x"+ l + "x" + w);
	}

}
