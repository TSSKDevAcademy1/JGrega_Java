 /////// Nadradena TRIEDA /////////
public abstract class Shape {
	public int x;
	public int y;
	public char fill;;

	public Shape(){
		this.x = 0;
		this.y = 0;
		this.fill = '*';
	}

	public Shape(int x, int y, char fill){
		this.x = x;
		this.y = y;
		this.fill = fill;

	}

}