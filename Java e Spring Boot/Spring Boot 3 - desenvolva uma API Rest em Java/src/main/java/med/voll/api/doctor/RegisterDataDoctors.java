package med.voll.api.doctor;

import med.voll.api.address.AddressData;

public record RegisterDataDoctors(String name, String email, String crm, Specialty specialty, AddressData address) {

}
