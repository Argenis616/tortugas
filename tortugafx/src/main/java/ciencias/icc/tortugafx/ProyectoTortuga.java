/*
 * Código utilizado para el curso de Introducción a las Ciencias de la
 * Computación.
 *
 * Se permite utilizarlo de forma personal para fines didácticos, pero no está
 * permitido transferirlo.
 */
package ciencias.icc.tortugafx;

import java.util.logging.Level;
import java.util.logging.Logger;
import ciencias.icc.tortugafx.figuras.FunciónFigura;

import javafx.event.ActionEvent;
import javafx.scene.paint.Color;

/**
 * Controlador con funciones específicas para que la tortuga las ejecute.
 * @author blackzafiro
 */
public class ProyectoTortuga extends ControladorTortuga {
	
	private final static Logger LOGGER = Logger.getLogger("ciencias.icc.tortugafx.ProyectoTortuga");
	static { LOGGER.setLevel(Level.FINE); }
	
	/**
	 * Mueve a la tortuga activa en la dirección en la que está mirando.
	 * @param t No se usa, pero es requerido.
	 */
	@FunciónFigura(nombre = "Avanza")
	public void avanza(ActionEvent t) {
		LOGGER.log(Level.FINER, "Avanza ");
		Tortuga tortuga = dameTortugaActiva();
		tortuga.avanza(50);
	}
	
	/**
	 * Gira a la tortuga activa a la derecha.
	 * @param t No se usa, pero es requerido.
	 */
	@FunciónFigura(nombre = "Rota a la derecha")
	public void rotaDerecha(ActionEvent t) {
		LOGGER.log(Level.FINER, "Rota a la derecha ");
		Tortuga tortuga = dameTortugaActiva();
		tortuga.rota(-10);
	}
	
	/**
	 * Gira a la tortuga activa a la izquierda.
	 * @param t No se usa, pero es requerido.
	 */
	@FunciónFigura(nombre = "Rota a la izquierda")
	public void rotaIzquierda(ActionEvent t) {
		LOGGER.log(Level.FINER, "Rota a la izquierda ");
		Tortuga tortuga = dameTortugaActiva();
		tortuga.rota(10);
	}
	
	/**
	 * Levanta la pluma de la tortuga activa.
	 * @param t No se usa, pero es requerido.
	 */
	@FunciónFigura(nombre = "Levanta la pluma")
	public void levantaPluma(ActionEvent t) {
		LOGGER.log(Level.FINER, "Levanta la pluma");
		Tortuga tortuga = dameTortugaActiva();
		tortuga.plumaAbajo(false);
	}
	
	/**
	 * Baja la pluma de la tortuga activa.
	 * @param t No se usa, pero es requerido.
	 */
	@FunciónFigura(nombre = "Baja la pluma")
	public void bajaPluma(ActionEvent t) {
		LOGGER.log(Level.FINER, "Baja la pluma");
		Tortuga tortuga = dameTortugaActiva();
		tortuga.plumaAbajo(true);
	}
	
	/**
	 * Dibuja un triángulo con la tortuga activa a partir de la posición en la
	 * que se encuentre.
	 * @param t No se usa, pero es requerido.
	 */
	@FunciónFigura(nombre = "Triángulo")
	public void dibujaTriángulo(ActionEvent t) {
		Tortuga tortuga = dameTortugaActiva();
		
		// Uso de un ciclo para controlar la tortuga.
		for(int i = 0; i < 3; i++) {
			tortuga.avanza(100);
			tortuga.rota(-120);
		}
	}
	
	/**
	 * Dibuja un par de triángulos con la tortuga activa a partir de la posición
	 * en la que se encuentre.
	 * @param t No se usa, pero es requerido.
	 */
	@FunciónFigura(nombre = "Banderín")
	public void dibujaBanderín(ActionEvent t) {
		Tortuga tortuga = dameTortugaActiva();
		dibujaTriángulo(t);
		tortuga.rota(60);
		dibujaTriángulo(t);
		tortuga.rota(-60);    // Reacomoda a la tortuga en su posición inicial
	}
	
}
