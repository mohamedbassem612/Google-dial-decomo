package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class akxr implements alal {
    public final /* bridge */ /* synthetic */ java.lang.Object a(int i) {
        defpackage.akwf akwfVar;
        switch (i) {
            case 0:
                akwfVar = defpackage.akwf.CPS_UNSPECIFIED;
                break;
            case 1:
                akwfVar = defpackage.akwf.CPS_OR_NONCPS_UNKNOWN;
                break;
            case 2:
                akwfVar = defpackage.akwf.CPS_NONCPS_PRODUCT;
                break;
            case 3:
                akwfVar = defpackage.akwf.CPS_SEARCH;
                break;
            case 4:
                akwfVar = defpackage.akwf.CPS_YOUTUBE;
                break;
            case 5:
                akwfVar = defpackage.akwf.CPS_ANDROID;
                break;
            case 6:
                akwfVar = defpackage.akwf.CPS_CHROME;
                break;
            case 7:
                akwfVar = defpackage.akwf.CPS_PLAYSTORE;
                break;
            case 8:
                akwfVar = defpackage.akwf.CPS_SHOPPING;
                break;
            case org.chromium.net.NetworkException.ERROR_ADDRESS_UNREACHABLE /* 9 */:
                akwfVar = defpackage.akwf.CPS_ADS;
                break;
            case org.chromium.net.NetworkException.ERROR_QUIC_PROTOCOL_FAILED /* 10 */:
                akwfVar = defpackage.akwf.CPS_MAPS;
                break;
            case org.chromium.net.NetworkException.ERROR_OTHER /* 11 */:
                akwfVar = defpackage.akwf.CPS_ASSISTANT;
                break;
            case 12:
                akwfVar = defpackage.akwf.CPS_CONTACTS;
                break;
            case 13:
                akwfVar = defpackage.akwf.NOT_FOR_USE_WITH_EXHAUSTIVE_SWITCH_STATEMENTS;
                break;
            case 14:
                akwfVar = defpackage.akwf.CPS_NEWS;
                break;
            case 15:
                akwfVar = defpackage.akwf.CPS_PAYMENTS_AND_WALLET;
                break;
            case 16:
                akwfVar = defpackage.akwf.CPS_WORKSPACE_COMMUNICATIONS;
                break;
            case 17:
                akwfVar = defpackage.akwf.CPS_WORKSPACE_DOCUMENT_PROCESSING;
                break;
            case 18:
                akwfVar = defpackage.akwf.CPS_WORKSPACE_EMAIL_AND_SCHEDULING;
                break;
            case 19:
                akwfVar = defpackage.akwf.CPS_ACCOMMODATIONS;
                break;
            case 20:
                akwfVar = defpackage.akwf.CPS_ANDROID_AUTO;
                break;
            case 21:
                akwfVar = defpackage.akwf.CPS_ANDROID_TV;
                break;
            case 22:
                akwfVar = defpackage.akwf.CPS_AUTHENTICATOR;
                break;
            case 23:
                akwfVar = defpackage.akwf.CPS_CHROME_WEB_STORE;
                break;
            case 24:
                akwfVar = defpackage.akwf.CPS_FILES_BY_GOOGLE;
                break;
            case 25:
                akwfVar = defpackage.akwf.CPS_FLIGHTS;
                break;
            case 26:
                akwfVar = defpackage.akwf.CPS_GALLERY_GO;
                break;
            case 27:
                akwfVar = defpackage.akwf.CPS_GBOARD;
                break;
            case 28:
                akwfVar = defpackage.akwf.CPS_GOOGLE_ONE;
                break;
            case 29:
                akwfVar = defpackage.akwf.CPS_GOOGLE_PHOTOS;
                break;
            case 30:
                akwfVar = defpackage.akwf.CPS_GOOGLE_SIGN_IN;
                break;
            case 31:
                akwfVar = defpackage.akwf.CPS_GOOGLE_TV;
                break;
            case 32:
                akwfVar = defpackage.akwf.CPS_TRANSLATE;
                break;
            case 33:
                akwfVar = defpackage.akwf.CPS_WEATHER_IMMERSIVE;
                break;
            case 34:
                akwfVar = defpackage.akwf.CPS_DIGITAL_WELLBEING;
                break;
            case 35:
                akwfVar = defpackage.akwf.CPS_GEMINI_APPS;
                break;
            case 36:
                akwfVar = defpackage.akwf.CPS_GOOGLE_EARTH;
                break;
            case 37:
                akwfVar = defpackage.akwf.CPS_MESSAGES;
                break;
            case 38:
                akwfVar = defpackage.akwf.CPS_WAZE;
                break;
            case 39:
                akwfVar = defpackage.akwf.CPS_SNAPSEED;
                break;
            case 40:
                akwfVar = defpackage.akwf.CPS_GOOGLE_HOME;
                break;
            case 41:
                akwfVar = defpackage.akwf.CPS_NOTEBOOK_LM;
                break;
            case 42:
                akwfVar = defpackage.akwf.CPS_FIND_MY_DEVICE;
                break;
            case 43:
                akwfVar = defpackage.akwf.CPS_HEALTH_CONNECT;
                break;
            case 44:
                akwfVar = defpackage.akwf.CPS_GOOGLE_STORE;
                break;
            default:
                akwfVar = null;
                break;
        }
        return akwfVar == null ? defpackage.akwf.UNRECOGNIZED : akwfVar;
    }
}
