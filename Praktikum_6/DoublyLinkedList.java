public class DoublyLinkedList
{
    private Element first, last;
    private int size;

    public DoublyLinkedList()
    {
        first = last = null;
        size = 0;
    }
    //13
    public DoublyLinkedList(DoublyLinkedList dll){
        first = dll.first;
        last = dll.last;
        size = dll.size();
    }

    public int size()
    {
        return size;
    }
    
    public boolean isEmpty()
    {
        return size == 0;
    }

    public void add( Object content ) 
    {
        Element e = new Element( content );
        if ( isEmpty() ) 
        {
            first = last = e;
        }
        else 
        {
            last.connectAsSucc( e );
            last = e;
        }
        size++;
    }

    public void addFirst( Object content ) 
    {
        Element e = new Element( content );
        if ( isEmpty() ) 
        {
            first = last = e;
        }
        else 
        {
            first.connectAsPred( e );
            first = e;
        }
        size++;
    }

    public Object getFirst() 
    {
        if ( !isEmpty() )
        {
            return first.getContent();
        }
        else
        {
            throw new RuntimeException();
        }
    }

    public Object get( int index ) 
    {
        if ( index >= 0 && index < size )
        {
            Element current = first;
            for ( int i = 0; i < index; i++ )
            {
                current = current.getSucc();
            }
            return current.getContent();
        }
        else
        {
            throw new RuntimeException();
        }
    }

    public Object removeFirst()
    {
        if ( !isEmpty() ) 
        {
            Object result = first.getContent();
            if ( first.hasSucc() )
            {
                first = first.getSucc();
                first.disconnectPred();
            }
            else
            {
                first = last = null;
            }
            size--;
            return result;
        }
        else
        {
            throw new RuntimeException();
        }
    }

    public void showAll()
    {
        Element current = first;
        while ( current != null )
        {
            System.out.print( current.getContent() );  // impliziter Aufruf von toString, falls != null
            if ( current != last )
            {
                System.out.print(", ");
            }
            current = current.getSucc();
        }
        System.out.println();
    }
    //1
    public void clear(){
        first = null;
        last = null;
        size = 0;
    }
    
    //2
    public Object getLast(){
        if(!isEmpty()){
            return last.getContent();
        } else {
            throw new IllegalStateException("Liste ist leer");
        }
    }
    
    //3
    public boolean contains(Object obj){
        Element current = first;
        while(current != null){
            if(current.getContent()==obj){
                return true;
            }
            current = current.getSucc(); 
        }
        return false;
    }
    
    //4
    public int count(Object obj){
        int returnCount = 0;
        Element current = first;
        while (current!=null){
            if(current.getContent()==obj){
                returnCount++;
            }
            current = current.getSucc();
        }
        return returnCount;
    }
    
    //5
    public boolean allEqual(){
        Element current = first;
        while(current.hasSucc()){
            if(!current.getContent().equals(current.getSucc().getContent())){
                return false;
            }
            current = current.getSucc();
        }
        return true;
    }
    
    //6
    public boolean containsDouble(){
        if(size>=2){
            Element current = first;
            Element index = first.getSucc();
            while(current.hasSucc()){
                while(index != null){
                    if(index.getContent().equals(current.getContent())){
                        return true;
                    }
                    index = index.getSucc();
                }
                current = current.getSucc();
                index = current.getSucc();
            }
            return false;
        } else {
            return false;
        }
    }
    
    //7
    public void insert(int n, Object obj){
        if(n<0 || n>=size){
            throw new IndexOutOfBoundsException();
        }
        Element current = first;
        for ( int i = 0; i < n; i++ ){
            current = current.getSucc();
        }
        Element toInsert = new Element(obj);
        Element posOfToInsert =  current;
        if(current == last){
            current.connectAsSucc(toInsert);
            last = toInsert;
        } else {
            Element succPosOfToInsert = current.getSucc();
            posOfToInsert.connectAsSucc(toInsert);
            succPosOfToInsert.connectAsPred(toInsert);
        }
        size++;
    }
    
    //8
    public void toArray(Object[] arr){
        Element current = first;
        for(int i = 0; current != null && i < arr.length; i++){
            arr[i] = current.getContent();
            current = current.getSucc();
        }
    }
    
    //9
    public DoublyLinkedList flip(){
        Element current = last;
        Element predCurr = current.getPred();
        while(predCurr.hasPred()){
            Element prePredCurr = predCurr.getPred();
            current.connectAsSucc(predCurr);
            current = predCurr;
            predCurr = prePredCurr;
        }
        if(size > 2){
            current.connectAsSucc(predCurr);
            last.disconnectPred();
            first.disconnectSucc();
        }
        
        first = last;
        last = current.getSucc();
        return this;
    }
    
    //10
    public void remove(int n){
        if(n<0||n>=size){
            throw new IndexOutOfBoundsException();
        } else {
            if(n == 0){
                first = first.getSucc();
                first.disconnectPred();
            } else if(n== size-1){
                last = last.getPred();
                last.disconnectSucc();
            } else {
                Element current = first;
                for(int i = 0; i<n ; i++){
                    current = current.getSucc();
                }
                current.getPred().connectAsSucc(current.getSucc());
            }
            size--;
        }
    }
    
    //11
    public void remove(Object obj){
        Element current = first;
        int i = 0;
        while(current != null){ 
            if(current.getContent().equals(obj)){
                current = current.getSucc();
                remove(i);
                continue;
            }
            i++;
            current = current.getSucc();
        }
    }
    
    //12
    public void concat(DoublyLinkedList dll){
        if(dll.size>0){
            size += dll.size;
            last.connectAsSucc(dll.first);
            last = dll.last;
            dll.first = null;
            dll.last = null;
        }
    }
    
    //14
    public DoublyLinkedList subList(int from, int to){
        if(from>to || from < 0 || to >= size){
            throw new IndexOutOfBoundsException();
        }
        DoublyLinkedList returnList = new DoublyLinkedList();
        Element current = first;
        for(int i = 0; i<to;i++){
            if(i >= from){
                returnList.add(current.getContent());
            }
            current = current.getSucc();
        }
        return returnList;
    }
    
    //15 
    public void removeAll(DoublyLinkedList dll){
        Element index = dll.first;
        while(index != null){
            Element current = first;
            while(current != null){
                if(index.getContent().equals(current.getContent())){
                    if(current == first){
                        first = current.getSucc();
                        current.getSucc().disconnectPred();
                    } else if(current == last){
                        last = current.getPred();
                        current.getPred().disconnectSucc();
                    }
                    current.getPred().connectAsSucc(current.getSucc());
                }
                current = current.getSucc();
            }
            index = index.getSucc();
        }
    }
    
    //16
    public void pack(){
        if(size > 1){
        Element current = first.getSucc();
        Element currentPred = first;
            while(current != null){
                if(current.getPred().getContent().equals(current.getContent())){
                    if(current.getSucc()!= null){
                        currentPred.connectAsSucc(current.getSucc());
                    } else {
                        currentPred.disconnectSucc();
                    }
                    current = currentPred.getSucc();
                } else {
                    currentPred = current;
                    current = current.getSucc();
                }
            }
        }
    }
    
}






