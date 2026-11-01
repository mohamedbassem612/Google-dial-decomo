package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aike extends defpackage.aify {
    public static final defpackage.aify a;
    static final defpackage.ailk b;
    final transient java.lang.Object[] c;
    public final transient int d;

    static {
        defpackage.aike aikeVar = new defpackage.aike(new java.lang.Object[0], 0);
        a = aikeVar;
        b = new defpackage.aifu(aikeVar, 0);
    }

    public aike(java.lang.Object[] objArr, int i) {
        this.c = objArr;
        this.d = i;
    }

    @Override // defpackage.aify, defpackage.aifo
    public final int c(java.lang.Object[] objArr, int i) {
        java.lang.Object[] objArr2 = this.c;
        int i2 = this.d;
        java.lang.System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // defpackage.aifo
    public final int e() {
        return this.d;
    }

    @Override // defpackage.aifo
    public final int f() {
        return 0;
    }

    @Override // java.util.List
    public final java.lang.Object get(int i) {
        defpackage.ahvr.ch(i, this.d);
        return j$.util.Objects.requireNonNull(this.c[i]);
    }

    @Override // defpackage.aifo
    public final boolean l() {
        return false;
    }

    @Override // defpackage.aifo
    public final java.lang.Object[] m() {
        return this.c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    @Override // defpackage.aify, defpackage.aifo
    public java.lang.Object writeReplace() {
        return super.writeReplace();
    }
}
