package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class sqs implements aonj {
    private final /* synthetic */ int $cid;
    public static final defpackage.sqs i = new defpackage.sqs(8);
    public static final defpackage.sqs h = new defpackage.sqs(7);
    public static final defpackage.sqs g = new defpackage.sqs(6);
    public static final defpackage.sqs f = new defpackage.sqs(5);
    public static final defpackage.sqs e = new defpackage.sqs(4);
    public static final defpackage.sqs d = new defpackage.sqs(3);
    public static final defpackage.sqs c = new defpackage.sqs(2);
    public static final defpackage.sqs b = new defpackage.sqs(1);
    public static final defpackage.sqs a = new defpackage.sqs(0);

    public sqs(int i2) {
        this.$cid = i2;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        java.lang.Integer numValueOf = null;
        switch (this.$cid) {
            case 0:
                android.database.Cursor cursor = ((defpackage.aguo) obj).a;
                return aojh.a;
            case 1:
                android.database.Cursor cursor2 = ((defpackage.aguo) obj).a;
                int i2 = sod.a;
                java.lang.String strJ = ttj.J(cursor2, "lookup_key");
                java.lang.String strJ2 = ttj.J(cursor2, "package_name");
                java.lang.String strJ3 = ttj.J(cursor2, "display_name");
                java.lang.String strJ4 = ttj.J(cursor2, "photo_uri");
                int columnIndex = cursor2.getColumnIndex("capability");
                if (columnIndex != -1 && !cursor2.isNull(columnIndex)) {
                    numValueOf = java.lang.Integer.valueOf(cursor2.getInt(columnIndex));
                }
                return new defpackage.soe(strJ, strJ2, strJ3, strJ4, numValueOf != null ? numValueOf.intValue() : 0);
            case 2:
                android.database.Cursor cursor3 = ((defpackage.aguo) obj).a;
                return cursor3.isNull(0) ? j$.util.Optional.empty() : j$.util.Optional.of(defpackage.aguo.a(cursor3, 0));
            case 3:
                return java.lang.Long.valueOf(((defpackage.aguo) obj).a.getLong(0));
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return java.lang.Long.valueOf(((defpackage.aguo) obj).a.getLong(0));
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                android.database.Cursor cursor4 = ((defpackage.aguo) obj).a;
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                android.database.Cursor cursor5 = ((defpackage.aguo) obj).a;
                return java.lang.Long.valueOf(cursor5.getLong(cursor5.getColumnIndexOrThrow("_id")));
            default:
                return null;
        }
    }
}
