public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = args.length > 0 ? Integer.parseInt(args[0]) : 2022;
        boolean incluidoNoPlano = args.length > 1 && Boolean.parseBoolean(args[1]);
        double notaDoFilme = 8.1;
        String tipoPlano = args.length > 2 ? args[2] : "plus";
        int anoAtual = java.time.Year.now().getValue();

        if (anoDeLancamento >= anoAtual) {
            System.out.println("Lançamento que os clientes estão curtindo!");
        } else {
            System.out.println("Filme retrô que vale a pena assistir!");
        }

        System.out.println("Nota do filme: " + notaDoFilme);

        if (incluidoNoPlano || tipoPlano.equalsIgnoreCase("plus")) {
            System.out.println("Filme liberado");
        } else {
            System.out.println("Deve pagar a locação");
        }
    }
}