package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rut {
    public final java.lang.String a;
    public final android.view.View.OnClickListener b;

    public rut(java.lang.String str, android.view.View.OnClickListener onClickListener) {
        this.a = str;
        this.b = onClickListener;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.rut) {
            defpackage.rut rutVar = (defpackage.rut) obj;
            if (aooh.n(this.a, rutVar.a) && aooh.n(this.b, rutVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "BannerActionButton(buttonText=" + this.a + ", onClickButtonListener=" + this.b + ')';
    }
}
