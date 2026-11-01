package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajud implements defpackage.ajwe {
    private volatile java.util.Set b = null;
    private volatile java.util.Set a = java.util.Collections.newSetFromMap(new j$.util.concurrent.ConcurrentHashMap());

    public ajud(java.util.Collection collection) {
        this.a.addAll(collection);
    }

    static defpackage.ajud b(java.util.Collection collection) {
        return new defpackage.ajud((java.util.Set) collection);
    }

    private final synchronized void d() {
        java.util.Iterator it = this.a.iterator();
        while (it.hasNext()) {
            this.b.add(((defpackage.ajwe) it.next()).a());
        }
        this.a = null;
    }

    @Override // defpackage.ajwe
    public final /* bridge */ /* synthetic */ java.lang.Object a() {
        if (this.b == null) {
            synchronized (this) {
                if (this.b == null) {
                    this.b = java.util.Collections.newSetFromMap(new j$.util.concurrent.ConcurrentHashMap());
                    d();
                }
            }
        }
        return j$.util.DesugarCollections.unmodifiableSet(this.b);
    }

    public final synchronized void c(defpackage.ajwe ajweVar) {
        if (this.b == null) {
            this.a.add(ajweVar);
        } else {
            this.b.add(ajweVar.a());
        }
    }
}
