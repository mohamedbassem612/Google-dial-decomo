package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class hia implements defpackage.amyz {
    public final him a;
    private final int b;
    private final defpackage.hkh c;

    public hia(him himVar, defpackage.hkh hkhVar, int i) {
        this.a = himVar;
        this.c = hkhVar;
        this.b = i;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afeb */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object, vtv] */
    @Override // defpackage.aoin, defpackage.aoim
    public final java.lang.Object a() throws afeb {
        java.lang.Object rpaVar;
        java.lang.Object objPlus;
        java.lang.Object vvzVar;
        int i = 5;
        int i2 = 11;
        int i3 = 6;
        int i4 = 3;
        switch (this.b) {
            case 0:
                return new defpackage.amxh();
            case 1:
                defpackage.hkh hkhVar = this.c;
                defpackage.aile aileVar = new defpackage.aile((defpackage.mid) hkhVar.b.a.gR.a());
                him himVar = this.a;
                rpaVar = new defpackage.rpa(aileVar, himVar.a.cc(), (defpackage.aazc) himVar.l.a(), himVar.be(), (defpackage.aogc) himVar.fo.a(), (defpackage.apni) himVar.eY.a(), hkhVar.b(), (defpackage.aolr) himVar.ca.a(), (defpackage.aolr) himVar.bY.a());
                return rpaVar;
            case 2:
                defpackage.hkh hkhVar2 = this.c;
                defpackage.aolr aolrVar = (defpackage.aolr) hkhVar2.d.a();
                defpackage.zzx zzxVarI = hkhVar2.i();
                if (aolrVar == null) {
                    defpackage.aooh.i("mainImmediateContext");
                }
                return zzxVarI.w(aolrVar);
            case 3:
                defpackage.ajcu ajcuVar = (defpackage.ajcu) this.a.aN.a();
                if (ajcuVar == null) {
                    defpackage.aooh.i("uiThreadExecutor");
                }
                objPlus = new defpackage.agwb(new defpackage.aotu(new defpackage.agwc(ajcuVar))).plus(defpackage.agvw.a).plus(defpackage.ahre.b(null, 3));
                if (objPlus == null) {
                    throw new java.lang.NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                }
                return objPlus;
            case 4:
                defpackage.rpj rpjVar = (defpackage.rpj) this.c.p.a();
                him himVar2 = this.a;
                return new defpackage.rpk(rpjVar, (defpackage.agsm) himVar2.aT.a(), (defpackage.gpd) himVar2.fD.a(), (defpackage.rlv) himVar2.fq.a());
            case 5:
                defpackage.hkh hkhVar3 = this.c;
                defpackage.zzx zzxVarG = hkhVar3.g();
                defpackage.zzx zzxVar = new defpackage.zzx(hkhVar3.n);
                defpackage.rpa rpaVar2 = (defpackage.rpa) hkhVar3.f.a();
                him himVar3 = this.a;
                defpackage.aogc aogcVar = (defpackage.aogc) himVar3.fo.a();
                defpackage.agab agabVarRX = himVar3.rX();
                defpackage.apni apniVar = (defpackage.apni) himVar3.eY.a();
                defpackage.aoss aossVar = (defpackage.aoss) himVar3.cb.a();
                defpackage.aoss aossVarB = hkhVar3.b();
                defpackage.zzx zzxVar2 = new defpackage.zzx(hkhVar3.o);
                himVar3.gq();
                return new defpackage.rpj(zzxVarG, zzxVar, rpaVar2, aogcVar, agabVarRX, apniVar, aossVar, aossVarB, zzxVar2);
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.hkh hkhVar4 = this.c;
                defpackage.roc rocVar = defpackage.roc.CALL_LOG_TAB_KEY;
                defpackage.kcq kcqVar = (defpackage.kcq) hkhVar4.h.a();
                him himVar4 = hkhVar4.b;
                defpackage.zjm zjmVar = new defpackage.zjm((defpackage.aoin) new defpackage.jrm(new defpackage.kil(kcqVar, (defpackage.ahpz) himVar4.bb.a(), (defpackage.apni) himVar4.eY.a(), (defpackage.aoss) hkhVar4.g.a(), (defpackage.ajct) himVar4.r.a(), himVar4.vq), 9), (defpackage.zcs) new defpackage.vkc(2));
                defpackage.roc rocVar2 = defpackage.roc.CHOCOLATE_CHIP_KEY;
                final defpackage.lnz lnzVarAv = himVar4.av();
                final int i5 = 13;
                defpackage.zjm zjmVar2 = new defpackage.zjm((defpackage.aoin) hkhVar4.i, new defpackage.zcs() { // from class: isk
                    /* JADX WARN: Type inference failed for: r2v22, types: [aoin, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r2v28, types: [aoin, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r2v38, types: [aoin, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r2v52, types: [aoin, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r2v56, types: [aoin, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r2v60, types: [aoin, java.lang.Object] */
                    @Override // defpackage.zcs
                    public final boolean a() {
                        switch (i5) {
                            case 0:
                                return ((defpackage.iqm) lnzVarAv).b();
                            case 1:
                                return defpackage.kcq.C((defpackage.iqm) lnzVarAv);
                            case 2:
                                return ((defpackage.iqm) lnzVarAv).f();
                            case 3:
                                return ((defpackage.iqm) lnzVarAv).d();
                            case 4:
                                return ((defpackage.iqm) lnzVarAv).e();
                            case 5:
                                return ((defpackage.jsa) lnzVarAv).a();
                            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                                return ((defpackage.jsa) lnzVarAv).a();
                            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                                return !((java.lang.Boolean) lnzVarAv.a()).booleanValue();
                            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                                ?? r2 = lnzVarAv;
                                if (r2 == 0) {
                                    defpackage.aooh.i("<this>");
                                }
                                return ((java.lang.Boolean) r2.a()).booleanValue();
                            case 9:
                                return ((defpackage.kuz) lnzVarAv).a();
                            case 10:
                                return ((defpackage.kvw) lnzVarAv).a();
                            case 11:
                                return ((java.lang.Boolean) lnzVarAv.a()).booleanValue();
                            case 12:
                                return ((j$.util.Optional) lnzVarAv).isPresent();
                            case 13:
                                return ((defpackage.lnz) lnzVarAv).a();
                            case 14:
                                return ((defpackage.zjm) lnzVarAv).g().isEmpty();
                            case 15:
                                ?? r3 = lnzVarAv;
                                if (r3 == 0) {
                                    defpackage.aooh.i("<this>");
                                }
                                return ((java.lang.Boolean) r3.a()).booleanValue();
                            case 16:
                                ?? r4 = lnzVarAv;
                                if (r4 == 0) {
                                    defpackage.aooh.i("<this>");
                                }
                                return ((java.lang.Boolean) r4.a()).booleanValue();
                            case 17:
                                ?? r5 = lnzVarAv;
                                if (r5 == 0) {
                                    defpackage.aooh.i("<this>");
                                }
                                return ((java.lang.Boolean) r5.a()).booleanValue();
                            case 18:
                                return ((defpackage.meo) lnzVarAv).a();
                            case 19:
                                return ((defpackage.nym) lnzVarAv).a();
                            default:
                                return ((defpackage.one) lnzVarAv).a();
                        }
                    }
                });
                defpackage.roc rocVar3 = defpackage.roc.DIALPAD_KEY;
                defpackage.zjm zjmVar3 = new defpackage.zjm((defpackage.aoin) new defpackage.rmg(new defpackage.rqt((defpackage.aiyy) hkhVar4.j.a(), himVar4.cf()), i4), (defpackage.zcs) new defpackage.vkc(2));
                defpackage.roc rocVar4 = defpackage.roc.VISUAL_VOICEMAIL_TAB_KEY;
                defpackage.vvp vvpVar = (defpackage.vvp) hkhVar4.l.a();
                if (vvpVar == null) {
                    defpackage.aooh.i("voicemailMainScreenFeatureProvider");
                }
                return defpackage.aigf.n(rocVar, zjmVar, rocVar2, zjmVar2, rocVar3, zjmVar3, rocVar4, new defpackage.zjm((defpackage.aoin) new defpackage.vfy(vvpVar, i2), (defpackage.zcs) new defpackage.vkc(2)));
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                him himVar5 = this.a;
                himVar5.dT();
                defpackage.ojo ojoVar = (defpackage.ojo) himVar5.oF.a();
                hip hipVar = himVar5.a;
                hipVar.cd();
                return new defpackage.kcq(ojoVar, (defpackage.apni) himVar5.eY.a(), (defpackage.aolr) himVar5.ca.a(), (defpackage.aoss) this.c.g.a(), hipVar.gS);
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.aolr aolrVar2 = (defpackage.aolr) this.a.bn.a();
                defpackage.zzx zzxVarI2 = this.c.i();
                if (aolrVar2 == null) {
                    defpackage.aooh.i("mainContext");
                }
                return zzxVarI2.w(aolrVar2);
            case 9:
                return new defpackage.loa();
            case 10:
                return new defpackage.aiyy((char[]) null, (byte[]) null);
            case 11:
                defpackage.hkh hkhVar5 = this.c;
                defpackage.vvz vvzVar2 = (defpackage.vvz) hkhVar5.k.a();
                him himVar6 = this.a;
                return new defpackage.vvp(vvzVar2, (defpackage.ahpz) himVar6.bb.a(), (defpackage.apni) himVar6.eY.a(), (defpackage.ajct) himVar6.r.a(), (defpackage.aoss) hkhVar5.g.a());
            case 12:
                him himVar7 = this.a;
                hip hipVar2 = himVar7.a;
                him himVar8 = hipVar2.a;
                java.lang.Object objGO = himVar8.gO();
                defpackage.ajct ajctVar = (defpackage.ajct) himVar8.r.a();
                himVar8.gL();
                vvzVar = new defpackage.vvz(new defpackage.vtp((defpackage.vze) objGO, ajctVar, himVar8.nd(), (defpackage.zjs) himVar8.cn.a()), (defpackage.vze) himVar7.gO(), himVar7.gL(), himVar7.dT(), hipVar2.cd(), (defpackage.ojo) himVar7.oF.a(), (defpackage.apni) himVar7.eY.a(), (defpackage.afhf) hipVar2.gT.a(), (defpackage.aoss) this.c.g.a(), (defpackage.aolr) himVar7.ca.a(), (defpackage.ajct) himVar7.r.a(), hipVar2.gS, (defpackage.zzx) himVar7.gq());
                return vvzVar;
            case 13:
                defpackage.rnz rnzVar = defpackage.rnz.CLEAR_CALL_HISTORY_NAV_MENU_KEY;
                defpackage.zjm zjmVar4 = new defpackage.zjm((defpackage.aoin) new defpackage.jrm(new defpackage.omc(1), 11), (defpackage.zcs) new defpackage.vkc(2));
                hip hipVar3 = this.a.a;
                him himVar9 = hipVar3.a;
                defpackage.rnz rnzVar2 = defpackage.rnz.CONTACTS_NAV_MENU_KEY;
                defpackage.amyz amyzVar = hipVar3.gU;
                final defpackage.zjm zjmVarMN = himVar9.mN();
                if (amyzVar == null) {
                    defpackage.aooh.i("provider");
                }
                final int i6 = 14;
                return defpackage.aigf.n(rnzVar, zjmVar4, rnzVar2, new defpackage.zjm((defpackage.aoin) amyzVar, new defpackage.zcs() { // from class: isk
                    /* JADX WARN: Type inference failed for: r2v22, types: [aoin, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r2v28, types: [aoin, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r2v38, types: [aoin, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r2v52, types: [aoin, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r2v56, types: [aoin, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r2v60, types: [aoin, java.lang.Object] */
                    @Override // defpackage.zcs
                    public final boolean a() {
                        switch (i6) {
                            case 0:
                                return ((defpackage.iqm) zjmVarMN).b();
                            case 1:
                                return defpackage.kcq.C((defpackage.iqm) zjmVarMN);
                            case 2:
                                return ((defpackage.iqm) zjmVarMN).f();
                            case 3:
                                return ((defpackage.iqm) zjmVarMN).d();
                            case 4:
                                return ((defpackage.iqm) zjmVarMN).e();
                            case 5:
                                return ((defpackage.jsa) zjmVarMN).a();
                            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                                return ((defpackage.jsa) zjmVarMN).a();
                            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                                return !((java.lang.Boolean) zjmVarMN.a()).booleanValue();
                            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                                ?? r2 = zjmVarMN;
                                if (r2 == 0) {
                                    defpackage.aooh.i("<this>");
                                }
                                return ((java.lang.Boolean) r2.a()).booleanValue();
                            case 9:
                                return ((defpackage.kuz) zjmVarMN).a();
                            case 10:
                                return ((defpackage.kvw) zjmVarMN).a();
                            case 11:
                                return ((java.lang.Boolean) zjmVarMN.a()).booleanValue();
                            case 12:
                                return ((j$.util.Optional) zjmVarMN).isPresent();
                            case 13:
                                return ((defpackage.lnz) zjmVarMN).a();
                            case 14:
                                return ((defpackage.zjm) zjmVarMN).g().isEmpty();
                            case 15:
                                ?? r3 = zjmVarMN;
                                if (r3 == 0) {
                                    defpackage.aooh.i("<this>");
                                }
                                return ((java.lang.Boolean) r3.a()).booleanValue();
                            case 16:
                                ?? r4 = zjmVarMN;
                                if (r4 == 0) {
                                    defpackage.aooh.i("<this>");
                                }
                                return ((java.lang.Boolean) r4.a()).booleanValue();
                            case 17:
                                ?? r5 = zjmVarMN;
                                if (r5 == 0) {
                                    defpackage.aooh.i("<this>");
                                }
                                return ((java.lang.Boolean) r5.a()).booleanValue();
                            case 18:
                                return ((defpackage.meo) zjmVarMN).a();
                            case 19:
                                return ((defpackage.nym) zjmVarMN).a();
                            default:
                                return ((defpackage.one) zjmVarMN).a();
                        }
                    }
                }), defpackage.rnz.HELP_AND_FEEDBACK_NAV_MENU_KEY, new defpackage.zjm((defpackage.aoin) new defpackage.jrm(new defpackage.omc(0), 17), (defpackage.zcs) new defpackage.vkc(2)), defpackage.rnz.SETTINGS_NAV_MENU_KEY, new defpackage.zjm((defpackage.aoin) new defpackage.rmg(new defpackage.omc(2), i3), (defpackage.zcs) new defpackage.vkc(2)));
            case 14:
                return new defpackage.aile(new defpackage.zjm((defpackage.aoin) new defpackage.rkv(i), (defpackage.zcs) new defpackage.vkc(2)));
            case 15:
                defpackage.aiyy aiyyVar = (defpackage.aiyy) this.c.j.a();
                him himVar10 = this.a;
                return new defpackage.rrv(aiyyVar, (defpackage.aogc) himVar10.fo.a(), (defpackage.aazc) himVar10.l.a());
            case 16:
                defpackage.hkh hkhVar6 = this.c;
                hkhVar6.b();
                return new sjl((defpackage.enr) hkhVar6.s.a(), this.a.a.gW);
            case 17:
                defpackage.hkh hkhVar7 = this.c;
                defpackage.ajsz.dF();
                defpackage.amxw amxwVar = hkhVar7.a;
                boolean z = amxwVar.c;
                defpackage.enr enrVar = amxwVar.b;
                if (enrVar != null) {
                    objPlus = enrVar;
                } else {
                    defpackage.eoq eoqVar = amxwVar.a;
                    if (eoqVar == null) {
                        throw new java.lang.NullPointerException("The first access to SavedStateHandle should happen between super.onCreate() and super.onDestroy()");
                    }
                    defpackage.eos eosVar = new defpackage.eos(eoqVar);
                    eosVar.b(defpackage.env.c, android.os.Bundle.EMPTY);
                    amxwVar.a = eosVar;
                    amxwVar.b = defpackage.env.a(amxwVar.a);
                    amxwVar.a = null;
                    objPlus = amxwVar.b;
                }
                if (objPlus == null) {
                    throw new java.lang.NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                }
                return objPlus;
            case 18:
                return new agze((byte[]) null);
            case 19:
                return new defpackage.uqz((defpackage.aoss) this.a.cb.a());
            case 20:
                return new kgo(this.c.f(), (defpackage.aoss) this.a.cb.a());
            case 21:
                defpackage.hkh hkhVar8 = this.c;
                defpackage.aigb aigbVar = new defpackage.aigb(6);
                defpackage.kgc kgcVar = defpackage.kgc.a;
                hip hipVar4 = hkhVar8.b.a;
                defpackage.amyz amyzVar2 = hipVar4.hR;
                if (amyzVar2 == null) {
                    defpackage.aooh.i("impl");
                }
                aigbVar.i(kgcVar, new defpackage.zjm((defpackage.aoin) amyzVar2, (defpackage.zcs) new defpackage.vkc(2)));
                defpackage.kgc kgcVar2 = defpackage.kgc.b;
                defpackage.amyz amyzVar3 = hipVar4.hS;
                if (amyzVar3 == null) {
                    defpackage.aooh.i("impl");
                }
                aigbVar.i(kgcVar2, new defpackage.zjm((defpackage.aoin) amyzVar3, (defpackage.zcs) new defpackage.vkc(2)));
                defpackage.kgc kgcVar3 = defpackage.kgc.c;
                defpackage.amyz amyzVar4 = hipVar4.hT;
                final defpackage.amyz amyzVar5 = hipVar4.hU;
                if (amyzVar4 == null) {
                    defpackage.aooh.i("impl");
                }
                if (amyzVar5 == null) {
                    defpackage.aooh.i("deprecateContactsFilter");
                }
                final int i7 = 7;
                aigbVar.i(kgcVar3, new defpackage.zjm((defpackage.aoin) amyzVar4, new defpackage.zcs() { // from class: isk
                    /* JADX WARN: Type inference failed for: r2v22, types: [aoin, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r2v28, types: [aoin, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r2v38, types: [aoin, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r2v52, types: [aoin, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r2v56, types: [aoin, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r2v60, types: [aoin, java.lang.Object] */
                    @Override // defpackage.zcs
                    public final boolean a() {
                        switch (i7) {
                            case 0:
                                return ((defpackage.iqm) amyzVar5).b();
                            case 1:
                                return defpackage.kcq.C((defpackage.iqm) amyzVar5);
                            case 2:
                                return ((defpackage.iqm) amyzVar5).f();
                            case 3:
                                return ((defpackage.iqm) amyzVar5).d();
                            case 4:
                                return ((defpackage.iqm) amyzVar5).e();
                            case 5:
                                return ((defpackage.jsa) amyzVar5).a();
                            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                                return ((defpackage.jsa) amyzVar5).a();
                            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                                return !((java.lang.Boolean) amyzVar5.a()).booleanValue();
                            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                                ?? r2 = amyzVar5;
                                if (r2 == 0) {
                                    defpackage.aooh.i("<this>");
                                }
                                return ((java.lang.Boolean) r2.a()).booleanValue();
                            case 9:
                                return ((defpackage.kuz) amyzVar5).a();
                            case 10:
                                return ((defpackage.kvw) amyzVar5).a();
                            case 11:
                                return ((java.lang.Boolean) amyzVar5.a()).booleanValue();
                            case 12:
                                return ((j$.util.Optional) amyzVar5).isPresent();
                            case 13:
                                return ((defpackage.lnz) amyzVar5).a();
                            case 14:
                                return ((defpackage.zjm) amyzVar5).g().isEmpty();
                            case 15:
                                ?? r3 = amyzVar5;
                                if (r3 == 0) {
                                    defpackage.aooh.i("<this>");
                                }
                                return ((java.lang.Boolean) r3.a()).booleanValue();
                            case 16:
                                ?? r4 = amyzVar5;
                                if (r4 == 0) {
                                    defpackage.aooh.i("<this>");
                                }
                                return ((java.lang.Boolean) r4.a()).booleanValue();
                            case 17:
                                ?? r5 = amyzVar5;
                                if (r5 == 0) {
                                    defpackage.aooh.i("<this>");
                                }
                                return ((java.lang.Boolean) r5.a()).booleanValue();
                            case 18:
                                return ((defpackage.meo) amyzVar5).a();
                            case 19:
                                return ((defpackage.nym) amyzVar5).a();
                            default:
                                return ((defpackage.one) amyzVar5).a();
                        }
                    }
                }));
                defpackage.kgc kgcVar4 = defpackage.kgc.d;
                defpackage.amyz amyzVar6 = hipVar4.hV;
                if (amyzVar6 == null) {
                    defpackage.aooh.i("impl");
                }
                aigbVar.i(kgcVar4, new defpackage.zjm((defpackage.aoin) amyzVar6, (defpackage.zcs) new defpackage.vkc(2)));
                defpackage.kgc kgcVar5 = defpackage.kgc.e;
                defpackage.amyz amyzVar7 = hipVar4.hW;
                if (amyzVar7 == null) {
                    defpackage.aooh.i("impl");
                }
                aigbVar.i(kgcVar5, new defpackage.zjm((defpackage.aoin) amyzVar7, (defpackage.zcs) new defpackage.vkc(2)));
                defpackage.kgc kgcVar6 = defpackage.kgc.f;
                defpackage.amyz amyzVar8 = hipVar4.hX;
                final defpackage.kvw kvwVarAh = hipVar4.a.ah();
                if (amyzVar8 == null) {
                    defpackage.aooh.i("impl");
                }
                final int i8 = 10;
                aigbVar.i(kgcVar6, new defpackage.zjm((defpackage.aoin) amyzVar8, new defpackage.zcs() { // from class: isk
                    /* JADX WARN: Type inference failed for: r2v22, types: [aoin, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r2v28, types: [aoin, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r2v38, types: [aoin, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r2v52, types: [aoin, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r2v56, types: [aoin, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r2v60, types: [aoin, java.lang.Object] */
                    @Override // defpackage.zcs
                    public final boolean a() {
                        switch (i8) {
                            case 0:
                                return ((defpackage.iqm) kvwVarAh).b();
                            case 1:
                                return defpackage.kcq.C((defpackage.iqm) kvwVarAh);
                            case 2:
                                return ((defpackage.iqm) kvwVarAh).f();
                            case 3:
                                return ((defpackage.iqm) kvwVarAh).d();
                            case 4:
                                return ((defpackage.iqm) kvwVarAh).e();
                            case 5:
                                return ((defpackage.jsa) kvwVarAh).a();
                            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                                return ((defpackage.jsa) kvwVarAh).a();
                            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                                return !((java.lang.Boolean) kvwVarAh.a()).booleanValue();
                            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                                ?? r2 = kvwVarAh;
                                if (r2 == 0) {
                                    defpackage.aooh.i("<this>");
                                }
                                return ((java.lang.Boolean) r2.a()).booleanValue();
                            case 9:
                                return ((defpackage.kuz) kvwVarAh).a();
                            case 10:
                                return ((defpackage.kvw) kvwVarAh).a();
                            case 11:
                                return ((java.lang.Boolean) kvwVarAh.a()).booleanValue();
                            case 12:
                                return ((j$.util.Optional) kvwVarAh).isPresent();
                            case 13:
                                return ((defpackage.lnz) kvwVarAh).a();
                            case 14:
                                return ((defpackage.zjm) kvwVarAh).g().isEmpty();
                            case 15:
                                ?? r3 = kvwVarAh;
                                if (r3 == 0) {
                                    defpackage.aooh.i("<this>");
                                }
                                return ((java.lang.Boolean) r3.a()).booleanValue();
                            case 16:
                                ?? r4 = kvwVarAh;
                                if (r4 == 0) {
                                    defpackage.aooh.i("<this>");
                                }
                                return ((java.lang.Boolean) r4.a()).booleanValue();
                            case 17:
                                ?? r5 = kvwVarAh;
                                if (r5 == 0) {
                                    defpackage.aooh.i("<this>");
                                }
                                return ((java.lang.Boolean) r5.a()).booleanValue();
                            case 18:
                                return ((defpackage.meo) kvwVarAh).a();
                            case 19:
                                return ((defpackage.nym) kvwVarAh).a();
                            default:
                                return ((defpackage.one) kvwVarAh).a();
                        }
                    }
                }));
                return aigbVar.e(true);
            case 22:
                him himVar11 = this.a;
                return new lzt((defpackage.aoss) himVar11.cb.a(), (defpackage.ajcu) himVar11.r.a(), (defpackage.agsm) himVar11.aT.a());
            case 23:
                return new xm((byte[]) null);
            case 24:
                return new her((char[]) null);
            case 25:
                defpackage.hkh hkhVar9 = this.c;
                him himVar12 = hkhVar9.b;
                defpackage.kew kewVar = new defpackage.kew(himVar12.a.cu(), (defpackage.uqz) hkhVar9.v.a(), (defpackage.aogc) himVar12.fo.a(), himVar12.dT(), himVar12.rX(), (defpackage.aoss) himVar12.cb.a());
                him himVar13 = this.a;
                vvzVar = new defpackage.kik(kewVar, (defpackage.zzx) himVar13.gq(), himVar13.vq, himVar13.a.jj, hkhVar9.F);
                return vvzVar;
            case 26:
                defpackage.hkh hkhVar10 = this.c;
                return new defpackage.kgl((defpackage.jzr) hkhVar10.E.a(), hkhVar10.b(), (defpackage.aolr) this.a.ca.a());
            case 27:
                defpackage.hkh hkhVar11 = this.c;
                defpackage.kgl kglVarE = hkhVar11.e();
                defpackage.kgl kglVar = (defpackage.kgl) hkhVar11.B.a();
                him himVar14 = this.a;
                defpackage.jzy jzyVarA = hkhVar11.a();
                hip hipVar5 = himVar14.a;
                defpackage.kal kalVar = (defpackage.kal) hipVar5.jn.a();
                defpackage.apnt apntVar = (defpackage.apnt) hkhVar11.D.a();
                defpackage.ojo ojoVar2 = (defpackage.ojo) himVar14.oF.a();
                him himVar15 = hkhVar11.b;
                defpackage.kab kabVar = new defpackage.kab(himVar15.mX(), (defpackage.aoss) himVar15.cb.a());
                hip hipVar6 = himVar15.a;
                return new defpackage.jzr(kglVarE, kglVar, jzyVarA, kalVar, apntVar, ojoVar2, kabVar, new defpackage.kad(hipVar6.cf(), (defpackage.aoss) himVar15.cb.a()), new defpackage.jzx((defpackage.aazc) himVar15.l.a(), hipVar6.jo, (defpackage.aolr) himVar15.ca.a()), hipVar5.jp, hipVar5.jq, himVar14.mZ(), hkhVar11.b(), (defpackage.aolr) himVar14.ca.a());
            case 28:
                return new defpackage.kgl(this.c.f());
            case 29:
                hip hipVar7 = this.a.a;
                return defpackage.aigf.m(kof.d, hipVar7.bu(), kof.a, hipVar7.by(), kof.b, hipVar7.bE());
            case 30:
                return new defpackage.apnt(this);
            case 31:
                return new defpackage.mfp((android.content.Context) this.a.s.a());
            case 32:
                him himVar16 = this.a;
                rpaVar = new defpackage.gpd((defpackage.uqc) himVar16.a.cF.a(), himVar16.mX(), (defpackage.aolr) himVar16.ca.a(), new defpackage.tvn((defpackage.ecx) this.c.b.a.ko.a()), (defpackage.ojo) himVar16.oF.a());
                return rpaVar;
            case 33:
                him himVar17 = this.a;
                return new wts((android.content.Context) himVar17.s.a(), himVar17.cs(), (defpackage.aogc) himVar17.fo.a(), (defpackage.aoss) himVar17.fh.a());
            case 34:
                defpackage.hkh hkhVar12 = this.c;
                return new defpackage.gou(hkhVar12.e(), hkhVar12.a(), hkhVar12.b());
            case 35:
                defpackage.hkh hkhVar13 = this.c;
                return new defpackage.aogc(new defpackage.zzx(hkhVar13.O), hkhVar13.b());
            case 36:
                defpackage.hkh hkhVar14 = this.c;
                return defpackage.aihd.r(new defpackage.zjm((defpackage.aoin) hkhVar14.L, (defpackage.zcs) new defpackage.vkc(2)), new defpackage.zjm((defpackage.aoin) hkhVar14.N, (defpackage.zcs) new defpackage.vkc(2)));
            case 37:
                defpackage.hkh hkhVar15 = this.c;
                defpackage.gpd gpdVar = (defpackage.gpd) hkhVar15.I.a();
                him himVar18 = hkhVar15.b;
                hip hipVar8 = himVar18.a;
                defpackage.amyz amyzVar9 = hipVar8.cF;
                defpackage.unb unbVar = new defpackage.unb(gpdVar, hkhVar15.h(), new defpackage.uno((defpackage.uqc) amyzVar9.a()), himVar18.dT(), new defpackage.zth((defpackage.rlv) himVar18.fq.a(), (defpackage.nwu) himVar18.va.a(), (defpackage.gpd) himVar18.fD.a(), himVar18.oV()), (defpackage.rlv) himVar18.fq.a(), (defpackage.aoss) himVar18.cb.a());
                defpackage.aoss aossVarB2 = hkhVar15.b();
                new defpackage.umx((defpackage.gpd) hkhVar15.I.a(), (defpackage.aoss) himVar18.cb.a(), (defpackage.aolr) himVar18.ca.a(), (defpackage.uqc) amyzVar9.a(), himVar18.dT(), (defpackage.aogc) himVar18.fo.a(), hkhVar15.h());
                defpackage.lxj lxjVar = new defpackage.lxj((android.content.Context) himVar18.s.a(), hipVar8.jr, (defpackage.lvs) himVar18.oS.a(), (defpackage.rlv) himVar18.fq.a());
                him himVar19 = this.a;
                defpackage.amyz amyzVar10 = himVar19.vq;
                defpackage.gpd gpdVar2 = (defpackage.gpd) himVar19.fD.a();
                defpackage.zjm zjmVarMN2 = himVar19.mN();
                hip hipVar9 = himVar19.a;
                return new defpackage.uod(unbVar, aossVarB2, lxjVar, amyzVar10, hipVar9.kr, hipVar9.ks, hipVar9.kt, gpdVar2, zjmVarMN2);
            case 38:
                defpackage.hkh hkhVar16 = this.c;
                him himVar20 = hkhVar16.b;
                defpackage.aolr aolrVar3 = (defpackage.aolr) himVar20.ca.a();
                defpackage.zzx zzxVar3 = new defpackage.zzx(hkhVar16.M);
                hip hipVar10 = himVar20.a;
                defpackage.ipc ipcVar = new defpackage.ipc(new defpackage.rtg(aolrVar3, zzxVar3, hipVar10.F(), (defpackage.aazc) himVar20.l.a(), hipVar10.jT));
                defpackage.aoss aossVarB3 = hkhVar16.b();
                defpackage.rsr rsrVar = new defpackage.rsr((defpackage.rlv) himVar20.fq.a(), (defpackage.gpd) himVar20.fD.a());
                hip hipVar11 = this.a.a;
                return new defpackage.rsq(ipcVar, aossVarB3, rsrVar, hipVar11.ds(), hipVar11.E(), hipVar11.jT);
            default:
                hip hipVar12 = this.a.a;
                return defpackage.aihd.v(hipVar12.bW(), hipVar12.bV(), hipVar12.bU(), hipVar12.bF(), hipVar12.br(), hipVar12.bv(), hipVar12.bs(), hipVar12.bt(), hipVar12.bA(), hipVar12.bM(), hipVar12.bR(), hipVar12.bX());
        }
    }
}
