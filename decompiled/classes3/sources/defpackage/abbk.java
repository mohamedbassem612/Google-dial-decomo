package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abbk extends defpackage.abbm {
    public final akzc a;
    public final long b;
    public final java.util.List c;

    public abbk(akzc akzcVar, long j, java.util.List list) {
        aooh.f(akzcVar, "protectionToken");
        this.a = akzcVar;
        this.b = j;
        this.c = list;
    }

    @Override // defpackage.abbm
    public final long C() {
        return this.b;
    }

    @Override // defpackage.abbm
    public final akzc D() {
        return this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.abbk) {
            defpackage.abbk abbkVar = (defpackage.abbk) obj;
            if (aooh.n(this.a, abbkVar.a) && this.b == abbkVar.b && aooh.n(this.c, abbkVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + anty.M(this.b)) * 31) + this.c.hashCode();
    }
}
