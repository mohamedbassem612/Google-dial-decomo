package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class aosf extends defpackage.aoue {
    public final defpackage.aosc a;

    public aosf(defpackage.aosc aoscVar) {
        this.a = aoscVar;
    }

    @Override // defpackage.aoue
    public final void a(java.lang.Throwable th) throws defpackage.aotd {
        defpackage.aosc aoscVar = this.a;
        java.lang.Throwable thP = aoscVar.p(e());
        if (aoscVar.D()) {
            defpackage.aoln aolnVar = aoscVar.a;
            if (aolnVar == null) {
                defpackage.aooh.h("null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            }
            defpackage.aorq aorqVar = ((defpackage.apbn) aolnVar).f;
            while (true) {
                java.lang.Object obj = aorqVar.a;
                defpackage.apcm apcmVar = defpackage.apbo.b;
                if (defpackage.aooh.n(obj, apcmVar)) {
                    if (aorqVar.d(apcmVar, thP)) {
                        return;
                    }
                } else if (obj instanceof java.lang.Throwable) {
                    return;
                } else {
                    if (aorqVar.d(obj, null)) {
                    }
                }
            }
        }
        aoscVar.g(thP);
        aoscVar.y();
    }

    @Override // defpackage.aoue
    public final boolean b() {
        return true;
    }
}
