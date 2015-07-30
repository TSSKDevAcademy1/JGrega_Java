////////////////////////////////////////////////////////////////////
/////////////////////////////SQUARE////////////////////////////////
//public class PrintSquare extends Shape {
//	private int width;
//	private int height;
//	private char fill;	
//	
//	public PrintSquare(int width, int height, int x, int y, char fill){
//		this.width = width;
//		this.height = height;
//		this.x = x;
//		this.y = y;
//		this.fill = fill;
//	}
//	
//	public PrintSquare(int x, int y, char fill){
//		super(x,y,fill);
//		this.x = x;
//		this.y = y;
//		this.fill = fill;
//	}
//			
//        public int getWidth() {
//		return width;
//	}
//
//	public void setWidth(int width) {
//		this.width = width;
//	}
//
//	public int getHeight() {
//		return height;
//	}
//
//	public void setHeight(int height) {
//		this.height = height;
//	}
//
//		@Override
//	public String toString() {
//		int i;
//		int j;
//		String str = "";
//		
//	for( i = 0; i < width; i++) {
//            for(j = 0; j < height; j++) {
//                str += fill;
//            }
//            str += "\n";
//        }			
//		return str;
//	}    
//}

////////////////////////////////////////////////////////////
////////////////// SQUARE POSUVANIE X/Y ///////////////////
///////////////////////////////////////////////////////////
//public class PrintSquare extends Shape {
//	private int width;
//	private int height;
//	private char fill;	
//	
//	public PrintSquare(int width, int height, int x, int y, char fill){
//		this.width = width;
//		this.height = height;
//		this.x = x;
//		this.y = y;
//		this.fill = fill;
//	}
//	
//	public PrintSquare(int x, int y, char fill){
//		super(x,y,fill);
//		this.x = x;
//		this.y = y;
//		this.fill = fill;
//	}
//			
//        public int getWidth() {
//		return width;
//	}
//
//	public void setWidth(int width) {
//		this.width = width;
//	}
//
//	public int getHeight() {
//		return height;
//	}
//
//	public void setHeight(int height) {
//		this.height = height;
//	}
//
//		@Override
//	public String toString() {
//		String str = "";
//		
//		for(int i = 0; i < y; i++)
//			str += "\n";
//	
//		
//		for(int i = 0; i < width; i++) {
//            for(int j = 0; j < x; j++) {
//            	str += " ";}
//            	for(int k = 0; k < height; k++){            		
//                str += fill;
//                }
//            
//            str += "\n";
//        }	
//		
//		return str;
//	}    
//}



///////////////////////////////////////////////////////////////
///////////// RECTANGLE cez LINE /////////////////////////////
//CLASS: PrintSquare ///
//	public class PrintSquare extends Shape {
//		private int width;
//		private int height;	
//	
//	public PrintSquare(int width, int height){
//		this.width = width;
//		this.height = height;
//	}
//	
//	public PrintSquare(int x, int y, char fill){
//		super(x,y,fill);
//		this.x = x;
//		this.y = y;
//		this.fill = fill;
//	}
//	
//	public int getWidth() {
//		return width;
//	}
//	
//	public void setWidth(int width) {
//		this.width = width;
//	}
//	
//	public int getHeight() {
//		return height;
//	}
//	
//	public void setHeight(int height) {
//		this.height = height;
//	}	
//	
//	@Override
//	public String toString() {		
//		PrintLine line = new PrintLine(width,height); //////
//		String lines = line.toString();	
//	
//	return lines;
//	}    
//	}

///////////////////////////////////////////////////////////////
///////////// RECTANGLE cez LINE + odsadenie/////////////////////////////
/////// CLASS: PrintSquare ////
//	public class PrintSquare extends Shape {
//		private int width;
//		private int height;	
//	
//	public PrintSquare(int width, int height,int x,int y){
//		this.width = width;
//		this.height = height;
//		this.x = x;
//		this.y = y;
//	}
//	
//	public PrintSquare(int x, int y, char fill){
//		super(x,y,fill);
//		this.x = x;
//		this.y = y;
//		this.fill = fill;
//	}
//	
//	public int getWidth() {
//		return width;
//	}
//	
//	public void setWidth(int width) {
//		this.width = width;
//	}
//	
//	public int getHeight() {
//		return height;
//	}
//	
//	public void setHeight(int height) {
//		this.height = height;
//	}	
//	
//	@Override
//	public String toString() {		
//		PrintLine line = new PrintLine(width,height,x,y); //////
//		String lines = line.toString();	
//	
//	return lines;
//	}    
//}


///////////////////////////////////////////////////////////////////
///////////// RECTANGLE cez LINE + odsadenie (Duty)/////////////////////////////
/////// CLASS: PrintSquare //////////////////////////////////////////
public class PrintSquare extends Shape {
	private int width;
	private int height;	
	
	public PrintSquare(int width, int height,int x,int y){
		this.width = width;
		this.height = height;
		this.x = x;
		this.y = y;
	}
	
	public PrintSquare(int x, int y, char fill){
		super(x,y,fill);
		this.x = x;
		this.y = y;
		this.fill = fill;
	}
			
        public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}	
	
		@Override
	public String toString() {		
		PrintLine line = new PrintLine(width,height,x,y); //////
		String lines = line.toString();	
		
		return lines;
	}    
}