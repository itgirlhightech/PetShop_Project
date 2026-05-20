
package util;
 
import model.Reserva;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
 
public class HistoricoCSV {
 
    private static final String CABECALHO = "Nome,Porte,Diaria,Banho,Medicamento,Total";
 
    public static void salvarHistorico(List<Reserva> reservas, String caminhoArquivo) {
        try (FileWriter writer = new FileWriter(caminhoArquivo)) {
            writer.write(CABECALHO + "\n");
 
            for (Reserva r : reservas) {
                writer.write(r.exportarCSV() + "\n");
            }
 
            System.out.println("Histórico salvo em: " + caminhoArquivo);
 
        } catch (IOException e) {
            System.err.println("Erro ao salvar histórico: " + e.getMessage());
        }
    }
}
 