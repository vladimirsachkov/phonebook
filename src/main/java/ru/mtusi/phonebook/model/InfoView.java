package ru.mtusi.phonebook.model;

public class InfoView {
    public String h2;
    public String submit;

    public InfoView(String h2, String submit) {
        this.h2 = h2;
        this.submit = submit;
    }

    public String getH2() {
        return h2;
    }

    public void setH2(String h2) {
        this.h2 = h2;
    }

    public String getSubmit() {
        return submit;
    }

    public void setSubmit(String submit) {
        this.submit = submit;
    }

    @Override
    public String toString() {
        return "InfoView{" +
                "h2='" + h2 + '\'' +
                ", submit='" + submit + '\'' +
                '}';
    }
}
