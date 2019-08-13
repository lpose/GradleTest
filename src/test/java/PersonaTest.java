

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class PersonaTest {
    
    @Test
    public void crearPersona(){
        Persona personita = new Persona(40);
        Assertions.assertThat(personita).isNotNull();
    }

    @Test
    public void MultiplicarPorDosLaEdad(){
        Persona personita = new Persona(40);
        personita.setEdad(personita.getEdad()*2);
        Assertions.assertThat(personita.getEdad()).isEqualTo(60);
    }
}
