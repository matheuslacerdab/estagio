public class Teste
{
  public Teste() {}
  
  public static void main(String[] args)
  {
    Pessoa p1 = new Pessoa();
    Pessoa p2 = new Pessoa();
    Carro c1 = new Carro();
    Carro c2 = new Carro();
    
    p1.setNome("Matheus");
    p1.setHabilitado(true);
    
    p2.setNome("José");
    p2.setHabilitado(false);
    
    c1.entrarCarro(p1);
    c1.ligarCarro(p1);
    c1.dirigirCarro(p1);
    
    c2.ligarCarro(p2);
    c2.entrarCarro(p2);
    c2.ligarCarro(p2);
    c2.dirigirCarro(p2);
  }
}
