package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jjz implements agtk {
    final /* synthetic */ defpackage.jke a;

    public jjz(defpackage.jke jkeVar) {
        this.a = jkeVar;
    }

    public final /* synthetic */ void a(java.lang.Object obj, java.lang.Throwable th) throws java.lang.Throwable {
        defpackage.jke jkeVar = this.a;
        jkeVar.p.i((java.lang.String) null).a(mcd.ak);
        int iB = defpackage.hhk.b(th);
        if (iB == 0) {
            jkeVar.c.n(rmw.n);
            android.widget.Toast.makeText(jkeVar.b.z(), 2132017575, 1).show();
        } else {
            if (iB != 1) {
                throw th;
            }
            defpackage.jke.a.b().l("com/android/dialer/blockreportspam/BlockingNumberAndOptionallyReportingAsSpamFragmentPeer$blockNumberCallback$<anonymous>", "onFailure", 155, "BlockingNumberAndOptionallyReportingAsSpamFragmentPeer.kt").v("Parcelled before completion when blocking number");
            jkeVar.c.o(rmx.tY);
        }
        jkeVar.b.f();
    }

    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj, java.lang.Object obj2) {
        defpackage.jke jkeVar = this.a;
        jkeVar.p.i((java.lang.String) null).b(mce.dl);
        defpackage.jke.a.b().l("com/android/dialer/blockreportspam/BlockingNumberAndOptionallyReportingAsSpamFragmentPeer$blockNumberCallback$<anonymous>", "onSuccess", 138, "BlockingNumberAndOptionallyReportingAsSpamFragmentPeer.kt").v("block number succeeded");
        jkeVar.b.f();
    }

    public final /* synthetic */ void b(java.lang.Object obj) {
    }
}
