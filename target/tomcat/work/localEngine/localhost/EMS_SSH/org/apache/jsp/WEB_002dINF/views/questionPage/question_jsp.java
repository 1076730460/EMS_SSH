package org.apache.jsp.WEB_002dINF.views.questionPage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class question_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fselect_0026_005fvalue_005fonchange_005fname_005flistValue_005flistKey_005flist_005fid_005fheaderValue_005fheaderKey_005fcssClass;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvar_005fvalue_005fstatus;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fotherwise;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fselect_0026_005fvalue_005fname_005flistValue_005flistKey_005flist_005fid_005fheaderValue_005fheaderKey_005fcssClass;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005ftextarea_0026_005fplaceholder_005fname_005fid_005fcssClass_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005ftype_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005ftextfield_0026_005ftype_005fname_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fplaceholder_005fname_005fid_005fcssClass_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fs_005fselect_0026_005fvalue_005fonchange_005fname_005flistValue_005flistKey_005flist_005fid_005fheaderValue_005fheaderKey_005fcssClass = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvar_005fvalue_005fstatus = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fotherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fselect_0026_005fvalue_005fname_005flistValue_005flistKey_005flist_005fid_005fheaderValue_005fheaderKey_005fcssClass = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005ftextarea_0026_005fplaceholder_005fname_005fid_005fcssClass_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005ftype_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005ftype_005fname_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fplaceholder_005fname_005fid_005fcssClass_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fs_005fselect_0026_005fvalue_005fonchange_005fname_005flistValue_005flistKey_005flist_005fid_005fheaderValue_005fheaderKey_005fcssClass.release();
    _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvar_005fvalue_005fstatus.release();
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fotherwise.release();
    _005fjspx_005ftagPool_005fs_005fselect_0026_005fvalue_005fname_005flistValue_005flistKey_005flist_005fid_005fheaderValue_005fheaderKey_005fcssClass.release();
    _005fjspx_005ftagPool_005fs_005ftextarea_0026_005fplaceholder_005fname_005fid_005fcssClass_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005ftype_005fname.release();
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005ftype_005fname_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fplaceholder_005fname_005fid_005fcssClass_005fnobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<base href=\"");
      out.print(basePath);
      out.write("\" />\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"");
      out.print(request.getContextPath());
      out.write("/resources/dist/css/bootstrap.min.css\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath());
      out.write("/resources/dist/jquery.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"");
      out.print(request.getContextPath());
      out.write("/resources/dist/js/bootstrap.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"row\">\r\n");
      out.write("\t\t<div class=\"col-sm-11\">\r\n");
      out.write("\t\t\t<form class=\"form-horizontal\" id=\"form_search\"\r\n");
      out.write("\t\t\t\taction=\"searchData.action\">\r\n");
      out.write("\t\t\t\t<div class=\"row\" style=\"margin-top: 5px;\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<label class=\"col-sm-1 control-label\" for=\"form-field-select-1\">\r\n");
      out.write("\t\t\t\t\t\t岗位</label>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-2 no-padding-left\">\r\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_s_005fselect_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<label class=\"col-sm-1 control-label\" for=\"form-field-select-1\">\r\n");
      out.write("\t\t\t\t\t\t试题类型</label>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-2 no-padding-left\">\r\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_s_005fselect_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"row\" style=\"height: 10px;\"></div>\r\n");
      out.write("\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t<label class=\"col-sm-1 control-label\" for=\"form-field-select-1\">\r\n");
      out.write("\t\t\t\t\t\t试卷名称</label>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-2 no-padding-left\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"parperName\"\r\n");
      out.write("\t\t\t\t\t\t\tname=\"parper.name\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<label class=\"col-sm-1 control-label\" for=\"form-field-select-1\">\r\n");
      out.write("\t\t\t\t\t\t试卷类型</label>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-2 no-padding-left\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"parperType\"\r\n");
      out.write("\t\t\t\t\t\t\tname=\"parper.postType\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<label class=\"col-sm-1 control-label\" for=\"form-field-select-1\">\r\n");
      out.write("\t\t\t\t\t\t题目数</label>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-1 no-padding-left\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"qustionNum\"\r\n");
      out.write("\t\t\t\t\t\t\tname=\"zujuanNum\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-1\">\r\n");
      out.write("\t\t\t\t\t\t<button class=\"btn btn-primary btn-sm\" id=\"organization\">自动组卷</button>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-1\">\r\n");
      out.write("\t\t\t\t\t\t<button class=\"btn btn-primary btn-sm\" id=\"artfical\">人工组卷</button>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"col-sm-1\" style=\"margin-top: 50px;\">\r\n");
      out.write("\t\t\t<button class=\"btn btn-primary btn-sm\" data-toggle=\"modal\"\r\n");
      out.write("\t\t\t\tdata-target=\"#myModal\">添加题目</button>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"row\"></div>\r\n");
      out.write("\t<input id=\"searchUrl\" type=\"hidden\" value=\"questionInfoSearch\">\r\n");
      out.write("\t<input id=\"searchPagination\" type=\"hidden\" value=\"JobInfoPagination\">\r\n");
      out.write("\t<div class=\"table-responsive\" style=\"margin-top: 5px;\">\r\n");
      out.write("\t\t<table id=\"dataSourceTable\"\r\n");
      out.write("\t\t\tclass=\"table table-striped table-bordered table-hover\">\r\n");
      out.write("\t\t\t<thead>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th class=\"center\"><label class=\"position-relative\"> <input\r\n");
      out.write("\t\t\t\t\t\t\ttype=\"checkbox\" class=\"ace\" id=\"allSelect\" onclick=\"selectAll()\" />\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"lbl\"></span>\r\n");
      out.write("\t\t\t\t\t</label></th>\r\n");
      out.write("\t\t\t\t\t<th>题目名称</th>\r\n");
      out.write("\t\t\t\t\t<th>岗位</th>\r\n");
      out.write("\t\t\t\t\t<th>类型</th>\r\n");
      out.write("\t\t\t\t\t<th>选项</th>\r\n");
      out.write("\t\t\t\t\t<th>正确项</th>\r\n");
      out.write("\t\t\t\t\t<th>操作</th>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</thead>\r\n");
      out.write("\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_s_005fiterator_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t</tbody>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t<div id=\"table-loader\" class=\"col-xs-12\"\r\n");
      out.write("\t\t\tstyle=\"text-align: center; margin-top: 6%; display: none; margin-bottom: 6%\">\r\n");
      out.write("\t\t\t<img\r\n");
      out.write("\t\t\t\tsrc=\"");
      out.print(request.getContextPath());
      out.write("/resources/images/ajax-loader.gif\" />\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<!-- 添加模态框（Modal） -->\r\n");
      out.write("\t<div class=\"modal fade\" id=\"myModal\" tabindex=\"-1\" role=\"dialog\"\r\n");
      out.write("\t\taria-labelledby=\"myModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("\t\t<div class=\"modal-dialog\">\r\n");
      out.write("\t\t\t<div class=\"modal-content\">\r\n");
      out.write("\t\t\t\t<div class=\"modal-header\" style=\"text-align: center;\">\r\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\"\r\n");
      out.write("\t\t\t\t\t\taria-hidden=\"true\">&times;</button>\r\n");
      out.write("\t\t\t\t\t<h4 class=\"modal-title\" id=\"myModalLabel\">添加题目</h4>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"modal-body\">\r\n");
      out.write("\t\t\t\t\t<!-- modal start -->\r\n");
      out.write("\t\t\t\t\t<div class=\"step-pane active\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"step-pane active\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<form action=\"\" class=\"form-horizontal\" id=\"form_addQuestion\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\" style=\"margin-top: 5px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-xs-6 form-cell\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_s_005fselect_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-xs-6 form-cell\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_s_005fselect_005f3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_s_005ftextarea_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<!-- 选项 -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div id=\"options\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"row\" style=\"margin-top: 5px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<label class=\"col-sm-1 control-label\">A</label> <input\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttype=\"text\" class=\"col-sm-5\" name=\"option.optionA\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<label class=\"col-sm-1 control-label\">B</label> <input\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttype=\"text\" class=\"col-sm-5\" name=\"option.optionB\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"row\" style=\"margin-top: 5px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<label class=\"col-sm-1 control-label\">C</label> <input\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttype=\"text\" class=\"col-sm-5\" name=\"option.optionC\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<label class=\"col-sm-1 control-label\">D</label> <input\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\ttype=\"text\" class=\"col-sm-5\" name=\"option.optionD\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<!-- 答案 -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"row\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"row\" id=\"checkbox\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label class=\"checkbox-inline\"> ");
      if (_jspx_meth_s_005ftextfield_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</label> <label class=\"checkbox-inline\"> ");
      if (_jspx_meth_s_005ftextfield_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</label> <label class=\"checkbox-inline\"> ");
      if (_jspx_meth_s_005ftextfield_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</label> <label class=\"checkbox-inline\"> ");
      if (_jspx_meth_s_005ftextfield_005f3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"modal-footer\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-default\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tdata-dismiss=\"modal\">关闭</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-primary\" id=\"questionSub\">提交</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!-- model end -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- /.modal-content -->\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- /.modal -->\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<!-- 修改模态框 -->\r\n");
      out.write("\t<div class=\"modal fade\" id=\"updateModal\" tabindex=\"-1\" role=\"dialog\"\r\n");
      out.write("\t\taria-labelledby=\"myModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("\t\t<div class=\"modal-dialog\">\r\n");
      out.write("\t\t\t<div class=\"modal-content\">\r\n");
      out.write("\t\t\t\t<div class=\"modal-header\" style=\"text-align: center;\">\r\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\"\r\n");
      out.write("\t\t\t\t\t\taria-hidden=\"true\">&times;</button>\r\n");
      out.write("\t\t\t\t\t<h4 class=\"modal-title\" id=\"myModalLabel\">题目详情</h4>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"modal-body\">\r\n");
      out.write("\t\t\t\t\t<!-- modal start -->\r\n");
      out.write("\t\t\t\t\t<div class=\"step-pane active\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"step-pane active\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<form action=\"\" class=\"form-horizontal\" id=\"form_updateQuestion\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_s_005ftextfield_005f4(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_s_005ftextarea_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_s_005ftextfield_005f5(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\" style=\"margin-top: 5px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-xs-6 form-cell\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_s_005fselect_005f4(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-xs-6 form-cell\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_s_005fselect_005f5(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"modal-footer\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-default\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tdata-dismiss=\"modal\">关闭</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-primary\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tid=\"update_questionSub\">提交</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!-- model end -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- /.modal-content -->\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- /.modal -->\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- 添加试卷名模特框 -->\r\n");
      out.write("\t<script\r\n");
      out.write("\t\tsrc=\"");
      out.print(request.getContextPath());
      out.write("/resources/js/testQuestion.js\"></script>\r\n");
      out.write("\t<script\r\n");
      out.write("\t\tsrc=\"");
      out.print(request.getContextPath());
      out.write("/resources/js/elements/table.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_s_005fselect_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:select
    org.apache.struts2.views.jsp.ui.SelectTag _jspx_th_s_005fselect_005f0 = (org.apache.struts2.views.jsp.ui.SelectTag) _005fjspx_005ftagPool_005fs_005fselect_0026_005fvalue_005fonchange_005fname_005flistValue_005flistKey_005flist_005fid_005fheaderValue_005fheaderKey_005fcssClass.get(org.apache.struts2.views.jsp.ui.SelectTag.class);
    _jspx_th_s_005fselect_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fselect_005f0.setParent(null);
    // /WEB-INF/views/questionPage/question.jsp(36,6) name = list type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f0.setList("postList");
    // /WEB-INF/views/questionPage/question.jsp(36,6) name = listValue type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f0.setListValue("name");
    // /WEB-INF/views/questionPage/question.jsp(36,6) name = listKey type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f0.setListKey("id");
    // /WEB-INF/views/questionPage/question.jsp(36,6) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f0.setValue("post.id");
    // /WEB-INF/views/questionPage/question.jsp(36,6) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f0.setName("post.id");
    // /WEB-INF/views/questionPage/question.jsp(36,6) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f0.setId("up_post");
    // /WEB-INF/views/questionPage/question.jsp(36,6) name = cssClass type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f0.setCssClass("form-control");
    // /WEB-INF/views/questionPage/question.jsp(36,6) name = headerKey type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f0.setHeaderKey("");
    // /WEB-INF/views/questionPage/question.jsp(36,6) name = headerValue type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f0.setHeaderValue("请选择岗位");
    // /WEB-INF/views/questionPage/question.jsp(36,6) name = onchange type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f0.setOnchange("onSelectChange()");
    int _jspx_eval_s_005fselect_005f0 = _jspx_th_s_005fselect_005f0.doStartTag();
    if (_jspx_eval_s_005fselect_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fselect_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fselect_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fselect_005f0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_s_005fselect_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fselect_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fselect_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fselect_0026_005fvalue_005fonchange_005fname_005flistValue_005flistKey_005flist_005fid_005fheaderValue_005fheaderKey_005fcssClass.reuse(_jspx_th_s_005fselect_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fselect_0026_005fvalue_005fonchange_005fname_005flistValue_005flistKey_005flist_005fid_005fheaderValue_005fheaderKey_005fcssClass.reuse(_jspx_th_s_005fselect_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005fselect_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:select
    org.apache.struts2.views.jsp.ui.SelectTag _jspx_th_s_005fselect_005f1 = (org.apache.struts2.views.jsp.ui.SelectTag) _005fjspx_005ftagPool_005fs_005fselect_0026_005fvalue_005fonchange_005fname_005flistValue_005flistKey_005flist_005fid_005fheaderValue_005fheaderKey_005fcssClass.get(org.apache.struts2.views.jsp.ui.SelectTag.class);
    _jspx_th_s_005fselect_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005fselect_005f1.setParent(null);
    // /WEB-INF/views/questionPage/question.jsp(46,6) name = list type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f1.setList("typeList");
    // /WEB-INF/views/questionPage/question.jsp(46,6) name = listValue type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f1.setListValue("name");
    // /WEB-INF/views/questionPage/question.jsp(46,6) name = listKey type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f1.setListKey("id");
    // /WEB-INF/views/questionPage/question.jsp(46,6) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f1.setValue("type.id");
    // /WEB-INF/views/questionPage/question.jsp(46,6) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f1.setName("type.id");
    // /WEB-INF/views/questionPage/question.jsp(46,6) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f1.setId("up_type");
    // /WEB-INF/views/questionPage/question.jsp(46,6) name = cssClass type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f1.setCssClass("form-control");
    // /WEB-INF/views/questionPage/question.jsp(46,6) name = headerKey type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f1.setHeaderKey("");
    // /WEB-INF/views/questionPage/question.jsp(46,6) name = headerValue type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f1.setHeaderValue("请选择类型");
    // /WEB-INF/views/questionPage/question.jsp(46,6) name = onchange type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f1.setOnchange("onSelectChange()");
    int _jspx_eval_s_005fselect_005f1 = _jspx_th_s_005fselect_005f1.doStartTag();
    if (_jspx_eval_s_005fselect_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fselect_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fselect_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fselect_005f1.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_s_005fselect_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fselect_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fselect_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fselect_0026_005fvalue_005fonchange_005fname_005flistValue_005flistKey_005flist_005fid_005fheaderValue_005fheaderKey_005fcssClass.reuse(_jspx_th_s_005fselect_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fselect_0026_005fvalue_005fonchange_005fname_005flistValue_005flistKey_005flist_005fid_005fheaderValue_005fheaderKey_005fcssClass.reuse(_jspx_th_s_005fselect_005f1);
    return false;
  }

  private boolean _jspx_meth_s_005fiterator_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:iterator
    org.apache.struts2.views.jsp.IteratorTag _jspx_th_s_005fiterator_005f0 = (org.apache.struts2.views.jsp.IteratorTag) _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvar_005fvalue_005fstatus.get(org.apache.struts2.views.jsp.IteratorTag.class);
    _jspx_th_s_005fiterator_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fiterator_005f0.setParent(null);
    // /WEB-INF/views/questionPage/question.jsp(114,4) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fiterator_005f0.setValue("questionList");
    // /WEB-INF/views/questionPage/question.jsp(114,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fiterator_005f0.setVar("question");
    // /WEB-INF/views/questionPage/question.jsp(114,4) name = status type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fiterator_005f0.setStatus("st");
    int _jspx_eval_s_005fiterator_005f0 = _jspx_th_s_005fiterator_005f0.doStartTag();
    if (_jspx_eval_s_005fiterator_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fiterator_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fiterator_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fiterator_005f0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t<input id=\"questionNum\" type=\"hidden\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${st.count }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\">\r\n");
        out.write("\t\t\t\t\t<tr>\r\n");
        out.write("\t\t\t\t\t\t<td class=\"center\"><label class=\"position-relative\">\r\n");
        out.write("\t\t\t\t\t\t\t\t<input type=\"checkbox\" class=\"ace\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${question.id }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"\r\n");
        out.write("\t\t\t\t\t\t\t\tname=\"question.name\" /> <span class=\"lbl\"></span>\r\n");
        out.write("\t\t\t\t\t\t</label></td>\r\n");
        out.write("\r\n");
        out.write("\t\t\t\t\t\t<td>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${question.name }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</td>\r\n");
        out.write("\t\t\t\t\t\t<td>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${question.post.name }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</td>\r\n");
        out.write("\t\t\t\t\t\t<td>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${question.testquestionType.name }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</td>\r\n");
        out.write("\t\t\t\t\t\t<td>");
        if (_jspx_meth_c_005fchoose_005f0(_jspx_th_s_005fiterator_005f0, _jspx_page_context))
          return true;
        out.write("</td>\r\n");
        out.write("\t\t\t\t\t\t<td>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${question.rightOption }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</td>\r\n");
        out.write("\t\t\t\t\t\t<td>\r\n");
        out.write("\t\t\t\t\t\t\t");
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t<a id=\"deltQuestion\" onclick=\"deletQuestion('");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${question.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("')\"\r\n");
        out.write("\t\t\t\t\t\t\tstyle=\"cursor: pointer;\">删除</a> <a id=\"deltQuestion\"\r\n");
        out.write("\t\t\t\t\t\t\tonclick=\"updateQuestion('");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${question.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("')\"\r\n");
        out.write("\t\t\t\t\t\t\tstyle=\"cursor: pointer;\" data-toggle=\"modal\"\r\n");
        out.write("\t\t\t\t\t\t\tdata-target=\"#updateModal\">修改</a>\r\n");
        out.write("\t\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_s_005fiterator_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fiterator_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fiterator_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvar_005fvalue_005fstatus.reuse(_jspx_th_s_005fiterator_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvar_005fvalue_005fstatus.reuse(_jspx_th_s_005fiterator_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fchoose_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fchoose_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f0);
    int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
    if (_jspx_eval_c_005fchoose_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t");
        if (_jspx_meth_c_005fwhen_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t");
        if (_jspx_meth_c_005fotherwise_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fchoose_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fchoose_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fwhen_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
    // /WEB-INF/views/questionPage/question.jsp(126,8) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${question.testquestionType.name=='判断题' }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
    if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fwhen_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fwhen_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fotherwise_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_005fotherwise_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fotherwise_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
    int _jspx_eval_c_005fotherwise_005f0 = _jspx_th_c_005fotherwise_005f0.doStartTag();
    if (_jspx_eval_c_005fotherwise_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\tA.");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${question.option.optionA\r\n							}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("&nbsp;&nbsp;B.");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${question.option.optionB }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("&nbsp;&nbsp;C.");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${question.option.optionC\r\n							}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("&nbsp;&nbsp;D.");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${question.option.optionD }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("&nbsp;\r\n");
        out.write("\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fotherwise_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fotherwise_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005fselect_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:select
    org.apache.struts2.views.jsp.ui.SelectTag _jspx_th_s_005fselect_005f2 = (org.apache.struts2.views.jsp.ui.SelectTag) _005fjspx_005ftagPool_005fs_005fselect_0026_005fvalue_005fname_005flistValue_005flistKey_005flist_005fid_005fheaderValue_005fheaderKey_005fcssClass.get(org.apache.struts2.views.jsp.ui.SelectTag.class);
    _jspx_th_s_005fselect_005f2.setPageContext(_jspx_page_context);
    _jspx_th_s_005fselect_005f2.setParent(null);
    // /WEB-INF/views/questionPage/question.jsp(173,11) name = list type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f2.setList("postList");
    // /WEB-INF/views/questionPage/question.jsp(173,11) name = listValue type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f2.setListValue("name");
    // /WEB-INF/views/questionPage/question.jsp(173,11) name = listKey type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f2.setListKey("id");
    // /WEB-INF/views/questionPage/question.jsp(173,11) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f2.setValue("post.id");
    // /WEB-INF/views/questionPage/question.jsp(173,11) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f2.setName("post.id");
    // /WEB-INF/views/questionPage/question.jsp(173,11) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f2.setId("post");
    // /WEB-INF/views/questionPage/question.jsp(173,11) name = cssClass type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f2.setCssClass("form-control");
    // /WEB-INF/views/questionPage/question.jsp(173,11) name = headerKey type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f2.setHeaderKey("");
    // /WEB-INF/views/questionPage/question.jsp(173,11) name = headerValue type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f2.setHeaderValue("请选择岗位");
    int _jspx_eval_s_005fselect_005f2 = _jspx_th_s_005fselect_005f2.doStartTag();
    if (_jspx_eval_s_005fselect_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fselect_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fselect_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fselect_005f2.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_s_005fselect_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fselect_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fselect_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fselect_0026_005fvalue_005fname_005flistValue_005flistKey_005flist_005fid_005fheaderValue_005fheaderKey_005fcssClass.reuse(_jspx_th_s_005fselect_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fselect_0026_005fvalue_005fname_005flistValue_005flistKey_005flist_005fid_005fheaderValue_005fheaderKey_005fcssClass.reuse(_jspx_th_s_005fselect_005f2);
    return false;
  }

  private boolean _jspx_meth_s_005fselect_005f3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:select
    org.apache.struts2.views.jsp.ui.SelectTag _jspx_th_s_005fselect_005f3 = (org.apache.struts2.views.jsp.ui.SelectTag) _005fjspx_005ftagPool_005fs_005fselect_0026_005fvalue_005fonchange_005fname_005flistValue_005flistKey_005flist_005fid_005fheaderValue_005fheaderKey_005fcssClass.get(org.apache.struts2.views.jsp.ui.SelectTag.class);
    _jspx_th_s_005fselect_005f3.setPageContext(_jspx_page_context);
    _jspx_th_s_005fselect_005f3.setParent(null);
    // /WEB-INF/views/questionPage/question.jsp(179,11) name = list type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f3.setList("typeList");
    // /WEB-INF/views/questionPage/question.jsp(179,11) name = listValue type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f3.setListValue("name");
    // /WEB-INF/views/questionPage/question.jsp(179,11) name = listKey type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f3.setListKey("id");
    // /WEB-INF/views/questionPage/question.jsp(179,11) name = onchange type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f3.setOnchange("typeSelect()");
    // /WEB-INF/views/questionPage/question.jsp(179,11) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f3.setValue("type.id");
    // /WEB-INF/views/questionPage/question.jsp(179,11) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f3.setName("type.id");
    // /WEB-INF/views/questionPage/question.jsp(179,11) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f3.setId("type");
    // /WEB-INF/views/questionPage/question.jsp(179,11) name = cssClass type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f3.setCssClass("form-control");
    // /WEB-INF/views/questionPage/question.jsp(179,11) name = headerKey type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f3.setHeaderKey("");
    // /WEB-INF/views/questionPage/question.jsp(179,11) name = headerValue type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f3.setHeaderValue("请选择类型");
    int _jspx_eval_s_005fselect_005f3 = _jspx_th_s_005fselect_005f3.doStartTag();
    if (_jspx_eval_s_005fselect_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fselect_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fselect_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fselect_005f3.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_s_005fselect_005f3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fselect_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fselect_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fselect_0026_005fvalue_005fonchange_005fname_005flistValue_005flistKey_005flist_005fid_005fheaderValue_005fheaderKey_005fcssClass.reuse(_jspx_th_s_005fselect_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fselect_0026_005fvalue_005fonchange_005fname_005flistValue_005flistKey_005flist_005fid_005fheaderValue_005fheaderKey_005fcssClass.reuse(_jspx_th_s_005fselect_005f3);
    return false;
  }

  private boolean _jspx_meth_s_005ftextarea_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textarea
    org.apache.struts2.views.jsp.ui.TextareaTag _jspx_th_s_005ftextarea_005f0 = (org.apache.struts2.views.jsp.ui.TextareaTag) _005fjspx_005ftagPool_005fs_005ftextarea_0026_005fplaceholder_005fname_005fid_005fcssClass_005fnobody.get(org.apache.struts2.views.jsp.ui.TextareaTag.class);
    _jspx_th_s_005ftextarea_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextarea_005f0.setParent(null);
    // /WEB-INF/views/questionPage/question.jsp(187,10) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextarea_005f0.setName("question.name");
    // /WEB-INF/views/questionPage/question.jsp(187,10) name = cssClass type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextarea_005f0.setCssClass("form-control");
    // /WEB-INF/views/questionPage/question.jsp(187,10) null
    _jspx_th_s_005ftextarea_005f0.setDynamicAttribute(null, "placeholder", new String("题目"));
    // /WEB-INF/views/questionPage/question.jsp(187,10) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextarea_005f0.setId("questName");
    int _jspx_eval_s_005ftextarea_005f0 = _jspx_th_s_005ftextarea_005f0.doStartTag();
    if (_jspx_th_s_005ftextarea_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextarea_0026_005fplaceholder_005fname_005fid_005fcssClass_005fnobody.reuse(_jspx_th_s_005ftextarea_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextarea_0026_005fplaceholder_005fname_005fid_005fcssClass_005fnobody.reuse(_jspx_th_s_005ftextarea_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f0 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005ftype_005fname.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f0.setParent(null);
    // /WEB-INF/views/questionPage/question.jsp(209,42) name = type type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f0.setType("radio");
    // /WEB-INF/views/questionPage/question.jsp(209,42) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f0.setName("radio");
    // /WEB-INF/views/questionPage/question.jsp(209,42) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f0.setValue("A");
    int _jspx_eval_s_005ftextfield_005f0 = _jspx_th_s_005ftextfield_005f0.doStartTag();
    if (_jspx_eval_s_005ftextfield_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005ftextfield_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005ftextfield_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005ftextfield_005f0.doInitBody();
      }
      do {
        out.write('A');
        int evalDoAfterBody = _jspx_th_s_005ftextfield_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005ftextfield_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005ftextfield_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005ftype_005fname.reuse(_jspx_th_s_005ftextfield_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005ftype_005fname.reuse(_jspx_th_s_005ftextfield_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f1 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005ftype_005fname.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f1.setParent(null);
    // /WEB-INF/views/questionPage/question.jsp(211,51) name = type type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f1.setType("radio");
    // /WEB-INF/views/questionPage/question.jsp(211,51) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f1.setName("radio");
    // /WEB-INF/views/questionPage/question.jsp(211,51) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f1.setValue("B");
    int _jspx_eval_s_005ftextfield_005f1 = _jspx_th_s_005ftextfield_005f1.doStartTag();
    if (_jspx_eval_s_005ftextfield_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005ftextfield_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005ftextfield_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005ftextfield_005f1.doInitBody();
      }
      do {
        out.write('B');
        int evalDoAfterBody = _jspx_th_s_005ftextfield_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005ftextfield_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005ftextfield_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005ftype_005fname.reuse(_jspx_th_s_005ftextfield_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005ftype_005fname.reuse(_jspx_th_s_005ftextfield_005f1);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f2 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005ftype_005fname.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f2.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f2.setParent(null);
    // /WEB-INF/views/questionPage/question.jsp(213,51) name = type type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f2.setType("radio");
    // /WEB-INF/views/questionPage/question.jsp(213,51) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f2.setName("radio");
    // /WEB-INF/views/questionPage/question.jsp(213,51) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f2.setValue("C");
    int _jspx_eval_s_005ftextfield_005f2 = _jspx_th_s_005ftextfield_005f2.doStartTag();
    if (_jspx_eval_s_005ftextfield_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005ftextfield_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005ftextfield_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005ftextfield_005f2.doInitBody();
      }
      do {
        out.write('C');
        int evalDoAfterBody = _jspx_th_s_005ftextfield_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005ftextfield_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005ftextfield_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005ftype_005fname.reuse(_jspx_th_s_005ftextfield_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005ftype_005fname.reuse(_jspx_th_s_005ftextfield_005f2);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f3 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005ftype_005fname.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f3.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f3.setParent(null);
    // /WEB-INF/views/questionPage/question.jsp(215,51) name = type type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f3.setType("radio");
    // /WEB-INF/views/questionPage/question.jsp(215,51) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f3.setName("radio");
    // /WEB-INF/views/questionPage/question.jsp(215,51) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f3.setValue("D");
    int _jspx_eval_s_005ftextfield_005f3 = _jspx_th_s_005ftextfield_005f3.doStartTag();
    if (_jspx_eval_s_005ftextfield_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005ftextfield_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005ftextfield_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005ftextfield_005f3.doInitBody();
      }
      do {
        out.write('D');
        int evalDoAfterBody = _jspx_th_s_005ftextfield_005f3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005ftextfield_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005ftextfield_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005ftype_005fname.reuse(_jspx_th_s_005ftextfield_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005ftype_005fname.reuse(_jspx_th_s_005ftextfield_005f3);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f4 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005ftype_005fname_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f4.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f4.setParent(null);
    // /WEB-INF/views/questionPage/question.jsp(256,9) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f4.setName("question.id");
    // /WEB-INF/views/questionPage/question.jsp(256,9) name = type type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f4.setType("hidden");
    // /WEB-INF/views/questionPage/question.jsp(256,9) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f4.setId("update_questionId");
    int _jspx_eval_s_005ftextfield_005f4 = _jspx_th_s_005ftextfield_005f4.doStartTag();
    if (_jspx_th_s_005ftextfield_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005ftype_005fname_005fid_005fnobody.reuse(_jspx_th_s_005ftextfield_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005ftype_005fname_005fid_005fnobody.reuse(_jspx_th_s_005ftextfield_005f4);
    return false;
  }

  private boolean _jspx_meth_s_005ftextarea_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textarea
    org.apache.struts2.views.jsp.ui.TextareaTag _jspx_th_s_005ftextarea_005f1 = (org.apache.struts2.views.jsp.ui.TextareaTag) _005fjspx_005ftagPool_005fs_005ftextarea_0026_005fplaceholder_005fname_005fid_005fcssClass_005fnobody.get(org.apache.struts2.views.jsp.ui.TextareaTag.class);
    _jspx_th_s_005ftextarea_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextarea_005f1.setParent(null);
    // /WEB-INF/views/questionPage/question.jsp(259,10) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextarea_005f1.setName("question.name");
    // /WEB-INF/views/questionPage/question.jsp(259,10) name = cssClass type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextarea_005f1.setCssClass("form-control");
    // /WEB-INF/views/questionPage/question.jsp(259,10) null
    _jspx_th_s_005ftextarea_005f1.setDynamicAttribute(null, "placeholder", new String("题目"));
    // /WEB-INF/views/questionPage/question.jsp(259,10) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextarea_005f1.setId("update_questName");
    int _jspx_eval_s_005ftextarea_005f1 = _jspx_th_s_005ftextarea_005f1.doStartTag();
    if (_jspx_th_s_005ftextarea_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextarea_0026_005fplaceholder_005fname_005fid_005fcssClass_005fnobody.reuse(_jspx_th_s_005ftextarea_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextarea_0026_005fplaceholder_005fname_005fid_005fcssClass_005fnobody.reuse(_jspx_th_s_005ftextarea_005f1);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f5 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fplaceholder_005fname_005fid_005fcssClass_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f5.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f5.setParent(null);
    // /WEB-INF/views/questionPage/question.jsp(267,10) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f5.setName("question.rightOption");
    // /WEB-INF/views/questionPage/question.jsp(267,10) name = cssClass type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f5.setCssClass("form-control");
    // /WEB-INF/views/questionPage/question.jsp(267,10) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f5.setId("update_rightOption");
    // /WEB-INF/views/questionPage/question.jsp(267,10) null
    _jspx_th_s_005ftextfield_005f5.setDynamicAttribute(null, "placeholder", new String("答案"));
    int _jspx_eval_s_005ftextfield_005f5 = _jspx_th_s_005ftextfield_005f5.doStartTag();
    if (_jspx_th_s_005ftextfield_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fplaceholder_005fname_005fid_005fcssClass_005fnobody.reuse(_jspx_th_s_005ftextfield_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fplaceholder_005fname_005fid_005fcssClass_005fnobody.reuse(_jspx_th_s_005ftextfield_005f5);
    return false;
  }

  private boolean _jspx_meth_s_005fselect_005f4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:select
    org.apache.struts2.views.jsp.ui.SelectTag _jspx_th_s_005fselect_005f4 = (org.apache.struts2.views.jsp.ui.SelectTag) _005fjspx_005ftagPool_005fs_005fselect_0026_005fvalue_005fname_005flistValue_005flistKey_005flist_005fid_005fheaderValue_005fheaderKey_005fcssClass.get(org.apache.struts2.views.jsp.ui.SelectTag.class);
    _jspx_th_s_005fselect_005f4.setPageContext(_jspx_page_context);
    _jspx_th_s_005fselect_005f4.setParent(null);
    // /WEB-INF/views/questionPage/question.jsp(274,11) name = list type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f4.setList("postList");
    // /WEB-INF/views/questionPage/question.jsp(274,11) name = listValue type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f4.setListValue("name");
    // /WEB-INF/views/questionPage/question.jsp(274,11) name = listKey type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f4.setListKey("id");
    // /WEB-INF/views/questionPage/question.jsp(274,11) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f4.setValue("post.id");
    // /WEB-INF/views/questionPage/question.jsp(274,11) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f4.setName("post.id");
    // /WEB-INF/views/questionPage/question.jsp(274,11) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f4.setId("update_post");
    // /WEB-INF/views/questionPage/question.jsp(274,11) name = cssClass type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f4.setCssClass("form-control");
    // /WEB-INF/views/questionPage/question.jsp(274,11) name = headerKey type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f4.setHeaderKey("");
    // /WEB-INF/views/questionPage/question.jsp(274,11) name = headerValue type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f4.setHeaderValue("请选择岗位");
    int _jspx_eval_s_005fselect_005f4 = _jspx_th_s_005fselect_005f4.doStartTag();
    if (_jspx_eval_s_005fselect_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fselect_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fselect_005f4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fselect_005f4.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_s_005fselect_005f4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fselect_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fselect_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fselect_0026_005fvalue_005fname_005flistValue_005flistKey_005flist_005fid_005fheaderValue_005fheaderKey_005fcssClass.reuse(_jspx_th_s_005fselect_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fselect_0026_005fvalue_005fname_005flistValue_005flistKey_005flist_005fid_005fheaderValue_005fheaderKey_005fcssClass.reuse(_jspx_th_s_005fselect_005f4);
    return false;
  }

  private boolean _jspx_meth_s_005fselect_005f5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:select
    org.apache.struts2.views.jsp.ui.SelectTag _jspx_th_s_005fselect_005f5 = (org.apache.struts2.views.jsp.ui.SelectTag) _005fjspx_005ftagPool_005fs_005fselect_0026_005fvalue_005fname_005flistValue_005flistKey_005flist_005fid_005fheaderValue_005fheaderKey_005fcssClass.get(org.apache.struts2.views.jsp.ui.SelectTag.class);
    _jspx_th_s_005fselect_005f5.setPageContext(_jspx_page_context);
    _jspx_th_s_005fselect_005f5.setParent(null);
    // /WEB-INF/views/questionPage/question.jsp(280,11) name = list type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f5.setList("typeList");
    // /WEB-INF/views/questionPage/question.jsp(280,11) name = listValue type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f5.setListValue("name");
    // /WEB-INF/views/questionPage/question.jsp(280,11) name = listKey type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f5.setListKey("id");
    // /WEB-INF/views/questionPage/question.jsp(280,11) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f5.setValue("type.id");
    // /WEB-INF/views/questionPage/question.jsp(280,11) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f5.setName("type.id");
    // /WEB-INF/views/questionPage/question.jsp(280,11) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f5.setId("update_type");
    // /WEB-INF/views/questionPage/question.jsp(280,11) name = cssClass type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f5.setCssClass("form-control");
    // /WEB-INF/views/questionPage/question.jsp(280,11) name = headerKey type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f5.setHeaderKey("");
    // /WEB-INF/views/questionPage/question.jsp(280,11) name = headerValue type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f5.setHeaderValue("请选择类型");
    int _jspx_eval_s_005fselect_005f5 = _jspx_th_s_005fselect_005f5.doStartTag();
    if (_jspx_eval_s_005fselect_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fselect_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fselect_005f5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fselect_005f5.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_s_005fselect_005f5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fselect_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fselect_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fselect_0026_005fvalue_005fname_005flistValue_005flistKey_005flist_005fid_005fheaderValue_005fheaderKey_005fcssClass.reuse(_jspx_th_s_005fselect_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fselect_0026_005fvalue_005fname_005flistValue_005flistKey_005flist_005fid_005fheaderValue_005fheaderKey_005fcssClass.reuse(_jspx_th_s_005fselect_005f5);
    return false;
  }
}
