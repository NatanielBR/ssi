package br.com.natanielbr.ssi.interfaces;

import br.com.natanielbr.ssi.interfaces.objs.CapituloScan;
import br.com.natanielbr.ssi.interfaces.objs.MangaInfo;
import br.com.natanielbr.ssi.interfaces.objs.MangaScan;
import br.com.natanielbr.ssi.interfaces.utils.MangaScanIterator;

import java.io.Serializable;

public interface Scrapper extends Serializable {


	String[] findImageInChapter(CapituloScan capituloScan);

	MangaInfo findInfo(MangaScan manga);

	/**
	 * Metodo irá até a scan e obter uma lista de mangaScan
	 *
	 * @return Uma lista de mangaScan onde irá se atualizar até chegar ao fim na scan.
	 */
	MangaScanIterator listAllManga();

	 String getSourceName();
	 String getSourceURL();
}
