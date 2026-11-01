package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class abmw {
    private final long a;
    private final long b;
    private final long c;

    public abmw(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.abmw) {
            defpackage.abmw abmwVar = (defpackage.abmw) obj;
            if (defpackage.anty.ah(this.a, abmwVar.a) && defpackage.anty.ah(this.b, abmwVar.b) && defpackage.anty.ah(this.c, abmwVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((defpackage.anty.M(this.a) * 31) + defpackage.anty.M(this.b)) * 31) + defpackage.anty.M(this.c);
    }

    public final java.lang.String toString() {
        long j = this.c;
        long j2 = this.b;
        return "AbcBackgroundColors(background=" + defpackage.cqg.g(this.a) + ", decoration=" + defpackage.cqg.g(j2) + ", decorationAccent=" + defpackage.cqg.g(j) + ')';
    }
}
