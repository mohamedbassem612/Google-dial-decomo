package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lha {
    private static final aimz d = aimz.i("com/android/dialer/callscreen/impl/service/MessageProcessor");
    public final defpackage.lgi b;
    public final defpackage.ldn c;
    private final java.util.concurrent.Executor g;
    private final ahpz h;
    public final java.util.Deque a = new java.util.ArrayDeque();
    private final java.util.List e = new java.util.ArrayList();
    private final java.util.concurrent.atomic.AtomicBoolean f = new java.util.concurrent.atomic.AtomicBoolean();

    public lha(defpackage.lgi lgiVar, ajct ajctVar, ahpz ahpzVar, defpackage.ldn ldnVar) {
        this.b = lgiVar;
        this.g = new ajdc(ajctVar);
        this.h = ahpzVar;
        this.c = ldnVar;
    }

    public static void e(java.util.Deque deque, defpackage.lgo lgoVar) {
        int iAN;
        int iAN2;
        int iAN3;
        defpackage.lgo lgoVar2 = (defpackage.lgo) deque.pollFirst();
        if (lgoVar2 == null) {
            deque.push(lgoVar);
            return;
        }
        j$.util.Optional optionalOf = (lgoVar2.b & 32) != 0 ? j$.util.Optional.of(lgoVar2.h) : j$.util.Optional.empty();
        j$.util.Optional optionalOf2 = (lgoVar.b & 32) != 0 ? j$.util.Optional.of(lgoVar.h) : j$.util.Optional.empty();
        if (!optionalOf.isPresent() || !optionalOf2.isPresent()) {
            int iAN4 = a.aN(lgoVar2.f);
            if (iAN4 == 0 || iAN4 != 2 || optionalOf.isPresent() || optionalOf2.isPresent() || ((iAN = a.aN(lgoVar.g)) != 0 && iAN == 4)) {
                e(deque, lgoVar);
                deque.push(lgoVar2);
                return;
            }
            int iAN5 = a.aN(lgoVar.f);
            if ((iAN5 == 0 || iAN5 != 2) && ((iAN2 = a.aN(lgoVar.f)) == 0 || iAN2 != 3)) {
                return;
            }
            akzx akzxVarP = lgoVar.p();
            int i = lgoVar2.d;
            akzxVarP.u();
            defpackage.lgo lgoVar3 = (defpackage.lgo) akzxVarP.b;
            lgoVar3.b |= 2;
            lgoVar3.d = i;
            deque.push((defpackage.lgo) akzxVarP.p());
            return;
        }
        if (!((java.lang.String) optionalOf.orElseThrow()).equals(optionalOf2.orElseThrow())) {
            e(deque, lgoVar);
            deque.push(lgoVar2);
            return;
        }
        akzx akzxVarP2 = lgoVar.p();
        int iMax = java.lang.Math.max(lgoVar2.i, lgoVar.i);
        akzxVarP2.u();
        defpackage.lgo lgoVar4 = (defpackage.lgo) akzxVarP2.b;
        lgoVar4.b |= 64;
        lgoVar4.i = iMax;
        int iMin = java.lang.Math.min(lgoVar2.d, lgoVar.d);
        akzxVarP2.u();
        defpackage.lgo lgoVar5 = (defpackage.lgo) akzxVarP2.b;
        lgoVar5.b |= 2;
        lgoVar5.d = iMin;
        int iAN6 = a.aN(lgoVar2.f);
        int i2 = 1;
        if (iAN6 == 0 || iAN6 != 3 ? (iAN3 = a.aN(lgoVar.f)) != 0 : (iAN3 = a.aN(lgoVar2.f)) != 0) {
            i2 = iAN3;
        }
        akzxVarP2.u();
        defpackage.lgo lgoVar6 = (defpackage.lgo) akzxVarP2.b;
        lgoVar6.f = i2 - 1;
        lgoVar6.b |= 8;
        deque.push((defpackage.lgo) akzxVarP2.p());
    }

    private final ajcq f(defpackage.lgo lgoVar) {
        defpackage.lge lgeVar = new defpackage.lge(this, lgoVar, 5, null);
        java.util.concurrent.Executor executor = this.g;
        return ahvr.I(ahvr.E(lgeVar, executor), new defpackage.lgr(this, 18), executor);
    }

    private final void g(int i) {
        akzx akzxVarM = defpackage.ljw.a.m();
        akzx akzxVarM2 = defpackage.lke.a.m();
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        akzxVarM2.u();
        defpackage.lke lkeVar = (defpackage.lke) akzxVarM2.b;
        lkeVar.b |= 1;
        lkeVar.c = jElapsedRealtime;
        akzxVarM2.u();
        defpackage.lke lkeVar2 = (defpackage.lke) akzxVarM2.b;
        lkeVar2.d = i - 1;
        lkeVar2.b |= 2;
        akzxVarM.u();
        defpackage.ljw ljwVar = (defpackage.ljw) akzxVarM.b;
        defpackage.lke lkeVar3 = (defpackage.lke) akzxVarM2.p();
        j$.util.Objects.requireNonNull(lkeVar3);
        ljwVar.c = lkeVar3;
        ljwVar.b = 5;
        agsm.i(289, this.c.a((defpackage.ljw) akzxVarM.p()), "failed to log Call Screen event for error", new java.lang.Object[0]);
    }

    public final ajcq a(java.lang.String str) {
        ahvr.ci(str);
        akzx akzxVarA = defpackage.lgw.a();
        akzxVarA.u();
        defpackage.lgo lgoVar = (defpackage.lgo) akzxVarA.b;
        defpackage.lgo lgoVar2 = defpackage.lgo.a;
        lgoVar.g = 3;
        lgoVar.b |= 16;
        akzxVarA.u();
        defpackage.lgo lgoVar3 = (defpackage.lgo) akzxVarA.b;
        j$.util.Objects.requireNonNull(str);
        lgoVar3.b |= 4;
        lgoVar3.e = str;
        akzxVarA.u();
        defpackage.lgo lgoVar4 = (defpackage.lgo) akzxVarA.b;
        lgoVar4.f = 2;
        lgoVar4.b |= 8;
        return f((defpackage.lgo) akzxVarA.p());
    }

    public final void b(defpackage.adof adofVar) {
        aimw aimwVarL = d.d().i(zct.b).l("com/android/dialer/callscreen/impl/service/MessageProcessor", "onError", 254, "MessageProcessor.java");
        java.lang.String message = adofVar.getMessage();
        adoe adoeVar = adofVar.a;
        aimwVarL.I("Received error: %s : %s", message, adoeVar);
        int iOrdinal = adoeVar.ordinal();
        if (iOrdinal == 0) {
            g(12);
            return;
        }
        if (iOrdinal == 1) {
            g(13);
            return;
        }
        if (iOrdinal == 2) {
            g(14);
        } else if (iOrdinal == 3) {
            g(15);
        } else if (iOrdinal == 4) {
            g(16);
        }
    }

    public final void c(java.util.List list) {
        defpackage.lgo lgoVar;
        ailk ailkVarY = ((aify) list).y(0);
        while (ailkVarY.hasNext()) {
            adok adokVar = (adok) ailkVarY.next();
            if (adokVar.b() == 2) {
                adokVar.c().a.a.isPresent();
                if (adokVar.c().a.b.equals(j$.util.Optional.of("RINGING"))) {
                    return;
                }
            }
            if (adokVar.b() == 2) {
                adokVar.c().a.a.isPresent();
                if (adokVar.c().a.b.equals(j$.util.Optional.of("VOICEMAIL_BEEP"))) {
                    return;
                }
            }
            if (adokVar.b() == 1 && this.f.get()) {
                d.b().l("com/android/dialer/callscreen/impl/service/MessageProcessor", "onEvent", 185, "MessageProcessor.java").v("ignoring caller intent");
                return;
            }
            ahok ahokVarF = this.h.f(290, "MessageProcessor.onEvent");
            try {
                ahvr.ci(adokVar);
                akzx akzxVarA = defpackage.lgw.a();
                int i = 16;
                if (adokVar.b() - 1 != 0) {
                    java.lang.String strReplace = (java.lang.String) adokVar.c().a.b.orElseThrow();
                    if (strReplace.endsWith("[sonic branding]")) {
                        strReplace = strReplace.replace("[sonic branding]", "");
                    }
                    akzxVarA.u();
                    defpackage.lgo lgoVar2 = (defpackage.lgo) akzxVarA.b;
                    defpackage.lgo lgoVar3 = defpackage.lgo.a;
                    lgoVar2.g = 2;
                    lgoVar2.b |= 16;
                    akzxVarA.u();
                    defpackage.lgo lgoVar4 = (defpackage.lgo) akzxVarA.b;
                    j$.util.Objects.requireNonNull(strReplace);
                    lgoVar4.b |= 4;
                    lgoVar4.e = strReplace;
                    java.lang.String str = adokVar.c().b;
                    akzxVarA.u();
                    defpackage.lgo lgoVar5 = (defpackage.lgo) akzxVarA.b;
                    j$.util.Objects.requireNonNull(str);
                    lgoVar5.b |= 32;
                    lgoVar5.h = str;
                    if (adokVar.c().d.isPresent()) {
                        int iIntValue = ((java.lang.Integer) adokVar.c().d.orElseThrow()).intValue();
                        akzxVarA.u();
                        defpackage.lgo lgoVar6 = (defpackage.lgo) akzxVarA.b;
                        lgoVar6.b |= 64;
                        lgoVar6.i = iIntValue;
                    }
                    if (adokVar.c().c.isPresent()) {
                        long jIntValue = ((java.lang.Integer) adokVar.c().c.orElseThrow()).intValue();
                        akzxVarA.u();
                        defpackage.lgo lgoVar7 = (defpackage.lgo) akzxVarA.b;
                        lgoVar7.b |= 128;
                        lgoVar7.j = jIntValue;
                    }
                    if (adokVar.c().e == 1 || adokVar.c().e == 2) {
                        akzxVarA.u();
                        defpackage.lgo lgoVar8 = (defpackage.lgo) akzxVarA.b;
                        lgoVar8.f = 1;
                        lgoVar8.b |= 8;
                    } else if (adokVar.c().e == 3) {
                        akzxVarA.u();
                        defpackage.lgo lgoVar9 = (defpackage.lgo) akzxVarA.b;
                        lgoVar9.f = 2;
                        lgoVar9.b |= 8;
                    } else if (adokVar.c().e == 4) {
                        akzxVarA.u();
                        defpackage.lgo lgoVar10 = (defpackage.lgo) akzxVarA.b;
                        lgoVar10.f = 3;
                        lgoVar10.b |= 8;
                    } else {
                        akzxVarA.u();
                        defpackage.lgo lgoVar11 = (defpackage.lgo) akzxVarA.b;
                        lgoVar11.f = 0;
                        lgoVar11.b |= 8;
                    }
                    lgoVar = (defpackage.lgo) akzxVarA.p();
                } else {
                    akzxVarA.u();
                    defpackage.lgo lgoVar12 = (defpackage.lgo) akzxVarA.b;
                    defpackage.lgo lgoVar13 = defpackage.lgo.a;
                    lgoVar12.g = 1;
                    lgoVar12.b |= 16;
                    java.lang.String str2 = adokVar.a().a;
                    akzxVarA.u();
                    defpackage.lgo lgoVar14 = (defpackage.lgo) akzxVarA.b;
                    j$.util.Objects.requireNonNull(str2);
                    lgoVar14.b |= 4;
                    lgoVar14.e = str2;
                    if (adokVar.a().b) {
                        akzxVarA.u();
                        defpackage.lgo lgoVar15 = (defpackage.lgo) akzxVarA.b;
                        lgoVar15.f = 2;
                        lgoVar15.b |= 8;
                    } else {
                        akzxVarA.u();
                        defpackage.lgo lgoVar16 = (defpackage.lgo) akzxVarA.b;
                        lgoVar16.f = 1;
                        lgoVar16.b |= 8;
                    }
                    if (adokVar.a().f.isPresent()) {
                        boolean zEquals = ((defpackage.adol) adokVar.a().f.orElseThrow()).equals(defpackage.adol.b);
                        akzxVarA.u();
                        defpackage.lgo lgoVar17 = (defpackage.lgo) akzxVarA.b;
                        lgoVar17.b |= 256;
                        lgoVar17.k = zEquals;
                    }
                    lgoVar = (defpackage.lgo) akzxVarA.p();
                }
                agsm.i(291, f(lgoVar), "failed to add to caller intents", new java.lang.Object[0]);
                ahokVarF.close();
                if (adokVar.b() == 1 && adokVar.a().b && adokVar.a().e.isPresent()) {
                    this.e.add((adns) adokVar.a().e.orElseThrow());
                }
                if (adokVar.b() == 1 && adokVar.a().b) {
                    adokVar.a().d.isPresent();
                    if (adokVar.a().c.isPresent()) {
                        defpackage.ldn ldnVar = this.c;
                        ahrv ahrvVarG = ahrv.g(ahvr.E(new defpackage.jnv(ldnVar, (java.lang.Long) adokVar.a().d.orElse(0L), 17, null), ldnVar.g));
                        defpackage.kwa kwaVar = new defpackage.kwa(this, adokVar, 15);
                        java.util.concurrent.Executor executor = this.g;
                        agsm.i(292, ahrvVarG.i(kwaVar, executor).i(new defpackage.kwa(this, adokVar, i), executor).i(new defpackage.lgr(this, 19), executor), "failed to update call screen metrics", new java.lang.Object[0]);
                    }
                }
            } catch (java.lang.Throwable th) {
                try {
                    ahokVarF.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public final void d(boolean z) {
        this.f.set(z);
    }
}
