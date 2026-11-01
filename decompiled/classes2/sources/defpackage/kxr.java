package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kxr {
    public static final aimz a = aimz.i("com/android/dialer/callrecording/impl/service/CallRecorder");
    private static final j$.time.Duration v = j$.time.Duration.ofSeconds(1);
    public final defpackage.kww b;
    public final android.content.Context c;
    public final ajct d;
    public final kwt e;
    public final aoin f;
    public final rlv g;
    public final java.util.concurrent.ScheduledExecutorService h;
    public final ahpz i;
    public final java.util.concurrent.atomic.AtomicBoolean j = new java.util.concurrent.atomic.AtomicBoolean(false);
    public final java.util.concurrent.atomic.AtomicReference k = new java.util.concurrent.atomic.AtomicReference(defpackage.kxq.a);
    public final agtc l;
    public final aoin m;
    public final defpackage.mba n;
    public final zpz o;
    public final defpackage.idh p;
    public final qbe q;
    public final defpackage.kvt r;
    public final ipc s;
    public final pgi t;
    public rai u;
    private final aoin w;
    private final defpackage.klt x;
    private final gou y;
    private final aogc z;

    public kxr(android.content.Context context, ajct ajctVar, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, defpackage.kvt kvtVar, defpackage.kww kwwVar, aogc aogcVar, ipc ipcVar, zpz zpzVar, kwt kwtVar, aoin aoinVar, pgi pgiVar, rlv rlvVar, ahpz ahpzVar, defpackage.idh idhVar, qbe qbeVar, gou gouVar, defpackage.mba mbaVar, uss ussVar, defpackage.klt kltVar, aoin aoinVar2, aoin aoinVar3) {
        this.c = context;
        this.d = ajctVar;
        this.h = scheduledExecutorService;
        this.r = kvtVar;
        this.b = kwwVar;
        this.z = aogcVar;
        this.s = ipcVar;
        this.o = zpzVar;
        this.e = kwtVar;
        this.f = aoinVar;
        this.t = pgiVar;
        this.g = rlvVar;
        this.i = ahpzVar;
        this.p = idhVar;
        this.q = qbeVar;
        this.y = gouVar;
        this.x = kltVar;
        this.n = mbaVar;
        this.w = aoinVar2;
        j$.util.Objects.requireNonNull(ussVar);
        this.l = new agtc(new defpackage.ibg(ussVar, 9), ajbm.a);
        this.m = aoinVar3;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [aoss, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [aoss, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [aoss, java.lang.Object] */
    private final ajcq g(defpackage.kxq kxqVar) {
        if (!((java.lang.Boolean) this.w.a()).booleanValue()) {
            gou gouVar = this.y;
            ajcq ajcqVarI = ahvr.I(aosv.F((aoss) gouVar.c, 0, new defpackage.hqi(gouVar, (aoln) null, 16), 3), new defpackage.kxm(kxqVar, 5), this.h);
            ajcq ajcqVarA = this.l.a();
            return ahvr.ak(new ajcq[]{ajcqVarA, ajcqVarI}).p(ahqx.b(new defpackage.kff(this, ajcqVarI, ajcqVarA, kxqVar, 2)), this.d);
        }
        boolean zEquals = kxqVar.equals(defpackage.kxq.b);
        defpackage.klt kltVar = this.x;
        ajcq ajcqVarF = zEquals ? aosv.F((aoss) kltVar.a, 0, new defpackage.ksy(kltVar, (aoln) null, 3, (byte[]) null), 3) : aosv.F((aoss) kltVar.a, 0, new defpackage.ksy(kltVar, (aoln) null, 2), 3);
        a.b().l("com/android/dialer/callrecording/impl/service/CallRecorder", "playAudio", 455, "CallRecorder.java").I("playAudio %s -> %s ", (defpackage.kxq) this.k.getAndSet(kxqVar), kxqVar);
        ahvr.J(ajcqVarF, ahqx.f(new defpackage.kxp(this, kxqVar, 0)), this.h);
        return ajcqVarF;
    }

    public final ajcq a() {
        return g(defpackage.kxq.d);
    }

    public final ajcq b() {
        return g(defpackage.kxq.b);
    }

    public final ajcq c(final long j) {
        a.b().l("com/android/dialer/callrecording/impl/service/CallRecorder", "startRecording", 178, "CallRecorder.java").v("enter");
        int i = 0;
        this.j.set(false);
        jsd jsdVar = new jsd(ahqx.a(new defpackage.kwz(0)), 9);
        aogc aogcVar = this.z;
        agsm.i(235, ((kaw) aogcVar.c).p(((aogc) aogcVar.b).bl(jsdVar)), "failed to set setting: CallRecordingUsedAtLeastOnce", new java.lang.Object[0]);
        akzc akzcVar = akzc.d;
        final akzb akzbVar = new akzb(128);
        final java.util.concurrent.atomic.AtomicInteger atomicInteger = new java.util.concurrent.atomic.AtomicInteger();
        final java.util.concurrent.atomic.AtomicInteger atomicInteger2 = new java.util.concurrent.atomic.AtomicInteger();
        final java.util.concurrent.atomic.AtomicInteger atomicInteger3 = new java.util.concurrent.atomic.AtomicInteger();
        defpackage.idh idhVar = this.p;
        j$.time.Duration duration = v;
        ahoq ahoqVarW = ahvr.W(105, "TidepodsCallAudioImpl_createDownlinkAndUplinkTee");
        try {
            ahrv ahrvVarI = ahrv.g(idhVar.c()).i(new defpackage.idd(idhVar, duration, i), idhVar.c);
            ahoqVarW.a(ahrvVarI);
            ahoqVarW.close();
            int i2 = 4;
            defpackage.kxm kxmVar = new defpackage.kxm(this, i2);
            java.util.concurrent.ScheduledExecutorService scheduledExecutorService = this.h;
            int i3 = 3;
            ahrv ahrvVarG = ahrv.g(ahvr.H(ahvr.C(ahrvVarI, java.lang.Throwable.class, kxmVar, scheduledExecutorService), new defpackage.kxn(this, i3), scheduledExecutorService));
            defpackage.juo juoVar = new defpackage.juo(this, atomicInteger, akzbVar, 7, (char[]) null);
            ajct ajctVar = this.d;
            ahrv ahrvVarF = ahrvVarG.i(juoVar, ajctVar).i(new ajat() { // from class: kxo
                public final ajcq a(java.lang.Object obj) {
                    akzb akzbVar2 = akzbVar;
                    java.util.concurrent.atomic.AtomicInteger atomicInteger4 = atomicInteger2;
                    java.util.concurrent.atomic.AtomicInteger atomicInteger5 = atomicInteger;
                    long j2 = j;
                    java.util.concurrent.atomic.AtomicInteger atomicInteger6 = atomicInteger3;
                    ahoq ahoqVarW2 = ahvr.W(234, "CallRecorder_startRecording_saveAudioFile");
                    try {
                        int iA = akzbVar2.a();
                        defpackage.kxr kxrVar = this.a;
                        if (iA == 0) {
                            kxrVar.q.a(qbc.dd);
                        }
                        defpackage.kxr.a.b().l("com/android/dialer/callrecording/impl/service/CallRecorder", "startRecording", 253, "CallRecorder.java").v("set state: idle (saving file)");
                        kxrVar.k.set(defpackage.kxq.a);
                        kxrVar.o.a(ajcm.a);
                        atomicInteger4.set(((akzbVar2.a() / atomicInteger5.get()) / 2) * 1000);
                        java.io.File file = new java.io.File(kxrVar.c.getFilesDir(), "callrecording");
                        file.mkdir();
                        java.lang.String str = file.getAbsolutePath() + java.io.File.separator + a.bC(j2, "record-", ".wav");
                        akzx akzxVarM = defpackage.idt.a.m();
                        akzxVarM.u();
                        defpackage.idt idtVar = (defpackage.idt) akzxVarM.b;
                        j$.util.Objects.requireNonNull(str);
                        idtVar.b |= 1;
                        idtVar.e = str;
                        akzx akzxVarM2 = defpackage.ids.a.m();
                        int i4 = atomicInteger5.get();
                        akzxVarM2.u();
                        defpackage.ids idsVar = (defpackage.ids) akzxVarM2.b;
                        idsVar.b |= 1;
                        idsVar.c = i4;
                        akzxVarM2.u();
                        defpackage.ids idsVar2 = (defpackage.ids) akzxVarM2.b;
                        idsVar2.b |= 2;
                        idsVar2.d = 1;
                        akzxVarM2.u();
                        defpackage.ids idsVar3 = (defpackage.ids) akzxVarM2.b;
                        idsVar3.b |= 4;
                        idsVar3.e = 2;
                        akzxVarM2.u();
                        defpackage.ids idsVar4 = (defpackage.ids) akzxVarM2.b;
                        idsVar4.b |= 8;
                        idsVar4.f = true;
                        akzxVarM.u();
                        defpackage.idt idtVar2 = (defpackage.idt) akzxVarM.b;
                        defpackage.ids idsVar5 = (defpackage.ids) akzxVarM2.p();
                        j$.util.Objects.requireNonNull(idsVar5);
                        idtVar2.d = idsVar5;
                        idtVar2.c = 3;
                        ahrv ahrvVarE = ahrv.g(kxrVar.s.n((defpackage.idt) akzxVarM.p(), akzbVar2.b())).h(new defpackage.kxn(atomicInteger6, 2), kxrVar.d).e(java.lang.Throwable.class, new defpackage.kwz(12), kxrVar.h);
                        ahoqVarW2.close();
                        return ahrvVarE;
                    } catch (java.lang.Throwable th) {
                        try {
                            ahoqVarW2.close();
                        } catch (java.lang.Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            }, ajctVar).i(new defpackage.kxm(this, 8), scheduledExecutorService).i(new defpackage.jwi(this, j, i2), scheduledExecutorService).f(java.lang.Exception.class, new defpackage.kxm(this, i), scheduledExecutorService).h(new defpackage.kxn(this, 1), scheduledExecutorService).i(new defpackage.juo(this, atomicInteger2, atomicInteger3, 6, (short[]) null), scheduledExecutorService).i(new defpackage.kxm(this, 2), scheduledExecutorService).h(new defpackage.kxn(this, i), scheduledExecutorService).i(new defpackage.kxm(this, i3), scheduledExecutorService).f(java.lang.Exception.class, new defpackage.kxm(this, 6), scheduledExecutorService);
            defpackage.kww kwwVar = this.b;
            return ahrv.g(kwwVar.n.g(new defpackage.gzk(kwwVar, ahrvVarF, 13), kwwVar.c)).i(new defpackage.kxm(ahrvVarF, 7), scheduledExecutorService);
        } catch (java.lang.Throwable th) {
            try {
                ahoqVarW.close();
                throw th;
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public final void d() {
        this.j.set(true);
    }

    public final boolean e() {
        java.util.concurrent.atomic.AtomicReference atomicReference = this.k;
        return atomicReference.get() == defpackage.kxq.b || atomicReference.get() == defpackage.kxq.d;
    }

    public final boolean f() {
        aimw aimwVarL = a.b().l("com/android/dialer/callrecording/impl/service/CallRecorder", "isStartingOrRecording", 562, "CallRecorder.java");
        java.util.concurrent.atomic.AtomicReference atomicReference = this.k;
        aimwVarL.y("recording state: %s", atomicReference.get());
        return atomicReference.get() == defpackage.kxq.b || atomicReference.get() == defpackage.kxq.c;
    }
}
