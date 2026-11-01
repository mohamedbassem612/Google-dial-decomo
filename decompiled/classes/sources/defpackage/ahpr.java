package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class ahpr implements defpackage.dyy {
    public final /* synthetic */ defpackage.ahpz a;
    public final /* synthetic */ int b;
    public final /* synthetic */ java.lang.String c;
    public final /* synthetic */ defpackage.dyy d;

    public /* synthetic */ ahpr(defpackage.ahpz ahpzVar, int i, java.lang.String str, defpackage.dyy dyyVar) {
        this.a = ahpzVar;
        this.b = i;
        this.c = str;
        this.d = dyyVar;
    }

    @Override // defpackage.dyy
    public final defpackage.eax dC(android.view.View view, defpackage.eax eaxVar) throws java.io.IOException {
        defpackage.dyy dyyVar = this.d;
        if (view == null) {
            defpackage.aooh.i("view");
        }
        java.lang.String str = this.c;
        defpackage.ahok ahokVarF = this.a.f(this.b, str);
        try {
            defpackage.eax eaxVarDC = dyyVar.dC(view, eaxVar);
            ahokVarF.close();
            return eaxVarDC;
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                try {
                    ahokVarF.close();
                } catch (java.lang.Throwable th3) {
                    aoil.b(th, th3);
                }
                throw th2;
            }
        }
    }
}
