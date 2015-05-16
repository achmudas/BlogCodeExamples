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

    @RequestMapping(value="/lotteryPageCsrf", method= RequestMethod.GET)
    public String loadLotteryPage(Model model) {
        model.addAttribute("payment", new Payment());
        return "lottery_page_with_csrf";
    }

    @RequestMapping(value="/lotteryPageNoCsrf", method= RequestMethod.GET)
    public String loadLotteryPageNoCsrf(Model model) {
        model.addAttribute("payment", new Payment());
        return "lottery_page_without_csrf";
    }

}
