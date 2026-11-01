package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aijt extends defpackage.aiex implements java.io.Serializable {
    private static final long serialVersionUID = 0;
    final aijo a;

    public aijt(aijo aijoVar) {
        this.a = aijoVar;
    }

    @Override // defpackage.aiev, java.util.Collection
    public final boolean add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // defpackage.aiev, java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // defpackage.aiex, defpackage.aiev
    protected final /* synthetic */ java.util.Collection c() {
        return this.a;
    }

    @Override // defpackage.aiev, java.util.Collection
    public final void clear() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // defpackage.aiex
    protected final aijo e() {
        return this.a;
    }

    protected final /* synthetic */ java.lang.Object fp() {
        return this.a;
    }

    @Override // defpackage.aiex
    public final java.util.Set i() {
        return j$.util.DesugarCollections.unmodifiableSet(new defpackage.aijq(this.a));
    }

    @Override // defpackage.aiev, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        return ahvr.aV(this.a.iterator());
    }

    @Override // defpackage.aiex
    public final java.util.Set j() {
        return j$.util.DesugarCollections.unmodifiableSet(new defpackage.aijr(this.a));
    }

    @Override // defpackage.aiev, java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // defpackage.aiev, java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // defpackage.aiev, java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException();
    }
}
