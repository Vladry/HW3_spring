package com.homework3.DTO;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class listEmployerDto {

    private List<EmployerRequestDto> list;


}
