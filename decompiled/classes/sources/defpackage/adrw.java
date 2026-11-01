package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adrw {
    public static final defpackage.aimz a = defpackage.aimz.i("com/google/android/libraries/micore/telephony/common/speechrecognition/terse/TerseModelManagerImpl");
    public final android.content.Context b;
    public final defpackage.adqv c;
    public final defpackage.ajcu d;
    public final java.lang.String e;
    public final int f;
    private final java.lang.String g;

    public adrw(android.content.Context context, defpackage.adqv adqvVar, defpackage.ajcu ajcuVar, java.lang.String str, int i, java.lang.String str2) {
        if (defpackage.ahvr.cp(str)) {
            throw new java.lang.IllegalArgumentException("Must provide superpack name to TerseModelManagerImpl constructor.");
        }
        ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/google/android/libraries/micore/telephony/common/speechrecognition/terse/TerseModelManagerImpl", "<init>", 56, "TerseModelManagerImpl.java")).v("TerseModelManagerImpl initialized.");
        this.b = context;
        this.c = adqvVar;
        this.d = ajcuVar;
        this.e = str;
        this.f = i;
        this.g = str2;
    }

    public final java.lang.String a() {
        java.lang.String strC = this.c.c();
        if (!defpackage.ahvr.cp(strC)) {
            return new java.io.File(strC, this.g).toString();
        }
        ((defpackage.aimw) ((defpackage.aimw) a.c()).l("com/google/android/libraries/micore/telephony/common/speechrecognition/terse/TerseModelManagerImpl", "getTerseModelPath", 172, "TerseModelManagerImpl.java")).v("getTerseModelPath(): Can't determine base dir for downloaded Terse model pack.");
        return "";
    }
}
