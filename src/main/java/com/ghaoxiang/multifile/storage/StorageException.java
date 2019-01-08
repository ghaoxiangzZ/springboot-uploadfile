/*
* 文件名: com.ghaoxiang.multifile.storage
* 文件编号: 
* 版权: Copyright (c) 2019, YAN Co.Ltd. and/or its affiliates. All rights reserved.Use is subject to license terms.
* 描述: 
* 创建人: ghaoxiang
* 创建时间: 2019年01月08日 16:47
* 修改人:
* 修改时间: 2019年01月08日 16:47
* 修改变更号: 
* 修改内容: 
*/
package com.ghaoxiang.multifile.storage;

/**
 * @author ghaoxiang
 * @version V1.0
 * @Title StorageException
 * @Description 自定义异常类
 * @date 2019年01月08日 16:47
 * @since V1.0
 */
public class StorageException extends RuntimeException {

    public StorageException(String message) {
        super(message);
    }

    public StorageException(String message, Throwable cause) {
        super(message, cause);
    }
}
