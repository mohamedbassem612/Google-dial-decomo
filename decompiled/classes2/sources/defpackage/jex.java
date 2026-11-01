package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jex extends aomh implements aonj {
    java.lang.Object a;
    int b;
    final /* synthetic */ defpackage.jfc c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jex(defpackage.jfc jfcVar, aoln aolnVar) {
        super(1, aolnVar);
        this.c = jfcVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        return new defpackage.jex(this.c, (aoln) obj).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0071  */
    /* JADX WARN: Code duplicated, block: B:20:0x0087  */
    /* JADX WARN: Code duplicated, block: B:24:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:27:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:32:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:43:0x0130  */
    /* JADX WARN: Code duplicated, block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    public final java.lang.Object b(java.lang.Object obj) {
        defpackage.jfc jfcVar;
        java.lang.Object obj2;
        defpackage.jhb jhbVarB;
        defpackage.jfc jfcVar2;
        defpackage.jgk jgkVar;
        long jLongValue;
        defpackage.jeb jebVar;
        defpackage.jfc jfcVar3;
        defpackage.jhb jhbVar;
        defpackage.jfc jfcVar4;
        android.telecom.DisconnectCause disconnectCause;
        aolu aoluVar = aolu.a;
        switch (this.b) {
            case 0:
                aooc.af(obj);
                aimz aimzVar = defpackage.jfc.a;
                aimzVar.b().l("com/android/dialer/beesly/impl/v2/service/BeeslyLifecycleControllerV2", "onCallDisconnected$<anonymous>", 270, "BeeslyLifecycleControllerV2.kt").v("onCallDisconnected");
                defpackage.jfc jfcVar5 = this.c;
                if (jfcVar5.j != 0) {
                    aimzVar.b().l("com/android/dialer/beesly/impl/v2/service/BeeslyLifecycleControllerV2", "onCallDisconnected$<anonymous>", 273, "BeeslyLifecycleControllerV2.kt").v("Skipping handling a non-incoming call");
                    return aojh.a;
                }
                pci pciVar = jfcVar5.r;
                this.b = 1;
                obj = defpackage.jfc.w(pciVar, this);
                if (obj == aoluVar) {
                    return aoluVar;
                }
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    defpackage.jfc.a.b().l("com/android/dialer/beesly/impl/v2/service/BeeslyLifecycleControllerV2", "onCallDisconnected$<anonymous>", 278, "BeeslyLifecycleControllerV2.kt").v("onCallDisconnected: skip since Beesly is not triggered.");
                    return aojh.a;
                }
                jfcVar = this.c;
                this.a = jfcVar;
                this.b = 2;
                obj = jfcVar.t.j(this);
                if (obj == aoluVar) {
                    obj2 = jfcVar;
                    return aoluVar;
                }
                obj2 = jfcVar;
                jhbVarB = defpackage.jhb.b(((defpackage.jhc) obj).c);
                if (jhbVarB == null) {
                    jhbVarB = defpackage.jhb.UNRECOGNIZED;
                }
                if (((defpackage.jfc) obj2).p(jhbVarB)) {
                    jfcVar2 = this.c;
                    if (((java.lang.Boolean) jfcVar2.c.a()).booleanValue()) {
                        defpackage.jfc.a.b().l("com/android/dialer/beesly/impl/v2/service/BeeslyLifecycleControllerV2", "onCallDisconnected$<anonymous>", 285, "BeeslyLifecycleControllerV2.kt").v("onCallDisconnected: awaiting audio recording finalization");
                        java.lang.Object objA = jfcVar2.d.a();
                        aooh.e(objA, "get(...)");
                        jLongValue = ((java.lang.Number) objA).longValue();
                        jebVar = new defpackage.jeb(jfcVar2, (aoln) null, 9, (int[]) null);
                        this.a = null;
                        this.b = 3;
                        if (aooh.M(jLongValue, jebVar, this) == aoluVar) {
                            return aoluVar;
                        }
                    } else {
                        jgkVar = jfcVar2.h;
                        this.a = null;
                        this.b = 4;
                        if (jgkVar.f(this) == aoluVar) {
                            return aoluVar;
                        }
                    }
                    this.c.i.b(mce.gZ);
                }
                jfcVar3 = this.c;
                jhbVar = defpackage.jhb.DISCONNECTED;
                this.a = null;
                this.b = 5;
                if (jfcVar3.m(jhbVar, this) == aoluVar) {
                    return aoluVar;
                }
                jfcVar4 = this.c;
                this.b = 6;
                if (jfcVar4.g.c(this) == aoluVar) {
                    return aoluVar;
                }
                defpackage.jfc jfcVar6 = this.c;
                this.b = 7;
                obj = jfcVar6.e(this);
                if (obj == aoluVar) {
                    return aoluVar;
                }
                disconnectCause = (android.telecom.DisconnectCause) obj;
                if (disconnectCause != null && (disconnectCause.getCode() == 3 || disconnectCause.getCode() == 5)) {
                    this.c.q.a(qbc.oF);
                }
                return aojh.a;
            case 1:
                aooc.af(obj);
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    defpackage.jfc.a.b().l("com/android/dialer/beesly/impl/v2/service/BeeslyLifecycleControllerV2", "onCallDisconnected$<anonymous>", 278, "BeeslyLifecycleControllerV2.kt").v("onCallDisconnected: skip since Beesly is not triggered.");
                    return aojh.a;
                }
                jfcVar = this.c;
                this.a = jfcVar;
                this.b = 2;
                obj = jfcVar.t.j(this);
                if (obj == aoluVar) {
                    obj2 = jfcVar;
                    return aoluVar;
                }
                obj2 = jfcVar;
                jhbVarB = defpackage.jhb.b(((defpackage.jhc) obj).c);
                if (jhbVarB == null) {
                    jhbVarB = defpackage.jhb.UNRECOGNIZED;
                }
                if (((defpackage.jfc) obj2).p(jhbVarB)) {
                    jfcVar2 = this.c;
                    if (((java.lang.Boolean) jfcVar2.c.a()).booleanValue()) {
                        defpackage.jfc.a.b().l("com/android/dialer/beesly/impl/v2/service/BeeslyLifecycleControllerV2", "onCallDisconnected$<anonymous>", 285, "BeeslyLifecycleControllerV2.kt").v("onCallDisconnected: awaiting audio recording finalization");
                        java.lang.Object objA2 = jfcVar2.d.a();
                        aooh.e(objA2, "get(...)");
                        jLongValue = ((java.lang.Number) objA2).longValue();
                        jebVar = new defpackage.jeb(jfcVar2, (aoln) null, 9, (int[]) null);
                        this.a = null;
                        this.b = 3;
                        if (aooh.M(jLongValue, jebVar, this) == aoluVar) {
                            return aoluVar;
                        }
                    } else {
                        jgkVar = jfcVar2.h;
                        this.a = null;
                        this.b = 4;
                        if (jgkVar.f(this) == aoluVar) {
                            return aoluVar;
                        }
                    }
                    this.c.i.b(mce.gZ);
                }
                jfcVar3 = this.c;
                jhbVar = defpackage.jhb.DISCONNECTED;
                this.a = null;
                this.b = 5;
                if (jfcVar3.m(jhbVar, this) == aoluVar) {
                    return aoluVar;
                }
                jfcVar4 = this.c;
                this.b = 6;
                if (jfcVar4.g.c(this) == aoluVar) {
                    return aoluVar;
                }
                defpackage.jfc jfcVar7 = this.c;
                this.b = 7;
                obj = jfcVar7.e(this);
                if (obj == aoluVar) {
                    return aoluVar;
                }
                disconnectCause = (android.telecom.DisconnectCause) obj;
                if (disconnectCause != null) {
                    this.c.q.a(qbc.oF);
                }
                return aojh.a;
            case 2:
                java.lang.Object obj3 = this.a;
                aooc.af(obj);
                obj2 = obj3;
                obj2 = jfcVar;
                jhbVarB = defpackage.jhb.b(((defpackage.jhc) obj).c);
                if (jhbVarB == null) {
                    jhbVarB = defpackage.jhb.UNRECOGNIZED;
                }
                if (((defpackage.jfc) obj2).p(jhbVarB)) {
                    jfcVar2 = this.c;
                    if (((java.lang.Boolean) jfcVar2.c.a()).booleanValue()) {
                        defpackage.jfc.a.b().l("com/android/dialer/beesly/impl/v2/service/BeeslyLifecycleControllerV2", "onCallDisconnected$<anonymous>", 285, "BeeslyLifecycleControllerV2.kt").v("onCallDisconnected: awaiting audio recording finalization");
                        java.lang.Object objA3 = jfcVar2.d.a();
                        aooh.e(objA3, "get(...)");
                        jLongValue = ((java.lang.Number) objA3).longValue();
                        jebVar = new defpackage.jeb(jfcVar2, (aoln) null, 9, (int[]) null);
                        this.a = null;
                        this.b = 3;
                        if (aooh.M(jLongValue, jebVar, this) == aoluVar) {
                            return aoluVar;
                        }
                    } else {
                        jgkVar = jfcVar2.h;
                        this.a = null;
                        this.b = 4;
                        if (jgkVar.f(this) == aoluVar) {
                            return aoluVar;
                        }
                    }
                    this.c.i.b(mce.gZ);
                }
                jfcVar3 = this.c;
                jhbVar = defpackage.jhb.DISCONNECTED;
                this.a = null;
                this.b = 5;
                if (jfcVar3.m(jhbVar, this) == aoluVar) {
                    return aoluVar;
                }
                jfcVar4 = this.c;
                this.b = 6;
                if (jfcVar4.g.c(this) == aoluVar) {
                    return aoluVar;
                }
                defpackage.jfc jfcVar8 = this.c;
                this.b = 7;
                obj = jfcVar8.e(this);
                if (obj == aoluVar) {
                    return aoluVar;
                }
                disconnectCause = (android.telecom.DisconnectCause) obj;
                if (disconnectCause != null) {
                    this.c.q.a(qbc.oF);
                }
                return aojh.a;
            case 3:
            case 4:
                aooc.af(obj);
                this.c.i.b(mce.gZ);
                jfcVar3 = this.c;
                jhbVar = defpackage.jhb.DISCONNECTED;
                this.a = null;
                this.b = 5;
                if (jfcVar3.m(jhbVar, this) == aoluVar) {
                    return aoluVar;
                }
                jfcVar4 = this.c;
                this.b = 6;
                if (jfcVar4.g.c(this) == aoluVar) {
                    return aoluVar;
                }
                defpackage.jfc jfcVar9 = this.c;
                this.b = 7;
                obj = jfcVar9.e(this);
                if (obj == aoluVar) {
                    return aoluVar;
                }
                disconnectCause = (android.telecom.DisconnectCause) obj;
                if (disconnectCause != null) {
                    this.c.q.a(qbc.oF);
                }
                return aojh.a;
            case 5:
                aooc.af(obj);
                jfcVar4 = this.c;
                this.b = 6;
                if (jfcVar4.g.c(this) == aoluVar) {
                    return aoluVar;
                }
                defpackage.jfc jfcVar10 = this.c;
                this.b = 7;
                obj = jfcVar10.e(this);
                if (obj == aoluVar) {
                    return aoluVar;
                }
                disconnectCause = (android.telecom.DisconnectCause) obj;
                if (disconnectCause != null) {
                    this.c.q.a(qbc.oF);
                }
                return aojh.a;
            case 6:
                aooc.af(obj);
                defpackage.jfc jfcVar11 = this.c;
                this.b = 7;
                obj = jfcVar11.e(this);
                if (obj == aoluVar) {
                    return aoluVar;
                }
                disconnectCause = (android.telecom.DisconnectCause) obj;
                if (disconnectCause != null) {
                    this.c.q.a(qbc.oF);
                }
                return aojh.a;
            default:
                aooc.af(obj);
                disconnectCause = (android.telecom.DisconnectCause) obj;
                if (disconnectCause != null) {
                    this.c.q.a(qbc.oF);
                }
                return aojh.a;
        }
    }
}
