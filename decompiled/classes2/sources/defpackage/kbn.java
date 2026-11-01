package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kbn implements defpackage.kbu {
    public final android.content.Context a;
    public final java.lang.String b;

    public kbn(android.content.Context context, java.lang.String str) {
        aooh.f(context, "context");
        this.a = context;
        this.b = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.kbn) {
            defpackage.kbn kbnVar = (defpackage.kbn) obj;
            if (aooh.n(this.a, kbnVar.a) && aooh.n(this.b, kbnVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "AvatarClick(context=" + this.a + ", contactUri=" + this.b + ')';
    }
}
