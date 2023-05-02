package com.portfolio.molinarodrigo.Interface;

import com.portfolio.molinarodrigo.Entity.Persona;
import java.util.List;

public interface IPersonaService {
    //Traer una persona
    public List<Persona> getPersona();
    
    //Guardar un obj de tipo persona 
    public void savePersona(Persona persona);
    
    //Eliminar un obj buscado por ID
    public void deletePersona(Long id);
    
    //Buscar un obj por ID
    public Persona findPersona(Long id);
}
