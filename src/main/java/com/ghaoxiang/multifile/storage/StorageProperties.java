/*
* 文件名: com.ghaoxiang.multifile.storage
* 文件编号: 
* 版权: Copyright (c) 2019, YAN Co.Ltd. and/or its affiliates. All rights reserved.Use is subject to license terms.
* 描述: 
* 创建人: ghaoxiang
* 创建时间: 2019年01月08日 16:49
* 修改人:
* 修改时间: 2019年01月08日 16:49
* 修改变更号: 
* 修改内容: 
*/
package com.ghaoxiang.multifile.storage;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author ghaoxiang
 * @version V1.0
 * @Title StorageProperties
 * @Description
 * @date 2019年01月08日 16:49
 * @since V1.0
 */
@Component
@ConfigurationProperties("storage")
public class StorageProperties {

    private String location = "upload-dir";

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
