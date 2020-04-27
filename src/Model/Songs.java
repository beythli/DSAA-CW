package Model;

import java.util.Comparator;

public class Songs implements Comparable<Songs>
{
    private int trackID;
    private String title;
    private String artist;
    private int trackLength;
    private String composer;
    private String releaseDate;
    private String album;
    private String genre;


    private static int lastIdAssigned = 0;

    /**
     * Constructor when no values are being passed
     */
    public Songs()
    {
        this.trackID = ++lastIdAssigned;
        this.title = "title";
        this.artist = "artist";
        this.trackLength = 150;
        this.composer = "composer";
        this.releaseDate = "1970-04-20";
        this.album = "album";
        this.genre = "genre";

    }

    /**
     * Constructor for all info; if statement monitors trackID
     * @param trackID       ID of track; int
     * @param title         title of track; String
     * @param artist        artist of track; String
     * @param trackLength   length of track; int
     * @param composer      composer of track; String
     * @param releaseDate   release date of track; String
     * @param album         album name of track; String
     * @param genre         genre of track; String
     */
    public Songs(int trackID, String title, String artist, int trackLength, String composer, String releaseDate, String album, String genre) {
        this.trackID = trackID;
        this.title = title;
        this.artist = artist;
        this.trackLength = trackLength;
        this.composer = composer;
        this.releaseDate = releaseDate;
        this.album = album;
        this.genre = genre;

        if (lastIdAssigned < trackID)
        {
            lastIdAssigned = trackID;
        }
    }

    /**
     * Constructor for all info EXCEPT trackID; trackID is equal to ++lastIDassigned
     * @param title         title of track; String
     * @param artist        artist of track; String
     * @param trackLength   length of track; int
     * @param composer      composer of track; String
     * @param releaseDate   release date of track; String
     * @param album         album of track; String
     * @param genre         genre of track; String
     */
    public Songs(String title, String artist, int trackLength, String composer, String releaseDate, String album, String genre)
    {
        this.trackID = ++lastIdAssigned;
        this.title = title;
        this.artist = artist;
        this.trackLength = trackLength;
        this.composer = composer;
        this.releaseDate = releaseDate;
        this.album = album;
        this.genre = genre;
    }

    /**
     * Getter method for Track ID
     * @return  ID; type integer
     */
    public int getTrackID()
    {
        return trackID;
    }

    /**
     * Setter method for Track ID
     * @param trackID   integer
     */
    public void setTrackID(int trackID)
    {
        this.trackID = trackID;
    }

    /**
     * Getter method for Track Title
     * @return  title; type String
     */
    public String getTitle() {
        return title;
    }

    /**
     * Setter method for Track Title
     * @param title     String
     */
    public void setTitle(String title)
    {
        this.title = title;
    }

    /**
     * Getter method for Artist name
     * @return  artist; type String
     */
    public String getArtist()
    {
        return artist;
    }

    /**
     * Setter method for Artist name
     * @param artist    String
     */
    public void setArtist(String artist)
    {
        this.artist = artist;
    }

    /**
     * Getter method for Track Length
     * @return  trackLength; type integer
     */
    public int getTrackLength()
    {
        return trackLength;
    }

    /**
     * Setter method for Track Length
     * @param trackLength   integer
     */
    public void setTrackLength(int trackLength)
    {
        this.trackLength = trackLength;
    }

    /**
     * Getter method for Composer
     * @return  composer; type String
     */
    public String getComposer()
    {
        return composer;
    }

    /**
     * Setter method for Composer
     * @param composer  String
     */
    public void setComposer(String composer)
    {
        this.composer = composer;
    }

    /**
     * Getter method for Release Date
     * @return  releaseDate; type String
     */
    public String getReleaseDate()
    {
        return releaseDate;
    }

    /**
     * Setter method for Release Date
     * @param releaseDate   String
     */
    public void setReleaseDate(String releaseDate)
    {
        this.releaseDate = releaseDate;
    }

    /**
     * Getter method for Album
     * @return  album; type String
     */
    public String getAlbum()
    {
        return album;
    }

    /**
     * Setter method for Album
     * @param album     String
     */
    public void setAlbum(String album)
    {
        this.album = album;
    }

    /**
     * Getter method for Genre
     * @return  genre; type String
     */
    public String getGenre()
    {
        return genre;
    }

    /**
     * Setter method for Genre
     * @param genre     String
     */
    public void setGenre(String genre)
    {
        this.genre = genre;
    }

    /**
     * Method to compare SongIDs
     * @param song  Songs
     * @return      trackID - songID; type int
     */
    public int compareTo(Songs song)
    {
        int songID = ((Songs) song).getTrackID();

        return this.trackID - songID;
    }

    /**
     *Method to Compare songs' artist
     * @param s1    Songs
     * @param s2    Songs
     * @return      artist1 compared to artist2; type int
     */
    public static Comparator<Songs> SongNameComparator = new Comparator<Songs>()
    {
        @Override
        public int compare(Songs s1, Songs s2)
        {
            String artist1 = s1.getArtist();
            String artist2 = s2.getArtist();

            return artist1.compareTo(artist2);
        }
    };

    /**
     * Methods to convert to String
     * @return  data to String
     */
    @Override
    public String toString()
    {
        return "\nID is: " + getTrackID() +
        "\nTitle is: " + getTitle() +
        "\nArtist is: " + getArtist() +
        "\nLength is: " + getTrackLength()/60 + ":" + getTrackLength()%60 +
        "\nComposer is: " + getComposer() +
        "\nRelease date is: " + getReleaseDate() +
        "\nAlbum is: " + getAlbum() +
        "\nGenre is: " + getGenre();
    }

}
