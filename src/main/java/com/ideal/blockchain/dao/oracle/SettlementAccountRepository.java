package com.ideal.blockchain.dao.oracle;

import com.ideal.blockchain.entity.saas.SettlementAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SettlementAccountRepository extends JpaRepository<SettlementAccount,String> {
}