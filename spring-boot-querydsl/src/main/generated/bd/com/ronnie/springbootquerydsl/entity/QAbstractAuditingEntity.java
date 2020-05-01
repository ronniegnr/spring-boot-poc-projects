package bd.com.ronnie.springbootquerydsl.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QAbstractAuditingEntity is a Querydsl query type for AbstractAuditingEntity
 */
@Generated("com.querydsl.codegen.SupertypeSerializer")
public class QAbstractAuditingEntity extends EntityPathBase<AbstractAuditingEntity> {

    private static final long serialVersionUID = -950439719L;

    public static final QAbstractAuditingEntity abstractAuditingEntity = new QAbstractAuditingEntity("abstractAuditingEntity");

    public final DateTimePath<java.time.Instant> createdAt = createDateTime("createdAt", java.time.Instant.class);

    public final StringPath createdBy = createString("createdBy");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final DateTimePath<java.time.Instant> updatedAt = createDateTime("updatedAt", java.time.Instant.class);

    public final StringPath updatedBy = createString("updatedBy");

    public QAbstractAuditingEntity(String variable) {
        super(AbstractAuditingEntity.class, forVariable(variable));
    }

    public QAbstractAuditingEntity(Path<? extends AbstractAuditingEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAbstractAuditingEntity(PathMetadata metadata) {
        super(AbstractAuditingEntity.class, metadata);
    }

}

