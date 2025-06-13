package tst;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import app.IRPF;

public class CadastroRendimentosTest {

    private IRPF irpf;

    @Before
    public void setUp() {
        irpf = new IRPF();
    }
    @Test
    public void testCadastrarSalario() {
        irpf.cadastrarSalario(5000f);
        assertEquals(5000f, irpf.getTotalSalario(), 0);
    }

    @Test
    public void testCadastrarSalario2() {
        irpf.cadastrarSalario(6000f);
        assertEquals(6000f, irpf.getTotalSalario(), 0);
    }

    @Test
    public void testCadastrarSalario3() {
        irpf.cadastrarSalario(5000f);
        irpf.cadastrarSalario(6000f);
        assertEquals(11000f, irpf.getTotalSalario(), 0);
    }
}
