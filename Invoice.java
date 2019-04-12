public class Invoice implements InvoiceInterface {
    private static final double tax = 0.07; // Sales tax
    private String date;
    private String name;
    private double total;
    private int card;
    private String id;
    private int[] tags;

    /**
     * Empty constructor for the invoice
     */
    public Invoice() {
        this.date = "XX/XX/XXXX";
        this.name = "";
    }

    /**
     * @param date  of purchase
     * @param name  of purchaser
     * @param total total of purchase
     */
    public Invoice(String date, String name, double total) {
        this.date = date;
        this.name = name;
        this.total = total;
        this.card = 0;
        this.tags = tags();
    }

    /**
     * @param date  of purchase
     * @param name  of purchaser
     * @param total total of purchase
     * @param card  used to make purchase
     */
    public Invoice(String date, String name, double total, int card) {
        this.date = date;
        this.name = name;
        this.total = total;
        this.card = card;
        this.tags = tags();
    }

    @Override
    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public void setCard(int card) {
        this.card = card;
    }

    @Override
    public String getDate() {
        return this.date;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getTotal() {
        return this.total;
    }

    @Override
    public int getCard() {
        try {
            return this.card;
        } catch (NullPointerException e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    public String getID() {
        if (this.id == null) {
            System.out.println(java.util.Arrays.toString(tags()));
            StringBuilder sb = new StringBuilder();
            for (String t : java.util.Arrays.toString(tags()).split(", "))
                sb.append(t);
            this.id = sb.toString();
            return this.id;
        } else return this.id;
    }

    @Override
    public int[] getTags() {
        return this.tags;
    }

    /**
     * @return tags to this invoice that allows this to be searched
     */
    private int[] tags() {
        return new int[]{this.date.hashCode(), this.name.hashCode(), ("" + this.total).hashCode(), ("" + this.card).hashCode()};
    }

    /**
     * @return Formatted invoice
     */
    @Override
    public String toString() {
        return String.format("%s\n%s\n%.2f\nXXXX-XXXX-XXXX-%d\n%s", this.date, this.name, this.total, this.card, this.id);
    }
}
