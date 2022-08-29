package firok.demo.skeletonbrewer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SkeletonTests
{
	@Test
	void test()
	{
		Assertions.assertEquals(1, $ComponentEagerLoading.instance().fun());
		Assertions.assertEquals(2, $ComponentLazyLoading.instance().fun());
		Assertions.assertEquals(3, $ComponentBillPugh.instance().fun());
		Assertions.assertEquals(4, $ComponentDoubleCheckLocking.instance().fun());
		Assertions.assertEquals(5, $ComponentSynchronized.instance().fun());
		$ComponentGetterGetInst.getInst().fun();
		firok.skeletonbrewer.internal.Comp.instance().fun();
	}
}
