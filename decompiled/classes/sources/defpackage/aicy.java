package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aicy extends java.util.AbstractCollection {
    final /* synthetic */ defpackage.aicz a;

    public aicy(defpackage.aicz aiczVar) {
        j$.util.Objects.requireNonNull(aiczVar);
        this.a = aiczVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.a.q();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        return this.a.v(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        return this.a.m();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.a.h();
    }
}
