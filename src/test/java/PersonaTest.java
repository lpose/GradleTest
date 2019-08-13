

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class PersonaTest {
    
    @Test
    public void crearPersona(){
        Persona personita = new Persona(40);
        Assertions.assertThat(personita).isNotNull();
    }
}
