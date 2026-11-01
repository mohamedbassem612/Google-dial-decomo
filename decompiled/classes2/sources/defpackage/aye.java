package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aye implements ayy {
    private final azz a;
    private final dpf b;

    public aye(azz azzVar, dpf dpfVar) {
        this.a = azzVar;
        this.b = dpfVar;
    }

    public final float a() {
        azz azzVar = this.a;
        dpf dpfVar = this.b;
        return dpfVar.dj(azzVar.a(dpfVar));
    }

    public final float b(dpq dpqVar) {
        azz azzVar = this.a;
        dpf dpfVar = this.b;
        return dpfVar.dj(azzVar.b(dpfVar, dpqVar));
    }

    public final float c(dpq dpqVar) {
        azz azzVar = this.a;
        dpf dpfVar = this.b;
        return dpfVar.dj(azzVar.c(dpfVar, dpqVar));
    }

    public final float d() {
        azz azzVar = this.a;
        dpf dpfVar = this.b;
        return dpfVar.dj(azzVar.d(dpfVar));
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.aye) {
            defpackage.aye ayeVar = (defpackage.aye) obj;
            if (aooh.n(this.a, ayeVar.a) && aooh.n(this.b, ayeVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "InsetsPaddingValues(insets=" + this.a + ", density=" + this.b + ')';
    }
}
