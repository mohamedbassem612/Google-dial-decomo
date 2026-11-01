package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class aooo extends defpackage.aony implements defpackage.aoqc {
    public aooo() {
        super(defpackage.aony.d, null, null, null, false);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aomx */
    protected final defpackage.aoqc d() throws aomx {
        defpackage.aopt aoptVarE = e();
        if (aoptVarE != this) {
            return (defpackage.aoqc) aoptVarE;
        }
        throw new aomx();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.aooo) {
            defpackage.aooo aoooVar = (defpackage.aooo) obj;
            if (f().equals(aoooVar.f()) && this.f.equals(aoooVar.f) && this.g.equals(aoooVar.g) && defpackage.aooh.n(this.e, aoooVar.e)) {
                return true;
            }
        } else if (obj instanceof defpackage.aoqc) {
            return obj.equals(e());
        }
        return false;
    }

    public final int hashCode() {
        return (((f().hashCode() * 31) + this.f.hashCode()) * 31) + this.g.hashCode();
    }

    public final java.lang.String toString() {
        defpackage.aopt aoptVarE = e();
        if (aoptVarE != this) {
            return aoptVarE.toString();
        }
        return "property " + this.f + " (Kotlin reflection is not available)";
    }

    public aooo(java.lang.Object obj, java.lang.Class cls, java.lang.String str, java.lang.String str2, int i) {
        super(obj, cls, str, str2, 1 == i);
    }
}
