package application;

import boardgame.Board;
import boardgame.Position;
import org.w3c.dom.ls.LSOutput;

public class Program {
    public static void main(String[] args) {

        Position position = new Position(2,3);
        System.out.println(position);
        Board board =  new Board(8,8);


    }

}
