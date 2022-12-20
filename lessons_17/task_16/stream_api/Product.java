package lessons_17.task_16.stream_api;

import java.time.LocalDate;


public class Product {
    private long id;
    private ProductType type;
    private long prise;
    private long discount;
    private LocalDate createDate;


    public Product(long id, ProductType type, long prise, long discount, LocalDate createDate) {
        this.id = id;
        this.type = type;
        this.prise = prise;
        this.discount = discount;
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        StringBuilder value = new StringBuilder("{ type:" + this.getType());
        if (prise != 0) value.append(" prise:").append(this.prise);
        if (discount != 0) value.append(" discount: ").append(this.discount);
        if (createDate != null) value.append(" createDate: ").append(this.createDate);
        if (id != 0) value.append(" id: ").append(this.id);
        return value.toString();
    }

    public void setType(ProductType type) {
        this.type = type;
    }

    public void setPrise(long prise) {
        this.prise = prise;
    }

    public ProductType getType() {
        return type;
    }

    public long getPrise() {
        return prise;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getDiscount() {
        return discount;
    }

    public void setDiscount(long discount) {
        this.discount = discount;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }
}
