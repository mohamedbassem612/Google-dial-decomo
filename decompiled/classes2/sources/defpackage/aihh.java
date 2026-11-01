package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aihh extends aigb {
    private transient java.lang.Object[] f;
    private transient java.lang.Object[] g;
    private final java.util.Comparator h;

    public aihh(java.util.Comparator comparator) {
        super(4);
        ahvr.ci(comparator);
        this.h = comparator;
        this.f = new java.lang.Object[4];
        this.g = new java.lang.Object[4];
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final defpackage.aihl c() {
        int i = this.c;
        if (i == 0) {
            return defpackage.aihl.a(this.h);
        }
        if (i == 1) {
            return defpackage.aihl.t(this.h, j$.util.Objects.requireNonNull(this.f[0]), j$.util.Objects.requireNonNull(this.g[0]));
        }
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(this.f, i);
        java.util.Comparator comparator = this.h;
        java.util.Arrays.sort(objArrCopyOf, comparator);
        java.lang.Object[] objArr = new java.lang.Object[this.c];
        for (int i2 = 0; i2 < this.c; i2++) {
            if (i2 > 0) {
                int i3 = i2 - 1;
                if (comparator.compare(objArrCopyOf[i3], objArrCopyOf[i2]) == 0) {
                    throw new java.lang.IllegalArgumentException("keys required to be distinct but compared as equal: " + java.lang.String.valueOf(objArrCopyOf[i3]) + " and " + java.lang.String.valueOf(objArrCopyOf[i2]));
                }
            }
            objArr[java.util.Arrays.binarySearch(objArrCopyOf, j$.util.Objects.requireNonNull(this.f[i2]), comparator)] = j$.util.Objects.requireNonNull(this.g[i2]);
        }
        return new defpackage.aihl(new aiko(aify.h(objArrCopyOf), comparator), aify.h(objArr), null);
    }

    @java.lang.Deprecated
    public final /* bridge */ /* synthetic */ aigf b() {
        throw new java.lang.UnsupportedOperationException("ImmutableSortedMap.Builder does not yet implement buildKeepingLast()");
    }

    public final /* bridge */ /* synthetic */ void i(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.c + 1;
        int length = this.f.length;
        if (i > length) {
            int iF = aifn.f(length, i);
            this.f = java.util.Arrays.copyOf(this.f, iF);
            this.g = java.util.Arrays.copyOf(this.g, iF);
        }
        ahvr.bB(obj, obj2);
        java.lang.Object[] objArr = this.f;
        int i2 = this.c;
        objArr[i2] = obj;
        this.g[i2] = obj2;
        this.c = i2 + 1;
    }
}
