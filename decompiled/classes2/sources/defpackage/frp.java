package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public abstract class frp extends defpackage.ewv implements defpackage.frj {
    private defpackage.frj e;
    private long f;

    @Override // defpackage.frj
    public final int a() {
        defpackage.frj frjVar = this.e;
        ahvr.ci(frjVar);
        return frjVar.a();
    }

    @Override // defpackage.frj
    public final int b(long j) {
        defpackage.frj frjVar = this.e;
        ahvr.ci(frjVar);
        return frjVar.b(j - this.f);
    }

    @Override // defpackage.frj
    public final long c(int i) {
        defpackage.frj frjVar = this.e;
        ahvr.ci(frjVar);
        return frjVar.c(i) + this.f;
    }

    @Override // defpackage.ewv, defpackage.ewp
    public final void dJ() {
        super.dJ();
        this.e = null;
    }

    @Override // defpackage.frj
    public final java.util.List e(long j) {
        defpackage.frj frjVar = this.e;
        ahvr.ci(frjVar);
        return frjVar.e(j - this.f);
    }

    public final void f(long j, defpackage.frj frjVar, long j2) {
        this.b = j;
        this.e = frjVar;
        if (j2 != Long.MAX_VALUE) {
            j = j2;
        }
        this.f = j;
    }
}
