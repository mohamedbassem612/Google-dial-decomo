package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class exj implements defpackage.eyp {
    public final defpackage.exi b;
    public defpackage.ezf c;
    public defpackage.eyp d;
    public boolean f;
    public final defpackage.ezl a = new defpackage.ezl();
    public boolean e = true;

    public exj(defpackage.exi exiVar) {
        this.b = exiVar;
    }

    @Override // defpackage.eyp
    public final long a() {
        throw null;
    }

    @Override // defpackage.eyp
    public final defpackage.erc b() {
        defpackage.eyp eypVar = this.d;
        return eypVar != null ? eypVar.b() : this.a.a;
    }

    public final void c(defpackage.ezf ezfVar) {
        defpackage.eyp eypVar;
        defpackage.eyp eypVarI = ezfVar.i();
        if (eypVarI == null || eypVarI == (eypVar = this.d)) {
            return;
        }
        if (eypVar != null) {
            throw new defpackage.exl(2, new java.lang.IllegalStateException("Multiple renderer media clocks enabled."), 1000, null, -1, null, 4, null, false);
        }
        this.d = eypVarI;
        this.c = ezfVar;
        eypVarI.d(this.a.a);
    }

    @Override // defpackage.eyp
    public final void d(defpackage.erc ercVar) {
        throw null;
    }

    public final void e() {
        this.f = true;
        this.a.e();
    }

    public final void f() {
        this.f = false;
        this.a.f();
    }
}
