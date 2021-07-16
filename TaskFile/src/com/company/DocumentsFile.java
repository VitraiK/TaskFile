package com.company;

public class DocumentsFile extends Files {
    private String enteringData;

    DocumentsFile(String name, String enteringData) {
        this.name = name;
        this.enteringData = enteringData;
    }

    @Override
    public int getSize() {
        return enteringData.length();
    }

    @Override
    public String toString() {
        return "\nInformation about: " + name + "\nSize: " + getSize() + "\nPath: " + getPath();
    }
}
