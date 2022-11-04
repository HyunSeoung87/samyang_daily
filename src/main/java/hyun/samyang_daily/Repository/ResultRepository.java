package hyun.samyang_daily.Repository;

import hyun.samyang_daily.entity.Result;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResultRepository extends JpaRepository<Result, Long> {

    Result findByCheckDay(String checkDay);
}
