package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class aouy extends defpackage.aoue {
    private final defpackage.aosc a;

    public aouy(defpackage.aosc aoscVar) {
        this.a = aoscVar;
    }

    @Override // defpackage.aoue
    public final void a(java.lang.Throwable th) {
        java.lang.Object objE = e().E();
        boolean z = defpackage.aosu.a;
        boolean z2 = objE instanceof defpackage.aosk;
        defpackage.aosc aoscVar = this.a;
        if (!z2) {
            aoscVar.w(defpackage.aoum.b(objE));
            return;
        }
        java.lang.Throwable th2 = ((defpackage.aosk) objE).b;
        if (th2 == null) {
            defpackage.aooh.i("exception");
        }
        aoscVar.w(new defpackage.aoiv(th2));
    }

    @Override // defpackage.aoue
    public final boolean b() {
        return false;
    }
}
