package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class osk implements defpackage.znz {
    private static final aimz j = aimz.i("com/android/dialer/incall/accountselectordialog/impl/AccountSelectorDialogLauncher");
    public final android.content.Context a;
    public final java.lang.String b;
    public final ajct c;
    public final defpackage.osp d;
    public final defpackage.osr e;
    public final defpackage.oso f;
    public final ruc g;
    public final suf h;
    public final defpackage.qbe i;
    private final defpackage.afpl k;

    public osk(android.content.Context context, java.lang.String str, defpackage.afpl afplVar, ajct ajctVar, suf sufVar, defpackage.osp ospVar, defpackage.osr osrVar, defpackage.oso osoVar, ruc rucVar, defpackage.qbe qbeVar) {
        this.a = context;
        this.b = str;
        this.k = afplVar;
        this.c = ajctVar;
        this.h = sufVar;
        this.d = ospVar;
        this.e = osrVar;
        this.f = osoVar;
        this.g = rucVar;
        this.i = qbeVar;
    }

    @Override // defpackage.znz
    public final ajcq a() {
        j.b().l("com/android/dialer/incall/accountselectordialog/impl/AccountSelectorDialogLauncher", "onPhoneAccountSelectionStarted", 85, "AccountSelectorDialogLauncher.java").v("enter");
        this.g.j(ruc.aN);
        this.i.a(qbc.gs);
        defpackage.osj osjVar = (defpackage.osj) aooc.ar(this.k.Y(), defpackage.osj.class);
        ajcq ajcqVarAv = osjVar.av();
        ajcq ajcqVarBl = osjVar.bl();
        ajcq ajcqVarAS = osjVar.aS();
        return ahvr.ak(new ajcq[]{ajcqVarAv, ajcqVarBl, ajcqVarAS}).p(new kff(this, ajcqVarAv, ajcqVarBl, ajcqVarAS, 6), this.c);
    }
}
