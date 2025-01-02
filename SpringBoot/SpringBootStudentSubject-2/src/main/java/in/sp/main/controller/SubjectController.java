package in.sp.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import in.sp.main.entity.Subject;
import in.sp.main.service.SubjectService;

import java.util.List;

@RestController
@RequestMapping("/subjects")
public class SubjectController {

    @Autowired
    private SubjectService subjectService;

    @GetMapping
    public List<Subject> getAllSubjects() {
        return subjectService.getAllSubjects();
    }

    @PostMapping
    public Subject createSubject(@RequestBody Subject subject) {
        return subjectService.createSubject(subject);
    }

    @GetMapping("/{code}")
    public Subject getSubject(@PathVariable String code) {
        return subjectService.getSubject(code);
    }

    @PutMapping("/{code}")
    public Subject updateSubject(@PathVariable String code, @RequestBody Subject subject) {
        return subjectService.updateSubject(code, subject);
    }

    @DeleteMapping("/{code}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteSubject(@PathVariable String code) {
        subjectService.deleteSubject(code);
    }
}

