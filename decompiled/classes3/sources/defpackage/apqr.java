package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class apqr {
    public final long a;
    public final java.lang.Object b;
    public final java.lang.Object c;

    public apqr(appp apppVar, long j) {
        aooh.f(apppVar, "canonicalPath");
        this.b = apppVar;
        this.a = j;
        this.c = new java.util.ArrayList();
    }

    public final java.lang.Object a(java.lang.Class cls) {
        java.lang.Object objAr = aooc.ar(this.c, cls);
        aooh.e(objAr, "get(...)");
        return objAr;
    }

    public apqr(java.lang.String str, defpackage.zod zodVar, long j) {
        this.b = str;
        this.c = zodVar;
        this.a = j;
    }

    public apqr(ajct ajctVar, aoin aoinVar, long j) {
        this.c = ajctVar;
        this.b = aoinVar;
        this.a = j;
    }
}
