public class Box
{
	private int length;
	private int width;
	private int height;
	
	public Box(int l, int w, int h)
	{	
		if(l<=0 || w<=0 || h<=0)
			throw new IllegalBoxException("Lenght: "+l+ " width: "+ w +" height: " + h +" is an invalid box.\n");
		
		this.length = l;
		this.width = w;
		this.height = h;	
	}
	
	public Box()
	{
		this.length = 1;
		this.width = 1;
		this.height = 1;
	}
	
	public int getVolume()
	{
		return length*width*height;
	}
	
	public String toString()
	{
		return String.format("L:%d W:%d H:%d (V:%d)\n",length, width, height, this.getVolume());
	}
}
