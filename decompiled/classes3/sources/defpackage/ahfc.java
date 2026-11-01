package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahfc implements amyp {
    public final defpackage.ahfk a;
    private final java.lang.Object b = new java.lang.Object();
    private final defpackage.ahfs c;
    private final defpackage.ahfr d;
    private volatile hkm e;

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Map] */
    public ahfc(com.google.apps.tiktok.account.AccountId accountId, defpackage.ahfs ahfsVar, java.lang.Object obj) {
        defpackage.ahfr ahfrVar;
        this.c = ahfsVar;
        defpackage.aljf aljfVarK = ((ahfa) aooc.ar(obj, ahfa.class)).k();
        synchronized (aljfVarK.b) {
            if (!aljfVarK.c.containsKey(accountId)) {
                ?? r2 = aljfVarK.c;
                ahvr.cc(anty.aA(((ahgd) aljfVarK.d).a.getApplicationContext()) instanceof amyp, "Sting Activity must be attached to an @Sting Application. Found: %s", ((ahgd) aljfVarK.d).a.getApplicationContext());
                hkg hkgVar = ((hhz) ((defpackage.rai) aljfVarK.a).a).a;
                r2.put(accountId, new defpackage.ahfr(accountId, hkgVar.d(), (ahgd) hkgVar.c.a(), hkgVar.c()));
            }
            ahfrVar = (defpackage.ahfr) aljfVarK.c.get(accountId);
        }
        this.d = ahfrVar;
        defpackage.ahfk ahfkVar = new defpackage.ahfk(accountId, ahfsVar, obj);
        this.a = ahfkVar;
        eoq eoqVarT = ahfsVar.T();
        amxw amxwVar = ahfkVar.a().b;
        amxwVar.b(eoqVarT);
        ahfsVar.P().c(new zu(this, amxwVar, 6));
    }

    public final /* synthetic */ java.lang.Object B() {
        if (this.e == null) {
            synchronized (this.b) {
                if (this.e == null) {
                    hke hkeVarB = this.d.B();
                    defpackage.ahga ahgaVarB = this.a.B();
                    hiz hizVarA = ((defpackage.ahfb) aooc.ar(hkeVarB, defpackage.ahfb.class)).a();
                    aooc.ao(ahgaVarB);
                    hizVarA.a = ahgaVarB;
                    hizVarA.b = this.c;
                    aooc.an(hizVarA.a, defpackage.ahga.class);
                    aooc.an(hizVarA.b, defpackage.ahfs.class);
                    this.e = new hkm();
                }
            }
        }
        return this.e;
    }
}
