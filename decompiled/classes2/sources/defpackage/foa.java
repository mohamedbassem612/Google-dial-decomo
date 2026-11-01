package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class foa implements defpackage.eqx {
    public final byte[] a;
    public final java.lang.String b;
    public final java.lang.String c;

    public foa(byte[] bArr, java.lang.String str, java.lang.String str2) {
        this.a = bArr;
        this.b = str;
        this.c = str2;
    }

    @Override // defpackage.eqx
    public final /* synthetic */ defpackage.eqg a() {
        return null;
    }

    @Override // defpackage.eqx
    public final void b(defpackage.eqv eqvVar) {
        java.lang.String str = this.b;
        if (str != null) {
            eqvVar.a = str;
        }
    }

    @Override // defpackage.eqx
    public final /* synthetic */ byte[] c() {
        return null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return java.util.Arrays.equals(this.a, ((defpackage.foa) obj).a);
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(this.a);
    }

    public final java.lang.String toString() {
        return java.lang.String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", this.b, this.c, java.lang.Integer.valueOf(this.a.length));
    }
}
