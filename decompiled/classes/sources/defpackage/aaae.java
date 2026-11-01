package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class aaae extends defpackage.aaeb {
    final /* synthetic */ defpackage.aaaf a;
    private final defpackage.zyy h;
    private final defpackage.zzt i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aaae(defpackage.aaaf aaafVar, defpackage.zyy zyyVar, defpackage.aade aadeVar, defpackage.zzt zztVar) {
        super(defpackage.zzd.l, aadeVar);
        j$.util.Objects.requireNonNull(aaafVar);
        this.a = aaafVar;
        this.h = zyyVar;
        this.i = zztVar;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00ff  */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.Object, java.util.Queue] */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.Object, java.util.Queue] */
    @Override // defpackage.aaeb
    protected final /* synthetic */ void b(defpackage.aacr aacrVar) {
        java.util.List<amud> list;
        java.util.ArrayList arrayList;
        int i;
        com.google.android.gms.clearcut.LogEventParcelable logEventParcelableC;
        com.google.android.gms.common.Feature[] featureArrR;
        int size;
        boolean z;
        long j;
        defpackage.zzu zzuVar;
        long jLongValue;
        long jCb;
        defpackage.aaag aaagVar = (defpackage.aaag) aacrVar;
        try {
            defpackage.zyy zyyVar = this.h;
            zyyVar.n();
            java.lang.String str = zyyVar.j;
            int i2 = ((defpackage.amua) zyyVar.p.b).e;
            if (str == null || str.isEmpty()) {
                str = null;
            }
            defpackage.zzq zzqVar = zyyVar.a.c;
            if (str == null) {
                arrayList = new java.util.ArrayList();
            } else {
                android.content.Context context = ((defpackage.aaak) zzqVar).e;
                if (context == null) {
                    list = java.util.Collections.EMPTY_LIST;
                } else {
                    j$.util.concurrent.ConcurrentHashMap concurrentHashMap = defpackage.aaak.b;
                    defpackage.aexb aexbVar = (defpackage.aexb) concurrentHashMap.get(str);
                    if (aexbVar == null) {
                        defpackage.aewz aewzVar = defpackage.aaak.a;
                        defpackage.amue amueVar = defpackage.amue.a;
                        int i3 = defpackage.aexb.d;
                        defpackage.aeww aewwVar = new defpackage.aeww(aewzVar, str, amueVar);
                        aexbVar = (defpackage.aexb) concurrentHashMap.putIfAbsent(str, aewwVar);
                        if (aexbVar == null) {
                            aexbVar = aewwVar;
                        }
                    }
                    list = ((defpackage.amue) aexbVar.b()).b;
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.String packageName = context != null ? context.getPackageName() : "";
                for (amud amudVar : list) {
                    if (amudVar.g.size() <= 0 || amudVar.g.contains(packageName)) {
                        if ((amudVar.b & 1) == 0 || (i = amudVar.c) == 0 || i == i2) {
                            arrayList2.add(amudVar);
                        }
                    }
                }
                arrayList = arrayList2;
            }
            java.util.Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    defpackage.zzt zztVar = this.i;
                    if (!zztVar.b()) {
                        l(new com.google.android.gms.common.api.Status(0, "The event was not logged due to sampling.", null, null));
                        defpackage.aaaj.b().e(zyyVar.j, 1006);
                        return;
                    }
                    double d = zztVar.f;
                    if (d != 0.0d) {
                        zyyVar.i(d);
                    }
                    try {
                        logEventParcelableC = zyyVar.c();
                        if ((zyyVar instanceof defpackage.zzc) && (zzuVar = ((defpackage.zzc) zyyVar).q) != null) {
                            defpackage.amua amuaVar = logEventParcelableC.o;
                            amuaVar.getClass();
                            logEventParcelableC.i = new com.google.android.gms.clearcut.internal.LogVerifierResultParcelable(zzuVar.a(amuaVar.f));
                        }
                    } catch (java.lang.RuntimeException e) {
                        android.util.Log.e("ClearcutLoggerApiImpl", "Error building the LogEventParcelable.", e);
                        logEventParcelableC = null;
                    }
                    if (logEventParcelableC == null) {
                        i(new com.google.android.gms.common.api.Status(10, "MessageProducer", null, null));
                        return;
                    }
                    android.content.Context context2 = aaagVar.b;
                    defpackage.aaap aaapVar = defpackage.aaaf.a;
                    if (defpackage.andt.a.eZ().f(context2) && (featureArrR = aaagVar.r()) != null) {
                        for (com.google.android.gms.common.Feature feature : featureArrR) {
                            java.lang.String str2 = feature.a;
                            com.google.android.gms.common.Feature feature2 = defpackage.zzp.c;
                            if (j$.util.Objects.equals(str2, feature2.a) && feature.a() >= feature2.a()) {
                                defpackage.aaap aaapVar2 = defpackage.aaaf.a;
                                who whoVar = new who(this, 20);
                                achb achbVar = new achb(this, 1);
                                aaal aaalVar = new aaal();
                                aaalVar.c(false);
                                aaalVar.b(false);
                                aaalVar.a = logEventParcelableC;
                                aaalVar.b = whoVar;
                                aaalVar.c = achbVar;
                                aaam aaamVarA = aaalVar.a();
                                defpackage.apkl apklVar = aaapVar2.a;
                                android.content.Context context3 = aaagVar.b;
                                long jC = defpackage.andt.a.eZ().c(context3);
                                java.lang.String strCc = defpackage.aehj.cc(aaamVarA.a.a);
                                synchronized (apklVar.c) {
                                    ?? r11 = apklVar.d;
                                    r11.add(aaamVarA);
                                    size = r11.size() + apklVar.b.size();
                                    z = apklVar.a;
                                    apklVar.a = true;
                                }
                                defpackage.apkl.h(context3, strCc, 1025);
                                byte[] bArr = aaamVarA.a.b;
                                if (bArr == null) {
                                    defpackage.apkl.h(context3, strCc, 1038);
                                    j = jC;
                                } else {
                                    j = jC;
                                    if (bArr.length > defpackage.andt.a.eZ().b(context3)) {
                                        defpackage.apkl.h(context3, strCc, 1039);
                                    }
                                }
                                if (size >= j) {
                                    defpackage.apkl.h(context3, strCc, 1040);
                                }
                                if (z) {
                                    return;
                                }
                                aaapVar2.d(aaagVar, defpackage.aehj.cc(logEventParcelableC.a));
                                return;
                            }
                        }
                    }
                    try {
                        if (defpackage.andw.a.eZ().b(this.a.b)) {
                            logEventParcelableC.l = defpackage.aaaj.b().a();
                        }
                        defpackage.aaad aaadVar = new defpackage.aaad(this);
                        defpackage.aaai aaaiVar = (defpackage.aaai) aaagVar.v();
                        android.os.Parcel parcelEP = aaaiVar.eP();
                        java.lang.ClassLoader classLoader = defpackage.yld.a;
                        parcelEP.writeStrongBinder(aaadVar);
                        defpackage.yld.d(parcelEP, logEventParcelableC);
                        aaaiVar.eS(1, parcelEP);
                        this.a.e(defpackage.aaaj.b().a());
                        return;
                    } catch (android.os.RemoteException | java.lang.RuntimeException e2) {
                        android.util.Log.e("ClearcutLoggerApiImpl", "Failed to call logEvent", e2);
                        defpackage.aaaj.b().d(1009, this.a.b);
                        if (e2 instanceof android.os.TransactionTooLargeException) {
                            android.util.Log.e("ClearcutLoggerApiImpl", "Log event caused a TransactionTooLargeException", e2);
                            defpackage.aaaj.b().e(logEventParcelableC.a.f, 31004);
                        } else {
                            defpackage.aaaj.b().e(logEventParcelableC.a.f, 1003);
                        }
                        throw e2;
                    }
                }
                amud amudVar2 = (amud) it.next();
                java.lang.String str3 = amudVar2.d;
                android.content.Context context4 = ((defpackage.aaak) zzqVar).e;
                if (defpackage.abyl.h(context4)) {
                    if (defpackage.aaak.d == null) {
                        if (context4 != null) {
                            if (defpackage.aaak.c == null) {
                                defpackage.aaak.c = java.lang.Boolean.valueOf(((android.content.Context) defpackage.aaiy.a.a(context4).a).checkCallingOrSelfPermission("com.google.android.providers.gsf.permission.READ_GSERVICES") == 0);
                            }
                            if (defpackage.aaak.c.booleanValue()) {
                                defpackage.aaak.d = java.lang.Long.valueOf(defpackage.aaym.b(context4.getContentResolver(), 0L));
                            } else {
                                defpackage.aaak.d = 0L;
                            }
                        } else {
                            jLongValue = 0;
                        }
                    }
                    jLongValue = defpackage.aaak.d.longValue();
                } else {
                    jLongValue = 0;
                }
                if (str3 == null || str3.isEmpty()) {
                    jCb = defpackage.aehj.cb(java.nio.ByteBuffer.allocate(8).putLong(jLongValue).array());
                } else {
                    byte[] bytes = str3.getBytes(java.nio.charset.StandardCharsets.UTF_8);
                    java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(bytes.length + 8);
                    byteBufferAllocate.put(bytes);
                    byteBufferAllocate.putLong(jLongValue);
                    jCb = defpackage.aehj.cb(byteBufferAllocate.array());
                }
                long j2 = amudVar2.e;
                long j3 = amudVar2.f;
                if (j2 >= 0 && j3 > 0) {
                    if ((jCb >= 0 ? jCb % j3 : (((Long.MAX_VALUE % j3) + 1) + ((jCb & Long.MAX_VALUE) % j3)) % j3) >= j2) {
                        l(com.google.android.gms.common.api.Status.a);
                        return;
                    }
                }
            }
        } catch (java.lang.RuntimeException e3) {
            android.util.Log.e("ClearcutLoggerApiImpl", "derived ClearcutLogger.EventModifier ", e3);
            i(new com.google.android.gms.common.api.Status(10, "EventModifier", null, null));
        }
    }

    @Override // defpackage.aaeb, defpackage.aaec
    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj) {
        super.l((defpackage.aadl) obj);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* bridge */ /* synthetic */ defpackage.aadl a(com.google.android.gms.common.api.Status status) {
        return status;
    }
}
