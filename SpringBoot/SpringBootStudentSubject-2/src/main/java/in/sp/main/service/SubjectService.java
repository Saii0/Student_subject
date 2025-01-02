package in.sp.main.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import in.sp.main.entity.Subject;

import in.sp.main.repository.SubjectRepository;

import java.util.List;

@Service
public class SubjectService {

    @Autowired
    private SubjectRepository subjectRepository;

    public List<Subject> getAllSubjects() {
        return subjectRepository.findAll();
    }

    public Subject createSubject(Subject subject) {
        return subjectRepository.save(subject);
    }

    public Subject getSubject(String code) {
        return subjectRepository.findById(code).orElse(null);

    }

    public Subject updateSubject(String code, Subject subject) {
        if(subjectRepository.existsById(code)) {
            subject.setCode(code);
            return subjectRepository.save(subject);
        }
        else {        	
        	return null;
        }
    }

    public void deleteSubject(String code) {
        subjectRepository.deleteById(code);
    }
}
