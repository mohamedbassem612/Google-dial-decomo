package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aodr implements defpackage.aodt {
    private final defpackage.anrg a;

    public aodr(defpackage.anrg anrgVar) {
        anrgVar.getClass();
        this.a = anrgVar;
    }

    @Override // defpackage.aodt
    public final defpackage.anpv a(defpackage.anps anpsVar, defpackage.anpq anpqVar) {
        return anpsVar.a(this.a, anpqVar);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.aodr) {
            return this.a.equals(((defpackage.aodr) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return this.a.toString();
    }
}
