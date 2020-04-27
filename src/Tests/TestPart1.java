package Tests;

import Model.Songs;

public class TestPart1
{
    /**
     * Test One
     */
    public void run()
    {
        System.out.format("\033[31m%s\033[0m%n", "\nStart of test 1...");
        Songs song1 = new Songs();
        Songs song2 = new Songs(2, "Runnin' Down a Dream", "Tom Petty", 261, "TP", "1989-07-29", "FMF", "classic rock" );
        Songs song3 = new Songs("Burning", "Whitest Boy Alive", 191, "WBA", "2006-06-21", "Dreams", "indie");

        System.out.format("\033[36m%s\033[0m%n", "Testing getter methods...");
        System.out.println(song3.getTrackID());
        System.out.println(song3.getTitle());
        System.out.println(song3.getArtist());
        System.out.println(song3.getTrackLength());
        System.out.println(song3.getComposer());
        System.out.println(song3.getReleaseDate());
        System.out.println(song3.getAlbum());
        System.out.println(song3.getGenre());


        System.out.format("\n\033[36m%s\033[0m%n", "Testing setter methods...");
        song3.setTrackID(12);
        song3.setTitle("Money");
        song3.setArtist("Pink Floyd");
        song3.setTrackLength(382);
        song3.setComposer("PF");
        song3.setReleaseDate("1973-05-07");
        song3.setAlbum("DSOM");
        song3.setGenre("rock");

        System.out.println("Was ID set correctly?           " + (song3.getTrackID() == 12));
        System.out.println("Was Title set correctly?        " + (song3.getTitle() == "Money"));
        System.out.println("Was Artist set correctly?       " + (song3.getArtist() == "Pink Floyd"));
        System.out.println("Was Track Length set correctly? " + (song3.getTrackLength() == 382));
        System.out.println("Was Composer set correctly?     " + (song3.getComposer() == "PF"));
        System.out.println("Was Release Date set correctly? " + (song3.getReleaseDate() == "1973-05-07"));
        System.out.println("Was Album set correctly?        " + (song3.getAlbum() == "DSOM"));
        System.out.println("Was Genre set correctly?        " + (song3.getGenre() == "rock"));

        System.out.format("\033[31m%s\033[0m%n", "End of test 1...\n");

    }

}
