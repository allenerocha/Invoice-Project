public interface InvoiceSearch {
    /**
     * @param d date of purchase
     * @param n name of purchaser
     * @return the invoice or null invoice
     */
    public Invoice searchTags(Invoice[] invoices, String d, String n);

    /**
     * @param d date of purchase
     * @param t total of the purchase
     * @return the invoice or null invoice
     */
    public Invoice searchTags(Invoice[] invoices, String d, double t);

    /**
     * @param d date of purchase
     * @param c last 4 digits of the card used for purchase
     * @return the invoice or null invoice
     */
    public Invoice searchTags(Invoice[] invoices, String d, int c);
}
