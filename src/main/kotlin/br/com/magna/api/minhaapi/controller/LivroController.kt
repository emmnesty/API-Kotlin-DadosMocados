//package br.com.magna.api.minhaapi.controller
//
//import br.com.magna.api.minhaapi.entity.LivroEntity
//import br.com.magna.api.minhaapi.service.LivroService
//import org.springframework.http.HttpStatus
//import org.springframework.web.bind.annotation.*
//import javax.validation.Valid
//
//@RestController
//@RequestMapping("/api")
//class LivroController(val livroService: LivroService) {
//    @GetMapping("/livros")
//    fun getAllLivros() = livroService.getAllLivros()
//
//    @GetMapping("/livros/{livroId}")
//    fun getLivroById(@PathVariable livroId: Long) = livroService.getLivroById(livroId)
//
////    @PostMapping("/livros")
////    @ResponseStatus(HttpStatus.CREATED)
////    fun createNewLivro(@Valid @RequestBody livro: LivroEntity): Unit = livroService.createNewLivro(livro)
//
//    @DeleteMapping("/livros/{id}")
//    @ResponseStatus(HttpStatus.NO_CONTENT)
//    fun deleteLivroById(@PathVariable id: Long) = livroService.removePorId(id)
//
//    @PutMapping("/livros/{id}")
//    fun updateLivroById(
//        @PathVariable id: Long, @RequestBody livro: LivroEntity
//    ) = livroService.updatePorId(id, livro)
//
//}
