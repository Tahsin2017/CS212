public class BoxNode
{
	public Box data;
	public BoxNode next;
	
	public BoxNode(Box data, BoxNode next)		//constructor with two parameters
	{
		this.data = data;
		this.next = next;
	}
	
	public BoxNode(Box data)					//constructor with one parameter
	{
		this(data,null);
	}
	
	public BoxNode()							//constructor with no parameter setting everythin gto null
	{
		this(null,null);
	}
}

