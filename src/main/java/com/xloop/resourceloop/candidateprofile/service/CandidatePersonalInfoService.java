package com.xloop.resourceloop.candidateprofile.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xloop.resourceloop.candidateprofile.model.CandidateAcademicInfo;
import com.xloop.resourceloop.candidateprofile.model.CandidatePersonalInfo;
import com.xloop.resourceloop.candidateprofile.repository.ICandidatePersonalInfoRepository;

@Service
public class CandidatePersonalInfoService {
    @Autowired
    public ICandidatePersonalInfoRepository personalInfoRepo;

    public CandidatePersonalInfo createPersonalInformation(CandidatePersonalInfo personalInformation) {
        return personalInfoRepo.save(personalInformation);
    }

    public CandidatePersonalInfo getPersonalInformationById(Long id) {
        return personalInfoRepo.findById(id).orElse(null);
    }

    public List<CandidatePersonalInfo> getAllPersonalInformation(){
        return personalInfoRepo.findAll();
    }

    public CandidatePersonalInfo updatePersonalInformation(Long id, CandidatePersonalInfo personalInformation){
        Optional<CandidatePersonalInfo> personalInformationOptional = personalInfoRepo.findById(id);
        if(personalInformationOptional.isPresent()) {
            CandidatePersonalInfo existingPersonalInformation = personalInformationOptional.get();
            existingPersonalInformation.setFirstName(personalInformation.getFirstName());
            return existingPersonalInformation;
 
        }
        else {
            return null;
        }
    }
    public void deletePersonalInformation(Long id) {
        personalInfoRepo.deleteById(id);
    }
}
