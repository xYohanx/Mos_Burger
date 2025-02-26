package edu.icet.controller;


import edu.icet.dto.Items;
import edu.icet.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/item")
@RequiredArgsConstructor
@CrossOrigin
public class ItemController {

  final ItemService service ;

    @PostMapping("/add")
    public void addItems(@RequestBody Items items){
            service.addItems(items);
   }
    @GetMapping("/get-all")
    public List<Items> getAll(){
        return service.getAll();
    }
}
