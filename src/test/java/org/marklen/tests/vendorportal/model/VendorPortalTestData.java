package org.marklen.tests.vendorportal.model;

public class VendorPortalTestData {
    private String username;
    private String password;
    private String monthlyEarning;
    private String annualEarning;
    private String profitMargin;
    private String availableInventory;
    private String searchKeyword;
    private int searchResultsCount;

    public VendorPortalTestData(String username, String password, String monthlyEarning,
                                String annualEarning, String profitMargin, String availableInventory,
                                String searchKeyword, int searchResultsCount) {
        this.username = username;
        this.password = password;
        this.monthlyEarning = monthlyEarning;
        this.annualEarning = annualEarning;
        this.profitMargin = profitMargin;
        this.availableInventory = availableInventory;
        this.searchKeyword = searchKeyword;
        this.searchResultsCount = searchResultsCount;
    }

    public VendorPortalTestData() {
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getMonthlyEarning() {
        return monthlyEarning;
    }

    public String getAnnualEarning() {
        return annualEarning;
    }

    public String getProfitMargin() {
        return profitMargin;
    }

    public String getAvailableInventory() {
        return availableInventory;
    }

    public String getSearchKeyword() {
        return searchKeyword;
    }

    public int getSearchResultsCount() {
        return searchResultsCount;
    }
}
