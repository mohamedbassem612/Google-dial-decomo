package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qvq {
    public static final aimz a = aimz.i("com/android/dialer/incall/voice/buttons/MergeButtonController");
    public final aoss b;
    public final defpackage.qtx c;
    public final java.util.concurrent.atomic.AtomicBoolean d;
    public final zpm e;
    public final zpz f;
    public final defpackage.pqm g;
    public final defpackage.qbe h;
    public final defpackage.qen i;

    public qvq(aoss aossVar, zpm zpmVar, zpz zpzVar, defpackage.qen qenVar, defpackage.pqm pqmVar, defpackage.qbe qbeVar) {
        aooh.f(aossVar, "lightweightScope");
        aooh.f(zpmVar, "callScopes");
        aooh.f(zpzVar, "inCallUpdatePropagator");
        aooh.f(pqmVar, "callController");
        aooh.f(qbeVar, "inCallLogging");
        this.b = aossVar;
        this.e = zpmVar;
        this.f = zpzVar;
        this.i = qenVar;
        this.g = pqmVar;
        this.h = qbeVar;
        this.c = new nyy(this, 9);
        this.d = new java.util.concurrent.atomic.AtomicBoolean();
    }

    public final void a(boolean z) {
        this.d.set(z);
        this.f.a(ajcm.a);
    }
}
