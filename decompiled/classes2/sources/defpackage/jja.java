package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jja implements agtk {
    final /* synthetic */ defpackage.jjd a;

    public jja(defpackage.jjd jjdVar) {
        this.a = jjdVar;
    }

    public final /* synthetic */ void a(java.lang.Object obj, java.lang.Throwable th) throws java.lang.Throwable {
        int iB = defpackage.hhk.b(th);
        if (iB == 0) {
            defpackage.jjd jjdVar = this.a;
            jjdVar.c.n(rmw.n);
            android.widget.Toast.makeText(jjdVar.b.z(), 2132017575, 1).show();
        } else {
            if (iB != 1) {
                throw th;
            }
            defpackage.jjd.a.b().l("com/android/dialer/blockreportspam/BlockNumberDialogFragmentPeer$blockNumberCallback$<anonymous>", "onFailure", 103, "BlockNumberDialogFragmentPeer.kt").v("Parcelled before completion when blocking number");
            this.a.c.o(rmx.tY);
        }
        this.a.b.f();
    }

    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj, java.lang.Object obj2) {
        defpackage.jjd.a.b().l("com/android/dialer/blockreportspam/BlockNumberDialogFragmentPeer$blockNumberCallback$<anonymous>", "onSuccess", 89, "BlockNumberDialogFragmentPeer.kt").v("block number succeeded");
        this.a.b.f();
    }

    public final /* synthetic */ void b(java.lang.Object obj) {
    }
}
