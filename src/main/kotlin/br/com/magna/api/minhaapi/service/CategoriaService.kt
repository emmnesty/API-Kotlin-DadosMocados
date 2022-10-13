package br.com.magna.api.minhaapi.service

import br.com.magna.api.minhaapi.entity.CategoriaEntity
import br.com.magna.api.minhaapi.repository.CategoriaRepository
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service

@Service
class CategoriaService(private val categoriaRepository: CategoriaRepository) {


    private val logger: Logger = LoggerFactory.getLogger(this.javaClass)

    // Listar todos as categorias
    fun getAllCategorias(): List<CategoriaEntity> {
        logger.info("Buscando todas as categorias")
        println("entrou aqui")
        return categoriaRepository.listarCategoria();
    }


}