package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class aiki extends defpackage.aify {
    private final transient java.lang.Object[] a;
    private final transient int b;
    private final transient int c;

    public aiki(java.lang.Object[] objArr, int i, int i2) {
        this.a = objArr;
        this.b = i;
        this.c = i2;
    }

    @Override // java.util.List
    public final java.lang.Object get(int i) {
        defpackage.ahvr.ch(i, this.c);
        return j$.util.Objects.requireNonNull(this.a[(i << 1) + this.b]);
    }

    @Override // defpackage.aifo
    public final boolean l() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }

    @Override // defpackage.aify, defpackage.aifo
    public java.lang.Object writeReplace() {
        return super.writeReplace();
    }
}
