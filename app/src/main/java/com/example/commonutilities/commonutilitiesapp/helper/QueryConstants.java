package com.example.commonutilities.commonutilitiesapp.helper;

public class QueryConstants {

//	table names

	public static final String WW_TRENDING_yoyoS_TABLE = "ww_trending_yoyos";
	public static final String LOCAL_TRENDING_yoyoS_TABLE = "local_trending_yoyos";
	public static final String USER_TABLE = "user";
	public static final String FOLLOWING_CHANNELS_TABLE = "following_channels";
	public static final String NOTIFICATIONS_TABLE = "notifications";
	public static final String MESSAGES_TABLE = "messages";
	public static final String PEOPLE_FOLLOW_TABLE = "PeoplesFollow";
	public static final String USER_BRIEF_TABLE = "UserBrief";


//	column names

	public static final String USER_ID = "user_id";
	public static final String yoyo_ID = "yoyo_id";
//	public static final String PROFILE_IMG_URL = "profile_img_url";
	public static final String yoyo_CSNIPPET = "yoyo_content_snippet";
	public static final String LIKES = "likes";
	public static final String DISLIKES = "dislikes";
	public static final String P_USER_NAME = "p_user_name";
	public static final String REPLIES = "replies";
	public static final String REyoyoS = "reyoyos";
	public static final String FAVS = "favs";
	public static final String TITLE = "title";
	public static final String yoyo_IMAGES_URL_ARRAY = "yoyoImagesURLArray";
	public static final String yoyo_CHANNELS_ARRAY = "yoyoChannelsArray";
	public static final String CREATED_AT = "created_at";
	public static final String IS_ALREADY_LIKED = "isAlreadyLiked";
	public static final String IS_ALREADY_DISLIKED = "isAlreadyDisliked";
	public static final String USER_NAME = "user_name";
	public static final String USER_EMAIL = "user_email";
	public static final String USER_FRIENDLY_NAME = "user_friendly_name";
	public static final String USER_ISO_LANGUAGE_CODE = "iso_language_code";
	public static final String USER_COUNTRY = "country";
	public static final String USER_LOCATION = "location";
	public static final String USER_DETAILS = "details";
	public static final String USER_URLS = "URLs";
	public static final String USER_CREATED_AT = "created_at";
	public static final String USER_PROFILE_IMG = "profile_image";
	public static final String USER_BG_IMG = "background_image";
	public static final String USER_LIKES = "likes";
	public static final String USER_DISLIKES = "dislikes";
	public static final String USER_FAVS = "favs";
	public static final String USER_yoyoS = "yoyos";
	public static final String USER_REPLIES = "replies";
	public static final String USER_REyoyoS = "reyoyos";
	public static final String USER_SHARES = "shares";
	public static final String USER_FOLLOWERS = "followers";
	public static final String USER_FOLLOWINGS = "followings";
	public static final String USER_STATUS = "status";
	public static final String USER_AT = "at";
	public static final String USER_IS_MUTED = "isMuted";
	public static final String USER_IS_BLOCKED = "isBlocked";
	public static final String CHANNEL_NAME = "channel_name";
	public static final String IS_CHANNNEL_FOLLOWED = "isChannelFollowed";
	public static final String NOTE_ID = "note_id";
	public static final String NOTE_TYPE = "note_type";
	public static final String NOTE_CONTENT = "note_content";
	public static final String yoyo_OR_MSG_ID = "yoyo_or_msg_id";
	public static final String ORIGINAL_USER_ID = "original_user_id";
	public static final String NOTIFICATION_READ_STATUS = "read_status";
	public static final String MSG_FROM_USER_ID = "from_user_id";
	public static final String MSG_CONTENT = "msg_content";
	public static final String MSG_IMAGES = "images";
	public static final String MSG_CREATED_AT = "created_at";
	public static final String MSG_PROFILE_IMAGE = "profile_img";
	public static final String MSG_RECEIVER = "receiver";
	public static final String MSG_SERVER_MSG_ID = "server_msg_id";
	public static final String MSG_USER_NAME = "user_name";
	public static final String MSG_STRANGER = "stranger";
	public static final String MSG_URL = "msg_url";
	public static final String MSG_ISO_CODE = "msg_iso_code";
	public static final String MSG_READ_STATUS = "msg_read_status";
	public static final String PEOPLE_USER_ID = "people_user_id";
	public static final String PEOPLE_USER_NAME = "people_user_name";
	public static final String PEOPLE_USER_FRIENDLY_NAME = "people_user_friendly_name";
	public static final String PEOPLE_PROFILE_IMAGE = "people_profile_image";
	public static final String PEOPLE_DETAILS = "people_details";
	public static final String PEOPLE_IS_PEOPLE_FOLLOWING_ME = "IsPeopleFollowingMe";
	public static final String PEOPLE_AM_I_FOLLOWING_PEOPLE = "AmIFollowingPeople";










	/* CREATE TABLE QUERIES */



	public static final String CREATE_WW_TRENDING_yoyoS_TABLE = "CREATE TABLE IF NOT EXISTS "+WW_TRENDING_yoyoS_TABLE+" "
			+ "("+USER_ID+" TEXT  , "
			+ yoyo_ID+" TEXT, " + USER_PROFILE_IMG+"  TEXT, "+yoyo_CSNIPPET+" TEXT, "+LIKES+" TEXT, "
			+ DISLIKES+" TEXT, " + P_USER_NAME+"  TEXT, " + REPLIES+"  TEXT, " + REyoyoS+"  TEXT, "
			+ FAVS+" TEXT, " + TITLE+"  TEXT, " + yoyo_IMAGES_URL_ARRAY+"  TEXT, " + yoyo_CHANNELS_ARRAY+"  TEXT, "
			+ CREATED_AT+" TEXT, " + IS_ALREADY_LIKED+"  INTEGER, " + IS_ALREADY_DISLIKED+"  INTEGER, PRIMARY KEY ("+USER_ID+","+yoyo_ID+")" +
			")";

	public static final String CREATE_LOCAL_TRENDING_yoyoS_TABLE = "CREATE TABLE IF NOT EXISTS "+LOCAL_TRENDING_yoyoS_TABLE+" "
			+ "("+USER_ID+" TEXT  , "
			+ yoyo_ID+" TEXT, " + USER_PROFILE_IMG+"  TEXT, "+yoyo_CSNIPPET+" TEXT, "+LIKES+" TEXT, "
			+ DISLIKES+" TEXT, " + P_USER_NAME+"  TEXT, " + REPLIES+"  TEXT, " + REyoyoS+"  TEXT, "
			+ FAVS+" TEXT, " + TITLE+"  TEXT, " + yoyo_IMAGES_URL_ARRAY+"  TEXT, " + yoyo_CHANNELS_ARRAY+"  TEXT, "
			+ CREATED_AT+" TEXT, " + IS_ALREADY_LIKED+"  INTEGER, " + IS_ALREADY_DISLIKED+"  INTEGER, PRIMARY KEY ("+USER_ID+","+yoyo_ID+")" +
			")";


	public static final String CREATE_USER_TABLE = "CREATE TABLE IF NOT EXISTS "+USER_TABLE+" "
			+ "("+USER_ID+" TEXT  PRIMARY KEY, "
			+ USER_NAME+" TEXT, " + USER_EMAIL+"  TEXT, "+USER_FRIENDLY_NAME+" TEXT, "+USER_ISO_LANGUAGE_CODE+" TEXT, "
			+ USER_COUNTRY+" TEXT, " + USER_LOCATION+"  TEXT, " + USER_DETAILS+"  TEXT, " + USER_URLS+"  TEXT, "
			+ USER_CREATED_AT+" TEXT, " + USER_PROFILE_IMG+"  TEXT, " + USER_BG_IMG+"  TEXT, " + USER_LIKES+"  TEXT, "
			+ USER_DISLIKES+" TEXT, " + USER_FAVS+"  TEXT, " + USER_yoyoS+"  TEXT, "+USER_REPLIES+"  TEXT, "+USER_REyoyoS+"  TEXT, "
			+USER_SHARES+"  TEXT,"+ USER_FOLLOWERS+"  TEXT,"+USER_FOLLOWINGS+"  TEXT,"+USER_STATUS+"  TEXT,"+USER_AT+"  TEXT,"+USER_IS_MUTED+"  TEXT,"+USER_IS_BLOCKED+"  TEXT)";

	public static final String CREATE_FOLLOWING_CHANNELS_TABLE = "CREATE TABLE IF NOT EXISTS "+FOLLOWING_CHANNELS_TABLE+" "
			+ "("+USER_ID+" TEXT  NOT NULL, "
			+ CHANNEL_NAME+" TEXT COLLATE NOCASE NOT NULL, " + IS_CHANNNEL_FOLLOWED +"  INTEGER NOT NULL,  PRIMARY KEY ("+USER_ID+","+CHANNEL_NAME+"))";

	public static final String CREATE_NOTIFICATIONS_TABLE = "CREATE TABLE IF NOT EXISTS "+NOTIFICATIONS_TABLE+" "
			+ "("+USER_ID+" TEXT  NOT NULL, "
			+ NOTE_ID+" TEXT NOT NULL, " + CREATED_AT +"  TEXT NOT NULL, " + NOTE_TYPE +"  TEXT NOT NULL, "
			+ NOTE_CONTENT +"  TEXT NOT NULL, " + yoyo_OR_MSG_ID +"  TEXT NOT NULL, " + ORIGINAL_USER_ID +"  TEXT NOT NULL, "
			+ USER_NAME +"  TEXT NOT NULL, " + P_USER_NAME +"  TEXT NOT NULL, " + USER_PROFILE_IMG +"  TEXT NOT NULL,  "+NOTIFICATION_READ_STATUS + " INTEGER NOT NULL, " +
			"PRIMARY KEY ("+USER_ID+","+NOTE_ID+"))";

	public static final String CREATE_MESSAGES_TABLE = "CREATE TABLE IF NOT EXISTS "+MESSAGES_TABLE+" "
			+ "("+USER_ID+" TEXT  NOT NULL, "
			+ MSG_FROM_USER_ID+" TEXT NOT NULL, " + MSG_CONTENT +"  TEXT, " + MSG_IMAGES +"  TEXT, "
			+ MSG_CREATED_AT +"  TEXT NOT NULL, " + MSG_PROFILE_IMAGE +"  TEXT, " + MSG_RECEIVER +"  TEXT NOT NULL, "
			+ MSG_SERVER_MSG_ID +"  TEXT NOT NULL, " + MSG_USER_NAME +"  TEXT NOT NULL, " + MSG_STRANGER +"  TEXT NOT NULL, " + MSG_URL +"  TEXT , " + MSG_ISO_CODE +"  TEXT , " + MSG_READ_STATUS +"  TEXT , " +
			"PRIMARY KEY ("+USER_ID+","+MSG_SERVER_MSG_ID+"))";

	public static final String CREATE_PEOPLE_FOLLOW_TABLE = "CREATE TABLE IF NOT EXISTS "+PEOPLE_FOLLOW_TABLE+" "
			+ "("+USER_ID+" TEXT  NOT NULL, "
			+ PEOPLE_USER_ID+" TEXT NOT NULL, " + PEOPLE_USER_NAME +"  TEXT NOT NULL, " + PEOPLE_USER_FRIENDLY_NAME +"  TEXT NOT NULL, "
			+ PEOPLE_PROFILE_IMAGE +"  TEXT, " + PEOPLE_IS_PEOPLE_FOLLOWING_ME +"  TEXT, " + PEOPLE_AM_I_FOLLOWING_PEOPLE +"  TEXT, " + PEOPLE_DETAILS +"  TEXT, " + USER_IS_MUTED +"  TEXT, "
//			+ MSG_SERVER_MSG_ID +"  TEXT NOT NULL, " + MSG_USER_NAME +"  TEXT NOT NULL, " + MSG_STRANGER +"  TEXT NOT NULL, " + MSG_URL +"  TEXT , " + MSG_ISO_CODE +"  TEXT , " + MSG_READ_STATUS +"  TEXT , " +
			+ "PRIMARY KEY ("+USER_ID+","+PEOPLE_USER_ID+"))";

	public static final String CREATE_USER_BRIEF_TABLE = "CREATE TABLE IF NOT EXISTS "+USER_BRIEF_TABLE+" "
			+ "("+USER_ID+" TEXT PRIMARY KEY NOT NULL , "
			+ USER_PROFILE_IMG+" TEXT , "+
			 USER_FRIENDLY_NAME+" TEXT )";

//, people_profile_image text, IsPeopleFollowingMe text, AmIFollowingPeople text, PRIMARY KEY (user_id,people_user_id))


//	CREATE TABLE MSG (login_user_id TEXT,from_user_id TEXT,msg TEXT,msg_images TEXT,Create_at TEXT,profile_image TEXT,receiver TEXT,server_msg_id TEXT,user_name TEXT)

	/* INSERT QUERIES */



	
	/* SELECT QUERIES */


	
	
	/* DELETE TABLE QUERIES */

//	public static final String DELETE_FROM_LOGIN = "DELETE FROM USER_LOGIN";
	
	
	/* DROP TABLE QUERIES */

	public static final String DROP_WW_TRENDING_yoyoS_TABLE = "DROP TABLE IF EXISTS ww_trending_yoyos";
	public static final String DROP_LOCAL_TRENDING_yoyoS_TABLE = "DROP TABLE IF EXISTS local_trending_yoyos";
	public static final String DROP_USER_TABLE = "DROP TABLE IF EXISTS "+USER_TABLE;
	public static final String DROP_FOLLOWING_CHANNELS_TABLE = "DROP TABLE IF EXISTS "+FOLLOWING_CHANNELS_TABLE;
	public static final String DROP_NOTIFICATIONS_TABLE = "DROP TABLE IF EXISTS "+NOTIFICATIONS_TABLE;
	public static final String DROP_MESSAGES_TABLE = "DROP TABLE IF EXISTS "+MESSAGES_TABLE;
	public static final String DROP_PEOPLE_FOLLOW_TABLE = "DROP TABLE IF EXISTS "+PEOPLE_FOLLOW_TABLE;
	public static final String DROP_USER_BRIEF_TABLE = "DROP TABLE IF EXISTS "+USER_BRIEF_TABLE;

}
