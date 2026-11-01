package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class ald implements defpackage.alc {
    private final java.lang.Object a;
    private final java.lang.Object b;

    public ald(java.lang.Object obj, java.lang.Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // defpackage.alc
    public final java.lang.Object b() {
        return this.a;
    }

    @Override // defpackage.alc
    public final java.lang.Object c() {
        return this.b;
    }

    @Override // defpackage.alc
    public final /* synthetic */ boolean d(java.lang.Object obj, java.lang.Object obj2) {
        return xa.a(this, obj, obj2);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.alc) {
            defpackage.alc alcVar = (defpackage.alc) obj;
            if (defpackage.aooh.n(this.a, alcVar.b()) && defpackage.aooh.n(this.b, alcVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.Object obj = this.a;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        java.lang.Object obj2 = this.b;
        return (iHashCode * 31) + (obj2 != null ? obj2.hashCode() : 0);
    }
}
