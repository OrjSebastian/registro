/*package co.com.ps.registro.services;

import co.com.ps.registro.modelo.Registro;
import co.com.ps.registro.repository.RegistroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RegistroService implements  IRegistroService {

    @Autowired
    RegistroRepository registroRepository;

    @Transactional()
    public Registro guardar(Registro registro) throws Exception {

        if (registro.getId() < 0) {
            throw new Exception("");
        }
        if (registro.getRegistro() == null || registro.getRegistro().equals("")) {
            throw new Exception("Ingrese la fecha del registro");
        }
        /*if ((registro.getPersona_id() == null) || registro.getPersona_id().equals("")) {
            throw new Exception("Ingrese un id valido");
        }


        System.out.println(registroRepository.findAll());

        return  registroRepository.save(registro);
    }
}
*/