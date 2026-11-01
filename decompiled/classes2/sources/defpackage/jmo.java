package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jmo implements agtk {
    final /* synthetic */ defpackage.jmp a;

    public jmo(defpackage.jmp jmpVar) {
        this.a = jmpVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: ahzr */
    public final /* bridge */ /* synthetic */ void a(java.lang.Object obj, java.lang.Throwable th) throws ahzr {
        if (!(th instanceof defpackage.jip)) {
            throw new ahzr(th);
        }
        defpackage.jmp jmpVar = this.a;
        jmpVar.c.n(rmw.p);
        defpackage.jmn jmnVar = jmpVar.b;
        android.widget.Toast.makeText(jmnVar.z(), 2132020645, 1).show();
        jmnVar.f();
    }

    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj, java.lang.Object obj2) {
        defpackage.jmp.a.b().l("com/android/dialer/blockreportspam/UnblockNumberDialogFragmentPeer$unblockNumberCallback$<anonymous>", "onSuccess", 48, "UnblockNumberDialogFragmentPeer.kt").v("unblock number succeeded");
        this.a.b.f();
    }

    public final /* synthetic */ void b(java.lang.Object obj) {
    }
}
