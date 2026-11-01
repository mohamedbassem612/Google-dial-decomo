package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aahr implements defpackage.aacu {
    public static final defpackage.aahr a = new defpackage.aahr(null);
    public final java.lang.String b;

    public aahr(java.lang.String str) {
        this.b = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.aahr) {
            return j$.util.Objects.equals(this.b, ((defpackage.aahr) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hashCode(this.b);
    }
}
