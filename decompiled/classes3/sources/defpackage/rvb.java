package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rvb {
    public final android.graphics.drawable.Drawable a;
    public final defpackage.ruz b;
    public final defpackage.rvc c;
    public final pez d;
    private final boolean e;

    public rvb(android.graphics.drawable.Drawable drawable, defpackage.ruz ruzVar, defpackage.rvc rvcVar, pez pezVar) {
        aooh.f(ruzVar, "prefCategory");
        aooh.f(rvcVar, "settingsEntry");
        aooh.f(pezVar, "title");
        this.a = drawable;
        this.b = ruzVar;
        this.c = rvcVar;
        this.d = pezVar;
        this.e = false;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.rvb) {
            defpackage.rvb rvbVar = (defpackage.rvb) obj;
            if (aooh.n(this.a, rvbVar.a) && this.b == rvbVar.b && this.c == rvbVar.c && aooh.n(this.d, rvbVar.d)) {
                boolean z = rvbVar.e;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        android.graphics.drawable.Drawable drawable = this.a;
        return ((((((((drawable == null ? 0 : drawable.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + ((defpackage.rva) this.d).a) * 31) + 1237;
    }

    public final java.lang.String toString() {
        return "PrefData(icon=" + this.a + ", prefCategory=" + this.b + ", settingsEntry=" + this.c + ", title=" + this.d + ", isBeta=false)";
    }
}
