package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class kci implements aonj {
    public final /* synthetic */ lpv a;
    public final /* synthetic */ java.util.List b;
    public final /* synthetic */ java.util.List c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ kca e;
    public final /* synthetic */ kby f;
    public final /* synthetic */ java.lang.Long g;
    public final /* synthetic */ aonj h;
    public final /* synthetic */ ahj i;
    public final /* synthetic */ gat j;

    public /* synthetic */ kci(lpv lpvVar, java.util.List list, gat gatVar, java.util.List list2, boolean z, kca kcaVar, kby kbyVar, ahj ahjVar, java.lang.Long l, aonj aonjVar) {
        this.a = lpvVar;
        this.b = list;
        this.j = gatVar;
        this.c = list2;
        this.d = z;
        this.e = kcaVar;
        this.f = kbyVar;
        this.i = ahjVar;
        this.g = l;
        this.h = aonjVar;
    }

    public final java.lang.Object a(java.lang.Object obj) {
        bar barVar = (bar) obj;
        if (barVar == null) {
            aooh.i("$this$LazyColumn");
        }
        boolean z = this.d;
        if (this.a != lpv.a) {
            java.util.List list = this.c;
            java.util.List list2 = this.b;
            barVar.a("call_log_filters", "call_log_filters", new cja(1938748088, true, new kcc(list, 0)));
            barVar.b(list2.size(), new gxo(list2, 5), new gxo(list2, 6), new cja(1155119055, true, new kcd(list2, z)));
        }
        final gat gatVar = this.j;
        if (gatVar.d() == 0) {
            barVar.a((java.lang.Object) null, (java.lang.Object) null, new cja(-2037059551, true, new lqd(z, this.e, 1)));
        } else {
            final aonj aonjVar = this.h;
            final java.lang.Long l = this.g;
            final ahj ahjVar = this.i;
            final kby kbyVar = this.f;
            barVar.b(gatVar.d(), new dpz(new defpackage.kbz(4), gatVar, 14), new dpz(defpackage.kco.a, gatVar, 13), new cja(-480615345, true, new aonp() { // from class: kce
                /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
                /* JADX WARN: Code duplicated, block: B:23:0x0076  */
                public final java.lang.Object a(java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) throws aois {
                    int iIntValue = ((java.lang.Integer) obj3).intValue();
                    cav cavVar = (cav) obj4;
                    int iIntValue2 = ((java.lang.Integer) obj5).intValue();
                    aooh.f((nf) obj2, "$this$items");
                    if ((iIntValue2 & 48) == 0) {
                        iIntValue2 |= true != cavVar.z(iIntValue) ? 16 : 32;
                    }
                    if (cavVar.H((iIntValue2 & 145) != 144, iIntValue2 & 1)) {
                        gat gatVar2 = gatVar;
                        ((gcf) gatVar2.b).c(iIntValue);
                        kcr kcrVar = (kct) gatVar2.e().get(iIntValue);
                        int iH = defpackage.jlr.h(kcrVar);
                        if (iH == -1) {
                            cavVar.u(1410356881);
                            cavVar.o();
                        } else if (iH == 0) {
                            cavVar.u(1985125111);
                            kcq.d(((defpackage.kcs) kcrVar).a, cavVar, 0);
                            cavVar.o();
                        } else {
                            if (iH != 1) {
                                cavVar.u(1985123232);
                                cavVar.o();
                                throw new aois();
                            }
                            kby kbyVar2 = kbyVar;
                            cavVar.u(1409461477);
                            defpackage.kbx kbxVar = kcrVar.a;
                            if (kbyVar2 != null) {
                                if (kbyVar2.a != kbxVar.a) {
                                    kbyVar2 = null;
                                }
                            } else {
                                kbyVar2 = null;
                            }
                            boolean z2 = iIntValue > 0 ? gatVar2.h(iIntValue - 1) instanceof defpackage.kcs : true;
                            boolean z3 = iIntValue < gatVar2.d() + (-1) ? gatVar2.h(iIntValue + 1) instanceof defpackage.kcs : true;
                            java.lang.Long l2 = l;
                            long j = kbxVar.a;
                            boolean z4 = l2 != null && j == l2.longValue();
                            aonj aonjVar2 = aonjVar;
                            ahj ahjVar2 = ahjVar;
                            int i = kbxVar.p;
                            int i2 = kbxVar.q;
                            dji djiVar = kbxVar.b;
                            aify aifyVar = kbxVar.c;
                            java.lang.Integer num = kbxVar.d;
                            defpackage.kbg kbgVar = kbxVar.e;
                            dji djiVar2 = kbxVar.f;
                            dji djiVar3 = kbxVar.h;
                            dji djiVar4 = kbxVar.i;
                            defpackage.kcu kcuVar = kbxVar.j;
                            defpackage.klb klbVar = kbxVar.k;
                            kcw kcwVar = kbxVar.l;
                            defpackage.kbh kbhVar = kbxVar.m;
                            defpackage.kbf kbfVar = kbxVar.n;
                            java.lang.String str = kbxVar.o;
                            aooh.f(aifyVar, "icons");
                            aooh.f(str, "contentDescription");
                            defpackage.kbx kbxVar2 = new defpackage.kbx(j, i, i2, djiVar, aifyVar, num, kbgVar, djiVar2, z4, djiVar3, djiVar4, kcuVar, klbVar, kcwVar, kbhVar, kbfVar, str);
                            cmt cmtVar = cmw.c;
                            cmw cmwVarX = den.x(cmtVar, a.bz(j, "call_log_item_"));
                            float f = true != z2 ? 4.0f : 16.0f;
                            float f2 = true == z3 ? 16.0f : 4.0f;
                            defpackage.jlr.w(ahjVar2, kbxVar2, kbyVar2, aonjVar2, cmwVarX, bge.c(f, f, f2, f2), cavVar, 512);
                            den.aR(azm.e(cmtVar, true != z3 ? 2.0f : 8.0f), cavVar);
                            cavVar.o();
                        }
                    } else {
                        cavVar.s();
                    }
                    return aojh.a;
                }
            }));
        }
        return aojh.a;
    }
}
