package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apdx implements defpackage.aaug {
    final /* synthetic */ defpackage.aosb a;

    public apdx(defpackage.aosb aosbVar) {
        this.a = aosbVar;
    }

    @Override // defpackage.aaug
    public final void a(defpackage.aaum aaumVar) {
        java.lang.Exception excF = aaumVar.f();
        if (excF != null) {
            this.a.w(new defpackage.aoiv(excF));
            return;
        }
        boolean z = ((defpackage.aauq) aaumVar).c;
        defpackage.aosb aosbVar = this.a;
        if (z) {
            aosbVar.g(null);
        } else {
            aosbVar.w(aaumVar.g());
        }
    }
}
