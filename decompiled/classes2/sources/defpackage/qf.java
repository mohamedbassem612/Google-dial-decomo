package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class qf {
    public final androidx.appsearch.safeparcel.PackageIdentifierParcel a;

    public qf(java.lang.String str, byte[] bArr) {
        dzk.x(str);
        dzk.x(bArr);
        this.a = new androidx.appsearch.safeparcel.PackageIdentifierParcel(str, bArr, null);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.qf) {
            return this.a.equals(((defpackage.qf) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
