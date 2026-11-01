package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class nsg {
    public final defpackage.nst a;
    public final defpackage.nmz b;

    public nsg() {
        this(mni.ao(defpackage.nst.a.m()).j(), defpackage.nmw.a);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.nsg) {
            defpackage.nsg nsgVar = (defpackage.nsg) obj;
            if (aooh.n(this.a, nsgVar.a) && aooh.n(this.b, nsgVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "TranscriptsWithSummary(transcripts=" + this.a + ", summary=" + this.b + ')';
    }

    public nsg(defpackage.nst nstVar, defpackage.nmz nmzVar) {
        aooh.f(nstVar, "transcripts");
        aooh.f(nmzVar, "summary");
        this.a = nstVar;
        this.b = nmzVar;
    }
}
