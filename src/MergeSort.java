//        package com.nighthawk.csa.natasha.assignOne;

public class MergeSort {
    Node head = null;
    // node a, b;
    static class Node {
        int val;
        Node next;

        public Node(int val)
        {
            this.val = val;
        }
    }

  Node sortedMerge(Node a, Node b)
      {
          Node result = null;
          /* Base cases */
          if (a == null)
              return b;
          if (b == null)
              return a;

          /* Pick either a or b, and recur */
          if (a.val <= b.val) {
              result = a;
              result.next = sortedMerge(a.next, b);
          }
          else {
              result = b;
              result.next = sortedMerge(a, b.next);
          }
          return result;
      }

  Node mergeSort(Node h)
      {
          // Base case : if head is null
          if (h == null || h.next == null) {
              return h;
          }

          // get the middle of the list
          Node middle = getMiddle(h);
          Node nextofmiddle = middle.next;

          // set the next of middle node to null
          middle.next = null;

          // Apply mergeSort on left list
          Node left = mergeSort(h);

          // Apply mergeSort on right list
          Node right = mergeSort(nextofmiddle);

          // Merge the left and right lists
          Node sortedlist = sortedMerge(left, right);
          return sortedlist;
      }

      // Utility function to get the middle of the linked list
      public static Node getMiddle(Node head)
      {
          if (head == null)
              return head;

          Node slow = head, fast = head;

          while (fast.next != null && fast.next.next != null) {
              slow = slow.next;
              fast = fast.next.next;
          }
          return slow;
      }

      void push(int new_data)
      {
          /* allocate node */
          Node new_node = new Node(new_data);

          /* link the old list off the new node */
          new_node.next = head;

          /* move the head to point to the new node */
          head = new_node;
      }

  // Utility function to print the linked list
  void printList(Node headref)
  {
      while (headref != null) {
          System.out.print(headref.val + " ");
          headref = headref.next;
      }
  }

  public void bubbleSort() {
          int size = 5000;
      if (size > 1) {
          boolean wasChanged;

          do {
              Node current = head;
              Node previous = null;
              Node next = head.next;
              wasChanged = false;

              while ( next != null ) {
                  if (current.val > next.val) {

                      wasChanged = true;

                      if ( previous != null ) {
                          Node sig = next.next;

                          previous.next = next;
                          next.next = current;
                          current.next = sig;
                      } else {
                          Node sig = next.next;

                          head = next;
                          next.next = current;
                          current.next = sig;
                      }

                      previous = next;
                      next = current.next;
                  } else {
                      previous = current;
                      current = next;
                      next = next.next;
                  }
              }
          } while( wasChanged );
      }
  }

  void selectionSort(Node head)
  {
      Node temp = head;

  // Traverse the List
      while (temp != null) {
          Node min = temp;
          Node r = temp.next;

      // Traverse the unsorted sublist
          while (r !=null) {
              if (min.val > r.val)
                  min = r;

              r = r.next;
          }

          // Swap Data
          int x = temp.val;
          temp.val = min.val;
          min.val = x;
          temp = temp.next;
      }
  }


  public static void main(String[] args)
  {

      MergeSort li = new MergeSort();
      /*
       * Let us create a unsorted linked list to test the functions
       * created. The list shall be a: 2->3->20->5->10->15
       */
      li.push(15);
      li.push(10);
      li.push(5);
      li.push(20);
      li.push(3);
      li.push(2);
      li.selectionSort(li.head);
      // Apply merge Sort
     // li.head = li.mergeSort(li.head);
      System.out.print("\n Sorted Linked List is: \n");
      li.printList(li.head);
  }
}
