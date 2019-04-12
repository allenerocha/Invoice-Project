public interface InvoiceInterface {
    /**
     * Sets the date of transaction
     *
     * @param date of the transaction
     */
    public void setDate(String date);

    /**
     * Sets the name of purchaser
     *
     * @param name Name of purchaser
     */
    public void setName(String name);

    /**
     * Purchase total
     *
     * @param total sets the total of the purchase
     */
    public void setTotal(double total);

    /**
     * Last 4 digits of the card used to make the purchase, if exists
     *
     * @param card sets the last 4 digits of the card if exists
     */
    public void setCard(int card);

    /**
     * @return the date of purchase
     */
    public String getDate();

    /**
     * @return the name of purchaser
     */
    public String getName();

    /**
     * @return the total of the purchase
     */
    public double getTotal();

    /**
     * @return card used to purchase, if it exists
     */
    public int getCard();

    /**
     * @return the identifying number to this purchase
     */
    public String getID();

    /**
     * @return the tags of this invoice
     */
    public int[] getTags();
}
