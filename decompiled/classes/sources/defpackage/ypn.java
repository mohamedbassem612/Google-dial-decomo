package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ypn implements defpackage.alal {
    private final /* synthetic */ int $cid;

    public ypn(int i) {
        this.$cid = i;
    }

    @Override // defpackage.alal
    public final /* synthetic */ java.lang.Object a(int i) {
        int i2 = this.$cid;
        if (i2 == 0) {
            defpackage.ypm ypmVarB = defpackage.ypm.b(i);
            return ypmVarB == null ? defpackage.ypm.UNRECOGNIZED : ypmVarB;
        }
        java.lang.Object obj = null;
        if (i2 == 1) {
            if (i == 0) {
                obj = defpackage.rnx.UNKNOWN_MENU_ITEM_KEY;
            } else if (i == 1) {
                obj = defpackage.rnx.VOICE_SEARCH_MENU_ITEM_KEY;
            } else if (i == 6) {
                obj = defpackage.rnx.SIMULATOR_MENU_ITEM_KEY;
            } else if (i == 7) {
                obj = defpackage.rnx.DEBUG_OPTIONS_MENU_ITEM_KEY;
            } else if (i == 10000) {
                obj = defpackage.rnx.TEST_FIRST_MENU_ITEM_KEY;
            } else if (i == 10001) {
                obj = defpackage.rnx.TEST_SECOND_MENU_ITEM_KEY;
            }
            return obj == null ? defpackage.rnx.UNRECOGNIZED : obj;
        }
        if (i2 == 2) {
            defpackage.akti aktiVarB = defpackage.akti.b(i);
            return aktiVarB == null ? defpackage.akti.REGISTRATION_REASON_UNSPECIFIED : aktiVarB;
        }
        if (i2 == 3) {
            defpackage.ajsw ajswVarB = defpackage.ajsw.b(i);
            if (ajswVarB != null) {
                return ajswVarB;
            }
        } else {
            if (i2 != 4) {
                if (i2 == 5) {
                    defpackage.agmn agmnVarB = defpackage.agmn.b(i);
                    return agmnVarB == null ? defpackage.agmn.OWNER_USER_TYPE_UNKNOWN : agmnVarB;
                }
                switch (i) {
                    case 0:
                        obj = defpackage.ajdn.UNKNOWN_API_FEATURE;
                        break;
                    case 1:
                        obj = defpackage.ajdn.CALL_INTENT_API_CALL_PHONE_NUMBER;
                        break;
                    case 2:
                        obj = defpackage.ajdn.CALL_INTENT_API_TARGETED_CALL;
                        break;
                    case 3:
                        obj = defpackage.ajdn.INTENT_API_OPEN_SETTINGS;
                        break;
                    case 4:
                        obj = defpackage.ajdn.INTENT_API_OPEN_BLOCKED_CONTACTS;
                        break;
                    case 5:
                        obj = defpackage.ajdn.CALL_INTENT_API_SELF_CALL;
                        break;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        obj = defpackage.ajdn.SERVICE_API_GET_REGISTRATION_INFO;
                        break;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        obj = defpackage.ajdn.SERVICE_API_GET_REGISTERED_ID_TYPE;
                        break;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        obj = defpackage.ajdn.DUO_KIT_REQUESTS;
                        break;
                    case 9:
                        obj = defpackage.ajdn.MEET_API_REQUESTS;
                        break;
                }
                return obj == null ? defpackage.ajdn.UNRECOGNIZED : obj;
            }
            defpackage.ajsw ajswVarB2 = defpackage.ajsw.b(i);
            if (ajswVarB2 != null) {
                return ajswVarB2;
            }
        }
        return defpackage.ajsw.UNKNOWN;
    }
}
