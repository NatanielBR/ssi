package br.com.natanielbr.ssi.interfaces;

import br.com.natanielbr.ssi.interfaces.objs.CapituloScan;
import br.com.natanielbr.ssi.interfaces.objs.MangaInfo;
import br.com.natanielbr.ssi.interfaces.objs.MangaScan;
import br.com.natanielbr.ssi.interfaces.utils.MangaScanIterator;
import okhttp3.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.io.Serializable;

public abstract class Scrapper implements Serializable {


	public abstract String[] findImageInChapter(CapituloScan capituloScan);

	public abstract MangaInfo findInfo(MangaScan manga);

	/**
	 * Metodo irá até a scan e obter uma lista de mangaScan
	 *
	 * @return Uma lista de mangaScan onde irá se atualizar até chegar ao fim na scan.
	 */
	public abstract MangaScanIterator listAllManga();

	public abstract String getSourceName();

	public abstract String getSourceURL();
}
