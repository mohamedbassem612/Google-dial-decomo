package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class agf {
    public static final defpackage.agf a = new defpackage.agf(new defpackage.afs(null, null, null, null, false, null, 127));
    public final defpackage.afs b;

    public agf(defpackage.afs afsVar) {
        this.b = afsVar;
    }

    public final defpackage.agf a(defpackage.agf agfVar) {
        defpackage.agf agfVar2 = a;
        if (defpackage.aooh.n(this, agfVar2)) {
            return agfVar;
        }
        if (defpackage.aooh.n(agfVar, agfVar2)) {
            return this;
        }
        defpackage.afs afsVar = agfVar.b;
        defpackage.agh aghVar = afsVar.a;
        if (aghVar == null) {
            aghVar = this.b.a;
        }
        defpackage.agh aghVar2 = aghVar;
        ahv ahvVar = afsVar.b;
        if (ahvVar == null) {
            ahvVar = this.b.b;
        }
        ahv ahvVar2 = ahvVar;
        defpackage.afm afmVar = afsVar.c;
        if (afmVar == null) {
            afmVar = this.b.c;
        }
        defpackage.afm afmVar2 = afmVar;
        defpackage.ags agsVar = afsVar.d;
        if (agsVar == null) {
            agsVar = this.b.d;
        }
        defpackage.afs afsVar2 = this.b;
        return new defpackage.agf(new defpackage.afs(aghVar2, ahvVar2, afmVar2, agsVar, false, defpackage.ajsz.aQ(afsVar2.g, afsVar.g), 32));
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.agf) && defpackage.aooh.n(((defpackage.agf) obj).b, this.b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final java.lang.String toString() {
        if (defpackage.aooh.n(this, a)) {
            return "EnterTransition.None";
        }
        defpackage.afs afsVar = this.b;
        defpackage.agh aghVar = afsVar.a;
        java.lang.String string = aghVar != null ? aghVar.toString() : null;
        ahv ahvVar = afsVar.b;
        java.lang.String string2 = ahvVar != null ? ahvVar.toString() : null;
        defpackage.afm afmVar = afsVar.c;
        java.lang.String string3 = afmVar != null ? afmVar.toString() : null;
        defpackage.ags agsVar = afsVar.d;
        return "EnterTransition: Fade - " + string + ", Slide - " + string2 + ", Shrink - " + string3 + ", Scale - " + (agsVar != null ? agsVar.toString() : null) + ", Veil - null";
    }

    public agf() {
        throw null;
    }
}
