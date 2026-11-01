package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class aiky extends aibx {
    final /* synthetic */ java.util.Iterator a;
    final /* synthetic */ java.util.Set b;
    final /* synthetic */ java.util.Iterator c;
    final /* synthetic */ java.util.Set d;

    public aiky(defpackage.aikz aikzVar, java.util.Iterator it, java.util.Set set, java.util.Iterator it2, java.util.Set set2) {
        this.a = it;
        this.b = set;
        this.c = it2;
        this.d = set2;
        j$.util.Objects.requireNonNull(aikzVar);
    }

    protected final java.lang.Object a() {
        java.util.Set set;
        java.lang.Object next;
        java.util.Set set2;
        java.lang.Object next2;
        do {
            java.util.Iterator it = this.a;
            if (!it.hasNext()) {
                do {
                    java.util.Iterator it2 = this.c;
                    if (!it2.hasNext()) {
                        b();
                        return null;
                    }
                    set = this.d;
                    next = it2.next();
                } while (set.contains(next));
                return next;
            }
            set2 = this.b;
            next2 = it.next();
        } while (set2.contains(next2));
        return next2;
    }
}
