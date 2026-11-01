package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qbe {
    private static final aimz e = aimz.i("com/android/dialer/incall/logging/impl/InCallLoggingImpl");
    public final java.util.List a = new java.util.ArrayList();
    public final java.util.Set b = new acc(0);
    public final java.util.concurrent.Executor c;
    public final long d;
    private final java.lang.String f;
    private final j$.util.Optional g;
    private final rsr h;

    public qbe(java.lang.String str, ajct ajctVar, long j, j$.util.Optional optional, rsr rsrVar) {
        this.f = str;
        this.c = new ajdc(ajctVar);
        this.d = j;
        this.g = optional;
        this.h = rsrVar;
    }

    public final void a(qbc qbcVar) {
        ahoq ahoqVarV = ahvr.V(575, qbcVar);
        try {
            ahoqVarV.a(ahvr.H(this.h.as(), new oqe(this, qbcVar, 8, (byte[]) null), this.c));
            ahoqVarV.close();
        } catch (java.lang.Throwable th) {
            try {
                ahoqVarV.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void b(final qbc qbcVar, final j$.util.Optional optional, final j$.util.Optional optional2, final j$.util.Optional optional3) {
        ahoq ahoqVarV = ahvr.V(576, qbcVar);
        try {
            ahoqVarV.a(ahvr.H(this.h.as(), new ahyc() { // from class: qbd
                public final java.lang.Object apply(java.lang.Object obj) {
                    j$.util.Optional optionalOf = j$.util.Optional.of((amnr) obj);
                    j$.util.Optional optional4 = optional;
                    return java.lang.Boolean.valueOf(this.a.d(qbcVar, optionalOf, optional4, optional2, optional3));
                }
            }, this.c));
            ahoqVarV.close();
        } catch (java.lang.Throwable th) {
            try {
                ahoqVarV.close();
                throw th;
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public final void c(qbc qbcVar) {
        ahoq ahoqVarV = ahvr.V(577, qbcVar);
        try {
            ahoqVarV.a(ahvr.H(this.h.as(), new oqe(this, qbcVar, 9, (byte[]) null), this.c));
            ahoqVarV.close();
        } catch (java.lang.Throwable th) {
            try {
                ahoqVarV.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean d(qbc qbcVar, j$.util.Optional optional, j$.util.Optional optional2, j$.util.Optional optional3, j$.util.Optional optional4) {
        akzx akzxVarM = defpackage.amqp.a.m();
        long epochMilli = j$.time.Instant.now().toEpochMilli();
        akzxVarM.u();
        defpackage.amqp amqpVar = (defpackage.amqp) akzxVarM.b;
        amqpVar.b |= 2;
        amqpVar.d = epochMilli;
        akzxVarM.u();
        defpackage.amqp amqpVar2 = (defpackage.amqp) akzxVarM.b;
        amqpVar2.c = qbcVar.pk;
        amqpVar2.b |= 1;
        akzm akzmVarBe = ipc.be();
        akzxVarM.u();
        defpackage.amqp amqpVar3 = (defpackage.amqp) akzxVarM.b;
        j$.util.Objects.requireNonNull(akzmVarBe);
        amqpVar3.f = akzmVarBe;
        amqpVar3.b |= 8;
        j$.util.Optional optional5 = this.g;
        optional5.isPresent();
        j$.util.Optional optionalP = ((zzx) optional5.get()).p();
        optionalP.getClass();
        j$.util.Objects.requireNonNull(akzxVarM);
        defpackage.puo puoVar = new defpackage.puo(akzxVarM, 17);
        if (true == optionalP.isPresent()) {
            amtg amtgVar = (amtg) optionalP.get();
            akzx akzxVar = (akzx) puoVar.a;
            akzxVar.u();
            defpackage.amqp amqpVar4 = (defpackage.amqp) akzxVar.b;
            j$.util.Objects.requireNonNull(amtgVar);
            amqpVar4.h = amtgVar;
            amqpVar4.b |= 32;
        }
        int i = 16;
        if (optional2.isPresent() || optional3.isPresent() || optional4.isPresent()) {
            akzx akzxVarM2 = ampu.a.m();
            j$.util.Objects.requireNonNull(akzxVarM2);
            defpackage.puo puoVar2 = new defpackage.puo(akzxVarM2, 18);
            if (true == optional2.isPresent()) {
                java.lang.Object obj = optional2.get();
                java.lang.Object obj2 = puoVar2.a;
                int iIntValue = ((java.lang.Integer) obj).intValue();
                akzx akzxVar2 = (akzx) obj2;
                akzxVar2.u();
                ampu ampuVar = akzxVar2.b;
                ampuVar.b |= 2;
                ampuVar.d = iIntValue;
            }
            j$.util.Objects.requireNonNull(akzxVarM2);
            defpackage.puo puoVar3 = new defpackage.puo(akzxVarM2, 19);
            if (true == optional3.isPresent()) {
                java.lang.Object obj3 = optional3.get();
                java.lang.Object obj4 = puoVar3.a;
                int iIntValue2 = ((java.lang.Integer) obj3).intValue();
                akzx akzxVar3 = (akzx) obj4;
                akzxVar3.u();
                ampu ampuVar2 = akzxVar3.b;
                ampuVar2.b |= 1;
                ampuVar2.c = iIntValue2;
            }
            j$.util.Objects.requireNonNull(akzxVarM2);
            defpackage.puo puoVar4 = new defpackage.puo(akzxVarM2, 20);
            if (true == optional4.isPresent()) {
                java.lang.Object obj5 = optional4.get();
                java.lang.Object obj6 = puoVar4.a;
                int iIntValue3 = ((java.lang.Integer) obj5).intValue();
                akzx akzxVar4 = (akzx) obj6;
                akzxVar4.u();
                ampu ampuVar3 = akzxVar4.b;
                ampuVar3.b |= 4;
                ampuVar3.e = iIntValue3;
            }
            akzxVarM.u();
            defpackage.amqp amqpVar5 = (defpackage.amqp) akzxVarM.b;
            ampu ampuVarP = akzxVarM2.p();
            j$.util.Objects.requireNonNull(ampuVarP);
            amqpVar5.g = ampuVarP;
            amqpVar5.b |= 16;
            e.b().l("com/android/dialer/incall/logging/impl/InCallLoggingImpl", "addImpressionInternal", 98, "InCallLoggingImpl.java").O("InCall-Impression: %s, CallId: %s, semantic event ID: %s, CUI event ID: %s, CUI error ID: %s", qbcVar.name(), this.f, (true == optional2.isPresent() ? j$.util.Optional.ofNullable(((java.lang.Integer) optional2.get()).toString()) : optional2).orElse("null"), (true == optional3.isPresent() ? j$.util.Optional.ofNullable(((java.lang.Integer) optional3.get()).toString()) : optional3).orElse("null"), (true == optional4.isPresent() ? j$.util.Optional.ofNullable(((java.lang.Integer) optional4.get()).toString()) : optional4).orElse("null"));
        } else {
            e.b().l("com/android/dialer/incall/logging/impl/InCallLoggingImpl", "addImpressionInternal", 107, "InCallLoggingImpl.java").I("InCall-Impression: %s, CallId: %s", qbcVar.name(), this.f);
        }
        j$.util.Objects.requireNonNull(akzxVarM);
        defpackage.puo puoVar5 = new defpackage.puo(akzxVarM, i);
        optional.isPresent();
        java.lang.Object obj7 = optional.get();
        akzx akzxVar5 = (akzx) puoVar5.a;
        akzxVar5.u();
        defpackage.amqp amqpVar6 = (defpackage.amqp) akzxVar5.b;
        j$.util.Objects.requireNonNull(obj7);
        amqpVar6.i = (amnr) obj7;
        amqpVar6.b |= 64;
        return this.a.add((defpackage.amqp) akzxVarM.p());
    }
}
