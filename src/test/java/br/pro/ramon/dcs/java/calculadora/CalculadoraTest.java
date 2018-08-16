package br.pro.ramon.dcs.java.calculadora;

import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraTest {

    @Test
    public void testSoma() {
        String n1 = "10";
        String n2 = "20";
        String op = "+";

        CalculadoraProgram program = new CalculadoraProgram();
        String saida = program.calcula(n1, n2, op);

        assertThat(saida, is("30.0"));
    }

    @Test
    public void testSubtracao() {
        String n1 = "10";
        String n2 = "20";
        String op = "-";

        CalculadoraProgram program = new CalculadoraProgram();
        String saida = program.calcula(n1, n2, op);

        assertThat(saida, is("-10.0"));
    }

    @Test
    public void testMultiplicacao() {
        String n1 = "10";
        String n2 = "20";
        String op = "*";

        CalculadoraProgram program = new CalculadoraProgram();
        String saida = program.calcula(n1, n2, op);

        assertThat(saida, is("200.0"));
    }

    @Test
    public void testDivisao() {
        String n1 = "10";
        String n2 = "20";
        String op = "/";

        CalculadoraProgram program = new CalculadoraProgram();
        String saida = program.calcula(n1, n2, op);

        assertThat(saida, is("0.5"));
    }

}
