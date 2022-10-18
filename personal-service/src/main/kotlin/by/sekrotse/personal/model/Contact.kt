package by.sekrotse.personal.model

import java.util.*
import javax.persistence.*

@Entity
@Table(name = "contact")
data class Contact(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    val id: UUID? = null,
    @Column(name = "contact_type", nullable = false)
    @Enumerated(EnumType.STRING)
    val type: ContactType? = null,
    @Column(name = "value", nullable = false)
    val value: String? = null,
    @Column(name = "person_id", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "person_id", nullable = false)
    val person: Person? = null
) {
    enum class ContactType {
        EMAIL,
        PHONE,
        MOBILE_PHONE
    }
}
