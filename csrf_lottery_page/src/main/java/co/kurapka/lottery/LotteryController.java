package co.kurapka.lottery;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.logging.Logger;

/**
 * Created by achmudas on 16/05/15.
 */
@Controller
public class LotteryController {

    private Logger log = Logger.getLogger(LotteryController.class.getName());

    @RequestMapping(value="/lotteryPage", method= RequestMethod.GET)
    public String loadLotteryPage(Model model) {
        model.addAttribute("payment", new Payment());
        log.info("loading lottery web page");
        return "lottery_page";
    }

}
