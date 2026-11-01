package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class afs {
    public final defpackage.agh a;
    public final ahv b;
    public final defpackage.afm c;
    public final defpackage.ags d;
    public final ahz e;
    public final boolean f;
    public final java.util.Map g;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ afs(defpackage.agh aghVar, ahv ahvVar, defpackage.afm afmVar, defpackage.ags agsVar, boolean z, java.util.Map map, int i) {
        map = (i & 64) != 0 ? defpackage.aokd.a : map;
        int i2 = i & 8;
        int i3 = i & 4;
        int i4 = i & 2;
        boolean z2 = (i & 32) == 0;
        int i5 = i & 1;
        boolean z3 = z & z2;
        agsVar = i2 != 0 ? null : agsVar;
        afmVar = i3 != 0 ? null : afmVar;
        this(1 == i5 ? null : aghVar, i4 != 0 ? null : ahvVar, afmVar, agsVar, z3, map);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.afs) {
            defpackage.afs afsVar = (defpackage.afs) obj;
            if (defpackage.aooh.n(this.a, afsVar.a) && defpackage.aooh.n(this.b, afsVar.b) && defpackage.aooh.n(this.c, afsVar.c) && defpackage.aooh.n(this.d, afsVar.d)) {
                ahz ahzVar = afsVar.e;
                if (this.f == afsVar.f && defpackage.aooh.n(this.g, afsVar.g)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        defpackage.agh aghVar = this.a;
        int iHashCode = aghVar != null ? aghVar.hashCode() : 0;
        ahv ahvVar = this.b;
        int iHashCode2 = ahvVar != null ? ahvVar.hashCode() : 0;
        int i = iHashCode * 31;
        defpackage.afm afmVar = this.c;
        int iHashCode3 = (((i + iHashCode2) * 31) + (afmVar != null ? afmVar.hashCode() : 0)) * 31;
        defpackage.ags agsVar = this.d;
        return ((((iHashCode3 + (agsVar != null ? agsVar.hashCode() : 0)) * 961) + defpackage.anty.L(this.f)) * 31) + this.g.hashCode();
    }

    public final java.lang.String toString() {
        return "EnterExitTransitionConfig(fade=" + this.a + ", slide=" + this.b + ", changeSize=" + this.c + ", scale=" + this.d + ", veil=null, hold=" + this.f + ", effectsMap=" + this.g + ')';
    }

    public afs(defpackage.agh aghVar, ahv ahvVar, defpackage.afm afmVar, defpackage.ags agsVar, boolean z, java.util.Map map) {
        this.a = aghVar;
        this.b = ahvVar;
        this.c = afmVar;
        this.d = agsVar;
        this.e = null;
        this.f = z;
        this.g = map;
    }

    public afs() {
        this(null, null, null, null, false, null, 127);
    }
}
