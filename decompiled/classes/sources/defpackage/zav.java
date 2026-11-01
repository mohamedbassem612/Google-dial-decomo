package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class zav implements defpackage.zaw {
    public final java.lang.Integer a;

    public zav(java.lang.Integer num) {
        this.a = num;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.zav) && defpackage.aooh.n(this.a, ((defpackage.zav) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        java.lang.Integer num = this.a;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final java.lang.String toString() {
        return "AlwaysLog(semanticEventId=" + this.a + ')';
    }

    public zav() {
        this(null);
    }
}
