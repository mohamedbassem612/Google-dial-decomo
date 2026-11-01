package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public abstract class esk implements defpackage.esj {
    protected defpackage.esf b;
    protected defpackage.esf c;
    private defpackage.esf d;
    private defpackage.esf e;
    private java.nio.ByteBuffer f;
    private java.nio.ByteBuffer g;
    private boolean h;

    public esk() {
        java.nio.ByteBuffer byteBuffer = a;
        this.f = byteBuffer;
        this.g = byteBuffer;
        defpackage.esf esfVar = defpackage.esf.a;
        this.d = esfVar;
        this.e = esfVar;
        this.b = esfVar;
        this.c = esfVar;
    }

    @Override // defpackage.esj
    public final defpackage.esf b(defpackage.esf esfVar) {
        this.d = esfVar;
        this.e = j(esfVar);
        return g() ? this.e : defpackage.esf.a;
    }

    @Override // defpackage.esj
    public java.nio.ByteBuffer c() {
        java.nio.ByteBuffer byteBuffer = this.g;
        this.g = a;
        return byteBuffer;
    }

    @Override // defpackage.esj
    public final void d() {
        this.h = true;
        l();
    }

    @Override // defpackage.esj
    public final void f() {
        java.nio.ByteBuffer byteBuffer = a;
        this.g = byteBuffer;
        this.h = false;
        this.f = byteBuffer;
        defpackage.esf esfVar = defpackage.esf.a;
        this.d = esfVar;
        this.e = esfVar;
        this.b = esfVar;
        this.c = esfVar;
        m();
    }

    @Override // defpackage.esj
    public boolean g() {
        return this.e != defpackage.esf.a;
    }

    @Override // defpackage.esj
    public boolean h() {
        return this.h && this.g == a;
    }

    @Override // defpackage.esj
    public final void i() {
        this.g = a;
        this.h = false;
        this.b = this.d;
        this.c = this.e;
        o();
    }

    protected defpackage.esf j(defpackage.esf esfVar) {
        throw null;
    }

    protected final java.nio.ByteBuffer k(int i) {
        if (this.f.capacity() < i) {
            this.f = java.nio.ByteBuffer.allocateDirect(i).order(java.nio.ByteOrder.nativeOrder());
        } else {
            this.f.clear();
        }
        java.nio.ByteBuffer byteBuffer = this.f;
        this.g = byteBuffer;
        return byteBuffer;
    }

    protected final boolean n() {
        return this.g.hasRemaining();
    }

    protected void l() {
    }

    protected void m() {
    }

    protected void o() {
    }

    @Override // defpackage.esj
    public /* synthetic */ long a(long j) {
        return j;
    }
}
