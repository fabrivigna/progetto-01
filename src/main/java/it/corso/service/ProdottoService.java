package it.corso.service;

import java.util.List;

import it.corso.model.Prodotto;

public interface ProdottoService {
	List<Prodotto> registraProdotti();
	Prodotto getProdotto(List<Prodotto> catalogo, int id);
}
