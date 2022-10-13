//package br.com.magna.api.minhaapi.entity
//
//import com.fasterxml.jackson.annotation.JsonBackReference
//import javax.persistence.*
//import javax.validation.constraints.NotBlank
//
//@Entity
//@Table(name = "tb_livros")
//data class LivroEntity (
//    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
//    var id: Long = 0,
//
//    @get: NotBlank
//    val titulo: String = "",
//
//    @get: NotBlank
//    val autor: String = "",
//
//    @JsonBackReference
//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "categoria_id")
//    val categoria: CategoriaEntity? = null
//)
