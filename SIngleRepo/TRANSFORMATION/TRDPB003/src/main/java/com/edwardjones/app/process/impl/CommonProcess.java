package com.edwardjones.app.process.impl;

import com.cloudframe.app.dao.Db2Base;
import com.cloudframe.app.process.BaseProcess;
import com.edwardjones.app.process.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class CommonProcess extends BaseProcess {
  @Autowired
  @Qualifier("db2Base")
  protected Db2Base db2Base;
}
