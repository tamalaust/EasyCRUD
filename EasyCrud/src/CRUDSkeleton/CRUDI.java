package CRUDSkeleton;

import java.util.Map;

import org.json.JSONObject;

/*DEFINE ALL THE POSSIBLE CRUD OPERATION NEEDED WITH DATABASE*/
/*MUST HAVE DEPENDECY
 * 
 * 1.TABLE NAME
 * 2.OBJECT SO WE CAN FIGURE OUT THE PROPERTIES FROM THE MODEL (TAKE LOOK AT MAIN.CLASS HOW TO DO)
 * 3.MODEL SHOULD DEFINE PROPETIES EQUIVALENT TO DB
 * 
 * */

/*ISSUES:
 * 
	1.SUPPORT COMPLEX QUERIES LIKE UNION,JOIN ETC
	
*/



public interface CRUDI {
	
	/*FOR ANY INSERT "" OR NULL VALUE WILL INSERT AS NULL SO DEVELOPER RESPONSIBILTY IF HE WANTS TO INSERT NULL OR NOT*/
	
	/*SIMPLE INSERT WILL NOT RETURN ANYTHING*/
	public void insert(String tableName,Object model,JSONObject objecttoInsert); 
	
	/*SIMPLE INSERT WILL RETURN THE GENERATED KEY*/
	public int insertWithGeneratedKey(String tableName,Object model,JSONObject objecttoInsert);
	
	/*SIMPLE UPDATE WILL NOT RETURN ANYTHING*/
	
	/*PLANNING TO LOOP THROUGH MAP AND BUILD UPDATE QUERY
	 * ISSUE: SUPPORT FOR DIFFRENT TYPE OF DATATYPE (INT,DATE). STRING IS NOT THE DEAL
	 * 
	 */
	public void update(String tableName,Object model,Map<String, String> fieldsToUpdate,String[] whereClauseFields); 
	
	
	/*SIMPLE DELETE WILL NOT RETURN ANYTHING*/
	
	public void delete(String tableName,Object model,Map<String, String> fieldsToUpdate,String[] whereClauseFields); 

}
