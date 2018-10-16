package com.itm.mybatis2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

/**
* @description PdfController
* @author hao.yang
* @create 2018-08-08 
*/

@RestController
public class PdfController {

        /**
         * 导出pdf
         * @author Changhai
         * @param response
         * @return
         * @throws UnsupportedEncodingException
         */
        @RequestMapping(value={"/exportpdf"})
        public String exportPdf(HttpServletResponse response) throws UnsupportedEncodingException {
            // 指定解析器
            System.setProperty("javax.xml.parsers.DocumentBuilderFactory",
                    "com.sun.org.apache.xerces.internal.jaxp.DocumentBuilderFactoryImpl");
            //String path = request.getSession().getServletContext().getRealPath("/upload/");
            String filename="练习.pdf";
            response.setContentType("application/pdf");
            response.setHeader("Content-Disposition", "attachment;fileName="
                    + URLEncoder.encode(filename, "UTF-8"));
            OutputStream os = null;
            try {
                os = response.getOutputStream();
                // 2 读入pdf表单


                //-------------------------------------------------------------
                System.out.println("===============PDF导出成功=============");
            } catch (Exception e) {
                System.out.println("===============PDF导出失败=============");
                e.printStackTrace();
            } finally {
                try {

                    os.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return null;
        }
    }
