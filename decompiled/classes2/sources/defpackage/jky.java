package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jky implements agtk {
    final /* synthetic */ defpackage.jld a;

    public jky(defpackage.jld jldVar) {
        this.a = jldVar;
    }

    public final /* synthetic */ void a(java.lang.Object obj, java.lang.Throwable th) throws java.lang.Throwable {
        int iB = defpackage.hhk.b(th);
        if (iB == 0) {
            defpackage.jld jldVar = this.a;
            jldVar.c.n(rmw.n);
            android.widget.Toast.makeText(jldVar.b.z(), 2132017575, 1).show();
        } else {
            if (iB != 1) {
                throw th;
            }
            defpackage.jld.a.b().l("com/android/dialer/blockreportspam/ReportSpamAndBlockNumberDialogFragmentPeer$blockNumberCallback$<anonymous>", "onFailure", 122, "ReportSpamAndBlockNumberDialogFragmentPeer.kt").v("Parcelled before completion when blocking number");
            this.a.c.o(rmx.tY);
        }
        this.a.b.f();
    }

    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj, java.lang.Object obj2) {
        defpackage.jld.a.b().l("com/android/dialer/blockreportspam/ReportSpamAndBlockNumberDialogFragmentPeer$blockNumberCallback$<anonymous>", "onSuccess", 108, "ReportSpamAndBlockNumberDialogFragmentPeer.kt").v("block number succeeded");
        this.a.b.f();
    }

    public final /* synthetic */ void b(java.lang.Object obj) {
    }
}
