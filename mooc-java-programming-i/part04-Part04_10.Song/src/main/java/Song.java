/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chadsisk
 */
public class Song {

    private final String name;
    private final int length;

    public Song(String name, int length) {
        this.name = name;
        this.length = length;
    }

    public String name() {
        return this.name;
    }

    public int length() {
        return this.length;
    }
}
