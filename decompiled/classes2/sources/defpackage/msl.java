package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class msl implements defpackage.lnq {
    public static final aimz a = aimz.i("com/android/dialer/dobby/impl/callscreeningservice/DobbyCallInfoCallResponseVoter");
    public final aolr b;
    public final mnl c;
    private final aoss d;
    private final defpackage.msu e;
    private final mtd f;
    private final mgw g;
    private final aoin h;
    private final kaw i;

    public msl(aolr aolrVar, aoss aossVar, rlv rlvVar, mnl mnlVar, defpackage.msu msuVar, mtd mtdVar, mgw mgwVar, kaw kawVar, aoin aoinVar) {
        aooh.f(aolrVar, "lightweightContext");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(rlvVar, "loggingBindings");
        aooh.f(mtdVar, "dobbyLatestVoteStorage");
        aooh.f(mgwVar, "eventRecoder");
        aooh.f(kawVar, "hasAnotherActiveCallCache");
        aooh.f(aoinVar, "enableHasAnotherActiveCallCache");
        this.b = aolrVar;
        this.d = aossVar;
        this.c = mnlVar;
        this.e = msuVar;
        this.f = mtdVar;
        this.g = mgwVar;
        this.i = kawVar;
        this.h = aoinVar;
    }

    static /* synthetic */ java.lang.Object d(defpackage.msl mslVar, defpackage.mte mteVar, aoln aolnVar) {
        return mslVar.b(mteVar, defpackage.msz.g, aolnVar);
    }

    @Override // defpackage.lnq
    public final ajcq a(defpackage.lmq lmqVar) {
        aooh.f(lmqVar, "callScreeningDetails");
        return aosv.F(this.d, 0, new defpackage.msi(this, lmqVar, (aoln) null, 0), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(defpackage.mte mteVar, defpackage.msz mszVar, aoln aolnVar) {
        defpackage.msh mshVar;
        if (aolnVar instanceof defpackage.msh) {
            mshVar = (defpackage.msh) aolnVar;
            int i = mshVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mshVar.c = i - Integer.MIN_VALUE;
            } else {
                mshVar = new defpackage.msh(this, aolnVar);
            }
        } else {
            mshVar = new defpackage.msh(this, aolnVar);
        }
        java.lang.Object obj = mshVar.a;
        aolu aoluVar = aolu.a;
        int i2 = mshVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            a.b().j(zct.a, java.lang.Boolean.TRUE).l("com/android/dialer/dobby/impl/callscreeningservice/DobbyCallInfoCallResponseVoter", "setLatestVoteWithReason", 132, "DobbyCallInfoCallResponseVoter.kt").I("DobbyCallInfoVote:%s, Reason:%s", new aepg(mteVar), new aepg(mszVar));
            mtd mtdVar = this.f;
            mshVar.d = mteVar;
            mshVar.e = mszVar;
            mshVar.c = 1;
            if (mtdVar.b(mteVar, mszVar, mshVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mszVar = mshVar.e;
            mteVar = mshVar.d;
            aooc.af(obj);
        }
        mgw mgwVar = this.g;
        gus.az(new mhc[]{gus.aw("DobbyCallInfoBasedVoter"), gus.aw(mteVar.name()), gus.aw(mszVar.name())});
        mgwVar.c();
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0087  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:36:0x00da  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(defpackage.lmq lmqVar, aoln aolnVar) {
        defpackage.msk mskVar;
        defpackage.mte mteVar;
        defpackage.msz mszVar;
        defpackage.mte mteVar2;
        defpackage.mte mteVar3;
        defpackage.msz mszVar2;
        if (aolnVar instanceof defpackage.msk) {
            mskVar = (defpackage.msk) aolnVar;
            int i = mskVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mskVar.c = i - Integer.MIN_VALUE;
            } else {
                mskVar = new defpackage.msk(this, aolnVar);
            }
        } else {
            mskVar = new defpackage.msk(this, aolnVar);
        }
        java.lang.Object objA = mskVar.a;
        aolu aoluVar = aolu.a;
        boolean z = true;
        switch (mskVar.c) {
            case 0:
                aooc.af(objA);
                defpackage.msu msuVar = this.e;
                if (msuVar.c()) {
                    a.b().l("com/android/dialer/dobby/impl/callscreeningservice/DobbyCallInfoCallResponseVoter", "shouldRejectWhenSupportsManualScreeningOnly", 95, "DobbyCallInfoCallResponseVoter.kt").v("already screening another call, rejecting");
                    defpackage.mte mteVar4 = defpackage.mte.VOTE_REJECT;
                    defpackage.msz mszVar3 = defpackage.msz.a;
                    mskVar.c = 1;
                    if (b(mteVar4, mszVar3, mskVar) == aoluVar) {
                        return aoluVar;
                    }
                } else {
                    mskVar.d = lmqVar;
                    mskVar.c = 2;
                    objA = msuVar.a(mskVar);
                    if (objA == aoluVar) {
                        return aoluVar;
                    }
                    if (((java.lang.Boolean) objA).booleanValue()) {
                        a.b().l("com/android/dialer/dobby/impl/callscreeningservice/DobbyCallInfoCallResponseVoter", "shouldRejectWhenSupportsManualScreeningOnly", 105, "DobbyCallInfoCallResponseVoter.kt").v("there's another active call, passing to user");
                        if (((java.lang.Boolean) this.h.a()).booleanValue()) {
                            this.i.s(aa$.ExternalSyntheticApiModelOutline0.m(lmqVar.a));
                        }
                        mteVar = defpackage.mte.VOTE_PASS_TO_USER;
                        mszVar = defpackage.msz.d;
                        mskVar.d = null;
                        mskVar.c = 3;
                        if (b(mteVar, mszVar, mskVar) == aoluVar) {
                            return aoluVar;
                        }
                    } else {
                        defpackage.msu msuVar2 = this.e;
                        android.telecom.Call.Details details = lmqVar.a;
                        mskVar.d = null;
                        mskVar.c = 4;
                        objA = msuVar2.b(details, mskVar);
                        if (objA == aoluVar) {
                            return aoluVar;
                        }
                        if (((java.lang.Boolean) objA).booleanValue()) {
                            mteVar3 = defpackage.mte.VOTE_PASS_TO_USER;
                            mszVar2 = defpackage.msz.e;
                            mskVar.c = 5;
                            if (b(mteVar3, mszVar2, mskVar) == aoluVar) {
                                return aoluVar;
                            }
                        } else {
                            mteVar2 = defpackage.mte.VOTE_PASS_TO_USER;
                            mskVar.c = 6;
                            if (d(this, mteVar2, mskVar) == aoluVar) {
                                return aoluVar;
                            }
                        }
                    }
                    z = false;
                }
                return java.lang.Boolean.valueOf(z);
            case 1:
                aooc.af(objA);
                return java.lang.Boolean.valueOf(z);
            case 2:
                lmqVar = mskVar.d;
                aooc.af(objA);
                if (((java.lang.Boolean) objA).booleanValue()) {
                    a.b().l("com/android/dialer/dobby/impl/callscreeningservice/DobbyCallInfoCallResponseVoter", "shouldRejectWhenSupportsManualScreeningOnly", 105, "DobbyCallInfoCallResponseVoter.kt").v("there's another active call, passing to user");
                    if (((java.lang.Boolean) this.h.a()).booleanValue()) {
                        this.i.s(aa$.ExternalSyntheticApiModelOutline0.m(lmqVar.a));
                    }
                    mteVar = defpackage.mte.VOTE_PASS_TO_USER;
                    mszVar = defpackage.msz.d;
                    mskVar.d = null;
                    mskVar.c = 3;
                    if (b(mteVar, mszVar, mskVar) == aoluVar) {
                        return aoluVar;
                    }
                } else {
                    defpackage.msu msuVar3 = this.e;
                    android.telecom.Call.Details details2 = lmqVar.a;
                    mskVar.d = null;
                    mskVar.c = 4;
                    objA = msuVar3.b(details2, mskVar);
                    if (objA == aoluVar) {
                        return aoluVar;
                    }
                    if (((java.lang.Boolean) objA).booleanValue()) {
                        mteVar3 = defpackage.mte.VOTE_PASS_TO_USER;
                        mszVar2 = defpackage.msz.e;
                        mskVar.c = 5;
                        if (b(mteVar3, mszVar2, mskVar) == aoluVar) {
                            return aoluVar;
                        }
                    } else {
                        mteVar2 = defpackage.mte.VOTE_PASS_TO_USER;
                        mskVar.c = 6;
                        if (d(this, mteVar2, mskVar) == aoluVar) {
                            return aoluVar;
                        }
                    }
                }
                z = false;
                return java.lang.Boolean.valueOf(z);
            case 3:
            case 5:
            case 6:
                aooc.af(objA);
                z = false;
                return java.lang.Boolean.valueOf(z);
            case 4:
                aooc.af(objA);
                if (((java.lang.Boolean) objA).booleanValue()) {
                    mteVar3 = defpackage.mte.VOTE_PASS_TO_USER;
                    mszVar2 = defpackage.msz.e;
                    mskVar.c = 5;
                    if (b(mteVar3, mszVar2, mskVar) == aoluVar) {
                        return aoluVar;
                    }
                } else {
                    mteVar2 = defpackage.mte.VOTE_PASS_TO_USER;
                    mskVar.c = 6;
                    if (d(this, mteVar2, mskVar) == aoluVar) {
                        return aoluVar;
                    }
                }
                z = false;
                return java.lang.Boolean.valueOf(z);
            default:
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object e(aoln aolnVar) {
        defpackage.msj msjVar;
        if (aolnVar instanceof defpackage.msj) {
            msjVar = (defpackage.msj) aolnVar;
            int i = msjVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                msjVar.c = i - Integer.MIN_VALUE;
            } else {
                msjVar = new defpackage.msj(this, aolnVar);
            }
        } else {
            msjVar = new defpackage.msj(this, aolnVar);
        }
        java.lang.Object obj = msjVar.a;
        aolu aoluVar = aolu.a;
        int i2 = msjVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            defpackage.mte mteVar = defpackage.mte.VOTE_PASS_TO_USER;
            msjVar.c = 1;
            if (d(this, mteVar, msjVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(obj);
        }
        return java.lang.Boolean.FALSE;
    }
}
