package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aotg implements java.util.concurrent.Executor {
    public final defpackage.aosp a;

    public aotg(defpackage.aosp aospVar) {
        this.a = aospVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) throws defpackage.aotd {
        defpackage.aosp aospVar = this.a;
        defpackage.aols aolsVar = defpackage.aols.a;
        if (defpackage.apbo.c(aospVar, aolsVar)) {
            defpackage.apbo.b(aospVar, aolsVar, runnable);
        } else {
            runnable.run();
        }
    }

    public final java.lang.String toString() {
        return this.a.toString();
    }
}
