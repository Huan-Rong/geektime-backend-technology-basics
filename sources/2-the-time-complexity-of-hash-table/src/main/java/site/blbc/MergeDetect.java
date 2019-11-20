package site.blbc;

import java.util.HashMap;
import java.util.LinkedList;

/**
 * @description:
 * @author: Ian Zheng
 * @date: 2019-11-20
 */
public class MergeDetect {

  /**
   * 检测两个单向链表是否有合并起点
   *
   * @param linkedList1 长度较短的链表
   * @param linkedList2 长度较长的链表
   * @return 如果返回 Integer.MIN_VALUE，则表明没有合并起点；否则返回合并起点。
   */
  public Integer mergeDetect(LinkedList<Integer> linkedList1, LinkedList<Integer> linkedList2) {
    if (linkedList1 == null || linkedList2 == null || linkedList1.size() < 0
        || linkedList2.size() < 0) {
      return Integer.MIN_VALUE;
    }

    LinkedList<Integer> linkedList3;
    if (linkedList1.size() > linkedList2.size()) {
      linkedList3 = linkedList1;
      linkedList1 = linkedList2;
      linkedList2 = linkedList3;
    }

    HashMap<Integer, Object> hashMap = new HashMap<>();
    /*
     * 遍历较长的链表，可以使用一个循环解决问题；但是遍历较短链表，则必须使用两个循；
     * 这是因为较长链表的遍历可以覆盖较短链表的遍历，反之则不可。
     */
    for (int i = 0; i < linkedList2.size(); i++) {
      if (i < linkedList1.size()) {
        Integer num1 = linkedList1.get(i);
        hashMap.put(num1.hashCode(), num1);
      }

      Integer num2 = linkedList2.get(i);
      if (hashMap.get(num2.hashCode()) != null) {
        return num2;
      }
    }
    return Integer.MIN_VALUE;
  }
}
