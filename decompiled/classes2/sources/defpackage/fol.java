package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fol extends defpackage.foj {
    public final java.lang.String a;
    public final java.lang.String b;
    public final java.lang.String c;

    public fol(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        super("----");
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            defpackage.fol folVar = (defpackage.fol) obj;
            if (j$.util.Objects.equals(this.b, folVar.b) && j$.util.Objects.equals(this.a, folVar.a) && j$.util.Objects.equals(this.c, folVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() + 527) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    @Override // defpackage.foj
    public final java.lang.String toString() {
        return this.f + ": domain=" + this.a + ", description=" + this.b;
    }
}
