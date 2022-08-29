package firok.demo.skeletonbrewer;

import firok.skeletonbrewer.Pattern;
import firok.skeletonbrewer.Skeleton;

@Skeleton(in = Pattern.Synchronized)
public class ComponentSynchronized
{
	public int fun()
	{
		System.out.println("component synchronized fun()");
		return 5;
	}
}
