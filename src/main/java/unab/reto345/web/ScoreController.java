package unab.reto345.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import unab.reto345.model.Score;
import unab.reto345.service.ScoreService;

import java.util.List;
import java.util.Optional;

public class ScoreController {
    @Autowired
    private ScoreService scoreService;

    @GetMapping("/all")
    public List<Score> getScore() {
        return scoreService.getAll();
    }
    @GetMapping("/{id}")
    public Optional<Score> getScore(@PathVariable("id") int id){
        return scoreService.getScore(id);
    }
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Score save(@RequestBody Score score){
        return scoreService.save(score);
    }
    @PutMapping("/update")
    public Score update(@RequestBody Score score){
        return scoreService.update(score);
    }
    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable("id") int id){
        return scoreService.delete(id);
    }
}
