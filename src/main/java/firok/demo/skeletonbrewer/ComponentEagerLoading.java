package firok.demo.skeletonbrewer;

import firok.skeletonbrewer.Pattern;
import firok.skeletonbrewer.Skeleton;

@Skeleton(in = Pattern.EagerLoading)
public class ComponentEagerLoading
{
	public int fun()
	{
		System.out.println("component eager loading fun()");
		return 1;
	}
}
