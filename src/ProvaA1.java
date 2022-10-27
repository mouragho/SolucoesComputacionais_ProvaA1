//Programa de cálculo da quantidade ideal de água para ingestão diária, quantidade ingerida e necessária > Vide README.md
import java.util.Scanner; //Pacote importa (Habilita) o teclado
public class ProvaA1 {
    public static void main(String[] args) throws Exception {
        Scanner enterScanner = new Scanner(System.in); //Atribui o nome "enterScanner" à entrada do teclado
        System.out.println("Digite o seu nome:"); //Req01: Imprime na tela a mensagem
        String nome = enterScanner.next(); //Grava o valor digitado na variável "nome"
        System.out.println("Digite o seu peso atual em kg:"); //Req02: Imprime na tela a mensagem
        double peso = enterScanner.nextDouble(); //Grava o valor digitado na variável "peso"
        System.out.println("Digite a quantidade de água já ingerida hoje:"); //Req03: Imprime na tela a mensagem
        double consumo = enterScanner.nextDouble(); //Grava o valor digitado na variável "consumo"
        enterScanner.close(); //Encerra as entradas do teclado

        double ideal = (peso * 35)/1000; //Req04: Calcula a quantidade ideal de água a ingerir e aloca na variavel "ideal"
        double rounded = Math.ceil(ideal); //Req04: Arredonda a quantidade ideal de agua para cima
        double falta = rounded - consumo; //Req05: Calcula a quantidade de aguá que falta para atingir a meta e aloca na variável "falta"

        System.out.println("Nome: " + nome); //Req06: Imprime na tela a mensagem
        System.out.println("Peso: " + peso + "Kg"); //Req07: Imprime na tela a mensagem
        System.out.println("Quantidade de água ingerida: " + consumo + " litros"); //Req08: Imprime na tela a mensagem
        System.out.println("Quantidade ideal de água a ingerir por dia: " + rounded + " litros"); //Req09: Imprime na tela a mensagem      

        if (falta <= 0){ //Req10: Condiciona mensagem em caso de cumprimento da meta
            System.out.println("Parabéns, você atingiu a meta de hidratação diária!"); //Imprime na tela a mensagem 
        }
        else { //Req10: Condiciona mensagem em caso de não cumprimento da meta
            System.out.println("Continue focado em se hidratar por hoje, ainda faltam " + falta + " litros! Você consegue!"); //Imprime na tela a mensagem 
        }

    }
}