package Controller;

import Model.Songs;
import Model.trackBST;
import Model.trackList;
import Trees.BinarySearchTree;

import java.util.List;
import java.util.Scanner;

public class Controller
{
    private trackList songList = new trackList();
    private trackBST songBST = new trackBST();

    private BinarySearchTree<Songs> bst;

    private final Scanner reader = new Scanner(System.in);

    /**
     * Runs Menu and operates with user input
     */
    public void run()
    {
        boolean quit = false;
        addData();
        bst = songBST.loadData("data.txt");

        do
        {
            char choice = displayMenu();
            switch (choice)
            {
                case 'A':
                    createSong();
                    break;
                case 'B':
                    titleSearch();
                    break;
                case 'C':
                    artistSearch();
                    break;
                case 'D':
                    songGenre();
                    break;
                case 'E':
                    songList.displayAllSongs();
                    break;
                case 'F':
                    songBST.displayOrdered(bst);
                    break;
                case 'G':
                    songBST.displayReversed(bst);
                    break;
                case 'H':
                    songBST.displayArtists(bst);
                    break;
                case 'I':
                    System.out.println("This application allows users to add songs to a list, search for songs " +
                                        "by title or artist, \ndisplay all songs in the list or those of a specific " +
                                        "genre, as well as display the songs \nin different orders or display all " +
                                        "artist names.\n");
                    break;
                case 'Q':
                    quit = true;
                    break;
            }
        } while (!quit);
    }

    /**
     * Adds song data to list
     */
    private void addData()
    {
        Songs song1 = new Songs();
        Songs song2 = new Songs(2, "Runnin' Down a Dream", "Tom Petty", 261, "TP", "1989-07-29", "FMF", "classic rock" );
        Songs song3 = new Songs("Burning", "Whitest Boy Alive", 191, "WBA", "2006-06-21", "Dreams", "indie");
        Songs song4 = new Songs("Money", "Pink Floyd", 382, "PF", "1973-05-07", "DSOM", "rock");
        Songs song5 = new Songs("Float On", "Modest Mouse", 208, "MM", "2014-02-14", "10 Years Pure", "indie");

        songList.addSong(song1);
        songList.addSong(song2);
        songList.addSong(song3);
        songList.addSong(song4);
        songList.addSong(song5);
    }

    /**
     * Displays menu choices and reads user input
     * @return  user input; type char
     */
    private char displayMenu()
    {
        System.out.format("\033[36m%s\033[0m%n", "User Menu:");

        System.out.println("A.  Create and add a song to the list");
        System.out.println("B.  Search for a song by title");
        System.out.println("C.  Search for a song by artist");
        System.out.println("D.  Display all the songs for a genre");
        System.out.println("E.  Display all the songs in the list");
        System.out.println("F.  Display all the songs in ascending order by artist");
        System.out.println("G.  Display all the songs in descending order by artist");
        System.out.println("H.  Display all artist names for all songs");
        System.out.println("I.  Need help?");
        System.out.println("Q.  Quit");

        return reader.nextLine().toUpperCase().charAt(0);
    }

    /**
     * Allows user to create song with all data fields, then adds song to the list
     */
    private void createSong()
    {
        int length;
        String title, artist, composer, date, album, genre;

        System.out.println("Enter song's title: ");
        title = reader.nextLine();

        System.out.println("Enter song's artist: ");
        artist = reader.nextLine();

        System.out.println("Enter song's length in format MM:SS: ");
        String[] numberString = reader.nextLine().split(":");
        length = Integer.parseInt(numberString[0])*60 + Integer.parseInt(numberString[1]);

        System.out.println("Enter song's composer: ");
        composer = reader.nextLine();

        System.out.println("Enter song's release date in format YYYY-MM-DD: ");
        date = reader.nextLine();

        System.out.println("Enter song's album: ");
        album = reader.nextLine();

        System.out.println("Enter song's genre: ");
        genre = reader.nextLine();

        Songs newSong = new Songs(title, artist, length, composer, date, album, genre);
        songList.addSong(newSong);
        System.out.println("You have created and added this song to the list: " + newSong.toString());
    }

    /**
     * Searches song list by track title and gives appropriate response
     */
    private void titleSearch()
    {
        Songs song = new Songs();

        System.out.println("Enter a song title: ");
        song = songList.searchTitle(reader.nextLine());

        if (song == null)
        {
            System.out.println("There is no song with this title in the list.");
        }
        else
        {
            System.out.println(song.toString());
        }
    }

    /**
     * Searches song list by track artist and gives appropriate response
     */
    private void artistSearch()
    {
        Songs song = new Songs();

        System.out.println("Enter a song's artist: ");
        song = songList.searchArtist(reader.nextLine());

        if (song == null)
        {
            System.out.println("There is no song by this artist in the list.");
        }
        else
        {
            System.out.println(song.toString());
        }
    }

    /**
     * Displays all songs with given genre
     */
    private void songGenre()
    {
        String genre;

        System.out.println("Enter a genre: ");
        genre = reader.nextLine();
        songList.displayAllGenre(genre);
    }
}
