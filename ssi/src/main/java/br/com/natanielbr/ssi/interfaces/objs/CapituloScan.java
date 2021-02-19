package br.com.natanielbr.ssi.interfaces.objs;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class CapituloScan implements Serializable {
	private String nome;
	private String url;
}
