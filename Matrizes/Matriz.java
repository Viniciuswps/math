import java.util.Arrays;

/**
 * Representa uma matriz.
 * 
 * @author Vinicius Barbosa.
 *
 */
public class Matriz {
	/**
	 * Nome da matriz.
	 */
	private String nome;

	/**
	 * Número de linhas da matriz.
	 */
	private int numeroLinhas;

	/**
	 * Número de colunas da matriz.
	 */
	private int numeroColunas;

	/**
	 * Array que representa a matriz.
	 */
	int[][] matriz;

	/**
	 * Constrói uma Matriz a partir da quantidade de linhas e colunas.
	 * 
	 * @param numeroLinhas
	 *            numero de linhas.
	 * @param numeroColunas
	 *            numero de colunas.
	 */
	public Matriz(int numeroLinhas, int numeroColunas, String nome) {
		if (numeroLinhas < 0) {
			throw new IllegalArgumentException("numero de linhas negativo.");
		}
		if (numeroColunas < 0) {
			throw new IllegalArgumentException("numero de colunas negativo.");
		}
		this.nome = nome;
		this.numeroLinhas = numeroLinhas;
		this.numeroColunas = numeroColunas;
		this.matriz = new int[numeroLinhas][numeroColunas];
	}

	/**
	 * Constrói uma matriz recebendo como parâmetro um representação de matriz.
	 * 
	 * @param matriz
	 *            array que representa a matriz.
	 * @param nome
	 *            nome da matriz.
	 */
	public Matriz(int[][] matriz, String nome) {
		this.matriz = matriz;
		this.nome = nome;
		this.numeroLinhas = matriz.length;
		this.numeroColunas = matriz[0].length;
	}

	/**
	 * retorna a quantidade de linhas da martiz.
	 * 
	 * @return qtd linhas.
	 */
	public int getNumeroLinhas() {
		return numeroLinhas;
	}

	/**
	 * retorna a quantidade de colunas da martiz.
	 * 
	 * @return qtd colunas.
	 */
	public int getNumeroColunas() {
		return numeroColunas;
	}

	/**
	 * Retorna o vetor que representa a matriz.
	 * 
	 * @return
	 */
	public int[][] getMatriz() {
		return matriz;
	}

	/**
	 * Altera o vetor que representa a matriz.
	 * 
	 * @param matriz
	 *            nova representação da matriz.
	 */
	public void setMatriz(int[][] matriz) {
		this.matriz = matriz;
	}

	/**
	 * Sobrescreve o método toString().
	 */
	@Override
	public String toString() {
		String msg = this.nome + ": " + System.lineSeparator();
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				msg += "| " + matriz[i][j] + " | ";
			}
			msg += System.lineSeparator();
		}
		return msg;
	}

	/**
	 * Hash Code
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.deepHashCode(matriz);
		return result;
	}

	/**
	 * Verifica se duas matrizes são iguais através do array que o representam.
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Matriz other = (Matriz) obj;
		if (!Arrays.deepEquals(matriz, other.matriz))
			return false;
		return true;
	}
}
