package by.sekrotse.personal.controller.v1

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/person")
class PersonalController {

    @GetMapping("verify")
    fun personVerify(
        @RequestParam("name") lastName: String,
        @RequestParam("passport") documentNumber: String
    ) : ResponseEntity<Boolean>{
        return ResponseEntity.ok().body(false);
    }
}