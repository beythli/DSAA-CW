package Tests;

import Model.Songs;
import Model.trackList;

public class TestPart2
{
    /**
     * Test Two
     */
    public void run()
    {
        System.out.format("\033[31m%s\033[0m%n", "Start of test 2...");

        Songs song1 = new Songs();
        Songs song2 = new Songs(2, "Runnin' Down a Dream", "Tom Petty", 261, "TP", "1989-07-29", "FMF", "classic rock" );
        Songs song3 = new Songs("Burning", "Whitest Boy Alive", 191, "WBA", "2006-06-21", "Dreams", "indie");
        Songs song4 = new Songs("Money", "Pink Floyd", 382, "PF", "1973-05-07", "DSOM", "rock");
        Songs song5 = new Songs("Float On", "Modest Mouse", 208, "MM", "2014-02-14", "10 Years Pure", "indie");

        trackList list = new trackList();


        list.addSong(song1);
        list.addSong(song2);
        list.addSong(song3);
        list.addSong(song4);
        list.addSong(song5);

        System.out.format("\033[36m%s\033[0m%n", "Testing method to display song in list; parameter given: 'song5'...");
        list.displaySong(song5);

        System.out.format("\n\033[36m%s\033[0m%n", "Testing method to search for song by title; parameter given: 'Money'...");
        System.out.println(list.searchTitle("Money").toString());

        System.out.format("\n\033[36m%s\033[0m%n", "Testing method to search for song by artist; parameter given: 'Tom Petty'...");
        System.out.println(list.searchArtist("Tom Petty").toString());

        System.out.format("\n\033[36m%s\033[0m%n", "Testing method to display songs by genre; parameter given: 'indie'...");
        list.displayAllGenre("indie");

        System.out.format("\n\033[36m%s\033[0m%n", "Testing method to display all songs...");
        list.displayAllSongs();

        System.out.format("\033[31m%s\033[0m%n", "End of test 2...\n");
    }
}
