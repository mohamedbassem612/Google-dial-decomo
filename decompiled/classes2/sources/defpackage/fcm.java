package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fcm implements defpackage.fcs {
    public final java.util.List a;
    public final defpackage.fda b;
    public final java.util.UUID c;
    public final defpackage.fck d;
    public final java.lang.Object e;
    public int f;
    public byte[] g;
    public final defpackage.hjx h;
    public defpackage.hjx i;
    public ils j;
    public final defpackage.kvt k;
    private final boolean l = true;
    private final boolean m;
    private final java.util.HashMap n;
    private final defpackage.etg o;
    private final defpackage.fag p;
    private final android.os.Looper q;
    private int r;
    private android.os.HandlerThread s;
    private defpackage.fci t;
    private defpackage.fcr u;
    private byte[] v;
    private defpackage.fdb w;
    private ils x;
    private final rai y;

    public fcm(java.util.UUID uuid, defpackage.fda fdaVar, defpackage.hjx hjxVar, rai raiVar, java.util.List list, boolean z, boolean z2, byte[] bArr, java.util.HashMap map, defpackage.kvt kvtVar, android.os.Looper looper, defpackage.fag fagVar) {
        this.c = uuid;
        this.h = hjxVar;
        this.y = raiVar;
        this.b = fdaVar;
        this.m = z2;
        if (bArr != null) {
            this.v = bArr;
            this.a = null;
        } else {
            ahvr.ci(list);
            this.a = j$.util.DesugarCollections.unmodifiableList(list);
        }
        this.n = map;
        this.k = kvtVar;
        this.o = new defpackage.etg();
        this.p = fagVar;
        this.f = 2;
        this.q = looper;
        this.d = new defpackage.fck(this, looper);
        this.e = new java.lang.Object();
    }

    private final void p(java.util.function.Consumer consumer) {
        java.util.Set set;
        defpackage.etg etgVar = this.o;
        synchronized (etgVar.a) {
            set = etgVar.c;
        }
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            aa$.ExternalSyntheticApiModelOutline1.m(consumer, (alic) it.next());
        }
    }

    private final void q(java.lang.Throwable th, boolean z) {
        if ((th instanceof android.media.NotProvisionedException) || defpackage.hgu.au(th)) {
            this.h.g(this);
        } else {
            e(th, true != z ? 2 : 1);
        }
    }

    private final void r(byte[] bArr, int i, boolean z) {
        try {
            synchronized (this.e) {
                defpackage.hjx hjxVar = new defpackage.hjx((char[]) null);
                this.i = hjxVar;
                java.util.List list = this.a;
                if (list != null) {
                    hjxVar.a = aify.n(list);
                }
            }
            this.x = this.b.m(bArr, this.a, i, this.n);
            defpackage.fci fciVar = this.t;
            java.lang.String str = eum.a;
            ils ilsVar = this.x;
            ahvr.ci(ilsVar);
            fciVar.a(2, ilsVar, z);
        } catch (java.lang.Exception | java.lang.NoSuchMethodError e) {
            q(e, true);
        }
    }

    private final boolean s() {
        try {
            this.b.f(this.g, this.v);
            return true;
        } catch (java.lang.Exception | java.lang.NoSuchMethodError e) {
            e(e, 1);
            return false;
        }
    }

    @Override // defpackage.fcs
    public final int a() {
        h();
        return this.f;
    }

    @Override // defpackage.fcs
    public final defpackage.fcr b() {
        h();
        if (this.f == 1) {
            return this.u;
        }
        return null;
    }

    @Override // defpackage.fcs
    public final java.util.UUID c() {
        h();
        return this.c;
    }

    public final void d(boolean z) {
        long jMin;
        if (this.m) {
            return;
        }
        byte[] bArr = this.g;
        java.lang.String str = eum.a;
        if (this.v == null) {
            r(bArr, 1, z);
            return;
        }
        if (this.f == 4 || s()) {
            if (defpackage.epx.d.equals(this.c)) {
                h();
                byte[] bArr2 = this.g;
                java.util.Map mapB = bArr2 == null ? null : this.b.b(bArr2);
                android.util.Pair pair = mapB != null ? new android.util.Pair(java.lang.Long.valueOf(defpackage.hgt.ar(mapB, "LicenseDurationRemaining")), java.lang.Long.valueOf(defpackage.hgt.ar(mapB, "PlaybackDurationRemaining"))) : null;
                ahvr.ci(pair);
                jMin = java.lang.Math.min(((java.lang.Long) pair.first).longValue(), ((java.lang.Long) pair.second).longValue());
            } else {
                jMin = Long.MAX_VALUE;
            }
            if (jMin <= 60) {
                defpackage.etr.b("DefaultDrmSession", a.bz(jMin, "Offline license has expired or will expire soon. Remaining seconds: "));
                r(bArr, 2, z);
            } else {
                this.f = 4;
                p(new defpackage.fch(0));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0048  */
    /* JADX WARN: Code duplicated, block: B:27:0x004f  */
    public final void e(java.lang.Throwable th, int i) {
        int iK;
        int i2 = 2;
        if (th instanceof android.media.MediaDrm.MediaDrmStateException) {
            iK = eum.k(eum.l(((android.media.MediaDrm.MediaDrmStateException) th).getDiagnosticInfo()));
        } else if (th instanceof android.media.MediaDrmResetException) {
            iK = 6006;
        } else if ((th instanceof android.media.NotProvisionedException) || defpackage.hgu.au(th)) {
            iK = 6002;
        } else if (th instanceof android.media.DeniedByServerException) {
            iK = 6007;
        } else if (th instanceof defpackage.fdg) {
            iK = 6001;
        } else if (th instanceof defpackage.fco) {
            iK = 6003;
        } else if (th instanceof defpackage.fde) {
            iK = 6008;
        } else if (i == 1) {
            iK = 6006;
        } else if (i == 2) {
            iK = 6004;
        } else {
            iK = 6002;
        }
        this.u = new defpackage.fcr(th, iK);
        defpackage.etr.d("DefaultDrmSession", "DRM session error", th);
        if (th instanceof java.lang.Exception) {
            p(new defpackage.fcg(th, i2));
        } else {
            if (!(th instanceof java.lang.Error)) {
                throw new java.lang.IllegalStateException("Unexpected Throwable subclass", th);
            }
            if (!defpackage.hgu.av(th) && !defpackage.hgu.au(th)) {
                throw ((java.lang.Error) th);
            }
        }
        if (this.f != 4) {
            this.f = 1;
        }
    }

    public final void f(java.lang.Object obj, java.lang.Object obj2) {
        defpackage.hgt hgtVar;
        if (obj == this.x && i()) {
            this.x = null;
            synchronized (this.e) {
                defpackage.hjx hjxVar = this.i;
                ahvr.ci(hjxVar);
                hgtVar = new defpackage.hgt(hjxVar);
                this.i = null;
            }
            int i = 0;
            if ((obj2 instanceof java.lang.Exception) || (obj2 instanceof java.lang.NoSuchMethodError)) {
                q((java.lang.Throwable) obj2, false);
                return;
            }
            try {
                byte[] bArrJ = this.b.j(this.g, (byte[]) ((defpackage.kvt) obj2).b);
                if (this.v != null && bArrJ != null && bArrJ.length != 0) {
                    this.v = bArrJ;
                }
                this.f = 4;
                p(new defpackage.fcg(hgtVar, i));
            } catch (java.lang.Exception | java.lang.NoSuchMethodError e) {
                q(e, true);
            }
        }
    }

    public final void g() {
        this.j = this.b.l();
        defpackage.fci fciVar = this.t;
        java.lang.String str = eum.a;
        ils ilsVar = this.j;
        ahvr.ci(ilsVar);
        fciVar.a(1, ilsVar, true);
    }

    public final void h() {
        android.os.Looper looper = this.q;
        if (java.lang.Thread.currentThread() != looper.getThread()) {
            defpackage.etr.g("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + java.lang.Thread.currentThread().getName() + "\nExpected thread: " + looper.getThread().getName(), new java.lang.IllegalStateException());
        }
    }

    public final boolean i() {
        int i = this.f;
        return i == 3 || i == 4;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0036  */
    /* JADX WARN: Code duplicated, block: B:12:0x003c  */
    public final boolean j() {
        int i = 1;
        if (i()) {
            return true;
        }
        try {
            defpackage.fda fdaVar = this.b;
            byte[] bArrI = fdaVar.i();
            this.g = bArrI;
            fdaVar.g(bArrI, this.p);
            this.w = fdaVar.k(this.g);
            this.f = 3;
            p(new defpackage.fch(i));
            ahvr.ci(this.g);
            return true;
        } catch (android.media.NotProvisionedException unused) {
            this.h.g(this);
            return false;
        } catch (java.lang.Exception e) {
            e = e;
            if (defpackage.hgu.au(e)) {
                this.h.g(this);
            } else {
                e(e, 1);
            }
            return false;
        } catch (java.lang.NoSuchMethodError e2) {
            e = e2;
            if (defpackage.hgu.au(e)) {
                this.h.g(this);
            } else {
                e(e, 1);
            }
            return false;
        }
    }

    @Override // defpackage.fcs
    public final boolean k() {
        h();
        return true;
    }

    @Override // defpackage.fcs
    public final boolean l(java.lang.String str) {
        h();
        byte[] bArr = this.g;
        ahvr.ci(bArr);
        return this.b.h(bArr, str);
    }

    @Override // defpackage.fcs
    public final defpackage.fdb m() {
        h();
        return this.w;
    }

    @Override // defpackage.fcs
    public final void n(alic alicVar) {
        int iIntValue;
        h();
        int i = this.r;
        if (i < 0) {
            defpackage.etr.c("DefaultDrmSession", a.bj(i, "Session reference count less than zero: "));
            this.r = 0;
        }
        if (alicVar != null) {
            defpackage.etg etgVar = this.o;
            synchronized (etgVar.a) {
                java.util.ArrayList arrayList = new java.util.ArrayList(etgVar.d);
                arrayList.add(alicVar);
                etgVar.d = j$.util.DesugarCollections.unmodifiableList(arrayList);
                java.util.Map map = etgVar.b;
                java.lang.Integer num = (java.lang.Integer) map.get(alicVar);
                if (num == null) {
                    java.util.HashSet hashSet = new java.util.HashSet(etgVar.c);
                    hashSet.add(alicVar);
                    etgVar.c = j$.util.DesugarCollections.unmodifiableSet(hashSet);
                    iIntValue = 1;
                } else {
                    iIntValue = num.intValue() + 1;
                }
                map.put(alicVar, java.lang.Integer.valueOf(iIntValue));
            }
        }
        int i2 = this.r + 1;
        this.r = i2;
        if (i2 == 1) {
            ahvr.bY(this.f == 2);
            android.os.HandlerThread handlerThread = new android.os.HandlerThread("ExoPlayer:DrmRequestHandler");
            this.s = handlerThread;
            handlerThread.start();
            this.t = new defpackage.fci(this, this.s.getLooper());
            if (j()) {
                d(true);
            }
        } else if (alicVar != null && i() && this.o.a(alicVar) == 1) {
            alicVar.l(this.f);
        }
        defpackage.fcq fcqVar = (defpackage.fcq) this.y.a;
        fcqVar.d.remove(this);
        android.os.Handler handler = fcqVar.i;
        ahvr.ci(handler);
        handler.removeCallbacksAndMessages(this);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Set] */
    @Override // defpackage.fcs
    public final void o(alic alicVar) {
        h();
        int i = this.r;
        if (i <= 0) {
            defpackage.etr.c("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i2 = i - 1;
        this.r = i2;
        if (i2 == 0) {
            this.f = 0;
            defpackage.fck fckVar = this.d;
            java.lang.String str = eum.a;
            fckVar.removeCallbacksAndMessages(null);
            this.t.b();
            this.t = null;
            this.s.quit();
            this.s = null;
            this.w = null;
            this.u = null;
            this.x = null;
            synchronized (this.e) {
                this.i = null;
            }
            this.j = null;
            byte[] bArr = this.g;
            if (bArr != null) {
                this.b.c(bArr);
                this.g = null;
            }
        }
        if (alicVar != null) {
            defpackage.etg etgVar = this.o;
            synchronized (etgVar.a) {
                java.util.Map map = etgVar.b;
                java.lang.Integer num = (java.lang.Integer) map.get(alicVar);
                if (num != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList(etgVar.d);
                    arrayList.remove(alicVar);
                    etgVar.d = j$.util.DesugarCollections.unmodifiableList(arrayList);
                    if (num.intValue() == 1) {
                        map.remove(alicVar);
                        java.util.HashSet hashSet = new java.util.HashSet(etgVar.c);
                        hashSet.remove(alicVar);
                        etgVar.c = j$.util.DesugarCollections.unmodifiableSet(hashSet);
                    } else {
                        map.put(alicVar, java.lang.Integer.valueOf(num.intValue() - 1));
                    }
                }
            }
            if (this.o.a(alicVar) == 0) {
                alicVar.n();
            }
        }
        rai raiVar = this.y;
        int i3 = this.r;
        if (i3 == 1) {
            defpackage.fcq fcqVar = (defpackage.fcq) raiVar.a;
            if (fcqVar.e > 0) {
                fcqVar.d.add(this);
                android.os.Handler handler = fcqVar.i;
                ahvr.ci(handler);
                handler.postAtTime(new defpackage.fay(this, 5), this, android.os.SystemClock.uptimeMillis() + fcqVar.a);
            }
        } else if (i3 == 0) {
            defpackage.fcq fcqVar2 = (defpackage.fcq) raiVar.a;
            fcqVar2.b.remove(this);
            if (fcqVar2.f == this) {
                fcqVar2.f = null;
            }
            if (fcqVar2.g == this) {
                fcqVar2.g = null;
            }
            defpackage.hjx hjxVar = fcqVar2.l;
            ?? r3 = hjxVar.b;
            r3.remove(this);
            if (hjxVar.a == this) {
                hjxVar.a = null;
                if (!r3.isEmpty()) {
                    hjxVar.a = (defpackage.fcm) r3.iterator().next();
                    ((defpackage.fcm) hjxVar.a).g();
                }
            }
            android.os.Handler handler2 = fcqVar2.i;
            ahvr.ci(handler2);
            handler2.removeCallbacksAndMessages(this);
            fcqVar2.d.remove(this);
        }
        ((defpackage.fcq) raiVar.a).b();
    }
}
