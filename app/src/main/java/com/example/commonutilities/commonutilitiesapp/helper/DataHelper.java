package com.example.commonutilities.commonutilitiesapp.helper;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;


/**
 * The Class DataHelper.
 */
public class DataHelper {

	/** The Constant DATABASE_NAME. */
	private static final String DATABASE_NAME = "DBNAME.db";

	/** The Constant DATABASE_NAME. */
	private static final String TAG = "query";

	/** The Constant DATABASE_VERSION. */
	private static final int DATABASE_VERSION = 1;

	/** The context context. */
	private Context context;

	/** The database db. */
	private SQLiteDatabase db;

	private static DataHelper sDataHelper = null;

	/**
	 * Instantiates a new data helper.
	 *
	 * @param context
	 *            the context
	 */
	private DataHelper(Context context) {
		this.context = context;
		OpenHelper openHelper = new OpenHelper(this.context);
		this.db = openHelper.getWritableDatabase();
	}

	public static DataHelper getInstance(Context ctx) {
		if (sDataHelper == null) {
			sDataHelper = new DataHelper(ctx.getApplicationContext());
		} // if
		return sDataHelper;
	}

	/* execute insert update query */
	public void executeQuery(String query) {
		try {
			db.execSQL(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
//
//	public ArrayList<TrendingyoyosModel> getLocalTrendingyoyosList(String user_id) {
//		ArrayList<TrendingyoyosModel> trendingyoyosModelList = new ArrayList<>();
//		try {
//			String query = "SELECT * FROM "+ QueryConstants.LOCAL_TRENDING_yoyoS_TABLE +" WHERE "+QueryConstants.USER_ID+" = '"+user_id+"'";
//			Cursor cur = db.rawQuery(query,null);
//			while(cur.moveToNext()) {
//				TrendingyoyosModel model = new TrendingyoyosModel();
//				model.setyoyoID(cur.getString(cur.getColumnIndex(QueryConstants.yoyo_ID)));
//
//				model.setProfileImageURL(cur.getString(cur.getColumnIndex(QueryConstants.USER_PROFILE_IMG)));
//				model.setyoyo_cSnippet(cur.getString(cur.getColumnIndex(QueryConstants.yoyo_CSNIPPET)));
//				model.setLikes_count(cur.getString(cur.getColumnIndex(QueryConstants.LIKES)));
//				model.setDislikes_count(cur.getString(cur.getColumnIndex(QueryConstants.DISLIKES)));
//				model.setP_user_name(cur.getString(cur.getColumnIndex(QueryConstants.P_USER_NAME)));
//				model.setReply_count(cur.getString(cur.getColumnIndex(QueryConstants.REPLIES)));
//				model.setReyoyos_count(cur.getString(cur.getColumnIndex(QueryConstants.REyoyoS)));
//				model.setFav_count(cur.getString(cur.getColumnIndex(QueryConstants.FAVS)));
//				model.setTitle(cur.getString(cur.getColumnIndex(QueryConstants.TITLE)));
//
////			List<String> yoyoImagesURLArray = Arrays.asList(cur.getString(cur.getColumnIndex(QueryConstants.yoyo_IMAGES_URL_ARRAY)).split("\\s*,\\s*"));
//				ArrayList<String> yoyoImagesURLArray = new ArrayList<>(Arrays.asList(cur.getString(cur.getColumnIndex(QueryConstants.yoyo_IMAGES_URL_ARRAY)).split(",")));
//				model.setyoyosImagesArray(yoyoImagesURLArray);
//
////			List<String> yoyoChannelsArray = Arrays.asList(cur.getString(cur.getColumnIndex(QueryConstants.yoyo_CHANNELS_ARRAY)).split("\\s*,\\s*"));
//				ArrayList<String> yoyoChannelsArray = new ArrayList<>(Arrays.asList(cur.getString(cur.getColumnIndex(QueryConstants.yoyo_CHANNELS_ARRAY)).split(",")));
//				model.setyoyosImagesArray(yoyoChannelsArray);
//
//				model.setCreatedDateTime(cur.getString(cur.getColumnIndex(QueryConstants.CREATED_AT)));
//				model.setIsyoyoAlreadyLiked((cur.getInt(cur.getColumnIndex(QueryConstants.IS_ALREADY_LIKED)) == 1)? true : false);
//				model.setIsyoyoAlreadyDisliked((cur.getInt(cur.getColumnIndex(QueryConstants.IS_ALREADY_DISLIKED)) == 1)? true : false);
//
//				trendingyoyosModelList.add(model);
//			}
//			cur.close();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//		return trendingyoyosModelList;
//	}

//	public ArrayList<MsgUserModel> getRecentMsgsGroupByUsers(Context ctx, String user_id, int isStranger) {
//		ArrayList<MsgUserModel> userMsgsModelList = new ArrayList<>();
//		try {
////			String query = "SELECT U."+QueryConstants.USER_FRIENDLY_NAME+",U."+QueryConstants.USER_PROFILE_IMG+", M.* FROM "+QueryConstants.MESSAGES_TABLE +" AS M left join "+QueryConstants.USER_BRIEF_TABLE+" AS U ON M."+QueryConstants.MSG_FROM_USER_ID+" = U."+QueryConstants.USER_ID+" WHERE M."+QueryConstants.USER_ID+" = '"+user_id+"' " +
//////					"AND "+QueryConstants.MSG_RECEIVER+" = '0'" +
////					" AND M."+QueryConstants.MSG_STRANGER+" = '"+isStranger+"' " +
////					"GROUP BY M."+QueryConstants.MSG_FROM_USER_ID+" ORDER BY MAX(M."+QueryConstants.MSG_CREATED_AT+") DESC";
//
//
//			// temporary query - removed date time sorting
//
//
//			String query = "SELECT U."+QueryConstants.USER_FRIENDLY_NAME+",U."+QueryConstants.USER_PROFILE_IMG+", M.* FROM "+QueryConstants.MESSAGES_TABLE +" AS M left join "+QueryConstants.USER_BRIEF_TABLE+" AS U ON M."+QueryConstants.MSG_FROM_USER_ID+" = U."+QueryConstants.USER_ID+" WHERE M."+QueryConstants.USER_ID+" = '"+user_id+"' " +
////					"AND "+QueryConstants.MSG_RECEIVER+" = '0'" +
//					" AND M."+QueryConstants.MSG_STRANGER+" = '"+isStranger+"' " +
//					"GROUP BY M."+QueryConstants.MSG_FROM_USER_ID+" ORDER BY M.rowid DESC";
//
//
//
//			Log.d(TAG,query);
//
//			Cursor cur = db.rawQuery(query,null);
//			while(cur.moveToNext()) {
//				MsgUserModel model = new MsgUserModel();
//
//
//
//				model.setUser_id(cur.getString(cur.getColumnIndex(QueryConstants.MSG_FROM_USER_ID)));
//
//				model.setLast_msg_at(cur.getString(cur.getColumnIndex(QueryConstants.MSG_CREATED_AT)));
//				model.setProfile_image(cur.getString(1));
//				model.setUser_friendly_name(cur.getString(0));
//				model.setMsgs_count(String.valueOf(getUnreadMSGCountFromSpecificUser(AppSharedPreferences.loadUserIDPreference(ctx), model.getUser_id())));
////				if(cur.getString(cur.getColumnIndex(QueryConstants.MSG_CONTENT)).equalsIgnoreCase("")) {
////					model.setMsg_content("Photo");
////				} else {
//				model.setMsg_content(cur.getString(cur.getColumnIndex(QueryConstants.MSG_CONTENT)));
////				}
//				userMsgsModelList.add(model);
//			}
//			cur.close();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//		return userMsgsModelList;
//	}



//	public void updateUserSpecificMessagesStatusToRead(String user_id, String from_user_id) {
//		try {
//			String query = "UPDATE "+QueryConstants.MESSAGES_TABLE+" SET "+QueryConstants.MSG_READ_STATUS +" = '1' WHERE "+QueryConstants.USER_ID +" = '"+user_id+"' AND "+QueryConstants.MSG_FROM_USER_ID +" = '"+from_user_id+"'";
//			db.execSQL(query);
//
//			Log.d(TAG, "query:" + query);
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//	}
//
//	public void deleteSpecificMessages(String user_id, String from_user_id, String msg_id) {
//		try {
//			String query = "DELETE FROM "+QueryConstants.MESSAGES_TABLE+" WHERE "+QueryConstants.USER_ID +" = '"+user_id+"' AND "+QueryConstants.MSG_FROM_USER_ID +" = '"+from_user_id+"' AND "+QueryConstants.MSG_SERVER_MSG_ID +" = '"+msg_id+"'";
//			db.execSQL(query);
//
//			Log.d(TAG, "query:" + query);
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//	}




//	public int getUnreadMSGCountFromSpecificUser(String user_id, String from_user_id) {
//		int count = 0;
//		try {
//			String query = "SELECT Count(*) FROM "+QueryConstants.MESSAGES_TABLE +" WHERE "+QueryConstants.USER_ID+" = '"+user_id+"' " +
//					"AND "+QueryConstants.MSG_FROM_USER_ID+" = '"+from_user_id+"' AND "+QueryConstants.MSG_RECEIVER+" = '1' AND "+QueryConstants.MSG_READ_STATUS+" = '0' ";
//			Log.d(TAG, query);
//			Cursor cur = db.rawQuery(query,null);
//			if(cur.moveToFirst()) {
//				count = cur.getInt(0);
//			}
//			cur.close();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//		return count;
//	}




//public void deleteAllChannels(String user_id) {
//		try {
//
//
//
//
//
//
//
//			String query = "DELETE FROM "+QueryConstants.FOLLOWING_CHANNELS_TABLE+" WHERE "+QueryConstants.USER_ID+" = '"+user_id+"'";
//
//			db.execSQL(query);
//
//			Log.d(TAG, "query:" + query);
//
//
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}



	/**
	 * Closes the database.
	 */
	public void close() {
		this.db.close();
	}

	/**
	 * The Class OpenHelper.
	 */
	private static class OpenHelper extends SQLiteOpenHelper {

		/**
		 * Instantiates a new open helper.
		 *
		 * @param context
		 *            the context
		 */
		OpenHelper(Context context) {
			super(context, DATABASE_NAME, null, DATABASE_VERSION);
//			super(context, Environment.getExternalStorageDirectory()
//					+ File.separator + "/DataBase/" + File.separator
//					+ DATABASE_NAME, null, DATABASE_VERSION);
		}

		/**
		 * On create called when DB is created.
		 *
		 * @param the
		 *            database
		 */
		@Override
		public void onCreate(SQLiteDatabase db) {

			db.execSQL(QueryConstants.CREATE_USER_TABLE);



		}

		/**
		 * On upgrade called when DB is upgraded.
		 *
		 * @param the
		 *            database
		 * @param the
		 *            old version number
		 * @param the
		 *            new version number
		 */
		@Override
		public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
			Log.w("Example",
					"Upgrading database, this will drop tables and recreate.");
			db.execSQL(QueryConstants.DROP_USER_TABLE);
			onCreate(db);



		}
	}
}