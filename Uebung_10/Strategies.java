
public class Strategies{
    public static class CountXStrategy 
    extends DoublyLinkedList.InspectionStrategy{
        private int comp;
        private int count;
        public CountXStrategy(int x){
            comp = x;
            count = 0;
        }
        public void inspect(Object ref){
            if((int)comp == (int)ref){
                count ++;
            }
        }
    
        public int getCount(){
            return count;
        }
    }
    
    public static class CountInIntervalStrategy 
    extends DoublyLinkedList.InspectionStrategy{
        private int bottom;
        private int top;
        private int count;
        public CountInIntervalStrategy(int bot, int t){
            bottom = bot;
            top = t;
            count = 0;
        }
        public void inspect(Object ref){
            int pos = bottom;
            while(pos <= top){
                if(pos == (int)ref){
                    count++;
                }
                pos++;
            }
        }
        
        public int getCount(){
            return count;
        }
    }
    
    public static class AverageOfPositivesStrategy 
    extends DoublyLinkedList.InspectionStrategy{
        private int sum;
        private int count;
        
        public AverageOfPositivesStrategy(){
            sum = 0;
            count = 0;
        }
        
        public void inspect(Object ref){
            if((int)ref > 0){
                sum += (int) ref;
                count++;
            }
        }
        
        public double getAverage(){
            System.out.println(sum);
            System.out.println(count);
            return sum/(double)count;
        }
    
    }
    
    public static class AllToAbsStrategy 
    extends DoublyLinkedList.SubstitutionStrategy{
        public Object substitute(Object ref){
            if((int)ref<0){
                return (int) ref * -1;
            }
            return ref;
        }
    }
    
    public static class AddNToPositiveStrategy 
    extends DoublyLinkedList.SubstitutionStrategy{
        private int nToAdd;
        public AddNToPositiveStrategy(int n ){
            nToAdd = n;
        }
        public Object substitute(Object ref){
            if((int)ref>0){
                return (int)ref +nToAdd;
            }
            return ref;
        }
    }
    
    public static class DoubleAllInIntervalStrategy
    extends DoublyLinkedList.SubstitutionStrategy{
        private int bottom; 
        private int top;
        public DoubleAllInIntervalStrategy(int bot, int t){
            bottom = bot;
            top = t;
        }
        
        public Object substitute(Object ref){
            int pos = bottom;
            while(pos <= top){
                if((int)ref == pos){
                    return (int)ref * 2;
                }
                pos++;
            }
            return ref;
        }
    }
    
    public static class RemoveAllNegativesStrategy 
    extends DoublyLinkedList.DeletionStrategy{
        public boolean select(Object ref){
            if((int)ref<0){
                return true;
            }
            return false;
        }
    }
    
    public static class RemoveAllInIntervalStrategy
    extends DoublyLinkedList.DeletionStrategy{
        private int bot;
        private int top;
        public RemoveAllInIntervalStrategy(int bottom,int t){
            bot = bottom;
            top = t;
        }
        
        public boolean select(Object ref){
            int pos = bot;
            while(pos<=top){
                if((int)ref == pos){
                    return true;
                }
                pos++;
            }
            return false;
        }
    }
    
    public static class RemoveAndCountAllInIntervalStrategy
    extends DoublyLinkedList.DeletionStrategy{
        private int bot;
        private int top;
        private int count;
        public RemoveAndCountAllInIntervalStrategy(int bottom,int t){
            bot = bottom;
            top = t;
            count = 0;
        }
        
        public boolean select(Object ref){
            int pos = bot;
            while(pos<=top){
                if((int)ref == pos){
                    count++;
                    return true;
                }
                pos++;
            }
            return false;
        }
        
        public int getCount(){
            return count;
        }
    }
    
    public static class RemoveSmallerThanPredecessorStrategy
    extends DoublyLinkedList.DeletionStrategy{
        private int predInt;
        
        public RemoveSmallerThanPredecessorStrategy(){
        }
        
        public boolean select(Object ref){
            if((int)ref < predInt){
                return true;
            }
            predInt = (int) ref;
            return false;
        }
    }
    
    //Generic Strategies
    //Task 11
    
    public static class OneFollowsZeroStrategy 
    extends DoublyLinkedList<Integer>.InsertionStrategy<Integer>{
        
        public boolean select (E ref){
            if(ref == 0){
                return true;
            }
            return false;
        }
        
        public E insert(E ref){
            return 1;
        }
    }
    
    public static class SubtotalStrategy
    extends DoublyLinkedList<Integer>.InsertionStrategy<Integer>{
        private int sum;
        public SubtotalStrategy(){
            sum = 0;
        }
        
        public boolean select(E ref){
            sum += ref;
            return true;
        }
        public E insert(E ref){
            return sum;
        }
    }
    
    public static class SubtotalOfThreeElements
    extends DoublyLinkedList<Integer>.InsertionStrategy<Integer>{
        private int sumOfThree;
        private int count;
        public SubtotalOfThreeElements(){
            sumOfThree = 0;
            count = 0;
        }
        
        public boolean select(E ref){
            count ++;
            sumOfThree += ref;
            if(count >= 3){
                count = 0;
                return true;
            }
            return false;
        }
        
        public E insert(E ref){
            int returnSum = sumOfThree;
            sumOfThree = 0;
            return returnSum;
        }
    }
    
    public static class InsertFromListStrategy
    extends DoublyLinkedList<Integer>.InsertionStrategy<Integer>{
        private DoublyLinkeList<Integer> list;
        private int pos;
        public InsertFromListStrategy(DoublyLinkedList<Integer> l){
            list = l;
            pos = 0;
        }
        public boolean select(E ref){
            if(list.get(pos)!=null){
                return true;
            }
            throw new IllegalStateException();
        }
        
        public boolean insert(E ref){
             E returnVal = list.get(pos);
             pos++;
             return returnVal;
        }
    }
    
}