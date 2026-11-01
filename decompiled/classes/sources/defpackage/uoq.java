package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class uoq implements defpackage.aomy {
    private final /* synthetic */ int $cid;

    public /* synthetic */ uoq(int i) {
        this.$cid = i;
    }

    @Override // defpackage.aomy
    public final java.lang.Object a() {
        defpackage.dks dksVar;
        int i = this.$cid;
        java.lang.Float fValueOf = java.lang.Float.valueOf(1.0f);
        switch (i) {
            case 0:
                return defpackage.aojh.a;
            case 1:
                defpackage.cbd cbdVar = tgb.a;
                throw new java.lang.IllegalStateException("LocalSearchListState not provided! You must provide a LocalSearchListState through a CompositionLocalProvider");
            case 2:
                return defpackage.aojh.a;
            case 3:
                return new androidx.compose.runtime.ParcelableSnapshotMutableState(null, defpackage.cdu.c);
            case 4:
                int i2 = urt.a;
                return defpackage.aimz.i("com/android/dialer/theme/systembars/WindowExtensionsKt");
            case 5:
                int i3 = yko.a;
                return new android.os.Handler(android.os.Looper.getMainLooper());
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return defpackage.aojh.a;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                int i4 = abew.a;
                dksVar = new defpackage.dks(0L, 0L, (defpackage.dnd) null, (defpackage.dmw) null, (defpackage.dmx) null, (defpackage.dmq) null, (java.lang.String) null, 0L, (defpackage.dok) null, (defpackage.doz) null, (defpackage.dnx) null, 0L, defpackage.dou.b, (defpackage.crc) null, 61439);
                break;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                int i5 = abew.a;
                dksVar = new defpackage.dks(0L, 0L, defpackage.dnd.g, (defpackage.dmw) null, (defpackage.dmx) null, (defpackage.dmq) null, (java.lang.String) null, 0L, (defpackage.dok) null, (defpackage.doz) null, (defpackage.dnx) null, 0L, (defpackage.dou) null, (defpackage.crc) null, 65531);
                break;
            case 9:
                int i6 = abew.a;
                return new defpackage.dks(0L, 0L, (defpackage.dnd) null, new defpackage.dmw(1), (defpackage.dmx) null, (defpackage.dmq) null, (java.lang.String) null, 0L, (defpackage.dok) null, (defpackage.doz) null, (defpackage.dnx) null, 0L, (defpackage.dou) null, (defpackage.crc) null, 65527);
            case 10:
                int i7 = abew.a;
                dksVar = new defpackage.dks(0L, 0L, (defpackage.dnd) null, (defpackage.dmw) null, (defpackage.dmx) null, (defpackage.dmq) null, (java.lang.String) null, 0L, (defpackage.dok) null, (defpackage.doz) null, (defpackage.dnx) null, 0L, defpackage.dou.c, (defpackage.crc) null, 61439);
                break;
            case 11:
                int i8 = abew.a;
                return new defpackage.dkd(0, new defpackage.dpa(defpackage.dpy.g(20), 1), 503);
            case 12:
            case 13:
                return fValueOf;
            case 14:
                return defpackage.aojh.a;
            case 15:
                return java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
            case 16:
                throw null;
            case 17:
                return java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
            case 18:
                return java.lang.Boolean.FALSE;
            case 19:
                return java.lang.Boolean.FALSE;
            default:
                return java.lang.Boolean.FALSE;
        }
        return dksVar;
    }
}
