public class TestData {
    private String searchString;
    private Boolean expectedResult;

    public TestData() {

    }
    public TestData(String searchString, Boolean expectedResult) {
        this.searchString = searchString;
        this.expectedResult = expectedResult;
    }

    public String getSearchString() {
        return searchString;
    }

    public void setSearchString(String searchString) {
        this.searchString = searchString;
    }

    public Boolean getExpectedResult() {
        return expectedResult;
    }

    public void setExpectedResult(Boolean expectedResult) {
        this.expectedResult = expectedResult;
    }
}
