package com.thong.linkedmomo.service.Otp;

import com.thong.linkedmomo.entity.Otp;
import org.springframework.stereotype.Service;

@Service
public interface OtpService {
    Otp findByCif(String cif);
}
