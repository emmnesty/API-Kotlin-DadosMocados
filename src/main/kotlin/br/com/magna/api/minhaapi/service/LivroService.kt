//package br.com.magna.api.minhaapi.service
//
//import br.com.magna.api.minhaapi.entity.LivroEntity
//import br.com.magna.api.minhaapi.repository.CategoriaRepository
//import br.com.magna.api.minhaapi.repository.LivroRepository
//import org.slf4j.Logger
//import org.slf4j.LoggerFactory
//import org.springframework.data.repository.findByIdOrNull
//import org.springframework.http.HttpStatus
//import org.springframework.stereotype.Service
//import org.springframework.web.server.ResponseStatusException
//
//@Service
//class LivroService (private val livroRepository: LivroRepository, private val categoriaRepository: CategoriaRepository) {
//
//    private val logger: Logger = LoggerFactory.getLogger(javaClass)
//
//    // Listar todos os livros
//    fun getAllLivros(): List<LivroEntity> {
//        logger.info("Buscando todos os livros")
//        return livroRepository.findAll()
//    }
//
//    // Listar por ID
//    fun getLivroById(livroId: Long): LivroEntity {
//        logger.info("Buscando livros por ID")
//        return livroRepository.findByIdOrNull(livroId) ?: throw ResponseStatusException(HttpStatus.NOT_FOUND)
//    }
//    // Criar um novo livro
////    fun createNewLivro(livro: LivroEntity) {
////        logger.info("criando um novo livro")
////        livro.categoria?.let { categoriaRepository.save(it) }
////        livroRepository.save(livro)
////    }
//
//    // Remover livro por ID
//    fun removePorId(id: Long) {
//        logger.info("Removendo um livro por ID")
//        if (livroRepository.existsById(id)) livroRepository.deleteById(id)
//        else throw ResponseStatusException(HttpStatus.NOT_FOUND)
//    }
//
//    // Atualizar livro por ID
//    fun updatePorId(id: Long, livro: LivroEntity): LivroEntity {
//        logger.info("Atualizando livros por ID")
//        return if (livroRepository.existsById(id)) {
//            livro.id = id
//            livroRepository.save(livro)
//        } else throw ResponseStatusException(HttpStatus.NOT_FOUND)
//
//    }
//
//}