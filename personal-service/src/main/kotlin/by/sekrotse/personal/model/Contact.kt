package by.sekrotse.personal.model

import org.hibernate.annotations.GenericGenerator
import java.util.*
import javax.persistence.*

@Entity
@Table(name = "contact")
data class Contact(
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "id", nullable = false)
    val id: UUID? = null,
    @Column(name = "contact_type", nullable = false)
    @Enumerated(EnumType.STRING)
    val type: ContactType? = null,
    @Column(name = "value", nullable = false)
    val value: String? = null,
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
