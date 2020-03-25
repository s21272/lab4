class Main {
    public static void main(String[] args) {
        User User1 = new User("Daria", "Ray", "email.email.com", "1029");
        User Guest1 = new User("email.email.com");
        User Guest2 = new User("email@lol.com");
        User UserFromGuest = new User(Guest1, "BigMac", "Hamburger", "87kdkfs39485");

        Product book = new Product("Leo Tolstoy", 5, 10,11);
        Product pen = new Product("Parker", 5, 10);
        book.setPrice(54);
        pen.setNumberOfItems(5);
    }
}