package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fob extends defpackage.foj {
    public final java.lang.String a;
    public final java.lang.String b;
    public final int c;
    public final byte[] d;

    public fob(java.lang.String str, java.lang.String str2, int i, byte[] bArr) {
        super("APIC");
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = bArr;
    }

    @Override // defpackage.foj, defpackage.eqx
    public final void b(defpackage.eqv eqvVar) {
        eqvVar.a(this.d, this.c);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            defpackage.fob fobVar = (defpackage.fob) obj;
            if (this.c == fobVar.c && j$.util.Objects.equals(this.a, fobVar.a) && j$.util.Objects.equals(this.b, fobVar.b) && java.util.Arrays.equals(this.d, fobVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.String str = this.a;
        int iHashCode = str != null ? str.hashCode() : 0;
        int i = this.c;
        java.lang.String str2 = this.b;
        return ((((((i + 527) * 31) + iHashCode) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + java.util.Arrays.hashCode(this.d);
    }

    @Override // defpackage.foj
    public final java.lang.String toString() {
        return this.f + ": mimeType=" + this.a + ", description=" + this.b;
    }
}
