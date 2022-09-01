package com.test.file;

enum OopsL{
    JAVA,
    PYTHON,
    CPP;
}
public class TestEnum {
    private OopsL lang;


    public TestEnum(OopsL lang) {
        this.lang = lang;
    }

    public OopsL getLang() {
        return lang;
    }

    public void setLang(OopsL lang) {
        this.lang = lang;
    }

    @Override
    public String toString() {
        return "TestEnum{" +
                  lang +
                '}';
    }

    public static void main(String[] args) {
        TestEnum testEnum = new TestEnum(OopsL.JAVA);
        System.out.println(testEnum);
        String[] arr = {"hello", "how are you"};
        for(String element: arr) {
            System.out.println(element);
        }
        for(OopsL lan: OopsL.values()) {
            System.out.println(lan);
        }
    }
}
