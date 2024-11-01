import CircularDuoblyLinkList.Sorted.SCDLLOperation;
import CircularDuoblyLinkList.UnSorted.UnSCDLLOperation;
import CircularSinglyLinkList.Sorted.SCSLLOperation;
import CircularSinglyLinkList.UnSorted.UnSCSLLOperation;
import DoublyLinkList.Sorted.DLLOperation;
import DoublyLinkList.UnSorted.UnSDLLOperation;
import Queue.ArrayQueue.ArrayQueue;
import Queue.DequeueArray.DequeueArray;
import Queue.LLQueue.LLQueue;
import Queue.QueueByStack.QueueByStack;
import SingleLinkList.Sorted.SLLOperation;
import SingleLinkList.UnSorted.UnSSLLOperation;
import Stack.ByArray.StackArray;
import Stack.ByLL.StackLL;
import Tree.BST.BSTOp;
import Tree.BTNode;
import Tree.BinaryTree.BTOperation;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        /*SLLOperation sllOperation = new SLLOperation();
        sllOperation.addNode(4);
        sllOperation.addNode(5);
        sllOperation.addNode(3);
        sllOperation.addNode(6);
        sllOperation.addNode(7);
        sllOperation.addNode(8);
        sllOperation.addNode(9);
        sllOperation.addNode(10);
        sllOperation.addNode(11);
        sllOperation.printSLL();
        System.out.println("Size = "+ sllOperation.getSize());
        sllOperation.deleteNode(10);
        sllOperation.deleteNode(8);
        sllOperation.deleteNode(3);
        sllOperation.deleteNode(4);
        sllOperation.printSLL();
        sllOperation.printNode(11);
        sllOperation.printNode(4);
        sllOperation.printNode( 100);
        System.out.println("Size = "+ sllOperation.getSize());*/
        /*UnSSLLOperation unSSLLOperation = new UnSSLLOperation();
        unSSLLOperation.insertAfterPos(1,0);
        unSSLLOperation.insertAfterPos(2,1);
        unSSLLOperation.insertAfterPos(3,1);
        unSSLLOperation.insertAfterPos(4,1);
        unSSLLOperation.insertAfterPos(5,1);
        unSSLLOperation.insertAfterPos(6,3);
        unSSLLOperation.insertAfterPos(7,3);
        unSSLLOperation.insertAfterPos(8,2);
        unSSLLOperation.insertAfterPos(9,1);
        unSSLLOperation.insertAtBeg(8);
        unSSLLOperation.insertAtPos(4,0);
        unSSLLOperation.insertAtPos(4,1);
        unSSLLOperation.insertAtPos(5,1);
        unSSLLOperation.insertAtPos(7,1);
        unSSLLOperation.insertAtPos(22,2);
        unSSLLOperation.insertAtPos(1,12);
        unSSLLOperation.insetAtEnd(10);
        unSSLLOperation.insertAtBeg(11);
        unSSLLOperation.insetAtEnd(12);
        unSSLLOperation.insertAtBeg(15);
        unSSLLOperation.insetAtEnd(17);
        unSSLLOperation.printSLL();
        unSSLLOperation.deleteAtPos(1);
        unSSLLOperation.deleteAtEnd();
        unSSLLOperation.deleteAtPos(20);
        unSSLLOperation.deleteAtPos(5);
        unSSLLOperation.printSLL();
        unSSLLOperation.insertAtBeg(8);
        unSSLLOperation.insetAtEnd(10);
        unSSLLOperation.insertAtBeg(11);
        unSSLLOperation.insetAtEnd(12);
        unSSLLOperation.insertAtBeg(15);
        unSSLLOperation.insetAtEnd(17);
        unSSLLOperation.printSLL();
        unSSLLOperation.reverseIterative();
        unSSLLOperation.printSLL();
        unSSLLOperation.setHead(unSSLLOperation.reverseRec(unSSLLOperation.getHead()));
        unSSLLOperation.printSLL();*/
        /*DLLOperation dllOperation = new DLLOperation();
        dllOperation.addNode(5);
        dllOperation.addNode(10);
        dllOperation.addNode(4);
        dllOperation.addNode(7);
        dllOperation.addNode(3);
        dllOperation.addNode(2);
        dllOperation.addNode(15);
        dllOperation.addNode(9);
        dllOperation.addNode(8);
        dllOperation.addNode(6);
        System.out.println("Size = "+ dllOperation.getSize());
        dllOperation.printDLL();
        dllOperation.deleteNode(15);
        dllOperation.deleteNode(2);
        dllOperation.deleteNode(6);
        dllOperation.deleteNode(8);
        dllOperation.deleteNode(25);
        dllOperation.deleteNode(1);
        System.out.println("Size = "+ dllOperation.getSize());
        dllOperation.printDLL();
        dllOperation.printNode(3);
        dllOperation.printNode(5);
        dllOperation.printNode(9);
        dllOperation.printNode(10);
        dllOperation.printNode(25);
        dllOperation.printNode(1);
        dllOperation.deleteList();
        System.out.println("Size = "+ dllOperation.getSize());
        dllOperation.printDLL();*/
        /*UnSDLLOperation unSDLLOperation = new UnSDLLOperation();
        /*unSDLLOperation.insertAtPos(4,0);
        unSDLLOperation.insertAtPos(3,1);
        unSDLLOperation.insertAtPos(2,1);
        unSDLLOperation.insertAtPos(6,1);
        unSDLLOperation.insertAtPos(5,1);
        unSDLLOperation.insertAtPos(8,2);
        unSDLLOperation.insertAtPos(9,3);
        unSDLLOperation.insertAtPos(7,2);*/
        /*unSDLLOperation.insertAfterPos(4,0);
        unSDLLOperation.insertAfterPos(3,1);
        unSDLLOperation.insertAfterPos(2,1);
        unSDLLOperation.insertAfterPos(6,1);
        unSDLLOperation.insertAfterPos(5,1);
        unSDLLOperation.insertAfterPos(8,2);
        unSDLLOperation.insertAfterPos(9,3);
        unSDLLOperation.insertAfterPos(7,2);*/
        /*unSDLLOperation.insertAtBeg(1);
        unSDLLOperation.insertAtBeg(2);
        unSDLLOperation.insertAtBeg(3);
        unSDLLOperation.insertAtEnd(4);
        unSDLLOperation.insertAtEnd(5);
        unSDLLOperation.printDLL();
        unSDLLOperation.deleteAtBeg();
        unSDLLOperation.deleteAtBeg();
        unSDLLOperation.deleteAtBeg();
        unSDLLOperation.deleteAtBeg();
        unSDLLOperation.deleteAtBeg();
        unSDLLOperation.printDLL();
        unSDLLOperation.insertAtBeg(1);
        unSDLLOperation.insertAtBeg(2);
        unSDLLOperation.insertAtBeg(3);
        unSDLLOperation.insertAtEnd(4);
        unSDLLOperation.insertAtEnd(5);
        unSDLLOperation.printDLL();
        unSDLLOperation.deleteAtEnd();
        unSDLLOperation.deleteAtEnd();
        unSDLLOperation.deleteAtEnd();
        unSDLLOperation.deleteAtEnd();
        unSDLLOperation.deleteAtEnd();
        unSDLLOperation.printDLL();
        unSDLLOperation.insertAtBeg(1);
        unSDLLOperation.insertAtBeg(2);
        unSDLLOperation.insertAtBeg(3);
        unSDLLOperation.insertAtEnd(4);
        unSDLLOperation.insertAtEnd(5);
        unSDLLOperation.insertAtEnd(7);
        unSDLLOperation.insertAtEnd(8);
        unSDLLOperation.printDLL();
        unSDLLOperation.deleteAtPos(0);
        unSDLLOperation.deleteAtPos(7);
        unSDLLOperation.deleteAtPos(1);
        unSDLLOperation.deleteAtPos(2);
        unSDLLOperation.deleteAtPos(3);
        unSDLLOperation.deleteAtPos(1);
        unSDLLOperation.deleteAtPos(1);
        unSDLLOperation.deleteAtPos(0);
        unSDLLOperation.deleteAtPos(1);
        unSDLLOperation.printDLL();*/
        /*unSDLLOperation.insertAtEnd(1);
        unSDLLOperation.insertAtEnd(2);
        unSDLLOperation.insertAtEnd(3);
        unSDLLOperation.insertAtEnd(4);
        unSDLLOperation.insertAtEnd(5);
        unSDLLOperation.insertAtEnd(6);
        unSDLLOperation.printDLL();
        unSDLLOperation.reverseIterative();
        unSDLLOperation.printDLL();
        unSDLLOperation.insertAtEnd(1);
        unSDLLOperation.insertAtEnd(2);
        unSDLLOperation.insertAtEnd(3);
        unSDLLOperation.insertAtEnd(4);
        unSDLLOperation.insertAtEnd(5);
        unSDLLOperation.insertAtEnd(6);
        unSDLLOperation.printDLL();
        System.out.println("isPalindrome = "+unSDLLOperation.isPalindrome());
        unSDLLOperation.setHead(unSDLLOperation.reverseRec(unSDLLOperation.getHead()));
        unSDLLOperation.printDLL();
        System.out.println("Rec Size is = "+unSDLLOperation.getCountRec(unSDLLOperation.getHead(),0));
        System.out.println("Search result = "+ unSDLLOperation.searchRec(unSDLLOperation.getHead(),5));
        System.out.println("Search result = "+ unSDLLOperation.searchRec(unSDLLOperation.getHead(),20));
        unSDLLOperation.deleteList();
        unSDLLOperation.printDLL();
        unSDLLOperation.insertAtBeg(1);
        unSDLLOperation.insertAtBeg(2);
        unSDLLOperation.insertAtEnd(1);
        unSDLLOperation.insertAtEnd(2);
        unSDLLOperation.printDLL();
        System.out.println("isPalindrome = "+unSDLLOperation.isPalindrome());
        unSDLLOperation.deleteNode(1);
        unSDLLOperation.deleteNode(5);
        unSDLLOperation.deleteNode(1);
        unSDLLOperation.deleteNode(2);
        unSDLLOperation.deleteNode(2);
        unSDLLOperation.deleteNode(2);
        unSDLLOperation.printDLL();
        unSDLLOperation.insertAtBeg(5);
        unSDLLOperation.insertAtBeg(4);
        unSDLLOperation.insertAtBeg(3);
        unSDLLOperation.insertAtBeg(2);
        unSDLLOperation.insertAtBeg(1);
        unSDLLOperation.insertAtBeg(7);
        unSDLLOperation.printDLL();
        unSDLLOperation.reverseSwapApproach();
        unSDLLOperation.printDLL();
        unSDLLOperation.printMiddle();*/
        /*SLLOperation sllOperation1 = new SLLOperation();
        sllOperation1.addNode(1);
        sllOperation1.addNode(4);
        sllOperation1.addNode(7);
        SLLOperation sllOperation2 = new SLLOperation();
        sllOperation2.addNode(2);
        sllOperation2.addNode(5);
        sllOperation2.addNode(8);
        sllOperation1.setHead(sllOperation1.merge2Sorted(sllOperation1.getHead(),sllOperation2.getHead()));
        sllOperation1.printSLL();*/
        /*
        DLLOperation dllOperation1 = new DLLOperation();
        dllOperation1.addNode(1);
        dllOperation1.addNode(4);
        dllOperation1.addNode(7);
        DLLOperation dllOperation2 = new DLLOperation();
        dllOperation2.addNode(2);
        dllOperation2.addNode(5);
        dllOperation2.addNode(8);
        dllOperation1.setHead(dllOperation1.merge2SortedDLL(dllOperation1.getHead(),dllOperation2.getHead()));
        dllOperation1.printDLL();
        dllOperation1.addNode(0);
        dllOperation1.addNode(10);
        dllOperation1.addNode(9);
        dllOperation1.addNode(6);
        dllOperation1.printDLL();
        */
        /*
        SLLOperation sllOperation1 = new SLLOperation();
        sllOperation1.addNode(1);
        sllOperation1.addNode(4);
        sllOperation1.addNode(7);
        SLLOperation sllOperation2 = new SLLOperation();
        sllOperation2.addNode(2);
        sllOperation2.addNode(5);
        sllOperation2.addNode(8);
        sllOperation1.setHead(sllOperation1.merge2SortedListRec(sllOperation1.getHead(),sllOperation2.getHead()));
        sllOperation1.printSLL();*/
        /*
        DLLOperation dllOperation1 = new DLLOperation();
        dllOperation1.addNode(1);
        dllOperation1.addNode(4);
        dllOperation1.addNode(7);
        DLLOperation dllOperation2 = new DLLOperation();
        dllOperation2.addNode(2);
        dllOperation2.addNode(5);
        dllOperation2.addNode(8);
        dllOperation1.setHead(dllOperation1.merge2SortedDLLRec(dllOperation1.getHead(),dllOperation2.getHead()));
        dllOperation1.printDLL();
        dllOperation1.addNode(0);
        dllOperation1.addNode(10);
        dllOperation1.addNode(9);
        dllOperation1.addNode(6);
        dllOperation1.printDLL();
         */
        /*DLLOperation dllOperation = new DLLOperation();
        dllOperation.setHead(dllOperation.merge2SortedDLLRec(dllOperation.getHead(),dllOperation.getHead()));
        dllOperation.printDLL();*/
        /*UnSCSLLOperation unSCSLLOperation = new UnSCSLLOperation();
        unSCSLLOperation.insertAtBeg(5);
        unSCSLLOperation.insertAtEnd(8);
        unSCSLLOperation.insertAtBeg(4);
        unSCSLLOperation.insertAtEnd(9);
        unSCSLLOperation.printCSLL();
        System.out.println("Size= " + unSCSLLOperation.getSize());
        unSCSLLOperation.insertAtPos(10,4);
        unSCSLLOperation.insertAtPos(2,1);
        unSCSLLOperation.insertAtPos(3,2);
        unSCSLLOperation.printCSLL();
        unSCSLLOperation.insertAtBeg(5);
        unSCSLLOperation.insertAtPos(4,1);
        unSCSLLOperation.printCSLL();
        unSCSLLOperation.deleteAtPos(1);
        unSCSLLOperation.deleteAtPos(8);
        unSCSLLOperation.deleteAtEnd();
        unSCSLLOperation.printCSLL();
        unSCSLLOperation.deleteAtBeg();
        //unSCSLLOperation.deleteAtBeg();
        unSCSLLOperation.printCSLL();
        unSCSLLOperation.reverseCSLLIterative();
        unSCSLLOperation.printCSLL();*/
        /*UnSCDLLOperation unSCDLLOperation = new UnSCDLLOperation();
        unSCDLLOperation.insertAtBeg(3);
      */
        /*unSCDLLOperation.insertAtBeg(2);
        unSCDLLOperation.insertAtBeg(1);
        unSCDLLOperation.insertAtEnd(4);
        unSCDLLOperation.insertAtEnd(5);
        unSCDLLOperation.insertAtEnd(6);*/
        /*
        unSCDLLOperation.insertAtPos(2,1);
        unSCDLLOperation.insertAtPos(1,1);
        unSCDLLOperation.insertAtPos(4,3);
        unSCDLLOperation.insertAtPos(5,2);
        unSCDLLOperation.printCDLL();
        */
        /*unSCDLLOperation.deleteFromEnd();
        unSCDLLOperation.deleteFromEnd();
        unSCDLLOperation.deleteFromEnd();
        unSCDLLOperation.deleteFromEnd();
        unSCDLLOperation.deleteFromEnd();
        unSCDLLOperation.deleteFromEnd();
        unSCDLLOperation.insertAtEnd(7);
        unSCDLLOperation.insertAtEnd(6);*/
        /*
        */
        /*unSCDLLOperation.deleteFromPos(2);
        unSCDLLOperation.deleteFromPos(3);
        unSCDLLOperation.deleteFromPos(1);
        unSCDLLOperation.deleteFromPos(2);
        unSCDLLOperation.deleteFromPos(1);
        unSCDLLOperation.printCDLL();
        unSCDLLOperation.insertAtEnd(7);
        unSCDLLOperation.insertAtEnd(6);*/
        /*
        unSCDLLOperation.reverseIterative();
        unSCDLLOperation.insertAtEnd(8);
        unSCDLLOperation.insertAtBeg(1);
        unSCDLLOperation.printCDLL();*/
        /*SCDLLOperation scdllOperation = new SCDLLOperation();
        scdllOperation.insertNode(5);
        scdllOperation.insertNode(4);
        scdllOperation.insertNode(6);
        scdllOperation.insertNode(3);
        scdllOperation.insertNode(7);
        scdllOperation.printCDLL();
        scdllOperation.insertNode(5);
        scdllOperation.insertNode(4);
        scdllOperation.insertNode(6);
        scdllOperation.insertNode(3);
        scdllOperation.insertNode(7);
        scdllOperation.printCDLL();
        scdllOperation.insertNode(15);
        scdllOperation.insertNode(10);
        scdllOperation.printCDLL();
        scdllOperation.deleteNode(3);
        scdllOperation.deleteNode(15);
        scdllOperation.deleteNode(10);
        scdllOperation.deleteNode(5);
        scdllOperation.deleteNode(4);
        scdllOperation.deleteNode(6);
        scdllOperation.deleteNode(7);
        scdllOperation.deleteNode(6);
        scdllOperation.deleteNode(5);
        scdllOperation.deleteNode(3);
        scdllOperation.deleteNode(4);
        scdllOperation.deleteNode(7);
        scdllOperation.deleteNode(78);
        scdllOperation.printCDLL();
        */
        /*
        SCSLLOperation scsllOperation = new SCSLLOperation();
        scsllOperation.insertNode(5);
        scsllOperation.insertNode(4);
        scsllOperation.insertNode(3);
        scsllOperation.insertNode(8);
        scsllOperation.insertNode(9);
        scsllOperation.insertNode(10);
        scsllOperation.printCSLL();
        scsllOperation.insertNode(5);
        scsllOperation.insertNode(4);
        scsllOperation.insertNode(3);
        scsllOperation.insertNode(8);
        scsllOperation.insertNode(9);
        scsllOperation.insertNode(10);
        scsllOperation.printCSLL();
        scsllOperation.insertNode(15);
        scsllOperation.insertNode(14);
        scsllOperation.printCSLL();
        scsllOperation.deleteNode(15);
        scsllOperation.deleteNode(14);
        scsllOperation.printCSLL();
        scsllOperation.deleteNode(5);
        scsllOperation.deleteNode(8);
        scsllOperation.deleteNode(9);
        scsllOperation.deleteNode(10);
        scsllOperation.deleteNode(3);
        scsllOperation.deleteNode(4);
        scsllOperation.printCSLL();
        scsllOperation.deleteNode(5);
        scsllOperation.deleteNode(8);
        scsllOperation.deleteNode(9);
        scsllOperation.deleteNode(10);
        scsllOperation.deleteNode(3);
        scsllOperation.deleteNode(55);
        scsllOperation.printCSLL();
        scsllOperation.deleteNode(4);
        scsllOperation.printCSLL();
        scsllOperation.deleteNode(55);
        scsllOperation.insertNode(77);
        scsllOperation.insertNode(88);
        scsllOperation.printCSLL();
        */
        /*StackArray stackArray = new StackArray();
        stackArray.push(1);
        stackArray.push(2);
        stackArray.push(3);
        stackArray.push(4);
        stackArray.push(5);
        stackArray.push(6);
        stackArray.displayStack();
        System.out.println(stackArray.peek());
        System.out.println(stackArray.peek());
        System.out.println("pop==> " + stackArray.pop());
        System.out.println("pop==> " + stackArray.pop());
        System.out.println("pop==> " + stackArray.pop());
        System.out.println("pop==> " + stackArray.pop());
        System.out.println("pop==> " + stackArray.pop());
        System.out.println("pop==> " + stackArray.pop());
        System.out.println("pop==> " + stackArray.pop());
        stackArray.displayStack();*/
        /*StackLL stackLL = new StackLL();
        stackLL.push(2);
        stackLL.push(3);
        stackLL.push(4);
        stackLL.push(5);
        stackLL.display();
        System.out.println(stackLL.pop());
        System.out.println(stackLL.pop());
        System.out.println(stackLL.pop());
        stackLL.display();
        System.out.println(stackLL.pop());
        System.out.println(stackLL.pop());
        System.out.println(stackLL.pop());
        System.out.println(stackLL.peek());
        System.out.println(stackLL.peek());
        System.out.println(stackLL.peek());
        */
        /*ArrayQueue arrayQueue = new ArrayQueue();
        arrayQueue.enqueue(5);
        arrayQueue.enqueue(4);
        arrayQueue.enqueue(3);
        arrayQueue.enqueue(2);
        arrayQueue.enqueue(1);
        arrayQueue.enqueue(8);
        System.out.println("Size = "+arrayQueue.getSize());
        arrayQueue.displayQueue();
        System.out.println(arrayQueue.dequeue());
        System.out.println(arrayQueue.dequeue());
        System.out.println(arrayQueue.dequeue());
        System.out.println(arrayQueue.dequeue());
        System.out.println(arrayQueue.dequeue());
        arrayQueue.displayQueue();
        System.out.println(arrayQueue.dequeue());
        System.out.println("Size = "+arrayQueue.getSize());*/
        /*LLQueue llQueue = new LLQueue();
        llQueue.enqueue(5);
        llQueue.enqueue(4);
        llQueue.enqueue(3);
        llQueue.enqueue(2);
        llQueue.enqueue(1);
        llQueue.display();
        System.out.println(llQueue.peek());
        llQueue.dequeue();
        System.out.println(llQueue.peek());
        llQueue.dequeue();
        System.out.println(llQueue.peek());
        llQueue.dequeue();
        System.out.println(llQueue.peek());
        llQueue.dequeue();
        System.out.println(llQueue.peek());
        llQueue.dequeue();
        System.out.println(llQueue.peek());
        llQueue.display();
        llQueue.dequeue();
        System.out.println(llQueue.peek());
        */
        /*QueueByStack queueByStack = new QueueByStack();
        queueByStack.enqueue(5);
        queueByStack.enqueue(4);
        queueByStack.enqueue(3);
        queueByStack.display();
        System.out.println(queueByStack.dequeue());
        System.out.println(queueByStack.dequeue());
        System.out.println(queueByStack.dequeue());
        queueByStack.display();
        System.out.println(queueByStack.dequeue());
        */
        /*DequeueArray dequeueArray = new DequeueArray();
        dequeueArray.enqueueFront(5);
        dequeueArray.enqueueRear(6);
        dequeueArray.enqueueRear(7);
        dequeueArray.enqueueFront(4);
        dequeueArray.enqueueFront(3);
        dequeueArray.dequeueFront();
        dequeueArray.dequeueRear();
        dequeueArray.dequeueRear();
        dequeueArray.dequeueFront();
        dequeueArray.dequeueFront();
        dequeueArray.displayDequeue();*/

        BTOperation btOperation = new BTOperation();
        btOperation.createBinaryTree();
        System.out.println("Print inorder");
        btOperation.printInOrder(btOperation.getRoot());
        /*System.out.println();
        System.out.println("Print preorder");
        btOperation.printPreOrder(btOperation.getRoot());
        System.out.println();
        System.out.println("Print postorder");
        btOperation.printPostOrder(btOperation.getRoot());*/
        System.out.println("Print inorder");
        btOperation.printInOrder(btOperation.getRoot());
        /*BSTOp bstOp = new BSTOp();
        BTNode root = null;
        root = bstOp.insert(root ,5);
        root = bstOp.insert(root ,3);
        root = bstOp.insert(root ,2);
        root = bstOp.insert(root ,4);
        root = bstOp.insert(root ,8);
        root = bstOp.insert(root ,9);
        root = bstOp.insert(root ,7);
        bstOp.printInOrder(root);
        bstOp.editNode(root,9,10);
        System.out.println();
        bstOp.printInOrder(root);
        System.out.println();
        System.out.println("is Exist");
        System.out.println(bstOp.isExist(root,7));
        //root = bstOp.deleteNode(root,2);
        root = bstOp.deleteNodeBetterPerformance(root, 2);
        System.out.println();
        System.out.println("delete 2");
        bstOp.printInOrder(root);
        root = bstOp.deleteNodeBetterPerformance(root, 3);
        System.out.println();
        System.out.println("delete 3");
        bstOp.printInOrder(root);
        root = bstOp.deleteNodeBetterPerformance(root, 5);
        System.out.println();
        System.out.println("delete 5");
        bstOp.printInOrder(root);*/
    }
}