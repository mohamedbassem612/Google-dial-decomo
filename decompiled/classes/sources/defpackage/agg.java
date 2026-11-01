package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class agg {
    public static final defpackage.agg a;
    private static final defpackage.agg c;
    public final defpackage.afs b;

    static {
        java.util.Map map = null;
        defpackage.agh aghVar = null;
        ahv ahvVar = null;
        defpackage.afm afmVar = null;
        defpackage.ags agsVar = null;
        a = new defpackage.agg(new defpackage.afs(aghVar, ahvVar, afmVar, agsVar, false, map, 127));
        c = new defpackage.agg(new defpackage.afs(aghVar, ahvVar, afmVar, agsVar, true, map, 95));
    }

    public agg(defpackage.afs afsVar) {
        this.b = afsVar;
    }

    public final defpackage.agg a(defpackage.agg aggVar) {
        defpackage.agg aggVar2 = a;
        if (defpackage.aooh.n(this, aggVar2)) {
            return aggVar;
        }
        if (defpackage.aooh.n(aggVar, aggVar2)) {
            return this;
        }
        defpackage.afs afsVar = aggVar.b;
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
        defpackage.ags agsVar2 = agsVar;
        boolean z = true;
        if (!afsVar.f && !this.b.f) {
            z = false;
        }
        defpackage.afs afsVar2 = this.b;
        return new defpackage.agg(new defpackage.afs(aghVar2, ahvVar2, afmVar2, agsVar2, z, defpackage.ajsz.aQ(afsVar2.g, afsVar.g)));
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.agg) && defpackage.aooh.n(((defpackage.agg) obj).b, this.b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final java.lang.String toString() {
        if (defpackage.aooh.n(this, a)) {
            return "ExitTransition.None";
        }
        if (defpackage.aooh.n(this, c)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        defpackage.afs afsVar = this.b;
        defpackage.agh aghVar = afsVar.a;
        java.lang.String string = aghVar != null ? aghVar.toString() : null;
        ahv ahvVar = afsVar.b;
        java.lang.String string2 = ahvVar != null ? ahvVar.toString() : null;
        defpackage.afm afmVar = afsVar.c;
        java.lang.String string3 = afmVar != null ? afmVar.toString() : null;
        defpackage.ags agsVar = afsVar.d;
        return "ExitTransition:  Fade - " + string + ",  Slide - " + string2 + ",  Shrink - " + string3 + ",  Scale - " + (agsVar != null ? agsVar.toString() : null) + ",  Veil - null,  KeepUntilTransitionsFinished - " + afsVar.f;
    }

    public agg() {
        throw null;
    }
}
