package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xvw extends java.lang.ref.WeakReference {
    final defpackage.xuo a;
    final boolean b;
    defpackage.xxe c;

    public xvw(defpackage.xuo xuoVar, defpackage.xwy xwyVar, java.lang.ref.ReferenceQueue referenceQueue) {
        super(xwyVar, referenceQueue);
        anty.aI(xuoVar, "Argument must not be null");
        this.a = xuoVar;
        this.c = null;
        this.b = xwyVar.a;
    }

    final void a() {
        this.c = null;
        clear();
    }
}
