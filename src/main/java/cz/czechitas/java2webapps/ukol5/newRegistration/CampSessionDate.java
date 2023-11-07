package cz.czechitas.java2webapps.ukol5.newRegistration;

/*
This enum has been created for the purpose of storing camp session dates in a readable format.
This enum also serves as an entry point for potential future management of camp session dates.
Since dates are exclusively specified within this enum, they can be easily modified by editing the values listed below.
 */
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
