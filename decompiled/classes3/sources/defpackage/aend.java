package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aend implements ajcb {
    final /* synthetic */ boolean a;
    final /* synthetic */ long b;
    final /* synthetic */ int c;
    final /* synthetic */ ahpz d;
    private final java.lang.String e;
    private final java.lang.String f;

    public aend(ahpz ahpzVar, int i, boolean z, long j) {
        this.c = i;
        this.a = z;
        this.b = j;
        j$.util.Objects.requireNonNull(ahpzVar);
        this.d = ahpzVar;
        this.e = agab.bv(ahpzVar.a);
        java.lang.String str = i != 32 ? i != 48 ? i != 64 ? i != 120 ? i != 240 ? "null" : "X_LARGE" : "LARGE" : "MEDIUM" : "SMALL" : "TINY";
        if (i == 0) {
            throw null;
        }
        this.f = str;
    }

    public final void a(java.lang.Throwable th) {
        java.lang.String str = this.f;
        java.lang.String strM = aehj.m(th);
        ahpz ahpzVar = this.d;
        adai adaiVar = (adai) ahpzVar.b;
        java.lang.String str2 = (java.lang.String) ahpzVar.c;
        java.lang.String str3 = this.e;
        boolean z = this.a;
        adaiVar.e(str3, str, strM, str2, z);
        adaiVar.h(j$.time.Instant.now().toEpochMilli() - this.b, str3, str, strM, str2, z);
    }

    public final /* bridge */ /* synthetic */ void b(java.lang.Object obj) {
        java.lang.String str = ((android.graphics.Bitmap) obj) != null ? "OK" : "NULL";
        boolean z = this.a;
        ahpz ahpzVar = this.d;
        java.lang.String str2 = this.f;
        java.lang.String str3 = this.e;
        adai adaiVar = (adai) ahpzVar.b;
        java.lang.String str4 = (java.lang.String) ahpzVar.c;
        adaiVar.e(str3, str2, str, str4, z);
        adaiVar.h(j$.time.Instant.now().toEpochMilli() - this.b, str3, str2, str, str4, z);
    }
}
