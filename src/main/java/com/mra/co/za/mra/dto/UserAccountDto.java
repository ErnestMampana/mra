package com.mra.co.za.mra.dto;

import com.mra.co.za.mra.enums.Roles;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserAccountDto {
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String cellphoneNumber;
    private String address;
    private Roles role;
}
