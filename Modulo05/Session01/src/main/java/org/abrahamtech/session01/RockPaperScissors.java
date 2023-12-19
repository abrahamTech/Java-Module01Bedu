package org.abrahamtech.session01;

import org.abrahamtech.session01.util.GameResult;
import org.abrahamtech.session01.util.PlayerInput;

import static org.abrahamtech.session01.util.GameResult.*;
import static org.abrahamtech.session01.util.PlayerInput.*;

public class RockPaperScissors {

    public static GameResult play(PlayerInput player1, PlayerInput player2) {
        
        if(player1 == player2) {
            return GameResult.TIE;
        }
        
        switch (player1) {
            case ROCK:
                return player2 == PlayerInput.SCISSORS ? GameResult.PLAYER_ONE_WINS : GameResult.PLAYER_TWO_WINS;
            
            case PAPER:
                return player2 == ROCK ? PLAYER_ONE_WINS : PLAYER_TWO_WINS;
            
            default:
                return player2 == PAPER ? PLAYER_ONE_WINS : PLAYER_TWO_WINS;
        }
    }
}
