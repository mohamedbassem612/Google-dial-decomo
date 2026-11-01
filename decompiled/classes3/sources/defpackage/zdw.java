package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zdw {
    public final albh a;
    public final defpackage.zfd b;
    public final defpackage.zff c;

    public zdw(albh albhVar, defpackage.zfd zfdVar, defpackage.zff zffVar) {
        aooh.f(albhVar, "payload");
        aooh.f(zfdVar, "receivingIdentity");
        aooh.f(zffVar, "sendingIdentity");
        this.a = albhVar;
        this.b = zfdVar;
        this.c = zffVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.zdw) {
            defpackage.zdw zdwVar = (defpackage.zdw) obj;
            if (aooh.n(this.a, zdwVar.a) && aooh.n(this.b, zdwVar.b) && aooh.n(this.c, zdwVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final java.lang.String toString() {
        return "ContextualizedPayload(payload=" + this.a + ", receivingIdentity=" + this.b + ", sendingIdentity=" + this.c + ')';
    }
}
