package br.com.natanielbr.ssi.interfaces.objs;

import lombok.Data;

import java.io.Serializable;

@Data
public class MangaScan implements Serializable {

	private String title;
	private String image;
	private String url;
}
