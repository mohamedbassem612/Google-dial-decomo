package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aeth extends defpackage.aetd implements defpackage.aeqv {
    public final defpackage.ajcu a;
    public final defpackage.amwu b;
    public final defpackage.aequ c;
    public final defpackage.aetl d;
    private final defpackage.aent e;
    private final defpackage.aetc f;

    public aeth(defpackage.gou gouVar, defpackage.aetc aetcVar, defpackage.ajcu ajcuVar, defpackage.amwu amwuVar, defpackage.aetl aetlVar, defpackage.aent aentVar, defpackage.aoin aoinVar, java.util.concurrent.Executor executor) {
        new java.util.concurrent.atomic.AtomicReference(defpackage.aesy.a);
        new j$.util.concurrent.ConcurrentHashMap();
        this.f = aetcVar;
        this.e = aentVar;
        this.c = gouVar.D(executor, amwuVar, aoinVar);
        this.a = ajcuVar;
        this.b = amwuVar;
        this.d = aetlVar;
        java.lang.Boolean.FALSE.booleanValue();
    }

    @Override // defpackage.aetd
    public final void a() {
        defpackage.aetb aetbVar = new defpackage.aetb() { // from class: aetf
            @Override // defpackage.aetb
            public final void a(int i, java.lang.String str) {
                this.a.c(null, i, str);
            }
        };
        defpackage.aetc aetcVar = this.f;
        aetcVar.d = aetbVar;
        if (aetcVar.c.getAndSet(true)) {
            return;
        }
        aetcVar.b.execute(new defpackage.ajdk(new defpackage.nya(aetcVar, 9)));
    }

    @Override // defpackage.aetd
    public final void b(defpackage.aenj aenjVar) {
        c(aenjVar.a, 1, null);
    }

    public final void c(final java.lang.String str, final int i, final java.lang.String str2) {
        if (!this.e.a) {
            this.a.execute(new defpackage.ajdk(new defpackage.ajas() { // from class: aete
                @Override // defpackage.ajas
                public final defpackage.ajcq a() {
                    final defpackage.aevn aevnVarE;
                    final defpackage.aeth aethVar = this.a;
                    defpackage.aesx aesxVar = (defpackage.aesx) aethVar.b.a();
                    final int i2 = i;
                    final java.lang.String str3 = str;
                    if (i2 != 1) {
                        aevnVarE = aesxVar.b() ? defpackage.aevn.a : defpackage.aevn.b;
                    } else {
                        aevnVarE = aethVar.c.e(str3);
                    }
                    if (aevnVarE.g()) {
                        return defpackage.ajcm.a;
                    }
                    final java.lang.String str4 = str2;
                    defpackage.ahyn ahynVar = aesxVar.a;
                    defpackage.ajck ajckVarW = defpackage.ajck.w(defpackage.ajcm.a);
                    defpackage.adcu adcuVar = new defpackage.adcu(15);
                    defpackage.ajcu ajcuVar = aethVar.a;
                    return ajckVarW.u(java.lang.RuntimeException.class, adcuVar, ajcuVar).y(new defpackage.ajat() { // from class: aetg
                        /* JADX INFO: Thrown type has an unknown type hierarchy: afeb */
                        @Override // defpackage.ajat
                        public final defpackage.ajcq a(java.lang.Object obj) throws afeb {
                            android.app.ActivityManager.MemoryInfo memoryInfo;
                            defpackage.akzx akzxVar;
                            defpackage.apev apevVar = (defpackage.apev) obj;
                            defpackage.akzx akzxVarM = defpackage.apgu.a.m();
                            defpackage.aeth aethVar2 = aethVar;
                            int iMyPid = android.os.Process.myPid();
                            defpackage.aetl aetlVar = aethVar2.d;
                            defpackage.ahzi ahziVarBI = defpackage.ahvr.bI(new defpackage.aeex(aetlVar, 8));
                            java.lang.Object objA = aetlVar.a.a();
                            defpackage.afec.b();
                            defpackage.aetk aetkVar = null;
                            if (((defpackage.aesx) objA).b) {
                                memoryInfo = new android.app.ActivityManager.MemoryInfo();
                                android.content.Context context = aetlVar.b;
                                if (defpackage.aepw.a == null) {
                                    synchronized (defpackage.aepw.class) {
                                        if (defpackage.aepw.a == null) {
                                            java.lang.Object systemService = context.getSystemService("activity");
                                            if (systemService == null) {
                                                throw null;
                                            }
                                            defpackage.aepw.a = (android.app.ActivityManager) systemService;
                                        }
                                    }
                                }
                                defpackage.aepw.a.getMemoryInfo(memoryInfo);
                            } else {
                                memoryInfo = null;
                            }
                            java.lang.String strD = aetlVar.d(((java.lang.Boolean) aetlVar.c.a()).booleanValue() ? java.lang.String.valueOf(iMyPid) : "self", "status", false);
                            if (strD != null) {
                                if (strD.isEmpty()) {
                                    ((defpackage.aimw) ((defpackage.aimw) aenr.a.d()).l("com/google/android/libraries/performance/primes/metrics/memory/MemoryUsageCapture", "procStatusFromString", 305, "MemoryUsageCapture.java")).v("Null or empty proc status");
                                } else {
                                    aetkVar = new defpackage.aetk();
                                    aetkVar.f = defpackage.aetl.c(defpackage.aetk.a, strD);
                                    aetkVar.g = defpackage.aetl.c(defpackage.aetk.b, strD);
                                    aetkVar.h = defpackage.aetl.c(defpackage.aetk.c, strD);
                                    aetkVar.i = defpackage.aetl.c(defpackage.aetk.d, strD);
                                    aetkVar.j = defpackage.aetl.c(defpackage.aetk.e, strD);
                                }
                            }
                            defpackage.aetj aetjVar = new defpackage.aetj(defpackage.aetl.b(aetlVar.d(java.lang.String.valueOf(iMyPid), "dmabuf_rss", true)), defpackage.aetl.b(aetlVar.d(java.lang.String.valueOf(iMyPid), "dmabuf_rss_hwm", true)), defpackage.aetl.b(aetlVar.d(java.lang.String.valueOf(iMyPid), "dmabuf_pss", true)));
                            defpackage.akzx akzxVarM2 = defpackage.apfa.a.m();
                            defpackage.akzx akzxVarM3 = defpackage.apez.a.m();
                            defpackage.akzx akzxVarM4 = defpackage.apex.a.m();
                            if (memoryInfo != null) {
                                akzxVar = akzxVarM4;
                                long j = memoryInfo.availMem >> 10;
                                akzxVar.u();
                                defpackage.apex apexVar = (defpackage.apex) akzxVar.b;
                                apexVar.b |= 131072;
                                apexVar.c = (int) j;
                                long j2 = memoryInfo.totalMem >> 20;
                                akzxVar.u();
                                defpackage.apex apexVar2 = (defpackage.apex) akzxVar.b;
                                apexVar2.b |= 262144;
                                apexVar2.d = (int) j2;
                            } else {
                                akzxVar = akzxVarM4;
                            }
                            if (aetkVar != null) {
                                java.lang.Long l = aetkVar.f;
                                if (l != null) {
                                    long jLongValue = l.longValue();
                                    akzxVar.u();
                                    defpackage.apex apexVar3 = (defpackage.apex) akzxVar.b;
                                    apexVar3.b |= 524288;
                                    apexVar3.e = jLongValue;
                                }
                                java.lang.Long l2 = aetkVar.g;
                                if (l2 != null) {
                                    long jLongValue2 = l2.longValue();
                                    akzxVar.u();
                                    defpackage.apex apexVar4 = (defpackage.apex) akzxVar.b;
                                    apexVar4.b |= 1048576;
                                    apexVar4.f = jLongValue2;
                                }
                                java.lang.Long l3 = aetkVar.h;
                                if (l3 != null) {
                                    long jLongValue3 = l3.longValue();
                                    akzxVar.u();
                                    defpackage.apex apexVar5 = (defpackage.apex) akzxVar.b;
                                    apexVar5.b |= 2097152;
                                    apexVar5.g = jLongValue3;
                                }
                                java.lang.Long l4 = aetkVar.i;
                                if (l4 != null) {
                                    long jLongValue4 = l4.longValue();
                                    akzxVar.u();
                                    defpackage.apex apexVar6 = (defpackage.apex) akzxVar.b;
                                    apexVar6.b |= 4194304;
                                    apexVar6.h = jLongValue4;
                                }
                                java.lang.Long l5 = aetkVar.j;
                                if (l5 != null) {
                                    long jLongValue5 = l5.longValue();
                                    akzxVar.u();
                                    defpackage.apex apexVar7 = (defpackage.apex) akzxVar.b;
                                    apexVar7.b |= 8388608;
                                    apexVar7.i = jLongValue5;
                                }
                            }
                            java.lang.Long l6 = aetjVar.a;
                            if (l6 != null) {
                                long jLongValue6 = l6.longValue();
                                akzxVar.u();
                                defpackage.apex apexVar8 = (defpackage.apex) akzxVar.b;
                                apexVar8.b |= 16777216;
                                apexVar8.j = jLongValue6;
                            }
                            java.lang.Long l7 = aetjVar.b;
                            if (l7 != null) {
                                long jLongValue7 = l7.longValue();
                                akzxVar.u();
                                defpackage.apex apexVar9 = (defpackage.apex) akzxVar.b;
                                apexVar9.b |= 33554432;
                                apexVar9.k = jLongValue7;
                            }
                            java.lang.Long l8 = aetjVar.c;
                            if (l8 != null) {
                                long jLongValue8 = l8.longValue();
                                akzxVar.u();
                                defpackage.apex apexVar10 = (defpackage.apex) akzxVar.b;
                                apexVar10.b |= 67108864;
                                apexVar10.l = jLongValue8;
                            }
                            defpackage.apex apexVar11 = (defpackage.apex) akzxVar.r();
                            akzxVarM3.u();
                            defpackage.apez apezVar = (defpackage.apez) akzxVarM3.b;
                            j$.util.Objects.requireNonNull(apexVar11);
                            apezVar.c = apexVar11;
                            apezVar.b |= 1;
                            akzxVarM2.u();
                            defpackage.apfa apfaVar = (defpackage.apfa) akzxVarM2.b;
                            defpackage.apez apezVar2 = (defpackage.apez) akzxVarM3.r();
                            j$.util.Objects.requireNonNull(apezVar2);
                            apfaVar.c = apezVar2;
                            apfaVar.b |= 1;
                            defpackage.akzx akzxVarM5 = defpackage.apfy.a.m();
                            defpackage.apfx apfxVarR = ((java.lang.Boolean) aetlVar.d.a()).booleanValue() ? aetlVar.e.r(iMyPid, ahziVarBI) : aetlVar.e.r(android.os.Process.myPid(), ahziVarBI);
                            akzxVarM5.u();
                            defpackage.apfy apfyVar = (defpackage.apfy) akzxVarM5.b;
                            j$.util.Objects.requireNonNull(apfxVarR);
                            apfyVar.c = apfxVarR;
                            apfyVar.b |= 1;
                            akzxVarM2.u();
                            defpackage.apfa apfaVar2 = (defpackage.apfa) akzxVarM2.b;
                            defpackage.apfy apfyVar2 = (defpackage.apfy) akzxVarM5.r();
                            j$.util.Objects.requireNonNull(apfyVar2);
                            apfaVar2.d = apfyVar2;
                            apfaVar2.b |= 2;
                            defpackage.akzx akzxVarM6 = defpackage.apey.a.m();
                            android.content.Context context2 = aetlVar.b;
                            android.app.ActivityManager activityManager = defpackage.aepw.a;
                            java.lang.Object systemService2 = context2.getSystemService("power");
                            systemService2.getClass();
                            java.lang.String str5 = str4;
                            int i3 = i2;
                            boolean zIsInteractive = ((android.os.PowerManager) systemService2).isInteractive();
                            akzxVarM6.u();
                            defpackage.apey apeyVar = (defpackage.apey) akzxVarM6.b;
                            apeyVar.b |= 1;
                            apeyVar.c = zIsInteractive;
                            akzxVarM2.u();
                            defpackage.apfa apfaVar3 = (defpackage.apfa) akzxVarM2.b;
                            defpackage.apey apeyVar2 = (defpackage.apey) akzxVarM6.r();
                            j$.util.Objects.requireNonNull(apeyVar2);
                            apfaVar3.f = apeyVar2;
                            apfaVar3.b |= 8;
                            akzxVarM2.u();
                            defpackage.apfa apfaVar4 = (defpackage.apfa) akzxVarM2.b;
                            apfaVar4.e = i3 - 1;
                            apfaVar4.b |= 4;
                            if (str5 != null) {
                                akzxVarM2.u();
                                defpackage.apfa apfaVar5 = (defpackage.apfa) akzxVarM2.b;
                                j$.util.Objects.requireNonNull(str5);
                                apfaVar5.b |= 16;
                                apfaVar5.g = str5;
                            }
                            defpackage.aevn aevnVar = aevnVarE;
                            java.lang.String str6 = str3;
                            defpackage.apfa apfaVar6 = (defpackage.apfa) akzxVarM2.r();
                            akzxVarM.u();
                            defpackage.apgu apguVar = (defpackage.apgu) akzxVarM.b;
                            j$.util.Objects.requireNonNull(apfaVar6);
                            apguVar.f = apfaVar6;
                            apguVar.b |= 8;
                            defpackage.apgu apguVar2 = (defpackage.apgu) akzxVarM.r();
                            defpackage.aeqq aeqqVarA = defpackage.aeqr.a();
                            aeqqVarA.a = str6;
                            aeqqVarA.c(true);
                            aeqqVarA.d = aevnVar;
                            aeqqVarA.f(apguVar2);
                            aeqqVarA.b = apevVar;
                            if (i3 != 1) {
                                aeqqVarA.d(true);
                            }
                            return aethVar2.c.a(aeqqVarA.a());
                        }
                    }, ajcuVar);
                }
            }));
        } else if (defpackage.ajcl.a == null) {
            new defpackage.ajcl();
        }
    }

    @Override // defpackage.aeqv
    public final void n() {
    }
}
