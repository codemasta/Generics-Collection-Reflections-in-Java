### Producer extends and consumer super principle

***

>Producer extends -> if we want to read from a list we have to declare it with extends
List<? extends T> we can read T values from this list but can not add T values to this list

>Consumer super -> if we want to add to a list we should use super
List<? super T> we can add T values to this list but can not read from this list because we do not know the type

If we want to add AND read at the same time: we have to declare the collection with no wildcards
For example : List<Double> we can add and read doubles


### TYPE ERASURE

***

In order to implement generics , Java uses type erasure
This is how generic Java code is handled
  -  replace all type parameters in generic types with their bounds or object
    If the type parameters are unbounded
     So the final bytecode will contain plan java objects/classes

   - use type casts if necessary

   - sometimes it generates extra methods : the so called bridge methods
    in order to maintain polymorphism with generics types


   In the bytecode the following code is equivalent

   List<Integer> list = new ArrayList<>();
   list.add(3);
   Integer num = list.get(0);
   ----------------------------------------
    List list = new ArrayList<>();
    list.add(3);
    Integer num = list.get(0);


### COLLECTIONS

***

  The Java collections framework is a set of classes and interfaces
  These classes and interfaces implement the collection data structures
  For examples : lists, stack , queue or maps
  The collections framework was designed and developed primarily by Joshua bloch
  It was introduced in JDK 1.2
Almost all collections are derived from the
   java.util.collection interface

   - toArray() method can transform any collection into a one-dimensional array
   - the Collection interface extends  the java.lang.Iterable interface , This is why we can use for-each loop

   Collections can store scalar values
   Map store key,pair values


Iterable - Collection
               |
  List(Interface)     Queue(Interface)         Set(Interface)
    ArrayList            PriorityQueue           HashSet
    LinkedList        Dequeue(Interface)         LinkedHashSet
    Vector               ArrayDeque            SortedSet(Interface)
      Stack                                       TreeSet

Visualization 

## Iterable 
   * Collection 
        * List 
            * ArrayList
            * LinkedList
            * Vector
                * Stack       
        * Queue 
                * PriorityQueue
          * Deque
          * ArrayDeque     
        * Set 
                * Hashet
                * LinkedHashSet   
          * SortedSet
          * TreeSet

  

Stack is a vector
Queue is an interface for LinkedList 

##Map
  * HashTable
  * HashMap
  * LinkedHashMap
## SortedMap
  * TreeMap
  

# Notes on Collections

 * ##### ARRAYLIST

This is one of the implementations of the List interface.
An array stores the values in the background.

`int [] array = new int[10]`

> Random access is very fast 0(1) --> random access : accessing items by the index - list.get(0)

It is equivalent to Vector BUT arrayList is not synchrozed  
All operations run 0(N) time approximately ie. linear time complexity  
But if we want to remove items , this operation is not so efficient.
  We have to shift each item in our list - 0(N)  
If our application is just about adding elements to a list and getting elements with known 
indexes -> an arrayList is perfect  
Capacity : it is a parameter we can define when we instantiate an ArrayList  
  * It is the initial size of the array  
        - if we know that we will store 5 million items in a list we should use it   
 list = new ArrayList(5000000) WHY ? This may reduce the amount of incremental reallocation

  * ##### LINKEDLIST
It is another implementation of the List interface  
      - implements List , Queue , Deque interfaces  
It uses references -> each item ha a reference to the next item + store the data itself  
   234 -> 100 -> 12 -> 1 (Single linked list) i.e 234 only knows about 100 and 100 only knows
   about 12  
   234 knows nothing about 12  
   
   23 <-> 100 <-> 12 <-> 1 ( doubly- inked list) this knows about the item before and after it  
   
   Linkedin is faster in item removal because if we delete an item , the remaining do not shift like in an 
   ArrayList rather only the reference to the next item is updated hence it is faster than ArrayList  
   The fastest is when we remove from beginning or at the end of the linkedlist
   
    - NO RAMDON ACESS
    - not synchronized
    - we can remove items very efficiently / 0(1)
    no sequential access !!! if we want to find an item we have to iterate through the list until we find it / 0(N)
    - remove operation is very efficient just update the references/pointers 0(1)
    - so we should use a linkedlist for remove-heavy application. 
    
   * ##### VECTOR
   
   It is similar to ArrayList with 2 differences
   
     - Vectors are synchronized : multiple threads can manipulate the content of a vector without any inconsistency  
     - Vectors contain many legacy methods : these methods are not part of the collections framework
         * so lists do not have these methods
   
   
 ``new Vector( capacity , capacityIncrement)``
 
The vector's storage increases in chunks the size of capacityIncrement. An application can increase the capacity of a vector before inserting a large number of components  
    - this reduces the amount of incremental reallocation  
    So every time the vector become full --> the size will bbe incremented by the capacityIncrement
   
   * #### STACK
   
   A stack is a data structure where you add elements to the "top" of the stack and also remove elements  
   from the top again.  
   LIFO => last in first out principle
     
        - Stack's are really good for some types of data processing
          for instance if you are parsing an XML file using either SAX or STAX
  
   Applications --> for example graph traversing with depth-first search 
   
   * #### Queue
  
   We insert the items at the end of the queue and items are removed from the beginning of the
   queue  
   
   FIFO structure -> First In First Out  
   
   There are 2 implementation of the Queue interface
   LinkedList
   PriorityQueue - PriorityQueue stores its elements internally according to their natural
                   order (if they implement Comparable)  
                   
    Applications --> bbreadth-first search
    
   * #### PriorityQueue
   
   Based on a priority heap  
   
   We assign a priority value to every single item 
   
     - element with high priority is served before an element with low priority
     - the element of the priority queue are ordered according to their natural ordering
       defined by the Comparable interface
     
     - add() -> add elements to the queue
     - peek() -> retirves but does not remove 
     - poll() - > retireves and removes the head of this queue or returns null if this queue is empty
     
   * #### Deque 
     ArrayDeque is the implementation  
        deque : doubly-ended queue
          We can insert and remove from both sides of the queue  
          
              offerFirst(T t) and offerLast(T t)  
              removeFirst(T t) and removeLast(T t)
              
     * It is not thread safe
     * It allows unlimited insertion of items
     * ArrayDeque can be used as queue and stack both  
       When it is used as stack , it is faster than stack
       When it is used as queue , it is faster than linkedlist
        
    
## Map
   * #### HashMap
   An object that maps keys to values. A map cannot contain duplicate keys each key can map to at most one value  
   
   Some map implementations like the TreeMap class make specific guarantees as to their order
      - others , like the HaspMap class -> do not  
   
       - TreeMap is sorted  
       - HashTable is synchronized but slow
       - HashMap is not synchronized
          - HashTable does not allow null keys or values. HashMap allowd one null key and any member of null values
          
       - Hashfunction -> O(1)
   
   * #### LinkedHashMap
   It has the same features as we have een for HashMap  
      But for HashMap -> no guarantee about the iteration order  
            
      - there is a doubly-linked between all of its entires : so the order will be the order in which  
        we have inserted the items "insertion order"
      - LinkedHashMap is not synchronized as well
      
    LinkedHashMap -> we can iterate in the order in which the entrie were put into the Map
    
   * #### TreeMap
   It is the implementation of the Map interface
   
      - the concrete implementation is a red-black tree
      - the map is sorted according to the natural ordering of its keys  
        or we can use the Comparale for custom objects
      - O(logN) guaranteed running time because of the balanced tree implementation  
        get() , put() , remove()
        
      Again this data structure is not synchronised
      
   * #### HashSet
   Set is a collection that contains no duplicate elements  
      
      - so there is no pair of elements e1 and e2 such that  
         e1.equals(e2)
      1.) HashSet
                 It contains a HashMap in the background
      -  It makes no guarantees as to the iteration order of the set  
         It doesn not guarantee that the order will remain constant over time 
      -  HashSet allows null element
      -  If the hash function is "perfect" ---> the operations have O(1)  
         constant running time  
             add(), remove(), cotains(), size()  
      - not synchronized
      
    Iteration performance : iterating over a HashSet requires time proportional to  
    the size of the set + capacity
       So: number of items + number of buckets
          NOT TO SET THE INITIAL CAPACITY TOO HIGH 
      2.) LinkedHashSet : extends HashSet class + implements Set interface
          It has predictable iteration order
             It maintains doubly-linked lit between all of its items 
               - that's why the iteration order is well defined
                   * insertion order * 
                   
      We use LinkedHashSet when we copy a set  
      Not synchronized 
      
      O(1)  -> add() , remove() , contain()  
      It is a bit slower than HashSet because of the additional cost of maintaining a linked list  
      3.) TreeSet : red - black tree implementation
         O(logN)  running times for most of the operations
           It is a sorted data structure 
           
         TreeSet is practically implemented using TreeMap instance 
