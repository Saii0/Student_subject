package in.sp.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sp.main.entity.Subject;

public interface SubjectRepository extends JpaRepository<Subject,String> {
   
}

