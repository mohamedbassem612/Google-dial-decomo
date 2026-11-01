package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jjh implements agtk {
    final /* synthetic */ defpackage.jjo a;

    public jjh(defpackage.jjo jjoVar) {
        this.a = jjoVar;
    }

    public final /* synthetic */ void a(java.lang.Object obj, java.lang.Throwable th) throws java.lang.Throwable {
        defpackage.jjo jjoVar = this.a;
        jjoVar.u.i((java.lang.String) null).a(mcd.ak);
        int iB = defpackage.hhk.b(th);
        if (iB == 0) {
            jjoVar.c.n(rmw.n);
            android.widget.Toast.makeText(jjoVar.b.z(), 2132017575, 1).show();
        } else {
            if (iB != 1) {
                throw th;
            }
            defpackage.jjo.a.b().l("com/android/dialer/blockreportspam/BlockOptionallyReportDialogFragmentPeer$blockNumberCallback$<anonymous>", "onFailure", 186, "BlockOptionallyReportDialogFragmentPeer.kt").v("Parcelled before completion when blocking number");
            jjoVar.c.o(rmx.tY);
        }
        jjoVar.b.f();
    }

    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj, java.lang.Object obj2) {
        defpackage.jjo jjoVar = this.a;
        if (!jjoVar.j.getAndSet(true)) {
            jjoVar.u.i((java.lang.String) null).b(mce.dl);
        }
        defpackage.jjo.a.b().l("com/android/dialer/blockreportspam/BlockOptionallyReportDialogFragmentPeer$blockNumberCallback$<anonymous>", "onSuccess", 169, "BlockOptionallyReportDialogFragmentPeer.kt").v("block number succeeded");
        jjoVar.b.f();
    }

    public final /* synthetic */ void b(java.lang.Object obj) {
    }
}
