package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class jet extends aomh implements aonj {
    int a;
    final /* synthetic */ defpackage.jfc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jet(defpackage.jfc jfcVar, aoln aolnVar) {
        super(1, aolnVar);
        this.b = jfcVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        return new defpackage.jet(this.b, (aoln) obj).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:22:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:30:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:33:0x010f  */
    /* JADX WARN: Code duplicated, block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:? A[RETURN, SYNTHETIC] */
    public final java.lang.Object b(java.lang.Object obj) {
        defpackage.jfc jfcVar;
        defpackage.jfc jfcVar2;
        aolu aoluVar = aolu.a;
        int i = this.a;
        aooc.af(obj);
        switch (i) {
            case 0:
                defpackage.jfc jfcVar3 = this.b;
                this.a = 1;
                obj = jfcVar3.t.j(this);
                if (obj == aoluVar) {
                    return aoluVar;
                }
            case 1:
                defpackage.jhb jhbVarB = defpackage.jhb.b(((defpackage.jhc) obj).c);
                if (jhbVarB == null) {
                    jhbVarB = defpackage.jhb.UNRECOGNIZED;
                }
                switch (jhbVarB) {
                    case NOT_SET:
                    case ELIGIBILITY_FAILED:
                    case ELIGIBILITY_PASSED:
                        defpackage.jfc.a.b().l("com/android/dialer/beesly/impl/v2/service/BeeslyLifecycleControllerV2", "answerCall$<anonymous>", 495, "BeeslyLifecycleControllerV2.kt").v("Answering call when Beesly not triggered.");
                        defpackage.jfc jfcVar4 = this.b;
                        if (jfcVar4.p.o()) {
                            ajcq ajcqVarG = jfcVar4.o.g(false);
                            this.a = 8;
                            obj = aosv.D(ajcqVarG, this);
                            if (obj == aoluVar) {
                                return aoluVar;
                            }
                            return aojh.a;
                        }
                        ajcq ajcqVarB = jfcVar4.o.b();
                        this.a = 9;
                        obj = aosv.D(ajcqVarB, this);
                        if (obj == aoluVar) {
                            return aoluVar;
                        }
                        return aojh.a;
                    case ACTIVATING_BACKGROUND:
                    case ACTIVE_BACKGROUND:
                        defpackage.jfc jfcVar5 = this.b;
                        defpackage.jhb jhbVar = defpackage.jhb.ANSWERING_BACKGROUND;
                        this.a = 2;
                        if (jfcVar5.m(jhbVar, this) == aoluVar) {
                            return aoluVar;
                        }
                        defpackage.jfc.a.b().l("com/android/dialer/beesly/impl/v2/service/BeeslyLifecycleControllerV2", "answerCall$<anonymous>", 469, "BeeslyLifecycleControllerV2.kt").v("Answering call in background");
                        jfcVar = this.b;
                        if (jfcVar.p.o()) {
                            ajcq ajcqVarG2 = jfcVar.o.g(false);
                            this.a = 3;
                            obj = aosv.D(ajcqVarG2, this);
                            if (obj == aoluVar) {
                                return aoluVar;
                            }
                            defpackage.jfc jfcVar6 = this.b;
                            aoov.an(jfcVar6.e, (aolr) null, 0, new defpackage.jeb(jfcVar6, (aoln) null, 3), 3);
                            return aojh.a;
                        }
                        ajcq ajcqVarB2 = jfcVar.o.b();
                        this.a = 4;
                        obj = aosv.D(ajcqVarB2, this);
                        if (obj == aoluVar) {
                            return aoluVar;
                        }
                        defpackage.jfc jfcVar7 = this.b;
                        aoov.an(jfcVar7.e, (aolr) null, 0, new defpackage.jeb(jfcVar7, (aoln) null, 3), 3);
                        return aojh.a;
                    case ACTIVATING_FOREGROUND:
                    case ACTIVE_FOREGROUND:
                        defpackage.jfc jfcVar8 = this.b;
                        defpackage.jhb jhbVar2 = defpackage.jhb.ANSWERING_FOREGROUND;
                        this.a = 5;
                        if (jfcVar8.m(jhbVar2, this) == aoluVar) {
                            return aoluVar;
                        }
                        defpackage.jfc.a.b().l("com/android/dialer/beesly/impl/v2/service/BeeslyLifecycleControllerV2", "answerCall$<anonymous>", 482, "BeeslyLifecycleControllerV2.kt").v("Answering call in foreground");
                        jfcVar2 = this.b;
                        if (jfcVar2.p.o()) {
                            ajcq ajcqVarG3 = jfcVar2.o.g(false);
                            this.a = 6;
                            obj = aosv.D(ajcqVarG3, this);
                            if (obj == aoluVar) {
                                return aoluVar;
                            }
                            defpackage.jfc jfcVar9 = this.b;
                            aoov.an(jfcVar9.e, (aolr) null, 0, new defpackage.jeb(jfcVar9, (aoln) null, 4, (byte[]) null), 3);
                            return aojh.a;
                        }
                        ajcq ajcqVarB3 = jfcVar2.o.b();
                        this.a = 7;
                        obj = aosv.D(ajcqVarB3, this);
                        if (obj == aoluVar) {
                            return aoluVar;
                        }
                        defpackage.jfc jfcVar10 = this.b;
                        aoov.an(jfcVar10.e, (aolr) null, 0, new defpackage.jeb(jfcVar10, (aoln) null, 4, (byte[]) null), 3);
                        return aojh.a;
                    case ANSWERED:
                        defpackage.jfc.a.b().l("com/android/dialer/beesly/impl/v2/service/BeeslyLifecycleControllerV2", "answerCall$<anonymous>", 503, "BeeslyLifecycleControllerV2.kt").v("Call is already answered.");
                        return aojh.a;
                    case DISCONNECTED:
                    default:
                        defpackage.jfc.a.d().l("com/android/dialer/beesly/impl/v2/service/BeeslyLifecycleControllerV2", "answerCall$<anonymous>", 510, "BeeslyLifecycleControllerV2.kt").y("Can't answer call in state %s", jhbVarB.name());
                        return aojh.a;
                    case ANSWERING_BACKGROUND:
                    case ANSWERING_FOREGROUND:
                        defpackage.jfc.a.b().l("com/android/dialer/beesly/impl/v2/service/BeeslyLifecycleControllerV2", "answerCall$<anonymous>", 507, "BeeslyLifecycleControllerV2.kt").v("Call is already being answered.");
                        return aojh.a;
                }
            case 2:
                defpackage.jfc.a.b().l("com/android/dialer/beesly/impl/v2/service/BeeslyLifecycleControllerV2", "answerCall$<anonymous>", 469, "BeeslyLifecycleControllerV2.kt").v("Answering call in background");
                jfcVar = this.b;
                if (jfcVar.p.o()) {
                    ajcq ajcqVarG4 = jfcVar.o.g(false);
                    this.a = 3;
                    obj = aosv.D(ajcqVarG4, this);
                    if (obj == aoluVar) {
                        return aoluVar;
                    }
                    defpackage.jfc jfcVar11 = this.b;
                    aoov.an(jfcVar11.e, (aolr) null, 0, new defpackage.jeb(jfcVar11, (aoln) null, 3), 3);
                    return aojh.a;
                }
                ajcq ajcqVarB4 = jfcVar.o.b();
                this.a = 4;
                obj = aosv.D(ajcqVarB4, this);
                if (obj == aoluVar) {
                    return aoluVar;
                }
                defpackage.jfc jfcVar12 = this.b;
                aoov.an(jfcVar12.e, (aolr) null, 0, new defpackage.jeb(jfcVar12, (aoln) null, 3), 3);
                return aojh.a;
            case 3:
                defpackage.jfc jfcVar13 = this.b;
                aoov.an(jfcVar13.e, (aolr) null, 0, new defpackage.jeb(jfcVar13, (aoln) null, 3), 3);
                return aojh.a;
            case 4:
                defpackage.jfc jfcVar14 = this.b;
                aoov.an(jfcVar14.e, (aolr) null, 0, new defpackage.jeb(jfcVar14, (aoln) null, 3), 3);
                return aojh.a;
            case 5:
                defpackage.jfc.a.b().l("com/android/dialer/beesly/impl/v2/service/BeeslyLifecycleControllerV2", "answerCall$<anonymous>", 482, "BeeslyLifecycleControllerV2.kt").v("Answering call in foreground");
                jfcVar2 = this.b;
                if (jfcVar2.p.o()) {
                    ajcq ajcqVarG5 = jfcVar2.o.g(false);
                    this.a = 6;
                    obj = aosv.D(ajcqVarG5, this);
                    if (obj == aoluVar) {
                        return aoluVar;
                    }
                    defpackage.jfc jfcVar15 = this.b;
                    aoov.an(jfcVar15.e, (aolr) null, 0, new defpackage.jeb(jfcVar15, (aoln) null, 4, (byte[]) null), 3);
                    return aojh.a;
                }
                ajcq ajcqVarB5 = jfcVar2.o.b();
                this.a = 7;
                obj = aosv.D(ajcqVarB5, this);
                if (obj == aoluVar) {
                    return aoluVar;
                }
                defpackage.jfc jfcVar16 = this.b;
                aoov.an(jfcVar16.e, (aolr) null, 0, new defpackage.jeb(jfcVar16, (aoln) null, 4, (byte[]) null), 3);
                return aojh.a;
            case 6:
                defpackage.jfc jfcVar17 = this.b;
                aoov.an(jfcVar17.e, (aolr) null, 0, new defpackage.jeb(jfcVar17, (aoln) null, 4, (byte[]) null), 3);
                return aojh.a;
            case 7:
                defpackage.jfc jfcVar18 = this.b;
                aoov.an(jfcVar18.e, (aolr) null, 0, new defpackage.jeb(jfcVar18, (aoln) null, 4, (byte[]) null), 3);
                return aojh.a;
            case 8:
                return aojh.a;
            default:
                return aojh.a;
        }
    }
}
