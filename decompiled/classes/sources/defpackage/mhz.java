package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class mhz {
    public static final defpackage.aify a;
    private static final defpackage.aimz b = defpackage.aimz.i("com/android/dialer/defaultdialer/impl/DefaultDialerPermissions");
    private static final defpackage.aify c;
    private final android.content.Context d;
    private final int e = 3;

    static {
        defpackage.aify aifyVarS = defpackage.aify.s("android.permission.READ_CALL_LOG", "android.permission.WRITE_CALL_LOG", "android.permission.READ_PHONE_STATE", "com.android.voicemail.permission.ADD_VOICEMAIL");
        a = aifyVarS;
        defpackage.aift aiftVar = new defpackage.aift(4);
        aiftVar.k(aifyVarS);
        aiftVar.i("android.permission.READ_PHONE_NUMBERS");
        c = aiftVar.g();
    }

    public mhz(android.content.Context context, int i) {
        this.d = context;
    }

    public final defpackage.aify a() {
        return a;
    }

    public final boolean b() {
        defpackage.aify aifyVarA = a();
        int i = ((defpackage.aike) aifyVarA).d;
        int i2 = 0;
        while (i2 < i) {
            java.lang.String str = (java.lang.String) aifyVarA.get(i2);
            i2++;
            if (defpackage.dvx.c(this.d, str) == -1) {
                ((defpackage.aimw) ((defpackage.aimw) b.b()).l("com/android/dialer/defaultdialer/impl/DefaultDialerPermissions", "hasRequiredPermissions", 50, "DefaultDialerPermissions.java")).y("missing permission: %s", str);
                return false;
            }
        }
        return true;
    }
}
