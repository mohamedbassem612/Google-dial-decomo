package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class pe extends defpackage.rm {
    private final byte[] a;
    private final java.lang.String b;
    private final java.lang.String c;
    private final java.lang.String d;
    private java.lang.Integer e;

    public pe(byte[] bArr, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        dzk.x(bArr);
        this.a = bArr;
        dzk.v(bArr.length == 32, "The input digest isn't a sha-256 digest.");
        dzk.x(str);
        this.b = str;
        dzk.x(str2);
        this.c = str2;
        dzk.x(str3);
        this.d = str3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.pe) {
            defpackage.pe peVar = (defpackage.pe) obj;
            if (java.util.Arrays.equals(this.a, peVar.a) && this.b.equals(peVar.b) && this.c.equals(peVar.c) && this.d.equals(peVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.Integer numValueOf = this.e;
        if (numValueOf == null) {
            numValueOf = java.lang.Integer.valueOf(j$.util.Objects.hash(new java.lang.Object[]{java.lang.Integer.valueOf(java.util.Arrays.hashCode(this.a)), this.b, this.c, this.d}));
            this.e = numValueOf;
        }
        return numValueOf.intValue();
    }

    public final java.lang.String toString() {
        defpackage.sm smVar = new defpackage.sm();
        smVar.a("{\n");
        smVar.d();
        smVar.a("packageName: \"");
        smVar.a(this.b);
        smVar.a("\",\n");
        smVar.a("databaseName: \"");
        smVar.a(this.c);
        smVar.a("\",\n");
        smVar.a("namespace: \"");
        smVar.a(this.d);
        smVar.a("\",\n");
        smVar.a("digest: \"");
        int i = 0;
        while (true) {
            byte[] bArr = this.a;
            if (i >= bArr.length) {
                smVar.a("\",\n");
                smVar.c();
                smVar.a("}");
                return smVar.toString();
            }
            java.lang.String hexString = java.lang.Integer.toHexString(bArr[i] & 255);
            if (hexString.length() == 1) {
                smVar.b('0');
            }
            smVar.a(hexString);
            i++;
        }
    }
}
