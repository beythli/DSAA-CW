package Model;

import Interfaces.IADTtrackList;

public class trackList implements IADTtrackList
{
    private Node<Songs> head = null;
    private Node<Songs> tail = null;
    private Node<Songs> curr = null;

    private int length = 0;

    /**
     * Creates the song list and links nodes using item and next
     * @param <Songs>   Node
     */
    public class Node<Songs>
    {
        public Songs item;

        public Node<Songs> next;

        Node(Songs item)
        {
            this.item = item;
            this.next = null;
        }
    }

    /**
     * Adds song to list based on status of tail
     * @param song  Songs
     */
    public void addSong(Songs song)
    {
        Node node = new Node(song);

        if (tail != null)
        {
            tail.next = node;
            tail = node;
            ++length;
        }
        else
        {
            head = tail = node;
            ++length;
        }
    }

    /**
     * Displays song as Strings
     * @param song  Songs
     */
    public void displaySong(Songs song)
    {
        System.out.println(song.toString());
    }

    /**
     * Searches list by song title using for cycle
     * @param title     String
     * @return          current item
     */
    public Songs searchTitle(String title)
    {
        if (head != null)
        {
            curr = head;

            for (int i = 1; i <= length; i++)
            {
                if (curr.item.getTitle().equals(title))
                {
                    return curr.item;
                }
                curr = curr.next;
            }
        }
        return null;
    }

    /**
     * Searches list by song artist using for cycle
     * @param artist     String
     * @return          current item
     */
    public Songs searchArtist(String artist)
    {
        if (head != null)
        {
            curr = head;

            for (int i = 1; i <= length; i++)
            {
                if (curr.item.getArtist().equals(artist))
                {
                    return curr.item;
                }
                curr = curr.next;
            }
        }
        return null;
    }

    /**
     * Displays alll songs of specific genre using for cycle, prints appropriate error message
     * @param genre     String
     */
    public void displayAllGenre(String genre)
    {
        if (head != null)
        {
            curr = head;

            for (int i = 1; i <= length; i++)
            {
                if (curr.item.getGenre().equals(genre))
                {
                    displaySong(curr.item);
                }
                curr = curr.next;
            }
        }
        else
        {
            System.out.println("There are no songs in the list.");
        }
    }

    /**
     * Displays all songs in the list using for cycle
     */
    public void displayAllSongs()
    {
        if (head != null)
        {
            curr = head;

            for (int i = 1; i <= length; i++)
            {
                displaySong(curr.item);
                curr = curr.next;
            }
        }
    }
}
