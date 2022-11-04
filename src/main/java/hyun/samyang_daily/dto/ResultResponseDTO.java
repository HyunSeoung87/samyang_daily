package hyun.samyang_daily.dto;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@Builder
public class ResultResponseDTO {
    long ID;
    Float cpu;
    Float disk;
    Boolean docker;
    Boolean cron;
    Boolean backup_log;
    Boolean backup_db;
    long total_flow_cnt;
    long total_endpoint_cnt;
    long total_call_cnt;
    long success_call_cnt;
    long fail_call_cnt;
    long max_res_time;
    long avg_res_time;

    public ResultResponseDTO(long ID, Float cpu, Float disk, Boolean docker, Boolean cron, Boolean backup_log, Boolean backup_db, long total_flow_cnt, long total_endpoint_cnt, long total_call_cnt, long success_call_cnt, long fail_call_cnt, long max_res_time, long avg_res_time) {
        this.ID = ID;
        this.cpu = cpu;
        this.disk = disk;
        this.docker = docker;
        this.cron = cron;
        this.backup_log = backup_log;
        this.backup_db = backup_db;
        this.total_flow_cnt = total_flow_cnt;
        this.total_endpoint_cnt = total_endpoint_cnt;
        this.total_call_cnt = total_call_cnt;
        this.success_call_cnt = success_call_cnt;
        this.fail_call_cnt = fail_call_cnt;
        this.max_res_time = max_res_time;
        this.avg_res_time = avg_res_time;
    }
}
