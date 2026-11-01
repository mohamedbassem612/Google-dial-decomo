package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class dvy {
    public final android.content.LocusId a;
    private final java.lang.String b;

    public dvy(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException("id cannot be empty");
        }
        this.b = str;
        this.a = new android.content.LocusId(str);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.b.equals(((defpackage.dvy) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode() + 31;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LocusIdCompat[");
        sb.append(this.b.length() + "_chars");
        sb.append(']');
        return sb.toString();
    }
}
