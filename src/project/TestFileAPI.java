package project;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

import java.io.File;

public class TestFileAPI {

	public static File file = new File("../testfile.rtf");
	public static File directory = new File("../test");
	public static File unreadableFile = new File("unreadablefile.rtf");
	public static File readOnlyFile = new File("../../readonlyfile.rtf");
	
	
	@Test
	public void testIsDirectory1() throws IOException {
		
		assertEquals(directory.isDirectory(),true);
	}
	
	@Test
	public void testIsDirectory2() {
		assertFalse(file.isDirectory());
	}
	
	@Test
	public void testIsFile1() {
		assertFalse(directory.isFile());
	}
	
	@Test 
	public void testIsFile2() throws Exception{
		System.out.println(file.getCanonicalFile());
		assertTrue(file.isFile());
	}
	
	@Test
	public void testCanExecute1() {
		assertTrue(directory.canExecute());
	}
	
	@Test
	public void testCanExecute2() {
		assertTrue(file.canExecute());
	}
	
	@Test
	public void testCanWrite() throws IOException {
		System.out.println(readOnlyFile.getCanonicalPath());
		assertTrue(readOnlyFile.exists());
		//assertFalse(readOnlyFile.canWrite());
	}
	
//
//  	@Test
//	public void testExists1() {
//		assertTrue(file.exists());
//	}
//	
//	@Test
//	public void testGetAbsolutePath() {
//		assertEquals("xxxxxxx", readOnlyFile.getAbsolutePath());
//	}
//	
//	@Test
//	public void testGetCanonicalPath() throws Exception {
//		assertEquals("xxxxxxx", readOnlyFile.getCanonicalPath());
//	}
//	
//	@Test
//	public void testGetParent1() {
//		assertEquals("xxxxxx", directory.getParent());
//	}
//
//	@Test
//	public void testGetParent2() {
//		assertEquals("xxxxxx", readOnlyFile.getParent());
//	}
//
//	@Test
//	public void testGetPath() {
//		assertEquals("xxxxxx", readOnlyFile.getPath());
//	}
//	
//	@Test 
//	public void testGetName() {
//		assertEquals("xxxxxx",readOnlyFile.getName());
//	}
//	
//	@Test
//	public void testToString() {
//		assertEquals("xxxxxx",directory.toString());
//	}
//	
//	@Test
//	public void testList() {
//		assertEquals(directory.list().length,5);
//	}

}


