package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aikx extends defpackage.aild {
    final /* synthetic */ java.util.Set a;
    final /* synthetic */ java.util.Set b;

    public aikx(java.util.Set set, java.util.Set set2) {
        this.a = set;
        this.b = set2;
    }

    @Override // defpackage.aild
    public final int a() {
        return d(this.a);
    }

    @Override // defpackage.aild
    public final int b() {
        return java.lang.Math.max(e(this.a) - d(this.b), 0);
    }

    @Override // defpackage.aild, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: c */
    public final defpackage.ailj iterator() {
        return new defpackage.aikw(this, this.a, this.b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        return this.a.contains(obj) && !this.b.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.b.containsAll(this.a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        java.util.Iterator it = this.a.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (!this.b.contains(it.next())) {
                i++;
            }
        }
        return i;
    }
}
