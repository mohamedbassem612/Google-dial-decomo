package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aiqp extends java.util.AbstractSet {
    final int a;
    final /* synthetic */ defpackage.aiqq b;

    public aiqp(defpackage.aiqq aiqqVar, int i) {
        j$.util.Objects.requireNonNull(aiqqVar);
        this.b = aiqqVar;
        this.a = i;
    }

    final int a() {
        return this.b.c[this.a + 1];
    }

    final int b() {
        int i = this.a;
        if (i == -1) {
            return 0;
        }
        return this.b.c[i];
    }

    final java.lang.Object c(int i) {
        return this.b.b[b() + i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        return java.util.Arrays.binarySearch(this.b.b, b(), a(), obj, this.a == -1 ? defpackage.aiqq.a : defpackage.aiqs.a) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
        return new aiqo(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return a() - b();
    }
}
