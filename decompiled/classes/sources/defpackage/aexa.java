package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class aexa {
    public final android.content.Context a;
    public final defpackage.ahzi b;

    public aexa(android.content.Context context, defpackage.ahzi ahziVar) {
        this.a = context;
        this.b = ahziVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.aexa) {
            defpackage.aexa aexaVar = (defpackage.aexa) obj;
            if (this.a.equals(aexaVar.a)) {
                defpackage.ahzi ahziVar = this.b;
                if (ahziVar == null) {
                    if (aexaVar.b == null) {
                        return true;
                    }
                } else if (ahziVar.equals(aexaVar.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        defpackage.ahzi ahziVar = this.b;
        return (iHashCode * 1000003) ^ (ahziVar == null ? 0 : ahziVar.hashCode());
    }

    public final java.lang.String toString() {
        defpackage.ahzi ahziVar = this.b;
        return "FlagsContext{context=" + this.a.toString() + ", hermeticFileOverrides=" + java.lang.String.valueOf(ahziVar) + '}';
    }

    public aexa() {
        throw null;
    }
}
