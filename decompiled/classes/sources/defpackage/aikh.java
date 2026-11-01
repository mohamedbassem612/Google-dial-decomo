package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aikh extends defpackage.aihd {
    private final transient defpackage.aigf a;
    private final transient defpackage.aify b;

    public aikh(defpackage.aigf aigfVar, defpackage.aify aifyVar) {
        this.a = aigfVar;
        this.b = aifyVar;
    }

    @Override // defpackage.aifo
    public final int c(java.lang.Object[] objArr, int i) {
        return this.b.c(objArr, i);
    }

    @Override // defpackage.aifo, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        return this.a.get(obj) != null;
    }

    @Override // defpackage.aihd, defpackage.aifo
    public final defpackage.aify g() {
        return this.b;
    }

    @Override // defpackage.aihd, defpackage.aifo, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: k */
    public final defpackage.ailj iterator() {
        return this.b.listIterator(0);
    }

    @Override // defpackage.aifo
    public final boolean l() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.size();
    }

    @Override // defpackage.aihd, defpackage.aifo
    public java.lang.Object writeReplace() {
        return super.writeReplace();
    }
}
