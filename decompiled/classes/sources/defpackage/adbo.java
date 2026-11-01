package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adbo implements defpackage.adbf {
    public static final /* synthetic */ int d = 0;
    private static final java.util.TimeZone e = j$.util.DesugarTimeZone.getTimeZone("UTC");
    public final java.util.concurrent.Executor a;
    public final java.util.Random b;
    public final defpackage.afhf c;

    public adbo(defpackage.afhf afhfVar, java.util.concurrent.Executor executor, java.util.Random random) {
        this.c = afhfVar;
        this.a = executor;
        this.b = random;
    }

    public static long f(long j) {
        java.util.GregorianCalendar gregorianCalendar = new java.util.GregorianCalendar(e);
        gregorianCalendar.setTimeInMillis(j);
        gregorianCalendar.set(11, 0);
        gregorianCalendar.set(12, 0);
        gregorianCalendar.set(13, 0);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }

    @Override // defpackage.adbf
    public final defpackage.ajcq a() {
        java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference(defpackage.aike.a);
        defpackage.ahyc aczoVar = new aczo(atomicReference, 13);
        defpackage.afhf afhfVar = this.c;
        java.util.concurrent.Executor executor = this.a;
        return defpackage.ahvr.H(afhfVar.a(aczoVar, executor), defpackage.ahqx.a(new aczo(atomicReference, 7)), executor);
    }

    @Override // defpackage.adbf
    public final defpackage.ajcq b() {
        java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference(defpackage.ahwt.a);
        defpackage.ahyc aczoVar = new aczo(atomicReference, 11);
        defpackage.afhf afhfVar = this.c;
        defpackage.ajbm ajbmVar = defpackage.ajbm.INSTANCE;
        return defpackage.ahvr.H(afhfVar.a(aczoVar, ajbmVar), new aczo(atomicReference, 12), ajbmVar);
    }

    @Override // defpackage.adbf
    public final defpackage.ajcq c(java.lang.String str) {
        java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference(defpackage.ahwt.a);
        defpackage.wym wymVar = new defpackage.wym(str, atomicReference, 16, null);
        defpackage.afhf afhfVar = this.c;
        defpackage.ajbm ajbmVar = defpackage.ajbm.INSTANCE;
        return defpackage.ahvr.H(afhfVar.a(wymVar, ajbmVar), new aczo(atomicReference, 9), ajbmVar);
    }

    @Override // defpackage.adbf
    public final defpackage.ajcq d() {
        return defpackage.ahvr.I(this.c.c(), new aczi(this, 16), this.a);
    }

    @Override // defpackage.adbf
    public final defpackage.ajcq e(acvy acvyVar) {
        return this.c.a(new aczo(acvyVar, 8), this.a);
    }
}
