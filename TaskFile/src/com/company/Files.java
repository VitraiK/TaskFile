package com.company;

public abstract class Files {
    protected Folder parentFolder;
    protected String name;

    public abstract int getSize();

    public String getPath() {
        String path = name;
        if (parentFolder != null) {
            path = parentFolder.getPath() + "/" + name;
        }
        return path;
    }
}
