
import com.mycompany.pruebaproyecto.PruebaProyecto;
import com.mycompany.pruebaproyecto.Proyecto;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Rafa
 */
public class TestProyecto {
    Proyecto p = new Proyecto();
    
    //Transferencia solo se puede completar si el monto es pisitivo y la clave de 8 digitos
    @Test//debe de fallar ya que la clave es menor a 8 digitos
    public void test1() {
        String esperado = "No se pudo completar la transferencia";
        String actual = p.Transferencia(5, 123456);
        assertEquals(esperado,actual);
    }
    
    @Test//debe de fallar ya que el monto es negativo
    public void test2(){
        String esperado = "No se pudo completar la transferencia";
        String actual = p.Transferencia(-5, 12345678);
        assertEquals(esperado,actual);
    }
    
    @Test//debe ser exitosa la transferencia
    public void test3(){
        String esperado = "Trensferencia completada";
        String actual = p.Transferencia(5, 12345678);
        assertEquals(esperado,actual);
    }
    
    @Test//Test para validar usuario y contraseña
    public void test4(){
        assertEquals("Nombre: Pedro Contraseña: Pedro111", p.NombreCliente("Pedro", "Pedro1111"));
    }
    
    @Test//Test para el NIP solo numeros
    public void test5(){
        assertEquals("NIP solo son numeros", p.NIP("rTOP"));
    }
    
    @Test//Test de NIP aceptado
    public void test6(){
        assertEquals("NIP aceptado", p.NIP("4589"));
    }
}