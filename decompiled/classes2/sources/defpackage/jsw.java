package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class jsw extends aomh implements aonn {
    int a;
    final /* synthetic */ defpackage.jth b;
    final /* synthetic */ jsk c;
    final /* synthetic */ aoin d;
    final /* synthetic */ rmt e;
    final /* synthetic */ sql f;
    final /* synthetic */ qbe g;
    final /* synthetic */ aazc h;
    final /* synthetic */ zzx i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jsw(zzx zzxVar, defpackage.jth jthVar, jsk jskVar, aazc aazcVar, aoin aoinVar, rmt rmtVar, sql sqlVar, qbe qbeVar, aoln aolnVar) {
        super(2, aolnVar);
        this.i = zzxVar;
        this.b = jthVar;
        this.c = jskVar;
        this.h = aazcVar;
        this.d = aoinVar;
        this.e = rmtVar;
        this.f = sqlVar;
        this.g = qbeVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0090  */
    /* JADX WARN: Code duplicated, block: B:21:0x0095  */
    /* JADX WARN: Code duplicated, block: B:24:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:26:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:28:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:32:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:35:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:37:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:50:0x00f9  */
    public final java.lang.Object b(java.lang.Object obj) {
        java.lang.Long l;
        long jLongValue;
        rmt rmtVar;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        qbc qbcVar;
        java.lang.String strK;
        spn spnVar;
        zhj zhjVar;
        aolu aoluVar = aolu.a;
        int i = this.a;
        aooc.af(obj);
        if (i != 0) {
            if (i == 1) {
            }
            l = (java.lang.Long) obj;
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            long epochMilli = j$.time.Instant.now().toEpochMilli() - jLongValue;
            long jLongValue2 = ((java.lang.Number) this.d.a()).longValue();
            rmtVar = this.e;
            if (defpackage.hhv.i(rmtVar)) {
                spnVar = this.f.a;
                if ((spnVar.b & 512) == 0) {
                    z = false;
                } else {
                    zhjVar = spnVar.l;
                    if (zhjVar == null) {
                        zhjVar = zhj.a;
                    }
                    if (zhjVar.k) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
            } else {
                z = false;
            }
            if (rmtVar == rmt.a) {
                strK = this.f.k();
                aooh.e(strK, "getTranscriptInferredName(...)");
                if (aoov.H(strK)) {
                    z2 = false;
                } else {
                    z2 = true;
                }
            } else {
                z2 = false;
            }
            if (!z || z2) {
                z3 = true;
            } else {
                z3 = false;
            }
            z4 = epochMilli <= jLongValue2 && z3;
            if (z4) {
                if (z2) {
                    qbcVar = qbc.oT;
                } else {
                    qbcVar = qbc.oP;
                }
                this.g.c(qbcVar);
            }
            return java.lang.Boolean.valueOf(z4);
        }
        if (this.i.m()) {
            defpackage.jsx.a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/calleridfeedback/impl/incall/service/CallerIdFeedbackUiInCallProducerModule", "produceShouldShowInCallFeedbackBanner$<anonymous>", 65, "CallerIdFeedbackUiInCallProducerModule.kt").v("Not showing caller id feedback banner in direct boot");
            return java.lang.Boolean.FALSE;
        }
        defpackage.jth jthVar = this.b;
        this.a = 1;
        obj = jthVar.c(this);
        if (obj == aoluVar) {
            return aoluVar;
        }
        if (((java.lang.Boolean) obj).booleanValue()) {
            defpackage.jsx.a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/calleridfeedback/impl/incall/service/CallerIdFeedbackUiInCallProducerModule", "produceShouldShowInCallFeedbackBanner$<anonymous>", 72, "CallerIdFeedbackUiInCallProducerModule.kt").v("Not showing caller id feedback banner because it was closed by the user");
            return java.lang.Boolean.FALSE;
        }
        jsk jskVar = this.c;
        ahrv ahrvVarH = ahrv.g(jskVar.g.bk()).h(new defpackage.exn(17), jskVar.b);
        this.a = 2;
        obj = aosv.D(ahrvVarH, this);
        if (obj == aoluVar) {
            return aoluVar;
        }
        l = (java.lang.Long) obj;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        long epochMilli2 = j$.time.Instant.now().toEpochMilli() - jLongValue;
        long jLongValue3 = ((java.lang.Number) this.d.a()).longValue();
        rmtVar = this.e;
        if (defpackage.hhv.i(rmtVar)) {
            spnVar = this.f.a;
            if ((spnVar.b & 512) == 0) {
                z = false;
            } else {
                zhjVar = spnVar.l;
                if (zhjVar == null) {
                    zhjVar = zhj.a;
                }
                if (zhjVar.k) {
                    z = true;
                } else {
                    z = false;
                }
            }
        } else {
            z = false;
        }
        if (rmtVar == rmt.a) {
            strK = this.f.k();
            aooh.e(strK, "getTranscriptInferredName(...)");
            if (aoov.H(strK)) {
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        if (z) {
            z3 = true;
        } else {
            z3 = true;
        }
        if (epochMilli2 <= jLongValue3) {
        }
        if (z4) {
            if (z2) {
                qbcVar = qbc.oT;
            } else {
                qbcVar = qbc.oP;
            }
            this.g.c(qbcVar);
        }
        return java.lang.Boolean.valueOf(z4);
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.jsw(this.i, this.b, this.c, this.h, this.d, this.e, this.f, this.g, aolnVar);
    }
}
