package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tvv {
    public final android.content.Context c;
    public final zth d;
    public final oko e;
    private final ahzi g = ahvr.bI(new exm(this, 17));
    public static final aimz a = aimz.i("com/android/dialer/smartdial/util/SmartDialPrefix");
    private static final aihd f = aihd.v("US", "CA", "AS", "AI", "AG", "BS", new java.lang.String[]{"BB", "BM", "VG", "KY", "DM", "DO", "GD", "GU", "JM", "PR", "MS", "MP", "KN", "LC", "VC", "TT", "TC", "VI"});
    public static final aihd b = aihd.v("1", "7", "20", "27", "30", "31", new java.lang.String[]{"32", "33", "34", "36", "39", "40", "41", "43", "44", "45", "46", "47", "48", "49", "51", "52", "53", "54", "55", "56", "57", "58", "60", "61", "62", "63", "64", "65", "66", "81", "82", "84", "86", "90", "91", "92", "93", "94", "95", "98", "211", "212", "213", "216", "218", "220", "221", "222", "223", "224", "225", "226", "227", "228", "229", "230", "231", "232", "233", "234", "235", "236", "237", "238", "239", "240", "241", "242", "243", "244", "245", "246", "247", "248", "249", "250", "251", "252", "253", "254", "255", "256", "257", "258", "260", "261", "262", "263", "264", "265", "266", "267", "268", "269", "290", "291", "297", "298", "299", "350", "351", "352", "353", "354", "355", "356", "357", "358", "359", "370", "371", "372", "373", "374", "375", "376", "377", "378", "379", "380", "381", "382", "385", "386", "387", "389", "420", "421", "423", "500", "501", "502", "503", "504", "505", "506", "507", "508", "509", "590", "591", "592", "593", "594", "595", "596", "597", "598", "599", "670", "672", "673", "674", "675", "676", "677", "678", "679", "680", "681", "682", "683", "685", "686", "687", "688", "689", "690", "691", "692", "800", "808", "850", "852", "853", "855", "856", "870", "878", "880", "881", "882", "883", "886", "888", "960", "961", "962", "963", "964", "965", "966", "967", "968", "970", "971", "972", "973", "974", "975", "976", "977", "979", "992", "993", "994", "995", "996", "998"});

    public tvv(android.content.Context context, zth zthVar, oko okoVar) {
        this.c = context;
        this.d = zthVar;
        this.e = okoVar;
    }

    public final boolean a() {
        ahzi ahziVar = this.g;
        if (((j$.util.Optional) ahziVar.eZ()).isPresent()) {
            java.lang.String str = (java.lang.String) ((j$.util.Optional) ahziVar.eZ()).orElseThrow();
            if (!android.text.TextUtils.isEmpty(str)) {
                return f.contains(str.toUpperCase(java.util.Locale.US));
            }
        }
        return false;
    }
}
