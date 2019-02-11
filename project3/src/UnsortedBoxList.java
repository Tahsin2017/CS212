public class UnsortedBoxList extends BoxList
{	
	public UnsortedBoxList()
	{
		super();
	}
	
	public void add(Box b)		//adds box using the method from super class BoxList
	{
		super.append(b);
	}
	
	public String toString()	//override the toString in Box
	{
		return super.toString();
	}
}
