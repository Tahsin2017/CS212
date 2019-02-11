import java.util.Map.Entry;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class SearchAction
{
	TreeMap<Integer, Box> check = Project4.sorted;
	
	public void searchAndPrint(Box b)
	{
		int v = b.getVolume();
		BoxGUI c = new BoxGUI();
		
		c.createSearchBox();
		c.textArea1.append("Boxes that fit are: \n");

		SortedMap<Integer, Box> p = check.tailMap(v); 	//sorted map using tailmap to get keys equal or greater than v
		
		Set<Entry<Integer, Box>> set3 = p.entrySet();
		Iterator j = set3.iterator();
		
		while(j.hasNext())
		{
			Map.Entry me3 = (Map.Entry)j.next();
			c.textArea1.append(me3.getValue() + "");
		}
	}
}
