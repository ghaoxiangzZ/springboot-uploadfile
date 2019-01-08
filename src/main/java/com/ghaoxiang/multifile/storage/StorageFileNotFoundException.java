/*
* 文件名: com.ghaoxiang.multifile.storage
* 文件编号: 
* 版权: Copyright (c) 2019, YAN Co.Ltd. and/or its affiliates. All rights reserved.Use is subject to license terms.
* 描述: 
* 创建人: ghaoxiang
* 创建时间: 2019年01月08日 16:48
* 修改人:
* 修改时间: 2019年01月08日 16:48
* 修改变更号: 
* 修改内容: 
*/
package com.ghaoxiang.multifile.storage;

/**
 * @author ghaoxiang
 * @version V1.0
 * @Title StorageFileNotFoundException
 * @Description
 * @date 2019年01月08日 16:48
 * @since V1.0
 */
public class StorageFileNotFoundException extends StorageException {

    public StorageFileNotFoundException(String message) {
        super(message);
    }

    public StorageFileNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
