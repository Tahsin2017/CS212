public class Box	
{
	int length, width, height;
	
	public Box()	//constructor with no parameter
	{
		length =1;	width = 1; 	height = 1;
	}
	
	public Box(int l, int w, int h)		//constructor with three parameters
	{
		if(l<1 || w<1 || h<1)	throw new IllegalArgumentException("Length/width/height cannot be less than 1.");
		
		length = l;
		width = w;
		height = h;
	}
	
	public void setLength(int l)	//set method for length
	{
		length = l;
	}
	
	public void setWidth(int w)
	{
		width = w;
	}
	
	public void setHeight(int h)
	{
		height = h;
	}
	
	public int getLength()		//get method for length
	{
		return length;
	}
	
	public int getWidth()
	{
		return width;
	}
	
	public int getHeight()
	{
		return height;
	}
	
	public int volume()	
	{
		
		return length*width*height;
	}

	public static String toString(int l, int w, int h, int v)	
	{
		return ("L: "+l +"  W: " +w+ "  H: " +h +"   (V: " + v + ")");
	}
}

