package Method;

class Building {
	
	 static void main(String[] args) {
		 RoomAreaPerimeter r1 = new RoomAreaPerimeter();
		 
		 r1.display();
		 
		 System.out.println();
		 
		 r1.setL(100);
		 r1.setB(40);
		 
		 
		 r1.display();
		 r1.findArea();
		 r1.findPerimeter();
		 
	 }
}
