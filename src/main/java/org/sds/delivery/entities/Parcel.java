package org.sds.delivery.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

import static jakarta.persistence.EnumType.STRING;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "PARCEL")
public class Parcel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "PARCEL_NUMBER")
    private Integer parcelNumber;
    @Column(name = "PARCEL_LABEL")
    private UUID parcelLabel;
    @Column(name = "WEIGHT")
    private Double weight;
    @Column(name = "LENGTH")
    private Double length;
    @Column(name = "WIDTH")
    private Double width;
    @Column(name = "HEIGHT")
    private Double height;
    @Enumerated(STRING)
    private ParcelStatus parcelStatus;
    @ManyToOne
    @JoinColumn(name = "ORDER_ID", referencedColumnName = "id")
    private Order order;

}
