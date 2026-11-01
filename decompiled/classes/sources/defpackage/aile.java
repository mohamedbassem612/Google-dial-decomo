package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aile extends defpackage.aihd {
    final transient java.lang.Object a;

    public aile(java.lang.Object obj) {
        obj.getClass();
        this.a = obj;
    }

    @Override // defpackage.aifo
    public final int c(java.lang.Object[] objArr, int i) {
        objArr[i] = this.a;
        return i + 1;
    }

    @Override // defpackage.aifo, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        return this.a.equals(obj);
    }

    @Override // defpackage.aihd, defpackage.aifo
    public final defpackage.aify g() {
        return defpackage.aify.p(this.a);
    }

    @Override // defpackage.aihd, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.aihd, defpackage.aifo, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: k */
    public final defpackage.ailj iterator() {
        return new defpackage.aiih(this.a);
    }

    @Override // defpackage.aifo
    public final boolean l() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final java.lang.String toString() {
        return "[" + this.a.toString() + ']';
    }

    @Override // defpackage.aihd, defpackage.aifo
    public java.lang.Object writeReplace() {
        return super.writeReplace();
    }
}
