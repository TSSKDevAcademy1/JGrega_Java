///////////////////////////////////////////////////////
/////////////// TRIANGLE X/Y //////////////////////////
public class Triangle extends Shape {
    private int size;
     
    public Triangle(int x, int y, char fill, int size){
    	this.size = size;
    	this.x = x;
    	this.y = y;
    	this.fill = fill;
    }
    
    public Triangle(int x, int y, char fill){    	
    	super(x,y,fill);
    	this.x = x;
    	this.y = y;
    	this.fill = fill;
    }

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}	
	
	@Override
	public String toString() {
		int i = 0;
		String str2 = "";
		
		for(int j = 0; j < y; j++)
			str2 += "\n";
		
		while(i < size) 
		{
	      str2 += printChars(size - i - 1, ' ');
	      str2 +=   printChars(2 * (i + 1) -1, fill); 
	      str2 += "\n";
	      i++; 	        
	    }		
		return str2;
	}	
	
	public String printChars(int length, char c) {
	    String str1 = "";
	    for(int k = 0; k < x; k++)
	    	str1 += " ";
	    
		for(int i = 0; i < length; i++) {
	        str1 += c;
	    }
		return str1;
	}	
}