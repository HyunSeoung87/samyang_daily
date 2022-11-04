package hyun.samyang_daily.Service;

import hyun.samyang_daily.Repository.ResultRepository;
import hyun.samyang_daily.dto.ResultResponseDTO;
import hyun.samyang_daily.entity.Result;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ResultService {

    private final ResultRepository resultRepository;


    public ResultResponseDTO get(String checkDay) {
//        Result byCheckDay = resultRepository.findByCheckDay(checkDay);
        Result byCheckDay = resultRepository.findByCheckDay("20221101");

        return ResultResponseDTO.builder()
                .ID(byCheckDay.getId())
                .cpu(byCheckDay.getCpu())
                .disk(byCheckDay.getDisk())
                .docker(byCheckDay.isDocker())
                .cron(byCheckDay.isCron())
                .backup_db(byCheckDay.isBackup_db())
                .backup_log(byCheckDay.isBackup_log())
                .total_call_cnt(byCheckDay.getTotal_call_cnt())
                .total_endpoint_cnt(byCheckDay.getTotal_endpoint_cnt())
                .total_flow_cnt(byCheckDay.getTotal_flow_cnt())
                .success_call_cnt(byCheckDay.getSuccess_call_cnt())
                .fail_call_cnt(byCheckDay.getFail_call_cnt())
                .max_res_time(byCheckDay.getMax_res_time())
                .avg_res_time(byCheckDay.getAvg_res_time())
                .build();
    }
}
