/*package co.com.ps.registro.controller;

import co.com.ps.registro.modelo.Registro;
import co.com.ps.registro.modelo.dto.ResponseErrorDTO;
import co.com.ps.registro.services.IRegistroService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/registro")
public class RegistroController {

    @Autowired
    IRegistroService iRegistroService;
    private static final Logger logger = LoggerFactory.getLogger(RegistroController.class);


    @GetMapping("/{id}")
    public ResponseEntity<Registro> consultar(@PathVariable("id") Long id) {
        Registro registro = new Registro();
        registro.setId(id);
        return ResponseEntity.ok(registro);
    }

    @PostMapping("/")
    public ResponseEntity<?> guardar(@RequestBody Registro registro) {
        try {
            Registro resultado=  iRegistroService.guardar(registro);
            logger.info(resultado+"");
            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(resultado);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ResponseErrorDTO(HttpStatus.BAD_REQUEST.toString(), e.getCause() + "", e.getMessage()));
        }

    }

    @PutMapping("/")
    public ResponseEntity<Registro> actualizar(@RequestBody Registro registro) {
        return ResponseEntity.ok(new Registro());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Registro> borrar(@PathVariable("id") Long id) {
        Registro registro = new Registro();
        registro.setId(id);
        return ResponseEntity.ok(registro);
    }

}*/