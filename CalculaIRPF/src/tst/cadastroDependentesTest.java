package tst;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import app.IRPF;


public class cadastroDependentesTest {

    private IRPF irpf;

    @Before
    public void setUp() {
        irpf = new IRPF();
    }

    @Test
    public void testCadastrarUmDependente() {
        irpf.cadastrarDependente("joao");
        assertEquals(189.59f, irpf.getDeducaoDependentes(), 0);
    }

    @Test
    public void testCadastrarDoisDependentes() {
        irpf.cadastrarDependente("joao");
        irpf.cadastrarDependente("maria");
        assertEquals(2 * 189.59f, irpf.getDeducaoDependentes(), 0);
    }

    @Test
    public void testCadastrartresDependentes() {
        irpf.cadastrarDependente("joao");
        irpf.cadastrarDependente("maria");
        irpf.cadastrarDependente("jose");
        assertEquals(3 * 189.59f, irpf.getDeducaoDependentes(), 0);
    }

    @Test
    public void testCadastrarCincoDependentes() {
        irpf.cadastrarDependente("joao");
        irpf.cadastrarDependente("maria");
        irpf.cadastrarDependente("jose");
        irpf.cadastrarDependente("Maria jose");
        irpf.cadastrarDependente("jose Maria");
        assertEquals(5 * 189.59f, irpf.getDeducaoDependentes(), 0);
    }

}