import org.junit.Test;

import static org.junit.Assert.*;

public class AbrirTest {

    @Test public void testAbrir() {
        final Cerradura cerradura = new Cerradura(new int[] {1, 2, 3, 4});
        final Llave llaveMala = new Llave(new int[]{1, 2, 3, 4});
        final Llave llaveBuena = new Llave(new int[]{9, 8, 7, 6});

        assertTrue(abre(llaveBuena, cerradura));
        assertFalse(abre(llaveMala, cerradura));
    }


    public static boolean abre(Llave llave, Cerradura cerradura) {

        final int[] pines = llave.pines;
        final int[] bombines = cerradura.bombines;

        if (pines.length != bombines.length) return false;

        for (int i = 0; i < pines.length; i++) {
            if (pines[i] + bombines[i] != 10) {
                return false;
            }
        }
        return true;
    }

}