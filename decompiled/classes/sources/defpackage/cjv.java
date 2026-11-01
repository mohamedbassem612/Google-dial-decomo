package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cjv implements defpackage.cbm {
    final /* synthetic */ defpackage.cjw a;
    final /* synthetic */ java.lang.Object b;
    final /* synthetic */ defpackage.cka c;

    public cjv(defpackage.cjw cjwVar, java.lang.Object obj, defpackage.cka ckaVar) {
        this.a = cjwVar;
        this.b = obj;
        this.c = ckaVar;
    }

    @Override // defpackage.cbm
    public final void a() {
        defpackage.cjw cjwVar = this.a;
        defpackage.adw adwVar = cjwVar.d;
        java.lang.Object obj = this.b;
        java.lang.Object objI = adwVar.i(obj);
        defpackage.cka ckaVar = this.c;
        if (objI == ckaVar) {
            cjwVar.b.put(obj, ckaVar.b());
        }
    }
}
