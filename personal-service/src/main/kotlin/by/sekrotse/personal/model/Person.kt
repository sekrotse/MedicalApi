package by.sekrotse.personal.model

import java.util.*
import javax.persistence.*

@Entity
@Table(name = "person")
data class Person(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    val id: UUID? = null,
    @Column(name = "first_name", nullable = false)
    val firstName: String? = null,
    @Column(name = "last_name", nullable = false)
    val lastName: String? = null,
    @OneToMany(mappedBy = "person", fetch = FetchType.LAZY)
    val documents: List<IdentityDocument> = mutableListOf(),
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "person_address",
        joinColumns = [JoinColumn(name = "person_id")],
        inverseJoinColumns = [JoinColumn(name = "address_id")])
    val addresses: List<Address> = mutableListOf(),
    @OneToMany(mappedBy = "person", fetch = FetchType.LAZY)
    val contacts: List<Contact> = mutableListOf()
    )
