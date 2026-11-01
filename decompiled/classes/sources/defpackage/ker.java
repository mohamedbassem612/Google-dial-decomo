package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ker {
    private final defpackage.albn a;

    public ker(defpackage.albn albnVar) {
        if (albnVar == null) {
            defpackage.aooh.i("parser");
        }
        this.a = albnVar;
    }

    public static final /* bridge */ /* synthetic */ defpackage.akzc b(java.lang.Object obj) {
        defpackage.albh albhVar = (defpackage.albh) obj;
        defpackage.aooh.f(albhVar, "data");
        return albhVar.f();
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(defpackage.akzc akzcVar) {
        defpackage.aooh.f(akzcVar, "byteString");
        java.lang.Object objG = this.a.g(akzcVar, defpackage.akzq.a());
        defpackage.aooh.e(objG, "parseFrom(...)");
        return objG;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.ker) && defpackage.aooh.n(this.a, ((defpackage.ker) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "MessageLiteConverter(parser=" + this.a + ')';
    }
}
