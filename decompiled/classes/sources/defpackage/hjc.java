package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class hjc implements defpackage.amyz {
    public final him a;
    private final int b;
    private final defpackage.hkh c;
    private final defpackage.hkg d;
    private final defpackage.hko e;

    public hjc(him himVar, defpackage.hkh hkhVar, defpackage.hkg hkgVar, defpackage.hko hkoVar, int i) {
        this.a = himVar;
        this.c = hkhVar;
        this.d = hkgVar;
        this.e = hkoVar;
        this.b = i;
    }

    @Override // defpackage.aoin, defpackage.aoim
    public final java.lang.Object a() {
        ahfe raiVar;
        agmv agmtVar;
        defpackage.agtj agtjVarCX;
        int i = 2;
        switch (this.b) {
            case 0:
                raiVar = new rai(this, (byte[]) null);
                break;
            case 1:
                raiVar = new rai(this);
                break;
            case 2:
                raiVar = new defpackage.zzx(this.e.e);
                break;
            case 3:
                hip hipVar = this.a.a;
                him himVar = hipVar.a;
                defpackage.wyc wycVarDt = himVar.dt();
                defpackage.amyz amyzVar = hipVar.gC;
                j$.util.Objects.requireNonNull(wycVarDt);
                defpackage.zjm zjmVar = new defpackage.zjm((defpackage.aoin) amyzVar, (defpackage.zcs) new wks(wycVarDt, 7));
                defpackage.iqm iqmVarE = himVar.E();
                defpackage.amyz amyzVar2 = hipVar.gF;
                if (amyzVar2 == null) {
                    defpackage.aooh.i("controller");
                }
                defpackage.zjm zjmVar2 = new defpackage.zjm((defpackage.aoin) amyzVar2, (defpackage.zcs) new hle(iqmVarE, 12));
                jnn jnnVarP = himVar.P();
                defpackage.amyz amyzVar3 = himVar.sN;
                defpackage.amyz amyzVar4 = hipVar.gG;
                if (amyzVar3 == null) {
                    defpackage.aooh.i("useHeadsetAsDefaultEnabledState");
                }
                if (amyzVar4 == null) {
                    defpackage.aooh.i("controller");
                }
                defpackage.zjm zjmVar3 = new defpackage.zjm((defpackage.aoin) amyzVar4, (defpackage.zcs) new jhz(jnnVarP, amyzVar3, 2));
                defpackage.amyz amyzVar5 = himVar.tf;
                defpackage.amyz amyzVar6 = hipVar.gH;
                if (amyzVar5 == null) {
                    defpackage.aooh.i("enableIncomingCallGesturePostCallBottomSheet");
                }
                if (amyzVar6 == null) {
                    defpackage.aooh.i("controller");
                }
                defpackage.zjm zjmVar4 = new defpackage.zjm((defpackage.aoin) amyzVar6, (defpackage.zcs) new odv(amyzVar5, 17));
                kuw kuwVarAe = himVar.ae();
                defpackage.amyz amyzVar7 = hipVar.gI;
                if (amyzVar7 == null) {
                    defpackage.aooh.i("controller");
                }
                defpackage.zjm zjmVar5 = new defpackage.zjm((defpackage.aoin) amyzVar7, (defpackage.zcs) new kpr(kuwVarAe, 10));
                defpackage.whh whhVarDr = himVar.dr();
                defpackage.amyz amyzVar8 = hipVar.gJ;
                j$.util.Objects.requireNonNull(whhVarDr);
                defpackage.zjm zjmVar6 = new defpackage.zjm((defpackage.aoin) amyzVar8, (defpackage.zcs) new uzh(whhVarDr, 19));
                defpackage.zjm[] zjmVarArr = new defpackage.zjm[1];
                defpackage.tkk tkkVarCj = himVar.cj();
                defpackage.amyz amyzVar9 = hipVar.gK;
                if (amyzVar9 == null) {
                    defpackage.aooh.i("controller");
                }
                zjmVarArr[0] = new defpackage.zjm((defpackage.aoin) amyzVar9, (defpackage.zcs) new tee(tkkVarCj, 7));
                return defpackage.aihd.v(zjmVar, zjmVar2, zjmVar3, zjmVar4, zjmVar5, zjmVar6, zjmVarArr);
            case 4:
                hip hipVar2 = this.a.a;
                defpackage.zjm zjmVar7 = new defpackage.zjm((defpackage.aoin) hipVar2.gO, (defpackage.zcs) new defpackage.vkc(2));
                defpackage.amyz amyzVar10 = hipVar2.gP;
                uym uymVarCK = hipVar2.a.cK();
                j$.util.Objects.requireNonNull(uymVarCK);
                return defpackage.aihd.r(zjmVar7, new defpackage.zjm((defpackage.aoin) amyzVar10, (defpackage.zcs) new uzh(uymVarCK, 0)));
            case 5:
                defpackage.hkh hkhVar = this.c;
                return defpackage.aihd.t(new defpackage.zjm((defpackage.aoin) new defpackage.rmg(hkhVar.f, i), (defpackage.zcs) new defpackage.vkc(2)), new defpackage.zjm((defpackage.aoin) hkhVar.q, (defpackage.zcs) new defpackage.vkc(2)), new defpackage.zjm((defpackage.aoin) new defpackage.rmg(hkhVar.r, 4), (defpackage.zcs) new defpackage.vkc(2)), new defpackage.zjm((defpackage.aoin) this.d.i, (defpackage.zcs) new defpackage.vkc(2)));
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                raiVar = new defpackage.zzx(defpackage.amzb.a);
                break;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                hip hipVar3 = this.a.a;
                defpackage.meo meoVarAz = hipVar3.a.az();
                defpackage.amyz amyzVar11 = hipVar3.gV;
                if (amyzVar11 == null) {
                    defpackage.aooh.i("impl");
                }
                return new defpackage.aile(new defpackage.zjm((defpackage.aoin) amyzVar11, (defpackage.zcs) new meu(meoVarAz, 0)));
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.hko hkoVar = this.e;
                defpackage.aigb aigbVar = new defpackage.aigb(6);
                him himVar2 = hkoVar.b;
                aigbVar.i(uty.b, himVar2.kd());
                aigbVar.i(uty.h, himVar2.kl());
                aigbVar.i(uty.e, himVar2.kx());
                aigbVar.i(uty.f, himVar2.kV());
                aigbVar.i(uty.d, himVar2.ms());
                aigbVar.i(uty.c, himVar2.mk());
                return aigbVar.e(true);
            case 9:
                defpackage.hko hkoVar2 = this.e;
                defpackage.hkg hkgVar = this.d;
                xm xmVar = (xm) hkgVar.n.a();
                defpackage.hkg hkgVar2 = hkoVar2.q;
                defpackage.ahgd ahgdVar = (defpackage.ahgd) hkgVar2.c.a();
                defpackage.ahyn ahynVarD = hkgVar2.d();
                defpackage.amwv amwvVar = hkoVar2.a;
                if (amwvVar == null) {
                    defpackage.aooh.i("screenHost");
                }
                if (ahgdVar == null) {
                    defpackage.aooh.i("fragmentHost");
                }
                int iD = amwvVar.d() - 1;
                if (iD != 0) {
                    agmtVar = iD != 1 ? new agmv(amwvVar.b(), ahgdVar, ahynVarD) : new agmu(amwvVar.e());
                } else {
                    agmtVar = new agmt((defpackage.az) amwvVar.a());
                }
                defpackage.ahyn ahynVarD2 = hkgVar.d();
                agoa agoaVar = (agoa) hkoVar2.o.a();
                defpackage.amyz amyzVar12 = hkgVar2.p;
                if (amwvVar == null) {
                    defpackage.aooh.i("screenHost");
                }
                int iD2 = amwvVar.d() - 1;
                if (iD2 == 0 || iD2 == 1) {
                    java.lang.Object objA = amyzVar12.a();
                    defpackage.aooh.e(objA, "get(...)");
                    agtjVarCX = (defpackage.agtj) objA;
                } else {
                    agtjVarCX = ((defpackage.agmw) defpackage.aooc.ar(amwvVar.b(), defpackage.agmw.class)).cX();
                }
                defpackage.agtj agtjVar = agtjVarCX;
                if (agtjVar == null) {
                    throw new java.lang.NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                }
                apjb apjbVar = (apjb) hkoVar2.l.a();
                agom agomVar = (agom) hkgVar.o.a();
                him himVar3 = this.a;
                return new agnc(amwvVar, xmVar, agmtVar, ahynVarD2, agoaVar, agtjVar, apjbVar, agomVar, (abtr) himVar3.a.he.a(), (agno) himVar3.AD.a(), (defpackage.ahyn) ((defpackage.amyw) hkoVar2.m).b, new defpackage.ahys(java.lang.Boolean.TRUE));
            case 10:
                defpackage.hko hkoVar3 = this.e;
                return new agoa(hkoVar3.a, (apjb) hkoVar3.l.a(), (agom) this.d.o.a(), (defpackage.ahyn) ((defpackage.amyw) hkoVar3.m).b, (ahfe) hkoVar3.n.a());
            case 11:
                return new apjb(new defpackage.aile((agnu) this.e.b.a.hb.a()));
            default:
                defpackage.hkg hkgVar3 = this.d;
                raiVar = new ahfe((defpackage.ahgd) hkgVar3.c.a(), this.e.a, new aprf(hkgVar3.d(), (byte[]) null));
                break;
        }
        return raiVar;
    }
}
