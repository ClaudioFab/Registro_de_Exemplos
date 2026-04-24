
package exemplos_Tempo;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import javax.swing.JOptionPane;
public class exemplo_Tempo_DecimalFormat {
    public static void main(String[] args) {

        //import java.time.LocalDate;

        LocalDate dataAtual = LocalDate.now();

	int ano = dataAtual.getYear();       // Ano atual

        int mes = dataAtual.getMonthValue(); // Mês numérico (1-12)

        int dia = dataAtual.getDayOfMonth(); // Dia do mês (1-31)

        //import java.time.LocalDateTime;

	LocalDateTime agora = LocalDateTime.now();

        int hora = agora.getHour();          // Hora agora (1-59)

        int minuto = agora.getMinute();      // Minuto agora (1-59)

        int segundo = agora.getSecond();     // Segundo agora (1-59)

        //Exemplo:
                
	System.out.printf("Data: %02d/%02d/%d%n", dia, mes, ano);
        JOptionPane.showMessageDialog(null,"Data: "+dia+"/"+mes+"/"+ano);

        System.out.printf("Hora: %02d:%02d:%02d%n", hora, minuto, segundo);
        JOptionPane.showMessageDialog(null,"Hora: "+hora+":"+minuto+":"+segundo);

        

        String dataEntra = JOptionPane.showInputDialog(null,"DIA, MÊS e ANO (dd , mm , aaaa)");

        //Vetor que vai converter String para dias separados.
        //Vai anular o "," ao separar.
        String[] partes = dataEntra.split(",");
        
        int diaEntra = Integer.parseInt(partes[0]);
        int mesEntra = Integer.parseInt(partes[1]);
        int anoEntra = Integer.parseInt(partes[2]);
        
        //Converter para dataFutura para usar ChronoUnit.DAYS.between.
        LocalDate dataFutura = LocalDate.of(anoEntra, mesEntra, diaEntra);
        
        // Calcular diferença em dias(Requer LocalDate dataAtual = LocalDate.now(); acima)
        long diasResto = ChronoUnit.DAYS.between(dataAtual, dataFutura);

        
        
        
        
        
        
        
        
        
    }
    
}
