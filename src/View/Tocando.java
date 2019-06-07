/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

/**
 *
 * @author franc
 */
public class Tocando extends Thread{
    public void sim(){
        
            try {
                InputStream input = this.getClass().getResourceAsStream("/Audios/sim.mp3");
                Player ply = new Player(input);
                ply.play();
            } catch (JavaLayerException ex) {
                Logger.getLogger(TelaJogo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        public void nao(){
        
            try {
                InputStream input = this.getClass().getResourceAsStream("/Audios/Não.mp3");
                Player ply = new Player(input);
                ply.play();
            } catch (JavaLayerException ex) {
                Logger.getLogger(TelaJogo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        public void espalhalixo(){
        
            try {
                InputStream input = this.getClass().getResourceAsStream("/Audios/EspalhaLixo.mp3");
                Player ply = new Player(input);
                ply.play();
            } catch (JavaLayerException ex) {
                Logger.getLogger(TelaJogo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        public void meany(){
        
            try {
                InputStream input = this.getClass().getResourceAsStream("/Audios/Meany Ranheta.mp3");
                Player ply = new Player(input);
                ply.play();
            } catch (JavaLayerException ex) {
                Logger.getLogger(TelaJogo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        public void PedePano(){
        
            try {
                InputStream input = this.getClass().getResourceAsStream("/Audios/pé de pano.mp3");
                Player ply = new Player(input);
                ply.play();
            } catch (JavaLayerException ex) {
                Logger.getLogger(TelaJogo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        public void PicaPau(){
        
            try {
                InputStream input = this.getClass().getResourceAsStream("/Audios/Risada do Pica Pau.mp3");
                Player ply = new Player(input);
                ply.play();
            } catch (JavaLayerException ex) {
                Logger.getLogger(TelaJogo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        public void ZecaUrubu(){
        
            try {
                InputStream input = this.getClass().getResourceAsStream("/Audios/ZecaUrubu.mp3");
                Player ply = new Player(input);
                ply.play();
            } catch (JavaLayerException ex) {
                Logger.getLogger(TelaJogo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        public void ZeJacare(){
        
            try {
                InputStream input = this.getClass().getResourceAsStream("/Audios/Zé Jacaré.mp3");
                Player ply = new Player(input);
                ply.play();
            } catch (JavaLayerException ex) {
                Logger.getLogger(TelaJogo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        public void Leoncio(){
        
            try {
                InputStream input = this.getClass().getResourceAsStream("/Audios/Leoncio.mp3");
                Player ply = new Player(input);
                ply.play();
            } catch (JavaLayerException ex) {
                Logger.getLogger(TelaJogo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

}
