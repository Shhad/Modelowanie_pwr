package urbanizacja;

 abstract  class Street
 {
// Atrybuty:
	private int Numbers[5];
	private String Name;
// Getters & Setters:
	private int getNumbers() { return Numbers; }
	void setNumbers(int w) { Numbers = w; }
	private String getName() { return Name; }
	void setName(String w) { Name = w; }
// Operacje:	
 boolean isNumber() {
			return !Numbers.empty();
		
	}	
 void 
crossing() {
			Name = "skrzyżowanie"
		
	}	
	
};
