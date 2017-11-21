package kata4.view;

import java.util.List;
import kata4.model.Histogram;
import kata4.model.Mail;


public class MailHistogramBuilder {
    
    public static Histogram<String> build(List<Mail> mail) {
        Histogram<String> histogr= new Histogram<String>();
        for (Mail mail1 : mail) {
            histogr.increment(mail1.getDomain());
        }
        return histogr;
    }
}
