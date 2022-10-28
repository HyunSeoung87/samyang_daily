//package hyun.samyang_daily.Controller;
//
//import hyun.samyang_daily.Service.ResultService;
//import hyun.samyang_daily.dto.CommonResponse;
//import hyun.samyang_daily.entity.Result;
//import lombok.RequiredArgsConstructor;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//
//@Controller
//@RequestMapping("/api/vi")
//@RequiredArgsConstructor
//public class result {
//
//    private final ResultService resultService;
//    @GetMapping("/result")
//    public ResponseEntity<CommonResponse<Result>> getResult ( String date ) {
//        Result result = resultService.get();
//
//    }
//
//}
