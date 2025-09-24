package dev.jlucasbs.study.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.jlucasbs.study.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
