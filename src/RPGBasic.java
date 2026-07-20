public class RPGBasic {
    public static void main(String[] args) {
    //RPG virtual baseado em Stat Simulator,desenvolvido em Java,usando incremento e decremento.
        // Valores iniciais:
        int vida = 3;
        int pontuacao = 100;
        int level = 1;
        int moedas = 5;

        // O jogador perdeu 2 vidas (decremento duas vezes)
        vida--;
        vida--;

        // O jogador coletou 3 moedas (incremento três vezes)
        moedas++;
        moedas++;
        moedas++;

        // O jogador ganhou 1 vida (incremento uma vez)
        vida++;

        // O jogador avançou para o próximo nível (incremento uma vez)
        level++;

        // O jogador perdeu 4 moedas (decremento quatro vezes)
        moedas--;
        moedas--;
        moedas--;
        moedas--;

        // resultados finais:

        System.out.println("Vidas: " + vida);   // Resultado esperado: 2
        System.out.println("Pontuação: " + pontuacao); // Resultado esperado: 100 (não mudou nada)
        System.out.println("Nível: " + level);   // Resultado esperado: 2
        System.out.println("Moedas: " + moedas);  // Resultado esperado: 4
    }
}   