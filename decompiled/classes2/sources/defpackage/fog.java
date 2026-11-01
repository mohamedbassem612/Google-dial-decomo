package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fog extends defpackage.foj {
    public final java.lang.String a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final byte[] d;

    public fog(java.lang.String str, java.lang.String str2, java.lang.String str3, byte[] bArr) {
        super("GEOB");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = bArr;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            defpackage.fog fogVar = (defpackage.fog) obj;
            if (j$.util.Objects.equals(this.a, fogVar.a) && j$.util.Objects.equals(this.b, fogVar.b) && j$.util.Objects.equals(this.c, fogVar.c) && java.util.Arrays.equals(this.d, fogVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.String str = this.a;
        return (((((((str != null ? str.hashCode() : 0) + 527) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + java.util.Arrays.hashCode(this.d);
    }

    @Override // defpackage.foj
    public final java.lang.String toString() {
        return this.f + ": mimeType=" + this.a + ", filename=" + this.b + ", description=" + this.c;
    }
}
