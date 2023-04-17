package com.mra.co.za.mra.services;

import com.mra.co.za.mra.dto.UserAccountDto;
import com.mra.co.za.mra.models.UserAccount;
import com.mra.co.za.mra.repositories.UserAccountRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserAccountRepository userAccountRepository;
    ModelMapper modelMapper = new ModelMapper();

    public void userRegistration(UserAccountDto userAccountDto){

        UserAccount userAccount = modelMapper.map(userAccountDto,UserAccount.class);
        userAccountRepository.save(userAccount);

    }
}
