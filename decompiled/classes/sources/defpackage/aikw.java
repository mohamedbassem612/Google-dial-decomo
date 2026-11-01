package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class aikw extends defpackage.aibx {
    final java.util.Iterator a;
    final /* synthetic */ java.util.Set b;
    final /* synthetic */ java.util.Set c;

    public aikw(defpackage.aikx aikxVar, java.util.Set set, java.util.Set set2) {
        this.b = set;
        this.c = set2;
        j$.util.Objects.requireNonNull(aikxVar);
        this.a = set.iterator();
    }

    @Override // defpackage.aibx
    protected final java.lang.Object a() {
        java.util.Set set;
        java.lang.Object next;
        do {
            java.util.Iterator it = this.a;
            if (!it.hasNext()) {
                b();
                return null;
            }
            set = this.c;
            next = it.next();
        } while (set.contains(next));
        return next;
    }
}
