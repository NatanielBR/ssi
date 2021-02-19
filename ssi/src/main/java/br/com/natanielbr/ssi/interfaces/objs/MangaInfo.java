package br.com.natanielbr.ssi.interfaces.objs;

import lombok.Data;

import java.io.Serializable;

@Data
public class MangaInfo implements Serializable {
	private MangaScan manga;

	private String[] generos;
	private String sinopse;
	private CapituloScan[] capitulosURL;
}
