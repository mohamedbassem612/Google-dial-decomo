package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class aiks extends defpackage.aibx {
    final java.util.Iterator a;
    final java.util.Iterator b;
    final /* synthetic */ java.util.Set c;
    final /* synthetic */ java.util.Set d;

    public aiks(defpackage.aikt aiktVar, java.util.Set set, java.util.Set set2) {
        this.c = set;
        this.d = set2;
        j$.util.Objects.requireNonNull(aiktVar);
        this.a = set.iterator();
        this.b = set2.iterator();
    }

    @Override // defpackage.aibx
    protected final java.lang.Object a() {
        java.util.Set set;
        java.lang.Object next;
        java.util.Iterator it = this.a;
        if (it.hasNext()) {
            return it.next();
        }
        do {
            java.util.Iterator it2 = this.b;
            if (!it2.hasNext()) {
                b();
                return null;
            }
            set = this.c;
            next = it2.next();
        } while (set.contains(next));
        return next;
    }
}
