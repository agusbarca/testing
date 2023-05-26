package com.backend.service;

import com.backend.dao.impl.OdontologoDaoEnMemoria;
import com.backend.dao.impl.OdontologoDaoH2;
import com.backend.entity.Odontologo;
import org.junit.jupiter.api.Test;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;


import static org.junit.jupiter.api.Assertions.*;

class OdontologoServiceTest {
    private static Connection connection = null;
    private OdontologoService odontologoService = new OdontologoService(new OdontologoDaoH2());
    private OdontologoService odontologoService2 = new OdontologoService(new OdontologoDaoEnMemoria(new ArrayList<>()));

    @Test
    public void deberiaListarTodosLosPacientes(){
        List<Odontologo> odontologosTest = odontologoService.listarOdontologos();
        assertFalse(odontologosTest.isEmpty());
        assertTrue(odontologosTest.size() >= 2);
    }
}