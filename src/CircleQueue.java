//package com.nighthawk.csa.natasha.assignOne;
//import java.util.LinkedList;


import java.time.Duration;
import java.time.Instant;

/**
 *  Implementation of Queue, using LinkedList (previous and next).
 */
public class CircleQueue
{
    private LinkedList headNode;			// 1st element in Queue
    private LinkedList tailNode;			// Last element in Queue
    private LinkedList currentNode;

    /**
     *  Constructor generates an empty list.
     */
    public CircleQueue()
    {
        headNode = null;
        tailNode = null;
        currentNode = null;
    }


    /**
     *  Returns the head opaqueObject.
     *
     * @return  the head opaqueObject in Stack.
     */
    public Object getFirstObject()
    {
        currentNode = headNode;

        if (headNode == null)
            return null;
        else
            return headNode;
    }

    /**
     *  Returns the tail opaqueObjects.
     *
     * @return  the current opaqueObject in Stack.
     */
    public Object getLastObject()
    {
        currentNode = tailNode;

        if (tailNode == null)
            return null;
        else
            return tailNode;
    }

    /**
     *  Returns the current Object
     *
     * @return  the current Object in Stack.
     */
    public Object getObject()
    {
        if (currentNode == null)
            return null;
        else
            return currentNode;
    }

    /**
     *  Advances the current node.
     *
     */
    public Object setNext()
    {
        currentNode = currentNode.getNext();

        // never let currentNode be null, wrap to head
        if (currentNode == null)
            currentNode = headNode;

        return currentNode;
    }

    /**
     *  Reverses the current node.
     *
     */
    public void setPrevious()
    {
        currentNode = currentNode.getPrevious();

        // never let currentNode be null, wrap to head
        if (currentNode == null)
            currentNode = tailNode;
    }


    /**
     *  Add a new object at the end of the Queue,
     *
     * @param  opaqueObject  is the database to be inserted in the Queue object.
     */
    public void add(Object opaqueObject)
    {
        // add new object to end of Queue
        // set opaqueObject
        // build previous link of tail (as current)
        tailNode = new LinkedList(opaqueObject, currentNode);

        // build next link of current (as tail)
        if (currentNode != null)
            currentNode.setNextNode(tailNode);

        // after links are established current eq tail
        currentNode = tailNode;

        // head eq tail on 1st element only
        if (headNode == null) {
            headNode = tailNode;
        }
    }

    /**
     *  Delete an object from the front of the Queue,
     *
     */
    public Object delete()
    {
        Object opaqueObject = null;

        if (headNode != null) {
            opaqueObject = headNode;
            headNode = headNode.getNext();
            if (headNode == null)
                tailNode = headNode;
            else
                headNode.setPrevNode(null);
        }

        return opaqueObject;
    }


    /**
     *  Returns a string representation of this Queue,
     *  polymorphic nature of toString overrides of standard System.out.print behavior
     *
     * @return    string representation of this Queue
     */
    public String toString()
    {
        StringBuilder queueToString = new StringBuilder("[");

        LinkedList node = headNode;  			// start from the head
        while (node != null)
        {
            queueToString.append("(").append(node.getData()).append(")"); 	// append the database to output string
            node = node.getNext();				// go to next node
            if (node != null)
                queueToString.append(", ");
        }										// loop 'till queue ends
        queueToString.append("]");
        return queueToString.toString();
    }

    /**
     * Performs insertion sort based off of the contents of object
     */
    public void insertionSort() {

        //two nodes needed for insertion sort indexes
        LinkedList node1 = headNode;
        LinkedList node2 = (node1 == null) ? null : node1.getNext();

        //continue while nodes remain in bounds
        while (node2 != null) {

            //inner loop pointers for compares and shifts
            LinkedList slot1 = node1;
            LinkedList slot2 = node2;

            //key to be inserted into sorted slot
            LinkedList key = new LinkedList(node2);		//note: make key a different object, persistent/static in value (node2 moves)
            String keyText = node2.getData().toString();

            //walks slots backwards until key position in found
            while ( slot1.getData().toString().compareTo(keyText) > 0 ) {
                //shifts object greater than key value to the right in list
                slot2.setData(slot1.getData());

                //moves inner loop pointers
                slot1 = slot1.getPrevious();
                slot2 = slot2.getPrevious();

                //stop at the front of list
                if (slot1 == null)
                    break;

            }
            //place key in insertion position
            slot2.setData(key.getData());

            //advance insertion sort indexes
            node1 = node1.getNext();
            node2 = node2.getNext();
        }

    }

    public static void main(String[] args) {
        int TIMES=12, SIZE=5000;
        int[] array = new int[SIZE];
        float time =0;

        int minTime = Integer.MAX_VALUE;
        int maxTime = 0;

        Duration timeElapsed;
        int[] times = new int[TIMES];

        int count =0;
        for(int i=0; i< TIMES; i++) {
            CircleQueue list = new CircleQueue();
            for (int j = 0; j < SIZE; j++) {
                list.add((int)(Math.random() * (SIZE+1)));
            }
            Instant start = Instant.now();
            list.insertionSort();
            Instant end = Instant.now();
            timeElapsed = Duration.between(start, end);
            times[count] = timeElapsed.getNano();
            count++;
            time += timeElapsed.getNano();
        }

        for(int i=0; i< 12; i++){
            minTime = Math.min(minTime, times[i]);
            maxTime = Math.max(maxTime, times[i]);
        }
        System.out.println("Insertion Sort Analysis with LinkedList"  );
        System.out.println("Total Nanoseconds: " + time/1000000000.0 );
        System.out.println("Avg Total Seconds: " + time /(1000000000.0*12));
        System.out.println("Min Seconds: " + minTime/1000000000.0 );
        System.out.println("Max Seconds: " + maxTime/1000000000.0 );
        System.out.println( );
        time =0;
        count =0;
        array = new int[SIZE];
        for(int i=0; i< TIMES; i++) {
            MergeSort llist = new MergeSort();
            for (int j = 0; j < SIZE; j++) {
                llist.push((int)(Math.random() * (SIZE+1)));
            }
            Instant start = Instant.now();
            llist.bubbleSort();
            Instant end = Instant.now();
            timeElapsed = Duration.between(start, end);
            times[count] = timeElapsed.getNano();
            count++;
            time += timeElapsed.getNano();
        }

        minTime = Integer.MAX_VALUE;
        maxTime = 0;
        for(int i=0; i< TIMES; i++){
            minTime = Math.min(minTime, times[i]);
            maxTime = Math.max(maxTime, times[i]);
        }
        System.out.println("Bubble Sort Analysis"  );
        System.out.println("Total Nanoseconds: " + time/1000000000.0 );
        System.out.println("Avg Total Seconds: " + time /(1000000000.0*12));

        System.out.println("Min Seconds: " + minTime/1000000000.0 );
        System.out.println("Max Seconds: " + maxTime/1000000000.0 );
        System.out.println( );
        time =0;
        count =0;

        for(int i=0; i< TIMES; i++) {
            MergeSort llist = new MergeSort();
            for (int j = 0; j < SIZE; j++) {
                llist.push((int)(Math.random() * (SIZE+1)));
            }
            Instant start = Instant.now();
            llist.selectionSort(llist.head);
            Instant end = Instant.now();
            timeElapsed = Duration.between(start, end);
            times[count] = timeElapsed.getNano();
            count++;
            time += timeElapsed.getNano();
        }

        minTime = Integer.MAX_VALUE;
        maxTime = 0;
        for(int i=0; i< 12; i++){
            minTime = Math.min(minTime, times[i]);
            maxTime = Math.max(maxTime, times[i]);
        }
        System.out.println("Selection Sort Analysis"  );
        System.out.println("Total Nanoseconds: " + time/1000000000.0 );
        System.out.println("Avg Total Seconds: " + time /(1000000000.0*12));

        System.out.println("Min Seconds: " + minTime/1000000000.0 );
        System.out.println("Max Seconds: " + maxTime/1000000000.0 );

        System.out.println( );
        time =0;
        count =0;


        /*
         * Let us create a unsorted linked list to test the functions
         * created. The list shall be a: 2->3->20->5->10->15
         */

        for(int i=0; i< TIMES; i++) {
            MergeSort llist = new MergeSort();
            for (int j = 0; j < SIZE; j++) {
                llist.push((int)(Math.random() * (SIZE+1)));
            }
            Instant start = Instant.now();
            llist.mergeSort(llist.head);
            Instant end = Instant.now();
            timeElapsed = Duration.between(start, end);
            times[count] = timeElapsed.getNano();
            //System.out.println("Time Elapsed " + times[2]);
            count++;
            time += timeElapsed.getNano();

        }

        minTime = Integer.MAX_VALUE;
        maxTime = 0;
        for(int i=0; i< 12; i++){
            minTime = Math.min(minTime, times[i]);
            maxTime = Math.max(maxTime, times[i]);
        }
        System.out.println("Merge Sort Analysis"  );
        System.out.println("Total Nanoseconds: " + time/1000000000.0 );
        System.out.println("Avg Total Seconds: " + time /(1000000000.0*12));

        System.out.println("Min Seconds: " + minTime/1000000000.0 );
        System.out.println("Max Seconds: " + maxTime/1000000000.0 );
    }



}