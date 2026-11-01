package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class dvv {
    public final java.lang.CharSequence a;
    public final androidx.core.graphics.drawable.IconCompat b;
    public final java.lang.String c;
    public final java.lang.String d;
    public final boolean e;
    public final boolean f;

    public dvv(defpackage.dvu dvuVar) {
        this.a = dvuVar.a;
        this.b = dvuVar.b;
        this.c = dvuVar.c;
        this.d = dvuVar.d;
        this.e = dvuVar.e;
        this.f = dvuVar.f;
    }

    public static defpackage.dvv a(android.os.Bundle bundle) {
        android.os.Bundle bundle2 = bundle.getBundle("icon");
        defpackage.dvu dvuVar = new defpackage.dvu();
        dvuVar.a = bundle.getCharSequence("name");
        dvuVar.b = bundle2 != null ? androidx.core.graphics.drawable.IconCompat.e(bundle2) : null;
        dvuVar.c = bundle.getString("uri");
        dvuVar.d = bundle.getString("key");
        dvuVar.e = bundle.getBoolean("isBot");
        dvuVar.f = bundle.getBoolean("isImportant");
        return new defpackage.dvv(dvuVar);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == null || !(obj instanceof defpackage.dvv)) {
            return false;
        }
        defpackage.dvv dvvVar = (defpackage.dvv) obj;
        java.lang.String str = this.d;
        java.lang.String str2 = dvvVar.d;
        if (str != null || str2 != null) {
            return j$.util.Objects.equals(str, str2);
        }
        if (!j$.util.Objects.equals(j$.util.Objects.toString(this.a), j$.util.Objects.toString(dvvVar.a)) || !j$.util.Objects.equals(this.c, dvvVar.c)) {
            return false;
        }
        if (j$.util.Objects.equals(java.lang.Boolean.valueOf(this.e), java.lang.Boolean.valueOf(dvvVar.e))) {
            return j$.util.Objects.equals(java.lang.Boolean.valueOf(this.f), java.lang.Boolean.valueOf(dvvVar.f));
        }
        return false;
    }

    public final int hashCode() {
        java.lang.String str = this.d;
        return str != null ? str.hashCode() : j$.util.Objects.hash(new java.lang.Object[]{this.a, this.c, java.lang.Boolean.valueOf(this.e), java.lang.Boolean.valueOf(this.f)});
    }
}
