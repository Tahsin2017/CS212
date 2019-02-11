public class SortedBoxList extends BoxList
{
	public SortedBoxList()
	{
		super();
	}
	
	public void add(Box b)
	{
		if(head == null)				//if head is null, it calls the superclass function to create a dummy node
			super.append(b);
		else
		{
			BoxNode newNode = new BoxNode(b);
			BoxNode headNode = head;
			BoxNode currNode = head.next;
			
			while(headNode != null)						//Loop while head is not null
			{
				if(currNode == null)					//if the next element to head is null, places the value according to sorting
				{
					if(b.getVolume() < head.data.getVolume())		//if v<head, sets this v as head and head becomes next element to head
					{
						newNode.next = head;						
						head = newNode;
						break;
					}
					headNode.next = newNode;					//if v>head, just places the new node after head
					break;
				}
				
				if(b.getVolume() >= headNode.data.getVolume() && b.getVolume() <= currNode.data.getVolume())		//if head<V<current
				{
					newNode.next = currNode;						//changes the current node to the next to newNode
					headNode.next = newNode;						//places the newNode next to the head node
					break;
				}
				headNode = currNode;								//if no condition matches, the keys change position by 1 node
				currNode = headNode.next;
			}
		}
	}
	
	public String toString()	//override
	{
		return super.toString();
	}
}
