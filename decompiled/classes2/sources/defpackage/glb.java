package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class glb extends defpackage.gla {
    final /* synthetic */ aca a;
    final /* synthetic */ defpackage.glc b;

    public glb(defpackage.glc glcVar, aca acaVar) {
        this.a = acaVar;
        this.b = glcVar;
    }

    @Override // defpackage.gla, defpackage.gkw
    public final void a(gkz gkzVar) {
        ((java.util.ArrayList) this.a.get(this.b.b)).remove(gkzVar);
        gkzVar.I(this);
    }

    @Override // defpackage.gla, defpackage.gkw
    public final void b(gkz gkzVar) {
        ((java.util.ArrayList) this.a.get(this.b.b)).remove(gkzVar);
        gkzVar.I(this);
    }
}
