/*
 * Dato.java
 *
 * Created on 2 de febrero de 2005, 05:07 PM
 * modificado el 2 de enero de 2011
 */
package aafr.int2svg.datos;

/**
 * Clase que abstrae la informacion de color y/o rango de una cierto alcance (Estado, Municipio y Localidad)
 * @author AAFR, GENEC, S.A. de C.V.
 */
public class Dato {

    /**
     * id de nivel1
     */
    public int nivel1_id;
    /**
     * id de nivel2
     */
    public int nivel2_id;
    /**
     *id de nivel3
     */
    public int nivel3_id;
    /**
     * id de nivel4
     */
    public int nivel4_id;
    /**
     * Valor del rango al que pertenece (el rango fija el color)
     */
    public int rango;
    /**
     * Radio del circulo en caso de que sea necesario pintar un objeto sobre la localidad 
     */
    public double radio;
    public double valor;
    public int marca;
    
    public Boolean bvalor_nd;
    
    
    public String sne;
    public String snr;
    public String snd;
    public String snm;
    public String snl;
    
    /**
     * Coordenada Este o longitud
     */
    public double este;
    /**
     * Coordenada Norte o latitud
     */
    public double norte;
    
    
    public String srotulo;
    public String srotulo1;
    public String srotulo2;
    
    /**
     * Id de identificacion puede ser alfanumerico 
     */
    public String sid;

    /**
     * 
     * @param ce
     * @param cm
     * @param cl
     * @param valor
     * @param marca
     */
    public Dato(int ce, int cm, int cl, double valor, int marca) {
        nivel1_id = ce;
        nivel2_id = cm;
        nivel3_id = cl;
        this.valor = valor;
        this.marca = marca;
        rango = marca;
        this.bvalor_nd=false;
    }

    /**
     * Constructor de puntos coordenados para pintar mapa de concentraciones
     * 
     * @param este
     * @param norte
     * @param valor
     * @param marca 
     */
    public Dato(double este, double norte, double valor, int marca) {
        this.este = este;
        this.norte = norte;
        this.valor = valor;
        this.marca = marca;
        rango=marca;
    }
    
    /**
     * 
     * @param sid
     * @param valor
     * @param marca 
     */
    public Dato(String sid, double valor, int marca){
       this.sid=sid;
        this.valor = valor;
        this.marca = marca;
        rango=marca;
        this.bvalor_nd=false;
    }
    
    
    @Override
    public String toString(){
        return new String(this.sid+"|"+this.valor+"|"+this.marca+"|"+this.bvalor_nd);
    }
}
