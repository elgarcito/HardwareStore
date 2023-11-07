import java.time.LocalDate;

public interface StockChangeable extends Sellable,Available{
    default LocalDate transactionDate(){
        return LocalDate.now();
    }
}
