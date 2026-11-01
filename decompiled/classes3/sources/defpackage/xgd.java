package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xgd implements defpackage.xpa, defpackage.xpr {
    public final java.util.List a;
    public final java.util.List b;

    public xgd(java.util.List list, java.util.List list2) {
        aooh.f(list, "scopes");
        aooh.f(list2, "components");
        this.a = list;
        this.b = list2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.xgd) {
            defpackage.xgd xgdVar = (defpackage.xgd) obj;
            if (aooh.n(this.a, xgdVar.a) && aooh.n(this.b, xgdVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    @Override // defpackage.xpa
    public final android.os.PersistableBundle toPersistableBundle() {
        android.os.PersistableBundle persistableBundle = new android.os.PersistableBundle();
        persistableBundle.putStringArray("scopes", (java.lang.String[]) this.a.toArray(new java.lang.String[0]));
        persistableBundle.putStringArray("components", (java.lang.String[]) this.b.toArray(new java.lang.String[0]));
        return persistableBundle;
    }

    public final java.lang.String toString() {
        return "PAllowedCallers(scopes=" + this.a + ", components=" + this.b + ')';
    }
}
