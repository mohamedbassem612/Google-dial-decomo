package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class ynb implements ajcb {
    final /* synthetic */ ahzp a;
    final /* synthetic */ int b;
    final /* synthetic */ defpackage.ync c;
    final /* synthetic */ int d;

    public ynb(ahzp ahzpVar, int i, int i2, defpackage.ync yncVar) {
        this.a = ahzpVar;
        this.d = i;
        this.b = i2;
        this.c = yncVar;
    }

    public final void a(java.lang.Throwable th) {
        int i = th instanceof defpackage.ymi ? ((defpackage.ymi) th).b : 0;
        defpackage.xhp.r(this.a, this.d, this.b, this.c, true != (th instanceof java.util.concurrent.CancellationException) ? 5 : 6, i);
    }

    public final void b(java.lang.Object obj) {
        defpackage.xhp.r(this.a, this.d, this.b, this.c, 4, 0);
    }
}
