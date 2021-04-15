package com.thong.linkedmomo.repository;

import com.thong.linkedmomo.entity.Otp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OtpRepository extends JpaRepository<Otp, Integer> {
    Otp findByCif(String cif);
}
