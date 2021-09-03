package com.shopping.mall.service.members;

import com.shopping.mall.domain.members.MembersRepository;
import com.shopping.mall.web.dto.MembersJoinRequestDto;
import com.shopping.mall.web.dto.MembersListResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class MembersService {

    private final MembersRepository membersRepository;

    @Transactional
    public Long join(MembersJoinRequestDto membersJoinRequestDto){
        return membersRepository.save(membersJoinRequestDto.toEntity()).getId();
    }

    @Transactional(readOnly = true)
    public List<MembersListResponseDto> findAllDesc(){
        return membersRepository.findAllDesc().stream()
                .map(MembersListResponseDto::new)
                .collect(Collectors.toList());
    }
}
