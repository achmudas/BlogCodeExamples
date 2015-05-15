package co.kurapka.main;


import java.util.logging.Logger;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by achmudas on 17/04/15.
 */
@Controller
public class SimpleController {

    private Logger log = Logger.getLogger(SimpleController.class.getName());

    @RequestMapping(value="/forms/without_csrf", method=RequestMethod.GET)
    public String formWithoutCsrf(Model model) {
        model.addAttribute("payment", new Payment());
    	return "form_without_csrf";
    }

    @RequestMapping(value="/forms/with_csrf", method=RequestMethod.GET)
    public String formWithCsrf(Model model) {
    	model.addAttribute("payment", new Payment());
    	return "form_with_csrf";
    }

    @RequestMapping(value="/withoutcsrf", method=RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public String withoutCsrf(@ModelAttribute Payment payment, Model model) {
        log.info("Successful call");
        log.info("Card number: " + payment.getCardNumber());
        log.info("Bank account to transfer: " + payment.getBankAccountToTransfer());
        log.info("Amount to transfer: " + payment.getAmountOfMoney());
        model.addAttribute(payment);
        return "result";
    }

    @RequestMapping(value="/withcsrf", method=RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public String withCsrf(@ModelAttribute Payment payment, Model model) {
        log.info("Successful call");
        log.info("Card number: " + payment.getCardNumber());
        log.info("Bank account to transfer: " + payment.getBankAccountToTransfer());
        log.info("Amount to transfer: " + payment.getAmountOfMoney());
        model.addAttribute(payment);
        return "result";
    }

}
