package firok.demo.skeletonbrewer;

import firok.skeletonbrewer.Pattern;
import firok.skeletonbrewer.Skeleton;

@Skeleton(in = Pattern.DoubleCheckLocking)
public class ComponentDoubleCheckLocking
{
	public int fun()
	{
		System.out.println("component double check locking");
		return 4;
	}
}
