
public class arrayRandom {

  private int[] numeros = new int[40];
  private int longitudMax = 10;
  private int longitudMin = 1;

  public void generador() {
    for (int i = 0; i < numeros.length; i++) {
      numeros[i] = (int) (Math.random() * (longitudMax - longitudMin + 1) + longitudMin);
      System.out.println(numeros[i] + " ");
    }
  }
}
