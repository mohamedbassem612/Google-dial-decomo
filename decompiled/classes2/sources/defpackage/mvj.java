package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mvj implements rrz {
    private static final aimz b = aimz.i("com/android/dialer/dobby/impl/growthkit/DobbyValidationHomepageMarquee");
    private static final j$.time.Duration c = j$.time.Duration.ofDays(30);
    public final rlv a;
    private final android.content.Context d;
    private final nri e;
    private final nnx f;
    private final aoin g;
    private final rsd h;
    private final rsb i;

    public mvj(android.content.Context context, nri nriVar, nnx nnxVar, aazc aazcVar, rlv rlvVar, aoin aoinVar) {
        aooh.f(context, "appContext");
        aooh.f(nriVar, "dobbyDatabase");
        aooh.f(aazcVar, "clock");
        aooh.f(rlvVar, "loggingBindings");
        aooh.f(aoinVar, "enableMarqueeDynamicLocale");
        this.d = context;
        this.e = nriVar;
        this.f = nnxVar;
        this.a = rlvVar;
        this.g = aoinVar;
        this.h = rsd.d;
        this.i = new rsb(new rsm(14));
    }

    private static final boolean h(defpackage.nsp nspVar) {
        j$.time.Instant instantNow = j$.time.Instant.now();
        aooh.e(instantNow, "instant(...)");
        j$.time.Instant instantOfEpochMilli = j$.time.Instant.ofEpochMilli(nspVar.c);
        aooh.e(instantOfEpochMilli, "ofEpochMilli(...)");
        return defpackage.ajee.b(instantNow, instantOfEpochMilli).compareTo(c) < 0;
    }

    public final rsb a() {
        return this.i;
    }

    public final rsd b() {
        return this.h;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x009a  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:38:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:39:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:42:0x0135  */
    /* JADX WARN: Code duplicated, block: B:43:0x013b  */
    /* JADX WARN: Code duplicated, block: B:46:0x015e  */
    /* JADX WARN: Code duplicated, block: B:47:0x0164  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(aoln aolnVar) {
        defpackage.mvi mviVar;
        int iIntValue;
        java.lang.Object objD;
        int i;
        int iIntValue2;
        aimz aimzVar;
        aoin aoinVar;
        rse rsfVar;
        rse rsfVar2;
        rse rsfVar3;
        if (aolnVar instanceof defpackage.mvi) {
            mviVar = (defpackage.mvi) aolnVar;
            int i2 = mviVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mviVar.d = i2 - Integer.MIN_VALUE;
            } else {
                mviVar = new defpackage.mvi(this, aolnVar);
            }
        } else {
            mviVar = new defpackage.mvi(this, aolnVar);
        }
        java.lang.Object objB = mviVar.b;
        rsh rshVar = aolu.a;
        int i3 = mviVar.d;
        if (i3 == 0) {
            aooc.af(objB);
            nnx nnxVar = this.f;
            mviVar.d = 1;
            objB = nnxVar.b(mviVar);
            if (objB != rshVar) {
            }
            return rshVar;
        }
        if (i3 == 1) {
            aooc.af(objB);
        } else {
            if (i3 == 2) {
                aooc.af(objB);
                iIntValue = ((java.lang.Number) objB).intValue();
                mviVar.a = iIntValue;
                mviVar.d = 3;
                objD = d(mviVar);
                if (objD != rshVar) {
                    i = iIntValue;
                    objB = objD;
                }
                return rshVar;
            }
            if (i3 != 3) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = mviVar.a;
            aooc.af(objB);
        }
        iIntValue2 = i + ((java.lang.Number) objB).intValue();
        aimzVar = b;
        if (iIntValue2 <= 0) {
            aimzVar.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/dobby/impl/growthkit/DobbyValidationHomepageMarquee", "getMarqueeUiModel", 69, "DobbyValidationHomepageMarquee.kt").w("Less than %s blocked calls. Validation banner is disabled", 1);
            return null;
        }
        aimzVar.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/dobby/impl/growthkit/DobbyValidationHomepageMarquee", "getMarqueeUiModel", 76, "DobbyValidationHomepageMarquee.kt").w("Validation banner is enabled with %d blocked calls", iIntValue2);
        aoinVar = this.g;
        if (((java.lang.Boolean) aoinVar.a()).booleanValue()) {
            rsfVar = new rse(2132017867, new java.lang.Integer(iIntValue2));
        } else {
            java.lang.String string = this.d.getResources().getString(2132017867, new java.lang.Integer(iIntValue2));
            aooh.e(string, "getString(...)");
            rsfVar = new rsf(string);
        }
        rsp rspVar = new rsp(rsfVar);
        rry rryVar = new rry(defpackage.abja.aN);
        if (((java.lang.Boolean) aoinVar.a()).booleanValue()) {
            rsfVar2 = new rse(2132017865, (java.lang.Object) null);
        } else {
            java.lang.String string2 = this.d.getString(2132017865);
            aooh.e(string2, "getString(...)");
            rsfVar2 = new rsf(string2);
        }
        rrx rrxVar = new rrx(rsfVar2);
        if (((java.lang.Boolean) aoinVar.a()).booleanValue()) {
            rsfVar3 = new rse(2132017866, (java.lang.Object) null);
        } else {
            java.lang.String string3 = this.d.getString(2132017866);
            aooh.e(string3, "getString(...)");
            rsfVar3 = new rsf(string3);
        }
        rshVar = new rsh(rspVar, rryVar, rrxVar, new rsa(rsfVar3, new defpackage.mtr(this, 5)));
        return rshVar;
        defpackage.noh nohVarB = defpackage.noh.b(((nok) objB).c);
        if (nohVarB == null) {
            nohVarB = defpackage.noh.UNRECOGNIZED;
        }
        if (mni.D(nohVarB)) {
            mviVar.d = 2;
            objB = e(mviVar);
            if (objB != rshVar) {
                iIntValue = ((java.lang.Number) objB).intValue();
                mviVar.a = iIntValue;
                mviVar.d = 3;
                objD = d(mviVar);
                if (objD != rshVar) {
                    i = iIntValue;
                    objB = objD;
                    iIntValue2 = i + ((java.lang.Number) objB).intValue();
                    aimzVar = b;
                    if (iIntValue2 <= 0) {
                        aimzVar.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/dobby/impl/growthkit/DobbyValidationHomepageMarquee", "getMarqueeUiModel", 69, "DobbyValidationHomepageMarquee.kt").w("Less than %s blocked calls. Validation banner is disabled", 1);
                    } else {
                        aimzVar.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/dobby/impl/growthkit/DobbyValidationHomepageMarquee", "getMarqueeUiModel", 76, "DobbyValidationHomepageMarquee.kt").w("Validation banner is enabled with %d blocked calls", iIntValue2);
                        aoinVar = this.g;
                        if (((java.lang.Boolean) aoinVar.a()).booleanValue()) {
                            rsfVar = new rse(2132017867, new java.lang.Integer(iIntValue2));
                        } else {
                            java.lang.String string4 = this.d.getResources().getString(2132017867, new java.lang.Integer(iIntValue2));
                            aooh.e(string4, "getString(...)");
                            rsfVar = new rsf(string4);
                        }
                        rsp rspVar2 = new rsp(rsfVar);
                        rry rryVar2 = new rry(defpackage.abja.aN);
                        if (((java.lang.Boolean) aoinVar.a()).booleanValue()) {
                            rsfVar2 = new rse(2132017865, (java.lang.Object) null);
                        } else {
                            java.lang.String string5 = this.d.getString(2132017865);
                            aooh.e(string5, "getString(...)");
                            rsfVar2 = new rsf(string5);
                        }
                        rrx rrxVar2 = new rrx(rsfVar2);
                        if (((java.lang.Boolean) aoinVar.a()).booleanValue()) {
                            rsfVar3 = new rse(2132017866, (java.lang.Object) null);
                        } else {
                            java.lang.String string6 = this.d.getString(2132017866);
                            aooh.e(string6, "getString(...)");
                            rsfVar3 = new rsf(string6);
                        }
                        rshVar = new rsh(rspVar2, rryVar2, rrxVar2, new rsa(rsfVar3, new defpackage.mtr(this, 5)));
                    }
                }
            }
            return rshVar;
        }
        b.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/dobby/impl/growthkit/DobbyValidationHomepageMarquee", "getMarqueeUiModel", 58, "DobbyValidationHomepageMarquee.kt").v("Auto Screening is disabled. Validation banner is disabled.");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(aoln aolnVar) {
        defpackage.mvg mvgVar;
        if (aolnVar instanceof defpackage.mvg) {
            mvgVar = (defpackage.mvg) aolnVar;
            int i = mvgVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mvgVar.c = i - Integer.MIN_VALUE;
            } else {
                mvgVar = new defpackage.mvg(this, aolnVar);
            }
        } else {
            mvgVar = new defpackage.mvg(this, aolnVar);
        }
        java.lang.Object objG = mvgVar.a;
        aolu aoluVar = aolu.a;
        int i2 = mvgVar.c;
        if (i2 == 0) {
            aooc.af(objG);
            nri nriVar = this.e;
            mvgVar.c = 1;
            objG = nriVar.g(mvgVar);
            if (objG == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objG);
        }
        java.lang.Iterable<defpackage.nsp> iterable = (java.lang.Iterable) objG;
        int i3 = 0;
        if (!(iterable instanceof java.util.Collection) || !((java.util.Collection) iterable).isEmpty()) {
            for (defpackage.nsp nspVar : iterable) {
                defpackage.nsq nsqVar = nspVar.e;
                if (nsqVar == null) {
                    nsqVar = defpackage.nsq.a;
                }
                defpackage.nsm nsmVar = nsqVar.f;
                if (nsmVar == null) {
                    nsmVar = defpackage.nsm.a;
                }
                if (nsmVar.o) {
                    aooh.c(nspVar);
                    if (h(nspVar) && (i3 = i3 + 1) < 0) {
                        ajsz.bg();
                    }
                }
            }
        }
        return new java.lang.Integer(i3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object e(aoln aolnVar) {
        defpackage.mvh mvhVar;
        int iAR;
        if (aolnVar instanceof defpackage.mvh) {
            mvhVar = (defpackage.mvh) aolnVar;
            int i = mvhVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mvhVar.c = i - Integer.MIN_VALUE;
            } else {
                mvhVar = new defpackage.mvh(this, aolnVar);
            }
        } else {
            mvhVar = new defpackage.mvh(this, aolnVar);
        }
        java.lang.Object objG = mvhVar.a;
        aolu aoluVar = aolu.a;
        int i2 = mvhVar.c;
        if (i2 == 0) {
            aooc.af(objG);
            nri nriVar = this.e;
            mvhVar.c = 1;
            objG = nriVar.g(mvhVar);
            if (objG == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objG);
        }
        java.lang.Iterable<defpackage.nsp> iterable = (java.lang.Iterable) objG;
        int i3 = 0;
        if (!(iterable instanceof java.util.Collection) || !((java.util.Collection) iterable).isEmpty()) {
            for (defpackage.nsp nspVar : iterable) {
                defpackage.nsq nsqVar = nspVar.e;
                if (nsqVar == null) {
                    nsqVar = defpackage.nsq.a;
                }
                defpackage.nsm nsmVar = nsqVar.f;
                if (nsmVar == null) {
                    nsmVar = defpackage.nsm.a;
                }
                if (nsmVar.g) {
                    defpackage.nsq nsqVar2 = nspVar.e;
                    if (nsqVar2 == null) {
                        nsqVar2 = defpackage.nsq.a;
                    }
                    defpackage.nsm nsmVar2 = nsqVar2.f;
                    if (nsmVar2 == null) {
                        nsmVar2 = defpackage.nsm.a;
                    }
                    aooh.e(nsmVar2, "getExtraData(...)");
                    if (nsmVar2.c == 5 || ((iAR = a.aR(nsmVar2.i)) != 0 && iAR == 3 && nsmVar2.c == 3)) {
                        aooh.c(nspVar);
                        if (h(nspVar) && (i3 = i3 + 1) < 0) {
                            ajsz.bg();
                        }
                    }
                }
            }
        }
        return new java.lang.Integer(i3);
    }

    public final void g() {
        this.a.o(rmx.kQ);
    }

    public final /* synthetic */ void f() {
    }
}
