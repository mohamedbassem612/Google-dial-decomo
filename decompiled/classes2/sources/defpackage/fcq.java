package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fcq implements defpackage.fcx {
    public final long a;
    public final java.util.List b;
    public final java.util.Set c;
    public final java.util.Set d;
    public int e;
    public defpackage.fcm f;
    public defpackage.fcm g;
    public android.os.Looper h;
    public android.os.Handler i;
    public byte[] j;
    volatile defpackage.fcn k;
    public final defpackage.hjx l;
    private final java.util.UUID n;
    private final java.util.HashMap o;
    private final int[] p;
    private defpackage.fda q;
    private defpackage.fag r;
    private final defpackage.kvt s;
    private final rai t;

    public fcq(java.util.UUID uuid, defpackage.kvt kvtVar, java.util.HashMap map, int[] iArr) {
        ahvr.bN(!defpackage.epx.b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.n = uuid;
        this.s = kvtVar;
        this.o = map;
        this.p = iArr;
        this.l = new defpackage.hjx(this);
        this.t = new rai(this);
        this.b = new java.util.ArrayList();
        this.c = ahvr.as();
        this.d = ahvr.as();
        this.a = 300000L;
    }

    private static java.util.List i(androidx.media3.common.DrmInitData drmInitData, java.util.UUID uuid, boolean z) {
        int i = drmInitData.b;
        java.util.ArrayList arrayList = new java.util.ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            androidx.media3.common.DrmInitData.SchemeData schemeDataA = drmInitData.a(i2);
            if ((schemeDataA.a(uuid) || (defpackage.epx.c.equals(uuid) && schemeDataA.a(defpackage.epx.b))) && (schemeDataA.d != null || z)) {
                arrayList.add(schemeDataA);
            }
        }
        return arrayList;
    }

    private final synchronized void j(android.os.Looper looper) {
        android.os.Looper looper2 = this.h;
        if (looper2 == null) {
            this.h = looper;
            this.i = new android.os.Handler(looper);
        } else {
            ahvr.bY(looper2 == looper);
            ahvr.ci(this.i);
        }
    }

    private final void k() {
        ailj ailjVarK = aihd.o(this.d).k();
        while (ailjVarK.hasNext()) {
            ((defpackage.fcs) ailjVarK.next()).o(null);
        }
    }

    private final void l() {
        ailj ailjVarK = aihd.o(this.c).k();
        while (ailjVarK.hasNext()) {
            ((defpackage.fcp) ailjVarK.next()).a();
        }
    }

    private final void m(boolean z) {
        if (z && this.h == null) {
            defpackage.etr.g("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new java.lang.IllegalStateException());
            return;
        }
        java.lang.Thread threadCurrentThread = java.lang.Thread.currentThread();
        android.os.Looper looper = this.h;
        ahvr.ci(looper);
        if (threadCurrentThread != looper.getThread()) {
            defpackage.etr.g("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + java.lang.Thread.currentThread().getName() + "\nExpected thread: " + this.h.getThread().getName(), new java.lang.IllegalStateException());
        }
    }

    private static boolean n(defpackage.fcs fcsVar) {
        if (fcsVar.a() != 1) {
            return false;
        }
        defpackage.fcr fcrVarB = fcsVar.b();
        ahvr.ci(fcrVarB);
        java.lang.Throwable cause = fcrVarB.getCause();
        return (cause instanceof android.media.ResourceBusyException) || defpackage.hgu.av(cause);
    }

    private final defpackage.fcm o(java.util.List list, boolean z, alic alicVar) {
        ahvr.ci(this.q);
        defpackage.fda fdaVar = this.q;
        byte[] bArr = this.j;
        android.os.Looper looper = this.h;
        ahvr.ci(looper);
        defpackage.fag fagVar = this.r;
        ahvr.ci(fagVar);
        java.util.HashMap map = this.o;
        defpackage.kvt kvtVar = this.s;
        defpackage.fcm fcmVar = new defpackage.fcm(this.n, fdaVar, this.l, this.t, list, true, z, bArr, map, kvtVar, looper, fagVar);
        fcmVar.n(alicVar);
        fcmVar.n(null);
        return fcmVar;
    }

    private final defpackage.fcm p(java.util.List list, boolean z, alic alicVar, boolean z2) {
        defpackage.fcm fcmVarO = o(list, z, alicVar);
        if (n(fcmVarO) && !this.d.isEmpty()) {
            k();
            q(fcmVarO, alicVar);
            fcmVarO = o(list, z, alicVar);
        }
        if (!n(fcmVarO) || !z2 || this.c.isEmpty()) {
            return fcmVarO;
        }
        l();
        if (!this.d.isEmpty()) {
            k();
        }
        q(fcmVarO, alicVar);
        return o(list, z, alicVar);
    }

    private static final void q(defpackage.fcs fcsVar, alic alicVar) {
        fcsVar.o(alicVar);
        fcsVar.o(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0073, code lost:
    
        if ("cens".equals(r4) != false) goto L26;
     */
    @Override // defpackage.fcx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(defpackage.eqg r5) {
        /*
            r4 = this;
            r0 = 0
            r4.m(r0)
            fda r1 = r4.q
            ahvr.ci(r1)
            int r1 = r1.a()
            androidx.media3.common.DrmInitData r2 = r5.t
            if (r2 != 0) goto L21
            java.lang.String r5 = r5.p
            int[] r4 = r4.p
            int r5 = defpackage.eqz.b(r5)
            int r4 = eum.r(r4, r5)
            r5 = -1
            if (r4 == r5) goto L78
            goto L77
        L21:
            byte[] r5 = r4.j
            if (r5 != 0) goto L77
            java.util.UUID r4 = r4.n
            r5 = 1
            java.util.List r3 = i(r2, r4, r5)
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L51
            int r3 = r2.b
            if (r3 != r5) goto L75
            androidx.media3.common.DrmInitData$SchemeData r0 = r2.a(r0)
            java.util.UUID r3 = defpackage.epx.b
            boolean r0 = r0.a(r3)
            if (r0 == 0) goto L75
            java.lang.String r4 = r4.toString()
            java.lang.String r0 = "DrmInitData only contains common PSSH SchemeData. Assuming support for: "
            java.lang.String r4 = r0.concat(r4)
            java.lang.String r0 = "DefaultDrmSessionMgr"
            defpackage.etr.f(r0, r4)
        L51:
            java.lang.String r4 = r2.a
            if (r4 == 0) goto L77
            java.lang.String r0 = "cenc"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L77
            java.lang.String r0 = "cbcs"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L77
            java.lang.String r0 = "cbc1"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L75
            java.lang.String r0 = "cens"
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L77
        L75:
            r0 = r5
            goto L78
        L77:
            r0 = r1
        L78:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fcq.a(eqg):int");
    }

    public final void b() {
        if (this.q != null && this.e == 0 && this.b.isEmpty() && this.c.isEmpty()) {
            defpackage.fda fdaVar = this.q;
            ahvr.ci(fdaVar);
            fdaVar.e();
            this.q = null;
        }
    }

    @Override // defpackage.fcx
    public final void c() {
        defpackage.fda fcyVar;
        m(true);
        int i = this.e;
        this.e = i + 1;
        if (i != 0) {
            return;
        }
        if (this.q == null) {
            java.util.UUID uuid = this.n;
            try {
                fcyVar = defpackage.fdd.o(uuid);
            } catch (defpackage.fdg unused) {
                defpackage.etr.c("FrameworkMediaDrm", a.bG((byte) 46, uuid, "Failed to instantiate a FrameworkMediaDrm for uuid: "));
                fcyVar = new defpackage.fcy();
            }
            this.q = fcyVar;
            fcyVar.n(new rai(this, (byte[]) null));
            return;
        }
        int i2 = 0;
        while (true) {
            java.util.List list = this.b;
            if (i2 >= list.size()) {
                return;
            }
            ((defpackage.fcm) list.get(i2)).n(null);
            i2++;
        }
    }

    @Override // defpackage.fcx
    public final void d() {
        m(true);
        int i = this.e - 1;
        this.e = i;
        if (i == 0) {
            java.util.ArrayList arrayList = new java.util.ArrayList(this.b);
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((defpackage.fcm) arrayList.get(i2)).o(null);
            }
            l();
            b();
        }
    }

    @Override // defpackage.fcx
    public final void e(android.os.Looper looper, defpackage.fag fagVar) {
        j(looper);
        this.r = fagVar;
    }

    @Override // defpackage.fcx
    public final defpackage.fcs f(alic alicVar, defpackage.eqg eqgVar) {
        m(false);
        ahvr.bY(this.e > 0);
        ahvr.ci(this.h);
        return g(this.h, alicVar, eqgVar, true);
    }

    public final defpackage.fcs g(android.os.Looper looper, alic alicVar, defpackage.eqg eqgVar, boolean z) {
        if (this.k == null) {
            this.k = new defpackage.fcn(this, looper);
        }
        androidx.media3.common.DrmInitData drmInitData = eqgVar.t;
        java.util.List listI = null;
        if (drmInitData != null) {
            if (this.j == null) {
                java.util.UUID uuid = this.n;
                listI = i(drmInitData, uuid, false);
                if (listI.isEmpty()) {
                    defpackage.fco fcoVar = new defpackage.fco(uuid);
                    defpackage.etr.d("DefaultDrmSessionMgr", "DRM error", fcoVar);
                    alicVar.m(fcoVar);
                    return new defpackage.fcz(new defpackage.fcr(fcoVar, 6003));
                }
            }
            defpackage.fcm fcmVar = this.g;
            if (fcmVar != null) {
                fcmVar.n(alicVar);
                return fcmVar;
            }
            defpackage.fcm fcmVarP = p(listI, false, alicVar, z);
            this.g = fcmVarP;
            this.b.add(fcmVarP);
            return fcmVarP;
        }
        int iB = defpackage.eqz.b(eqgVar.p);
        defpackage.fda fdaVar = this.q;
        ahvr.ci(fdaVar);
        if (fdaVar.a() == 2) {
            int i = defpackage.equ.a;
            if (defpackage.fdb.a) {
                return null;
            }
        }
        if (eum.r(this.p, iB) == -1 || fdaVar.a() == 1) {
            return null;
        }
        defpackage.fcm fcmVar2 = this.f;
        if (fcmVar2 == null) {
            defpackage.fcm fcmVarP2 = p(aike.a, true, null, z);
            this.b.add(fcmVarP2);
            this.f = fcmVarP2;
        } else {
            fcmVar2.n(null);
        }
        return this.f;
    }

    @Override // defpackage.fcx
    public final defpackage.fcw h(alic alicVar, defpackage.eqg eqgVar) {
        ahvr.bY(this.e > 0);
        ahvr.ci(this.h);
        defpackage.fcp fcpVar = new defpackage.fcp(this, alicVar);
        android.os.Handler handler = fcpVar.c.i;
        ahvr.ci(handler);
        handler.post(new defpackage.esz(fcpVar, eqgVar, 14, null));
        return fcpVar;
    }
}
