public class Library {
    private int libraryId;
    private String libraryName;
    private String established;
    private int totalBooks;
    private String address;

    public Library() {}

    public Library(int libraryId, String libraryName, String established, int totalBooks, String address) {
        this.libraryId = libraryId;
        this.libraryName = libraryName;
        this.established = established;
        this.totalBooks = totalBooks;
        this.address = address;
    }

    public Library(String libraryId, String libraryName, String established, String totalBooks, String address) {
        this.libraryId = Integer.parseInt(libraryId);
        this.libraryName = libraryName;
        this.established = established;
        this.totalBooks = Integer.parseInt(totalBooks);
        this.address = address;
    }

    public Library(String dataLine) {
        String[] data = dataLine.split(",");
        this.libraryId = Integer.parseInt(data[0]);
        this.libraryName = data[1];
        this.established = data[2];
        this.totalBooks = Integer.parseInt(data[3]);
        this.address = data[4];
    }

    public String toString() {
        return libraryId + "," + libraryName + "," + established + "," + totalBooks + "," + address + "\n";
    }

    public String showInfoGUI() {
        return "Library Name: " + libraryName + "\n" +
               "Library ID: " + libraryId + "\n" +
               "Established: " + established + "\n" +
               "Total Books: " + totalBooks + "\n" +
               "Address: " + address + "\n\n";
    }
}