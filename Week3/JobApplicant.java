public class JobApplicant {
    private String name;
    private String phoneNumber;
    private boolean wordProcess, spreadsheet, database, graphics;

    public JobApplicant(String name, String phoneNumber, boolean wordProcess, boolean spreadsheet, boolean database, boolean graphics) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.wordProcess = wordProcess;
        this.spreadsheet = spreadsheet;
        this.database = database;
        this.graphics = graphics;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public boolean canWordProcess() {
        return wordProcess;
    }

    public boolean canSpreadsheet() {
        return spreadsheet;
    }

    public boolean canDatabase() {
        return database;
    }

    public boolean canGraphics() {
        return graphics;
    }
}
