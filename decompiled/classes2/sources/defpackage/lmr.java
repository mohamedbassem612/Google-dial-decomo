package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lmr implements zoi {
    public static final aimz a = aimz.i("com/android/dialer/callscreeningservice/activecall/HasAnotherActiveCallCallScopeRemovedListener");
    public final long b;
    public final kaw c;
    private final aoss d;

    public lmr(kaw kawVar, long j, aoss aossVar) {
        aooh.f(kawVar, "hasAnotherActiveCallCache");
        aooh.f(aossVar, "lightweightScope");
        this.c = kawVar;
        this.b = j;
        this.d = aossVar;
    }

    public final void eh() {
        aimz aimzVar = zih.a;
        aoov.al(this.d, zih.b.plus(aols.a), 1, new bpj((aoln) null, this, 15));
    }
}
