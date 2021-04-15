package com.thong.linkedmomo.service.Otp;

import com.thong.linkedmomo.entity.Otp;
import com.thong.linkedmomo.repository.OtpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OtpImpl implements OtpService{
    @Autowired
    OtpRepository otpRes;
    @Override
    public Otp findByCif(String cif) {
        Otp otp = otpRes.findByCif(cif);
        return otp;
    }
}
