package br.com.magna.api.minhaapi.service

import br.com.magna.api.minhaapi.entity.CategoriaEntity
import br.com.magna.api.minhaapi.repository.CategoriaRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException
import org.slf4j.Logger
import org.slf4j.LoggerFactory

@Service
class CategoriaService(private val categoriaRepository: CategoriaRepository) {

//    private val logger = KotlinLogging.logger("CategoriaService")

    private val logger: Logger = LoggerFactory.getLogger(this.javaClass)


    // Listar todos as categorias
    fun getAllCategorias(): List<CategoriaEntity> {
        logger.info("Buscando todas as categorias")
        println("entrou aqui")
        return categoriaRepository.listarCategoria();
    }


//


//    // Listar todos as categorias
//    fun getAllCategorias(): List<CategoriaEntity> {
//        logger.info("Buscando todas as categorias")
//        return categoriaRepository.findAll()
//    }
////
//    // Listar por ID
//    fun getCategoriaById(categoriaId: Long): CategoriaEntity {
//        logger.info("Buscando categorias por ID")
//        return categoriaRepository.findByIdOrNull(categoriaId) ?: throw ResponseStatusException(HttpStatus.NOT_FOUND)
//    }
//
//    // Criar uma nova categoria
//    fun createNewCategoria(categoria: CategoriaEntity) {
//        logger.info("Criando uma nova categoria")
//        categoriaRepository.save(categoria)
//    }
//
//    // Remover categoria por ID
//    fun removePorId(id: Long) {
//        logger.info("Removendo categoria por ID")
//        if (categoriaRepository.existsById(id)) categoriaRepository.deleteById(id)
//        else throw ResponseStatusException(HttpStatus.NOT_FOUND)
//    }
//
//    // Atualizar categoria por ID
//    fun updatePorId(id: Long, categoria: CategoriaEntity): CategoriaEntity {
//        logger.info("Atualizando categoria por ID")
//        return if (categoriaRepository.existsById(id)) {
//            categoria.id = id
//            categoriaRepository.save(categoria)
//        } else throw ResponseStatusException(HttpStatus.NOT_FOUND)
//
//    }

}