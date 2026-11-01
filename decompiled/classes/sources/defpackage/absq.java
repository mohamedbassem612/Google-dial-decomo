package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class absq {
    public final android.content.Context a;
    public final defpackage.ahyn b;
    public final defpackage.ahyn c;
    private final defpackage.ahyn d;

    public absq(android.content.Context context, defpackage.ahyn ahynVar, defpackage.ahyn ahynVar2, defpackage.ahyn ahynVar3) {
        this.a = context;
        this.d = ahynVar;
        this.b = ahynVar2;
        this.c = ahynVar3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.absq) {
            defpackage.absq absqVar = (defpackage.absq) obj;
            if (this.a.equals(absqVar.a) && this.d.equals(absqVar.d) && this.b.equals(absqVar.b) && this.c.equals(absqVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ 2040732332) * 1000003) ^ this.b.hashCode()) * 1000003) ^ 1237) * 1000003) ^ 2040732332;
    }

    public final java.lang.String toString() {
        defpackage.ahyn ahynVar = this.c;
        defpackage.ahyn ahynVar2 = this.b;
        defpackage.ahyn ahynVar3 = this.d;
        return "CollectionBasisContext{context=" + java.lang.String.valueOf(this.a) + ", accountNames=" + java.lang.String.valueOf(ahynVar3) + ", stacktrace=" + java.lang.String.valueOf(ahynVar2) + ", googlerOverridesCheckbox=false, executor=" + java.lang.String.valueOf(ahynVar) + '}';
    }

    public absq() {
        throw null;
    }
}
