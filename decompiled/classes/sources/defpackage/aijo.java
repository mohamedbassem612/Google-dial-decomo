package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public interface aijo extends java.util.Collection {
    int a(java.lang.Object obj, int i);

    int b(java.lang.Object obj);

    @Override // java.util.Collection, defpackage.aijo
    boolean contains(java.lang.Object obj);

    @Override // java.util.Collection
    boolean containsAll(java.util.Collection collection);

    int d(java.lang.Object obj, int i);

    boolean h(java.lang.Object obj, int i);

    @Override // defpackage.aijo
    int hashCode();

    java.util.Set i();

    @Override // java.util.Collection, java.lang.Iterable, defpackage.aijo
    java.util.Iterator iterator();

    java.util.Set j();

    @Override // java.util.Collection, defpackage.aijo
    boolean remove(java.lang.Object obj);

    @Override // java.util.Collection, defpackage.aijo
    int size();
}
