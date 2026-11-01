package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class aikf extends defpackage.aify {
    final /* synthetic */ defpackage.aikg a;

    public aikf(defpackage.aikg aikgVar) {
        j$.util.Objects.requireNonNull(aikgVar);
        this.a = aikgVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object get(int i) {
        defpackage.aikg aikgVar = this.a;
        defpackage.ahvr.ch(i, aikgVar.c);
        java.lang.Object[] objArr = aikgVar.a;
        int i2 = i << 1;
        int i3 = aikgVar.b;
        return new java.util.AbstractMap.SimpleImmutableEntry(j$.util.Objects.requireNonNull(objArr[i2 + i3]), j$.util.Objects.requireNonNull(objArr[i2 + (i3 ^ 1)]));
    }

    @Override // defpackage.aifo
    public final boolean l() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.c;
    }

    @Override // defpackage.aify, defpackage.aifo
    public java.lang.Object writeReplace() {
        return super.writeReplace();
    }
}
