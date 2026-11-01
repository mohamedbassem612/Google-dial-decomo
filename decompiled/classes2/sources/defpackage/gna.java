package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class gna extends gnf {
    private final java.lang.Object a;
    private final java.lang.String b;
    private final java.lang.String c;
    private final gnh d;
    private final defpackage.gnj e;

    public gna(java.lang.Object obj, java.lang.String str, java.lang.String str2, gnh gnhVar) {
        aooh.f(obj, "value");
        aooh.f(str, "tag");
        aooh.f(gnhVar, "verificationMode");
        this.a = obj;
        this.b = str;
        this.c = str2;
        this.d = gnhVar;
        defpackage.gnj gnjVar = new defpackage.gnj(c(obj, str2));
        java.lang.StackTraceElement[] stackTrace = gnjVar.getStackTrace();
        aooh.e(stackTrace, "getStackTrace(...)");
        aooh.f(stackTrace, "<this>");
        int length = stackTrace.length;
        aooh.f(stackTrace, "<this>");
        int iT = aooc.t(length - 2, 0);
        if (iT < 0) {
            throw new java.lang.IllegalArgumentException(a.bs(iT, "Requested element count ", " is less than zero."));
        }
        gnjVar.setStackTrace((java.lang.StackTraceElement[]) (iT == 0 ? aokc.a : iT >= length ? ajsz.cU(stackTrace) : iT == 1 ? ajsz.aY(stackTrace[length - 1]) : ajsz.cw(ajsz.cA(stackTrace, length - iT, length))).toArray(new java.lang.StackTraceElement[0]));
        this.e = gnjVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    public final java.lang.Object b() throws defpackage.gnj, aois {
        int iOrdinal = this.d.ordinal();
        if (iOrdinal == 0) {
            throw this.e;
        }
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                throw new aois();
            }
            return null;
        }
        java.lang.String str = this.b;
        java.lang.String strC = c(this.a, this.c);
        aooh.f(str, "tag");
        android.util.Log.d(str, strC);
        return null;
    }

    public final gnf a(java.lang.String str, aonj aonjVar) {
        return this;
    }
}
