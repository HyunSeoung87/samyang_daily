package hyun.samyang_daily.Controller;

import hyun.samyang_daily.Service.ResultService;
import hyun.samyang_daily.dto.CommonResponse;
import hyun.samyang_daily.dto.ResultResponseDTO;
import hyun.samyang_daily.entity.Result;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/checkList")
@RequiredArgsConstructor
@Slf4j
public class checkList {

    private final ResultService resultService;
    @GetMapping("/{checkDay}")
    public ResponseEntity<CommonResponse<ResultResponseDTO>> getResult ( @PathVariable(name = "checkDay") String checkDay ) {
        ResultResponseDTO result = resultService.get(checkDay);

        CommonResponse commonResponse = CommonResponse.success(result);
        return ResponseEntity.ok(commonResponse);

    }

}
