package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bwj {
    public final boolean a;
    public final akc b;
    public aosb c;
    private final nf d;

    public bwj(boolean z, boolean z2, nf nfVar) {
        this.a = z2;
        this.d = nfVar;
        this.b = new akc(java.lang.Boolean.valueOf(z));
    }

    public final java.lang.Object a(defpackage.aoc aocVar, aoln aolnVar) {
        java.lang.Object objO = this.d.O(aocVar, new defpackage.ako(this, aocVar, new defpackage.blq(this, (aoln) null, 2), (aoln) null, 3), aolnVar);
        return objO != aolu.a ? aojh.a : objO;
    }

    public final void b() {
        aosb aosbVar;
        this.b.f(java.lang.Boolean.FALSE);
        if (!this.a || (aosbVar = this.c) == null) {
            return;
        }
        aosbVar.g((java.lang.Throwable) null);
    }

    public final boolean c() {
        akc akcVar = this.b;
        return ((java.lang.Boolean) akcVar.a()).booleanValue() || ((java.lang.Boolean) akcVar.b()).booleanValue();
    }
}
