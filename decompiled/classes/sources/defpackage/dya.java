package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class dya implements defpackage.dxz {
    private final java.lang.Object[] a;
    private int b;

    public dya(int i) {
        if (i <= 0) {
            throw new java.lang.IllegalArgumentException("The max pool size must be > 0");
        }
        this.a = new java.lang.Object[i];
    }

    @Override // defpackage.dxz
    public java.lang.Object a() {
        int i = this.b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        java.lang.Object[] objArr = this.a;
        java.lang.Object obj = objArr[i2];
        if (obj == null) {
            defpackage.aooh.h("null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        }
        objArr[i2] = null;
        this.b--;
        return obj;
    }

    @Override // defpackage.dxz
    public boolean b(java.lang.Object obj) {
        if (obj == null) {
            defpackage.aooh.i("instance");
        }
        int i = this.b;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.a[i2] == obj) {
                throw new java.lang.IllegalStateException("Already in the pool!");
            }
        }
        int i3 = this.b;
        java.lang.Object[] objArr = this.a;
        if (i3 >= objArr.length) {
            return false;
        }
        objArr[i3] = obj;
        this.b = i3 + 1;
        return true;
    }
}
