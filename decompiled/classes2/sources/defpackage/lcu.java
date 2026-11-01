package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lcu implements utx {
    public static final aimz a = aimz.i("com/android/dialer/callscreen/impl/feedbackintegration/CallScreenFeedbackIntegration");
    public final lkk b;
    private final ajct c;
    private final defpackage.lcv d;
    private final defpackage.lcs e;
    private final defpackage.lcw f;
    private final pgi g;

    public lcu(lkk lkkVar, ajct ajctVar, defpackage.lcv lcvVar, defpackage.lcs lcsVar, defpackage.lcw lcwVar, pgi pgiVar) {
        this.b = lkkVar;
        this.c = ajctVar;
        this.d = lcvVar;
        this.e = lcsVar;
        this.f = lcwVar;
        this.g = pgiVar;
    }

    public final ajcq a(long j) {
        return this.b.a(aify.p(java.lang.Long.toString(j)), j$.time.Instant.now().toEpochMilli());
    }

    public final ajcq b(long j) {
        ajcq ajcqVarC = this.b.c(java.lang.Long.toString(j));
        defpackage.lbs lbsVar = new defpackage.lbs(15);
        ajct ajctVar = this.c;
        return ahvr.I(ahvr.H(ajcqVarC, lbsVar, ajctVar), new defpackage.jwi(this, j, 5), ajctVar);
    }

    public final ajcq c(utu utuVar) {
        return ahvr.H(this.b.c(java.lang.Long.toString(utuVar.c)), new defpackage.kxn(utuVar, 10), this.c);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ajcq d(long j, java.lang.String str) {
        java.lang.String string = java.lang.Long.toString(j);
        pgi pgiVar = this.g;
        return ahvr.H(((lkk) pgiVar.b).c(string), new defpackage.kxn(str, 9), (java.util.concurrent.Executor) pgiVar.a);
    }

    public final ajcq e(long j) {
        return ahvr.H(this.b.c(java.lang.Long.toString(j)), new defpackage.lbs(14), this.c);
    }

    public final ajcq f(utu utuVar) {
        return ahvr.H(this.b.c(java.lang.Long.toString(utuVar.c)), new defpackage.kxn(utuVar, 11), this.c);
    }

    public final /* synthetic */ ajcq g(long j) {
        return wsc.bl();
    }

    public final /* synthetic */ ajcq h(long j) {
        return wsc.bm();
    }

    public final /* synthetic */ j$.util.Optional i(long j) {
        return j$.util.Optional.empty();
    }

    public final j$.util.Optional j(uuh uuhVar) {
        int iOrdinal = uuhVar.ordinal();
        if (iOrdinal == 7) {
            return j$.util.Optional.of(this.f);
        }
        if (iOrdinal != 8) {
            return iOrdinal != 9 ? j$.util.Optional.empty() : j$.util.Optional.of(this.d);
        }
        return j$.util.Optional.of(this.e);
    }

    public final /* synthetic */ ajcq k() {
        return wsc.bk();
    }

    public final ajcq l(long j, int i) {
        return this.b.e(java.lang.Long.toString(j), new tbn(i, 1), j$.time.Instant.now().toEpochMilli());
    }
}
