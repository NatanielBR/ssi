package br.com.natanielbr.ssi.interfaces.utils;

import br.com.natanielbr.ssi.interfaces.objs.MangaScan;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Iterator;
import java.util.function.Function;

@Getter
@RequiredArgsConstructor
public class MangaScanIterator implements Iterator<MangaScan>, Serializable {
	@NonNull
	private Iterator<MangaScan> baseIterator;
	@Setter
	private boolean autoUpdate;
	@NonNull
	private int page;
	@Setter
	private Function<Integer, Iterator<MangaScan>> nextPageUpdate;


	@Override
	public boolean hasNext() {
		boolean hasNext = baseIterator.hasNext();
		if (!hasNext && autoUpdate){
			baseIterator = nextPageUpdate.apply(page);
			page++;

			hasNext = baseIterator.hasNext();
			if (!hasNext){
				autoUpdate = false;
			}
		}
		return hasNext;
	}

	@Override
	public MangaScan next() {
		return baseIterator.next();
	}

	@Override
	public void remove() {
		baseIterator.remove();
	}
}
