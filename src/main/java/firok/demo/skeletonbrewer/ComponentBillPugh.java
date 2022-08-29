package firok.demo.skeletonbrewer;

import firok.skeletonbrewer.Pattern;
import firok.skeletonbrewer.Skeleton;

@Skeleton(in = Pattern.BillPugh)
public class ComponentBillPugh
{
	public int fun()
	{
		System.out.println("component bill pugh fun()");
		return 3;
	}
}
