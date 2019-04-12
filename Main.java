/************************
 *
 * Created and maintained
 * by Allen Rocha
 * For more information
 * please visit:
 * https://github.com/allenerocha
 *
 * *********************/
public class Main implements InvoiceSearch {
    public static void main(String[] args) {
        Invoice[] invoices = new Invoice[]{new Invoice("10/21/1997", "Allen Rocha", 14.48, 1776),
                new Invoice("9/11/2001", "Osama Bin Laden", 20.01),
                new Invoice("7/4/1776", "George Washington", 17.76),
                new Invoice("12/25/2019", "Santa Claus", 12.25)};
        Main main = new Main();
        try {
            System.out.println(main.searchTags(invoices, "10/21/1997", 1776).toString());
            System.out.println("\n\n");
            System.out.println(main.searchTags(invoices, "10/21/1997", "Isaac Smith").toString());
        } catch (NullPointerException ignored) {
            System.out.println("Invoice does not exist.");
        }
    }

    @Override
    public Invoice searchTags(Invoice[] invoices, String d, String n) {
        for (Invoice invoice : invoices) {
            if (invoice.getTags()[0] == d.hashCode() && invoice.getTags()[1] == n.hashCode()) {
                return invoice;
            }
        }
        return null;
    }

    @Override
    public Invoice searchTags(Invoice[] invoices, String d, double t) {
        for (Invoice invoice : invoices) {
            if (invoice.getTags()[0] == d.hashCode() && invoice.getTags()[2] == ("" + t).hashCode()) {
                return invoice;
            }
        }
        return null;
    }

    @Override
    public Invoice searchTags(Invoice[] invoices, String d, int c) {
        for (Invoice invoice : invoices) {
            if (invoice.getTags()[0] == d.hashCode() && invoice.getTags()[3] == ("" + c).hashCode()) {
                return invoice;
            }
        }
        return null;
    }
}
