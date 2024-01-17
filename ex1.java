import javax.swing.JOptionPane;

public class ex1 {
    public static void main(String[] args) 
    { 
        final int n_lin = 4, n_col = 5;
        int l,c, par = 0, impar = 0, somaPar = 0, somaImpar = 0;
        int[][] matriz = new int[n_lin][n_col];

        // Recebendo os valores 
        for(l = 0; l < n_lin; l++) 
        {
            for(c = 0; c < n_col; c++)
            {
                matriz[l][c] = Integer.parseInt(JOptionPane.showInputDialog
                ("Digite o valor para gurdar na linha " + (l +1 ) + ", coluna " + (c + 1) + ": ")); // Recebendo os valores
            }
        }


        // N° / soma dos Pares e impares 
        for(l = 0; l < n_lin; l++) 
        {
            for(c = 0; c < n_col; c++) 
            {
                if(matriz[l][c] % 2 == 0) // Verificação de par
                {
                    if(matriz[l][c] == 0) // Vendo se o valor atual é 0
                    {}
                    else 
                    {
                        par++; // Calculando a quantidade de par 
                        somaPar += matriz[l][c]; // Calculando a soma dos pares
                    } 
                }
                else 
                {
                    impar++; // MESMA COISA NO ELSE DE CIMA 
                    somaImpar += matriz[l][c]; 
                }
            } 
        } 


        // Apresentando a matriz em forma de tabela
        for(l = 0; l < n_lin; l++) 
        {
            for(c = 0; c < n_col; c++) 
            {
                System.out.print(matriz[l][c] + " ");
            }

            System.out.print("\n"); // Quebrar uma linha a cada linha nova da tabela 
        }

        
        // Apresentando os dados adicionais 
        System.out.println("N° de pares: " + par); 
        System.out.println("N° de impares: " + impar);       
        System.out.println("Soma dos pares: " + somaPar);        
        System.out.println("Soma dos impares: " + somaImpar);        
        System.out.println("Média dos N° pares: " + somaPar / par);       
        System.out.println("Média dos N° impares: " + somaImpar / par);     

    }    
}
