package uz.pdp;

public record RecordClass(String name, String author, double priceBook) {

    public RecordClass {

        if (name == null || author == null) {
            throw new IllegalArgumentException("The field is null");
        } else if (name.isEmpty() || author.isEmpty()) {
            throw new IllegalArgumentException("The field is empty");
        } else if (priceBook < 0) {
            throw new IllegalArgumentException("Price Book can not be negative number");
        }

    }
}
