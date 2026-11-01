package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class jzn implements defpackage.aonj {
    private final defpackage.jys a;
    private final defpackage.nwu b;
    private final defpackage.rlv c;
    private final defpackage.aoss d;
    private final defpackage.gpd e;
    private final defpackage.gou f;
    private final defpackage.aeqx g;
    private final defpackage.zjm h;
    private final defpackage.gpd i;
    private final defpackage.acxg j;
    private final defpackage.rsr k;

    public jzn(defpackage.gou gouVar, defpackage.rsr rsrVar, defpackage.jys jysVar, defpackage.acxg acxgVar, defpackage.nwu nwuVar, defpackage.aeqx aeqxVar, defpackage.gpd gpdVar, defpackage.rlv rlvVar, defpackage.gpd gpdVar2, defpackage.zjm zjmVar, defpackage.aoss aossVar) {
        defpackage.aooh.f(gouVar, "callLogListStateHolder");
        defpackage.aooh.f(rsrVar, "chipCallbackAdapter");
        defpackage.aooh.f(nwuVar, "meetCallController");
        defpackage.aooh.f(rlvVar, "loggingBindings");
        defpackage.aooh.f(gpdVar2, "cuiSemanticLoggerFactory");
        defpackage.aooh.f(aossVar, "lightweightScope");
        this.f = gouVar;
        this.k = rsrVar;
        this.a = jysVar;
        this.j = acxgVar;
        this.b = nwuVar;
        this.g = aeqxVar;
        this.e = gpdVar;
        this.c = rlvVar;
        this.i = gpdVar2;
        this.h = zjmVar;
        this.d = aossVar;
    }

    private static final boolean b(kbo kboVar) {
        defpackage.kiu kiuVar = kboVar.a;
        java.lang.String str = kiuVar.m;
        defpackage.aooh.e(str, "getPhoneAccountComponentName(...)");
        java.lang.String str2 = kiuVar.n;
        defpackage.aooh.e(str2, "getPhoneAccountId(...)");
        return jzz.a(str, str2);
    }

    @Override // defpackage.aonj
    public final /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        defpackage.mce mceVar;
        defpackage.kgu kguVarB;
        kbn kbnVar = (kbu) obj;
        defpackage.aooh.f(kbnVar, "event");
        j$.util.Objects.checkIndex(0, 8);
        if (kbnVar != null) {
            if (kbnVar instanceof kbn) {
                kbn kbnVar2 = kbnVar;
                android.content.Context context = kbnVar2.a;
                android.graphics.Rect rect = new android.graphics.Rect();
                android.net.Uri uri = android.net.Uri.parse(kbnVar2.b);
                defpackage.aooh.e(uri, "parse(...)");
                android.provider.ContactsContract.QuickContact.showQuickContact(context, rect, uri, 3, (java.lang.String[]) null);
            } else if (kbnVar instanceof kbs) {
                defpackage.gou gouVar = this.f;
                defpackage.kcy kcyVar = ((kbs) kbnVar).a;
                defpackage.aozj aozjVar = (defpackage.aozj) gouVar.e;
                defpackage.kcy kcyVar2 = (defpackage.kcy) aozjVar.c();
                aozjVar.e((kcyVar2 == null || kcyVar2.a() != kcyVar.a()) ? kcyVar : null);
            } else if (kbnVar instanceof kbp) {
                kbp kbpVar = (kbp) kbnVar;
                this.k.W(kbpVar.a, kbpVar.b);
            } else if (kbnVar instanceof kbt) {
                java.lang.Long l = ((kbt) kbnVar).a;
                if (l != null) {
                    this.i.i(null).b(defpackage.mce.CONVERSATION_HISTORY_LONG_CLICKED);
                }
                ((defpackage.aozj) this.f.a).e(l);
            } else if (kbnVar instanceof kbo) {
                j$.util.Optional optionalG = this.h.g();
                defpackage.aooh.e(optionalG, "getFeature(...)");
                defpackage.kgz kgzVar = (defpackage.kgz) defpackage.aooh.q(optionalG);
                if (kgzVar == null || (kguVarB = kgzVar.b(((kbo) kbnVar).a)) == null) {
                    kbo kboVar = (kbo) kbnVar;
                    kbf kbfVar = kboVar.b;
                    if (defpackage.kcq.k(kbfVar)) {
                        this.c.o(b(kboVar) ? defpackage.rmx.MEET_CALL_BUTTON_PRESSED_FROM_RECENTS : defpackage.rmx.VIDEO_CALL_BUTTON_PRESSED_FROM_RECENTS);
                    }
                    j$.util.Objects.checkIndex(0, 8);
                    if (kbfVar != null) {
                        if ((kbfVar instanceof kbc) || (kbfVar instanceof kbe)) {
                            mceVar = defpackage.mce.USER_CLICKED_VOICE_CALL_BUTTON_FROM_RECENTS;
                        } else if ((kbfVar instanceof kbb) || (kbfVar instanceof kbd)) {
                            mceVar = b(kboVar) ? defpackage.mce.USER_CLICKED_VIDEO_APP_CALL_BUTTON_FROM_RECENTS : defpackage.mce.USER_CLICKED_VIDEO_CALL_BUTTON_FROM_RECENTS;
                        } else if ((kbfVar instanceof kay) || (kbfVar instanceof kaz) || (kbfVar instanceof kba)) {
                            mceVar = null;
                        }
                        if (mceVar != null) {
                            this.i.i(null).b(mceVar);
                        }
                        defpackage.akzx akzxVarM = jxb.b.m();
                        akzxVarM.u();
                        jxb jxbVar = akzxVarM.b;
                        jxbVar.d = 7;
                        jxbVar.c |= 1;
                        defpackage.kiu kiuVar = kboVar.a;
                        int i = kiuVar.y;
                        akzxVarM.u();
                        jxb jxbVar2 = akzxVarM.b;
                        jxbVar2.c |= 65536;
                        jxbVar2.r = i;
                        boolean z = (kbfVar instanceof kbe) || (kbfVar instanceof kbd);
                        akzxVarM.u();
                        jxb jxbVar3 = akzxVarM.b;
                        jxbVar3.c |= 131072;
                        jxbVar3.s = z;
                        jxb jxbVarR = akzxVarM.r();
                        defpackage.aooh.e(jxbVarR, "build(...)");
                        jxb jxbVar4 = jxbVarR;
                        defpackage.akzx akzxVarM2 = abvz.a.m();
                        java.lang.String string = this.g.d(kiuVar, false).toString();
                        akzxVarM2.u();
                        abvz abvzVar = akzxVarM2.b;
                        j$.util.Objects.requireNonNull(string);
                        abvzVar.b |= 1;
                        abvzVar.c = string;
                        kiw kiwVar = kiuVar.r;
                        if (kiwVar == null) {
                            kiwVar = kiw.a;
                        }
                        java.lang.String str = kiwVar.e;
                        akzxVarM2.u();
                        abvz abvzVar2 = akzxVarM2.b;
                        j$.util.Objects.requireNonNull(str);
                        abvzVar2.b |= 4;
                        abvzVar2.e = str;
                        defpackage.akzx akzxVarA = this.e.a(kiuVar, 2);
                        akzxVarM2.u();
                        abvz abvzVar3 = akzxVarM2.b;
                        abwd abwdVarR = akzxVarA.r();
                        j$.util.Objects.requireNonNull(abwdVarR);
                        abvzVar3.f = abwdVarR;
                        abvzVar3.b |= 8;
                        kiw kiwVar2 = kiuVar.r;
                        if (kiwVar2 == null) {
                            kiwVar2 = kiw.a;
                        }
                        java.lang.String str2 = kiwVar2.h;
                        akzxVarM2.u();
                        abvz abvzVar4 = akzxVarM2.b;
                        j$.util.Objects.requireNonNull(str2);
                        abvzVar4.b |= 2;
                        abvzVar4.d = str2;
                        kiw kiwVar3 = kiuVar.r;
                        if (kiwVar3 == null) {
                            kiwVar3 = kiw.a;
                        }
                        defpackage.rmt rmtVarB = defpackage.rmt.b(kiwVar3.o);
                        if (rmtVarB == null) {
                            rmtVarB = defpackage.rmt.UNKNOWN_SOURCE_TYPE;
                        }
                        boolean z2 = rmtVarB != defpackage.rmt.UNKNOWN_SOURCE_TYPE;
                        akzxVarM2.u();
                        abvz abvzVar5 = akzxVarM2.b;
                        abvzVar5.b |= 16;
                        abvzVar5.g = z2;
                        abvz abvzVarR = akzxVarM2.r();
                        defpackage.aooh.e(abvzVarR, "build(...)");
                        abvz abvzVar6 = abvzVarR;
                        if (b(kboVar)) {
                            this.b.k(kiuVar.g, nwt.c);
                        } else {
                            amdx amdxVar = new amdx((char[]) null, (byte[]) null, (byte[]) null);
                            java.lang.String str3 = kiuVar.g;
                            defpackage.aooh.e(str3, "getRawNumber(...)");
                            amdxVar.s(str3);
                            amdxVar.v(8);
                            defpackage.aooh.f(kiuVar, "<this>");
                            kiw kiwVar4 = kiuVar.r;
                            if (kiwVar4 == null) {
                                kiwVar4 = kiw.a;
                            }
                            amdxVar.u(true != kiwVar4.j ? 5 : 4);
                            kiw kiwVar5 = kiuVar.r;
                            if (kiwVar5 == null) {
                                kiwVar5 = kiw.a;
                            }
                            java.lang.String str4 = kiwVar5.g;
                            defpackage.aooh.e(str4, "getLookupUri(...)");
                            amdxVar.l(str4.length() > 0);
                            amdxVar.m(jxbVar4);
                            amdxVar.q(defpackage.kcq.k(kbfVar));
                            amdxVar.p(kbfVar instanceof kba);
                            amdxVar.o(abvzVar6);
                            this.j.w((zrx) amdxVar.a);
                        }
                    }
                    throw new defpackage.aois();
                }
                this.c.o(defpackage.rmx.HALO_CALL_PLACED_FROM_CALL_LOG_ROW);
                defpackage.aoov.an(this.d, null, 0, new jpj(kgzVar, kguVarB, (defpackage.aoln) null, 2), 3);
            } else if (kbnVar instanceof kbq) {
                defpackage.kiu kiuVar2 = ((kbq) kbnVar).a.a;
                if (kiuVar2.q == 3 && !kiuVar2.j) {
                    defpackage.jys jysVar = this.a;
                    kis kisVar = kiuVar2.u;
                    if (kisVar == null) {
                        kisVar = kis.a;
                    }
                    defpackage.alan alanVar = kisVar.b;
                    defpackage.aooh.e(alanVar, "getCoalescedIdList(...)");
                    defpackage.agsm.i(189, jysVar.b(alanVar), "Failed to clear missed calls.", new java.lang.Object[0]);
                }
            } else if (kbnVar instanceof kbr) {
                this.c.o(defpackage.rmx.CONVERSATION_HISTORY_POPUP_MENU_DISPLAYED);
                this.i.i(null).b(defpackage.mce.CONVERSATION_HISTORY_CALL_DETAILS_POPUP_MENU_RENDERED);
            }
            return defpackage.aojh.a;
        }
        throw new defpackage.aois();
    }
}
