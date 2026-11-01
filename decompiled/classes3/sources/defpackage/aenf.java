package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class aenf implements ajcb {
    final /* synthetic */ ahpz a;
    private final java.lang.String b;

    public aenf(ahpz ahpzVar) {
        j$.util.Objects.requireNonNull(ahpzVar);
        this.a = ahpzVar;
        this.b = agab.bv(ahpzVar.a);
    }

    public final void a(java.lang.Throwable th) {
        java.lang.String str = this.b;
        java.lang.String strM = aehj.m(th);
        ahpz ahpzVar = this.a;
        ((adai) ahpzVar.b).f(str, strM, (java.lang.String) ahpzVar.c);
    }

    public final /* bridge */ /* synthetic */ void b(java.lang.Object obj) {
        ahpz ahpzVar = this.a;
        ((adai) ahpzVar.b).f(this.b, "OK", (java.lang.String) ahpzVar.c);
    }
}
