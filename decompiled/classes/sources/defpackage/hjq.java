package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class hjq implements defpackage.amyz {
    public final him a;
    public final defpackage.hkt b;
    private final int c;
    private final defpackage.hkh d;

    public hjq(him himVar, defpackage.hkh hkhVar, defpackage.hkt hktVar, int i) {
        this.a = himVar;
        this.d = hkhVar;
        this.b = hktVar;
        this.c = i;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afeb */
    @Override // defpackage.aoin, defpackage.aoim
    public final java.lang.Object a() throws afeb {
        jlq agmzVar;
        afow jzuVar;
        java.lang.Object agtnVar;
        switch (this.c) {
            case 0:
                defpackage.hkt hktVar = this.b;
                agmzVar = new agmz(hktVar.a, hktVar.d);
                return agmzVar;
            case 1:
                defpackage.hkh hkhVar = this.d;
                defpackage.gou gouVar = (defpackage.gou) hkhVar.K.a();
                defpackage.kgl kglVar = (defpackage.kgl) hkhVar.F.a();
                defpackage.kgl kglVar2 = (defpackage.kgl) hkhVar.B.a();
                defpackage.aogc aogcVar = (defpackage.aogc) hkhVar.P.a();
                defpackage.hkt hktVar2 = this.b;
                defpackage.gou gouVar2 = (defpackage.gou) hktVar2.w.K.a();
                him himVar = hktVar2.c;
                hip hipVar = himVar.a;
                defpackage.rsr rsrVar = (defpackage.rsr) hipVar.hZ.a();
                android.content.Context context = (android.content.Context) himVar.s.a();
                defpackage.ajct ajctVar = (defpackage.ajct) himVar.L.a();
                defpackage.ajct ajctVar2 = (defpackage.ajct) himVar.r.a();
                java.lang.Object objAB = hipVar.aB();
                defpackage.jzn jznVar = new defpackage.jzn(gouVar2, rsrVar, new defpackage.jys(context, ajctVar, ajctVar2, (defpackage.tuz) objAB, himVar.bz(), (defpackage.ojo) himVar.oF.a(), (defpackage.jyu) hipVar.dA.a(), himVar.vq), himVar.oV(), (defpackage.nwu) himVar.va.a(), himVar.my(), himVar.jC(), (defpackage.rlv) himVar.fq.a(), (defpackage.gpd) himVar.fD.a(), himVar.mZ(), (defpackage.aoss) himVar.cb.a());
                defpackage.kaw kawVar = new defpackage.kaw(new defpackage.zzx(hktVar2.f));
                defpackage.ahda ahdaVarCt = this.a.a.ct();
                hkhVar.b();
                jzuVar = new defpackage.jzu(gouVar, kglVar, kglVar2, aogcVar, jznVar, kawVar, ahdaVarCt);
                return jzuVar;
            case 2:
                hip hipVar2 = this.a.a;
                him himVar2 = hipVar2.a;
                defpackage.zjm zjmVar = new defpackage.zjm((defpackage.aoin) new defpackage.jrm(new defpackage.kax((defpackage.ruc) himVar2.eK.a(), (defpackage.gpd) himVar2.fD.a()), 7), (defpackage.zcs) new defpackage.vkc(2));
                defpackage.kai kaiVar = (defpackage.kai) hipVar2.jm.a();
                if (kaiVar == null) {
                    defpackage.aooh.i("impl");
                }
                defpackage.zjm zjmVar2 = new defpackage.zjm((defpackage.aoin) new defpackage.jrm(kaiVar, 6), (defpackage.zcs) new defpackage.vkc(2));
                android.content.Context context2 = (android.content.Context) himVar2.s.a();
                defpackage.ajct ajctVar3 = (defpackage.ajct) himVar2.L.a();
                defpackage.ajct ajctVar4 = (defpackage.ajct) himVar2.r.a();
                java.lang.Object objAB2 = hipVar2.aB();
                defpackage.zjm zjmVar3 = new defpackage.zjm((defpackage.aoin) new defpackage.jrm(new defpackage.jyt(new defpackage.jys(context2, ajctVar3, ajctVar4, (defpackage.tuz) objAB2, himVar2.bz(), (defpackage.ojo) himVar2.oF.a(), (defpackage.jyu) hipVar2.dA.a(), himVar2.vq)), 5), (defpackage.zcs) new defpackage.vkc(2));
                defpackage.hkh hkhVar2 = this.d;
                defpackage.gpd gpdVar = (defpackage.gpd) hkhVar2.I.a();
                him himVar3 = hkhVar2.b;
                hip hipVar3 = himVar3.a;
                defpackage.uof uofVar = new defpackage.uof(gpdVar, (defpackage.rsr) hipVar3.kq.a(), himVar3.dT(), (defpackage.aoss) himVar3.cb.a(), hipVar3.ev, hipVar3.eZ);
                defpackage.amyz amyzVar = hipVar3.ev;
                if (amyzVar == null) {
                    defpackage.aooh.i("enableUpdateShortcuts");
                }
                return defpackage.aihd.t(zjmVar, zjmVar2, zjmVar3, new defpackage.zjm((defpackage.aoin) new defpackage.uoe(uofVar, 0), (defpackage.zcs) new defpackage.sxz(amyzVar, 8)));
            case 3:
                return new agyt();
            case 4:
                agmzVar = new agoi(this.b.a);
                return agmzVar;
            case 5:
                defpackage.hkt hktVar3 = this.b;
                him himVar4 = this.a;
                agtnVar = new defpackage.agtn(hktVar3.a, (android.content.Context) himVar4.s.a(), (defpackage.ajcu) himVar4.aN.a());
                return agtnVar;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.hkt hktVar4 = this.b;
                agmzVar = new afov((defpackage.aoss) hktVar4.l.a(), (aprf) hktVar4.n.a(), (defpackage.afsq) hktVar4.p.a(), hktVar4.a);
                return agmzVar;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.hkt hktVar5 = this.b;
                defpackage.aolr aolrVar = (defpackage.aolr) hktVar5.k.a();
                if (aolrVar == null) {
                    defpackage.aooh.i("mainImmediateContext");
                }
                defpackage.amww amwwVar = hktVar5.b;
                if (amwwVar == null) {
                    defpackage.aooh.i("viewModelLifecycle");
                }
                defpackage.afec.c();
                defpackage.aovh aovhVar = new defpackage.aovh(null);
                amwwVar.a(new agwe(aovhVar, 0));
                return defpackage.aosv.n(aolrVar.plus(aovhVar));
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                him himVar5 = this.a;
                defpackage.zzx zzxVarPv = himVar5.pv();
                him.iM();
                defpackage.ajcu ajcuVar = (defpackage.ajcu) himVar5.aN.a();
                defpackage.aolr aolrVar2 = (defpackage.aolr) himVar5.bn.a();
                defpackage.ahwt ahwtVar = defpackage.ahwt.a;
                return achr.l(zzxVarPv, ajcuVar, aolrVar2, ahwtVar, (defpackage.ahyn) himVar5.i.a(), ahwtVar);
            case 9:
                agmzVar = new aprf(this);
                return agmzVar;
            case 10:
                agmzVar = new rai(this, (byte[]) null);
                return agmzVar;
            case 11:
                agmzVar = new hjp(this);
                return agmzVar;
            case 12:
                agmzVar = new rai(this);
                return agmzVar;
            case 13:
                return new ahaa();
            case 14:
                defpackage.aazc aazcVar = (defpackage.aazc) this.a.l.a();
                defpackage.hkt hktVar6 = this.b;
                jzuVar = new afow(aazcVar, hktVar6.c(), hktVar6.a);
                return jzuVar;
            case 15:
                defpackage.hkt hktVar7 = this.b;
                agmzVar = new jlq((defpackage.aoss) hktVar7.l.a(), new defpackage.zzx(hktVar7.t), hktVar7.a);
                return agmzVar;
            case 16:
                hip hipVar4 = this.a.a;
                return defpackage.aigf.l(jmu.b, hipVar4.bQ(), jmu.c, hipVar4.bN());
            default:
                him himVar6 = this.a;
                agtnVar = new defpackage.agyj((defpackage.aazc) himVar6.l.a(), (defpackage.aogc) himVar6.fo.a(), (defpackage.ajcu) himVar6.aN.a());
                return agtnVar;
        }
    }
}
