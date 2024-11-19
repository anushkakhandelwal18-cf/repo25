package com.cloudframe.app.repository;

import com.cloudframe.app.cf04widg 1.dto.*;
import com.cloudframe.app.data.Field;


public interface Cf04widg 1Repository {
    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm sqlca
* @parm tbxmlwgt
     */
    public void selectTbwidget(Sqlca sqlca, Tbxmlwgt tbxmlwgt) throws Exception;

}
