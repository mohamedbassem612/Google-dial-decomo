package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class aifv extends defpackage.aify {
    private final transient defpackage.aify a;

    public aifv(defpackage.aify aifyVar) {
        this.a = aifyVar;
    }

    @Override // defpackage.aify
    public final defpackage.aify a() {
        return this.a;
    }

    @Override // defpackage.aify
    /* JADX INFO: renamed from: b */
    public final defpackage.aify subList(int i, int i2) {
        defpackage.ahvr.bX(i, i2, size());
        return this.a.subList(size() - i2, size() - i).a();
    }

    @Override // defpackage.aify, defpackage.aifo, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        return this.a.contains(obj);
    }

    @Override // java.util.List
    public final java.lang.Object get(int i) {
        defpackage.ahvr.ch(i, size());
        return this.a.get((size() - 1) - i);
    }

    @Override // defpackage.aify, java.util.List
    public final int indexOf(java.lang.Object obj) {
        int iLastIndexOf = this.a.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return (size() - 1) - iLastIndexOf;
        }
        return -1;
    }

    @Override // defpackage.aifo
    public final boolean l() {
        return this.a.l();
    }

    @Override // defpackage.aify, java.util.List
    public final int lastIndexOf(java.lang.Object obj) {
        int iIndexOf = this.a.indexOf(obj);
        if (iIndexOf >= 0) {
            return (size() - 1) - iIndexOf;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }

    @Override // defpackage.aify, java.util.List
    public final /* bridge */ /* synthetic */ java.util.List subList(int i, int i2) {
        return subList(i, i2);
    }

    @Override // defpackage.aify, defpackage.aifo
    public java.lang.Object writeReplace() {
        return super.writeReplace();
    }
}
