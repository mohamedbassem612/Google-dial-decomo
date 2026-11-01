package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class uod implements defpackage.kkd {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/speeddial/bar/impl/integration/FavoritesBarCallLogScreenIntegration");
    public final defpackage.unb b;
    public final defpackage.lxj c;
    public final defpackage.gpd d;
    private final defpackage.aoin e;
    private final defpackage.aoin f;
    private final defpackage.aoin g;
    private final defpackage.aoin h;
    private final defpackage.aozh i;
    private final defpackage.kkc j;
    private final java.lang.String k;
    private final defpackage.zjm l;

    public uod(defpackage.unb unbVar, defpackage.aoss aossVar, defpackage.lxj lxjVar, defpackage.aoin aoinVar, defpackage.aoin aoinVar2, defpackage.aoin aoinVar3, defpackage.aoin aoinVar4, defpackage.gpd gpdVar, defpackage.zjm zjmVar) {
        if (aoinVar == null) {
            defpackage.aooh.i("enableCallLogInCompose");
        }
        if (gpdVar == null) {
            defpackage.aooh.i("cuiSemanticLoggerFactory");
        }
        this.b = unbVar;
        this.c = lxjVar;
        this.e = aoinVar;
        this.f = aoinVar2;
        this.g = aoinVar3;
        this.h = aoinVar4;
        this.d = gpdVar;
        this.l = zjmVar;
        this.i = defpackage.aoov.as(new defpackage.fzh(unbVar.g, 12), aossVar, new defpackage.aozg(5000L, Long.MAX_VALUE), defpackage.kkj.a);
        this.j = defpackage.kkc.b;
        this.k = "favorites_bar_integration";
    }

    @Override // defpackage.kkd
    public final defpackage.kkc a() {
        return this.j;
    }

    @Override // defpackage.kkd
    public final java.lang.String b() {
        return this.k;
    }

    @Override // defpackage.kkd
    public final defpackage.aozh c() {
        return this.i;
    }

    @Override // defpackage.kkd
    public final void d(defpackage.kkk kkkVar, boolean z, defpackage.cmw cmwVar, defpackage.cav cavVar, int i) {
        defpackage.aomy aomyVar;
        if (kkkVar == null) {
            defpackage.aooh.i("data");
        }
        cavVar.u(1062634261);
        android.content.Context context = (android.content.Context) cavVar.e(defpackage.dep.b);
        defpackage.cbt cbtVar = (defpackage.cbt) cavVar;
        java.lang.Object objR = cbtVar.R();
        java.lang.Object obj = defpackage.cau.a;
        if (objR == obj) {
            defpackage.cdy cdyVar = new defpackage.cdy(cbtVar.v, defpackage.aols.a);
            cbtVar.ab(cdyVar);
            objR = cdyVar;
        }
        defpackage.aoss aossVar = (defpackage.aoss) objR;
        defpackage.nf nfVar = (defpackage.nf) cavVar.e(defpackage.kke.a);
        java.lang.String string = ((android.content.res.Resources) cavVar.e(defpackage.dep.c)).getString(2132018660);
        java.lang.Object[] objArr = new java.lang.Object[0];
        java.lang.Object objR2 = cbtVar.R();
        if (objR2 == obj) {
            objR2 = new defpackage.uoa(0);
            cbtVar.ab(objR2);
        }
        defpackage.ccp ccpVar = (defpackage.ccp) defpackage.cfd.m(objArr, (defpackage.aomy) objR2, cavVar, 48);
        defpackage.oz ozVar = new defpackage.oz();
        boolean zD = cavVar.D(this);
        java.lang.Object objR3 = cbtVar.R();
        if (zD || objR3 == obj) {
            objR3 = new defpackage.mdr(this, 12);
            cbtVar.ab(objR3);
        }
        java.lang.Object objBI = defpackage.den.bI(ozVar, (defpackage.aonj) objR3, cavVar);
        defpackage.pb pbVar = new defpackage.pb();
        boolean zD2 = cavVar.D(this);
        java.lang.Object objR4 = cbtVar.R();
        if (zD2 || objR4 == obj) {
            objR4 = new defpackage.mdr(this, 13);
            cbtVar.ab(objR4);
        }
        java.lang.Object objBI2 = defpackage.den.bI(pbVar, (defpackage.aonj) objR4, cavVar);
        if (!(kkkVar instanceof defpackage.kki)) {
            cbtVar.W(false);
            return;
        }
        java.lang.Object obj2 = defpackage.aojh.a;
        boolean zB = cavVar.B(ccpVar) | cavVar.D(this);
        java.lang.Object objR5 = cbtVar.R();
        if (zB || objR5 == obj) {
            objR5 = new defpackage.rox(this, ccpVar, (defpackage.aoln) null, 2);
            cbtVar.ab(objR5);
        }
        defpackage.cbp.g(obj2, (defpackage.aonn) objR5, cavVar);
        defpackage.cmw cmwVarD = defpackage.azm.d(cmwVar, 1.0f);
        defpackage.cye cyeVarB = defpackage.awo.b(defpackage.cmh.a, false);
        long j = cbtVar.x;
        long j2 = j ^ (j >>> 32);
        defpackage.cje cjeVarAi = cbtVar.ai();
        defpackage.cmw cmwVarM = defpackage.cfo.m(cavVar, cmwVarD);
        defpackage.aomy aomyVar2 = defpackage.dam.a;
        cavVar.v();
        if (cbtVar.w) {
            cavVar.j(aomyVar2);
        } else {
            cavVar.x();
        }
        defpackage.cev.c(cavVar, cyeVarB, defpackage.dam.e);
        defpackage.cev.c(cavVar, cjeVarAi, defpackage.dam.d);
        defpackage.cev.c(cavVar, java.lang.Integer.valueOf((int) j2), defpackage.dam.f);
        cavVar.i(obj2, new defpackage.bae(defpackage.dam.g, 7));
        defpackage.cev.c(cavVar, cmwVarM, defpackage.dam.c);
        defpackage.ttj ttjVar = (defpackage.ttj) ((defpackage.kki) kkkVar).a;
        java.lang.Object objA = this.e.a();
        defpackage.aooh.e(objA, "get(...)");
        boolean zBooleanValue = ((java.lang.Boolean) objA).booleanValue();
        java.lang.Object objA2 = this.f.a();
        defpackage.aooh.e(objA2, "get(...)");
        boolean zBooleanValue2 = ((java.lang.Boolean) objA2).booleanValue();
        java.lang.Object objA3 = this.g.a();
        defpackage.aooh.e(objA3, "get(...)");
        boolean zBooleanValue3 = ((java.lang.Boolean) objA3).booleanValue();
        java.lang.Object objA4 = this.h.a();
        defpackage.aooh.e(objA4, "get(...)");
        boolean zBooleanValue4 = ((java.lang.Boolean) objA4).booleanValue();
        boolean zD3 = cavVar.D(objBI2);
        java.lang.Object objR6 = cbtVar.R();
        if (zD3 || objR6 == obj) {
            objR6 = new defpackage.uob(objBI2, 1);
            cbtVar.ab(objR6);
        }
        defpackage.aomy aomyVar3 = (defpackage.aomy) objR6;
        boolean zD4 = cavVar.D(objBI);
        java.lang.Object objR7 = cbtVar.R();
        if (zD4 || objR7 == obj) {
            objR7 = new defpackage.uob(objBI, 0);
            cbtVar.ab(objR7);
        }
        defpackage.unb unbVar = this.b;
        defpackage.aomy aomyVar4 = (defpackage.aomy) objR7;
        boolean zD5 = cavVar.D(unbVar);
        java.lang.Object objR8 = cbtVar.R();
        if (zD5 || objR8 == obj) {
            objR8 = new defpackage.uoc(unbVar);
            cbtVar.ab(objR8);
        }
        defpackage.aonj aonjVar = (defpackage.aonj) objR8;
        boolean zD6 = cavVar.D(unbVar);
        java.lang.Object objR9 = cbtVar.R();
        if (zD6 || objR9 == obj) {
            objR9 = new defpackage.dsm(unbVar, 8, (char[][]) null);
            cbtVar.ab(objR9);
        }
        defpackage.aonj aonjVar2 = (defpackage.aonj) objR9;
        boolean zD7 = cavVar.D(unbVar);
        java.lang.Object objR10 = cbtVar.R();
        if (zD7 || objR10 == obj) {
            objR10 = new defpackage.ded((java.lang.Object) unbVar, 8, (char[][]) null);
            cbtVar.ab(objR10);
        }
        defpackage.aomy aomyVar5 = (defpackage.aomy) objR10;
        if (this.l.g().isEmpty()) {
            cavVar.u(621256661);
            boolean zD8 = cavVar.D(this) | cavVar.D(context) | cavVar.D(aossVar) | cavVar.B(nfVar) | cavVar.B(string);
            java.lang.Object objR11 = cbtVar.R();
            if (zD8 || objR11 == obj) {
                objR11 = new dqu(this, context, aossVar, nfVar, string, 5);
                cbtVar.ab(objR11);
            }
            cbtVar.W(false);
            aomyVar = (defpackage.aomy) objR11;
        } else {
            aomyVar5 = aomyVar5;
            cavVar.u(621784405);
            cbtVar.W(false);
            aomyVar = null;
        }
        boolean zD9 = cavVar.D(unbVar);
        java.lang.Object objR12 = cbtVar.R();
        if (zD9 || objR12 == obj) {
            objR12 = new defpackage.gfx(unbVar, 2, (char[]) null);
            cbtVar.ab(objR12);
        }
        defpackage.aonn aonnVar = (defpackage.aonn) objR12;
        boolean zD10 = cavVar.D(unbVar);
        java.lang.Object objR13 = cbtVar.R();
        if (zD10 || objR13 == obj) {
            objR13 = new defpackage.ded((java.lang.Object) unbVar, 9, (short[][]) null);
            cbtVar.ab(objR13);
        }
        defpackage.aomy aomyVar6 = (defpackage.aomy) objR13;
        boolean zD11 = cavVar.D(unbVar);
        java.lang.Object objR14 = cbtVar.R();
        if (zD11 || objR14 == obj) {
            objR14 = new defpackage.ded(unbVar, 10, (int[][]) null);
            cbtVar.ab(objR14);
        }
        defpackage.aomy aomyVar7 = (defpackage.aomy) objR14;
        boolean zD12 = cavVar.D(this);
        java.lang.Object objR15 = cbtVar.R();
        if (zD12 || objR15 == obj) {
            objR15 = new defpackage.uob(this, 2);
            cbtVar.ab(objR15);
        }
        defpackage.aomy aomyVar8 = aomyVar5;
        defpackage.aais.aK(ttjVar, z, zBooleanValue, zBooleanValue2, zBooleanValue3, zBooleanValue4, aomyVar3, aomyVar4, aonjVar, aonjVar2, aomyVar8, aomyVar, aonnVar, aomyVar6, aomyVar7, (defpackage.aomy) objR15, cavVar, i & 112, 0, 0);
        cbtVar.W(true);
        cbtVar.W(false);
    }
}
