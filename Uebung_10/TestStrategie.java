
public class TestStrategie{
    
    public static void test(){
        DoublyLinkedList list = new DoublyLinkedList();
        int[] values = {1,-2,3,-5,4,2,6,8,-53,2,12};
        for(int value:values){
            list.add(value);
        }
        Strategies.RemoveSmallerThanPredecessorStrategy strat = new Strategies.RemoveSmallerThanPredecessorStrategy();
        list.deleteSelected(strat);
        
        list.showAll();
    }
}
