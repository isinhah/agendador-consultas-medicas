package com.agendador.api_agendador.web.dto.patient;

import java.time.LocalDate;

public record PatientResponseDTO(
        Long id,
        String name,
        String cpf,
        String email,
        String phone,
        LocalDate birthDate,
        String role
) {
}
