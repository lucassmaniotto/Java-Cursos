package med.voll.api.doctor;

public record ListDataDoctors(String name, String email, String crm, Specialty specialty) {
    public ListDataDoctors(Doctor doctor) {
        this(doctor.getName(), doctor.getEmail(), doctor.getCrm(), doctor.getSpecialty());
    }
}
