package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public abstract class cim implements java.util.Iterator, aoow {
    public java.lang.Object[] a = cil.a.b;
    public int b;
    private int c;

    public final java.lang.Object a() {
        return this.a[this.b];
    }

    public final void b() {
        e();
        this.b++;
    }

    public final void c(java.lang.Object[] objArr, int i, int i2) {
        this.a = objArr;
        this.c = i;
        this.b = i2;
    }

    public final boolean d() {
        return this.b < this.c;
    }

    public final boolean e() {
        return this.b < this.a.length;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return d();
    }

    @Override // java.util.Iterator
    public final void remove() {
        a.am();
    }
}
