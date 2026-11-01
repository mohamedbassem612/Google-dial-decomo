package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class akgi {
    public final byte[] a;

    public akgi(byte[] bArr) {
        this.a = bArr;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int length = this.a.length;
        sb.append(length);
        sb.append(" :: [ ");
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(sb.toString());
        defpackage.akgh akghVar = new defpackage.akgh(this);
        while (length > 0) {
            sb2.append(java.lang.Integer.toHexString(akghVar.b()));
            sb2.append(", ");
            length--;
        }
        sb2.setLength(sb2.length() - 2);
        sb2.append(" ]");
        return sb2.toString();
    }
}
