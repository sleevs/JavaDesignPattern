package br.com.jsn.jsnobserver;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.jsn.jsnobserver.dto.JobDTO;
import br.com.jsn.jsnobserver.dto.ProfessionalDTO;
import br.com.jsn.jsnobserver.job.observer.JobObserver;
import br.com.jsn.jsnobserver.job.observer.JobSubject;


class JsnObserverApplicationTests {



	   @Test
        @DisplayName("Should not be null")
        void createJobProcess() {
			JobDTO job = new JobDTO("Construction Worker", "Followed blueprints and plans to complete construction projects on time and under budget.");

			ProfessionalDTO professionalDTO = new ProfessionalDTO();
			professionalDTO.setCertifications("CEP Certification, Construction Education Pro, 2020");
			professionalDTO.setDegree("High School Diploma");
			professionalDTO.setExperience("Proficient in operating heavy machinery");
			professionalDTO.setName("John");

			JobObserver jobObserver = new JobObserver(professionalDTO);

			JobSubject jobSubject = new JobSubject(job);

			jobSubject.add(jobObserver);

            assertNotNull(jobSubject);
        }
}
