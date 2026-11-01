package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hjx {
    public static int c;
    public java.lang.Object a;
    public final java.lang.Object b;

    public hjx(dtr dtrVar) {
        this.a = null;
        this.b = new java.util.ArrayList();
        c++;
        this.a = dtrVar;
    }

    private static final defpackage.exa o(defpackage.exa exaVar, java.util.List list) {
        java.util.Map map = exaVar.b;
        java.util.HashMap map2 = new java.util.HashMap(map);
        java.util.HashSet hashSet = new java.util.HashSet(list);
        for (java.lang.String str : map.keySet()) {
            if (!hashSet.contains(str)) {
                map2.remove(str);
            }
        }
        return new defpackage.exa(map2);
    }

    public final void a() {
        java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) this.b;
        byteBuffer.position(byteBuffer.limit());
    }

    public final void b(java.util.List list) {
        defpackage.eve eveVar;
        for (int i = 0; i < list.size(); i++) {
            if (((amwp) list.get(i)).a == 1) {
                try {
                    eveVar = new defpackage.eve((amwp) list.get(i));
                } catch (defpackage.evd unused) {
                    eveVar = null;
                }
                this.a = eveVar;
            }
        }
    }

    public final void c(android.media.MediaCodec mediaCodec) {
        java.lang.Object obj = this.a;
        if (obj == null || mp$.ExternalSyntheticApiModelOutline1.m(mp$.ExternalSyntheticApiModelOutline1.m(obj), mediaCodec)) {
            ahvr.bY(((java.util.HashSet) this.b).add(mediaCodec));
        }
    }

    public final void d(android.media.MediaCodec mediaCodec) {
        java.lang.Object obj;
        if (!((java.util.HashSet) this.b).remove(mediaCodec) || (obj = this.a) == null) {
            return;
        }
        mp$.ExternalSyntheticApiModelOutline1.m(mp$.ExternalSyntheticApiModelOutline1.m(obj), mediaCodec);
    }

    public final void e(int i) {
        java.lang.Object obj = this.a;
        if (obj != null) {
            mp$.ExternalSyntheticApiModelOutline1.m(mp$.ExternalSyntheticApiModelOutline1.m(obj));
            this.a = null;
        }
        android.media.LoudnessCodecController loudnessCodecControllerM = mp$.ExternalSyntheticApiModelOutline1.m(i, ajbm.a, new defpackage.fdy(this));
        this.a = loudnessCodecControllerM;
        java.util.Iterator it = ((java.util.HashSet) this.b).iterator();
        while (it.hasNext()) {
            if (!mp$.ExternalSyntheticApiModelOutline1.m(loudnessCodecControllerM, (android.media.MediaCodec) it.next())) {
                it.remove();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Collection, java.util.Set] */
    public final void f(java.lang.Exception exc, boolean z) {
        this.a = null;
        ?? r4 = this.b;
        aify aifyVarN = aify.n((java.util.Collection) r4);
        r4.clear();
        int size = aifyVarN.size();
        for (int i = 0; i < size; i++) {
            defpackage.fcm fcmVar = (defpackage.fcm) aifyVarN.get(i);
            int i2 = 1;
            if (true != z) {
                i2 = 3;
            }
            fcmVar.e(exc, i2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Set] */
    public final void g(defpackage.fcm fcmVar) {
        this.b.add(fcmVar);
        if (this.a == null) {
            this.a = fcmVar;
            fcmVar.g();
        }
    }

    public final void h(defpackage.ffl fflVar) {
        ((aift) this.b).i(fflVar);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    public final void i(defpackage.exa exaVar) {
        for (java.util.Map.Entry entry : new java.util.HashMap((java.util.Map) this.b).entrySet()) {
            defpackage.exb exbVar = (defpackage.exb) entry.getKey();
            java.util.List list = (java.util.List) entry.getValue();
            if (!o(exaVar, list).equals(o((defpackage.exa) this.a, list))) {
                exbVar.a();
            }
        }
        this.a = exaVar;
    }

    public final long j(defpackage.dtj dtjVar, long j) {
        dtr dtrVar = dtjVar.d;
        if (dtrVar instanceof defpackage.dtn) {
            return j;
        }
        java.util.List list = dtjVar.j;
        int size = list.size();
        long jMin = j;
        for (int i = 0; i < size; i++) {
            dti dtiVar = (dti) list.get(i);
            if (dtiVar instanceof defpackage.dtj) {
                defpackage.dtj dtjVar2 = (defpackage.dtj) dtiVar;
                if (dtjVar2.d != dtrVar) {
                    jMin = java.lang.Math.min(jMin, j(dtjVar2, ((long) dtjVar2.e) + j));
                }
            }
        }
        if (dtjVar != dtrVar.i) {
            return jMin;
        }
        long jA = dtrVar.a();
        defpackage.dtj dtjVar3 = dtrVar.h;
        long j2 = j - jA;
        return java.lang.Math.min(java.lang.Math.min(jMin, j(dtjVar3, j2)), j2 - ((long) dtjVar3.e));
    }

    public final long k(defpackage.dtj dtjVar, long j) {
        dtr dtrVar = dtjVar.d;
        if (dtrVar instanceof defpackage.dtn) {
            return j;
        }
        java.util.List list = dtjVar.j;
        int size = list.size();
        long jMax = j;
        for (int i = 0; i < size; i++) {
            dti dtiVar = (dti) list.get(i);
            if (dtiVar instanceof defpackage.dtj) {
                defpackage.dtj dtjVar2 = (defpackage.dtj) dtiVar;
                if (dtjVar2.d != dtrVar) {
                    jMax = java.lang.Math.max(jMax, k(dtjVar2, ((long) dtjVar2.e) + j));
                }
            }
        }
        if (dtjVar != dtrVar.h) {
            return jMax;
        }
        long jA = dtrVar.a();
        defpackage.dtj dtjVar3 = dtrVar.i;
        long j2 = j + jA;
        return java.lang.Math.max(java.lang.Math.max(jMax, k(dtjVar3, j2)), j2 - ((long) dtjVar3.e));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Map] */
    public final synchronized java.util.Map l() {
        if (this.a == null) {
            this.a = j$.util.DesugarCollections.unmodifiableMap(new java.util.HashMap((java.util.Map) this.b));
        }
        return this.a;
    }

    public final synchronized void m(java.util.concurrent.atomic.AtomicBoolean atomicBoolean) {
        java.lang.Object obj;
        if (atomicBoolean.get() && (obj = this.a) != null) {
            ((android.os.PowerManager.WakeLock) obj).release();
        }
    }

    public final synchronized void n(boolean z, boolean z2) {
        if (z) {
            if (this.a == null) {
                java.lang.Object obj = this.b;
                if (((android.content.Context) obj).checkSelfPermission("android.permission.WAKE_LOCK") != 0) {
                    defpackage.etr.f("WakeLockManager", "WAKE_LOCK permission not granted, can't acquire wake lock for playback");
                    return;
                }
                android.os.PowerManager powerManager = (android.os.PowerManager) ((android.content.Context) obj).getSystemService("power");
                if (powerManager == null) {
                    defpackage.etr.f("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                    return;
                }
                android.os.PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                this.a = wakeLockNewWakeLock;
                android.os.PowerManager.WakeLock wakeLock = wakeLockNewWakeLock;
                wakeLockNewWakeLock.setReferenceCounted(false);
            }
        }
        java.lang.Object obj2 = this.a;
        if (obj2 == null) {
            return;
        }
        if (defpackage.eup.c(z, z2)) {
            ((android.os.PowerManager.WakeLock) obj2).acquire();
        } else {
            ((android.os.PowerManager.WakeLock) obj2).release();
        }
    }

    public hjx(java.lang.Object obj) {
        this.b = obj;
    }

    public hjx(char[] cArr, byte[] bArr) {
        this.b = new java.util.HashMap();
    }

    public hjx(defpackage.eyc eycVar) {
        j$.util.Objects.requireNonNull(eycVar);
        this.b = new java.util.HashMap();
        this.a = defpackage.exa.a;
    }

    public hjx(android.content.Context context) {
        this.b = context == null ? null : context.getApplicationContext();
    }

    public hjx(defpackage.fcq fcqVar) {
        j$.util.Objects.requireNonNull(fcqVar);
        this.b = new java.util.HashSet();
    }

    public hjx(char[] cArr) {
        this.b = new aift(4);
    }

    public hjx(byte[] bArr) {
        this.b = new java.util.HashSet();
    }

    public hjx() {
        this.b = java.nio.ByteBuffer.allocateDirect(500);
    }
}
