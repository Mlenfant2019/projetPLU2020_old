/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetplu2020;

/**
 *
 * @author maxim
 */
public class Point2D {
    public int x;
    public int y;
    public Point2D(int x,int y){
        this.x = x;
        this.y = y;
    }
    public Point2D(){
        this.x = 0;
        this.y = 0;
    }
    public Point2D(Point2D p){
        this.x = p.getX();
        this.y = p.getY();
    }
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
}
