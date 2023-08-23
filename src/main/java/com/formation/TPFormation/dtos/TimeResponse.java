package com.formation.TPFormation.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode
public class TimeResponse {
    private String date;
    private String hour;
    private String zone;
}
