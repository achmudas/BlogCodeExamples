package co.kurapka.main;


import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.logging.Logger;

/**
 * Created by achmudas on 17/04/15.
 */
@Controller
public class SimpleController {

    private Logger log = Logger.getLogger(SimpleController.class.getName());

    @RequestMapping("/forms/without_csrf")
    public String formWithoutCsrf() {
        return "form_without_csrf";
    }

    @RequestMapping("/forms/with_csrf")
    public String formWithCsrf() {
        return "form_with_csrf";
    }

    @RequestMapping(value="/withoutcsrf", method=RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public String withoutCsrf(@ModelAttribute Payment payment) {
        log.info("Successful call");
        log.info("Card number: " + payment.getCardNumber());
        log.info("Bank account to transfer: " + payment.getBankAccountToTransfer());
        log.info("Amount to transfer: " + payment.getAmountOfMoney());
        return "form_without_csrf";
    }

    @RequestMapping(value="/withcsrf", method=RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public String withCsrf(@ModelAttribute Payment payment) {
        log.info("Successful call");
        log.info("Card number: " + payment.getCardNumber());
        log.info("Bank account to transfer: " + payment.getBankAccountToTransfer());
        log.info("Amount to transfer: " + payment.getAmountOfMoney());
        return "form_with_csrf";
    }

}
