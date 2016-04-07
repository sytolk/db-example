/**
 * This class is generated by jOOQ
 */
package com.bitdubai.fermat.db.sqlite.generated.tables;


import com.bitdubai.fermat.db.sqlite.generated.DefaultSchema;
import com.bitdubai.fermat.db.sqlite.generated.Keys;
import com.bitdubai.fermat.db.sqlite.generated.tables.records.NodesCatalogRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class NodesCatalog extends TableImpl<NodesCatalogRecord> {

	private static final long serialVersionUID = 2101626066;

	/**
	 * The reference instance of <code>nodes_catalog</code>
	 */
	public static final NodesCatalog NODES_CATALOG = new NodesCatalog();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<NodesCatalogRecord> getRecordType() {
		return NodesCatalogRecord.class;
	}

	/**
	 * The column <code>nodes_catalog.identity_public_key</code>.
	 */
	public final TableField<NodesCatalogRecord, String> IDENTITY_PUBLIC_KEY = createField("identity_public_key", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * The column <code>nodes_catalog.name</code>.
	 */
	public final TableField<NodesCatalogRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * The column <code>nodes_catalog.ip</code>.
	 */
	public final TableField<NodesCatalogRecord, String> IP = createField("ip", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * The column <code>nodes_catalog.default_port</code>.
	 */
	public final TableField<NodesCatalogRecord, Integer> DEFAULT_PORT = createField("default_port", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>nodes_catalog.latitude</code>.
	 */
	public final TableField<NodesCatalogRecord, Float> LATITUDE = createField("latitude", org.jooq.impl.SQLDataType.REAL, this, "");

	/**
	 * The column <code>nodes_catalog.longitude</code>.
	 */
	public final TableField<NodesCatalogRecord, Float> LONGITUDE = createField("longitude", org.jooq.impl.SQLDataType.REAL, this, "");

	/**
	 * The column <code>nodes_catalog.late_notification_counter</code>.
	 */
	public final TableField<NodesCatalogRecord, Integer> LATE_NOTIFICATION_COUNTER = createField("late_notification_counter", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>nodes_catalog.offline_counter</code>.
	 */
	public final TableField<NodesCatalogRecord, Integer> OFFLINE_COUNTER = createField("offline_counter", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>nodes_catalog.registered_timestamp</code>.
	 */
	public final TableField<NodesCatalogRecord, Integer> REGISTERED_TIMESTAMP = createField("registered_timestamp", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>nodes_catalog.last_connection_timestamp</code>.
	 */
	public final TableField<NodesCatalogRecord, Integer> LAST_CONNECTION_TIMESTAMP = createField("last_connection_timestamp", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * Create a <code>nodes_catalog</code> table reference
	 */
	public NodesCatalog() {
		this("nodes_catalog", null);
	}

	/**
	 * Create an aliased <code>nodes_catalog</code> table reference
	 */
	public NodesCatalog(String alias) {
		this(alias, NODES_CATALOG);
	}

	private NodesCatalog(String alias, Table<NodesCatalogRecord> aliased) {
		this(alias, aliased, null);
	}

	private NodesCatalog(String alias, Table<NodesCatalogRecord> aliased, Field<?>[] parameters) {
		super(alias, DefaultSchema.DEFAULT_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<NodesCatalogRecord> getPrimaryKey() {
		return Keys.PK_NODES_CATALOG;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<NodesCatalogRecord>> getKeys() {
		return Arrays.<UniqueKey<NodesCatalogRecord>>asList(Keys.PK_NODES_CATALOG);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public NodesCatalog as(String alias) {
		return new NodesCatalog(alias, this);
	}

	/**
	 * Rename this table
	 */
	public NodesCatalog rename(String name) {
		return new NodesCatalog(name, null);
	}
}