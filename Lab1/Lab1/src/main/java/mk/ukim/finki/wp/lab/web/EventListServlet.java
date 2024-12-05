package mk.ukim.finki.wp.lab.web;

import mk.ukim.finki.wp.lab.model.Event;
import mk.ukim.finki.wp.lab.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class EventListServlet {

    private final EventService eventService;  // Декларирање на зависноста од EventService

    @Autowired
    public EventListServlet(EventService eventService) {
        this.eventService = eventService;  // Инјектирање на EventService
    }

    @GetMapping("/")  // Мапирање на патеката "/"
    public String listEvents(Model model) {
        List<Event> events = eventService.listAll();  // Вземање на сите настани од EventService
        model.addAttribute("events", events);  // Додавање на настаните во моделот
        return "listEvents";  // Враќање на шаблонот за приказ на настаните
    }
}
