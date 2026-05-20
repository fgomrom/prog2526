package prog.ud9.ejercicios;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class Ejercicio16 {

	public static void main(String[] args) {
		try {
			// === FASE 1: Inicializar el documento vacío ===
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document documento = builder.newDocument(); // Documento en blanco
			// === FASE 2: Construir el árbol de Nodos/Elementos ===

			// Crear el elemento raíz <videojuego>
			Element raiz = documento.createElement("videojuego");

			// Añadirlo al documento
			documento.appendChild(raiz);

			// Crear el elemento <pantalla>
			Element pantalla = documento.createElement("pantalla");

			// asignarle atributo
			pantalla.setAttribute("resolucion", "1920x1080");

			// asignarle el texto interno
			pantalla.setTextContent("true");

			raiz.appendChild(pantalla);

			// Crear el elemento audio
			Element audio = documento.createElement("audio");
			audio.setAttribute("volumen", "80");
			audio.setTextContent("false");
			raiz.appendChild(audio);

			// === FASE 3: El "Transformer" (Exportar memoria a archivo físico) ===
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();

			// Truco: Activar la indentación para que el XML no salga en una sola línea
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");

			// Definir el origen (nuestro árbol DOM) y el destino (el archivo de texto)
			DOMSource origen = new DOMSource(documento);
			StreamResult destino = new StreamResult(new File("juego_config.xml"));
			// TODO: Serializar utilizando el método transform del transformer
			transformer.transform(origen, destino);
			
			System.out.println("¡Archivo XML generado con éxito de manera estructurada!");

		} catch (ParserConfigurationException | TransformerException e) {
			e.printStackTrace();
		}
	}

}
