package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class anzf {
    final java.lang.Object a;
    java.util.Collection b;
    defpackage.anqw c;
    final /* synthetic */ defpackage.anzg d;

    public anzf(defpackage.anzg anzgVar) {
        j$.util.Objects.requireNonNull(anzgVar);
        this.d = anzgVar;
        this.a = new java.lang.Object();
        this.b = new java.util.HashSet();
    }

    final void a(defpackage.anqw anqwVar) {
        synchronized (this.a) {
            if (this.c != null) {
                return;
            }
            this.c = anqwVar;
            boolean zIsEmpty = this.b.isEmpty();
            if (zIsEmpty) {
                this.d.z.q(anqwVar);
            }
        }
    }
}
