package com.hpe.ddc.framework.controller;

import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

/**
 * 下载用Controller层的基类
 * Created by duxi on 2016/7/27.
 */
public abstract class DownloadBaseController {
    /**
     * PDF Preview的CONTENT_TYPE
     */
    protected final String CONTENT_TYPE_PDF_PREVIEW = "application/pdf";

    /**
     * 文本文件 Preview的CONTENT_TYPE
     */
    protected final String CONTENT_TYPE_TEXT_PREVIEW = "text/plain";

    /**
     * CSV文件 Preview的CONTENT_TYPE
     */
    protected final String CONTENT_TYPE_CSV_PREVIEW = "text/plain";

    /**
     * WORD文件 Preview的CONTENT_TYPE
     */
    protected final String CONTENT_TYPE_WORD_PREVIEW = "text/plain";

    /**
     * Image文件 Preview的CONTENT_TYPE
     */
    protected final String CONTENT_TYPE_IMAGE = "imgage/gif";

    /**
     * GZIP文件 下载用的CONTENT_TYPE
     */
    protected final String CONTENT_TYPE_GZIP_DOWNLOAD = "application/x-gzip";


    /**
     * ZIP文件下载用的CONTENT_TYPE
     */
    protected final String CONTENT_TYPE_ZIP_DOWNLOAD = "application/x-gzip";

    /**
     * 2进制文件下载用的CONTENT_TYPE
     */
    protected final String CONTENT_TYPE_DOWNLOAD = "application/octet-stream";

    /**
     * 在下载含有中文名的文件时，有3点需要注意
     * 1. 参数是HttpServletResponse
     * 2. Response的Header里面追加Content-Disposition，而后在文件明前追加「filename*=UTF-8''」
     * 3. 往OutputStream里写内容
     * <br/>
     * Sample：<br/>
     * @RequestMapping(value = "/download", method = RequestMethod.GET)
     * public String download(HttpServletResponse response) throws IOException {
     *     File file = new File("filepath");
     *     response.addHeader("Content-Disposition", "attachment; filename*=UTF-8''" + URLEncoder.encode(file.getName(), StandardCharsets.UTF_8.name()));
     *
     *     Files.copy(file.toPath(), response.getOutputStream());
     *     return null;
     * }
     * @param response
     * @param fileName
     * @throws UnsupportedEncodingException
     */
    protected void addHeader(HttpServletResponse response, String fileName) throws UnsupportedEncodingException {
        response.addHeader("Content-Disposition", "attachment; filename*=UTF-8''" + URLEncoder.encode(fileName, StandardCharsets.UTF_8.name()));
    }
}
