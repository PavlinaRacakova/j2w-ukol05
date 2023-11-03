package cz.czechitas.java2webapps.ukol5.newRegistration;

public enum CampSessionDate {

    JULY5TO11("July 5th - 11th"),
    JULY12TO18("July 12th - 18th"),
    AUGUST2TO10("August 2nd - 10th");

    private final String campSessionDateInReadableForm;

    CampSessionDate(String campSessionDateInReadableForm) {
        this.campSessionDateInReadableForm = campSessionDateInReadableForm;
    }

    public String getCampSessionDateInReadableForm() {
        return campSessionDateInReadableForm;
    }
}
