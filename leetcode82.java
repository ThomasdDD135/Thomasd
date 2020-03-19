//自己寫
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        HashMap<Integer,Integer> hashMap=new HashMap<Integer,Integer>();
        while(head!=null)
        {
            if(!hashMap.containsKey(head.val))
            {
                hashMap.put(head.val,1);
            }
            else
                hashMap.put(head.val,hashMap.get(head.val)+1);
            head=head.next;
        }
        ListNode dummyNode=new ListNode(-1);
        ListNode prev=dummyNode;
        ArrayList<Integer> arrayList=new ArrayList<Integer>();
        for (Integer key : hashMap.keySet()) {
            if(hashMap.get(key)==1)
            {
                arrayList.add(key);
            }
        }
        Collections.sort(arrayList);
        for(Integer i:arrayList)
        {
            dummyNode.next=new ListNode(i);
            dummyNode=dummyNode.next;
        }
        return prev.next;
    }
}
