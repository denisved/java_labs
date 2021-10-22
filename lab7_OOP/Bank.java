package iot.banks;

public class Bank {

    public static final int DATE_OF_FOUNDATION = 2010;

    private String name;

    private String type;

    private int clientNumber;

    private int creditNumber;

    private int publicFinance;

    private int privateFinance;

    private int income;

    private int cost;

    protected String country;

    protected int marketCapitalization;

    public Bank(String name, String type, int clientNumber, int creditNumber, int publicFinance, int privateFinance,
                int income, int cost, String country, int marketCapitalization) {
        this.name = name;
        this.type = type;
        this.clientNumber = clientNumber;
        this.creditNumber = creditNumber;
        this.publicFinance = publicFinance;
        this.privateFinance = privateFinance;
        this.income = income;
        this.cost = cost;
        this.country = country;
        this.marketCapitalization = marketCapitalization;
    }

    public Bank(String name, String type, int clientNumber, int creditNumber) {
        this(name, type, clientNumber, creditNumber, 0, 0, 0, 0, null, 0);
    }

    public Bank() {

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getClientNumber() {
        return clientNumber;
    }

    public void setClientNumber(int clientNumber) {
        this.clientNumber = clientNumber;
    }

    public int getCreditNumber() {
        return creditNumber;
    }

    public void setCreditNumber(int creditNumber) {
        this.creditNumber = creditNumber;
    }

    public int getPublicFinance() {
        return publicFinance;
    }

    public void setPublicFinance(int publicFinance) {
        this.publicFinance = publicFinance;
    }

    public int getPrivateFinance() {
        return privateFinance;
    }

    public void setPrivateFinance(int privateFinance) {
        this.privateFinance = privateFinance;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", clientNumber=" + clientNumber +
                ", creditNumber=" + creditNumber +
                ", publicFinance=" + publicFinance +
                ", privateFinance=" + privateFinance +
                ", income=" + income +
                ", cost=" + cost +
                ", country='" + country + '\'' +
                ", marketCapitalization=" + marketCapitalization +
                '}';
    }

    public static void printStaticDateOfFoundation() {
        System.out.println(DATE_OF_FOUNDATION);
    }

    public void resetValues(String name, String type, int clientNumber, int creditNumber, int publicFinance,
                            int privateFinance, int income, int cost, String country, int marketCapitalization) {
        this.name = name;
        this.type = type;
        this.clientNumber = clientNumber;
        this.creditNumber = creditNumber;
        this.publicFinance = publicFinance;
        this.privateFinance = privateFinance;
        this.income = income;
        this.cost = cost;
        this.country = country;
        this.marketCapitalization = marketCapitalization;
    }





}
