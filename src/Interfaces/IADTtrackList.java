package Interfaces;

import Model.Songs;

public interface IADTtrackList
{
    /**
     * Adds song node to list
     * @param song  Songs
     */
    public abstract void addSong(Songs song);

    /**
     * Displays song as String
     * @param song  Songs
     */
    public abstract void displaySong(Songs song);

    /**
     * Searches for title in list
     * @param title     String
     * @return  Songs; current item if head is not null
     */
    public abstract Songs searchTitle(String title);

    /**
     * Searches for artist in list
     * @param artist    String
     * @return      Songs; current item if head is not null
     */
    public abstract Songs searchArtist(String artist);

    /**
     * Displays all songs of specific genre
     * @param genre String
     */
    public abstract void displayAllGenre(String genre);

    /**
     * Displays all songs in the list
     */
    public abstract void displayAllSongs();
}
