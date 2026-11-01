package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahqg {
    public final aify a;
    public final aify b;
    public final java.util.UUID c;
    public final long d;

    public ahqg(aify aifyVar, aify aifyVar2, java.util.UUID uuid, long j) {
        this.a = aifyVar;
        this.b = aifyVar2;
        this.c = uuid;
        this.d = j;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.ahqg) {
            defpackage.ahqg ahqgVar = (defpackage.ahqg) obj;
            if (ahvr.aP(this.a, ahqgVar.a) && ahvr.aP(this.b, ahqgVar.b) && this.c.equals(ahqgVar.c) && this.d == ahqgVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
        long j = this.d;
        return (iHashCode * 1000003) ^ ((int) ((j >>> 32) ^ j));
    }

    public final java.lang.String toString() {
        return android.text.TextUtils.join((java.lang.CharSequence) " -> ", (java.lang.Iterable) this.a);
    }

    public ahqg() {
        throw null;
    }
}
