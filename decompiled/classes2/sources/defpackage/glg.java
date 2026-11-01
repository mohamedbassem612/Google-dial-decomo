package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class glg extends defpackage.gla {
    final glh a;

    public glg(glh glhVar) {
        this.a = glhVar;
    }

    @Override // defpackage.gla, defpackage.gkw
    public final void b(gkz gkzVar) {
        glh glhVar = this.a;
        int i = glhVar.x - 1;
        glhVar.x = i;
        if (i == 0) {
            glhVar.y = false;
            glhVar.r();
        }
        gkzVar.I(this);
    }

    @Override // defpackage.gla, defpackage.gkw
    public final void f() {
        glh glhVar = this.a;
        if (glhVar.y) {
            return;
        }
        glhVar.z();
        glhVar.y = true;
    }
}
