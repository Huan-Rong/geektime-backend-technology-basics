package site.blbc;

import java.util.LinkedList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;

/**
 * MergeDetect Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>Nov 20, 2019</pre>
 */
public class MergeDetectTest {

  private LinkedList<Integer> linkedList1;
  private LinkedList<Integer> linkedList2;
  private LinkedList<Integer> linkedList3;

  @Before
  public void before() {
    linkedList1 = new LinkedList<>();
    linkedList1.add(1);
    linkedList1.add(2);
    linkedList1.add(3);
    linkedList1.add(4);
    linkedList1.add(5);
    linkedList1.add(6);
    linkedList1.add(7);
    linkedList1.add(8);
    linkedList1.add(9);

    linkedList2 = new LinkedList<>();
    linkedList2.add(99);
    linkedList2.add(98);
    linkedList2.add(97);
    linkedList2.add(96);
    linkedList2.add(95);
    linkedList2.add(94);
    linkedList2.add(93);
    linkedList2.add(92);
    linkedList2.add(91);
    linkedList2.add(5);
    linkedList2.add(6);
    linkedList2.add(7);
    linkedList2.add(8);
    linkedList2.add(9);

    linkedList3 = new LinkedList<>();
    linkedList3.add(99);
    linkedList3.add(98);
    linkedList3.add(97);
    linkedList3.add(96);
  }

  /**
   * Method: mergeDetect(LinkedList<Integer> linkedList1, LinkedList<Integer> linkedList2)
   */
  @Test
  public void testMergeDetect() {
    MergeDetect mergeDetect = new MergeDetect();

    // 测试有合并起点的情况
    Assert.assertEquals(5, mergeDetect.mergeDetect(linkedList1, linkedList2).longValue());

    // 测试没有合并起点的情况
    Assert.assertEquals(Integer.MIN_VALUE,
        mergeDetect.mergeDetect(linkedList1, linkedList3).longValue());
  }
}
