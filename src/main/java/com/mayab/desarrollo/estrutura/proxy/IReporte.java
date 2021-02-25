package com.mayab.desarrollo.estrutural.proxy;

import java.io.IOException;

public interface IReporte {
	
	void escribir(String data) throws IOException;
	void leer() throws IOException;

}
