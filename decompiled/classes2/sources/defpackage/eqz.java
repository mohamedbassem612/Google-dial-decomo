package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class eqz {
    public static final /* synthetic */ int a = 0;
    private static final java.util.ArrayList b = new java.util.ArrayList();
    private static final java.util.regex.Pattern c = java.util.regex.Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    public static int a(java.lang.String str, java.lang.String str2) {
        absu absuVarJ;
        switch (str.hashCode()) {
            case -2123537834:
                return str.equals("audio/eac3-joc") ? 18 : 0;
            case -1365340241:
                return str.equals("audio/vnd.dts.hd;profile=lbr") ? 8 : 0;
            case -1095064472:
                return str.equals("audio/vnd.dts") ? 7 : 0;
            case -53558318:
                if (!str.equals("audio/mp4a-latm") || str2 == null || (absuVarJ = j(str2)) == null) {
                    return 0;
                }
                return absuVarJ.b();
            case 187078296:
                return str.equals("audio/ac3") ? 5 : 0;
            case 187078297:
                return str.equals("audio/ac4") ? 17 : 0;
            case 187081724:
                return str.equals("audio/dsd") ? 31 : 0;
            case 550520934:
                return str.equals("audio/vnd.dts.uhd;profile=p2") ? 30 : 0;
            case 1504578661:
                return str.equals("audio/eac3") ? 6 : 0;
            case 1504831518:
                return str.equals("audio/mpeg") ? 9 : 0;
            case 1504891608:
                return str.equals("audio/opus") ? 20 : 0;
            case 1505942594:
                return str.equals("audio/vnd.dts.hd") ? 8 : 0;
            case 1556697186:
                return str.equals("audio/true-hd") ? 14 : 0;
            default:
                return 0;
        }
    }

    public static int b(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return -1;
        }
        if (f(str)) {
            return 1;
        }
        if (i(str)) {
            return 2;
        }
        if (h(str)) {
            return 3;
        }
        if (g(str)) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str) || "application/meta".equals(str) || "application/x-itut-t35".equals(str) || "application/x-mp4-mebx".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        java.util.ArrayList arrayList = b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            amwp amwpVar = (amwp) arrayList.get(i);
            java.lang.Object obj = amwpVar.b;
            if (str.equals(null)) {
                int i2 = amwpVar.a;
                return 0;
            }
        }
        return -1;
    }

    public static java.lang.String c(int i) {
        if (i == 32) {
            return "video/mp4v-es";
        }
        if (i == 33) {
            return "video/avc";
        }
        if (i == 35) {
            return "video/hevc";
        }
        if (i != 64) {
            if (i == 163) {
                return "video/wvc1";
            }
            if (i == 177) {
                return "video/x-vnd.on2.vp9";
            }
            if (i == 221) {
                return "audio/vorbis";
            }
            if (i == 165) {
                return "audio/ac3";
            }
            if (i == 166) {
                return "audio/eac3";
            }
            switch (i) {
                case androidx.car.app.hardware.common.CarZone.CAR_ZONE_COLUMN_PASSENGER /* 96 */:
                case 97:
                case 98:
                case 99:
                case 100:
                case androidx.car.app.hardware.info.EnergyProfile.EVCONNECTOR_TYPE_OTHER /* 101 */:
                    return "video/mpeg2";
                case 102:
                case 103:
                case 104:
                    break;
                case 105:
                case 107:
                    return "audio/mpeg";
                case 106:
                    return "video/mpeg";
                case 108:
                    return "image/jpeg";
                default:
                    switch (i) {
                        case 169:
                        case 172:
                            return "audio/vnd.dts";
                        case 170:
                        case 171:
                            return "audio/vnd.dts.hd";
                        case 173:
                            return "audio/opus";
                        case 174:
                            return "audio/ac4";
                        default:
                            return null;
                    }
            }
        }
        return "audio/mp4a-latm";
    }

    public static java.lang.String d(java.lang.String str) {
        if (str == null) {
            return null;
        }
        java.lang.String strP = ahvr.p(str);
        switch (strP.hashCode()) {
            case -1833600100:
                return strP.equals("video/x-mvhevc") ? "video/mv-hevc" : strP;
            case -1007807498:
                return strP.equals("audio/x-flac") ? "audio/flac" : strP;
            case -979095690:
                return strP.equals("application/x-mpegurl") ? "application/x-mpegURL" : strP;
            case -586683234:
                return strP.equals("audio/x-wav") ? "audio/wav" : strP;
            case -432836268:
                return strP.equals("audio/mpeg-l1") ? "audio/mpeg-L1" : strP;
            case -432836267:
                return strP.equals("audio/mpeg-l2") ? "audio/mpeg-L2" : strP;
            case 187090231:
                return strP.equals("audio/mp3") ? "audio/mpeg" : strP;
            default:
                return strP;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static boolean e(java.lang.String str, java.lang.String str2) {
        absu absuVarJ;
        int iB;
        if (str == null) {
            return false;
        }
        switch (str.hashCode()) {
            case -2123537834:
                if (!str.equals("audio/eac3-joc")) {
                    return false;
                }
                break;
            case -1743838946:
                if (!str.equals("application/x-mp4-mebx")) {
                    return false;
                }
                break;
            case -1354451219:
                if (!str.equals("application/vnd.dvb.ait")) {
                    return false;
                }
                break;
            case -1348231605:
                if (!str.equals("application/x-icy")) {
                    return false;
                }
                break;
            case -1265048566:
                if (!str.equals("application/x-camera-motion")) {
                    return false;
                }
                break;
            case -1248341703:
                if (!str.equals("application/id3")) {
                    return false;
                }
                break;
            case -432837260:
                if (!str.equals("audio/mpeg-L1")) {
                    return false;
                }
                break;
            case -432837259:
                if (!str.equals("audio/mpeg-L2")) {
                    return false;
                }
                break;
            case -53558318:
                if (!str.equals("audio/mp4a-latm") || str2 == null || (absuVarJ = j(str2)) == null || (iB = absuVarJ.b()) == 0 || iB == 16) {
                    return false;
                }
                break;
            case -43764892:
                if (!str.equals("application/meta")) {
                    return false;
                }
                break;
            case 187078296:
                if (!str.equals("audio/ac3")) {
                    return false;
                }
                break;
            case 187094639:
                if (!str.equals("audio/raw")) {
                    return false;
                }
                break;
            case 469933706:
                if (!str.equals("application/x-media3-cues")) {
                    return false;
                }
                break;
            case 1054472807:
                if (!str.equals("application/x-itut-t35")) {
                    return false;
                }
                break;
            case 1154383568:
                if (!str.equals("application/x-emsg")) {
                    return false;
                }
                break;
            case 1331836563:
                if (!str.equals("video/apv")) {
                    return false;
                }
                break;
            case 1504578661:
                if (!str.equals("audio/eac3")) {
                    return false;
                }
                break;
            case 1504619009:
                if (!str.equals("audio/flac")) {
                    return false;
                }
                break;
            case 1504831518:
                if (!str.equals("audio/mpeg")) {
                    return false;
                }
                break;
            case 1652648887:
                if (!str.equals("application/x-scte35")) {
                    return false;
                }
                break;
            case 1903231877:
                if (!str.equals("audio/g711-alaw")) {
                    return false;
                }
                break;
            case 1903589369:
                if (!str.equals("audio/g711-mlaw")) {
                    return false;
                }
                break;
            default:
                return false;
        }
        return true;
    }

    public static boolean f(java.lang.String str) {
        return "audio".equals(k(str));
    }

    public static boolean g(java.lang.String str) {
        return "image".equals(k(str)) || "application/x-image-uri".equals(str);
    }

    public static boolean h(java.lang.String str) {
        return "text".equals(k(str)) || "application/x-media3-cues".equals(str) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    public static boolean i(java.lang.String str) {
        return "video".equals(k(str));
    }

    static absu j(java.lang.String str) {
        java.util.regex.Matcher matcher = c.matcher(str);
        if (matcher.matches()) {
            java.lang.String strGroup = matcher.group(1);
            ahvr.ci(strGroup);
            java.lang.String strGroup2 = matcher.group(2);
            try {
                java.lang.Integer.parseInt(strGroup, 16);
                return new absu(strGroup2 != null ? java.lang.Integer.parseInt(strGroup2) : 0);
            } catch (java.lang.NumberFormatException unused) {
            }
        }
        return null;
    }

    private static java.lang.String k(java.lang.String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }
}
