package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jnq extends aomh implements aonn {
    private final /* synthetic */ int $cid;
    java.lang.Object a;
    int b;
    final /* synthetic */ java.lang.Object c;
    final /* synthetic */ java.lang.Object d;
    final /* synthetic */ java.lang.Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jnq(aonn aonnVar, svt svtVar, swa swaVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.d = aonnVar;
        this.c = svtVar;
        this.e = swaVar;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.$cid;
        if (i == 0) {
            return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
        if (i == 1) {
            return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
        if (i != 2) {
            return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v10, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r15v4, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22, types: [aonn] */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Set] */
    public final java.lang.Object b(java.lang.Object obj) throws java.lang.Throwable {
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.String str;
        android.app.Notification notification;
        java.lang.Object obj4;
        ?? r1;
        int i = this.$cid;
        int i2 = 1;
        if (i == 0) {
            aolu aoluVar = aolu.a;
            if (this.b == 0) {
                aooc.af(obj);
                obj2 = "CALL_ANNOUNCER_DEFAULT_SETTING_CHANGED";
                if (((defpackage.jnn) this.c).a() && ((java.lang.Boolean) this.d.a()).booleanValue()) {
                    defpackage.ifb ifbVar = (defpackage.ifb) this.e;
                    ajcq ajcqVarB = ((zzx) ifbVar.d).m() ? defpackage.ifb.b() : ahvr.H(((aogc) ifbVar.a).bk(), new defpackage.exn(16), (java.util.concurrent.Executor) ifbVar.c);
                    this.a = "CALL_ANNOUNCER_DEFAULT_SETTING_CHANGED";
                    this.b = 1;
                    obj = aosv.D(ajcqVarB, this);
                    if (obj == aoluVar) {
                        return aoluVar;
                    }
                    obj3 = "CALL_ANNOUNCER_DEFAULT_SETTING_CHANGED";
                } else {
                    i2 = 0;
                    obj3 = obj2;
                }
                return abxl.L((java.lang.String) obj3, i2);
            }
            obj3 = this.a;
            aooc.af(obj);
            if (((java.lang.Boolean) obj).booleanValue()) {
                obj2 = obj3;
                i2 = 0;
                obj3 = obj2;
            }
            return abxl.L((java.lang.String) obj3, i2);
        }
        if (i == 1) {
            aolu aoluVar2 = aolu.a;
            int i3 = this.b;
            if (i3 != 0) {
                java.lang.Object obj5 = this.a;
                if (i3 != 1) {
                    notification = (android.app.Notification) obj5;
                    aooc.af(obj);
                } else {
                    str = (java.lang.String) obj5;
                    aooc.af(obj);
                }
                snl.af(((defpackage.htr) this.c).b, notification);
                return aojh.a;
            }
            aooc.af(obj);
            java.lang.Object obj6 = this.c;
            java.lang.Object obj7 = this.e;
            ?? r4 = this.d;
            rwv rwvVar = (rwv) obj7;
            java.lang.String strS = defpackage.htr.s(rwvVar);
            if (!r4.contains(strS)) {
                this.a = strS;
                this.b = 1;
                obj = ((defpackage.htr) obj6).e(rwvVar, this);
                if (obj == aoluVar2) {
                    return aoluVar2;
                }
                str = strS;
            }
            return aojh.a;
            android.app.Notification notification2 = (android.app.Notification) obj;
            defpackage.hgt.j(notification2);
            ajcq ajcqVarH = ((defpackage.htr) this.c).c.h(str, 1, notification2);
            this.a = notification2;
            this.b = 2;
            if (aosv.D(ajcqVarH, this) == aoluVar2) {
                return aoluVar2;
            }
            notification = notification2;
            snl.af(((defpackage.htr) this.c).b, notification);
            return aojh.a;
        }
        if (i != 2) {
            aolu aoluVar3 = aolu.a;
            int i4 = this.b;
            if (i4 != 0) {
                if (i4 != 1) {
                    aooc.af(obj);
                } else {
                    java.lang.Object obj8 = this.a;
                    aooc.af(obj);
                    r1 = obj8;
                }
                ((swa) this.e).f.a(ajcm.a);
                return obj;
            }
            aooc.af(obj);
            java.lang.Object obj9 = this.d;
            java.lang.Object obj10 = this.c;
            this.a = obj9;
            this.b = 1;
            java.lang.Object objA = ((svt) obj10).a.a(this);
            if (objA == aoluVar3) {
                return aoluVar3;
            }
            r1 = obj9;
            obj = objA;
            this.a = null;
            this.b = 2;
            obj = r1.a(obj, this);
            if (obj == aoluVar3) {
                return aoluVar3;
            }
            ((swa) this.e).f.a(ajcm.a);
            return obj;
        }
        aolu aoluVar4 = aolu.a;
        int i5 = this.b;
        try {
            if (i5 != 0) {
                if (i5 != 1) {
                    obj4 = this.a;
                    aooc.af(obj);
                } else {
                    aooc.af(obj);
                }
                defpackage.nej.a.d().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "cancelActiveDeclineCallTasks$<anonymous>", 859, "DobbyLifecycleController.kt").N("NGCS.cancelActiveDeclineCallTasks(%s): found active declineCall task in sequencer queue, cancelled tasks:%s in state: %s, events: %s", new aepg((aenj) this.e), new aepg((aenj) ((aoot) this.d).a), new aepg((java.lang.Enum) obj4), new aepg((aenj) obj));
                return aojh.a;
            }
            aooc.af(obj);
            defpackage.ogj ogjVar = ((defpackage.nej) this.c).Z;
            this.b = 1;
            obj = ogjVar.a(this);
            if (obj == aoluVar4) {
                return aoluVar4;
            }
            defpackage.nmo nmoVarB = defpackage.nmo.b(((defpackage.nmu) obj).c);
            if (nmoVarB == null) {
                nmoVarB = defpackage.nmo.UNRECOGNIZED;
            }
            defpackage.mqt mqtVar = ((defpackage.nej) this.c).q;
            this.a = nmoVarB;
            this.b = 2;
            java.lang.Object objA2 = mqtVar.a(this);
            if (objA2 == aoluVar4) {
                return aoluVar4;
            }
            obj4 = nmoVarB;
            obj = objA2;
            defpackage.nej.a.d().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "cancelActiveDeclineCallTasks$<anonymous>", 859, "DobbyLifecycleController.kt").N("NGCS.cancelActiveDeclineCallTasks(%s): found active declineCall task in sequencer queue, cancelled tasks:%s in state: %s, events: %s", new aepg((aenj) this.e), new aepg((aenj) ((aoot) this.d).a), new aepg((java.lang.Enum) obj4), new aepg((aenj) obj));
            return aojh.a;
        } catch (java.lang.Throwable th) {
            defpackage.nej.a.d().k(th).l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "cancelActiveDeclineCallTasks$<anonymous>", 870, "DobbyLifecycleController.kt").I("NGCS.cancelActiveDeclineCallTasks(%s): found active declineCall task in sequencer queue, cancelled tasks:%s", new aepg((aenj) this.e), new aepg((aenj) ((aoot) this.d).a));
        }
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.Set] */
    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        int i = this.$cid;
        if (i == 0) {
            return new defpackage.jnq((defpackage.jnn) this.c, (aoin) this.d, (defpackage.ifb) this.e, aolnVar, 0);
        }
        if (i == 1) {
            java.lang.Object obj2 = this.c;
            return new defpackage.jnq((defpackage.htr) obj2, (rwv) this.e, (java.util.Set) this.d, aolnVar, 1);
        }
        if (i != 2) {
            return new defpackage.jnq((aonn) this.d, (svt) this.c, (swa) this.e, aolnVar, 3);
        }
        java.lang.Object obj3 = this.c;
        return new defpackage.jnq((defpackage.nej) obj3, (aenj) this.e, (aoot) this.d, aolnVar, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jnq(defpackage.htr htrVar, rwv rwvVar, java.util.Set set, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = htrVar;
        this.e = rwvVar;
        this.d = set;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jnq(defpackage.jnn jnnVar, aoin aoinVar, defpackage.ifb ifbVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = jnnVar;
        this.d = aoinVar;
        this.e = ifbVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jnq(defpackage.nej nejVar, aenj aenjVar, aoot aootVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = nejVar;
        this.e = aenjVar;
        this.d = aootVar;
    }
}
