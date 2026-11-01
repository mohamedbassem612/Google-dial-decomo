package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class aeru implements ahyc {
    public final /* synthetic */ aerv a;
    public final /* synthetic */ akzx b;

    public /* synthetic */ aeru(aerv aervVar, akzx akzxVar) {
        this.a = aervVar;
        this.b = akzxVar;
    }

    public final java.lang.Object apply(java.lang.Object obj) {
        int i;
        int i2;
        aify aifyVarA;
        ahyn ahynVar = (ahyn) obj;
        boolean zF = ahynVar.f();
        akzx akzxVar = this.b;
        if (!zF) {
            return akzxVar.p();
        }
        for (defpackage.aenv aenvVar : ((defpackage.aenz) ahynVar.b()).e) {
            int i3 = aenvVar.b;
            int i4 = 3;
            int i5 = 1;
            if (i3 == 0) {
                i = 6;
            } else if (i3 == 1) {
                i = 1;
            } else if (i3 == 2) {
                i = 2;
            } else if (i3 == 3) {
                i = 3;
            } else if (i3 != 4) {
                i = i3 != 5 ? 0 : 5;
            } else {
                i = 4;
            }
            if (i == 0) {
                throw null;
            }
            int i6 = i - 1;
            aerv aervVar = this.a;
            if (i6 != 0) {
                if (i6 == 1) {
                    alcf alcfVar = (i3 == 2 ? (defpackage.aenw) aenvVar.c : defpackage.aenw.a).c;
                    if (alcfVar == null) {
                        alcfVar = alcf.a;
                    }
                    long jB = aldi.b(alcfVar);
                    akzxVar.u();
                    apef apefVar = akzxVar.b;
                    apef apefVar2 = apef.a;
                    apefVar.b |= 32;
                    apefVar.h = jB;
                } else if (i6 == 2) {
                    defpackage.aenx aenxVar = i3 == 3 ? (defpackage.aenx) aenvVar.c : defpackage.aenx.a;
                    if ((akzxVar.b.b & 512) != 0 && ((java.lang.Boolean) aervVar.h.a()).booleanValue()) {
                        java.util.List list = aenxVar.c;
                        aoin aoinVar = aervVar.j;
                        if (((java.lang.Long) aoinVar.a()).longValue() >= 0) {
                            j$.time.Instant instantMinusSeconds = j$.time.Instant.ofEpochMilli(akzxVar.b.g).minusSeconds(((java.lang.Long) aoinVar.a()).longValue());
                            alcf alcfVar2 = aenxVar.d;
                            if (alcfVar2 == null) {
                                alcfVar2 = alcf.a;
                            }
                            if (!ajsz.dK(alcfVar2).isBefore(instantMinusSeconds)) {
                            }
                        }
                        aoin aoinVar2 = aervVar.i;
                        if (((java.lang.Long) aoinVar2.a()).longValue() >= 0) {
                            list = (java.util.List) j$.util.Collection.-EL.stream(list).filter(new defpackage.abdh(j$.time.Instant.ofEpochMilli(akzxVar.b.g).minusSeconds(((java.lang.Long) aoinVar2.a()).longValue()), 14)).collect(aido.a);
                        }
                        long jLongValue = ((java.lang.Long) aervVar.k.a()).longValue();
                        long jLongValue2 = ((java.lang.Long) aervVar.l.a()).longValue();
                        java.util.Iterator it = list.iterator();
                        boolean z = false;
                        boolean z2 = false;
                        while (it.hasNext()) {
                            int i7 = ((apgw) it.next()).c;
                            z |= i7 == 1;
                            z2 |= i7 == 3;
                        }
                        if (z) {
                            if (z2) {
                                defpackage.aenr.a.d().l("com/google/android/libraries/performance/primes/flightrecorder/datasources/trace/TraceFilter", "filterTraceContexts", 61, "TraceFilter.java").v("TraceContext list contains both Trace and TraceRecord");
                                aifyVarA = aike.a;
                            } else {
                                aifyVarA = defpackage.aeop.a((java.util.List) j$.util.Collection.-EL.stream(list).map(new defpackage.adci(5)).collect(aido.a), jLongValue, jLongValue2);
                            }
                        } else if (z2) {
                            aifyVarA = defpackage.aeop.a((java.util.List) j$.util.Collection.-EL.stream(list).map(new defpackage.adci(3)).collect(aido.a), jLongValue, jLongValue2);
                        } else {
                            defpackage.aenr.a.d().l("com/google/android/libraries/performance/primes/flightrecorder/datasources/trace/TraceFilter", "filterTraceContexts", 72, "TraceFilter.java").v("TraceContext list contains neither Trace nor TraceRecord");
                            aifyVarA = aike.a;
                        }
                        if (!aifyVarA.isEmpty()) {
                            akzx akzxVarM = defpackage.apgy.a.m();
                            akzxVarM.u();
                            defpackage.apgy apgyVar = (defpackage.apgy) akzxVarM.b;
                            alat alatVar = apgyVar.c;
                            if (!alatVar.c()) {
                                apgyVar.c = alad.J(alatVar);
                            }
                            akyl.i(aifyVarA, apgyVar.c);
                            alcf alcfVar3 = aenxVar.d;
                            if (alcfVar3 == null) {
                                alcfVar3 = alcf.a;
                            }
                            akzxVarM.u();
                            defpackage.apgy apgyVar2 = (defpackage.apgy) akzxVarM.b;
                            j$.util.Objects.requireNonNull(alcfVar3);
                            apgyVar2.d = alcfVar3;
                            apgyVar2.b |= 1;
                            int iAQ = a.aQ(aenxVar.e);
                            if (iAQ == 0) {
                                iAQ = 1;
                            }
                            int i8 = iAQ - 1;
                            if (i8 == 0) {
                                i4 = 1;
                            } else if (i8 == 1) {
                                i4 = 2;
                            }
                            akzxVarM.u();
                            defpackage.apgy apgyVar3 = (defpackage.apgy) akzxVarM.b;
                            apgyVar3.e = i4 - 1;
                            apgyVar3.b |= 2;
                            defpackage.apgy apgyVar4 = (defpackage.apgy) akzxVarM.p();
                            akzxVar.u();
                            apef apefVar3 = akzxVar.b;
                            j$.util.Objects.requireNonNull(apgyVar4);
                            apefVar3.n = apgyVar4;
                            apefVar3.b |= 2048;
                        }
                    }
                } else if (i6 == 3) {
                    defpackage.aeny aenyVar = i3 == 4 ? (defpackage.aeny) aenvVar.c : defpackage.aeny.a;
                    akzx akzxVarM2 = defpackage.aphb.a.m();
                    if (aenyVar.c.equals(aervVar.b.a())) {
                        i2 = 0;
                    } else {
                        java.lang.String str = aenyVar.c;
                        akzxVarM2.u();
                        defpackage.aphb aphbVar = (defpackage.aphb) akzxVarM2.b;
                        j$.util.Objects.requireNonNull(str);
                        aphbVar.b |= 1;
                        aphbVar.c = str;
                        i2 = 1;
                    }
                    if (aenyVar.d != ((java.lang.Integer) aervVar.c.a()).intValue()) {
                        int i9 = aenyVar.d;
                        akzxVarM2.u();
                        defpackage.aphb aphbVar2 = (defpackage.aphb) akzxVarM2.b;
                        aphbVar2.b |= 2;
                        aphbVar2.d = i9;
                        i2 = 1;
                    }
                    if (aenyVar.e != ((java.lang.Integer) aervVar.d.a()).intValue()) {
                        int i10 = aenyVar.e;
                        akzxVarM2.u();
                        defpackage.aphb aphbVar3 = (defpackage.aphb) akzxVarM2.b;
                        aphbVar3.b |= 4;
                        aphbVar3.e = i10;
                    } else {
                        i5 = i2;
                    }
                    if (aenyVar.f != android.os.Build.VERSION.SDK_INT) {
                        int i11 = aenyVar.f;
                        akzxVarM2.u();
                        defpackage.aphb aphbVar4 = (defpackage.aphb) akzxVarM2.b;
                        aphbVar4.b |= 8;
                        aphbVar4.f = i11;
                    } else if (i5 != 0) {
                    }
                    defpackage.aphb aphbVar5 = (defpackage.aphb) akzxVarM2.p();
                    akzxVar.u();
                    apef apefVar4 = akzxVar.b;
                    apef apefVar5 = apef.a;
                    j$.util.Objects.requireNonNull(aphbVar5);
                    apefVar4.o = aphbVar5;
                    apefVar4.b |= 4096;
                } else if (i6 == 4) {
                    defpackage.aenu aenuVar = i3 == 5 ? (defpackage.aenu) aenvVar.c : defpackage.aenu.a;
                    if ((akzxVar.b.b & 512) != 0 && ((java.lang.Boolean) aervVar.o.a()).booleanValue()) {
                        int i12 = aenuVar.b;
                        if ((i12 & 8) != 0) {
                            int iB = aerv.b(akzxVar, aenuVar.c);
                            if (iB < 0) {
                                defpackage.aenr.a.d().l("com/google/android/libraries/performance/primes/metrics/crash/applicationexit/ApplicationExitInfoCaptureImpl", "maybeAddCuis", 306, "ApplicationExitInfoCaptureImpl.java").w("Could not find started CUI with ID %d", aenuVar.c);
                            } else {
                                akzx akzxVarP = akzxVar.bj(iB).p();
                                int i13 = aenuVar.f;
                                akzxVarP.u();
                                defpackage.apee apeeVar = (defpackage.apee) akzxVarP.b;
                                apeeVar.b |= 1;
                                apeeVar.c = i13;
                                akzxVar.bk(iB, akzxVarP);
                            }
                        } else if ((i12 & 2) != 0) {
                            int iB2 = aerv.b(akzxVar, aenuVar.c);
                            if (iB2 < 0) {
                                defpackage.aenr.a.d().l("com/google/android/libraries/performance/primes/metrics/crash/applicationexit/ApplicationExitInfoCaptureImpl", "maybeAddCuis", 320, "ApplicationExitInfoCaptureImpl.java").w("Could not find started CUI with ID %d", aenuVar.c);
                            } else {
                                akzx akzxVarP2 = akzxVar.bj(iB2).p();
                                akzm akzmVar = aenuVar.d;
                                if (akzmVar == null) {
                                    akzmVar = akzm.a;
                                }
                                akzxVarP2.u();
                                defpackage.apee apeeVar2 = (defpackage.apee) akzxVarP2.b;
                                j$.util.Objects.requireNonNull(akzmVar);
                                apeeVar2.d = akzmVar;
                                apeeVar2.b |= 2;
                                int iY = a.Y(aenuVar.e);
                                i5 = iY != 0 ? iY : 1;
                                akzxVarP2.u();
                                defpackage.apee apeeVar3 = (defpackage.apee) akzxVarP2.b;
                                apeeVar3.e = i5 - 1;
                                apeeVar3.b |= 4;
                                akzxVar.bk(iB2, akzxVarP2);
                            }
                        } else {
                            akzx akzxVarM3 = defpackage.apee.a.m();
                            int i14 = aenuVar.c;
                            akzxVarM3.u();
                            defpackage.apee apeeVar4 = (defpackage.apee) akzxVarM3.b;
                            apeeVar4.b |= 1;
                            apeeVar4.c = i14;
                            akzxVar.u();
                            apef apefVar6 = akzxVar.b;
                            defpackage.apee apeeVar5 = (defpackage.apee) akzxVarM3.p();
                            j$.util.Objects.requireNonNull(apeeVar5);
                            apefVar6.b();
                            apefVar6.q.add(apeeVar5);
                        }
                    }
                }
            } else if ((akzxVar.b.b & 1024) != 0) {
                defpackage.aenr.a.d().l("com/google/android/libraries/performance/primes/metrics/crash/applicationexit/ApplicationExitInfoCaptureImpl", "applyFlightRecord", 224, "ApplicationExitInfoCaptureImpl.java").v("FlightRecord should not contain more than one MetricExtension. Only the first will be logged.");
            } else {
                apev apevVar = i3 == 1 ? (apev) aenvVar.c : apev.a;
                akzxVar.u();
                apef apefVar7 = akzxVar.b;
                j$.util.Objects.requireNonNull(apevVar);
                apefVar7.m = apevVar;
                apefVar7.b |= 1024;
            }
        }
        return akzxVar.p();
    }
}
