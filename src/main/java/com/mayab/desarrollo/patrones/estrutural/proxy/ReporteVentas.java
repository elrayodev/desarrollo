package com.mayab.desarrollo.patrones.estrutural.proxy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReporteVentas implements IReporte {
	
	private String archivo = "C:\\Users\\polo_\\Desktop\\ventas.txt";
		
	private File file = new File(archivo);
	
	private FileWriter fileWriter;
	private FileReader fileReader;
	private BufferedWriter bw;
	
	public ReporteVentas() throws IOException {
		
		if(!file.exists()) {
			file.createNewFile();
			System.out.println("El archivo no se encontraba en carpeta, creando archivo...");
		}
		
		this.fileWriter = new FileWriter(file, true);
		this.fileReader = new FileReader(file);
		
	}


	public void escribir(String data) throws IOException {
		try {
			fileWriter.write(data);
			fileWriter.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void leer() throws IOException {
		
		String strCurrentLine;
		BufferedReader br = new BufferedReader(fileReader);
		while((strCurrentLine = br.readLine()) != null) {
			System.out.println(strCurrentLine);
		} 
		br.close();
		
	}

}
