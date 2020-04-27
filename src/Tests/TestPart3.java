package Tests;

import Model.Songs;
import Model.trackBST;
import Model.trackList;
import Trees.BinarySearchTree;

import java.util.*;

public class TestPart3
{
    /**
     * Test Three
     */
    public void run()
    {
        System.out.format("\033[31m%s\033[0m%n", "Start of test 3...");

        trackBST trackBST = new trackBST();
        BinarySearchTree bst = new BinarySearchTree();

        bst = trackBST.loadData("data.txt");

        trackBST.displayOrdered(bst);
        trackBST.displayReversed(bst);

        //System.out.println(bst.inorderToString());

        trackBST.displayArtists(bst);

        System.out.format("\n\033[31m%s\033[0m%n", "End of test 3...\n");

    }

}
