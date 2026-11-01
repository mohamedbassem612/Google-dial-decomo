package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class aojr extends java.util.AbstractList implements java.util.List, defpackage.aooy {
    protected aojr() {
    }

    public abstract int b();

    public abstract java.lang.Object d(int i);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ java.lang.Object remove(int i) {
        return d(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return b();
    }
}
