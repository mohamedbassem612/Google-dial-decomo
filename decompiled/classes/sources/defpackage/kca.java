package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class kca {
    public final defpackage.aonj a;
    public final defpackage.aomy b;
    public final defpackage.aonj c;
    public final defpackage.aomy d;
    public final defpackage.aonj e;
    public final defpackage.aomy f;

    public kca() {
        this(new kbz(0), new defpackage.jaf(5), new kbz(2), new defpackage.jaf(6), new kbz(3), new defpackage.jaf(7));
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.kca) {
            defpackage.kca kcaVar = (defpackage.kca) obj;
            if (defpackage.aooh.n(this.a, kcaVar.a) && defpackage.aooh.n(this.b, kcaVar.b) && defpackage.aooh.n(this.c, kcaVar.c) && defpackage.aooh.n(this.d, kcaVar.d) && defpackage.aooh.n(this.e, kcaVar.e) && defpackage.aooh.n(this.f, kcaVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public final java.lang.String toString() {
        return "CallLogScreenCallbacks(onScreenShown=" + this.a + ", onScreenStarted=" + this.b + ", onScreenHidden=" + this.c + ", onScreenVisible=" + this.d + ", onInteractive=" + this.e + ", onMakeCallClick=" + this.f + ')';
    }

    public kca(defpackage.aonj aonjVar, defpackage.aomy aomyVar, defpackage.aonj aonjVar2, defpackage.aomy aomyVar2, defpackage.aonj aonjVar3, defpackage.aomy aomyVar3) {
        if (aomyVar3 == null) {
            defpackage.aooh.i("onMakeCallClick");
        }
        this.a = aonjVar;
        this.b = aomyVar;
        this.c = aonjVar2;
        this.d = aomyVar2;
        this.e = aonjVar3;
        this.f = aomyVar3;
    }
}
