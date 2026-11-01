package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aikv extends aild {
    final /* synthetic */ java.util.Set a;
    final /* synthetic */ java.util.Set b;

    public aikv(java.util.Set set, java.util.Set set2) {
        this.a = set;
        this.b = set2;
    }

    public final int a() {
        return java.lang.Math.min(d(this.a), d(this.b));
    }

    public final int b() {
        return 0;
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final ailj iterator() {
        return new defpackage.aiku(this, this.a, this.b);
    }

    public final boolean contains(java.lang.Object obj) {
        return this.a.contains(obj) && this.b.contains(obj);
    }

    public final boolean containsAll(java.util.Collection collection) {
        return this.a.containsAll(collection) && this.b.containsAll(collection);
    }

    public final boolean isEmpty() {
        return java.util.Collections.disjoint(this.b, this.a);
    }

    public final int size() {
        java.util.Iterator it = this.a.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (this.b.contains(it.next())) {
                i++;
            }
        }
        return i;
    }
}
