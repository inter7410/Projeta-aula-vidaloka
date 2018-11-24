/*
* Neste exemplo utilizei uma matriz para 'simular' uma tabela de banco.
* Como ainda estamos trabalhando com Arrays, precisamos informar o tamanho da matriz.
* A variável 'numColunas' vai representar os a quantidade de campos da nossa matriz 'tabela'.
* Uma tabela 'pessoa', por exemplo, teria campos como: 'nome', 'email, 'dt_nasc', portanto 3 colunas da matriz.
* A varíavel 'numLinhas' da mesma forma, representa a quantidade de registros que podemos inserir.
* O tamanho das matrizes vai variar, portanto, de acordo com a 'tabela/entidade';
* Vai da lógica e da implementação que vocês fizerem, tratar o tamanho da matriz,
* de forma fixa ou solicitando para o usuário..
* Também podemos utilizar o índice/posição da linha como se fosse o ID da tabela.
* Lembrem que em Arrays os índices começam em 0.
*2
* */



public class Igor {

    public static void main(String[] args) {

        int numLinhas = 10;
        int numColunas = 3;
        int linha;
      

        String[][] matrizTabela = new String[numLinhas][numColunas];

        /*
        * No menu temos a seguinte a lógica:
        * Mostra-se ao usuário um menu de opção em formato de texto;
        * Solicita-se ao usuário que informe uma das opções mostradas;
        * Tem-se um switch-case ou if-else de acordo com as opções;
        * Enquanto a opção informada não for a opção de saída, o laço continua,
        * ou seja, ficamos dentro do laço, mostrando as opções e solicitando a opção de entrada;
        * Tratei as opções com if/else. O equivalente usando switch/case está comentado no final do código;
        */

        int opcao = 0;
        do {
            System.out.println("Insira uma Opção: ");
            System.out.println("------------------------------");
            System.out.println("" +
                    "1 - Cadastrar pessoa(s)\n" +
                    "2 - Listar pessoas\n" +
                    "3 - Excluir Cadastro \n" +
                    "4 - Editar Cadastro \n" +
                    "9 - Sair do programa");
            System.out.println("------------------------------\n");

            opcao = Entrada.leiaInt();

            /*
             * É necessário manter controle do número de registros, pois não
             * podemos inserir nem imprimir uma quantidade de registros maior
             * do que a capadidade da matriz, caso contrário o tamanho da nossa
             * matriz é extrapolado e teremos erro na execução.
             *
             * O exemplo tem erros de lógica propositais,
             * tanto na inserção como na impressão;
             * testem o código, descubrem os erros, modifiquem,
             * alterem a lógica e o código, descubram como arrumar.
             *
             * Dica: utilizem contadores e condicionais;
             * Tentem fazer.. se tiverem dificuldade mandem email.
             */

            if (opcao == 1) {

                System.out.print("Quantidade: ");
                int qtde = Entrada.leiaInt();

                for (int i = 0; i < qtde; i++) {
                  
                    System.out.print("Nome: ");
                    matrizTabela[i][0] = Entrada.leiaString();
                    System.out.print("Email: ");
                    matrizTabela[i][1] = Entrada.leiaString();
                    System.out.print("Data de nascimento : ");
                    matrizTabela[i][2] = Entrada.leiaString();
                    System.out.println();
                    System.out.println("\nCadastro realizado com sucesso!\n");
                }
            }
            else
                if (opcao == 2) {

                String formato = "%-25s %35s %20s\n";
                System.out.printf(formato, "Nome do Cliente", "E-mail", "Data de Nascimento");

                for (int i = 0; i < numLinhas; i++)
                    System.out.format(formato, matrizTabela[i][0], matrizTabela[i][1], matrizTabela[i][2]);
                System.out.println();
            }
            else
                  
                if (opcao == 3) {
                System.out.println("Excluir cadastros");
                
               
                System.out.println("Qual a linha do cadastro deseja excluir?");
                
                
               linha = Entrada.leiaInt();
               
               if(linha >= 0){
               
               matrizTabela[linha][0] = null;
               matrizTabela[linha][1] = null;
               matrizTabela[linha][2] = null;              
               System.out.println("Cadastro apagados com sucesso");
               }               
            }
            else
                if (opcao == 4) {
                System.out.println("Editar os cadastros");
                System.out.println("Qual a linha que deseja Editar?");
                
                
               linha = Entrada.leiaInt();
               
               if(linha >= 0){
                    System.out.print("Nome: ");
                    matrizTabela[linha][0] = Entrada.leiaString();
                    System.out.print("Email: ");
                    matrizTabela[linha][1] = Entrada.leiaString();
                    System.out.print("Data de nascimento : ");
                    matrizTabela[linha][2] = Entrada.leiaString();
                    System.out.print("Cadastro editado com sucesso!");
                    System.out.println();
                   
               }
            }
            else
                if (opcao == 9) {
                System.out.println("Saindo...");
                System.exit(0);
            }
            else
                System.out.println("Opção incorreta, tente novamente.\n"); 
        }
        while (opcao != 9);
    }
}

// para usar as opções com switch case
// é só substituir pelos ifs
/*
switch (opcao) {
    case 1:
        System.out.print("Quantidade: ");
        qtde = Entrada.leiaInt();

        for (int i = 0; i < qtde; i++) {
        System.out.print("Nome: ");
        matrizTabela[i][0] = Entrada.leiaString();
        System.out.print("Email: ");
        matrizTabela[i][1] = Entrada.leiaString();
        System.out.print("Data de nascimento : ");
        matrizTabela[i][2] = Entrada.leiaString();
        System.out.println();
        System.out.println("\nCadastro realizado com sucesso!\n");
        }
        break;
    case 2:
        String formato = "%-25s %35s %20s\n";
        System.out.printf(formato, "nome", "email", "dt_nasc");

        for (int i = 0; i < numLinhas; i++)
        System.out.format(formato, matrizTabela[i][0], matrizTabela[i][1], matrizTabela[i][2]);
        System.out.println();
        break;
    case 9:
        System.out.println("Saindo...");
        System.exit(0);
        break;
    default:
        System.out.println("Opção incorreta. Escolha novamete");
        break;
}
*/