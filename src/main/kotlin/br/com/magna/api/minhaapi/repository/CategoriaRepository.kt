package br.com.magna.api.minhaapi.repository

import br.com.magna.api.minhaapi.entity.CategoriaEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository


@Repository
class CategoriaRepository {

    var args = ArrayList<CategoriaEntity>()

    fun listarCategoria(): List<CategoriaEntity> {

        var categoria: CategoriaEntity = CategoriaEntity(1, "TEste")
        var categoria1: CategoriaEntity = CategoriaEntity(2, "TEste1")
        var categoria2: CategoriaEntity = CategoriaEntity(3, "TEste2")
        var categoria3: CategoriaEntity = CategoriaEntity(4, "TEste3")
        var categoria4: CategoriaEntity = CategoriaEntity(5, "TEste4")
        var categoria5: CategoriaEntity = CategoriaEntity(6, "TEste5")

        args.add(categoria)
        args.add(categoria1)
        args.add(categoria2)
        args.add(categoria3)
        args.add(categoria4)
        args.add(categoria5)
        return args
    }

    fun salvar(categoriaEntity: CategoriaEntity): CategoriaEntity {
        var entity: CategoriaEntity = CategoriaEntity(
            id = categoriaEntity.id,
            nome = categoriaEntity.nome,

            )
        args.add(entity)
        return entity
    }

    fun deletar(index: Int) {
        args.removeAt(index)
    }
}
