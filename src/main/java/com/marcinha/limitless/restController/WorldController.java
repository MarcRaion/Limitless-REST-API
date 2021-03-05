package com.marcinha.limitless.restController;

        import com.marcinha.limitless.entity.Word;
        import com.marcinha.limitless.service.WordService;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.web.bind.annotation.*;

        import java.util.HashSet;
        import java.util.List;
        import java.util.Set;

@RestController
public class WorldController {

    private WordService service;

    @Autowired
    public WorldController(WordService service) {
        this.service = service;
    }

    public WorldController() {
    }

//

    @GetMapping("/words")
    public List<Word> getAll() {
        return service.findAll();
    }

    @GetMapping("/words/{id}")
    public Word getOne(@PathVariable int id) {

        Word word = service.findOne(id);

        if (word == null) {
            System.out.println("There is no word with this id");
        }

        return word;
    }


    @PostMapping("/words")
    public Word addWord(@RequestBody Word word) {

        word.setId(0);
        service.save(word);

        return word;
    }


    @DeleteMapping("/words/{id}")
    public String deleteWord(@PathVariable int id) {

        Word word = service.findOne(id);

        if (word == null) {
            return  "There is no word with this id";
        }

        service.delete(id);

        return word.getWord() + " was deleted";

    }

    @GetMapping("/words/check/{word}")
    public String checkAmount(@PathVariable String word) {
        int count = 0;
        String checkWord = word.toUpperCase();

        List<Word> list = service.findAll();

        for (Word temp : list) {
            if (temp.getWord().toUpperCase().equals(checkWord)) {
                count++;
            }
        }
        return word + " appears " + count + " time/times in our list";
    }


    @GetMapping("/words/unique")
    public Set<String> getUnique() {

        List<Word> list = service.findAll();
        Set<String> unique = new HashSet<>();

        for (int i = 0; i < list.size(); i++) {
            unique.add(list.get(i).getWord());
        }
        return  unique;
    }


}
