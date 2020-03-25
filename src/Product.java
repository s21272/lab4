class Product{
    private String Name;
    private int Price;
    private int ProductId;
    private int NumberOfItems;

    Product(String name, int price, int productId) {
        this.Name = name;
        this.Price = price;
        this.ProductId = productId;
        this.NumberOfItems = 0;
    }

    Product(String name, int price, int productId, int numberOfItems) {
        this.Name = name;
        this.Price = price;
        this.ProductId = productId;
        this.NumberOfItems = numberOfItems;
    }

    public void setPrice(int price) {
        this.Price = price;
    }

    public void setNumberOfItems(int numberOfItems) {
        this.NumberOfItems = numberOfItems;
    }

    public int getNumberOfItems() {
        return NumberOfItems;
    }

    public int getPrice() {
        return Price;
    }

    public int getProductId() {
        return ProductId;
    }

    public String getName() {
        return Name;
    }
}