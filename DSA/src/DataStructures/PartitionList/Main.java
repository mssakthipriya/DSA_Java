package DataStructures.PartitionList;

public class Main {

    public static void main(String[] args) {

        // Create a new LinkedList and append values to it
        LinkedList ll = new LinkedList(4);
        ll.append(4);
        ll.append(1);
        ll.append(4);
        ll.append(3);
        ll.append(2);
        ll.append(5);
        ll.append(2);

        // Print the list before partitioning
        System.out.println("LL before partitionList:");
        ll.printList(); // Output: 3 5 8 10 2 1

        // Call the partitionList method with x = 5
        ll.partitionList(3);

        // Print the list after partitioning
        System.out.println("LL after partitionList:");
        ll.printList(); // Output: 3 2 1 5 8 10

        /*
            EXPECTED OUTPUT:
            ----------------
            LL before partition_list:
            3
            5
            8
            10
            2
            1
            LL after partition_list:
            3
            2
            1
            5
            8
            10

        */

    }

}
