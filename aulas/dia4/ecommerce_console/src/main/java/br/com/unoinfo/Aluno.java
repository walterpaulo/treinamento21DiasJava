package br.com.unoinfo;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
  // propriedades
  private List<Double> notas;
  private String nome;

  // método para ver o nome
  public String getNome() {
    return nome;
  }

  // método para alterar o nome
  public void setNome(String nome) {
    this.nome = nome;
  }

  public List<Double> getNotas() {
    if(this.notas == null)
      this.notas = new ArrayList<Double>();
    
    return notas;
  }

  public void setNotas(List<Double> notas) {
    this.notas = notas;
  }
  public String notasFormatada(){
    String notasSeparadaPorVirgula = "";
    for (Double nota : this.getNotas()) {
      notasSeparadaPorVirgula += nota +", ";
    }
    return notasSeparadaPorVirgula.substring(0, notasSeparadaPorVirgula.length() -1);
  }
  public String situacao(){
    if(this.media() >= 7) return "Aprovado";
    else if(this.media() >= 5 && this.media() <=6) return "Recuperação";
    else return "Reprovado";
  }

  public double media(){
    double calculoMedia = 0;
    for (Double nota : this.getNotas()) {
      calculoMedia += nota;
    }
    return calculoMedia / this.getNotas().size();
  }
  
}
