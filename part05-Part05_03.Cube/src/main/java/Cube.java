/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author plainsailing66
 */
public class Cube {
    private int edgeLength;
    
    public Cube(int num) {
        this.edgeLength = num;
    }
    
    public int volume() {
        return this.edgeLength*this.edgeLength*this.edgeLength;
    }
    
    public String toString() {
        return "The length of the edge is " + edgeLength + " and the volume " + this.volume();
    }
}
