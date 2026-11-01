package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class glf extends defpackage.gla {
    final /* synthetic */ glh a;

    public glf(glh glhVar) {
        this.a = glhVar;
    }

    @Override // defpackage.gla, defpackage.gkw
    public final void a(gkz gkzVar) {
        glh glhVar = this.a;
        glhVar.w.remove(gkzVar);
        if (glhVar.A()) {
            return;
        }
        glhVar.s(glhVar, defpackage.gky.c, false);
        glhVar.l = true;
        glhVar.s(glhVar, defpackage.gky.b, false);
    }
}
