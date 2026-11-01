package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class gow {
    private final java.lang.String a;

    public gow(java.lang.String str) {
        this.a = str;
    }

    public final java.lang.String a() {
        return this.a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.gow) {
            return defpackage.aooh.n(this.a, ((defpackage.gow) obj).a);
        }
        return false;
    }

    public int hashCode() {
        java.lang.String str = this.a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }
}
