package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class rmv implements defpackage.alai {
    public static final defpackage.alai a = new defpackage.rmv();

    @Override // defpackage.alai
    public final boolean a(int i) {
        defpackage.rmw rmwVar;
        switch (i) {
            case 1000:
                rmwVar = defpackage.rmw.UNKNOWN_AOSP_EVENT_TYPE;
                break;
            case 1001:
                rmwVar = defpackage.rmw.APP_LAUNCHED;
                break;
            case 1002:
                rmwVar = defpackage.rmw.IN_CALL_SCREEN_TURN_ON_SPEAKERPHONE;
                break;
            case 1003:
                rmwVar = defpackage.rmw.IN_CALL_SCREEN_TURN_ON_WIRED_OR_EARPIECE;
                break;
            case 1004:
                rmwVar = defpackage.rmw.CALL_LOG_BLOCK_REPORT_SPAM;
                break;
            case 1005:
                rmwVar = defpackage.rmw.CALL_LOG_BLOCK_NUMBER;
                break;
            case 1006:
                rmwVar = defpackage.rmw.CALL_LOG_UNBLOCK_NUMBER;
                break;
            case 1007:
                rmwVar = defpackage.rmw.CALL_LOG_REPORT_AS_NOT_SPAM;
                break;
            case 1008:
                rmwVar = defpackage.rmw.DIALOG_ACTION_CONFIRM_NUMBER_NOT_SPAM;
                break;
            case 1009:
                rmwVar = defpackage.rmw.REPORT_AS_NOT_SPAM_VIA_UNBLOCK_NUMBER;
                break;
            case 1010:
                rmwVar = defpackage.rmw.DIALOG_ACTION_CONFIRM_NUMBER_SPAM_INDIRECTLY_VIA_BLOCK_NUMBER;
                break;
            case 1011:
                rmwVar = defpackage.rmw.REPORT_CALL_AS_SPAM_VIA_CALL_LOG_BLOCK_REPORT_SPAM_SENT_VIA_BLOCK_NUMBER_DIALOG;
                break;
            case 1012:
                rmwVar = defpackage.rmw.USER_ACTION_BLOCKED_NUMBER;
                break;
            case 1013:
                rmwVar = defpackage.rmw.USER_ACTION_UNBLOCKED_NUMBER;
                break;
            case 1014:
                rmwVar = defpackage.rmw.SPAM_AFTER_CALL_NOTIFICATION_BLOCK_NUMBER;
                break;
            case 1015:
                rmwVar = defpackage.rmw.SPAM_AFTER_CALL_NOTIFICATION_SHOW_SPAM_DIALOG;
                break;
            case 1016:
                rmwVar = defpackage.rmw.SPAM_AFTER_CALL_NOTIFICATION_SHOW_NON_SPAM_DIALOG;
                break;
            case 1017:
            case 1018:
            case 1023:
            case 1031:
            case 1032:
            case 1033:
            case 1034:
            case 1035:
            case 1036:
            case 1037:
            case 1038:
            case 1039:
            case 1040:
            case 1480:
            case 1553:
            default:
                rmwVar = null;
                break;
            case 1019:
                rmwVar = defpackage.rmw.SPAM_AFTER_CALL_NOTIFICATION_ADD_TO_CONTACTS;
                break;
            case 1020:
                rmwVar = defpackage.rmw.SPAM_AFTER_CALL_NOTIFICATION_MARKED_NUMBER_AS_SPAM;
                break;
            case 1021:
                rmwVar = defpackage.rmw.SPAM_AFTER_CALL_NOTIFICATION_MARKED_NUMBER_AS_NOT_SPAM_AND_BLOCKED;
                break;
            case 1022:
                rmwVar = defpackage.rmw.SPAM_AFTER_CALL_NOTIFICATION_REPORT_NUMBER_AS_NOT_SPAM;
                break;
            case 1024:
                rmwVar = defpackage.rmw.SPAM_AFTER_CALL_NOTIFICATION_ON_DISMISS_SPAM_DIALOG;
                break;
            case 1025:
                rmwVar = defpackage.rmw.SPAM_AFTER_CALL_NOTIFICATION_ON_DISMISS_NON_SPAM_DIALOG;
                break;
            case 1026:
                rmwVar = defpackage.rmw.SPAM_NOTIFICATION_SERVICE_ACTION_MARK_NUMBER_AS_SPAM;
                break;
            case 1027:
                rmwVar = defpackage.rmw.SPAM_NOTIFICATION_SERVICE_ACTION_MARK_NUMBER_AS_NOT_SPAM;
                break;
            case 1028:
                rmwVar = defpackage.rmw.USER_PARTICIPATED_IN_A_CALL;
                break;
            case 1029:
                rmwVar = defpackage.rmw.INCOMING_SPAM_CALL;
                break;
            case 1030:
                rmwVar = defpackage.rmw.INCOMING_NON_SPAM_CALL;
                break;
            case 1041:
                rmwVar = defpackage.rmw.SPAM_NOTIFICATION_SHOWN_AFTER_THROTTLE;
                break;
            case 1042:
                rmwVar = defpackage.rmw.SPAM_NOTIFICATION_NOT_SHOWN_AFTER_THROTTLE;
                break;
            case 1043:
                rmwVar = defpackage.rmw.NON_SPAM_NOTIFICATION_SHOWN_AFTER_THROTTLE;
                break;
            case 1044:
                rmwVar = defpackage.rmw.NON_SPAM_NOTIFICATION_NOT_SHOWN_AFTER_THROTTLE;
                break;
            case 1045:
                rmwVar = defpackage.rmw.VOICEMAIL_ALERT_SET_PIN_SHOWN;
                break;
            case 1046:
                rmwVar = defpackage.rmw.VOICEMAIL_ALERT_SET_PIN_CLICKED;
                break;
            case 1047:
                rmwVar = defpackage.rmw.USER_DID_NOT_PARTICIPATE_IN_CALL;
                break;
            case 1048:
                rmwVar = defpackage.rmw.USER_DELETED_CALL_LOG_ITEM;
                break;
            case 1049:
                rmwVar = defpackage.rmw.CALL_LOG_SEND_MESSAGE;
                break;
            case 1050:
                rmwVar = defpackage.rmw.CALL_LOG_ADD_TO_CONTACT;
                break;
            case 1051:
                rmwVar = defpackage.rmw.CALL_LOG_CREATE_NEW_CONTACT;
                break;
            case 1052:
                rmwVar = defpackage.rmw.VOICEMAIL_DELETE_ENTRY;
                break;
            case 1053:
                rmwVar = defpackage.rmw.VOICEMAIL_EXPAND_ENTRY;
                break;
            case 1054:
                rmwVar = defpackage.rmw.VOICEMAIL_PLAY_AUDIO_DIRECTLY;
                break;
            case 1055:
                rmwVar = defpackage.rmw.VOICEMAIL_PLAY_AUDIO_AFTER_EXPANDING_ENTRY;
                break;
            case 1056:
                rmwVar = defpackage.rmw.REJECT_INCOMING_CALL_FROM_NOTIFICATION;
                break;
            case 1057:
                rmwVar = defpackage.rmw.REJECT_INCOMING_CALL_FROM_ANSWER_SCREEN;
                break;
            case 1058:
                rmwVar = defpackage.rmw.CALL_LOG_CONTEXT_MENU_BLOCK_REPORT_SPAM;
                break;
            case 1059:
                rmwVar = defpackage.rmw.CALL_LOG_CONTEXT_MENU_BLOCK_NUMBER;
                break;
            case 1060:
                rmwVar = defpackage.rmw.CALL_LOG_CONTEXT_MENU_UNBLOCK_NUMBER;
                break;
            case 1061:
                rmwVar = defpackage.rmw.CALL_LOG_CONTEXT_MENU_REPORT_AS_NOT_SPAM;
                break;
            case 1062:
                rmwVar = defpackage.rmw.NEW_CONTACT_OVERFLOW;
                break;
            case 1063:
                rmwVar = defpackage.rmw.NEW_CONTACT_FAB;
                break;
            case 1064:
                rmwVar = defpackage.rmw.VOICEMAIL_VVM3_TOS_SHOWN;
                break;
            case 1065:
                rmwVar = defpackage.rmw.VOICEMAIL_VVM3_TOS_ACCEPTED;
                break;
            case 1066:
                rmwVar = defpackage.rmw.VOICEMAIL_VVM3_TOS_DECLINED;
                break;
            case 1067:
                rmwVar = defpackage.rmw.VOICEMAIL_VVM3_TOS_DECLINE_CLICKED;
                break;
            case 1068:
                rmwVar = defpackage.rmw.VOICEMAIL_VVM3_TOS_DECLINE_CHANGE_PIN_SHOWN;
                break;
            case 1069:
                rmwVar = defpackage.rmw.STORAGE_PERMISSION_DISPLAYED;
                break;
            case 1070:
                rmwVar = defpackage.rmw.STORAGE_PERMISSION_REQUESTED;
                break;
            case 1071:
                rmwVar = defpackage.rmw.STORAGE_PERMISSION_SETTINGS;
                break;
            case 1072:
                rmwVar = defpackage.rmw.STORAGE_PERMISSION_GRANTED;
                break;
            case 1073:
                rmwVar = defpackage.rmw.STORAGE_PERMISSION_DENIED;
                break;
            case 1074:
                rmwVar = defpackage.rmw.CAMERA_PERMISSION_DISPLAYED;
                break;
            case 1075:
                rmwVar = defpackage.rmw.CAMERA_PERMISSION_REQUESTED;
                break;
            case 1076:
                rmwVar = defpackage.rmw.CAMERA_PERMISSION_SETTINGS;
                break;
            case 1077:
                rmwVar = defpackage.rmw.CAMERA_PERMISSION_GRANTED;
                break;
            case 1078:
                rmwVar = defpackage.rmw.CAMERA_PERMISSION_DENIED;
                break;
            case 1079:
                rmwVar = defpackage.rmw.VOICEMAIL_CONFIGURATION_STATE_CORRUPTION_DETECTED_FROM_ACTIVITY;
                break;
            case 1080:
                rmwVar = defpackage.rmw.VOICEMAIL_CONFIGURATION_STATE_CORRUPTION_DETECTED_FROM_NOTIFICATION;
                break;
            case 1081:
                rmwVar = defpackage.rmw.BACKUP_ON_BACKUP;
                break;
            case 1082:
                rmwVar = defpackage.rmw.BACKUP_ON_FULL_BACKUP;
                break;
            case 1083:
                rmwVar = defpackage.rmw.BACKUP_ON_BACKUP_DISABLED;
                break;
            case 1084:
                rmwVar = defpackage.rmw.BACKUP_VOICEMAIL_BACKED_UP;
                break;
            case 1085:
                rmwVar = defpackage.rmw.BACKUP_FULL_BACKED_UP;
                break;
            case 1086:
                rmwVar = defpackage.rmw.BACKUP_ON_BACKUP_JSON_EXCEPTION;
                break;
            case 1087:
                rmwVar = defpackage.rmw.BACKUP_ON_QUOTA_EXCEEDED;
                break;
            case 1088:
                rmwVar = defpackage.rmw.BACKUP_ON_RESTORE;
                break;
            case 1089:
                rmwVar = defpackage.rmw.BACKUP_RESTORED_FILE;
                break;
            case 1090:
                rmwVar = defpackage.rmw.BACKUP_RESTORED_VOICEMAIL;
                break;
            case 1091:
                rmwVar = defpackage.rmw.BACKUP_ON_RESTORE_FINISHED;
                break;
            case 1092:
                rmwVar = defpackage.rmw.BACKUP_ON_RESTORE_DISABLED;
                break;
            case 1093:
                rmwVar = defpackage.rmw.BACKUP_ON_RESTORE_JSON_EXCEPTION;
                break;
            case 1094:
                rmwVar = defpackage.rmw.BACKUP_ON_RESTORE_IO_EXCEPTION;
                break;
            case 1095:
                rmwVar = defpackage.rmw.BACKUP_MAX_VM_BACKUP_REACHED;
                break;
            case 1096:
                rmwVar = defpackage.rmw.EVENT_ANSWER_HINT_ACTIVATED;
                break;
            case 1097:
                rmwVar = defpackage.rmw.EVENT_ANSWER_HINT_DEACTIVATED;
                break;
            case 1098:
                rmwVar = defpackage.rmw.VVM_TAB_VIEWED;
                break;
            case 1099:
                rmwVar = defpackage.rmw.VVM_SHARE_VISIBLE;
                break;
            case 1100:
                rmwVar = defpackage.rmw.VVM_SHARE_PRESSED;
                break;
            case 1101:
                rmwVar = defpackage.rmw.OUTGOING_VIDEO_CALL;
                break;
            case 1102:
                rmwVar = defpackage.rmw.INCOMING_VIDEO_CALL;
                break;
            case 1103:
                rmwVar = defpackage.rmw.USER_PARTICIPATED_IN_A_VIDEO_CALL;
                break;
            case 1104:
                rmwVar = defpackage.rmw.BACKUP_ON_RESTORE_VM_DUPLICATE_NOT_RESTORING;
                break;
            case 1105:
                rmwVar = defpackage.rmw.CALL_LOG_SHARE_AND_CALL;
                break;
            case 1106:
                rmwVar = defpackage.rmw.CALL_COMPOSER_ACTIVITY_PLACE_RCS_CALL;
                break;
            case 1107:
                rmwVar = defpackage.rmw.CALL_COMPOSER_ACTIVITY_SEND_AND_CALL_PRESSED_WHEN_SESSION_NOT_READY;
                break;
            case 1108:
                rmwVar = defpackage.rmw.POST_CALL_PROMPT_USER_TO_SEND_MESSAGE_CLICKED;
                break;
            case 1109:
                rmwVar = defpackage.rmw.POST_CALL_PROMPT_USER_TO_SEND_MESSAGE;
                break;
            case 1110:
                rmwVar = defpackage.rmw.POST_CALL_PROMPT_USER_TO_VIEW_SENT_MESSAGE;
                break;
            case 1111:
                rmwVar = defpackage.rmw.POST_CALL_PROMPT_USER_TO_VIEW_SENT_MESSAGE_CLICKED;
                break;
            case 1112:
                rmwVar = defpackage.rmw.IN_CALL_SCREEN_TURN_ON_MUTE;
                break;
            case 1113:
                rmwVar = defpackage.rmw.IN_CALL_SCREEN_TURN_OFF_MUTE;
                break;
            case 1114:
                rmwVar = defpackage.rmw.IN_CALL_SCREEN_SWAP_CAMERA;
                break;
            case 1115:
                rmwVar = defpackage.rmw.IN_CALL_SCREEN_TURN_ON_VIDEO;
                break;
            case 1116:
                rmwVar = defpackage.rmw.IN_CALL_SCREEN_TURN_OFF_VIDEO;
                break;
            case 1117:
                rmwVar = defpackage.rmw.VIDEO_CALL_WITH_INCOMING_VOICE_CALL;
                break;
            case 1118:
                rmwVar = defpackage.rmw.VIDEO_CALL_WITH_INCOMING_VIDEO_CALL;
                break;
            case 1119:
                rmwVar = defpackage.rmw.VOICE_CALL_WITH_INCOMING_VOICE_CALL;
                break;
            case 1120:
                rmwVar = defpackage.rmw.VOICE_CALL_WITH_INCOMING_VIDEO_CALL;
                break;
            case 1121:
                rmwVar = defpackage.rmw.CALL_DETAILS_COPY_NUMBER;
                break;
            case 1122:
                rmwVar = defpackage.rmw.CALL_DETAILS_EDIT_BEFORE_CALL;
                break;
            case 1123:
                rmwVar = defpackage.rmw.CALL_DETAILS_CALL_BACK;
                break;
            case 1124:
                rmwVar = defpackage.rmw.VVM_USER_DISMISSED_VM_ALMOST_FULL_PROMO;
                break;
            case 1125:
                rmwVar = defpackage.rmw.VVM_USER_DISMISSED_VM_FULL_PROMO;
                break;
            case 1126:
                rmwVar = defpackage.rmw.VVM_USER_ENABLED_ARCHIVE_FROM_VM_ALMOST_FULL_PROMO;
                break;
            case 1127:
                rmwVar = defpackage.rmw.VVM_USER_ENABLED_ARCHIVE_FROM_VM_FULL_PROMO;
                break;
            case 1128:
                rmwVar = defpackage.rmw.VVM_USER_SHOWN_VM_ALMOST_FULL_PROMO;
                break;
            case 1129:
                rmwVar = defpackage.rmw.VVM_USER_SHOWN_VM_FULL_PROMO;
                break;
            case 1130:
                rmwVar = defpackage.rmw.VVM_USER_SHOWN_VM_ALMOST_FULL_ERROR_MESSAGE;
                break;
            case 1131:
                rmwVar = defpackage.rmw.VVM_USER_SHOWN_VM_FULL_ERROR_MESSAGE;
                break;
            case 1132:
                rmwVar = defpackage.rmw.VVM_USER_TURNED_ARCHIVE_ON_FROM_SETTINGS;
                break;
            case 1133:
                rmwVar = defpackage.rmw.VVM_USER_TURNED_ARCHIVE_OFF_FROM_SETTINGS;
                break;
            case 1134:
                rmwVar = defpackage.rmw.VVM_ARCHIVE_AUTO_DELETED_VM_FROM_SERVER;
                break;
            case 1135:
                rmwVar = defpackage.rmw.VVM_ARCHIVE_AUTO_DELETE_TURNED_OFF;
                break;
            case 1136:
                rmwVar = defpackage.rmw.VVM_TAB_VISIBLE;
                break;
            case 1137:
                rmwVar = defpackage.rmw.VVM_UNBUNDLED_EVENT_RECEIVED;
                break;
            case 1138:
                rmwVar = defpackage.rmw.VVM_ACTIVATION_STARTED;
                break;
            case 1139:
                rmwVar = defpackage.rmw.VVM_ACTIVATION_COMPLETED;
                break;
            case 1140:
                rmwVar = defpackage.rmw.VVM_AUTO_RETRY_ACTIVATION;
                break;
            case 1141:
                rmwVar = defpackage.rmw.VVM_PROVISIONING_STARTED;
                break;
            case 1142:
                rmwVar = defpackage.rmw.VVM_PROVISIONING_COMPLETED;
                break;
            case 1143:
                rmwVar = defpackage.rmw.VVM_SYNC_STARTED;
                break;
            case 1144:
                rmwVar = defpackage.rmw.VVM_SYNC_COMPLETED;
                break;
            case 1145:
                rmwVar = defpackage.rmw.VVM_AUTO_RETRY_SYNC;
                break;
            case 1146:
                rmwVar = defpackage.rmw.VVM_USER_RETRY;
                break;
            case 1147:
                rmwVar = defpackage.rmw.VVM_USER_SYNC;
                break;
            case 1148:
                rmwVar = defpackage.rmw.VVM_SETTINGS_VIEWED;
                break;
            case 1149:
                rmwVar = defpackage.rmw.VVM_CHANGE_PIN_CLICKED;
                break;
            case 1150:
                rmwVar = defpackage.rmw.VVM_CHANGE_PIN_COMPLETED;
                break;
            case 1151:
                rmwVar = defpackage.rmw.VVM_CHANGE_RINGTONE_CLICKED;
                break;
            case 1152:
                rmwVar = defpackage.rmw.VVM_CHANGE_VIBRATION_CLICKED;
                break;
            case 1153:
                rmwVar = defpackage.rmw.VVM_USER_ENABLED_IN_SETTINGS;
                break;
            case 1154:
                rmwVar = defpackage.rmw.VVM_USER_DISABLED_IN_SETTINGS;
                break;
            case 1155:
                rmwVar = defpackage.rmw.VVM_ADVANCED_SETINGS_CLICKED;
                break;
            case 1156:
                rmwVar = defpackage.rmw.VVM_NOTIFICATION_CLICKED;
                break;
            case 1157:
                rmwVar = defpackage.rmw.VVM_NOTIFICATION_CREATED;
                break;
            case 1158:
                rmwVar = defpackage.rmw.VVM_NOTIFICATION_CREATED_WITH_TRANSCRIPTION;
                break;
            case 1159:
                rmwVar = defpackage.rmw.VVM_TRANSCRIPTION_DOWNLOADED;
                break;
            case 1160:
                rmwVar = defpackage.rmw.VVM_CHANGE_AIRPLANE_MODE_CLICKED;
                break;
            case 1161:
                rmwVar = defpackage.rmw.VVM_CALL_VOICEMAIL_CLICKED;
                break;
            case 1162:
                rmwVar = defpackage.rmw.VVM_QUOTA_CHECK_UNAVAILABLE;
                break;
            case 1163:
                rmwVar = defpackage.rmw.EMERGENCY_NEW_EMERGENCY_CALL;
                break;
            case 1164:
                rmwVar = defpackage.rmw.EMERGENCY_CALLBACK;
                break;
            case 1165:
                rmwVar = defpackage.rmw.EMERGENCY_NO_LOCATION_PERMISSION;
                break;
            case 1166:
                rmwVar = defpackage.rmw.EMERGENCY_BATTERY_TOO_LOW_TO_GET_LOCATION;
                break;
            case 1167:
                rmwVar = defpackage.rmw.EMERGENCY_CANT_GET_LOCATION;
                break;
            case 1168:
                rmwVar = defpackage.rmw.EMERGENCY_STALE_LOCATION;
                break;
            case 1169:
                rmwVar = defpackage.rmw.EMERGENCY_INACCURATE_LOCATION;
                break;
            case 1170:
                rmwVar = defpackage.rmw.EMERGENCY_GOT_LOCATION;
                break;
            case 1171:
                rmwVar = defpackage.rmw.EMERGENCY_GOT_ADDRESS;
                break;
            case 1172:
                rmwVar = defpackage.rmw.EMERGENCY_GOT_MAP;
                break;
            case 1173:
                rmwVar = defpackage.rmw.EMERGENCY_LAUNCHED_MAP;
                break;
            case 1174:
                rmwVar = defpackage.rmw.VIDEO_CALL_UPGRADE_REQUESTED;
                break;
            case 1175:
                rmwVar = defpackage.rmw.VIDEO_CALL_REQUEST_ACCEPTED;
                break;
            case 1176:
                rmwVar = defpackage.rmw.VIDEO_CALL_REQUEST_ACCEPTED_AS_AUDIO;
                break;
            case 1177:
                rmwVar = defpackage.rmw.VIDEO_CALL_REQUEST_DECLINED;
                break;
            case 1178:
                rmwVar = defpackage.rmw.VIDEO_CALL_REQUEST_RECEIVED;
                break;
            case 1179:
                rmwVar = defpackage.rmw.RCS_VIDEO_SHARE_UPGRADE_REQUESTED;
                break;
            case 1180:
                rmwVar = defpackage.rmw.RCS_VIDEO_SHARE_REQUEST_ACCEPTED;
                break;
            case 1181:
                rmwVar = defpackage.rmw.RCS_VIDEO_SHARE_REQUEST_DECLINED;
                break;
            case 1182:
                rmwVar = defpackage.rmw.RCS_VIDEO_SHARE_REQUEST_RECEIVED;
                break;
            case 1183:
                rmwVar = defpackage.rmw.IMS_VIDEO_UPGRADE_REQUESTED;
                break;
            case 1184:
                rmwVar = defpackage.rmw.IMS_VIDEO_REQUEST_ACCEPTED;
                break;
            case 1185:
                rmwVar = defpackage.rmw.IMS_VIDEO_REQUEST_ACCEPTED_AS_AUDIO;
                break;
            case 1186:
                rmwVar = defpackage.rmw.IMS_VIDEO_REQUEST_DECLINED;
                break;
            case 1187:
                rmwVar = defpackage.rmw.IMS_VIDEO_REQUEST_RECEIVED;
                break;
            case 1188:
                rmwVar = defpackage.rmw.VVM_STATUS_CHECK_READY;
                break;
            case 1189:
                rmwVar = defpackage.rmw.VVM_STATUS_CHECK_REACTIVATION;
                break;
            case 1190:
                rmwVar = defpackage.rmw.VVM_ARCHIVE_AUTO_DELETE_FAILED_DUE_TO_FAILED_QUOTA_CHECK;
                break;
            case 1191:
                rmwVar = defpackage.rmw.BUBBLE_TURN_ON_SPEAKERPHONE;
                break;
            case 1192:
                rmwVar = defpackage.rmw.BUBBLE_TURN_ON_WIRED_OR_EARPIECE;
                break;
            case 1193:
                rmwVar = defpackage.rmw.BUBBLE_MUTE_CALL;
                break;
            case 1194:
                rmwVar = defpackage.rmw.BUBBLE_UNMUTE_CALL;
                break;
            case 1195:
                rmwVar = defpackage.rmw.BUBBLE_END_CALL;
                break;
            case 1196:
                rmwVar = defpackage.rmw.LIGHTBRINGER_VIDEO_REQUESTED_FROM_SEARCH;
                break;
            case 1197:
                rmwVar = defpackage.rmw.LIGHTBRINGER_VIDEO_REQUESTED_FROM_CALL_LOG;
                break;
            case 1198:
                rmwVar = defpackage.rmw.IMS_VIDEO_REQUESTED_FROM_SEARCH;
                break;
            case 1199:
                rmwVar = defpackage.rmw.IMS_VIDEO_REQUESTED_FROM_CALL_LOG;
                break;
            case 1200:
                rmwVar = defpackage.rmw.MULTISELECT_LONG_PRESS_ENTER_MULTI_SELECT_MODE;
                break;
            case 1201:
                rmwVar = defpackage.rmw.MULTISELECT_LONG_PRESS_TAP_ENTRY;
                break;
            case 1202:
                rmwVar = defpackage.rmw.MULTISELECT_SINGLE_PRESS_SELECT_ENTRY;
                break;
            case 1203:
                rmwVar = defpackage.rmw.MULTISELECT_SINGLE_PRESS_UNSELECT_ENTRY;
                break;
            case 1204:
                rmwVar = defpackage.rmw.MULTISELECT_SINGLE_PRESS_TAP_VIA_CONTACT_BADGE;
                break;
            case 1205:
                rmwVar = defpackage.rmw.MULTISELECT_SELECT_ALL;
                break;
            case 1206:
                rmwVar = defpackage.rmw.MULTISELECT_UNSELECT_ALL;
                break;
            case 1207:
                rmwVar = defpackage.rmw.MULTISELECT_TAP_DELETE_ICON;
                break;
            case 1208:
                rmwVar = defpackage.rmw.MULTISELECT_DISPLAY_DELETE_CONFIRMATION_DIALOG;
                break;
            case 1209:
                rmwVar = defpackage.rmw.MULTISELECT_DELETE_ENTRY_VIA_CONFIRMATION_DIALOG;
                break;
            case 1210:
                rmwVar = defpackage.rmw.MULTISELECT_CANCEL_CONFIRMATION_DIALOG_VIA_CANCEL_BUTTON;
                break;
            case 1211:
                rmwVar = defpackage.rmw.MULTISELECT_CANCEL_CONFIRMATION_DIALOG_VIA_CANCEL_TOUCH;
                break;
            case 1212:
                rmwVar = defpackage.rmw.MULTISELECT_ROTATE_AND_SHOW_ACTION_MODE;
                break;
            case 1213:
                rmwVar = defpackage.rmw.VOICEMAIL_VVM3_TOS_V2_CREATED;
                break;
            case 1214:
                rmwVar = defpackage.rmw.VOICEMAIL_VVM3_TOS_V2_ACCEPTED;
                break;
            case 1215:
                rmwVar = defpackage.rmw.VOICEMAIL_VVM3_TOS_V2_DECLINE_CLICKED;
                break;
            case 1216:
                rmwVar = defpackage.rmw.VOICEMAIL_DIALER_TOS_CREATED;
                break;
            case 1217:
                rmwVar = defpackage.rmw.VOICEMAIL_DIALER_TOS_ACCEPTED;
                break;
            case 1218:
                rmwVar = defpackage.rmw.VOICEMAIL_DIALER_TOS_DECLINE_CLICKED;
                break;
            case 1219:
                rmwVar = defpackage.rmw.CREATE_NEW_CONTACT_FROM_CALL_LOG;
                break;
            case 1220:
                rmwVar = defpackage.rmw.CREATE_NEW_CONTACT_FROM_DIALPAD;
                break;
            case 1221:
                rmwVar = defpackage.rmw.CREATE_NEW_CONTACT_FROM_VOICEMAIL;
                break;
            case 1222:
                rmwVar = defpackage.rmw.CREATE_NEW_CONTACT_FROM_CALL_HISTORY;
                break;
            case 1223:
                rmwVar = defpackage.rmw.ADD_TO_A_CONTACT_FROM_CALL_LOG;
                break;
            case 1224:
                rmwVar = defpackage.rmw.ADD_TO_A_CONTACT_FROM_DIALPAD;
                break;
            case 1225:
                rmwVar = defpackage.rmw.ADD_TO_A_CONTACT_FROM_VOICEMAIL;
                break;
            case 1226:
                rmwVar = defpackage.rmw.ADD_TO_A_CONTACT_FROM_CALL_HISTORY;
                break;
            case 1227:
                rmwVar = defpackage.rmw.CALLER_ID_REPORTED;
                break;
            case 1228:
                rmwVar = defpackage.rmw.CALLER_ID_REPORT_FAILED;
                break;
            case 1229:
                rmwVar = defpackage.rmw.VVM_TRANSCRIPTION_REQUEST_SENT;
                break;
            case 1230:
                rmwVar = defpackage.rmw.VVM_TRANSCRIPTION_REQUEST_RETRY;
                break;
            case 1231:
                rmwVar = defpackage.rmw.VVM_TRANSCRIPTION_RESPONSE_SUCCESS;
                break;
            case 1232:
                rmwVar = defpackage.rmw.VVM_TRANSCRIPTION_RESPONSE_EMPTY;
                break;
            case 1233:
                rmwVar = defpackage.rmw.VVM_TRANSCRIPTION_RESPONSE_INVALID;
                break;
            case 1234:
                rmwVar = defpackage.rmw.VVM_TRANSCRIPTION_RESPONSE_RECOVERABLE_ERROR;
                break;
            case 1235:
                rmwVar = defpackage.rmw.VVM_TRANSCRIPTION_RESPONSE_FATAL_ERROR;
                break;
            case 1236:
                rmwVar = defpackage.rmw.UPGRADE_TO_VIDEO_CALL_BUTTON_SHOWN;
                break;
            case 1237:
                rmwVar = defpackage.rmw.BUBBLE_PRIMARY_BUTTON_EXPAND;
                break;
            case 1238:
                rmwVar = defpackage.rmw.BUBBLE_PRIMARY_BUTTON_RETURN_TO_CALL;
                break;
            case 1239:
                rmwVar = defpackage.rmw.BACKUP_KEY_VALUE_ON_BACKUP;
                break;
            case 1240:
                rmwVar = defpackage.rmw.BACKUP_KEY_VALUE_ON_RESTORE;
                break;
            case 1241:
                rmwVar = defpackage.rmw.BACKUP_KEY_VALUE_ON_RESTORE_FINISHED;
                break;
            case 1242:
                rmwVar = defpackage.rmw.BACKUP_KEY_VALUE_GET_BACKUP_SPECIFICATION;
                break;
            case 1243:
                rmwVar = defpackage.rmw.BACKUP_KEY_VALUE_BACKUP_AGENT_CONSTRUCTOR;
                break;
            case 1244:
                rmwVar = defpackage.rmw.UPGRADE_TO_VIDEO_CALL_BUTTON_SHOWN_FOR_LIGHTBRINGER;
                break;
            case 1245:
                rmwVar = defpackage.rmw.UPGRADE_TO_VIDEO_CALL_BUTTON_SHOWN_FOR_IMS;
                break;
            case 1246:
                rmwVar = defpackage.rmw.UPGRADE_TO_VIDEO_CALL_BUTTON_SHOWN_FOR_RCS;
                break;
            case 1247:
                rmwVar = defpackage.rmw.LIGHTBRINGER_UPGRADE_REQUESTED;
                break;
            case 1248:
                rmwVar = defpackage.rmw.HAS_LIGHTBRINGER_REACHABLE_CONTACTS;
                break;
            case 1249:
                rmwVar = defpackage.rmw.HIGH_GLOBAL_NOTIFICATION_COUNT_REACHED;
                break;
            case 1250:
                rmwVar = defpackage.rmw.VVM_TRANSCRIPTION_REQUEST_SENT_ASYNC;
                break;
            case 1251:
                rmwVar = defpackage.rmw.VVM_TRANSCRIPTION_VOICEMAIL_RECEIVED;
                break;
            case 1252:
                rmwVar = defpackage.rmw.VVM_TRANSCRIPTION_VOICEMAIL_FORMAT_NOT_SUPPORTED;
                break;
            case 1253:
                rmwVar = defpackage.rmw.VVM_TRANSCRIPTION_VOICEMAIL_INVALID_DATA;
                break;
            case 1254:
                rmwVar = defpackage.rmw.VVM_TRANSCRIPTION_VOICEMAIL_UPLOAD_FAILED;
                break;
            case 1255:
                rmwVar = defpackage.rmw.VVM_TRANSCRIPTION_RESPONSE_LANGUAGE_NOT_SUPPORTED;
                break;
            case 1256:
                rmwVar = defpackage.rmw.VVM_TRANSCRIPTION_RESPONSE_NO_SPEECH_DETECTED;
                break;
            case 1257:
                rmwVar = defpackage.rmw.VVM_TRANSCRIPTION_RESPONSE_EXPIRED;
                break;
            case 1258:
                rmwVar = defpackage.rmw.VVM_TRANSCRIPTION_RESPONSE_TOO_MANY_ERRORS;
                break;
            case 1259:
                rmwVar = defpackage.rmw.VVM_TRANSCRIPTION_POLLING_TIMEOUT;
                break;
            case 1260:
                rmwVar = defpackage.rmw.BUBBLE_COLLAPSE_BY_USER;
                break;
            case 1261:
                rmwVar = defpackage.rmw.IN_CALL_SHOW_DIALPAD_BUTTON_PRESSED;
                break;
            case 1262:
                rmwVar = defpackage.rmw.IN_CALL_ADD_CALL_BUTTON_PRESSED;
                break;
            case 1263:
                rmwVar = defpackage.rmw.IN_CALL_MERGE_BUTTON_PRESSED;
                break;
            case 1264:
                rmwVar = defpackage.rmw.IN_CALL_SWAP_SECONDARY_BUTTON_PRESSED;
                break;
            case 1265:
                rmwVar = defpackage.rmw.IN_CALL_DIALPAD_NUMBER_BUTTON_PRESSED;
                break;
            case 1266:
                rmwVar = defpackage.rmw.IN_CALL_DIALPAD_HANG_UP_BUTTON_PRESSED;
                break;
            case 1267:
                rmwVar = defpackage.rmw.IN_CALL_DIALPAD_CLOSE_BUTTON_PRESSED;
                break;
            case 1268:
                rmwVar = defpackage.rmw.VVM_NOTIFICATION_CREATED_WITH_IN_PROGRESS;
                break;
            case 1269:
                rmwVar = defpackage.rmw.VVM_NOTIFICATION_CREATED_WITH_TRANSCRIPTION_FAILURE;
                break;
            case 1270:
                rmwVar = defpackage.rmw.VVM_NOTIFICATION_CREATED_WITH_NO_TRANSCRIPTION;
                break;
            case 1271:
                rmwVar = defpackage.rmw.VVM_TRANSCRIPTION_JOB_STOPPED;
                break;
            case 1272:
                rmwVar = defpackage.rmw.VVM_TRANSCRIPTION_TASK_CANCELLED;
                break;
            case 1273:
                rmwVar = defpackage.rmw.SWITCH_TAB_TO_FAVORITE_BY_SWIPE;
                break;
            case 1274:
                rmwVar = defpackage.rmw.SWITCH_TAB_TO_CALL_LOG_BY_SWIPE;
                break;
            case 1275:
                rmwVar = defpackage.rmw.SWITCH_TAB_TO_CONTACTS_BY_SWIPE;
                break;
            case 1276:
                rmwVar = defpackage.rmw.SWITCH_TAB_TO_VOICEMAIL_BY_SWIPE;
                break;
            case 1277:
                rmwVar = defpackage.rmw.SWITCH_TAB_TO_FAVORITE_BY_CLICK;
                break;
            case 1278:
                rmwVar = defpackage.rmw.SWITCH_TAB_TO_CALL_LOG_BY_CLICK;
                break;
            case 1279:
                rmwVar = defpackage.rmw.SWITCH_TAB_TO_CONTACTS_BY_CLICK;
                break;
            case 1280:
                rmwVar = defpackage.rmw.SWITCH_TAB_TO_VOICEMAIL_BY_CLICK;
                break;
            case 1281:
                rmwVar = defpackage.rmw.LIGHTBRINGER_NON_CONTACT_UPGRADE_REQUESTED;
                break;
            case 1282:
                rmwVar = defpackage.rmw.LIGHTBRINGER_NON_CONTACT_VIDEO_REQUESTED_FROM_CALL_LOG;
                break;
            case 1283:
                rmwVar = defpackage.rmw.VVM_TRANSCRIPTION_POLL_REQUEST;
                break;
            case 1284:
                rmwVar = defpackage.rmw.CALL_DETAILS_IMS_VIDEO_CALL_BACK;
                break;
            case 1285:
                rmwVar = defpackage.rmw.CALL_DETAILS_LIGHTBRINGER_CALL_BACK;
                break;
            case 1286:
                rmwVar = defpackage.rmw.CALL_DETAILS_VOICE_CALL_BACK;
                break;
            case 1287:
                rmwVar = defpackage.rmw.ASSISTED_DIALING_CONSTRAINT_PARSING_FAILURE;
                break;
            case 1288:
                rmwVar = defpackage.rmw.ASSISTED_DIALING_CONSTRAINT_NUMBER_HAS_COUNTRY_CODE;
                break;
            case 1289:
                rmwVar = defpackage.rmw.ASSISTED_DIALING_CONSTRAINT_NUMBER_HAS_EXTENSION;
                break;
            case 1290:
                rmwVar = defpackage.rmw.REPORT_SAME_PREFIX_CALL_AS_SPAM_VIA_CALL_HISTORY;
                break;
            case 1291:
                rmwVar = defpackage.rmw.REPORT_SAME_PREFIX_CALL_AS_NOT_SPAM_VIA_CALL_HISTORY;
                break;
            case 1292:
                rmwVar = defpackage.rmw.ASSISTED_DIALING_FEATURE_DISABLED_BY_USER;
                break;
            case 1293:
                rmwVar = defpackage.rmw.PRECALL_INITIATED;
                break;
            case 1294:
                rmwVar = defpackage.rmw.PRECALL_INITIATED_EXTERNAL;
                break;
            case 1295:
                rmwVar = defpackage.rmw.PRECALL_CANCELED;
                break;
            case 1296:
                rmwVar = defpackage.rmw.DUAL_SIM_CHANGE_SIM_PRESSED;
                break;
            case 1297:
                rmwVar = defpackage.rmw.DUAL_SIM_SELECTION_SHOWN;
                break;
            case 1298:
                rmwVar = defpackage.rmw.DUAL_SIM_SELECTION_VOICEMAIL;
                break;
            case 1299:
                rmwVar = defpackage.rmw.DUAL_SIM_SELECTION_IN_CONTACTS;
                break;
            case 1300:
                rmwVar = defpackage.rmw.DUAL_SIM_SELECTION_SUGGESTION_AVAILABLE;
                break;
            case 1301:
                rmwVar = defpackage.rmw.DUAL_SIM_SELECTION_SUGGESTED_CARRIER;
                break;
            case 1302:
                rmwVar = defpackage.rmw.DUAL_SIM_SELECTION_SUGGESTED_FREQUENCY;
                break;
            case 1303:
                rmwVar = defpackage.rmw.DUAL_SIM_SELECTION_SUGGESTED_SIM_SELECTED;
                break;
            case 1304:
                rmwVar = defpackage.rmw.DUAL_SIM_SELECTION_NON_SUGGESTED_SIM_SELECTED;
                break;
            case 1305:
                rmwVar = defpackage.rmw.DUAL_SIM_SELECTION_PREFERRED_SET;
                break;
            case 1306:
                rmwVar = defpackage.rmw.DUAL_SIM_SELECTION_PREFERRED_USED;
                break;
            case 1307:
                rmwVar = defpackage.rmw.DUAL_SIM_SELECTION_GLOBAL_USED;
                break;
            case 1308:
                rmwVar = defpackage.rmw.DUO_CALL_LOG_SET_UP_INSTALL;
                break;
            case 1309:
                rmwVar = defpackage.rmw.DUO_CALL_LOG_SET_UP_ACTIVATE;
                break;
            case 1310:
                rmwVar = defpackage.rmw.DUO_CALL_LOG_INVITE;
                break;
            case 1311:
                rmwVar = defpackage.rmw.BUBBLE_V2_CLICK_TO_EXPAND;
                break;
            case 1312:
                rmwVar = defpackage.rmw.BUBBLE_V2_CLICK_TO_COLLAPSE;
                break;
            case 1313:
                rmwVar = defpackage.rmw.BUBBLE_V2_RETURN_TO_CALL;
                break;
            case 1314:
                rmwVar = defpackage.rmw.BUBBLE_V2_MUTE_CALL;
                break;
            case 1315:
                rmwVar = defpackage.rmw.BUBBLE_V2_UNMUTE_CALL;
                break;
            case 1316:
                rmwVar = defpackage.rmw.BUBBLE_V2_SPEAKERPHONE;
                break;
            case 1317:
                rmwVar = defpackage.rmw.BUBBLE_V2_WIRED_OR_EARPIECE;
                break;
            case 1318:
                rmwVar = defpackage.rmw.BUBBLE_V2_BLUETOOTH;
                break;
            case 1319:
                rmwVar = defpackage.rmw.BUBBLE_V2_END_CALL;
                break;
            case 1320:
                rmwVar = defpackage.rmw.BUBBLE_V2_BOTTOM_ACTION_DISMISS;
                break;
            case 1321:
                rmwVar = defpackage.rmw.BUBBLE_V2_BOTTOM_ACTION_END_CALL;
                break;
            case 1322:
                rmwVar = defpackage.rmw.DUAL_SIM_SELECTION_SUGGESTION_AUTO_SELECTED;
                break;
            case 1323:
                rmwVar = defpackage.rmw.BUBBLE_V2_SHOW;
                break;
            case 1324:
                rmwVar = defpackage.rmw.DUO_CALL_LOG_SET_UP_INSTALL_SHOWN;
                break;
            case 1325:
                rmwVar = defpackage.rmw.DUO_CALL_LOG_SET_UP_ACTIVATE_SHOWN;
                break;
            case 1326:
                rmwVar = defpackage.rmw.DUO_CALL_LOG_INVITE_SHOWN;
                break;
            case 1327:
                rmwVar = defpackage.rmw.MAIN_SWITCH_TAB_TO_FAVORITE;
                break;
            case 1328:
                rmwVar = defpackage.rmw.MAIN_SWITCH_TAB_TO_CALL_LOG;
                break;
            case 1329:
                rmwVar = defpackage.rmw.MAIN_SWITCH_TAB_TO_CONTACTS;
                break;
            case 1330:
                rmwVar = defpackage.rmw.MAIN_SWITCH_TAB_TO_VOICEMAIL;
                break;
            case 1331:
                rmwVar = defpackage.rmw.MAIN_TOUCH_DIALPAD_SEARCH_LIST_TO_CLOSE_SEARCH_AND_DIALPAD;
                break;
            case 1332:
                rmwVar = defpackage.rmw.MAIN_TOUCH_DIALPAD_SEARCH_LIST_TO_HIDE_DIALPAD;
                break;
            case 1333:
                rmwVar = defpackage.rmw.MAIN_TOUCH_SEARCH_LIST_TO_CLOSE_SEARCH;
                break;
            case 1334:
                rmwVar = defpackage.rmw.MAIN_TOUCH_SEARCH_LIST_TO_HIDE_KEYBOARD;
                break;
            case 1335:
                rmwVar = defpackage.rmw.MAIN_PRESS_BACK_BUTTON_TO_CLOSE_SEARCH;
                break;
            case 1336:
                rmwVar = defpackage.rmw.MAIN_PRESS_BACK_BUTTON_TO_CLOSE_SEARCH_AND_DIALPAD;
                break;
            case 1337:
                rmwVar = defpackage.rmw.MAIN_PRESS_BACK_BUTTON_TO_HIDE_DIALPAD;
                break;
            case 1338:
                rmwVar = defpackage.rmw.MAIN_CLICK_SEARCH_BAR;
                break;
            case 1339:
                rmwVar = defpackage.rmw.MAIN_CLICK_SEARCH_BAR_VOICE_BUTTON;
                break;
            case 1340:
                rmwVar = defpackage.rmw.MAIN_CLICK_FAB_TO_OPEN_DIALPAD;
                break;
            case 1341:
                rmwVar = defpackage.rmw.ANNOTATED_CALL_LOG_NOT_DIRTY;
                break;
            case 1342:
                rmwVar = defpackage.rmw.ANNOTATED_CALL_LOG_NO_CHANGES_NEEDED;
                break;
            case 1343:
                rmwVar = defpackage.rmw.ANNOTATED_CALL_LOG_FORCE_REFRESH_NO_CHANGES_NEEDED;
                break;
            case 1344:
                rmwVar = defpackage.rmw.ANNOTATED_CALL_LOG_CHANGES_NEEDED;
                break;
            case 1345:
                rmwVar = defpackage.rmw.ANNOTATED_CALL_LOG_FORCE_REFRESH_CHANGES_NEEDED;
                break;
            case 1346:
                rmwVar = defpackage.rmw.MAIN_VVM_TAB_VISIBLE;
                break;
            case 1347:
                rmwVar = defpackage.rmw.MAIN_OPEN_WITH_TAB_FAVORITE;
                break;
            case 1348:
                rmwVar = defpackage.rmw.MAIN_OPEN_WITH_TAB_CALL_LOG;
                break;
            case 1349:
                rmwVar = defpackage.rmw.MAIN_OPEN_WITH_TAB_CONTACTS;
                break;
            case 1350:
                rmwVar = defpackage.rmw.MAIN_OPEN_WITH_TAB_VOICEMAIL;
                break;
            case 1351:
                rmwVar = defpackage.rmw.MAIN_OPEN_WITH_DIALPAD;
                break;
            case 1352:
                rmwVar = defpackage.rmw.INCOMING_CALL_SCREENED;
                break;
            case 1353:
                rmwVar = defpackage.rmw.INCOMING_CALL_AUTO_BLOCKED_AS_SPAM;
                break;
            case 1354:
                rmwVar = defpackage.rmw.INCOMING_VOICEMAIL_SCREENED;
                break;
            case 1355:
                rmwVar = defpackage.rmw.INCOMING_VOICEMAIL_AUTO_BLOCKED_AS_SPAM;
                break;
            case 1356:
                rmwVar = defpackage.rmw.AUTO_BLOCKED_SPAM_CALL_REPORTED_AS_SPAM;
                break;
            case 1357:
                rmwVar = defpackage.rmw.AUTO_BLOCKED_SPAM_CALL_REPORTED_AS_NOT_SPAM;
                break;
            case 1358:
                rmwVar = defpackage.rmw.SPAM_BLOCKING_ENABLED_THROUGH_SETTING;
                break;
            case 1359:
                rmwVar = defpackage.rmw.SPAM_BLOCKING_DISABLED_THROUGH_SETTING;
                break;
            case 1360:
                rmwVar = defpackage.rmw.SPAM_BLOCKING_MODIFY_FAILURE_THROUGH_SETTING;
                break;
            case 1361:
                rmwVar = defpackage.rmw.VVM_NOTIFICATIONS_SETTING_CLICKED;
                break;
            case 1362:
                rmwVar = defpackage.rmw.VVM_USER_TURNED_TRANSCRIBE_ON_FROM_SETTINGS;
                break;
            case 1363:
                rmwVar = defpackage.rmw.VVM_USER_TURNED_TRANSCRIBE_OFF_FROM_SETTINGS;
                break;
            case 1364:
                rmwVar = defpackage.rmw.VVM_USER_TURNED_DONATION_ON_FROM_SETTINGS;
                break;
            case 1365:
                rmwVar = defpackage.rmw.VVM_USER_TURNED_DONATION_OFF_FROM_SETTINGS;
                break;
            case 1366:
                rmwVar = defpackage.rmw.SPAM_BLOCKING_CALL_LOG_PROMO_SHOWN;
                break;
            case 1367:
                rmwVar = defpackage.rmw.SPAM_BLOCKING_ENABLED_THROUGH_CALL_LOG_PROMO;
                break;
            case 1368:
                rmwVar = defpackage.rmw.SPAM_BLOCKING_MODIFY_FAILURE_THROUGH_CALL_LOG_PROMO;
                break;
            case 1369:
                rmwVar = defpackage.rmw.USER_ACTION_BLOCK_NUMBER_FAILED;
                break;
            case 1370:
                rmwVar = defpackage.rmw.USER_ACTION_UNBLOCK_NUMBER_FAILED;
                break;
            case 1371:
                rmwVar = defpackage.rmw.TOKEN_FETCHER_NEED_USER_APPROVAL;
                break;
            case 1372:
                rmwVar = defpackage.rmw.TOKEN_FETCHER_IO_EXCEPTION;
                break;
            case 1373:
                rmwVar = defpackage.rmw.TOKEN_FETCHER_AUTH_EXCEPTION;
                break;
            case 1374:
                rmwVar = defpackage.rmw.TOKEN_FETCHER_CLEAR_EXCEPTION;
                break;
            case 1375:
                rmwVar = defpackage.rmw.PEOPLE_API_LOOKUP_FAILED;
                break;
            case 1376:
                rmwVar = defpackage.rmw.LIGHTBRINGER_VIDEO_REQUESTED_FOR_FAVORITE_CONTACT;
                break;
            case 1377:
                rmwVar = defpackage.rmw.LIGHTBRINGER_VIDEO_REQUESTED_FOR_SUGGESTED_CONTACT;
                break;
            case 1378:
                rmwVar = defpackage.rmw.LIGHTBRINGER_VIDEO_REQUESTED_FOR_FAVORITE_CONTACT_DISAMBIG;
                break;
            case 1379:
                rmwVar = defpackage.rmw.SPAM_BLOCKING_AFTER_CALL_NOTIFICATION_PROMO_SHOWN;
                break;
            case 1380:
                rmwVar = defpackage.rmw.SPAM_BLOCKING_ENABLED_THROUGH_AFTER_CALL_NOTIFICATION_PROMO;
                break;
            case 1381:
                rmwVar = defpackage.rmw.SPAM_BLOCKING_MODIFY_FAILURE_THROUGH_AFTER_CALL_NOTIFICATION_PROMO;
                break;
            case 1382:
                rmwVar = defpackage.rmw.OUTGOING_RTT_CALL;
                break;
            case 1383:
                rmwVar = defpackage.rmw.INCOMING_RTT_CALL;
                break;
            case 1384:
                rmwVar = defpackage.rmw.RTT_MID_CALL_ENABLED;
                break;
            case 1385:
                rmwVar = defpackage.rmw.RTT_MID_CALL_ACCEPTED;
                break;
            case 1386:
                rmwVar = defpackage.rmw.RTT_MID_CALL_REJECTED;
                break;
            case 1387:
                rmwVar = defpackage.rmw.RTT_SEND_BUTTON_CLICKED;
                break;
            case 1388:
                rmwVar = defpackage.rmw.RTT_KEYBOARD_SEND_BUTTON_CLICKED;
                break;
            case 1389:
                rmwVar = defpackage.rmw.DUAL_SIM_SELECTION_PREFERRED_NOT_SELECTABLE;
                break;
            case 1390:
                rmwVar = defpackage.rmw.DUAL_SIM_SELECTION_GLOBAL_NOT_SELECTABLE;
                break;
            case 1391:
                rmwVar = defpackage.rmw.DUAL_SIM_SELECTION_SUGGESTION_AUTO_NOT_SELECTABLE;
                break;
            case 1392:
                rmwVar = defpackage.rmw.START_CALL_IN_BUBBLE_MODE;
                break;
            case 1393:
                rmwVar = defpackage.rmw.IN_CALL_SWITCH_AUDIO_ROUTE_SPEAKER;
                break;
            case 1394:
                rmwVar = defpackage.rmw.IN_CALL_SWITCH_AUDIO_ROUTE_WIRED_HEADSET;
                break;
            case 1395:
                rmwVar = defpackage.rmw.IN_CALL_SWITCH_AUDIO_ROUTE_EARPIECE;
                break;
            case 1396:
                rmwVar = defpackage.rmw.IN_CALL_SWITCH_AUDIO_ROUTE_BLUETOOTH;
                break;
            case 1397:
                rmwVar = defpackage.rmw.PEOPLE_API_PHONE_LOOKUP_TIMEOUT;
                break;
            case 1398:
                rmwVar = defpackage.rmw.CP2_EXTENDED_DIRECTORY_PHONE_LOOKUP_TIMEOUT;
                break;
            case 1399:
                rmwVar = defpackage.rmw.FAVORITE_ADD_FAVORITE;
                break;
            case 1400:
                rmwVar = defpackage.rmw.FAVORITE_OPEN_DISAMBIG_DIALOG;
                break;
            case 1401:
                rmwVar = defpackage.rmw.FAVORITE_REMOVE_FAVORITE_BY_DRAG_AND_DROP;
                break;
            case 1402:
                rmwVar = defpackage.rmw.FAVORITE_MOVE_FAVORITE_BY_DRAG_AND_DROP;
                break;
            case 1403:
                rmwVar = defpackage.rmw.FAVORITE_OPEN_FAVORITE_MENU;
                break;
            case 1404:
                rmwVar = defpackage.rmw.FAVORITE_SEND_MESSAGE;
                break;
            case 1405:
                rmwVar = defpackage.rmw.FAVORITE_OPEN_CONTACT_CARD;
                break;
            case 1406:
                rmwVar = defpackage.rmw.FAVORITE_REMOVE_FAVORITE;
                break;
            case 1407:
                rmwVar = defpackage.rmw.FAVORITE_SET_VIDEO_DEFAULT;
                break;
            case 1408:
                rmwVar = defpackage.rmw.FAVORITE_SET_VOICE_DEFAULT;
                break;
            case 1409:
                rmwVar = defpackage.rmw.VM_GREETING_START_RECORD;
                break;
            case 1410:
                rmwVar = defpackage.rmw.VM_GREETING_STOP_RECORD;
                break;
            case 1411:
                rmwVar = defpackage.rmw.VM_GREETING_CLICK_REDO;
                break;
            case 1412:
                rmwVar = defpackage.rmw.VM_GREETING_CLICK_SAVE;
                break;
            case 1413:
                rmwVar = defpackage.rmw.VM_GREETING_SHOW_DISCARD;
                break;
            case 1414:
                rmwVar = defpackage.rmw.VM_GREETING_CANCEL_DISCARD;
                break;
            case 1415:
                rmwVar = defpackage.rmw.VM_GREETING_DISCARD_GREETING;
                break;
            case 1416:
                rmwVar = defpackage.rmw.VM_GREETING_SHOW_REDO;
                break;
            case 1417:
                rmwVar = defpackage.rmw.VM_GREETING_CANCEL_REDO;
                break;
            case 1418:
                rmwVar = defpackage.rmw.VM_GREETING_REDO_GREETING;
                break;
            case 1419:
                rmwVar = defpackage.rmw.VM_GREETING_SAVE_GREETING;
                break;
            case 1420:
                rmwVar = defpackage.rmw.VM_GREETING_SHOW_SAVE_ERROR;
                break;
            case 1421:
                rmwVar = defpackage.rmw.VM_GREETING_SAVE_ERROR_CANCEL;
                break;
            case 1422:
                rmwVar = defpackage.rmw.VM_GREETING_SAVE_ERROR_REDO;
                break;
            case 1423:
                rmwVar = defpackage.rmw.VM_GREETING_BACK_BUTTON;
                break;
            case 1424:
                rmwVar = defpackage.rmw.FAVORITE_SUGGESTION_CLICK;
                break;
            case 1425:
                rmwVar = defpackage.rmw.FAVORITE_SUGGESTION_VOICE_CALL;
                break;
            case 1426:
                rmwVar = defpackage.rmw.FAVORITE_SUGGESTION_SEND_MESSAGE;
                break;
            case 1427:
                rmwVar = defpackage.rmw.FAVORITE_SUGGESTION_ADD_FAVORITE;
                break;
            case 1428:
                rmwVar = defpackage.rmw.FAVORITE_SUGGESTION_IMS_VIDEO_CALL;
                break;
            case 1429:
                rmwVar = defpackage.rmw.FAVORITE_SUGGESTION_DUO_VIDEO_CALL;
                break;
            case 1430:
                rmwVar = defpackage.rmw.FAVORITE_SUGGESTION_DUO_INVITE;
                break;
            case 1431:
                rmwVar = defpackage.rmw.FAVORITE_SUGGESTION_DUO_INSTALL;
                break;
            case 1432:
                rmwVar = defpackage.rmw.FAVORITE_SUGGESTION_DUO_ACTIVATE;
                break;
            case 1433:
                rmwVar = defpackage.rmw.DUO_FAVORITE_SUGGESTION_INVITE_SHOWN;
                break;
            case 1434:
                rmwVar = defpackage.rmw.DUO_FAVORITE_SUGGESTION_SET_UP_INSTALL_SHOWN;
                break;
            case 1435:
                rmwVar = defpackage.rmw.DUO_FAVORITE_SUGGESTION_SET_UP_ACTIVATE_SHOWN;
                break;
            case 1436:
                rmwVar = defpackage.rmw.CALL_LOG_EDIT_NUMBER_BEFORE_CALL;
                break;
            case 1437:
                rmwVar = defpackage.rmw.VVM_NOTIFICATION_INBOX_FULL_NOTIFIED;
                break;
            case 1438:
                rmwVar = defpackage.rmw.DARK_MODE_TOGGLE_OFF_BY_POWER_SAVER;
                break;
            case 1439:
                rmwVar = defpackage.rmw.DARK_MODE_TOGGLE_ON_BY_POWER_SAVER;
                break;
            case 1440:
                rmwVar = defpackage.rmw.DARK_MODE_TOGGLE_OFF_BY_APP_SETTINGS;
                break;
            case 1441:
                rmwVar = defpackage.rmw.DARK_MODE_TOGGLE_ON_BY_APP_SETTINGS;
                break;
            case 1442:
                rmwVar = defpackage.rmw.DARK_MODE_TOGGLE_OFF_BY_CONTACTS;
                break;
            case 1443:
                rmwVar = defpackage.rmw.DARK_MODE_TOGGLE_ON_BY_CONTACTS;
                break;
            case 1444:
                rmwVar = defpackage.rmw.DARK_MODE_TOGGLE_OFF_BY_UNIVERSAL_SETTINGS;
                break;
            case 1445:
                rmwVar = defpackage.rmw.DARK_MODE_TOGGLE_ON_BY_UNIVERSAL_SETTINGS;
                break;
            case 1446:
                rmwVar = defpackage.rmw.APP_LAUNCHED_IN_DARK_MODE;
                break;
            case 1447:
                rmwVar = defpackage.rmw.APP_LAUNCHED_IN_LIGHT;
                break;
            case 1448:
                rmwVar = defpackage.rmw.APP_LAUNCHED_IN_LIGHT_WITHOUT_DARK_AVAILABLE;
                break;
            case 1449:
                rmwVar = defpackage.rmw.VIDEO_CALL_CAMERA_DIMENSIONS_RECEIVED;
                break;
            case 1450:
                rmwVar = defpackage.rmw.VIDEO_CALL_PEER_DIMENSIONS_RECEIVED;
                break;
            case 1451:
                rmwVar = defpackage.rmw.VM_GREETING_ENTERED_FROM_VOICEMAIL_SETTINGS;
                break;
            case 1452:
                rmwVar = defpackage.rmw.VM_GREETING_TEMP_RECORDING_PLAYED;
                break;
            case 1453:
                rmwVar = defpackage.rmw.VM_GREETING_SAVED_RECORDING_PLAYED;
                break;
            case 1454:
                rmwVar = defpackage.rmw.VM_GREETING_PERMISSION_REQUESTED;
                break;
            case 1455:
                rmwVar = defpackage.rmw.VM_GREETING_PERMISSION_DENIED;
                break;
            case 1456:
                rmwVar = defpackage.rmw.VM_GREETING_PERMISSION_ALLOWED;
                break;
            case 1457:
                rmwVar = defpackage.rmw.VVM_GREETING_ENTERED_FROM_VOICEMAIL_TAB;
                break;
            case 1458:
                rmwVar = defpackage.rmw.CALL_INITIATED_FROM_SMARTDIAL_WITH_T9_MATCH;
                break;
            case 1459:
                rmwVar = defpackage.rmw.CALL_INITIATED_FROM_SMARTDIAL_WITH_NUMBER_MATCH;
                break;
            case 1460:
                rmwVar = defpackage.rmw.MAIN_TOOLBAR_SHOW_MENU;
                break;
            case 1461:
                rmwVar = defpackage.rmw.MAIN_TOOLBAR_MENU_OPEN_CALL_HISTORY;
                break;
            case 1462:
                rmwVar = defpackage.rmw.MAIN_TOOLBAR_MENU_OPEN_SETTINGS;
                break;
            case 1463:
                rmwVar = defpackage.rmw.DIALER_GATEWAY_CALL_INFO_LOOKUP_SERVICE_PHONE_LOOKUP_TIMEOUT;
                break;
            case 1464:
                rmwVar = defpackage.rmw.DIALER_GATEWAY_CALL_INFO_LOOKUP_SERVICE_PHONE_LOOKUP_FAILED;
                break;
            case 1465:
                rmwVar = defpackage.rmw.CALLEE_DATA_USED;
                break;
            case 1466:
                rmwVar = defpackage.rmw.DIALOG_ACTION_CONFIRM_NUMBER_SPAM;
                break;
            case 1467:
                rmwVar = defpackage.rmw.SEND_TEXT_MESSAGE_FROM_SEARCH;
                break;
            case 1468:
                rmwVar = defpackage.rmw.ADD_CONTACT_FROM_SEARCH;
                break;
            case 1469:
                rmwVar = defpackage.rmw.IMS_VIDEO_REQUESTED_FROM_DIALPAD;
                break;
            case 1470:
                rmwVar = defpackage.rmw.VVM_TRANSCRIPTION_RATING_GOOD;
                break;
            case 1471:
                rmwVar = defpackage.rmw.VVM_TRANSCRIPTION_RATING_BAD;
                break;
            case 1472:
                rmwVar = defpackage.rmw.ASSISTED_EMERGENCY_DIALING_PANEL_SHOWN;
                break;
            case 1473:
                rmwVar = defpackage.rmw.ASSISTED_EMERGENCY_DIALING_RTT_BUTTON_SHOWN;
                break;
            case 1474:
                rmwVar = defpackage.rmw.ASSISTED_EMERGENCY_DIALING_VOICE_ASSIST_BUTTONS_SHOWN;
                break;
            case 1475:
                rmwVar = defpackage.rmw.ASSISTED_EMERGENCY_DIALING_RTT_UPGRADE_REQUESTED;
                break;
            case 1476:
                rmwVar = defpackage.rmw.ASSISTED_EMERGENCY_DIALING_RTT_BUTTON_CLICKED;
                break;
            case 1477:
                rmwVar = defpackage.rmw.ASSISTED_EMERGENCY_DIALING_VOICE_ASSIST_BUTTON_CLICKED;
                break;
            case 1478:
                rmwVar = defpackage.rmw.ASSISTED_EMERGENCY_DIALING_VOICE_ASSIST_FAILED;
                break;
            case 1479:
                rmwVar = defpackage.rmw.ASSISTED_EMERGENCY_DIALING_VOICE_ASSIST_AUDIO_PLAY_COMPLETED;
                break;
            case 1481:
                rmwVar = defpackage.rmw.CALL_SCREENING_SERVICE_MUSIC_IS_ACTIVE;
                break;
            case 1482:
                rmwVar = defpackage.rmw.CALL_SCREENING_SERVICE_MUSIC_IS_NOT_ACTIVE;
                break;
            case 1483:
                rmwVar = defpackage.rmw.CALL_DETAILS_LAUNCHED_FROM_CALL_LOG;
                break;
            case 1484:
                rmwVar = defpackage.rmw.CALL_LOG_COPY_NUMBER;
                break;
            case 1485:
                rmwVar = defpackage.rmw.CALL_LOG_EXPAND_DROPDOWN_MENU;
                break;
            case 1486:
                rmwVar = defpackage.rmw.CALL_LOG_SHOW_POPUP_MENU;
                break;
            case 1487:
                rmwVar = defpackage.rmw.OPEN_HISTORY_FROM_SEARCH;
                break;
            case 1488:
                rmwVar = defpackage.rmw.SEND_TEXT_MESSAGE_FROM_DIALPAD;
                break;
            case 1489:
                rmwVar = defpackage.rmw.ADD_CONTACT_FROM_DIALPAD;
                break;
            case 1490:
                rmwVar = defpackage.rmw.OPEN_HISTORY_FROM_DIALPAD;
                break;
            case 1491:
                rmwVar = defpackage.rmw.EXPANDEDSHEET_EXPANDED_FROM_SEARCH;
                break;
            case 1492:
                rmwVar = defpackage.rmw.EXPANDEDSHEET_EXPANDED_FROM_DIALPAD;
                break;
            case 1493:
                rmwVar = defpackage.rmw.OPEN_QUICK_CONTACT_FROM_SEARCH;
                break;
            case 1494:
                rmwVar = defpackage.rmw.OPEN_QUICK_CONTACT_FROM_DIALPAD;
                break;
            case 1495:
                rmwVar = defpackage.rmw.IN_CALL_SCREEN_CALL_HELD;
                break;
            case 1496:
                rmwVar = defpackage.rmw.IN_CALL_SCREEN_CALL_UNHELD;
                break;
            case 1497:
                rmwVar = defpackage.rmw.CALL_DETAILS_BLOCK_REPORT_SPAM;
                break;
            case 1498:
                rmwVar = defpackage.rmw.CALL_DETAILS_BLOCK_NUMBER;
                break;
            case 1499:
                rmwVar = defpackage.rmw.CALL_DETAILS_UNBLOCK_NUMBER;
                break;
            case 1500:
                rmwVar = defpackage.rmw.CALL_DETAILS_REPORT_AS_NOT_SPAM;
                break;
            case 1501:
                rmwVar = defpackage.rmw.CREATE_NEW_CONTACT_FROM_CALL_DETAILS;
                break;
            case 1502:
                rmwVar = defpackage.rmw.CALL_DETAILS_SEND_MESSAGE;
                break;
            case 1503:
                rmwVar = defpackage.rmw.CALL_LOG_LAUNCHED_WITH_CONVERSATION_HISTORY_ENABLED;
                break;
            case 1504:
                rmwVar = defpackage.rmw.CALL_LOG_LAUNCHED_WITH_CONVERSATION_HISTORY_DISABLED;
                break;
            case 1505:
                rmwVar = defpackage.rmw.DARK_MODE_SET_FOLLOW_SYSTEM_BY_APP_SETTING;
                break;
            case 1506:
                rmwVar = defpackage.rmw.DARK_MODE_SET_FOLLOW_SYSTEM_BY_CONTACTS;
                break;
            case 1507:
                rmwVar = defpackage.rmw.REVELIO_INCOMING_CALL_SILENCED;
                break;
            case 1508:
                rmwVar = defpackage.rmw.CONVERSATION_HISTORY_ADD_CONTACT_CHIP_SHOWN;
                break;
            case 1509:
                rmwVar = defpackage.rmw.CONVERSATION_HISTORY_REPORT_SPAM_CHIP_SHOWN;
                break;
            case 1510:
                rmwVar = defpackage.rmw.CALL_SCREENING_SERVICE_FUTURE_TIMED_OUT;
                break;
            case 1511:
                rmwVar = defpackage.rmw.RAMPING_RINGER;
                break;
            case 1512:
                rmwVar = defpackage.rmw.VM_GREETING_DEFAULT;
                break;
            case 1513:
                rmwVar = defpackage.rmw.VM_GREETING_CUSTOM;
                break;
            case 1514:
                rmwVar = defpackage.rmw.CALL_SCREEN_AUDIO_RECORDING_SAVED;
                break;
            case 1515:
                rmwVar = defpackage.rmw.CALL_SCREEN_AUDIO_RECORDING_PLAYED_BACK_IN_TRANSCRIPT_VIEW;
                break;
            case 1516:
                rmwVar = defpackage.rmw.CALL_SCREEN_AUDIO_RECORDING_PLAYBACK_FAILED_IN_TRANSCRIPT_VIEW;
                break;
            case 1517:
                rmwVar = defpackage.rmw.ASSISTED_EMERGENCY_DIALING_CAR_CRASH_ACTION_TRIGGERED;
                break;
            case 1518:
                rmwVar = defpackage.rmw.CALL_SCREEN_DATA_STORE_MIGRATED_TO_TIKTOK;
                break;
            case 1519:
                rmwVar = defpackage.rmw.REVELIO_DATA_STORE_MIGRATED_TO_TIKTOK;
                break;
            case 1520:
                rmwVar = defpackage.rmw.SCOOBY_CALL_REPORT_SPAM;
                break;
            case 1521:
                rmwVar = defpackage.rmw.SCOOBY_CALL_REPORT_CONFIRM_SPAM;
                break;
            case 1522:
                rmwVar = defpackage.rmw.SCOOBY_CALL_REPORT_NOT_SPAM;
                break;
            case 1523:
                rmwVar = defpackage.rmw.CALL_SCREEN_AUDIO_RECORDING_TRANSCRIPT_OPENED_FROM_CALLLOG;
                break;
            case 1524:
                rmwVar = defpackage.rmw.CALL_SCREEN_AUDIO_RECORDING_TRANSCRIPT_AND_AUDIO_OPENED_FROM_CALLLOG;
                break;
            case 1525:
                rmwVar = defpackage.rmw.REJECT_INCOMING_CALL_FROM_ANSWER_SCREEN_BY_TEXT;
                break;
            case 1526:
                rmwVar = defpackage.rmw.VVM_TRANSCRIPTION_RESPONSE_SPATULA_AUTH_EXCEPTION;
                break;
            case 1527:
                rmwVar = defpackage.rmw.USER_ACTION_ENABLED_SPAM_CALLER_ID;
                break;
            case 1528:
                rmwVar = defpackage.rmw.USER_ACTION_DISABLED_SPAM_CALLER_ID;
                break;
            case 1529:
                rmwVar = defpackage.rmw.DOWNLOADABLE_DEFAULT_DIALER_VIEW_SHOWN;
                break;
            case 1530:
                rmwVar = defpackage.rmw.DOWNLOADABLE_DEFAULT_DIALER_CANCELLED;
                break;
            case 1531:
                rmwVar = defpackage.rmw.DOWNLOADABLE_DEFAULT_DIALER_USER_CONVERTED;
                break;
            case 1532:
                rmwVar = defpackage.rmw.EMERGENCY_LOCATION_ERROR_SHOWN;
                break;
            case 1533:
                rmwVar = defpackage.rmw.TIDEPODS_CONTACT_GRID_MATCH;
                break;
            case 1534:
                rmwVar = defpackage.rmw.TIDEPODS_CONTACT_GRID_MISMATCH;
                break;
            case 1535:
                rmwVar = defpackage.rmw.TIDEPODS_CONTACT_GRID_UNCORRECTED_MISMATCH;
                break;
            case 1536:
                rmwVar = defpackage.rmw.VVM_ARCHIVE_ENTER_SAVE_FOLDER;
                break;
            case 1537:
                rmwVar = defpackage.rmw.VVM_ARCHIVE_PLAY_AUDIO_AFTER_EXPANDING_ENTRY;
                break;
            case 1538:
                rmwVar = defpackage.rmw.VVM_ARCHIVE_PLAY_AUDIO_DIRECTLY;
                break;
            case 1539:
                rmwVar = defpackage.rmw.VVM_ARCHIVE_MULTISELECT_DELETE_ENTRY_VIA_CONFIRMATION_DIALOG;
                break;
            case 1540:
                rmwVar = defpackage.rmw.VVM_ARCHIVE_MULTISELECT_SAVE_ENTRY;
                break;
            case 1541:
                rmwVar = defpackage.rmw.VVM_ARCHIVE_MULTISELECT_SAVE_ENTRY_VIA_CONFIRMATION_DIALOG;
                break;
            case 1542:
                rmwVar = defpackage.rmw.VIDEO_CALL_DOWNGRADE_REQUESTED;
                break;
            case 1543:
                rmwVar = defpackage.rmw.IMS_VIDEO_DOWNGRADE_REQUESTED;
                break;
            case 1544:
                rmwVar = defpackage.rmw.FAVORITE_SET_RTT_DEFAULT;
                break;
            case 1545:
                rmwVar = defpackage.rmw.VIDEO_CALL_REQUEST_ACCEPTED_AS_RECEPTION_ONLY;
                break;
            case 1546:
                rmwVar = defpackage.rmw.IN_CALL_SWAP_CALLS_BUTTON_PRESSED;
                break;
            case 1547:
                rmwVar = defpackage.rmw.IN_CALL_CHANGE_TO_RTT_BUTTON_PRESSED;
                break;
            case 1548:
                rmwVar = defpackage.rmw.IN_CALL_END_CALL_BUTTON_PRESSED;
                break;
            case 1549:
                rmwVar = defpackage.rmw.IN_CALL_RTT_BACK_TO_VOICE_BUTTON_PRESSED;
                break;
            case 1550:
                rmwVar = defpackage.rmw.ASSISTED_EMERGENCY_DIALING_VOICE_ASSIST_AUDIO_PLAY_STARTED;
                break;
            case 1551:
                rmwVar = defpackage.rmw.ASSISTED_EMERGENCY_DIALING_VOICE_ASSIST_AUDIO_PLAY_RESTARTED;
                break;
            case 1552:
                rmwVar = defpackage.rmw.LOCATION_CHANGED_BROADCAST_RECEIVER_CALLED;
                break;
            case 1554:
                rmwVar = defpackage.rmw.VIDEO_FAB_SHOWN_WITH_DUO_ICON;
                break;
            case 1555:
                rmwVar = defpackage.rmw.VIDEO_FAB_SHOWN_WITH_VIDEOCAM_ICON;
                break;
            case 1556:
                rmwVar = defpackage.rmw.VIDEO_FAB_CLICKED_WITH_DUO_ICON;
                break;
            case 1557:
                rmwVar = defpackage.rmw.VIDEO_FAB_CLICKED_WITH_VIDEOCAM_ICON;
                break;
            case 1558:
                rmwVar = defpackage.rmw.PRIDE_MODE_TURN_ON;
                break;
            case 1559:
                rmwVar = defpackage.rmw.PRIDE_MODE_TURN_OFF;
                break;
            case 1560:
                rmwVar = defpackage.rmw.PRIDE_INCALL_ANIMATION_SHOWN;
                break;
            case 1561:
                rmwVar = defpackage.rmw.VIDEO_CALL_BUTTON_SHOWN_IN_CONVERSATION_HISTORY_CALL_DETAILS;
                break;
            case 1562:
                rmwVar = defpackage.rmw.VIDEO_CALL_BUTTON_SHOWN_IN_CONVERSATION_HISTORY_DROPDOWN;
                break;
            case 1563:
                rmwVar = defpackage.rmw.VIDEO_CALL_BUTTON_SHOWN_IN_FAVORITES_SUGGESTED_CONTACT;
                break;
            case 1564:
                rmwVar = defpackage.rmw.VIDEO_CALL_BUTTON_SHOWN_IN_SEARCH;
                break;
            case 1565:
                rmwVar = defpackage.rmw.TIDEPODS_ANSWER_SCREEN_INCOMING_CALL_SHOWED;
                break;
            case 1566:
                rmwVar = defpackage.rmw.TIDEPODS_ANSWER_SCREEN_ACCEPTED_CALL;
                break;
            case 1567:
                rmwVar = defpackage.rmw.TIDEPODS_ANSWER_SCREEN_CALL_SCREEN;
                break;
            case 1568:
                rmwVar = defpackage.rmw.TIDEPODS_REJECT_INCOMING_CALL_FROM_ANSWER_SCREEN;
                break;
            case 1569:
                rmwVar = defpackage.rmw.TIDEPODS_REJECT_INCOMING_CALL_FROM_ANSWER_SCREEN_BY_TEXT;
                break;
            case 1570:
                rmwVar = defpackage.rmw.TIDEPODS_STATUS_BAR_NOTIFICATION_ANSWER;
                break;
            case 1571:
                rmwVar = defpackage.rmw.TIDEPODS_STATUS_BAR_NOTIFICATION_REJECT;
                break;
            case 1572:
                rmwVar = defpackage.rmw.TIDEPODS_STATUS_BAR_NOTIFICATION_DISCONNECT;
                break;
            case 1573:
                rmwVar = defpackage.rmw.NEARBY_PLACES_ENABLED;
                break;
            case 1574:
                rmwVar = defpackage.rmw.NEARBY_PLACES_PERSONAL_RESULTS_ENABLED;
                break;
            case 1575:
                rmwVar = defpackage.rmw.NEARBY_PLACES_RESULT_CALLED;
                break;
            case 1576:
                rmwVar = defpackage.rmw.CALL_SCREENING_SERVICE_REVELIO_USE_R_API;
                break;
            case 1577:
                rmwVar = defpackage.rmw.REVELIO_R_API_UNAVAILABLE_DUE_TO_SDK;
                break;
            case 1578:
                rmwVar = defpackage.rmw.REVELIO_R_API_UNAVAILABLE_DUE_TO_TARGET_SDK;
                break;
            case 1579:
                rmwVar = defpackage.rmw.REVELIO_R_API_UNAVAILABLE_DUE_TO_FLAG_OFF;
                break;
            case 1580:
                rmwVar = defpackage.rmw.REVELIO_R_API_AVAILABLE;
                break;
            case 1581:
                rmwVar = defpackage.rmw.VIDEO_FAB_STARTED_DUO_CALL_WITH_SUGGESTED_CONTACT;
                break;
            case 1582:
                rmwVar = defpackage.rmw.VIDEO_FAB_STARTED_DUO_CALL_WITH_SEARCH_RESULT_CONTACT;
                break;
            case 1583:
                rmwVar = defpackage.rmw.VIDEO_FAB_GROUP_CALLING_PROMO_SIMPLE_CLICKED;
                break;
            case 1584:
                rmwVar = defpackage.rmw.VIDEO_FAB_GROUP_CALLING_PROMO_ANIMATED_CLICKED;
                break;
            case 1585:
                rmwVar = defpackage.rmw.TIDEPODS_STATUS_BAR_NOTIFICATION_SHOWED;
                break;
            case 1586:
                rmwVar = defpackage.rmw.VIDEO_FAB_STARTED_VILTE_CALL_WITH_SUGGESTED_CONTACT;
                break;
            case 1587:
                rmwVar = defpackage.rmw.VIDEO_FAB_STARTED_VILTE_CALL_WITH_SEARCH_RESULT_CONTACT;
                break;
            case 1588:
                rmwVar = defpackage.rmw.TIDEPODS_STATUS_BAR_NOTIFICATION_SPEAKER_ON;
                break;
            case 1589:
                rmwVar = defpackage.rmw.TIDEPODS_STATUS_BAR_NOTIFICATION_SPEAKER_OFF;
                break;
            case 1590:
                rmwVar = defpackage.rmw.TIDEPODS_STATUS_BAR_NOTIFICATION_ANSWER_VIDEO;
                break;
            case 1591:
                rmwVar = defpackage.rmw.TIDEPODS_STATUS_BAR_NOTIFICATION_ANSWER_AS_RTT;
                break;
            case 1592:
                rmwVar = defpackage.rmw.TIDEPODS_STATUS_BAR_NOTIFICATION_ACCEPT_VIDEO_UPGRADE;
                break;
            case 1593:
                rmwVar = defpackage.rmw.TIDEPODS_STATUS_BAR_NOTIFICATION_DECLINE_VIDEO_UPGRADE;
                break;
            case 1594:
                rmwVar = defpackage.rmw.TIDEPODS_STATUS_BAR_NOTIFICATION_GAMING_MODE_ANSWER;
                break;
            case 1595:
                rmwVar = defpackage.rmw.TIDEPODS_BUBBLE_DISCONNECT;
                break;
            case 1596:
                rmwVar = defpackage.rmw.TIDEPODS_BUBBLE_RETURN_TO_CALL;
                break;
            case 1597:
                rmwVar = defpackage.rmw.TIDEPODS_BUBBLE_SPEAKER_ON;
                break;
            case 1598:
                rmwVar = defpackage.rmw.TIDEPODS_BUBBLE_SPEAKER_OFF;
                break;
            case 1599:
                rmwVar = defpackage.rmw.TIDEPODS_BUBBLE_MUTE_ON;
                break;
            case 1600:
                rmwVar = defpackage.rmw.TIDEPODS_BUBBLE_MUTE_OFF;
                break;
            case 1601:
                rmwVar = defpackage.rmw.TIDEPODS_BUBBLE_AUDIO_ROUTE_SELECTOR;
                break;
            case 1602:
                rmwVar = defpackage.rmw.TIDEPODS_BUBBLE_SHOWED;
                break;
            case 1603:
                rmwVar = defpackage.rmw.DIALER_GATEWAY_CALL_INFO_LOOKUP_SERVICE_PHONE_LOOKUP_UNAUTHENTICATED;
                break;
            case 1604:
                rmwVar = defpackage.rmw.CALL_LOG_SEARCH_ENABLED;
                break;
            case 1605:
                rmwVar = defpackage.rmw.CALL_LOG_SEARCH_RESULT_CALLED;
                break;
            case 1606:
                rmwVar = defpackage.rmw.ASSISTED_EMERGENCY_DIALING_EMERGENCY_SOS_ACTION_TRIGGERED;
                break;
            case 1607:
                rmwVar = defpackage.rmw.EMERGENCY_DIDNT_GET_LOCATION;
                break;
            case 1608:
                rmwVar = defpackage.rmw.VVM_DELETE_MESSAGE_FAILED;
                break;
            case 1609:
                rmwVar = defpackage.rmw.TIDEPODS_STATUS_BAR_NOTIFICATION_TOGGLE_MUTE;
                break;
            case 1610:
                rmwVar = defpackage.rmw.MAIN_TOOLBAR_SEND_FEEDBACK;
                break;
            case 1611:
                rmwVar = defpackage.rmw.ATLAS_FAILED_TO_START_OFF_HOLD_DETECTION;
                break;
            case 1612:
                rmwVar = defpackage.rmw.ATLAS_STOP_ITSELF;
                break;
            case 1613:
                rmwVar = defpackage.rmw.VIDEO_CALL_INTRODUCTION_SHOW_DIALOG;
                break;
            case 1614:
                rmwVar = defpackage.rmw.VIDEO_CALL_INTRODUCTION_CANCEL_DIALOG;
                break;
            case 1615:
                rmwVar = defpackage.rmw.VIDEO_CALL_INTRODUCTION_DEMO_COMPLETED;
                break;
            case 1616:
                rmwVar = defpackage.rmw.TIDEPODS_STATUS_BAR_NOTIFICATION_FIRST_SHOWN_WITHIN_TIMEOUT;
                break;
            case 1617:
                rmwVar = defpackage.rmw.TIDEPODS_STATUS_BAR_NOTIFICATION_FIRST_SHOWN_TIMED_OUT;
                break;
            case 1618:
                rmwVar = defpackage.rmw.TIDEPODS_DEFAULT_NOTIFICATION_MODEL_SHOWED;
                break;
            case 1619:
                rmwVar = defpackage.rmw.CALL_LOG_PHONE_ICON_TAPPED;
                break;
            case 1620:
                rmwVar = defpackage.rmw.CREATE_NEW_CONTACT_FROM_CONTACTS;
                break;
            case 1621:
                rmwVar = defpackage.rmw.REPORT_CALL_AS_SPAM_VIA_CALL_LOG_BLOCK_REPORT_SPAM_SENT_VIA_BLOCK_NUMBER_DIALOG_SPAM_DISABLED;
                break;
            case 1622:
                rmwVar = defpackage.rmw.DIALOG_ACTION_CONFIRM_NUMBER_NOT_SPAM_SPAM_DISABLED;
                break;
            case 1623:
                rmwVar = defpackage.rmw.DIALOG_ACTION_CONFIRM_NUMBER_SPAM_SPAM_DISABLED;
                break;
            case 1624:
                rmwVar = defpackage.rmw.VVM_ACTIVATION_SUCCESSFUL;
                break;
            case 1625:
                rmwVar = defpackage.rmw.IMS_VIDEO_REQUESTED_FROM_VOICEMAIL;
                break;
            case 1626:
                rmwVar = defpackage.rmw.LIGHTBRINGER_VIDEO_REQUESTED_FROM_VOICEMAIL;
                break;
            case 1627:
                rmwVar = defpackage.rmw.LIGHTBRINGER_NON_CONTACT_VIDEO_REQUESTED_FROM_VOICEMAIL;
                break;
            case 1628:
                rmwVar = defpackage.rmw.VOICEMAIL_SEND_MESSAGE;
                break;
            case 1629:
                rmwVar = defpackage.rmw.VOICEMAIL_UNBLOCK_NUMBER;
                break;
            case 1630:
                rmwVar = defpackage.rmw.VOICEMAIL_REPORT_AS_NOT_SPAM;
                break;
            case 1631:
                rmwVar = defpackage.rmw.VOICEMAIL_BLOCK_NUMBER;
                break;
            case 1632:
                rmwVar = defpackage.rmw.VOICEMAIL_BLOCK_REPORT_SPAM;
                break;
            case 1633:
                rmwVar = defpackage.rmw.VVM_ACTIVATION_COMPLETED_SUBSCRIBER_UNKNOWN;
                break;
            case 1634:
                rmwVar = defpackage.rmw.VVM_ACTIVATION_COMPLETED_SUBSCRIBER_BLOCKED;
                break;
            case 1635:
                rmwVar = defpackage.rmw.DIALER_GATEWAY_CALL_INFO_LOOKUP_SERVICE_REQUEST_GENERATED;
                break;
            case 1636:
                rmwVar = defpackage.rmw.DIALER_GATEWAY_CALL_INFO_LOOKUP_SERVICE_SPATULA_EXCEPTION;
                break;
            case 1637:
                rmwVar = defpackage.rmw.DIALER_GATEWAY_CALL_INFO_LOOKUP_SERVICE_JSON_EXCEPTION;
                break;
            case 1638:
                rmwVar = defpackage.rmw.DIALER_GATEWAY_CALL_INFO_LOOKUP_SERVICE_RESPONSE_RECEIVED;
                break;
            case 1639:
                rmwVar = defpackage.rmw.MAIN_TOOLBAR_MENU_CLEAR_CALL_HISTORY;
                break;
            case 1640:
                rmwVar = defpackage.rmw.VVM_ACTIVATION_ALREADY_ACTIVATED;
                break;
            case 1641:
                rmwVar = defpackage.rmw.VVM_ACTIVATION_ADD_ACCOUNT_STARTED;
                break;
            case 1642:
                rmwVar = defpackage.rmw.VVM_ACTIVATION_ADD_ACCOUNT_COMPLETED;
                break;
            case 1643:
                rmwVar = defpackage.rmw.VVM_ACTIVATION_REMOVE_ACCOUNT_STARTED;
                break;
            case 1644:
                rmwVar = defpackage.rmw.VVM_ACTIVATION_REMOVE_ACCOUNT_COMPLETED;
                break;
            case 1645:
                rmwVar = defpackage.rmw.VVM_ACCOUNT_STATE_ADD_ACCOUNT_STARTED;
                break;
            case 1646:
                rmwVar = defpackage.rmw.VVM_ACCOUNT_STATE_ADD_ACCOUNT_COMPLETED;
                break;
            case 1647:
                rmwVar = defpackage.rmw.VVM_ACCOUNT_STATE_DISABLE_ACCOUNT_STARTED;
                break;
            case 1648:
                rmwVar = defpackage.rmw.VVM_ACCOUNT_STATE_DISABLE_ACCOUNT_COMPLETED;
                break;
            case 1649:
                rmwVar = defpackage.rmw.VVM_ACTIVATION_DEVICE_NOT_PROVISIONED_YET;
                break;
            case 1650:
                rmwVar = defpackage.rmw.TIDEPODS_STATUS_BAR_NOTIFICATION_UNHOLD;
                break;
            case 1651:
                rmwVar = defpackage.rmw.DIALER_GATEWAY_CALL_INFO_LOOKUP_SERVICE_RESOURCE_EXHAUSTED;
                break;
            case 1652:
                rmwVar = defpackage.rmw.DIALER_GATEWAY_CALL_INFO_LOOKUP_SERVICE_UNAVAILABLE;
                break;
        }
        return rmwVar != null;
    }
}
