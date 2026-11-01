package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class alam extends java.util.AbstractList {
    private final defpackage.alak a;
    private final defpackage.alal b;

    public alam(defpackage.alak alakVar, defpackage.alal alalVar) {
        this.a = alakVar;
        this.b = alalVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object get(int i) {
        return this.b.a(this.a.e(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }
}
