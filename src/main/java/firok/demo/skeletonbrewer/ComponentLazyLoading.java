package firok.demo.skeletonbrewer;

import firok.skeletonbrewer.Pattern;
import firok.skeletonbrewer.Skeleton;

@Skeleton(in = Pattern.LazyLoading)
public class ComponentLazyLoading
{
	public int fun()
	{
		System.out.println("component lazy loading fun()");
		return 2;
	}
}
