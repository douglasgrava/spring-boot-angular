package spring_boot_angular.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;

import spring_boot_angular.model.HQ;
import spring_boot_angular.repository.HQRepository;

@RestController
@Transactional
public class HQController {

    @Autowired
    private HQRepository repository;

    @RequestMapping(value = "/hq", method = RequestMethod.GET)
    @ResponseBody
    public Iterable<HQ> listar() {
        return repository.findAll();
    }

    @RequestMapping(value = "/hq/salvar", method = RequestMethod.POST)
    @ResponseBody
    public HQ sakvar(@RequestBody final HQ hq) {
        return repository.save(hq);
    }


}
