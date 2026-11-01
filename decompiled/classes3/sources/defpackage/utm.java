package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class utm implements defpackage.tgm {
    public final defpackage.ury a;
    public final ucm b;

    public utm(ucm ucmVar, defpackage.ury uryVar) {
        aooh.f(ucmVar, "timeKeeper");
        this.b = ucmVar;
        this.a = uryVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.utm) {
            defpackage.utm utmVar = (defpackage.utm) obj;
            if (aooh.n(this.b, utmVar.b) && aooh.n(this.a, utmVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "TimeKeeperSearchItem(timeKeeper=" + this.b + ", details=" + this.a + ')';
    }
}
