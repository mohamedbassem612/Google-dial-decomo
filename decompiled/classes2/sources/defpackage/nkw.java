package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class nkw extends aomh implements aonn {
    java.lang.Object a;
    java.lang.Object b;
    int c;
    final /* synthetic */ defpackage.nld d;
    final /* synthetic */ defpackage.njq e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nkw(defpackage.nld nldVar, defpackage.njq njqVar, aoln aolnVar) {
        super(2, aolnVar);
        this.d = nldVar;
        this.e = njqVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:107:0x01bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:? A[LOOP:0: B:39:0x01a9->B:108:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:37:0x0107  */
    /* JADX WARN: Code duplicated, block: B:41:0x01af  */
    /* JADX WARN: Code duplicated, block: B:70:0x0279  */
    /* JADX WARN: Code duplicated, block: B:74:0x0284  */
    /* JADX WARN: Code duplicated, block: B:76:0x0288 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:86:0x02cb  */
    public final java.lang.Object b(java.lang.Object obj) throws aois {
        defpackage.nld nldVar;
        apdp apdpVar;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.Object objS;
        java.lang.Object objS2;
        boolean zBooleanValue;
        defpackage.nld nldVar2;
        long j;
        defpackage.mzc mzcVar;
        boolean z;
        java.lang.Object objP;
        int iIndexOf;
        defpackage.nld nldVar3;
        java.lang.Long l;
        aolu aoluVar = aolu.a;
        int i = this.c;
        boolean z2 = false;
        java.lang.Object obj4 = null;
        try {
            if (i != 0) {
                if (i == 1) {
                    java.lang.Object obj5 = this.b;
                    java.lang.Object obj6 = this.a;
                    aooc.af(obj);
                    obj3 = obj5;
                    obj2 = obj6;
                } else if (i == 2) {
                    aooc.af(obj);
                    objS2 = obj;
                    zBooleanValue = ((java.lang.Boolean) objS2).booleanValue();
                    if (!zBooleanValue) {
                        defpackage.nld.a.b().l("com/android/dialer/dobby/impl/service/gemini/runners/DobbyCallScreenLiteUseCaseRunner", "relayBotSpeakResult$<anonymous>", 421, "DobbyCallScreenLiteUseCaseRunner.kt").x("No pending action executed for finished item %d", ((defpackage.njo) this.e).a);
                    }
                    nldVar2 = this.d;
                    if (((java.lang.Boolean) nldVar2.g.a()).booleanValue() || (!zBooleanValue && !nldVar2.B())) {
                        nldVar2.s = defpackage.nld.E(nldVar2.s, new defpackage.mws(4));
                    }
                    j = ((defpackage.njo) this.e).a;
                    this.c = 3;
                    if (j == 0) {
                        defpackage.vk vkVarT = mni.T(nldVar2.s.p());
                        defpackage.vk vkVarAb = mni.ab(defpackage.mze.a.m());
                        vkVarAb.k();
                        defpackage.mzg mzgVar = defpackage.mzg.a;
                        defpackage.npw npwVarQ = mni.Q(mzgVar.m());
                        npwVarQ.ac(0L);
                        android.content.Context context = nldVar2.b;
                        java.lang.String string = context.getString(2132018391);
                        aooh.e(string, "getString(...)");
                        npwVarQ.ad(string);
                        defpackage.mzb mzbVar = defpackage.mzb.DOBBY_BUTTON_STATE_ENABLED;
                        npwVarQ.ab(mzbVar);
                        npwVarQ.Z(defpackage.mzf.ACTION_REPORT_SPAM);
                        npwVarQ.aa("report_spam");
                        npwVarQ.ae();
                        vkVarAb.l(npwVarQ.Y());
                        vkVarAb.k();
                        defpackage.npw npwVarQ2 = mni.Q(mzgVar.m());
                        npwVarQ2.ac(1L);
                        java.lang.String string2 = context.getString(2132018388);
                        aooh.e(string2, "getString(...)");
                        npwVarQ2.ad(string2);
                        npwVarQ2.ab(mzbVar);
                        npwVarQ2.Z(defpackage.mzf.ACTION_END_CALL);
                        npwVarQ2.aa("end_call");
                        npwVarQ2.ae();
                        vkVarAb.l(npwVarQ2.Y());
                        vkVarT.n(vkVarAb.j());
                        nldVar2.s = vkVarT.m();
                        nldVar2.z();
                        z2 = true;
                        j = 0;
                    }
                    alat alatVar = nldVar2.s.c;
                    aooh.e(alatVar, "getConversationItemsList(...)");
                    for (java.lang.Object obj7 : alatVar) {
                        if (((defpackage.mzc) obj7).d == j) {
                            obj4 = obj7;
                            break;
                        }
                    }
                    mzcVar = (defpackage.mzc) obj4;
                    if (mzcVar != null || (iIndexOf = nldVar2.s.c.indexOf(mzcVar)) < 0) {
                        z = z2;
                    } else {
                        int iH = mni.H((mzcVar.b == 3 ? (defpackage.mzh) mzcVar.c : defpackage.mzh.a).f);
                        if (iH == 0 || iH != 4) {
                            defpackage.myz myzVar = (mzcVar.b == 3 ? (defpackage.mzh) mzcVar.c : defpackage.mzh.a).d;
                            if (myzVar == null) {
                                myzVar = defpackage.myz.a;
                            }
                            int length = myzVar.b.length();
                            defpackage.myz myzVar2 = (mzcVar.b == 3 ? (defpackage.mzh) mzcVar.c : defpackage.mzh.a).d;
                            if (myzVar2 == null) {
                                myzVar2 = defpackage.myz.a;
                            }
                            aooh.e(myzVar2, "getText(...)");
                            defpackage.vk vkVarV = mni.V(myzVar2.p());
                            vkVarV.A();
                            vkVarV.z();
                            vkVarV.A();
                            defpackage.vk vkVarW = mni.W(defpackage.myy.a.m());
                            vkVarW.D();
                            vkVarW.C(length);
                            vkVarW.E();
                            vkVarV.y(vkVarW.B());
                            defpackage.myz myzVarW = vkVarV.w();
                            defpackage.vk vkVarT2 = mni.T(nldVar2.s.p());
                            vkVarT2.q();
                            defpackage.vk vkVarU = mni.U(mzcVar.p());
                            defpackage.npw npwVarP = mni.P(vkVarU.s().p());
                            npwVarP.X(4);
                            npwVarP.W(myzVarW);
                            vkVarU.v(npwVarP.T());
                            vkVarT2.p(iIndexOf, vkVarU.r());
                            nldVar2.s = vkVarT2.m();
                            z = true;
                        } else {
                            z = z2;
                        }
                    }
                    if (z || (objP = nldVar2.p(this)) != aolu.a) {
                        objP = aojh.a;
                    }
                    if (objP == aoluVar) {
                        return aoluVar;
                    }
                } else if (i == 3 || i != 4) {
                    aooc.af(obj);
                } else {
                    aooc.af(obj);
                    objS = obj;
                    if (!((java.lang.Boolean) objS).booleanValue()) {
                        nldVar3 = this.d;
                        long j2 = ((defpackage.njn) this.e).a;
                        l = nldVar3.u;
                        if (l != null && j2 == l.longValue()) {
                            z2 = true;
                        }
                        this.c = 5;
                        if (nldVar3.r(z2, this) == aoluVar) {
                            return aoluVar;
                        }
                    }
                }
                return aojh.a;
            }
            aooc.af(obj);
            defpackage.nld.a.b().l("com/android/dialer/dobby/impl/service/gemini/runners/DobbyCallScreenLiteUseCaseRunner", "relayBotSpeakResult$<anonymous>", 404, "DobbyCallScreenLiteUseCaseRunner.kt").v("relayBotSpeakResult");
            nldVar = this.d;
            apdpVar = nldVar.v;
            this.a = apdpVar;
            this.b = nldVar;
            this.c = 1;
            if (apdpVar.b(this) == aoluVar) {
                obj3 = nldVar;
                obj2 = apdpVar;
                return aoluVar;
            }
            obj3 = nldVar;
            obj2 = apdpVar;
            aimz aimzVar = defpackage.nld.a;
            if (!((defpackage.nld) obj3).k) {
                defpackage.nld.a.d().j(zct.a, java.lang.Boolean.TRUE).l("com/android/dialer/dobby/impl/service/gemini/runners/DobbyCallScreenLiteUseCaseRunner", "relayBotSpeakResult$<anonymous>$<anonymous>", 410, "DobbyCallScreenLiteUseCaseRunner.kt").v("relayBotSpeakResult called but runner is not started.");
                aojh aojhVar = aojh.a;
                ((apdp) obj2).d();
                return aojhVar;
            }
            ((apdp) obj2).d();
            defpackage.njq njqVar = this.e;
            j$.util.Objects.checkIndex(0, 4);
            if (!(njqVar instanceof defpackage.njo)) {
                if (!(njqVar instanceof defpackage.njn)) {
                    if (!(njqVar instanceof defpackage.njp)) {
                        throw new aois();
                    }
                    defpackage.nld.a.b().l("com/android/dialer/dobby/impl/service/gemini/runners/DobbyCallScreenLiteUseCaseRunner", "relayBotSpeakResult$<anonymous>", 448, "DobbyCallScreenLiteUseCaseRunner.kt");
                    throw null;
                }
                aimw aimwVarL = defpackage.nld.a.d().j(zct.a, java.lang.Boolean.TRUE).l("com/android/dialer/dobby/impl/service/gemini/runners/DobbyCallScreenLiteUseCaseRunner", "relayBotSpeakResult$<anonymous>", 439, "DobbyCallScreenLiteUseCaseRunner.kt");
                long j3 = ((defpackage.njn) njqVar).a;
                aimwVarL.x("BotSpeakFailed for item %d", j3);
                defpackage.nld nldVar4 = this.d;
                aoub aoubVar = nldVar4.p;
                if (aoubVar != null) {
                    aoubVar.s((java.util.concurrent.CancellationException) null);
                }
                this.a = null;
                this.b = null;
                this.c = 4;
                objS = nldVar4.s(j3, this);
                if (objS == aoluVar) {
                    return aoluVar;
                }
                if (!((java.lang.Boolean) objS).booleanValue()) {
                    nldVar3 = this.d;
                    long j4 = ((defpackage.njn) this.e).a;
                    l = nldVar3.u;
                    if (l != null) {
                        z2 = true;
                    }
                    this.c = 5;
                    if (nldVar3.r(z2, this) == aoluVar) {
                        return aoluVar;
                    }
                }
                return aojh.a;
            }
            defpackage.nld nldVar5 = this.d;
            aoub aoubVar2 = nldVar5.p;
            if (aoubVar2 != null) {
                aoubVar2.s((java.util.concurrent.CancellationException) null);
            }
            long j5 = ((defpackage.njo) njqVar).a;
            this.a = null;
            this.b = null;
            this.c = 2;
            objS2 = nldVar5.s(j5, this);
            if (objS2 == aoluVar) {
                return aoluVar;
            }
            zBooleanValue = ((java.lang.Boolean) objS2).booleanValue();
            if (!zBooleanValue) {
                defpackage.nld.a.b().l("com/android/dialer/dobby/impl/service/gemini/runners/DobbyCallScreenLiteUseCaseRunner", "relayBotSpeakResult$<anonymous>", 421, "DobbyCallScreenLiteUseCaseRunner.kt").x("No pending action executed for finished item %d", ((defpackage.njo) this.e).a);
            }
            nldVar2 = this.d;
            if (((java.lang.Boolean) nldVar2.g.a()).booleanValue()) {
                nldVar2.s = defpackage.nld.E(nldVar2.s, new defpackage.mws(4));
            } else {
                nldVar2.s = defpackage.nld.E(nldVar2.s, new defpackage.mws(4));
            }
            j = ((defpackage.njo) this.e).a;
            this.c = 3;
            if (j == 0) {
                defpackage.vk vkVarT3 = mni.T(nldVar2.s.p());
                defpackage.vk vkVarAb2 = mni.ab(defpackage.mze.a.m());
                vkVarAb2.k();
                defpackage.mzg mzgVar2 = defpackage.mzg.a;
                defpackage.npw npwVarQ3 = mni.Q(mzgVar2.m());
                npwVarQ3.ac(0L);
                android.content.Context context2 = nldVar2.b;
                java.lang.String string3 = context2.getString(2132018391);
                aooh.e(string3, "getString(...)");
                npwVarQ3.ad(string3);
                defpackage.mzb mzbVar2 = defpackage.mzb.DOBBY_BUTTON_STATE_ENABLED;
                npwVarQ3.ab(mzbVar2);
                npwVarQ3.Z(defpackage.mzf.ACTION_REPORT_SPAM);
                npwVarQ3.aa("report_spam");
                npwVarQ3.ae();
                vkVarAb2.l(npwVarQ3.Y());
                vkVarAb2.k();
                defpackage.npw npwVarQ4 = mni.Q(mzgVar2.m());
                npwVarQ4.ac(1L);
                java.lang.String string4 = context2.getString(2132018388);
                aooh.e(string4, "getString(...)");
                npwVarQ4.ad(string4);
                npwVarQ4.ab(mzbVar2);
                npwVarQ4.Z(defpackage.mzf.ACTION_END_CALL);
                npwVarQ4.aa("end_call");
                npwVarQ4.ae();
                vkVarAb2.l(npwVarQ4.Y());
                vkVarT3.n(vkVarAb2.j());
                nldVar2.s = vkVarT3.m();
                nldVar2.z();
                z2 = true;
                j = 0;
            }
            alat alatVar2 = nldVar2.s.c;
            aooh.e(alatVar2, "getConversationItemsList(...)");
            while (r2.hasNext()) {
                if (((defpackage.mzc) obj7).d == j) {
                    obj4 = obj7;
                    break;
                }
            }
            mzcVar = (defpackage.mzc) obj4;
            if (mzcVar != null) {
                z = z2;
            } else {
                z = z2;
            }
            if (z) {
                objP = aojh.a;
            } else {
                objP = aojh.a;
            }
            if (objP == aoluVar) {
                return aoluVar;
            }
            return aojh.a;
        } catch (java.lang.Throwable th) {
            ((apdp) obj2).d();
            throw th;
        }
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.nkw(this.d, this.e, aolnVar);
    }
}
