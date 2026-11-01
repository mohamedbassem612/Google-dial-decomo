package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class anqy {
    private final anqw a;
    private final java.lang.Object b;

    public anqy(anqw anqwVar, java.lang.Object obj) {
        this.a = anqwVar;
        this.b = obj;
    }

    public static defpackage.anqy b(anqw anqwVar) {
        ahvr.cj(anqwVar, "status");
        defpackage.anqy anqyVar = new defpackage.anqy(anqwVar, null);
        ahvr.bR(!anqwVar.h(), "cannot use OK status: %s", anqwVar);
        return anqyVar;
    }

    public final anqw a() {
        anqw anqwVar = this.a;
        return anqwVar == null ? anqw.b : anqwVar;
    }

    public final java.lang.Object c() {
        if (this.a == null) {
            return this.b;
        }
        throw new java.lang.IllegalStateException("No value present.");
    }

    public final boolean d() {
        return this.a == null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.anqy) {
            defpackage.anqy anqyVar = (defpackage.anqy) obj;
            if (d() == anqyVar.d()) {
                return d() ? j$.util.Objects.equals(this.b, anqyVar.b) : j$.util.Objects.equals(this.a, anqyVar.a);
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.a, this.b});
    }

    public final java.lang.String toString() {
        ahym ahymVarL = ahvr.l(this);
        anqw anqwVar = this.a;
        if (anqwVar == null) {
            ahymVarL.b("value", this.b);
        } else {
            ahymVarL.b("error", anqwVar);
        }
        return ahymVarL.toString();
    }
}
