package ru.dinis.library.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.dinis.library.beans.Genre;
import ru.dinis.library.database.DBManager;

import java.io.Serializable;
import java.sql.*;
import java.util.ArrayList;
/**
 * class Genre controller.
 * User: Dinis Saetgareev (dinis0086@gmail.com)
 * Date: 26.11.17
 */
public class GenreController implements Serializable {
    /**
     * Logger.
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(GenreController.class);
    /**
     * list's genres.
     */
    private ArrayList<Genre> genreList;

    /**
     * constructor.
     */
    public GenreController() {
        fillGenresAll();
    }

    /**
     * fills genres.
     */
    public void fillGenresAll() {

        this.genreList = new ArrayList<>();

        Connection conn = null;
        Statement stm = null;
        ResultSet rs = null;
        try {
            conn = DBManager.getConnection();
            stm = conn.createStatement();
            rs = stm.executeQuery("SELECT * FROM genre ORDER BY name ");
            while (rs.next()) {
                Genre genre = new Genre();
                genre.setId(rs.getInt("id"));
                genre.setName(rs.getString("name"));
                this.genreList.add(genre);
            }
        } catch (SQLException e) {
            LOGGER.error(e.getMessage(), e);
        } finally {
            try {
                if (rs != null) {
                    conn.close();
                    stm.close();
                    rs.close();
                }
            } catch (SQLException e) {
                LOGGER.error(e.getMessage(), e);
            }
        }
    }

    /**
     * gets genre list.
     * @return genre list
     */
    public ArrayList<Genre> getGenreList() {
        return genreList;
    }

    /**
     * sets genre list.
     * @param genreList - genre list
     */
    public void setGenreList(ArrayList<Genre> genreList) {
        this.genreList = genreList;
    }
}
