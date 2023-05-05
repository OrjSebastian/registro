package co.com.ps.registro.services;

import co.com.ps.registro.modelo.Persona;
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
    @Override
    public Registro guardar(Registro registro) throws Exception {

        if (registro.getId() < 0) {
            throw new Exception("");
        }
        if (registro.getRegistro() == null || registro.getRegistro().equals("")) {
            throw new Exception("Ingrese la fecha del registro");
        }
        if ((registro.getPersona_id() == null) || registro.getPersona_id().equals("")) {
            throw new Exception("Ingrese un id valido");
        }

        System.out.println(registroRepository.findAll());

        return registroRepository.save(registro);
    }


    @Override
    public Registro consultar(Long id) throws Exception {

        if (id == null || id < 1) {
            throw new Exception("El id enviado no es valido");
        }

        Registro r = registroRepository.getOne(id);

        return r;
    }
}
