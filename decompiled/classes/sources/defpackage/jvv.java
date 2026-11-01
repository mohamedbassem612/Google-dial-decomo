package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class jvv {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/callertags/impl/CallerTagsImpl");
    public final defpackage.ajct b;
    public final defpackage.ahzi c;
    public final defpackage.ahzi d;
    public final defpackage.ahzi e;

    public jvv(defpackage.jvs jvsVar, defpackage.ajct ajctVar) {
        this.b = ajctVar;
        int i = 1;
        this.c = defpackage.ahvr.bI(new defpackage.jvu(jvsVar, ajctVar, i));
        this.d = defpackage.ahvr.bI(new defpackage.adqd(this, jvsVar, ajctVar, i));
        this.e = defpackage.ahvr.bI(new defpackage.jvu(this, ajctVar, 0));
    }

    public final defpackage.ajcq a() {
        java.util.Locale locale = java.util.Locale.getDefault();
        java.lang.String languageTag = locale.toLanguageTag();
        defpackage.ajcq ajcqVar = (defpackage.ajcq) this.c.eZ();
        jss jssVar = new jss(languageTag, 8);
        defpackage.ajct ajctVar = this.b;
        return defpackage.ahvr.H(defpackage.ahvr.H(ajcqVar, jssVar, ajctVar), new jss(locale, 7), ajctVar);
    }

    public final defpackage.ajcq b(defpackage.aify aifyVar) {
        defpackage.aify aifyVar2 = (defpackage.aify) j$.util.Collection.-EL.stream(aifyVar).map(new jil(this, 2)).collect(defpackage.aido.a);
        return defpackage.ahvr.aj(aifyVar2).o(new hkx(aifyVar2, 18), this.b);
    }

    public final defpackage.ajcq c(java.lang.String str) {
        return defpackage.ahvr.H((defpackage.ajcq) this.c.eZ(), new jss(str, 6), this.b);
    }

    public final boolean d(zai zaiVar) {
        if (zai.a.equals(zaiVar) || !java.util.Locale.getDefault().toLanguageTag().equals(zaiVar.e)) {
            return false;
        }
        int iAR = defpackage.a.aR(zaiVar.i);
        return (iAR == 0 || iAR != 4) && !zaiVar.c.equals("HIDDEN");
    }

    public final boolean e(zag zagVar) {
        return java.util.Locale.getDefault().toLanguageTag().equals(zagVar.d);
    }
}
