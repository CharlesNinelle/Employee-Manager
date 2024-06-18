package tech.getarrays.employeemanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNull;
import tech.getarrays.employeemanager.model.Employee;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    void deleteById(@NonNull Long id);
    Optional<Employee> findEmployeeById(@NonNull Long id);
    boolean existsById(@NonNull Long id);
}
