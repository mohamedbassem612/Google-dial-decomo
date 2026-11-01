package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class abbe extends java.lang.Exception {
    public final alez a;
    public final aley b;
    public final defpackage.akzc c;
    public final long d;
    public final abay e;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ abbe(alez alezVar, aley aleyVar, java.lang.String str, java.lang.Throwable th, defpackage.akzc akzcVar, long j, abay abayVar, int i) {
        aleyVar = (i & 2) != 0 ? aley.a : aleyVar;
        str = (i & 4) != 0 ? null : str;
        th = (i & 8) != 0 ? null : th;
        if ((i & 16) != 0) {
            akzcVar = defpackage.akzc.d;
            defpackage.aooh.e(akzcVar, "EMPTY");
        }
        j = (i & 32) != 0 ? 0L : j;
        abayVar = (i & 64) != 0 ? abay.a : abayVar;
        defpackage.aooh.f(alezVar, "status");
        defpackage.aooh.f(aleyVar, "errorMessage");
        defpackage.aooh.f(akzcVar, "protectionToken");
        defpackage.aooh.f(abayVar, "classificationBackend");
        super(str, th);
        this.a = alezVar;
        this.b = aleyVar;
        this.c = akzcVar;
        this.d = j;
        this.e = abayVar;
    }

    public final boolean a() {
        java.lang.Throwable cause = getCause();
        if (cause == null) {
            return false;
        }
        if (defpackage.anqw.d(cause).o != defpackage.anqt.UNAVAILABLE) {
            int i = ahzn.a;
            java.util.ArrayList arrayList = new java.util.ArrayList(4);
            arrayList.add(cause);
            java.lang.Throwable cause2 = cause;
            boolean z = false;
            while (true) {
                cause = cause.getCause();
                if (cause == null) {
                    java.util.List<java.lang.Throwable> listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(arrayList);
                    defpackage.aooh.e(listUnmodifiableList, "getCausalChain(...)");
                    if ((listUnmodifiableList instanceof java.util.Collection) && listUnmodifiableList.isEmpty()) {
                        return false;
                    }
                    for (java.lang.Throwable th : listUnmodifiableList) {
                        if ((th instanceof java.io.IOException) || (th instanceof java.security.cert.CertificateException) || (th instanceof java.security.cert.CertPathValidatorException)) {
                            break;
                        }
                    }
                    return false;
                }
                arrayList.add(cause);
                if (cause == cause2) {
                    throw new java.lang.IllegalArgumentException("Loop in causal chain detected.", cause);
                }
                if (z) {
                    cause2 = cause2.getCause();
                }
                z = !z;
            }
        }
        return true;
    }
}
