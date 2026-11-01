package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abre implements java.lang.Runnable {
    public final java.lang.Runnable a;
    public final /* synthetic */ defpackage.abrf b;

    public abre(defpackage.abrf abrfVar, java.lang.Runnable runnable) {
        j$.util.Objects.requireNonNull(abrfVar);
        this.b = abrfVar;
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        defpackage.aawj aawjVar = new defpackage.aawj(this, java.lang.Thread.currentThread(), 4);
        defpackage.abrf abrfVar = this.b;
        abrn abrnVar = abrfVar.c;
        abrnVar.f();
        ajcs ajcsVarB = abrfVar.e.b(aawjVar, 1L, abrnVar.g());
        try {
            this.a.run();
        } finally {
            ajcsVarB.cancel(false);
        }
    }

    public final java.lang.String toString() {
        return this.a.toString();
    }
}
