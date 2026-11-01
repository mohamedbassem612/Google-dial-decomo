package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jic implements zik {
    private final defpackage.iwy a;
    private final java.lang.String b;
    private final zij c;
    private final aoin d;
    private final iqm e;
    private final defpackage.jfc f;
    private final defpackage.jif g;
    private final qbe h;

    public jic(defpackage.iwy iwyVar, qbe qbeVar, java.lang.String str, zij zijVar, aoin aoinVar, iqm iqmVar, defpackage.jfc jfcVar, defpackage.jif jifVar) {
        aooh.f(qbeVar, "inCallLogging");
        aooh.f(str, "callId");
        aooh.f(aoinVar, "enableBeeslyOnWearFollowUp");
        aooh.f(jfcVar, "beeslyLifecycleControllerV2");
        aooh.f(jifVar, "beeslyCallEventClearcutLogger");
        this.a = iwyVar;
        this.h = qbeVar;
        this.b = str;
        this.c = zijVar;
        this.d = aoinVar;
        this.e = iqmVar;
        this.f = jfcVar;
        this.g = jifVar;
    }

    /* JADX WARN: Code duplicated, block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final java.lang.Object b(defpackage.jhv jhvVar, aoln aolnVar) {
        defpackage.jib jibVar;
        int iAf;
        defpackage.jfc jfcVar;
        defpackage.iwy iwyVar;
        java.lang.String str;
        defpackage.mmv mmvVar;
        if (aolnVar instanceof defpackage.jib) {
            jibVar = (defpackage.jib) aolnVar;
            int i = jibVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                jibVar.c = i - Integer.MIN_VALUE;
            } else {
                jibVar = new defpackage.jib(this, aolnVar);
            }
        } else {
            jibVar = new defpackage.jib(this, aolnVar);
        }
        java.lang.Object obj = jibVar.a;
        aolu aoluVar = aolu.a;
        int i2 = jibVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            int i3 = jhvVar.b;
            if (i3 == 2 && i3 == 2 && (iAf = a.af(((java.lang.Integer) jhvVar.c).intValue())) != 0 && iAf == 3) {
                this.h.a(qbc.cm);
                if (((java.lang.Boolean) this.d.a()).booleanValue()) {
                    defpackage.hgw hgwVarO = defpackage.hhk.o(defpackage.jhv.a.m());
                    hgwVarO.f(8);
                    this.c.c(hgwVarO.e());
                }
                boolean zB = this.e.b();
                defpackage.jif jifVar = this.g;
                if (zB) {
                    jibVar.c = 1;
                    if (jifVar.b(3, jibVar) == aoluVar) {
                        return aoluVar;
                    }
                    jfcVar = this.f;
                    jibVar.c = 2;
                    if (jfcVar.k(5, jibVar) == aoluVar) {
                        return aoluVar;
                    }
                } else {
                    jibVar.c = 3;
                    if (jifVar.b(2, jibVar) == aoluVar) {
                        return aoluVar;
                    }
                    iwyVar = this.a;
                    str = this.b;
                    mmvVar = defpackage.mmv.b;
                    jibVar.c = 4;
                    if (iwyVar.d(str, mmvVar, jibVar) == aoluVar) {
                        return aoluVar;
                    }
                }
            }
        } else if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    aooc.af(obj);
                    iwyVar = this.a;
                    str = this.b;
                    mmvVar = defpackage.mmv.b;
                    jibVar.c = 4;
                    if (iwyVar.d(str, mmvVar, jibVar) == aoluVar) {
                        return aoluVar;
                    }
                } else if (i2 != 4) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            aooc.af(obj);
        } else {
            aooc.af(obj);
            jfcVar = this.f;
            jibVar.c = 2;
            if (jfcVar.k(5, jibVar) == aoluVar) {
                return aoluVar;
            }
        }
        return aojh.a;
    }
}
