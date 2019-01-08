/*
* 文件名: com.ghaoxiang.multifile.storage
* 文件编号: 
* 版权: Copyright (c) 2019, YAN Co.Ltd. and/or its affiliates. All rights reserved.Use is subject to license terms.
* 描述: 
* 创建人: ghaoxiang
* 创建时间: 2019年01月08日 16:46
* 修改人:
* 修改时间: 2019年01月08日 16:46
* 修改变更号: 
* 修改内容: 
*/
package com.ghaoxiang.multifile.storage;

import java.nio.file.Path;
import java.util.stream.Stream;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author ghaoxiang
 * @version V1.0
 * @Title StorageService
 * @Description
 * @date 2019年01月08日 16:46
 * @since V1.0
 */
public interface StorageService {

    void init();

    void store(MultipartFile file);

    Stream<Path> loadAll();

    Path load(String filename);

    Resource loadAsResource(String filename);

    void deleteAll();
}
