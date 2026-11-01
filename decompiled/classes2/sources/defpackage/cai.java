package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class cai extends defpackage.ciw {
    public aosb a;
    public aonj b;

    public cai(aonj aonjVar, aosb aosbVar) {
        this.a = aosbVar;
        this.b = aonjVar;
    }

    @Override // defpackage.ciw
    public final void a() {
        this.b = null;
        this.a = null;
    }

    @Override // defpackage.ciw
    public final void b(java.lang.Throwable th) {
        aosb aosbVar = this.a;
        if (aosbVar != null) {
            aosbVar.w(new aoiv(th));
        }
    }
}
