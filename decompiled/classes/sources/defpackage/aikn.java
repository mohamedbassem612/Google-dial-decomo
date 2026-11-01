package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aikn extends defpackage.aihd {
    public static final defpackage.aikn a;
    private static final java.lang.Object[] f;
    final transient java.lang.Object[] b;
    public final transient int c;
    final transient java.lang.Object[] d;
    public final transient int e;
    private final transient int g;

    static {
        java.lang.Object[] objArr = new java.lang.Object[0];
        f = objArr;
        a = new defpackage.aikn(objArr, 0, objArr, 0, 0);
    }

    public aikn(java.lang.Object[] objArr, int i, java.lang.Object[] objArr2, int i2, int i3) {
        this.b = objArr;
        this.c = i;
        this.d = objArr2;
        this.g = i2;
        this.e = i3;
    }

    @Override // defpackage.aihd
    public final boolean b() {
        return true;
    }

    @Override // defpackage.aifo
    public final int c(java.lang.Object[] objArr, int i) {
        java.lang.Object[] objArr2 = this.b;
        int i2 = this.e;
        java.lang.System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // defpackage.aifo, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        java.lang.Object[] objArr = this.d;
        if (objArr.length == 0) {
            return false;
        }
        int iBz = defpackage.ahvr.bz(obj);
        while (true) {
            int i = iBz & this.g;
            java.lang.Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iBz = i + 1;
        }
    }

    @Override // defpackage.aifo
    public final int e() {
        return this.e;
    }

    @Override // defpackage.aifo
    public final int f() {
        return 0;
    }

    @Override // defpackage.aihd
    public final defpackage.aify h() {
        return defpackage.aify.i(this.b, this.e);
    }

    @Override // defpackage.aihd, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.c;
    }

    @Override // defpackage.aihd, defpackage.aifo, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: k */
    public final defpackage.ailj iterator() {
        return g().listIterator(0);
    }

    @Override // defpackage.aifo
    public final boolean l() {
        return false;
    }

    @Override // defpackage.aifo
    public final java.lang.Object[] m() {
        return this.b;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.e;
    }

    @Override // defpackage.aihd, defpackage.aifo
    public java.lang.Object writeReplace() {
        return super.writeReplace();
    }
}
