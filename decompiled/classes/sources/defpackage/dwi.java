package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class dwi {
    final android.content.res.Resources a;
    final android.content.res.Resources.Theme b;

    public dwi(android.content.res.Resources resources, android.content.res.Resources.Theme theme) {
        this.a = resources;
        this.b = theme;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            defpackage.dwi dwiVar = (defpackage.dwi) obj;
            if (this.a.equals(dwiVar.a) && j$.util.Objects.equals(this.b, dwiVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.a, this.b});
    }
}
