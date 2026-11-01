package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class otc {
    public defpackage.qit a;
    public defpackage.abvz b;
    public java.lang.String c;
    public short d;
    private boolean e;
    private boolean f;
    private boolean g;
    private boolean h;
    private java.lang.Long i;

    public final defpackage.otd a() {
        return new defpackage.otd(this.e, this.f, this.g, this.h, false, this.a, this.b, this.c, this.i, (~this.d) & 511);
    }

    public final void b(boolean z) {
        this.g = z;
        this.d = (short) (this.d | 4);
    }

    public final void c(boolean z) {
        this.h = z;
        this.d = (short) (this.d | 8);
    }

    public final void d(boolean z) {
        this.f = z;
        this.d = (short) (this.d | 2);
    }

    public final void e(boolean z) {
        this.e = z;
        this.d = (short) (this.d | 1);
    }

    public final /* synthetic */ void f(j$.util.Optional optional) {
        aooh.f(optional, "outgoingCallRequestId");
        this.i = (java.lang.Long) aooh.q(optional);
        this.d = (short) (this.d | 256);
    }
}
