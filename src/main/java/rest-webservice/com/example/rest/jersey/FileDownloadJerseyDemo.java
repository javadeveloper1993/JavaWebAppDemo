package com.example.rest.jersey;

import java.io.File;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

/**
 * @author Maulik
 * 
 */
@Path("/fileDownload")
public class FileDownloadJerseyDemo {

	private static final String TEXT_FILE_PATH = "E:\\MyText.txt";
	private static final String IMAGE_FILE_PATH = "E:\\s.jpg";
	private static final String PDF_FILE_PATH = "E:\\p.pdf";
	private static final String EXCEL_FILE_PATH = "E:\\e.xlsx";

	@GET
	@Path("/textFile")
	@Produces("text/plain")
	public Response getFile() {
		File file = new File(TEXT_FILE_PATH);
		ResponseBuilder response = Response.ok((Object) file);
		response.header("Content-Disposition",
				"attachment; filename=\"MyText.txt\"");
		return response.build();

	}

	@GET
	@Path("/imageFile")
	@Produces("image/png")
	public Response getImageFile() {
		File file = new File(IMAGE_FILE_PATH);
		ResponseBuilder response = Response.ok((Object) file);
		response.header("Content-Disposition",
				"attachment; filename=Image_from_server.png");
		return response.build();

	}

	@GET
	@Path("/pdfFile")
	@Produces("application/pdf")
	public Response getPDFFile() {
		File file = new File(PDF_FILE_PATH);
		ResponseBuilder response = Response.ok((Object) file);
		response.header("Content-Disposition",
				"attachment; filename=Pdf_from_server.pdf");
		return response.build();

	}

	@GET
	@Path("/excelFile")
	@Produces("application/vnd.ms-excel")
	public Response getExcelFile() {
		File file = new File(EXCEL_FILE_PATH);
		ResponseBuilder response = Response.ok((Object) file);
		response.header("Content-Disposition",
				"attachment; filename=ExcelFile.xls");
		return response.build();

	}
}
