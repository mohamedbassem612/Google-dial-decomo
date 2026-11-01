package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class jez extends aomh implements aonj {
    int a;
    final /* synthetic */ defpackage.jfc b;
    final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jez(defpackage.jfc jfcVar, int i, aoln aolnVar) {
        super(1, aolnVar);
        this.b = jfcVar;
        this.c = i;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        return new defpackage.jez(this.b, this.c, (aoln) obj).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x007d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0085  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:34:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:40:0x012a  */
    /* JADX WARN: Code duplicated, block: B:41:0x0134 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0136  */
    /* JADX WARN: Code duplicated, block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    public final java.lang.Object b(java.lang.Object obj) {
        java.lang.Object objJ;
        defpackage.jhb jhbVarB;
        defpackage.jhb jhbVar;
        defpackage.jfc jfcVar;
        java.lang.Object objX;
        defpackage.jfc jfcVar2;
        defpackage.jhb jhbVar2;
        int i;
        aolu aoluVar = aolu.a;
        int i2 = this.a;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    aooc.af(obj);
                    objJ = obj;
                    jhbVarB = defpackage.jhb.b(((defpackage.jhc) objJ).c);
                    if (jhbVarB == null) {
                        jhbVarB = defpackage.jhb.UNRECOGNIZED;
                    }
                    jhbVar = defpackage.jhb.ELIGIBILITY_PASSED;
                    jfcVar = this.b;
                    if (jhbVarB != jhbVar) {
                        aoov.an(jfcVar.e, (aolr) null, 0, new defpackage.hxo(jfcVar, this.c, (aoln) null, 3), 3);
                        defpackage.jfc.a.d().l("com/android/dialer/beesly/impl/v2/service/BeeslyLifecycleControllerV2", "startBackgroundBeesly$<anonymous>", 335, "BeeslyLifecycleControllerV2.kt").y("Can't start Beesly in background in state %s", jhbVarB.name());
                        this.a = 3;
                        if (jfcVar.d(this) == aoluVar) {
                            return aoluVar;
                        }
                    } else {
                        this.a = 4;
                        objX = defpackage.jfc.x(jfcVar.r, this);
                        if (objX == aoluVar) {
                            return aoluVar;
                        }
                        if (!((java.lang.Boolean) objX).booleanValue()) {
                            defpackage.jfc.a.b().l("com/android/dialer/beesly/impl/v2/service/BeeslyLifecycleControllerV2", "startBackgroundBeesly$<anonymous>", 341, "BeeslyLifecycleControllerV2.kt").v("Failed to start Beesly since other takeover feature is running.");
                            defpackage.jfc jfcVar3 = this.b;
                            aoov.an(jfcVar3.e, (aolr) null, 0, new defpackage.jeb(jfcVar3, (aoln) null, 11, (float[]) null), 3);
                            return aojh.a;
                        }
                        defpackage.jfc jfcVar4 = this.b;
                        aoov.an(jfcVar4.e, (aolr) null, 0, new defpackage.hxo(jfcVar4, this.c, (aoln) null, 4, (byte[]) null), 3);
                        defpackage.jfc.a.b().l("com/android/dialer/beesly/impl/v2/service/BeeslyLifecycleControllerV2", "startBackgroundBeesly$<anonymous>", 354, "BeeslyLifecycleControllerV2.kt").y("Call is transitioning to Beesly call, requested minimizing in-call UI; is request processed: %b", jfcVar4.s.a());
                        jfcVar4.o.m();
                        jfcVar2 = this.b;
                        jhbVar2 = defpackage.jhb.ACTIVATING_BACKGROUND;
                        this.a = 6;
                        if (jfcVar2.m(jhbVar2, this) == aoluVar) {
                            return aoluVar;
                        }
                    }
                } else if (i2 != 3) {
                    if (i2 == 4) {
                        aooc.af(obj);
                        objX = obj;
                        if (!((java.lang.Boolean) objX).booleanValue()) {
                            defpackage.jfc.a.b().l("com/android/dialer/beesly/impl/v2/service/BeeslyLifecycleControllerV2", "startBackgroundBeesly$<anonymous>", 341, "BeeslyLifecycleControllerV2.kt").v("Failed to start Beesly since other takeover feature is running.");
                            defpackage.jfc jfcVar5 = this.b;
                            aoov.an(jfcVar5.e, (aolr) null, 0, new defpackage.jeb(jfcVar5, (aoln) null, 11, (float[]) null), 3);
                            return aojh.a;
                        }
                        defpackage.jfc jfcVar6 = this.b;
                        aoov.an(jfcVar6.e, (aolr) null, 0, new defpackage.hxo(jfcVar6, this.c, (aoln) null, 4, (byte[]) null), 3);
                        defpackage.jfc.a.b().l("com/android/dialer/beesly/impl/v2/service/BeeslyLifecycleControllerV2", "startBackgroundBeesly$<anonymous>", 354, "BeeslyLifecycleControllerV2.kt").y("Call is transitioning to Beesly call, requested minimizing in-call UI; is request processed: %b", jfcVar6.s.a());
                        try {
                            jfcVar6.o.m();
                            jfcVar2 = this.b;
                            jhbVar2 = defpackage.jhb.ACTIVATING_BACKGROUND;
                            this.a = 6;
                            if (jfcVar2.m(jhbVar2, this) == aoluVar) {
                                return aoluVar;
                            }
                        } catch (java.lang.IllegalStateException e) {
                            defpackage.jfc.a.b().k(e).l("com/android/dialer/beesly/impl/v2/service/BeeslyLifecycleControllerV2", "startBackgroundBeesly$<anonymous>", 366, "BeeslyLifecycleControllerV2.kt").v("Failed to transition to AUDIO_PROCESSING as the call is not in RINGING or ACTIVE state.");
                            defpackage.jfc jfcVar7 = this.b;
                            if (jfcVar7.p.n()) {
                                jfcVar7.q.a(qbc.co);
                            } else {
                                jfcVar7.q.a(qbc.cl);
                            }
                            this.a = 5;
                            if (jfcVar7.d(this) == aoluVar) {
                                return aoluVar;
                            }
                        }
                    } else if (i2 != 5) {
                        aooc.af(obj);
                    }
                }
                i = this.c;
                if (i == 3) {
                    this.b.q.a(qbc.cj);
                } else if (i == 5) {
                    this.b.q.a(qbc.ck);
                }
            }
            aooc.af(obj);
        } else {
            aooc.af(obj);
            defpackage.jfc jfcVar8 = this.b;
            if (((java.lang.Boolean) jfcVar8.b.a()).booleanValue()) {
                defpackage.jfc.a.b().l("com/android/dialer/beesly/impl/v2/service/BeeslyLifecycleControllerV2", "startBackgroundBeesly$<anonymous>", 324, "BeeslyLifecycleControllerV2.kt").v("Starting Beesly in background.");
                izg izgVar = jfcVar8.t;
                this.a = 2;
                objJ = izgVar.j(this);
                if (objJ == aoluVar) {
                    return aoluVar;
                }
                jhbVarB = defpackage.jhb.b(((defpackage.jhc) objJ).c);
                if (jhbVarB == null) {
                    jhbVarB = defpackage.jhb.UNRECOGNIZED;
                }
                jhbVar = defpackage.jhb.ELIGIBILITY_PASSED;
                jfcVar = this.b;
                if (jhbVarB != jhbVar) {
                    aoov.an(jfcVar.e, (aolr) null, 0, new defpackage.hxo(jfcVar, this.c, (aoln) null, 3), 3);
                    defpackage.jfc.a.d().l("com/android/dialer/beesly/impl/v2/service/BeeslyLifecycleControllerV2", "startBackgroundBeesly$<anonymous>", 335, "BeeslyLifecycleControllerV2.kt").y("Can't start Beesly in background in state %s", jhbVarB.name());
                    this.a = 3;
                    if (jfcVar.d(this) == aoluVar) {
                        return aoluVar;
                    }
                } else {
                    this.a = 4;
                    objX = defpackage.jfc.x(jfcVar.r, this);
                    if (objX == aoluVar) {
                        return aoluVar;
                    }
                    if (!((java.lang.Boolean) objX).booleanValue()) {
                        defpackage.jfc.a.b().l("com/android/dialer/beesly/impl/v2/service/BeeslyLifecycleControllerV2", "startBackgroundBeesly$<anonymous>", 341, "BeeslyLifecycleControllerV2.kt").v("Failed to start Beesly since other takeover feature is running.");
                        defpackage.jfc jfcVar9 = this.b;
                        aoov.an(jfcVar9.e, (aolr) null, 0, new defpackage.jeb(jfcVar9, (aoln) null, 11, (float[]) null), 3);
                        return aojh.a;
                    }
                    defpackage.jfc jfcVar10 = this.b;
                    aoov.an(jfcVar10.e, (aolr) null, 0, new defpackage.hxo(jfcVar10, this.c, (aoln) null, 4, (byte[]) null), 3);
                    defpackage.jfc.a.b().l("com/android/dialer/beesly/impl/v2/service/BeeslyLifecycleControllerV2", "startBackgroundBeesly$<anonymous>", 354, "BeeslyLifecycleControllerV2.kt").y("Call is transitioning to Beesly call, requested minimizing in-call UI; is request processed: %b", jfcVar10.s.a());
                    jfcVar10.o.m();
                    jfcVar2 = this.b;
                    jhbVar2 = defpackage.jhb.ACTIVATING_BACKGROUND;
                    this.a = 6;
                    if (jfcVar2.m(jhbVar2, this) == aoluVar) {
                        return aoluVar;
                    }
                    i = this.c;
                    if (i == 3) {
                        this.b.q.a(qbc.cj);
                    } else if (i == 5) {
                        this.b.q.a(qbc.ck);
                    }
                }
            } else {
                defpackage.jfc jfcVar11 = this.b;
                int i3 = this.c;
                this.a = 1;
                if (jfcVar11.l(i3, this) == aoluVar) {
                    return aoluVar;
                }
            }
        }
        return aojh.a;
    }
}
