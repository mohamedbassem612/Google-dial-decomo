package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class eqi {
    public final java.lang.String a;
    public final java.lang.String b;

    static {
        java.lang.String str = eum.a;
    }

    public eqi(java.lang.String str, java.lang.String str2) {
        this.a = eum.L(str);
        this.b = str2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            defpackage.eqi eqiVar = (defpackage.eqi) obj;
            if (j$.util.Objects.equals(this.a, eqiVar.a) && j$.util.Objects.equals(this.b, eqiVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        java.lang.String str = this.a;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "{ lang=" + this.a + ", '" + this.b + "' }";
    }
}
