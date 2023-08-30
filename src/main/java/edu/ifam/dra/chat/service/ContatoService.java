package edu.ifam.dra.chat.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import edu.ifam.dra.chat.model.Contato;

@Service
public class ContatoService {
	
	List<Contato> contatos = new ArrayList<>();

	public List<Contato> getContatos(){
		return contatos;
	}
	
	public Contato getContato(int id) {
		return contatos.get(id);
	}
	
	public Contato setContato(Contato contato) {
		contatos.add(contato);
		return contato;
	}
	
	public Contato setContato(int id, Contato contato) {
		contatos.set(id, contato);
		return contato;
	}
	
	public void deleteContato(int id) {
		contatos.remove(id);
	}
}
