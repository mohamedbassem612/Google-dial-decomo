package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lnj implements zoi {
    public static final aimz a = aimz.i("com/android/dialer/callscreeningservice/result/CallScreeningResultCallScopeRemovedListener");
    public final long b;
    public final defpackage.oq c;
    private final aoss d;

    public lnj(defpackage.oq oqVar, long j, aoss aossVar) {
        aooh.f(oqVar, "callScreeningResultsCache");
        aooh.f(aossVar, "lightweightScope");
        this.c = oqVar;
        this.b = j;
        this.d = aossVar;
    }

    public final void eh() {
        aimz aimzVar = zih.a;
        aoov.al(this.d, zih.b.plus(aols.a), 1, new bpj((aoln) null, this, 16));
    }
}
