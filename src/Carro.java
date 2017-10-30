public class Carro { 
	
	private boolean entrar;
	private boolean ligar;
	private boolean dirigir;
  
  
  public void entrarCarro(Pessoa pessoa) { 
	setEntrar(true);
    System.out.println(pessoa.getNome() + " entrou no carro.");
  }
  
  public void ligarCarro(Pessoa pessoa) {
    if (isEntrar()) {
      setLigar(true);
      System.out.println(pessoa.getNome() + " ligou o carro.");
    } else {
      System.out.println("Primeiro deve entrar no carro.");
    }
  }
  
  public void dirigirCarro(Pessoa pessoa) {
    if ((pessoa.isHabilitado()) && (isLigar())) {
      System.out.println(pessoa.getNome() + " está digirindo o carro.");
    } else {
      System.out.println(pessoa.getNome() + " não pode dirigir pois não é habilitado.");
    }
  }
  
  public boolean isEntrar() {
    return entrar;
  }
  
  public void setEntrar(boolean entrar) {
    this.entrar = entrar;
  }
  
  public boolean isLigar() {
    return ligar;
  }
  
  public void setLigar(boolean ligar) {
    this.ligar = ligar;
  }
  
  public boolean isDirigir() {
    return dirigir;
  }
  
  public void setDirigir(boolean dirigir) {
    this.dirigir = dirigir;
  }
}
