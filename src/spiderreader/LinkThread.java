/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spiderreader;

/**
 *
 * @author Luis
 */
public class LinkThread extends Thread{
    
    private String link;
    private String word;
    private long initialTime;

	// Constructor, getter & setter
    public LinkThread(String link, String word, long initialTime) {
        this.link = link;
        this.word = word;
        this.initialTime = initialTime;
    }
    
    @Override
    public void run() {

            /*
                String tipoEvento;
                String estadoSitio;
                String paginaVisitada;
                String tiempoCarga;
                Date timestamp
            */
            System.out.println("Procesando: " + this.link + " Empezando en: "
                                    +(System.currentTimeMillis() - this.initialTime) 
                                    + " miliseg");

            Spider spider = new Spider();
            long start = System.currentTimeMillis();
            
            spider.search(link, word,start);
            /*System.out.println("Paseo terminado en: "+(System.currentTimeMillis() - start) 
                                    + " miliseg");*/
            
            System.out.println("Se Termino de procesar " + this.link + " en el tiempo: " 
                                            + (System.currentTimeMillis() - this.initialTime)
                                            + " miliseg");
    }

}
