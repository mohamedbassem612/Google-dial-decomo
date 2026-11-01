package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wzp implements defpackage.utx {
    public static final aimz a = aimz.i("com/android/incallui/atlas/ui/impl/feedbackintegration/AtlasFeedbackIntegration");
    public final wzd b;
    public final xtq c;
    private final defpackage.wzl d;
    private final defpackage.wzn e;
    private final defpackage.wzq f;
    private final defpackage.wzr g;
    private final ajct h;

    public wzp(ajct ajctVar, defpackage.wzl wzlVar, defpackage.wzn wznVar, defpackage.wzq wzqVar, xtq xtqVar, defpackage.wzr wzrVar, wzd wzdVar) {
        this.d = wzlVar;
        this.e = wznVar;
        this.f = wzqVar;
        this.c = xtqVar;
        this.g = wzrVar;
        this.h = ajctVar;
        this.b = wzdVar;
    }

    @Override // defpackage.utx
    public final ajcq a(long j) {
        return this.b.c(aify.p(java.lang.Long.valueOf(j)));
    }

    @Override // defpackage.utx
    public final ajcq b(long j) {
        ahrv ahrvVarG = ahrv.g(this.b.f(j));
        defpackage.wzj wzjVar = new defpackage.wzj(3);
        ajct ajctVar = this.h;
        return ahrv.g(ahrvVarG.h(wzjVar, ajctVar)).i(new jwi(this, j, 17), ajctVar);
    }

    @Override // defpackage.utx
    public final ajcq c(defpackage.utu utuVar) {
        return ahrv.g(this.b.f(utuVar.c)).h(new defpackage.wzj(4), this.h);
    }

    @Override // defpackage.utx
    public final ajcq d(long j, final java.lang.String str) {
        defpackage.wzn wznVar = this.e;
        ahrv ahrvVarG = ahrv.g(wznVar.c.f(j));
        defpackage.wzj wzjVar = new defpackage.wzj(2);
        ajct ajctVar = wznVar.b;
        return ahrv.g(ahrvVarG.h(wzjVar, ajctVar)).h(new ahyc() { // from class: wzm
            public final java.lang.Object apply(java.lang.Object obj) {
                j$.util.Optional optional = (j$.util.Optional) obj;
                akzx akzxVarM = defpackage.uts.a.m();
                boolean zIsPresent = optional.isPresent();
                java.lang.String str2 = str;
                if (!zIsPresent) {
                    akzx akzxVarM2 = defpackage.utw.a.m();
                    java.lang.String strBS = afsq.bS(str2, "activated");
                    akzxVarM2.u();
                    defpackage.utw utwVar = (defpackage.utw) akzxVarM2.b;
                    j$.util.Objects.requireNonNull(strBS);
                    utwVar.b |= 1;
                    utwVar.c = strBS;
                    akzxVarM2.u();
                    defpackage.utw utwVar2 = (defpackage.utw) akzxVarM2.b;
                    j$.util.Objects.requireNonNull("false");
                    utwVar2.b |= 2;
                    utwVar2.d = "false";
                    akzxVarM.U((defpackage.utw) akzxVarM2.p());
                    return (defpackage.uts) akzxVarM.p();
                }
                int size = ((defpackage.xac) optional.orElseThrow()).c.size();
                defpackage.utw utwVar3 = defpackage.utw.a;
                akzx akzxVarM3 = utwVar3.m();
                java.lang.String strBS2 = afsq.bS(str2, "activated");
                akzxVarM3.u();
                defpackage.utw utwVar4 = (defpackage.utw) akzxVarM3.b;
                j$.util.Objects.requireNonNull(strBS2);
                utwVar4.b |= 1;
                utwVar4.c = strBS2;
                java.lang.String string = java.lang.Boolean.toString(size > 0);
                akzxVarM3.u();
                defpackage.utw utwVar5 = (defpackage.utw) akzxVarM3.b;
                j$.util.Objects.requireNonNull(string);
                utwVar5.b |= 2;
                utwVar5.d = string;
                akzxVarM.U((defpackage.utw) akzxVarM3.p());
                if (size == 0) {
                    return (defpackage.uts) akzxVarM.p();
                }
                akzx akzxVarM4 = utwVar3.m();
                java.lang.String strBS3 = afsq.bS(str2, "num_sessions");
                akzxVarM4.u();
                defpackage.utw utwVar6 = (defpackage.utw) akzxVarM4.b;
                j$.util.Objects.requireNonNull(strBS3);
                utwVar6.b |= 1;
                utwVar6.c = strBS3;
                java.lang.String strValueOf = java.lang.String.valueOf(size);
                akzxVarM4.u();
                defpackage.utw utwVar7 = (defpackage.utw) akzxVarM4.b;
                j$.util.Objects.requireNonNull(strValueOf);
                utwVar7.b |= 2;
                utwVar7.d = strValueOf;
                akzxVarM.U((defpackage.utw) akzxVarM4.p());
                if (size > 0) {
                    akzx akzxVarM5 = utwVar3.m();
                    java.lang.String strBS4 = afsq.bS(str2, "model_version");
                    akzxVarM5.u();
                    defpackage.utw utwVar8 = (defpackage.utw) akzxVarM5.b;
                    j$.util.Objects.requireNonNull(strBS4);
                    utwVar8.b |= 1;
                    utwVar8.c = strBS4;
                    java.lang.String str3 = ((defpackage.wvi) ((defpackage.xac) optional.orElseThrow()).c.get(0)).g;
                    akzxVarM5.u();
                    defpackage.utw utwVar9 = (defpackage.utw) akzxVarM5.b;
                    j$.util.Objects.requireNonNull(str3);
                    utwVar9.b |= 2;
                    utwVar9.d = str3;
                    akzxVarM.U((defpackage.utw) akzxVarM5.p());
                }
                akzx akzxVarM6 = utwVar3.m();
                java.lang.String strBS5 = afsq.bS(str2, "disconnect_reason");
                akzxVarM6.u();
                defpackage.utw utwVar10 = (defpackage.utw) akzxVarM6.b;
                j$.util.Objects.requireNonNull(strBS5);
                utwVar10.b |= 1;
                utwVar10.c = strBS5;
                defpackage.wyb wybVar = ((defpackage.xac) optional.orElseThrow()).f;
                if (wybVar == null) {
                    wybVar = defpackage.wyb.a;
                }
                int iAd = a.ad(wybVar.d);
                if (iAd == 0) {
                    iAd = 1;
                }
                akzxVarM6.u();
                defpackage.utw utwVar11 = (defpackage.utw) akzxVarM6.b;
                java.lang.String strP = a.P(iAd);
                j$.util.Objects.requireNonNull(strP);
                utwVar11.b |= 2;
                utwVar11.d = strP;
                akzxVarM.U((defpackage.utw) akzxVarM6.p());
                akzx akzxVarM7 = utwVar3.m();
                java.lang.String strBS6 = afsq.bS(str2, "upload_id");
                akzxVarM7.u();
                defpackage.utw utwVar12 = (defpackage.utw) akzxVarM7.b;
                j$.util.Objects.requireNonNull(strBS6);
                utwVar12.b |= 1;
                utwVar12.c = strBS6;
                java.lang.String str4 = ((defpackage.xac) optional.orElseThrow()).i;
                akzxVarM7.u();
                defpackage.utw utwVar13 = (defpackage.utw) akzxVarM7.b;
                j$.util.Objects.requireNonNull(str4);
                utwVar13.b |= 2;
                utwVar13.d = str4;
                akzxVarM.U((defpackage.utw) akzxVarM7.p());
                return (defpackage.uts) akzxVarM.p();
            }
        }, ajctVar);
    }

    @Override // defpackage.utx
    public final ajcq e(long j) {
        return ahrv.g(this.b.f(j)).h(new defpackage.wzj(5), this.h);
    }

    @Override // defpackage.utx
    public final ajcq f(final defpackage.utu utuVar) {
        return ahrv.g(this.b.f(utuVar.c)).h(new ahyc() { // from class: wzo
            public final java.lang.Object apply(java.lang.Object obj) {
                int i;
                j$.util.Optional optional = (j$.util.Optional) obj;
                if (!optional.isPresent()) {
                    return aike.a;
                }
                if (((defpackage.wyz) optional.orElseThrow()).d == null) {
                    return aike.a;
                }
                aift aiftVar = new aift(4);
                java.util.Iterator it = ((defpackage.wyz) optional.orElseThrow()).d.c.iterator();
                while (true) {
                    i = 2;
                    if (!it.hasNext()) {
                        break;
                    }
                    for (defpackage.wvh wvhVar : ((defpackage.wvi) it.next()).c) {
                        defpackage.wwf wwfVar = wvhVar.c;
                        if (wwfVar == null) {
                            wwfVar = defpackage.wwf.a;
                        }
                        if (wwfVar.b == 3) {
                            akzx akzxVarM = defpackage.uva.a.m();
                            alcf alcfVarE = aldi.e(wvhVar.d);
                            akzxVarM.u();
                            defpackage.uva uvaVar = (defpackage.uva) akzxVarM.b;
                            j$.util.Objects.requireNonNull(alcfVarE);
                            uvaVar.e = alcfVarE;
                            uvaVar.b |= 1;
                            akzx akzxVarM2 = defpackage.uub.a.m();
                            defpackage.wwf wwfVar2 = wvhVar.c;
                            if (wwfVar2 == null) {
                                wwfVar2 = defpackage.wwf.a;
                            }
                            defpackage.wwa wwaVar = wwfVar2.b == 3 ? (defpackage.wwa) wwfVar2.c : defpackage.wwa.a;
                            defpackage.wvy wvyVar = wwaVar.c == 4 ? (defpackage.wvy) wwaVar.d : defpackage.wvy.a;
                            defpackage.utu utuVar2 = utuVar;
                            java.lang.String str = wvyVar.c;
                            akzxVarM2.u();
                            defpackage.uub uubVar = (defpackage.uub) akzxVarM2.b;
                            j$.util.Objects.requireNonNull(str);
                            uubVar.b |= 1;
                            uubVar.c = str;
                            defpackage.abwd abwdVar = utuVar2.d;
                            if (abwdVar == null) {
                                abwdVar = defpackage.abwd.a;
                            }
                            akzxVarM2.u();
                            defpackage.uub uubVar2 = (defpackage.uub) akzxVarM2.b;
                            j$.util.Objects.requireNonNull(abwdVar);
                            uubVar2.d = abwdVar;
                            uubVar2.b |= 2;
                            defpackage.uub uubVar3 = (defpackage.uub) akzxVarM2.p();
                            akzxVarM.u();
                            defpackage.uva uvaVar2 = (defpackage.uva) akzxVarM.b;
                            j$.util.Objects.requireNonNull(uubVar3);
                            uvaVar2.d = uubVar3;
                            uvaVar2.c = 2;
                            aiftVar.i((defpackage.uva) akzxVarM.p());
                        }
                        defpackage.wwf wwfVar3 = wvhVar.c;
                        if ((wwfVar3 == null ? defpackage.wwf.a : wwfVar3).b == 1) {
                            if (wwfVar3 == null) {
                                wwfVar3 = defpackage.wwf.a;
                            }
                            defpackage.wxk wxkVarB = defpackage.wxk.b((wwfVar3.b == 1 ? (defpackage.wxh) wwfVar3.c : defpackage.wxh.a).c);
                            if (wxkVarB == null) {
                                wxkVarB = defpackage.wxk.UNKNOWN_SOUND_EVENT_TYPE;
                            }
                            if (wxkVarB == defpackage.wxk.MUSIC) {
                                akzx akzxVarM3 = defpackage.uva.a.m();
                                alcf alcfVarE2 = aldi.e(wvhVar.d);
                                akzxVarM3.u();
                                defpackage.uva uvaVar3 = (defpackage.uva) akzxVarM3.b;
                                j$.util.Objects.requireNonNull(alcfVarE2);
                                uvaVar3.e = alcfVarE2;
                                uvaVar3.b |= 1;
                                defpackage.uua uuaVar = defpackage.uua.a;
                                akzxVarM3.u();
                                defpackage.uva uvaVar4 = (defpackage.uva) akzxVarM3.b;
                                j$.util.Objects.requireNonNull(uuaVar);
                                uvaVar4.d = uuaVar;
                                uvaVar4.c = 3;
                                aiftVar.i((defpackage.uva) akzxVarM3.p());
                            }
                        }
                    }
                }
                defpackage.wxp wxpVar = ((defpackage.wyz) optional.orElseThrow()).c;
                if ((wxpVar.b & 1) != 0) {
                    defpackage.wyb wybVar = wxpVar.c;
                    if (wybVar == null) {
                        wybVar = defpackage.wyb.a;
                    }
                    int iAd = a.ad(wybVar.d);
                    if (iAd == 0) {
                        iAd = 1;
                    }
                    if (iAd == 3 || iAd == 4) {
                        i = iAd;
                    } else if (iAd == 2) {
                    }
                    akzx akzxVarM4 = defpackage.uva.a.m();
                    defpackage.wyb wybVar2 = wxpVar.c;
                    if (wybVar2 == null) {
                        wybVar2 = defpackage.wyb.a;
                    }
                    defpackage.wzp wzpVar = this.a;
                    alcf alcfVarE3 = aldi.e(wybVar2.c);
                    akzxVarM4.u();
                    defpackage.uva uvaVar5 = (defpackage.uva) akzxVarM4.b;
                    j$.util.Objects.requireNonNull(alcfVarE3);
                    uvaVar5.e = alcfVarE3;
                    uvaVar5.b |= 1;
                    akzx akzxVarM5 = defpackage.utz.a.m();
                    java.lang.String string = wzpVar.c.f(i, wxpVar.f).toString();
                    akzxVarM5.u();
                    defpackage.utz utzVar = (defpackage.utz) akzxVarM5.b;
                    j$.util.Objects.requireNonNull(string);
                    utzVar.b |= 1;
                    utzVar.c = string;
                    defpackage.utz utzVar2 = (defpackage.utz) akzxVarM5.p();
                    akzxVarM4.u();
                    defpackage.uva uvaVar6 = (defpackage.uva) akzxVarM4.b;
                    j$.util.Objects.requireNonNull(utzVar2);
                    uvaVar6.d = utzVar2;
                    uvaVar6.c = 4;
                    aiftVar.i((defpackage.uva) akzxVarM4.p());
                }
                return aiftVar.h();
            }
        }, this.h);
    }

    @Override // defpackage.utx
    public final /* synthetic */ ajcq g(long j) {
        return wsc.bl();
    }

    @Override // defpackage.utx
    public final /* synthetic */ ajcq h(long j) {
        return wsc.bm();
    }

    @Override // defpackage.utx
    public final /* synthetic */ j$.util.Optional i(long j) {
        return j$.util.Optional.empty();
    }

    @Override // defpackage.utx
    public final j$.util.Optional j(defpackage.uuh uuhVar) {
        int iOrdinal = uuhVar.ordinal();
        if (iOrdinal == 0) {
            return j$.util.Optional.of(this.g);
        }
        if (iOrdinal != 1) {
            return iOrdinal != 2 ? j$.util.Optional.empty() : j$.util.Optional.of(this.d);
        }
        return j$.util.Optional.of(this.f);
    }

    @Override // defpackage.utx
    public final /* synthetic */ ajcq k() {
        return wsc.bk();
    }

    @Override // defpackage.utx
    public final ajcq l(long j, int i) {
        akzx akzxVarM = defpackage.wxp.a.m();
        akzxVarM.u();
        defpackage.wxp wxpVar = (defpackage.wxp) akzxVarM.b;
        wxpVar.b |= 32;
        wxpVar.g = false;
        akzxVarM.u();
        defpackage.wxp wxpVar2 = (defpackage.wxp) akzxVarM.b;
        wxpVar2.b |= 128;
        wxpVar2.i = false;
        akzxVarM.u();
        defpackage.wxp wxpVar3 = (defpackage.wxp) akzxVarM.b;
        wxpVar3.b |= 64;
        wxpVar3.h = false;
        return this.b.g(j, (defpackage.wxp) akzxVarM.p());
    }
}
