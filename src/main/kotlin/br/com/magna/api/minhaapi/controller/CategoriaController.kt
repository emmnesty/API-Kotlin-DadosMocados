package br.com.magna.api.minhaapi.controller

import br.com.magna.api.minhaapi.entity.CategoriaEntity
//import br.com.magna.api.minhaapi.entity.LivroEntity
import br.com.magna.api.minhaapi.repository.CategoriaRepository
import br.com.magna.api.minhaapi.service.CategoriaService
//import br.com.magna.api.minhaapi.service.LivroService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

@RestController
@RequestMapping("/api")
class CategoriaController(val categoriaService: CategoriaService) {

    @GetMapping("/categorias")
    fun getAllCategorias() = categoriaService.getAllCategorias()

//    @GetMapping("/categorias")
//    fun getAllCategorias() = categoriaService.getAllCategorias()
//
//    @GetMapping("/categorias/{categoriaId}")
//    fun getLivroById(@PathVariable categoriaId: Long) = categoriaService.getCategoriaById(categoriaId)
//
//    @PostMapping("/categorias")
//    @ResponseStatus(HttpStatus.CREATED)
//    fun createNewCategoria(@Valid @RequestBody categoria: CategoriaEntity): Unit = categoriaService.createNewCategoria(categoria)
//
//    @DeleteMapping("/categorias/{id}")
//    @ResponseStatus(HttpStatus.NO_CONTENT)
//    fun deleteCategoriaById(@PathVariable id: Long) = categoriaService.removePorId(id)
//
//    @PutMapping("/categorias/{id}")
//    fun updateLivroById(
//        @PathVariable id: Long, @RequestBody categoria: CategoriaEntity
//    ) = categoriaService.updatePorId(id, categoria)
//

}