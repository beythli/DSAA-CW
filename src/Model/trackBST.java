package Model;

import Trees.BinarySearchTree;
import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class trackBST
{
    BinarySearchTree bst = new BinarySearchTree();

    /**
     * Loads data in BinarySearchTree, reads data file
     * @param file  String
     * @return  bst
     */
    public BinarySearchTree loadData(String file)
    {
        try (BufferedReader br = new BufferedReader(new FileReader(file)))
        {
            int ID, trackLength;
            String title, artist, composer, date, album, genre;

            String line = br.readLine();

            while (line != null)
            {
                while (line.equals("")) {
                    line = br.readLine();
                }

                ID = Integer.parseInt(line);
                line = br.readLine();
                title = line;
                line = br.readLine();
                artist = line;
                line = br.readLine();
                trackLength = Integer.parseInt(line);
                line = br.readLine();
                composer = line;
                line = br.readLine();
                date = line;
                line = br.readLine();
                album = line;
                line = br.readLine();
                genre = line;
                Songs song = new Songs(ID, title, artist, trackLength, composer, date, album, genre);

                bst.add(song);
                line = br.readLine();
            }
        } catch (IOException ex) {
            Logger.getLogger(Songs.class.getName()).log(Level.SEVERE, null, ex);
        }
        return bst;
    }

    /**
     * Displays list in ascending order by artist using for cycle; NOTE: can print list using either statement in cycle
     * @param bst   BinarySearchTree
     */
    public void displayOrdered(BinarySearchTree bst)
    {
        System.out.format("\033[36m%s\033[0m%n", "Displaying in ascending order by artist...");

        trackList trackList = new trackList();
        List<Songs> list;
        list = bst.toList();
        Collections.sort(list, Songs.SongNameComparator);

        for(int i = 0; i< list.size(); i++){
            //System.out.println(list.get(i).toString());
            trackList.displaySong(list.get(i));
        }
    }

    /**
     * Displays list in descending order by artist using for cycle; NOTE: can print list using either statement in cycle
     * @param bst   BinarySearchTree
     */
    public void displayReversed(BinarySearchTree bst)
    {
        System.out.format("\033[36m%s\033[0m%n", "\nDisplaying in descending order by artist...");

        trackList trackList = new trackList();
        List<Songs> list;
        list = bst.toList();
        Collections.sort(list, Songs.SongNameComparator);

        for(int i = list.size() - 1; i >= 0; i--){
            System.out.println(list.get(i).toString());
            //trackList.displaySong(list.get(i));
        }
    }

    /**
     * Displays artists in list using while cycle
     * @param bst   BinarySearchTree
     */
    public void displayArtists(BinarySearchTree bst)
    {
        Iterator it = bst.toList().listIterator();
        Set<String> set = new TreeSet();
        while (it.hasNext())
        {
            Songs song = (Songs) it.next();
            set.add(song.getArtist());
        }
        System.out.format("\n\033[36m%s\033[0m%n", "Displaying artists...");
        System.out.println(set);
    }
}
