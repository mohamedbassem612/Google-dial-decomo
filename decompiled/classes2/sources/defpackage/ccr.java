package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ccr implements cah {
    private final cah a;
    private final int b;
    private int c;

    public ccr(cah cahVar, int i) {
        this.a = cahVar;
        this.b = i;
    }

    public final java.lang.Object a() {
        throw null;
    }

    public final void b(aonn aonnVar, java.lang.Object obj) {
        this.a.b(aonnVar, obj);
    }

    public final void c() {
        throw null;
    }

    public final void d(java.lang.Object obj) {
        this.c++;
        this.a.d(obj);
    }

    public final void g() {
        this.a.g();
    }

    public final void h() {
        if (this.c <= 0) {
            cax.b("OffsetApplier up called with no corresponding down");
        }
        this.c--;
        this.a.h();
    }

    public final void i(int i, java.lang.Object obj) {
        this.a.i(i + (this.c == 0 ? this.b : 0), obj);
    }

    public final void j(int i, java.lang.Object obj) {
        this.a.j(i + (this.c == 0 ? this.b : 0), obj);
    }

    public final void k(int i, int i2, int i3) {
        int i4 = this.c == 0 ? this.b : 0;
        this.a.k(i + i4, i2 + i4, i3);
    }

    public final void l(int i, int i2) {
        this.a.l(i + (this.c == 0 ? this.b : 0), i2);
    }

    public final /* synthetic */ void f() {
    }
}
