import javax.swing.JOptionPane;

public class ex2 {
    public static void main(String[] args) {
        int n_col = 5, n_row = 3, sum = 0, row, column, i = 1;
        int[][] matriz = new int[n_row][n_col];

        // Recebendo os números 
        for(row = 0; row < n_row; row++) {
            for(column = 0; column < n_col; column++) {
                matriz[row][column] = Integer.parseInt(JOptionPane.showInputDialog(
                "Digite o " + (i++) + "° número da matriz: ")); 
            }
        }

        // Imprimindo a matriz 
        for(row = 0; row < n_row; row++) {
            for(column = 0; column < n_col; column++) {
                System.out.print(matriz[row][column] + " ");
                sum += matriz[row][column]; // Fazendo a soma da linha
            }
            System.out.print(" A soma dessa linha é: " + sum);
            sum = 0; // Zerando a soma para a próxima linha
            System.out.println("\n");
        }
    }
}
