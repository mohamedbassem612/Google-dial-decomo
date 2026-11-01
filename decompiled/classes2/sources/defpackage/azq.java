package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class azq extends defpackage.ayd implements dbd {
    public aonj a;
    public defpackage.baa d;

    public azq(aonj aonjVar) {
        super(bab.a);
        this.a = aonjVar;
    }

    @Override // defpackage.axz
    public final void dc() {
        android.view.View viewF = wl.f(this);
        java.util.WeakHashMap weakHashMap = defpackage.baa.a;
        defpackage.baa baaVarE = un.e(viewF);
        baaVarE.b(viewF);
        g((azz) this.a.a(baaVarE));
        this.d = baaVarE;
        super.dc();
    }

    @Override // defpackage.axz
    public final void u() {
        android.view.View viewF = wl.f(this);
        defpackage.baa baaVar = this.d;
        if (baaVar != null) {
            baaVar.a(viewF);
        }
        super.u();
    }
}
