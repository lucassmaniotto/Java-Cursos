package br.com.alura.escola.app.indicacao;

import br.com.alura.escola.domain.aluno.Aluno;

public interface EnviarEmailIndicacao {
	
	void enviarPara(Aluno indicado);

}
