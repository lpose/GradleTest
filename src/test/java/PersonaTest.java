

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class PersonaTest {
    
    @Test
    public void crearPersona(){
        Persona personita = new Persona(40);
        Assertions.assertThat(personita).isNotNull();
    }

    @Test
    public void multiplicarPorDosLaEdad(){
        Persona personita = new Persona(40);
        personita.setEdad(personita.getEdad()*2);
        Assertions.assertThat(personita.getEdad()).isEqualTo(80);
    }

    @Test
    public void sumarCincoALaEdad(){
        Persona personita = new Persona(40);
        personita.setEdad(personita.getEdad()+5);
        Assertions.assertThat(personita.getEdad()).isEqualTo(46);
    }
}
