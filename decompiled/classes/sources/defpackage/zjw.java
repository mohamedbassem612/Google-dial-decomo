package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class zjw implements defpackage.ahqh {
    private final defpackage.zjv a;

    public zjw(defpackage.zjv zjvVar) {
        defpackage.aooh.f(zjvVar, "externalsLogging");
        this.a = zjvVar;
    }

    private static final java.lang.String b(long j) {
        java.lang.String str = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", java.util.Locale.getDefault()).format(java.lang.Long.valueOf(j));
        defpackage.aooh.e(str, "format(...)");
        return str;
    }

    @Override // defpackage.ahqh
    public final void a(defpackage.ahqy ahqyVar, android.util.SparseArray sparseArray) {
        defpackage.aooh.f(ahqyVar, "record");
        defpackage.aooh.f(sparseArray, "extras");
        for (defpackage.ahop ahopVar : ahqyVar.e) {
            defpackage.aooh.c(ahopVar);
            long j = ahqyVar.f;
            java.lang.String str = ahopVar.c;
            defpackage.aooh.e(str, "getName(...)");
            if (defpackage.aoov.ad(str, "Clicked")) {
                this.a.e(defpackage.mgv.TRACE_ON_CLICK, defpackage.ajsz.bb(defpackage.gus.aw(ahopVar.c), defpackage.gus.aw(b(ahopVar.f + j))), j + ahopVar.f);
            }
            long j2 = ahqyVar.f;
            java.lang.String str2 = ahopVar.c;
            defpackage.aooh.e(str2, "getName(...)");
            if (defpackage.aoov.ad(str2, "Broadcast to")) {
                this.a.e(defpackage.mgv.BROADCAST_RECEIVER, defpackage.ajsz.bb(defpackage.gus.aw(ahopVar.c), defpackage.gus.aw(b(ahopVar.f + j2))), j2 + ahopVar.f);
            }
        }
    }
}
