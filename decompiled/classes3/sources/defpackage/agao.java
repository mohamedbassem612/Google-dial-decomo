package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class agao extends agau {
    final /* synthetic */ java.util.List a;
    final /* synthetic */ android.graphics.Matrix b;

    public agao(agav agavVar, java.util.List list, android.graphics.Matrix matrix) {
        this.a = list;
        this.b = matrix;
        j$.util.Objects.requireNonNull(agavVar);
    }

    public final void a(android.graphics.Matrix matrix, afzv afzvVar, int i, android.graphics.Canvas canvas) {
        java.util.Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((agau) it.next()).a(this.b, afzvVar, i, canvas);
        }
    }
}
