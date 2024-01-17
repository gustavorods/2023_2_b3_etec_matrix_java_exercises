// TEMP: como verificar se é um número quando chega para converter?

import javax.swing.JOptionPane;

public class ex3 {
    public static void main(String[] args) {   
        int row = 0, column, n_row = 2, n_column = 10, i = 1; 
        double balance;
        String[][] nameAndPrice = new String[n_row][n_column];
       
        // Recebendo nome e preço
        for(column = 0; column < n_column; column++) {
            // Recebendo nome na primeira linha
            nameAndPrice[row][column] = JOptionPane.showInputDialog("Digite o nome do " + (i++) + "° produto: ");

            // Recebendo o preço na segunda linha
            nameAndPrice[row + 1][column] = JOptionPane.showInputDialog("Digite o preço do " +  nameAndPrice[row][column] + ": " );
            row = 0;
        }
        
        // Recebendo saldo disponível
        balance = Integer.parseInt(JOptionPane.showInputDialog("Qual é seu saldo disponível: "));
        
        // Imprimindo a matriz
        for(column = 0; column < n_column; column++) {
            System.out.print("{" + nameAndPrice[row][column] + " - " + nameAndPrice[row + 1][column] + "}");
            row = 0;
        }
        
        System.out.println("\n");

        for(column = 0; column < n_column; column++) {
            // Converterdo a String de preço em double
            double price = Double.parseDouble(nameAndPrice[row + 1][column]);  
            row = 0;

            // Vendo se o preço atual é menos que o saldo disponível
            if(price <= balance) {
                System.out.println("Você pode comprar: " + nameAndPrice[row][column]);
            }
        }        
    }
}
