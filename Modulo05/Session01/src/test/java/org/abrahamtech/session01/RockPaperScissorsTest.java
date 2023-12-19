package org.abrahamtech.session01;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.abrahamtech.session01.util.GameResult;
import org.abrahamtech.session01.util.PlayerInput;
import org.junit.jupiter.api.Test;

//Pruebas utilizando "AAA" -> Arrange - Act - Assert
// Arrange  ->  Configuraciones previas / Precondiciones
// Act      ->  Ejecución a Probar
// Assert   ->  Verificación / Evaluación del resultado esperado

public class RockPaperScissorsTest {
    
    @Test
    public void tieCases() {

        //Arrange
        //En este ejemplo no hay precondiciones 
        //Si se pidiera el resultado por terminal (Scanner) tal vez una condicion sea que es resultado que ingresa el usuario si sea PAPER

        //Act
        //La ejecución del método "play" con parametros iguales
        GameResult result01 = RockPaperScissors.play(PlayerInput.PAPER, PlayerInput.PAPER);
        GameResult result02 = RockPaperScissors.play(PlayerInput.ROCK, PlayerInput.ROCK);
        GameResult result03 = RockPaperScissors.play(PlayerInput.SCISSORS, PlayerInput.SCISSORS);

        //Assert
        //Verificar que el resultado sea "TIE"
        assertEquals(result01, GameResult.TIE);
        assertEquals(result02, GameResult.TIE);
        assertEquals(result03, GameResult.TIE);

    }
}
