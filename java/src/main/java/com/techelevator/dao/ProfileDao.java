package com.techelevator.dao;

import com.techelevator.exceptions.ProfileNotFoundException;
import com.techelevator.model.MemberProfile;

public interface ProfileDao {

    MemberProfile getProfileByUserId(Long userId) throws ProfileNotFoundException;

    MemberProfile getProfileByProfileId(Long profileId) throws ProfileNotFoundException;

    MemberProfile createProfile(MemberProfile profile);

    void updateProfile(MemberProfile profile) throws ProfileNotFoundException;

}
