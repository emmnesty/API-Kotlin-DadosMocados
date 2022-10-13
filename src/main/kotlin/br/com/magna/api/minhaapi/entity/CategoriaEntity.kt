package br.com.magna.api.minhaapi.entity

import com.fasterxml.jackson.annotation.JsonManagedReference
import javax.persistence.*
import javax.validation.constraints.NotBlank

@Entity
@Table(name = "tb_categorias")
data class CategoriaEntity (
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0,

    @get: NotBlank
    val nome: String = "",

)
