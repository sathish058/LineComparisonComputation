package com.bridgelabz.linecomaparison;

public class LineComparison {
	int x1, y1, x2, y2;
	Double length;
	
	
	public LineComparison(int x1, int y1, int x2, int y2){
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		
	}
	
	public void calculateLength() {
		length = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
		System.out.println("x1 : "+x1);
		System.out.println("y1 : "+y1);
		System.out.println("x2 : "+x2);
		System.out.println("y2 : "+y2);
		System.out.println("Length Of The Line is : "+length);
		
	}
	
	public void isEqual(LineComparison line2) {
		boolean isEqual = (this.length).equals(line2.length);
		if(isEqual)
			System.out.println("The Lines are equal");
		else
			System.out.println("The Lines are not equal");
	}
	
	public void compareTheLines(LineComparison line2) {
		int compareValue = (this.length).compareTo(line2.length);
		if(compareValue < 0)
			System.out.println("Line 1 is smaller than Line 2");
		else if(compareValue == 0)
			System.out.println("Line 1 is equal to Line 2");
		else
			System.out.println("Line 1 is greater than Line 2");
	}
	
	public static void main(String[] args) {
			
		LineComparison line1 = new LineComparison(2, 3, 2, 8);
		LineComparison line2 = new LineComparison(2, 3, 4, 8);
		
		line1.calculateLength();
		line2.calculateLength();
		line1.isEqual(line2);
		line1.compareTheLines(line2);
	}
}


