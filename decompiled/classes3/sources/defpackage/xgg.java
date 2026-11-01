package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xgg implements defpackage.xpa, defpackage.xpr {
    public final defpackage.xfx a;
    public final defpackage.xfv b;
    public final boolean c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public xgg(defpackage.xfy xfyVar) {
        this(xfyVar.b(), xfyVar.a(), xfyVar.c());
        aooh.f(xfyVar, "source");
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.xgg) {
            defpackage.xgg xggVar = (defpackage.xgg) obj;
            if (this.a == xggVar.a && this.b == xggVar.b && this.c == xggVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + anty.L(this.c);
    }

    @Override // defpackage.xpa
    public final android.os.PersistableBundle toPersistableBundle() {
        android.os.PersistableBundle persistableBundle = new android.os.PersistableBundle();
        persistableBundle.putPersistableBundle("uiType", defpackage.xhy.o(this.a));
        persistableBundle.putPersistableBundle("backButtonBehavior", defpackage.xhy.o(this.b));
        persistableBundle.putString("empty", java.lang.String.valueOf(this.c));
        return persistableBundle;
    }

    public final java.lang.String toString() {
        return "PForegroundOnboardingNode(uiType=" + this.a + ", backButtonBehavior=" + this.b + ", empty=" + this.c + ')';
    }

    public xgg(defpackage.xfx xfxVar, defpackage.xfv xfvVar, boolean z) {
        aooh.f(xfxVar, "uiType");
        aooh.f(xfvVar, "backButtonBehavior");
        this.a = xfxVar;
        this.b = xfvVar;
        this.c = z;
    }
}
