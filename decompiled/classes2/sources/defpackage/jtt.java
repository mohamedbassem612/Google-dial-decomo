package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jtt {
    public static final aimz a = aimz.i("com/android/dialer/calleridfeedback/impl/logging/LoggingLimiter");
    public final ajct b;
    public final defpackage.jiv c;

    public jtt(defpackage.jiv jivVar, ajct ajctVar) {
        this.c = jivVar;
        this.b = ajctVar;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ajcq a(int i, defpackage.jrz jrzVar, java.lang.Runnable runnable) {
        defpackage.hkd hkdVar = jrzVar.c;
        if (hkdVar == null) {
            hkdVar = defpackage.hkd.a;
        }
        defpackage.jiv jivVar = this.c;
        java.lang.String str = hkdVar.c;
        alcf alcfVarB = jivVar.b();
        ajcq ajcqVarBk = ((aogc) jivVar.d).bk();
        defpackage.jss jssVar = new defpackage.jss(str, 2);
        ?? r0 = jivVar.e;
        ajcq ajcqVarH = ahvr.H(ajcqVarBk, jssVar, (java.util.concurrent.Executor) r0);
        ajcq ajcqVarH2 = ahvr.H(ajcqVarBk, new defpackage.iau(jivVar, alcfVarB, 8), (java.util.concurrent.Executor) r0);
        ajcq ajcqVarO = ahvr.ak(new ajcq[]{ajcqVarH, ajcqVarH2}).o(new defpackage.gzk(ajcqVarH, ajcqVarH2, 5), (java.util.concurrent.Executor) r0);
        defpackage.idd iddVar = new defpackage.idd(this, runnable, 7);
        ajct ajctVar = this.b;
        ajcq ajcqVarI = ahvr.I(ajcqVarO, iddVar, ajctVar);
        ajcq ajcqVarI2 = ahvr.I(ajcqVarO, new defpackage.lgl(this, jrzVar, i, 1), ajctVar);
        return ahvr.ak(new ajcq[]{ajcqVarI, ajcqVarI2}).o(new defpackage.gzk(ajcqVarI, ajcqVarI2, 4), ajctVar);
    }
}
