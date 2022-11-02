package quotes;

import java.util.List;
import java.util.Random;

public class QuoteLib {
    Quote[] quotesAll;

    public QuoteLib(Quote[] quotesAll) {
        this.quotesAll = quotesAll;
    }

    public String displayQuote() {
        String str = "";
        Random rand = new Random();
        int ix = rand.nextInt(0, quotesAll.length);
        Quote randQuote = quotesAll[ix];
        String author = randQuote.author;
        String words = randQuote.text;
        str = words + " --" + author;
        return str;
    }


}
