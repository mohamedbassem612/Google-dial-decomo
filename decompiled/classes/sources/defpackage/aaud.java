package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aaud implements defpackage.aaun {
    public final java.lang.Object a = new java.lang.Object();
    public final defpackage.aaue b;

    public aaud(defpackage.aaue aaueVar) {
        this.b = aaueVar;
    }

    @Override // defpackage.aaun
    public final void c(defpackage.aaum aaumVar) {
        if (((defpackage.aauq) aaumVar).c) {
            synchronized (this.a) {
            }
            new yne(this, 11).run();
        }
    }
}
