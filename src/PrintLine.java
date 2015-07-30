/////// CLASS: PrintLine -- cez line////////
///////////////////////////////////////////
//public class PrintLine extends Shape {
//	private int width;
//	private int height;   
//
//public PrintLine(int width, int height){
//	this.width = width;
//	this.height = height;
//}   
//
//public PrintLine(int x, int y, char fill){
//	super(x,y,fill);
//	this.fill = fill;
//} 
//
//@Override
//public String toString() {
//	String str ="";
//
//	for(int j = 0; j < height; j++ )
//		{
//			for (int i = 0; i < width; i++)
//			{
//				str += fill;			
//			}	
//			str += "\n";
//		}	
//	return str;
//	}	
//
//}

/////////////////////////////////////////////////////
////////CLASS: PrintLine -- Odsadenie //////////////
////////////////////////////////////////////////////
//	public class PrintLine extends Shape {
//		private int width;
//		private int height;   
//	
//	public PrintLine(int width, int height, int x, int y) {
//		this.width = width;
//		this.height = height;
//		this.x = x;
//		this.y = y;
//	}
//	
//	public PrintLine(int x, int y, char fill){
//		super(x,y,fill);
//		this.fill = fill;
//		this.x = x;
//		this.y = y;
//	} 
//	
//	
//	
//	@Override
//	public String toString() {
//		String str ="";
//	
//	for(int j = 0; j < y; j++)
//		str += "\n";
//	
//	for(int j = 0; j < height; j++ )
//		{
//			for(int l = 0; l < x; l++)
//				str += " ";
//			for (int i = 0; i < width; i++)
//				{
//					//if(vertical == true)
//					str += fill;			
//				}	
//					str += "\n";
//		}	
//		return str;
//	}	
//	
//	}

/////////////////////////////////////////////////////
////////CLASS: PrintLine -- Odsadenie - DUTY //////////////
////////////////////////////////////////////////////

public class PrintLine extends Shape {
   private int width;
   private int height;   
   
public PrintLine(int width, int height, int x, int y) {
	this.width = width;
	this.height = height;
	this.x = x;
	this.y = y;
}
 
 public PrintLine(int x, int y, char fill){
	 super(x,y,fill);
	 this.fill = fill;
	 this.x = x;
	 this.y = y;
 } 



@Override
public String toString() {
	String str ="";
	
	for(int j = 0; j < y; j++)
		str += "\n";
	
	for(int j = 0; j < height; j++ )
	{
		for(int l = 0; l < x; l++)
			str += " ";
		if(j == 0 || j == (height - 1))
		{
			for (int i = 0; i < width; i++)
			{				
				str += fill;			
			}	
				str += "\n";
		}
		else
		{
			for (int i = 0; i < width; i++)
			{
				if(i == 0 || i == (width -1))
					str += fill;
				else
					str += " ";
			}	
				str += "\n";
		}
	}	
	return str;
	}	
	
}
