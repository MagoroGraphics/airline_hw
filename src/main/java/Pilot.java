public class Pilot {
    private String name;
    private Rank rank;
    private String licenseNum;

    public Pilot(String name, Rank rank, String licenseNum) {
        this.name = name;
        this.rank = rank;
        this.licenseNum = licenseNum;
    }

    public String getName() {
        return name;
    }

    public Rank getRank() {
        return rank;
    }

    public String getLicenseNum() {
        return licenseNum;
    }

    public String fly() {
        return getName() + " is flying the plane";
    }
}
