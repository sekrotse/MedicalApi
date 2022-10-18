package by.sekrotse.personal.model

import org.w3c.dom.DocumentType
import java.util.*
import javax.persistence.*

@Entity
@Table(name = "document")
data class IdentityDocument(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    val id: UUID? = null,
    @Enumerated(EnumType.STRING)
    @Column(name = "document_type", nullable = false)
    val documentType: DocumentType? = null,
    @Column(name = "document_number", nullable = false)
    val documentNumber: String? = null,
    @ManyToOne
    @JoinColumn(name = "person_id", nullable = false)
    val person: Person? = null
) {
    enum class DocumentType{
        PASSPORT,
        INTERNATIONAL_PASSPORT,
        SNLS,
        INSURANCE
    }
}
