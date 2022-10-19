package by.sekrotse.personal.model

import org.hibernate.annotations.GenericGenerator
import java.util.*
import javax.persistence.*

@Entity
@Table(name = "address")
data class Address(
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "id", nullable = false)
    val id: UUID? = null,
    @Column(name = "city", nullable = false)
    val city: String? = null,
    @Column(name = "street", nullable = false)
    val street: String? = null,
    @Column(name = "home", nullable = false)
    val home: String? = null,
    @Enumerated(EnumType.STRING)
    @Column(name = "address_type", nullable = false)
    val type: AddressType? = null,
    @Column(name = "person_id", nullable = false)
    @ManyToMany(mappedBy = "addresses")
    val person: List<Person>? = null
) {
    enum class AddressType {
        REGISTRATION,
        RESIDENCE
    }
}
