package com.example.tictactoe.Models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Game {
    private Board board;
    private List<List<Player>> players;
//    private List<List<Move>> moves; Already in Board
    private EGameStack gameStack;
    //winner?
    //current index?

}
