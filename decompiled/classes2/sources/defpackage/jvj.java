package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class jvj extends afqs {
    final /* synthetic */ defpackage.jvk a;
    private int b;

    public jvj(defpackage.jvk jvkVar) {
        j$.util.Objects.requireNonNull(jvkVar);
        this.a = jvkVar;
        this.b = -1;
    }

    public final void a(android.view.View view, int i) {
        if (this.b != i) {
            this.a.d.a();
        }
        this.a.b();
        this.b = i;
    }

    public final void b(android.view.View view) {
    }
}
