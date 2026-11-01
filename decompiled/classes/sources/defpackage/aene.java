package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aene implements defpackage.ajcb {
    final /* synthetic */ boolean a;
    final /* synthetic */ long b;
    final /* synthetic */ defpackage.ahpz c;
    private final java.lang.String d;

    public aene(defpackage.ahpz ahpzVar, boolean z, long j) {
        this.a = z;
        this.b = j;
        j$.util.Objects.requireNonNull(ahpzVar);
        this.c = ahpzVar;
        this.d = defpackage.agab.bv(ahpzVar.a);
    }

    @Override // defpackage.ajcb
    public final void a(java.lang.Throwable th) {
        java.lang.String str = this.d;
        java.lang.String strM = defpackage.aehj.m(th);
        defpackage.ahpz ahpzVar = this.c;
        defpackage.adai adaiVar = (defpackage.adai) ahpzVar.b;
        java.lang.String str2 = (java.lang.String) ahpzVar.c;
        boolean z = this.a;
        adaiVar.g(str, strM, -1, str2, z);
        adaiVar.i(j$.time.Instant.now().toEpochMilli() - this.b, str, strM, -1, str2, z);
    }

    @Override // defpackage.ajcb
    public final /* bridge */ /* synthetic */ void b(java.lang.Object obj) {
        int iMin = java.lang.Math.min(((defpackage.aify) obj).size(), 10);
        defpackage.ahpz ahpzVar = this.c;
        defpackage.adai adaiVar = (defpackage.adai) ahpzVar.b;
        java.lang.String str = (java.lang.String) ahpzVar.c;
        java.lang.String str2 = this.d;
        boolean z = this.a;
        adaiVar.g(str2, "OK", iMin, str, z);
        adaiVar.i(j$.time.Instant.now().toEpochMilli() - this.b, str2, "OK", iMin, str, z);
    }
}
