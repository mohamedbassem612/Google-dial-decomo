package j$.util;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public class o extends j$.util.m implements java.util.List, j$.util.List {
    private static final long serialVersionUID = -283967356065247728L;
    public final java.util.List b;

    public o(java.util.List list) {
        super(list);
        this.b = list;
    }

    private java.lang.Object readResolve() {
        java.util.List list = this.b;
        return list instanceof java.util.RandomAccess ? new j$.util.t(list) : this;
    }

    @Override // java.util.List
    public final void add(int i, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object obj) {
        return obj == this || this.b.equals(obj);
    }

    @Override // java.util.List
    public final java.lang.Object get(int i) {
        return this.b.get(i);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(java.lang.Object obj) {
        return this.b.indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(java.lang.Object obj) {
        return this.b.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator() {
        return new j$.util.n(this, 0);
    }

    @Override // java.util.List
    public final java.lang.Object remove(int i) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.List, j$.util.List
    public final void replaceAll(java.util.function.UnaryOperator unaryOperator) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.List
    public final java.lang.Object set(int i, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.List, j$.util.List
    public final void sort(java.util.Comparator comparator) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.List
    public java.util.List subList(int i, int i2) {
        return new j$.util.o(this.b.subList(i, i2));
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator(int i) {
        return new j$.util.n(this, i);
    }
}
