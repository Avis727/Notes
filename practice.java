enum Membership {
    REGULAR(10.0),
    STUDENT(8.0),
    SENIOR(5.50);

    private final double price;
    private Membership(double price){
        this.price = price;
    }

    public double getTicketPrice(){return price;}

    public static double calculateTotalPrice(int[] ticketCounts){
        return ticketCounts[0] * REGULAR.getTicketPrice() +
        ticketCounts[1] * STUDENT.getTicketPrice() +
        ticketCounts[2] * SENIOR.getTicketPrice();
    }
}