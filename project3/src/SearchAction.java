public class SearchAction extends BoxList
{	
	public void searchAndPrint(Box b, BoxList a)
	{
		int v = b.getVolume();
		BoxGUI c = new BoxGUI();
		
		c.createSearchBox();
		c.textArea1.append("Boxes that fit are: \n");

		BoxNode headNode = a.head;
		
		while(headNode != null)
		{
			if(v <= headNode.data.getVolume())
			{
				c.textArea1.append(headNode.data.toString());
			}
			headNode = headNode.next;
		}
	}
}
