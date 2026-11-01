package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class acin {
    public final android.app.Dialog a;
    public final java.util.List b;

    public acin(android.app.Dialog dialog, java.util.List list) {
        this.a = dialog;
        this.b = list;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.acin) {
            defpackage.acin acinVar = (defpackage.acin) obj;
            if (aooh.n(this.a, acinVar.a) && aooh.n(this.b, acinVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "PromoDialog(dialog=" + this.a + ", actionViews=" + this.b + ')';
    }
}
