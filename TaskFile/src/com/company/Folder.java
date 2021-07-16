package com.company;

import java.util.ArrayList;

public class Folder extends Files {
    private final ArrayList<Files> data = new ArrayList<>();

    Folder(String name) {
        this.name = name;
    }

    public void addFile(Files file) {
        this.data.add(file);
        file.parentFolder = this;
    }

    @Override
    public int getSize() {
        int size = 0;
        for (Files files : data) {
            size += files.getSize();
        }
        return size;
    }

    @Override
    public String toString() {
        return "\nInformation about: " + name + "\nSize: " + getSize()
                + "\nNumber of files: "
                + this.data.size()
                + "\nPath: " + (parentFolder != null ? getPath() : "/" + name);
    }
}

