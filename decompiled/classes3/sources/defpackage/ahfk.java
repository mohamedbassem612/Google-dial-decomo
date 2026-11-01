package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahfk implements amyp {
    public static final aimz a = aimz.i("com/google/apps/tiktok/inject/account/ScreenAccountRetainedComponentManager");
    private final com.google.apps.tiktok.account.AccountId b;
    private final eoi c;
    private final java.lang.Object d;

    public ahfk(com.google.apps.tiktok.account.AccountId accountId, defpackage.ahfs ahfsVar, java.lang.Object obj) {
        this.b = accountId;
        this.c = ahfsVar;
        this.d = obj;
    }

    public final defpackage.ahfh a() {
        return (defpackage.ahfh) new eog(this.c, new defpackage.ahff(this)).c("tt_screen_account_retained:".concat(java.lang.Integer.valueOf(this.b.a).toString()), defpackage.ahfh.class);
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final defpackage.ahga B() {
        defpackage.ahga ahgaVar;
        java.lang.Object objC = c();
        defpackage.ahfh ahfhVarA = a();
        synchronized (ahfhVarA.d) {
            if (ahfhVarA.e == null) {
                ahfhVarA.a = objC;
                hiz hizVarB = ((defpackage.ahfg) aooc.ar(objC, defpackage.ahfg.class)).b();
                hizVarB.a = ahfhVarA.b;
                hizVarB.b = ahfhVarA.c;
                aooc.an(hizVarB.a, amxw.class);
                aooc.an(hizVarB.b, amyl.class);
                ahfhVarA.e = new hkn();
            } else if (ahfhVarA.a != objC) {
                a.c().l("com/google/apps/tiktok/inject/account/ScreenAccountRetainedComponentManager$ScreenAccountRetainedComponentViewModel", "component", 173, "ScreenAccountRetainedComponentManager.java").v("ScreenAccountRetainedComponent already created with a different ActivityAccountRetainedComponent");
            }
            ahgaVar = ahfhVarA.e;
        }
        return ahgaVar;
    }

    public final java.lang.Object c() {
        return ((ahfj) aooc.ar(this.d, ahfj.class)).c().b(this.b);
    }
}
