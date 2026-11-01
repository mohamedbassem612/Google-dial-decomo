package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lgi {
    public static final aimz a = aimz.i("com/android/dialer/callscreen/impl/service/CallScreenState");
    public static final aihd b = aihd.t(defpackage.lgj.e, defpackage.lgj.f, defpackage.lgj.c, defpackage.lgj.d);
    public final java.util.concurrent.Executor c;
    public final java.lang.String d;
    public boolean i;
    public boolean j;
    public final zpz l;
    public final zpm m;
    public final zzx n;
    private final pgi o;
    public defpackage.lgj e = defpackage.lgj.a;
    public j$.util.Optional f = j$.util.Optional.empty();
    public j$.util.Optional g = j$.util.Optional.empty();
    public j$.util.Optional h = j$.util.Optional.empty();
    public j$.util.Optional k = j$.util.Optional.empty();

    public lgi(zpz zpzVar, ajct ajctVar, zzx zzxVar, zpm zpmVar, java.lang.String str, pgi pgiVar) {
        this.l = zpzVar;
        this.c = new ajdc(ajctVar);
        this.n = zzxVar;
        this.d = str;
        this.o = pgiVar;
        this.m = zpmVar;
    }

    public final ajcq a() {
        return ahvr.F(new defpackage.lgc(this, 2), this.c);
    }

    public final ajcq b() {
        return ahvr.F(new defpackage.lgc(this, 3), this.c);
    }

    public final ajcq c() {
        return ahvr.F(new defpackage.lgc(this, 4), this.c);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ajcq d(defpackage.lgj lgjVar) {
        defpackage.lgj lgjVar2 = defpackage.lgj.a;
        pgi pgiVar = this.o;
        return ahvr.H(lgjVar == lgjVar2 ? pgiVar.B(this.d) : ahvr.E(new defpackage.lge(pgiVar, this.d, 1), (java.util.concurrent.Executor) pgiVar.b), new defpackage.iau(this, lgjVar, 16), this.c);
    }

    public final void e(boolean z) {
        this.i = z;
        this.l.a(ajcm.a);
    }
}
