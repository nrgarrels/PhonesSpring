package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dmacc.beans.Phones;

public interface PhonesRepository extends JpaRepository<Phones, Long>{

}
