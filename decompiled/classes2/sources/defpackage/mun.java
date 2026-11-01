package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mun {
    public final java.lang.String a;
    public final akzc b;

    public mun(java.lang.String str, akzc akzcVar) {
        aooh.f(str, "fileName");
        aooh.f(akzcVar, "audioData");
        this.a = str;
        this.b = akzcVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.mun) {
            defpackage.mun munVar = (defpackage.mun) obj;
            if (aooh.n(this.a, munVar.a) && aooh.n(this.b, munVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "NamedAudioFile(fileName=" + this.a + ", audioData=" + this.b + ')';
    }
}
