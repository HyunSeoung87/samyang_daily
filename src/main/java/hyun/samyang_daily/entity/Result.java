package hyun.samyang_daily.entity;

import hyun.samyang_daily.Convert.BooleanToIntConverter;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity
@Builder
@Table(name = "inspection_result")
@Data
@RequiredArgsConstructor
public class Result {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long id;
//    점검 날짜
    @Column(name = "checkDay")
    private String checkDay;

    @Column(name = "cpu")
    private Float cpu;

    @Column(name = "disk")
    private Float disk;

    @Convert(converter = BooleanToIntConverter.class)
    @Column(name = "docker")
    private boolean docker;

    @Convert(converter = BooleanToIntConverter.class)
    @Column(name = "cron")
    private boolean cron;

    @Convert(converter = BooleanToIntConverter.class)
    @Column(name = "backup_log")
    private boolean backup_log;

    @Convert(converter = BooleanToIntConverter.class)
    @Column(name = "backup_db")
    private boolean backup_db;

    @Column(name = "total_flow_cnt")
    private long total_flow_cnt;

    @Column(name = "total_endpoint_cnt")
    private long total_endpoint_cnt;

    @Column(name = "total_call_cnt")
    private long total_call_cnt;

    @Column(name = "success_call_cnt")
    private long success_call_cnt;

    @Column(name = "fail_call_cnt")
    private long fail_call_cnt;

    @Column(name = "max_res_time")
    private long max_res_time;

    @Column(name = "avg_res_time")
    private long avg_res_time;

    public Result(long id, String checkDay, Float cpu, Float disk, boolean docker, boolean cron, boolean backup_log, boolean backup_db, long total_flow_cnt, long total_endpoint_cnt, long total_call_cnt, long success_call_cnt, long fail_call_cnt, long max_res_time, long avg_res_time) {
        this.id = id;
        this.checkDay = checkDay;
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
