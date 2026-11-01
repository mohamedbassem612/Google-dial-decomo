package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajbl extends defpackage.ajaq {
    public defpackage.ajbk c;

    public ajbl(defpackage.aifo aifoVar, boolean z, java.util.concurrent.Executor executor, defpackage.ajas ajasVar) {
        super(aifoVar, z, false);
        this.c = new defpackage.ajbi(this, ajasVar, executor);
        u();
    }

    @Override // defpackage.ajaq
    public final void g() {
        defpackage.ajbk ajbkVar = this.c;
        if (ajbkVar != null) {
            ajbkVar.f();
        }
    }

    @Override // defpackage.ajac
    protected final void l() {
        defpackage.ajbk ajbkVar = this.c;
        if (ajbkVar != null) {
            ajbkVar.h();
        }
    }

    @Override // defpackage.ajaq
    public final void w(int i) {
        super.w(i);
        if (i == 1) {
            this.c = null;
        }
    }

    public ajbl(defpackage.aifo aifoVar, boolean z, java.util.concurrent.Executor executor, java.util.concurrent.Callable callable) {
        super(aifoVar, z, false);
        this.c = new defpackage.ajbj(this, callable, executor);
        u();
    }

    @Override // defpackage.ajaq
    public final void e(int i, java.lang.Object obj) {
    }
}
