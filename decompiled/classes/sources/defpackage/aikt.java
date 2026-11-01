package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aikt extends defpackage.aild {
    final /* synthetic */ java.util.Set a;
    final /* synthetic */ java.util.Set b;

    public aikt(java.util.Set set, java.util.Set set2) {
        this.a = set;
        this.b = set2;
    }

    @Override // defpackage.aild
    public final int a() {
        return defpackage.aiql.al(d(this.a), d(this.b));
    }

    @Override // defpackage.aild
    public final int b() {
        return java.lang.Math.max(e(this.a), e(this.b));
    }

    @Override // defpackage.aild, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: c */
    public final defpackage.ailj iterator() {
        return new defpackage.aiks(this, this.a, this.b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        return this.a.contains(obj) || this.b.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.a.isEmpty() && this.b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        java.util.Set set = this.b;
        java.util.Set set2 = this.a;
        int size = set2.size();
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set2.contains(it.next())) {
                size++;
            }
        }
        return size;
    }
}
