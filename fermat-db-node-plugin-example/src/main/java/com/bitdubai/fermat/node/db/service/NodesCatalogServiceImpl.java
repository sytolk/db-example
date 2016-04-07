package com.bitdubai.fermat.node.db.service;


import com.bitdubai.fermat.db.sqlite.generated.tables.daos.NodesCatalogDao;
import com.bitdubai.fermat.db.sqlite.generated.tables.pojos.NodesCatalog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class NodesCatalogServiceImpl implements NodesCatalogService {

    @Autowired
    NodesCatalogDao nodesCatalogDao;

    @Transactional
    @Override
    public void insert(NodesCatalog nodesCatalog) {
        nodesCatalogDao.insert(nodesCatalog);
    }
}
