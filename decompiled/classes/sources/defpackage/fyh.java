package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class fyh implements android.window.OnBackAnimationCallback {
    final /* synthetic */ defpackage.fyi a;

    public fyh(defpackage.fyi fyiVar) {
        this.a = fyiVar;
    }

    @Override // android.window.OnBackAnimationCallback
    public final void onBackCancelled() {
        defpackage.fyi fyiVar = this.a;
        defpackage.fxy fxyVar = fyiVar.c;
        if (fxyVar != null) {
            if (!fyiVar.d) {
                fxyVar.f(fyiVar, null);
            }
            fxyVar.c();
            if (fxyVar.b) {
                defpackage.fye fyeVar = (defpackage.fye) fxyVar.d;
                if (defpackage.aooh.n(fyiVar, fyeVar.e) && fyeVar.d == -1) {
                    defpackage.fya fyaVarA = fyeVar.c;
                    if (fyaVarA == null) {
                        fyaVarA = fyeVar.a(-1);
                    }
                    fyeVar.c = null;
                    fyeVar.d = 0;
                    fyeVar.e = null;
                    if (fyaVarA != null) {
                        fyaVarA.a();
                    }
                    fyeVar.f.e(defpackage.fyf.a);
                }
            }
            fyiVar.d = false;
        }
    }

    @Override // android.window.OnBackInvokedCallback
    public final void onBackInvoked() {
        this.a.b();
    }

    @Override // android.window.OnBackAnimationCallback
    public final void onBackProgressed(android.window.BackEvent backEvent) {
        defpackage.aooh.f(backEvent, "backEvent");
        fxx fxxVarZ = hgu.Z(backEvent);
        defpackage.fyi fyiVar = this.a;
        defpackage.fxy fxyVar = fyiVar.c;
        if (fxyVar == null || !fyiVar.d) {
            return;
        }
        fxyVar.c();
        if (fxyVar.b) {
            defpackage.fye fyeVar = (defpackage.fye) fxyVar.d;
            if (defpackage.aooh.n(fyiVar, fyeVar.e) && fyeVar.d == -1) {
                defpackage.fya fyaVarA = fyeVar.c;
                if (fyaVarA == null) {
                    fyaVarA = fyeVar.a(-1);
                }
                if (fyaVarA != null) {
                    fyaVarA.c(fxxVarZ);
                }
                fyeVar.f.e(new fyg(fxxVarZ));
            }
        }
    }

    @Override // android.window.OnBackAnimationCallback
    public final void onBackStarted(android.window.BackEvent backEvent) {
        defpackage.aooh.f(backEvent, "backEvent");
        defpackage.fyi fyiVar = this.a;
        fxx fxxVarZ = hgu.Z(backEvent);
        defpackage.fxy fxyVar = fyiVar.c;
        if (fxyVar == null || fyiVar.d) {
            return;
        }
        fxyVar.f(fyiVar, fxxVarZ);
        fyiVar.d = true;
    }
}
