package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class efw {
    public final java.lang.String a;

    public efw(java.lang.String str) {
        defpackage.aooh.f(str, "name");
        this.a = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.efw) {
            return defpackage.aooh.n(this.a, ((defpackage.efw) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return this.a;
    }
}
