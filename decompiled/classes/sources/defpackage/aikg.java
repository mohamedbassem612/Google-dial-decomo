package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aikg extends defpackage.aihd {
    public final transient java.lang.Object[] a;
    public final transient int b;
    public final transient int c;
    private final transient defpackage.aigf d;

    public aikg(defpackage.aigf aigfVar, java.lang.Object[] objArr, int i, int i2) {
        this.d = aigfVar;
        this.a = objArr;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.aifo
    public final int c(java.lang.Object[] objArr, int i) {
        return g().c(objArr, i);
    }

    @Override // defpackage.aifo, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        if (!(obj instanceof java.util.Map.Entry)) {
            return false;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        java.lang.Object key = entry.getKey();
        java.lang.Object value = entry.getValue();
        return value != null && value.equals(this.d.get(key));
    }

    @Override // defpackage.aihd
    public final defpackage.aify h() {
        return new defpackage.aikf(this);
    }

    @Override // defpackage.aihd, defpackage.aifo, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: k */
    public final defpackage.ailj iterator() {
        return g().listIterator(0);
    }

    @Override // defpackage.aifo
    public final boolean l() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.c;
    }

    @Override // defpackage.aihd, defpackage.aifo
    public java.lang.Object writeReplace() {
        return super.writeReplace();
    }
}
