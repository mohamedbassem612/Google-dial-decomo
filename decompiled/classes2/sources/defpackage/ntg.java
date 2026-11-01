package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ntg implements agtk {
    final /* synthetic */ defpackage.nth a;

    public ntg(defpackage.nth nthVar) {
        this.a = nthVar;
    }

    public final /* synthetic */ void a(java.lang.Object obj, java.lang.Throwable th) {
        defpackage.nth.a.d().k(th).l("com/android/dialer/dobby/impl/ui/DobbyDoNotScreenDialogFragmentPeer$onPositiveButtonClickEvent$<anonymous>", "onFailure", 66, "DobbyDoNotScreenDialogFragmentPeer.kt").v("failed to mark call as do-not-screen");
        defpackage.nth nthVar = this.a;
        defpackage.ntf ntfVar = nthVar.c;
        ntfVar.f();
        az azVarG = ntfVar.G();
        if (azVarG != null) {
            agby agbyVarO = agby.o(azVarG.findViewById(nthVar.b.d), 2132018410, 0);
            agbyVarO.r(2);
            agbyVarO.h();
        }
    }

    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj, java.lang.Object obj2) {
        defpackage.nth.a.b().l("com/android/dialer/dobby/impl/ui/DobbyDoNotScreenDialogFragmentPeer$onPositiveButtonClickEvent$<anonymous>", "onSuccess", 46, "DobbyDoNotScreenDialogFragmentPeer.kt").v("successfully marked call as do-not-screen");
        defpackage.nth nthVar = this.a;
        defpackage.ntf ntfVar = nthVar.c;
        ntfVar.f();
        android.content.Context contextA = ntfVar.A();
        az azVarG = ntfVar.G();
        if (azVarG != null) {
            defpackage.nte nteVar = nthVar.b;
            agby agbyVarQ = agby.q(azVarG.findViewById(nteVar.d), contextA.getString(2132018414, nteVar.c), 0);
            agbyVarQ.r(2);
            agbyVarQ.h();
        }
    }

    public final /* synthetic */ void b(java.lang.Object obj) {
    }
}
