package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class loy implements ajcb {
    public defpackage.lot a;
    public defpackage.los b;

    public loy(defpackage.lot lotVar, defpackage.los losVar) {
        this.a = lotVar;
        this.b = losVar;
    }

    public final void a(java.lang.Throwable th) {
        defpackage.los losVar = this.b;
        if (losVar != null) {
            losVar.a(th);
        }
    }

    public final void b(java.lang.Object obj) {
        defpackage.lot lotVar = this.a;
        if (lotVar == null) {
            defpackage.lpa.a.b().l("com/android/dialer/common/concurrent/SupportUiListener$CallbackWrapper", "onSuccess", 128, "SupportUiListener.java").v("task succeeded but UI is dead");
        } else {
            lotVar.a(obj);
        }
    }
}
