/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spiderreader;

import java.util.Date;

/**
 *
 * @author programador1
 */
public class Bitacora {
    private String tipoEvento;
    private String estadoSitio;
    private String paginaVisitada;
    private String tiempoCarga;
    private Date timestamp;
    
    public Bitacora(String tipoEvento, String estadoSitio, String paginaVisitada, String tiempoCarga, Date timestamp) {
        this.tipoEvento = tipoEvento;
        this.estadoSitio = estadoSitio;
        this.paginaVisitada = paginaVisitada;
        this.tiempoCarga = tiempoCarga;
        this.timestamp = timestamp;
    }
    
    
    
}