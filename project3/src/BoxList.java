abstract public class BoxList
{	
	public Box aBox;
	public BoxNode head;
	public BoxNode last;
	public int length;
	
	public BoxList()			
	{
		this.head = null;
		this.last = null;
		this.length = 0;
	}
	
	public void append(Box b)
	{
		BoxNode newNode = new BoxNode(b);
		if(head == null)						//if there is no element, first and last element is added as the same node
		{
			this.head = newNode;
			this.last = newNode;
		}
		else
		{
			last.next = newNode;
			last = newNode;
		}
		
		length++;
	}
	
	public String toString()
	{
		String str = " ";
		
		BoxNode currNode = head;
		while(currNode != null)
		{
			str += currNode.data.toString();
			str += "\n";
			currNode = currNode.next;
		}
		return str;
	}
}
