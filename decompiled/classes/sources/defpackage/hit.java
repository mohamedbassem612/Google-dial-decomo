package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class hit implements defpackage.amyz {
    private final him a;
    private final int b;
    private final defpackage.hkh c;
    private final defpackage.hkk d;

    public hit(him himVar, defpackage.hkh hkhVar, defpackage.hkk hkkVar, int i) {
        this.a = himVar;
        this.c = hkhVar;
        this.d = hkkVar;
        this.b = i;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afeb */
    @Override // defpackage.aoin, defpackage.aoim
    public final java.lang.Object a() throws afeb {
        int i = this.b;
        if (i == 0) {
            him himVar = this.a;
            android.content.Context context = (android.content.Context) himVar.s.a();
            defpackage.hkk hkkVar = this.d;
            defpackage.zzx zzxVar = new defpackage.zzx(hkkVar.b);
            defpackage.zzx zzxVar2 = new defpackage.zzx(hkkVar.c);
            him himVar2 = hkkVar.a;
            tgq tgqVar = new tgq(zzxVar2, (defpackage.aolr) himVar2.ca.a(), (defpackage.ruc) himVar2.eK.a());
            hip hipVar = himVar.a;
            defpackage.zjm zjmVarCf = hipVar.cf();
            defpackage.aazc aazcVar = (defpackage.aazc) himVar.l.a();
            defpackage.aoss aossVar = (defpackage.aoss) hkkVar.e.a();
            defpackage.aooh.f(aossVar, "internalFragmentRetainedCoroutineScope");
            defpackage.afec.c();
            defpackage.aooc.ap(aossVar);
            return new thj(context, zzxVar, tgqVar, zjmVarCf, aazcVar, aossVar, (defpackage.aolr) himVar.ca.a(), (tez) hipVar.eP.a(), (defpackage.ruc) himVar.eK.a(), himVar.dT());
        }
        if (i == 1) {
            hip hipVar2 = this.a.a;
            return defpackage.aihd.u(hipVar2.bw(), hipVar2.bB(), hipVar2.bS(), hipVar2.bH(), hipVar2.bx());
        }
        if (i != 2) {
            if (i != 3) {
                return new defpackage.amxh();
            }
            defpackage.aolr aolrVar = (defpackage.aolr) this.c.d.a();
            defpackage.amxh amxhVar = (defpackage.amxh) this.d.d.a();
            defpackage.aooh.f(aolrVar, "mainImmediateContext");
            defpackage.aooh.f(amxhVar, "fragmentRetainedLifecycle");
            defpackage.aoss aossVarN = defpackage.aosv.n(aolrVar.plus(new defpackage.aovh(null)));
            amxhVar.a(new agwe(aossVarN, 1));
            return aossVarN;
        }
        hip hipVar3 = this.a.a;
        him himVar3 = hipVar3.a;
        defpackage.teh tehVarCf = himVar3.cf();
        defpackage.zjm zjmVar = new defpackage.zjm((defpackage.aoin) new jsp(new kkn(himVar3.sa(), (kkl) himVar3.oP.a()), 12), (defpackage.zcs) new jnz(tehVarCf, 10));
        defpackage.teh tehVarCf2 = himVar3.cf();
        defpackage.teh tehVarCf3 = himVar3.cf();
        defpackage.rln rlnVar = (defpackage.rln) himVar3.eM.a();
        defpackage.aooh.f(rlnVar, "snapshot");
        defpackage.rkx rkxVar = defpackage.rkz.e;
        defpackage.rky rkyVar = defpackage.rkz.c;
        defpackage.ipc ipcVar = new defpackage.ipc(defpackage.gus.ai(defpackage.gus.aa(defpackage.gus.ab(defpackage.gus.ac(defpackage.gus.Z(rkxVar, 33)), defpackage.gus.aa(defpackage.gus.ac(defpackage.gus.Z(rkxVar, 30)), defpackage.gus.W(defpackage.rkz.b, "Google"), defpackage.gus.ab(defpackage.gus.Y(rkyVar, "T"), defpackage.gus.Y(rkyVar, "MASTER")))), defpackage.gus.ac(defpackage.gus.X(defpackage.rkz.d, "zh")))));
        defpackage.amyz amyzVar = hipVar3.kV;
        lvx lvxVarS = hipVar3.s();
        htw htwVar = (htw) amyzVar.a();
        lvx lvxVarS2 = hipVar3.s();
        defpackage.aazc aazcVar2 = (defpackage.aazc) himVar3.l.a();
        defpackage.rlv rlvVar = (defpackage.rlv) himVar3.fq.a();
        java.util.List list = ypj.a;
        lvx lwfVar = new lwf(htwVar, lvxVarS2, aazcVar2, rlvVar, hipVar3.N(), (defpackage.lvs) himVar3.oS.a(), hipVar3.eR);
        java.lang.Boolean bool = (java.lang.Boolean) tehVarCf3.b.a();
        ((defpackage.aimw) ((defpackage.aimw) defpackage.teh.a.b()).g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/search/NewSearchEnabledFn", "isAppSearchEnabled", 31, "NewSearchEnabledFn.kt")).y("app search enabled: %s", bool);
        defpackage.aooh.c(bool);
        if (bool.booleanValue() && defpackage.gus.aU(ipcVar, rlnVar)) {
            ((defpackage.aimw) ((defpackage.aimw) lww.a.b()).g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/contactsearch/SearchModule", "provideContactDataSource", 37, "SearchModule.kt")).v("App search compatible device.");
            lvxVarS = lwfVar;
        }
        defpackage.zjm zjmVar2 = new defpackage.zjm((defpackage.aoin) new lwt(lvxVarS, 2), (defpackage.zcs) new len(tehVarCf2, 11));
        defpackage.teh tehVarCf4 = himVar3.cf();
        defpackage.zjm zjmVar3 = new defpackage.zjm((defpackage.aoin) new lwt(new lxh(hipVar3.L()), 5), (defpackage.zcs) new len(tehVarCf4, 15));
        defpackage.teh tehVarCf5 = himVar3.cf();
        defpackage.zjm zjmVar4 = new defpackage.zjm((defpackage.aoin) new lwt(new lwo((android.content.Context) himVar3.s.a(), (defpackage.ojo) himVar3.oF.a(), (defpackage.ajct) himVar3.L.a(), hipVar3.kW), 3), (defpackage.zcs) new len(tehVarCf5, 13));
        defpackage.teh tehVarCf6 = himVar3.cf();
        return defpackage.aihd.u(zjmVar, zjmVar2, zjmVar3, zjmVar4, new defpackage.zjm((defpackage.aoin) new uir(new utl(hipVar3.ce()), 8), (defpackage.zcs) new jhz(tehVarCf6, himVar3.cJ(), 14)));
    }
}
