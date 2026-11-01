package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pyf {
    public final android.view.animation.Animation a;
    public final android.view.animation.Animation b;

    public pyf(android.view.animation.Animation animation, android.view.animation.Animation animation2) {
        this.a = animation;
        this.b = animation2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.pyf) {
            defpackage.pyf pyfVar = (defpackage.pyf) obj;
            if (this.a.equals(pyfVar.a) && this.b.equals(pyfVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final java.lang.String toString() {
        android.view.animation.Animation animation = this.b;
        return "Animations{slideInAnimation=" + java.lang.String.valueOf(this.a) + ", slideOutAnimation=" + java.lang.String.valueOf(animation) + '}';
    }

    public pyf() {
        throw null;
    }
}
