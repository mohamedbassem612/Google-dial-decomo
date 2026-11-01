package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fjo extends defpackage.fei implements defpackage.fjz {
    private static final int[] n = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    private static boolean o;
    private static boolean p;
    private final boolean J;
    private final int K;
    private final boolean L;
    private final defpackage.fjy M;
    private final defpackage.fji N;
    private final long O;
    private final defpackage.fkb P;
    private final java.util.PriorityQueue Q;
    private boolean R;
    private boolean S;
    private boolean T;
    private boolean U;
    private defpackage.fkm V;
    private boolean W;
    private int X;
    private java.util.List Y;
    private androidx.media3.exoplayer.video.PlaceholderSurface Z;
    private defpackage.ety aa;
    private boolean ab;
    private int ac;
    private int ad;
    private long ae;
    private int af;
    private int ag;
    private int ah;
    private defpackage.ezj ai;
    private long aj;
    private boolean ak;
    private long al;
    private int am;
    private defpackage.ery an;
    private int ao;
    private int ap;
    private defpackage.fjx aq;
    private long ar;
    private boolean as;
    private int at;
    private long au;
    private defpackage.ahoz av;
    private final defpackage.hjx aw;
    private final defpackage.kvt ax;
    public final defpackage.fka k;
    public android.view.Surface l;
    public defpackage.ery m;
    private final android.content.Context q;

    public fjo(defpackage.fjn fjnVar) {
        super(fjnVar.a.getApplicationContext(), 2, fjnVar.d, fjnVar.c);
        android.content.Context applicationContext = fjnVar.a.getApplicationContext();
        this.q = applicationContext;
        this.K = fjnVar.g;
        this.V = null;
        this.ax = new defpackage.kvt(fjnVar.f, fjnVar.j);
        this.J = this.V == null;
        defpackage.fka fkaVar = new defpackage.fka(applicationContext, this, fjnVar.e);
        this.k = fkaVar;
        fkaVar.a = fjnVar.i;
        this.M = new defpackage.fjy();
        this.N = new defpackage.fji(new defpackage.fjk(this, 0));
        int i = defpackage.equ.a;
        this.L = "NVIDIA".equals(android.os.Build.MANUFACTURER);
        this.aa = defpackage.ety.a;
        this.ac = 1;
        this.ad = 0;
        this.m = defpackage.ery.a;
        this.ap = 0;
        this.an = null;
        this.ao = -1000;
        this.ar = -9223372036854775807L;
        this.aw = new defpackage.hjx();
        this.Q = new java.util.PriorityQueue();
        this.O = -fjnVar.h;
        this.P = new defpackage.fkb();
        this.au = -9223372036854775807L;
        this.ai = null;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003c  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int aO(defpackage.fee feeVar, defpackage.eqg eqgVar) {
        int i = eqgVar.v;
        int i2 = eqgVar.w;
        if (i == -1 || i2 == -1) {
            return -1;
        }
        java.lang.String str = eqgVar.p;
        ahvr.ci(str);
        if ("video/dolby-vision".equals(str)) {
            android.util.Pair pairA = defpackage.ete.a(eqgVar);
            if (pairA == null) {
                str = "video/hevc";
            } else {
                int iIntValue = ((java.lang.Integer) pairA.first).intValue();
                if (iIntValue == 512 || iIntValue == 1 || iIntValue == 2) {
                    str = "video/avc";
                } else if (iIntValue == 1024) {
                    str = "video/av01";
                } else {
                    str = "video/hevc";
                }
            }
        }
        int i3 = 4;
        switch (str.hashCode()) {
            case -1664118616:
                if (!str.equals("video/3gpp")) {
                    return -1;
                }
                break;
            case -1662735862:
                if (!str.equals("video/av01")) {
                    return -1;
                }
                break;
            case -1662541442:
                if (str.equals("video/hevc")) {
                    return java.lang.Math.max(2097152, ((i * i2) * 3) / 4);
                }
                return -1;
            case 1187890754:
                if (!str.equals("video/mp4v-es")) {
                    return -1;
                }
                break;
            case 1331836730:
                if (!str.equals("video/avc")) {
                    return -1;
                }
                int i4 = defpackage.equ.a;
                if ("BRAVIA 4K 2015".equals(android.os.Build.MODEL)) {
                    return -1;
                }
                if ("Amazon".equals(android.os.Build.MANUFACTURER)) {
                    if ("KFSOWI".equals(android.os.Build.MODEL)) {
                        return -1;
                    }
                    if ("AFTS".equals(android.os.Build.MODEL) && feeVar.g) {
                        return -1;
                    }
                }
                java.lang.String str2 = eum.a;
                return ((((i + 15) / 16) * ((i2 + 15) / 16)) * 768) / 4;
            case 1599127256:
                if (!str.equals("video/x-vnd.on2.vp8")) {
                    return -1;
                }
                break;
            case 1599127257:
                if (!str.equals("video/x-vnd.on2.vp9")) {
                    return -1;
                }
                i3 = 8;
                break;
                break;
            default:
                return -1;
        }
        return ((i * i2) * 3) / i3;
    }

    protected static int aP(defpackage.fee feeVar, defpackage.eqg eqgVar) {
        int i = eqgVar.q;
        if (i == -1) {
            return aO(feeVar, eqgVar);
        }
        java.util.List list = eqgVar.s;
        int size = list.size();
        int length = 0;
        for (int i2 = 0; i2 < size; i2++) {
            length += ((byte[]) list.get(i2)).length;
        }
        return i + length;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x006d  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    protected static final boolean aU(java.lang.String str) {
        boolean z = false;
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (defpackage.fjo.class) {
            if (!o) {
                int i = defpackage.equ.a;
                java.lang.String str2 = android.os.Build.MODEL;
                switch (str2.hashCode()) {
                    case -349662828:
                        if (str2.equals("AFTJMST12")) {
                            z = true;
                        }
                        break;
                    case -321033677:
                        if (str2.equals("AFTKMST12")) {
                            z = true;
                        }
                        break;
                    case 2006354:
                        if (str2.equals("AFTA")) {
                            z = true;
                        }
                        break;
                    case 2006367:
                        if (str2.equals("AFTN")) {
                            z = true;
                        }
                        break;
                    case 2006371:
                        if (str2.equals("AFTR")) {
                            z = true;
                        }
                        break;
                    case 1785421873:
                        if (str2.equals("AFTEU011")) {
                            z = true;
                        }
                        break;
                    case 1785421876:
                        if (str2.equals("AFTEU014")) {
                            z = true;
                        }
                        break;
                    case 1798172390:
                        if (str2.equals("AFTSO001")) {
                            z = true;
                        }
                        break;
                    case 2119412532:
                        if (str2.equals("AFTEUFF014")) {
                            z = true;
                        }
                        break;
                }
                p = z;
                o = true;
            }
        }
        return p;
    }

    protected static final boolean aY(defpackage.fee feeVar) {
        return android.os.Build.VERSION.SDK_INT >= 35 && feeVar.i;
    }

    protected static final boolean ba(defpackage.fee feeVar) {
        if (aU(feeVar.b)) {
            return false;
        }
        return !feeVar.g || androidx.media3.exoplayer.video.PlaceholderSurface.a();
    }

    private final android.view.Surface bb(defpackage.fee feeVar) {
        defpackage.fkm fkmVar = this.V;
        if (fkmVar != null) {
            return fkmVar.a();
        }
        android.view.Surface surface = this.l;
        if (surface == null) {
            if (aY(feeVar)) {
                return null;
            }
            ahvr.bY(ba(feeVar));
            androidx.media3.exoplayer.video.PlaceholderSurface placeholderSurface = this.Z;
            if (placeholderSurface != null) {
                if (placeholderSurface.b != feeVar.g) {
                    bg();
                }
            }
            surface = this.Z;
            if (surface == null) {
                boolean z = feeVar.g;
                boolean z2 = false;
                ahvr.bY(!z || androidx.media3.exoplayer.video.PlaceholderSurface.a());
                defpackage.fjp fjpVar = new defpackage.fjp();
                int i = z ? androidx.media3.exoplayer.video.PlaceholderSurface.a : 0;
                fjpVar.start();
                fjpVar.b = new android.os.Handler(fjpVar.getLooper(), fjpVar);
                fjpVar.a = new defpackage.eth(fjpVar.b);
                synchronized (fjpVar) {
                    fjpVar.b.obtainMessage(1, i, 0).sendToTarget();
                    while (fjpVar.e == null && fjpVar.d == null && fjpVar.c == null) {
                        try {
                            fjpVar.wait();
                        } catch (java.lang.InterruptedException unused) {
                            z2 = true;
                        }
                    }
                }
                if (z2) {
                    java.lang.Thread.currentThread().interrupt();
                }
                java.lang.RuntimeException runtimeException = fjpVar.d;
                if (runtimeException != null) {
                    throw runtimeException;
                }
                java.lang.Error error = fjpVar.c;
                if (error != null) {
                    throw error;
                }
                androidx.media3.exoplayer.video.PlaceholderSurface placeholderSurface2 = fjpVar.e;
                ahvr.ci(placeholderSurface2);
                this.Z = placeholderSurface2;
                return placeholderSurface2;
            }
        }
        return surface;
    }

    private static java.util.List bc(android.content.Context context, defpackage.fek fekVar, defpackage.eqg eqgVar, boolean z, boolean z2) {
        java.lang.String str = eqgVar.p;
        if (str == null) {
            return aike.a;
        }
        if (str.equals("video/dolby-vision") && !defpackage.hgu.aq(context)) {
            java.util.List listI = defpackage.feq.i(context, eqgVar, z, z2);
            if (listI.isEmpty()) {
                listI = defpackage.feq.h(eqgVar, z, z2);
            }
            if (!listI.isEmpty()) {
                return listI;
            }
        }
        if (!str.equals("video/dolby-vision")) {
            return defpackage.feq.j(eqgVar, z, z2);
        }
        java.util.List listD = defpackage.feq.d(str, z, z2);
        aift aiftVar = new aift(4);
        aiftVar.k(defpackage.feq.b(context, listD, eqgVar));
        aiftVar.k(defpackage.feq.i(context, eqgVar, z, z2));
        aify aifyVarH = aiftVar.h();
        return aifyVarH.isEmpty() ? defpackage.feq.j(eqgVar, z, z2) : aifyVarH;
    }

    private final void bd() {
        if (this.af > 0) {
            g();
            defpackage.kvt kvtVar = this.ax;
            long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
            java.lang.Object obj = kvtVar.b;
            if (obj != null) {
                ((android.os.Handler) obj).post(new defpackage.fay(kvtVar, 19));
            }
            this.af = 0;
            this.ae = jElapsedRealtime;
        }
    }

    private final void be() {
        defpackage.ery eryVar = this.an;
        if (eryVar != null) {
            this.ax.n(eryVar);
        }
    }

    private final void bf(long j, long j2, defpackage.eqg eqgVar) {
        defpackage.fjx fjxVar = this.aq;
        if (fjxVar != null) {
            fjxVar.a(j, j2, eqgVar, this.x);
        }
    }

    private final void bg() {
        androidx.media3.exoplayer.video.PlaceholderSurface placeholderSurface = this.Z;
        if (placeholderSurface != null) {
            placeholderSurface.release();
            this.Z = null;
        }
    }

    private final void bh(java.lang.Object obj) throws java.lang.Throwable {
        android.view.Surface surface = obj instanceof android.view.Surface ? (android.view.Surface) obj : null;
        if (this.l == surface) {
            if (surface != null) {
                be();
                android.view.Surface surface2 = this.l;
                if (surface2 == null || !this.ab) {
                    return;
                }
                this.ax.m(surface2);
                return;
            }
            return;
        }
        this.l = surface;
        if (this.V == null) {
            this.k.i(surface);
        }
        boolean z = false;
        this.ab = false;
        int i = this.b;
        defpackage.fea feaVar = this.v;
        if (feaVar != null) {
            if (this.V == null) {
                defpackage.fee feeVar = this.y;
                ahvr.ci(feeVar);
                if (!bi(feeVar) || this.R) {
                    aC();
                    az();
                } else {
                    android.view.Surface surfaceBb = bb(feeVar);
                    if (surfaceBb != null) {
                        feaVar.k(surfaceBb);
                    } else {
                        if (android.os.Build.VERSION.SDK_INT < 35) {
                            throw new java.lang.IllegalStateException();
                        }
                        feaVar.g();
                    }
                    z = true;
                }
            } else {
                z = true;
            }
        }
        if (surface != null) {
            be();
        } else {
            this.an = null;
            defpackage.fkm fkmVar = this.V;
            if (fkmVar != null) {
                fkmVar.c();
            }
        }
        if (i == 2) {
            defpackage.fkm fkmVar2 = this.V;
            if (fkmVar2 != null) {
                fkmVar2.e(z);
            } else {
                this.k.c(z);
            }
        }
    }

    private final boolean bi(defpackage.fee feeVar) {
        android.view.Surface surface;
        return this.V != null || ((surface = this.l) != null && surface.isValid()) || aY(feeVar) || ba(feeVar);
    }

    private final boolean bj(defpackage.ewu ewuVar) {
        return ewuVar.f < this.e;
    }

    private final boolean bk(defpackage.ewu ewuVar) {
        if (J() || ewuVar.dL(536870912) || this.i == -9223372036854775807L) {
            return true;
        }
        return this.i - (ewuVar.f - av()) <= 100000;
    }

    @Override // defpackage.fei, defpackage.ewz, defpackage.ezf
    public final void F(float f, float f2) {
        super.F(f, f2);
        defpackage.fkm fkmVar = this.V;
        if (fkmVar != null) {
            fkmVar.m(f);
        } else {
            this.k.j(f);
        }
        defpackage.fkb fkbVar = this.P;
        if (fkbVar != null) {
            fkbVar.d(f);
        }
    }

    @Override // defpackage.ewz, defpackage.ezf
    public final boolean M(long j) {
        if (this.C == -9223372036854775807L || j < this.aj) {
            return false;
        }
        long j2 = this.G;
        return j2 == -9223372036854775807L || j > j2;
    }

    @Override // defpackage.ezf, defpackage.ezg
    public final java.lang.String U() {
        return "MediaCodecVideoRenderer";
    }

    @Override // defpackage.fei, defpackage.ezf
    public final void V(long j, long j2) throws java.lang.Throwable {
        defpackage.fkm fkmVar = this.V;
        if (fkmVar != null) {
            try {
                fkmVar.h(j, j2);
            } catch (defpackage.fkl e) {
                throw h(e, e.a, false, 7001);
            }
        }
        super.V(j, j2);
    }

    @Override // defpackage.fei, defpackage.ezf
    public final boolean W() {
        if (!this.D) {
            return false;
        }
        defpackage.fkm fkmVar = this.V;
        return fkmVar == null || fkmVar.t();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002a  */
    @Override // defpackage.fei, defpackage.ezf
    public final boolean X() {
        boolean z = false;
        if (this.t != null) {
            if (L() || super.aE()) {
                z = true;
            } else if (this.z != -9223372036854775807L) {
                g();
                if (android.os.SystemClock.elapsedRealtime() < this.z) {
                    z = true;
                }
            }
        }
        defpackage.fkm fkmVar = this.V;
        if (fkmVar != null) {
            return fkmVar.v(z);
        }
        if (z && this.v == null) {
            return true;
        }
        return this.k.m(z);
    }

    @Override // defpackage.fei
    protected final float Z(float f, defpackage.eqg eqgVar, defpackage.eqg[] eqgVarArr) {
        defpackage.fee feeVar;
        float fA = -1.0f;
        for (defpackage.eqg eqgVar2 : eqgVarArr) {
            float f2 = eqgVar2.z;
            if (f2 != -1.0f) {
                fA = java.lang.Math.max(fA, f2);
            }
        }
        if (fA == -1.0f && this.v != null) {
            defpackage.fji fjiVar = this.N;
            if (fjiVar.a() != -9223372036854775807L) {
                fA = 1.0E9f / fjiVar.a();
            }
        }
        float f3 = fA == -1.0f ? -1.0f : fA * f;
        if (this.ai == null || (feeVar = this.y) == null) {
            return f3;
        }
        int i = eqgVar.v;
        int i2 = eqgVar.w;
        float f4 = -3.4028235E38f;
        if (feeVar.j) {
            float f5 = feeVar.m;
            if (f5 != -3.4028235E38f && feeVar.k == i && feeVar.l == i2) {
                f4 = f5;
            } else {
                f4 = 1024.0f;
                if (!feeVar.h(i, i2, 1024.0d)) {
                    float f6 = 0.0f;
                    while (true) {
                        float f7 = f4 - f6;
                        if (java.lang.Math.abs(f7) <= 5.0f) {
                            break;
                        }
                        float f8 = (f7 / 2.0f) + f6;
                        boolean zH = feeVar.h(i, i2, f8);
                        if (true == zH) {
                            f6 = f8;
                        }
                        if (true != zH) {
                            f4 = f8;
                        }
                    }
                    f4 = f6;
                }
                feeVar.m = f4;
                feeVar.k = i;
                feeVar.l = i2;
            }
        }
        return f3 != -1.0f ? java.lang.Math.max(f3, f4) : f4;
    }

    @Override // defpackage.fei
    protected final void aA(long j) {
        super.aA(j);
        this.ah--;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0075 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0077  */
    /* JADX WARN: Code duplicated, block: B:37:0x007d  */
    @Override // defpackage.fei
    protected final void aB(defpackage.ewu ewuVar) {
        defpackage.epy epyVar;
        defpackage.fee feeVar = this.y;
        ahvr.ci(feeVar);
        java.nio.ByteBuffer byteBuffer = ewuVar.d;
        if (byteBuffer != null) {
            java.lang.String str = feeVar.c;
            boolean zEquals = str.equals("video/av01");
            if (!byteBuffer.isReadOnly()) {
                defpackage.eqg eqgVar = this.w;
                boolean z = (eqgVar == null || (epyVar = eqgVar.F) == null || epyVar.f <= 8) ? false : true;
                boolean zEquals2 = str.equals("video/hevc");
                if (this.U) {
                    if (zEquals) {
                        defpackage.hgt.am(byteBuffer, false);
                        if (ewuVar.dL(1)) {
                            defpackage.hjx hjxVar = this.aw;
                            int iPosition = byteBuffer.position();
                            int iLimit = byteBuffer.limit();
                            byteBuffer.limit(java.lang.Math.min(iLimit, iPosition + 500));
                            java.nio.ByteBuffer byteBuffer2 = (java.nio.ByteBuffer) hjxVar.b;
                            byteBuffer2.clear();
                            byteBuffer2.put(byteBuffer);
                            byteBuffer2.flip();
                            byteBuffer.position(iPosition);
                            byteBuffer.limit(iLimit);
                        }
                    } else if (zEquals2) {
                        defpackage.hgu.ar(byteBuffer, false);
                    }
                } else if (z && this.S) {
                    if (zEquals) {
                        defpackage.hgt.am(byteBuffer, true);
                        if (ewuVar.dL(1)) {
                            defpackage.hjx hjxVar2 = this.aw;
                            int iPosition2 = byteBuffer.position();
                            int iLimit2 = byteBuffer.limit();
                            byteBuffer.limit(java.lang.Math.min(iLimit2, iPosition2 + 500));
                            java.nio.ByteBuffer byteBuffer3 = (java.nio.ByteBuffer) hjxVar2.b;
                            byteBuffer3.clear();
                            byteBuffer3.put(byteBuffer);
                            byteBuffer3.flip();
                            byteBuffer.position(iPosition2);
                            byteBuffer.limit(iLimit2);
                        }
                    } else if (zEquals2) {
                        defpackage.hgu.ar(byteBuffer, true);
                    }
                } else if (android.os.Build.VERSION.SDK_INT < 37 || !z) {
                    if (zEquals) {
                        if (ewuVar.dL(1)) {
                            defpackage.hjx hjxVar3 = this.aw;
                            int iPosition3 = byteBuffer.position();
                            int iLimit3 = byteBuffer.limit();
                            byteBuffer.limit(java.lang.Math.min(iLimit3, iPosition3 + 500));
                            java.nio.ByteBuffer byteBuffer4 = (java.nio.ByteBuffer) hjxVar3.b;
                            byteBuffer4.clear();
                            byteBuffer4.put(byteBuffer);
                            byteBuffer4.flip();
                            byteBuffer.position(iPosition3);
                            byteBuffer.limit(iLimit3);
                        }
                    }
                } else if (zEquals) {
                    byte[] bArrAn = defpackage.hgt.an(byteBuffer);
                    if (bArrAn != null) {
                        android.os.Bundle bundle = new android.os.Bundle();
                        bundle.putByteArray("hdr-st2094-50-info", bArrAn);
                        defpackage.fea feaVar = this.v;
                        ahvr.ci(feaVar);
                        feaVar.l(bundle);
                    }
                    if (ewuVar.dL(1)) {
                        defpackage.hjx hjxVar4 = this.aw;
                        int iPosition4 = byteBuffer.position();
                        int iLimit4 = byteBuffer.limit();
                        byteBuffer.limit(java.lang.Math.min(iLimit4, iPosition4 + 500));
                        java.nio.ByteBuffer byteBuffer5 = (java.nio.ByteBuffer) hjxVar4.b;
                        byteBuffer5.clear();
                        byteBuffer5.put(byteBuffer);
                        byteBuffer5.flip();
                        byteBuffer.position(iPosition4);
                        byteBuffer.limit(iLimit4);
                    }
                }
            } else if (zEquals) {
                if (ewuVar.dL(1)) {
                    defpackage.hjx hjxVar5 = this.aw;
                    int iPosition5 = byteBuffer.position();
                    int iLimit5 = byteBuffer.limit();
                    byteBuffer.limit(java.lang.Math.min(iLimit5, iPosition5 + 500));
                    java.nio.ByteBuffer byteBuffer6 = (java.nio.ByteBuffer) hjxVar5.b;
                    byteBuffer6.clear();
                    byteBuffer6.put(byteBuffer);
                    byteBuffer6.flip();
                    byteBuffer.position(iPosition5);
                    byteBuffer.limit(iLimit5);
                }
            }
        }
        this.at = 0;
        int iAt = at(ewuVar);
        if (android.os.Build.VERSION.SDK_INT < 34 || (iAt & 32) == 0) {
            this.ah++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0027  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:74:0x011f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x0121  */
    /* JADX WARN: Code duplicated, block: B:84:0x00d0 A[ADDED_TO_REGION, EDGE_INSN: B:84:0x00d0->B:56:0x00d0 BREAK  A[LOOP:0: B:32:0x0088->B:55:0x00cd], REMOVE, SYNTHETIC] */
    @Override // defpackage.fei
    protected final boolean aG(defpackage.ewu ewuVar) {
        boolean z;
        java.nio.ByteBuffer byteBuffer;
        int iLimit;
        java.lang.Object obj;
        xhk xhkVar;
        boolean z2 = false;
        if (!bk(ewuVar)) {
            boolean zBj = bj(ewuVar);
            defpackage.fkb fkbVar = this.P;
            if (fkbVar != null) {
                long jA = fkbVar.a(ewuVar.f);
                if (jA == -9223372036854775807L || jA >= this.O) {
                    z = false;
                } else {
                    z = true;
                }
            } else {
                z = false;
            }
            if ((zBj || z) && !ewuVar.dL(268435456)) {
                if (ewuVar.dL(67108864)) {
                    ewuVar.dJ();
                } else {
                    defpackage.fee feeVar = this.y;
                    ahvr.ci(feeVar);
                    if (feeVar.c.equals("video/av01") && (byteBuffer = ewuVar.d) != null) {
                        boolean z3 = zBj || this.at <= 0;
                        java.nio.ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                        byteBufferAsReadOnlyBuffer.flip();
                        defpackage.hjx hjxVar = this.aw;
                        java.nio.ByteBuffer byteBuffer2 = (java.nio.ByteBuffer) hjxVar.b;
                        if (byteBuffer2.hasRemaining()) {
                            hjxVar.b(defpackage.hgt.aD(byteBuffer2));
                            hjxVar.a();
                        }
                        java.util.List listAD = defpackage.hgt.aD(byteBufferAsReadOnlyBuffer);
                        hjxVar.b(listAD);
                        int size = listAD.size() - 1;
                        int i = 0;
                        while (size >= 0) {
                            amwp amwpVar = (amwp) listAD.get(size);
                            int i2 = amwpVar.a;
                            if (i2 != 2 && i2 != 15) {
                                if (i2 == 3) {
                                    if (!z3) {
                                        break;
                                    }
                                    i2 = 3;
                                    if (i2 != 6) {
                                        xhkVar = new xhk((defpackage.eve) obj, amwpVar);
                                        if (xhkVar != null) {
                                            break;
                                            break;
                                        }
                                        break;
                                        break;
                                    }
                                    xhkVar = new xhk((defpackage.eve) obj, amwpVar);
                                    if (xhkVar != null) {
                                        break;
                                    }
                                    break;
                                    break;
                                }
                                if ((i2 != 6 && i2 != 3) || (obj = hjxVar.a) == null) {
                                    break;
                                }
                                try {
                                    xhkVar = new xhk((defpackage.eve) obj, amwpVar);
                                } catch (defpackage.evd unused) {
                                    xhkVar = null;
                                }
                                if (xhkVar != null || xhkVar.a) {
                                    break;
                                }
                            }
                            if (((amwp) listAD.get(size)).a == 6 || ((amwp) listAD.get(size)).a == 3) {
                                i++;
                            }
                            size--;
                        }
                        if (i > 1 || size + 1 >= 8) {
                            iLimit = byteBufferAsReadOnlyBuffer.limit();
                        } else {
                            iLimit = size >= 0 ? ((java.nio.ByteBuffer) ((amwp) listAD.get(size)).b).limit() : byteBufferAsReadOnlyBuffer.position();
                        }
                        if (iLimit == 0) {
                            ewuVar.dJ();
                        } else if (iLimit != byteBufferAsReadOnlyBuffer.limit()) {
                            defpackage.ahoz ahozVar = this.av;
                            ahvr.ci(ahozVar);
                            if (ahozVar.b + iLimit < byteBufferAsReadOnlyBuffer.capacity() && !ewuVar.dL(1073741824)) {
                                java.nio.ByteBuffer byteBuffer3 = ewuVar.d;
                                ahvr.ci(byteBuffer3);
                                byteBuffer3.position(iLimit);
                            }
                        }
                    }
                    if (z2) {
                        if (!zBj) {
                            this.at++;
                        }
                        this.Q.add(java.lang.Long.valueOf(ewuVar.f));
                    }
                }
                z2 = true;
                if (z2) {
                    if (!zBj) {
                        this.at++;
                    }
                    this.Q.add(java.lang.Long.valueOf(ewuVar.f));
                }
            }
        }
        return z2;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002a  */
    @Override // defpackage.fei
    protected final boolean aH() {
        boolean z;
        if (!this.B) {
            return false;
        }
        defpackage.eqg eqgVar = this.w;
        long j = this.i;
        if (j != -9223372036854775807L) {
            if (this.H + 1 + j <= Long.MAX_VALUE - (av() + j)) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = true;
        }
        return this.ai == null || this.ak || (eqgVar != null && eqgVar.r > 0) || z || au() != -9223372036854775807L;
    }

    @Override // defpackage.fei
    protected final boolean aI(defpackage.fee feeVar) {
        return bi(feeVar);
    }

    @Override // defpackage.fei
    protected final boolean aJ() {
        return this.V != null;
    }

    @Override // defpackage.fei
    protected final boolean aK() {
        defpackage.fee feeVar = this.y;
        if (this.V != null && feeVar != null) {
            int i = defpackage.equ.a;
            java.lang.String str = feeVar.b;
            if (str.equals("c2.mtk.avc.decoder") || str.equals("c2.mtk.hevc.decoder") || str.equals("c2.mtk.vp9.decoder")) {
                return true;
            }
        }
        return super.aK();
    }

    @Override // defpackage.fei
    protected final void aN(defpackage.eqg eqgVar) throws defpackage.exl {
        defpackage.fkm fkmVar = this.V;
        if (fkmVar == null || fkmVar.u()) {
            return;
        }
        try {
            fkmVar.x(eqgVar);
        } catch (defpackage.fkl e) {
            throw h(e, eqgVar, false, 7000);
        }
    }

    protected final long aQ() {
        return -this.ar;
    }

    public final void aR() {
        this.ax.m(this.l);
        this.ab = true;
    }

    protected final void aS(int i, int i2) {
        defpackage.exc excVar = this.F;
        excVar.h += i;
        int i3 = i + i2;
        excVar.g += i3;
        this.af += i3;
        int i4 = this.ag + i3;
        this.ag = i4;
        excVar.i = java.lang.Math.max(i4, excVar.i);
        int i5 = this.K;
        if (i5 <= 0 || this.af < i5) {
            return;
        }
        bd();
    }

    protected final void aT(long j) {
        defpackage.exc excVar = this.F;
        excVar.k += j;
        excVar.l++;
        this.al += j;
        this.am++;
    }

    protected final void aV(defpackage.fea feaVar, int i) {
        android.os.Trace.beginSection("dropVideoBuffer");
        feaVar.s(i);
        android.os.Trace.endSection();
        aS(0, 1);
    }

    protected final void aW(defpackage.fea feaVar, int i, long j) {
        android.os.Trace.beginSection("releaseOutputBuffer");
        feaVar.j(i, j);
        android.os.Trace.endSection();
        this.F.e++;
        this.ag = 0;
        if (this.V == null) {
            defpackage.ery eryVar = this.m;
            if (!eryVar.equals(defpackage.ery.a) && !eryVar.equals(this.an)) {
                this.an = eryVar;
                this.ax.n(eryVar);
            }
            if (!this.k.n() || this.l == null) {
                return;
            }
            aR();
        }
    }

    @Override // defpackage.fjz
    public final boolean aX(long j, long j2, boolean z, boolean z2) throws java.lang.Throwable {
        int iC;
        if (this.V != null && this.J) {
            j2 -= aQ();
        }
        if (j >= -500000 || z || (iC = c(j2)) == 0) {
            return false;
        }
        this.aj = j2;
        defpackage.fka fkaVar = this.k;
        java.util.PriorityQueue priorityQueue = this.Q;
        boolean zL = fkaVar.l();
        java.util.Iterator it = priorityQueue.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            if (((java.lang.Long) it.next()).longValue() < this.e || zL) {
                i2++;
            } else {
                i++;
            }
        }
        priorityQueue.clear();
        defpackage.exc excVar = this.F;
        if (z2) {
            int i3 = excVar.d + iC;
            excVar.d = i3;
            excVar.f += this.ah;
            int i4 = i3 + i;
            excVar.d = i4;
            excVar.d = i4 + i2;
        } else {
            excVar.j++;
            aS(iC + i, this.ah);
            this.F.d += i2;
        }
        aM();
        defpackage.fkm fkmVar = this.V;
        if (fkmVar != null) {
            fkmVar.d(false);
        }
        return true;
    }

    protected final void aZ(defpackage.fea feaVar, int i) {
        android.os.Trace.beginSection("skipVideoBuffer");
        feaVar.s(i);
        android.os.Trace.endSection();
        this.F.f++;
    }

    @Override // defpackage.fei
    protected final int aa(defpackage.fek fekVar, defpackage.eqg eqgVar) {
        boolean z;
        java.lang.String str = eqgVar.p;
        if (!defpackage.eqz.i(str)) {
            return 128;
        }
        android.content.Context context = this.q;
        int i = 0;
        boolean z2 = eqgVar.t != null;
        java.util.List listBc = bc(context, fekVar, eqgVar, z2, false);
        if (z2 && listBc.isEmpty()) {
            listBc = bc(context, fekVar, eqgVar, false, false);
        }
        if (listBc.isEmpty()) {
            return 129;
        }
        if (!aL(eqgVar)) {
            return 130;
        }
        defpackage.fee feeVar = (defpackage.fee) listBc.get(0);
        boolean zE = feeVar.e(context, eqgVar);
        if (!zE) {
            int i2 = 1;
            while (true) {
                if (i2 >= listBc.size()) {
                    z = true;
                    break;
                }
                defpackage.fee feeVar2 = (defpackage.fee) listBc.get(i2);
                if (feeVar2.e(context, eqgVar)) {
                    zE = true;
                    z = false;
                    feeVar = feeVar2;
                    break;
                }
                i2++;
            }
        } else {
            z = true;
            break;
        }
        int i3 = true != zE ? 3 : 4;
        int i4 = true != feeVar.g(eqgVar) ? 8 : 16;
        int i5 = true != feeVar.h ? 0 : 64;
        int i6 = true != z ? 0 : 128;
        if ("video/dolby-vision".equals(str) && !defpackage.hgu.aq(context)) {
            i6 = 256;
        }
        if (zE) {
            java.util.List listBc2 = bc(context, fekVar, eqgVar, z2, true);
            if (!listBc2.isEmpty()) {
                defpackage.fee feeVar3 = (defpackage.fee) defpackage.feq.e(context, listBc2, eqgVar).get(0);
                if (feeVar3.e(context, eqgVar) && feeVar3.g(eqgVar)) {
                    i = 32;
                }
            }
        }
        return i6 | i3 | i4 | i | i5;
    }

    @Override // defpackage.fei
    protected final long ab(long j, long j2, boolean z) {
        if (!defpackage.eqe.b(7) || !z) {
            return defpackage.hgt.ax(this);
        }
        if (this.b != 2) {
            return (X() || W()) ? 1000000L : 10000L;
        }
        if (this.au == -9223372036854775807L || this.V != null) {
            return 10000L;
        }
        if (W()) {
            return java.lang.Math.max(10000L, (long) (((this.au - j) / this.u) / 2.0f));
        }
        defpackage.fka fkaVar = this.k;
        long j3 = this.au;
        long jAw = aw();
        defpackage.fji fjiVar = this.N;
        try {
            if (fkaVar.a(j3, j, j2, jAw, false, false, fjiVar.a(), fjiVar.a, true, this.M) != 5) {
                return 0L;
            }
            long j4 = this.M.a;
            g();
            return java.lang.Math.max(0L, (j4 + (eum.w(android.os.SystemClock.elapsedRealtime()) - j2)) - 25000);
        } catch (defpackage.exl e) {
            throw new java.lang.IllegalStateException(e);
        }
    }

    @Override // defpackage.fei
    protected final defpackage.exd ac(defpackage.fee feeVar, defpackage.eqg eqgVar, defpackage.eqg eqgVar2, boolean z) {
        int i;
        int i2;
        defpackage.exd exdVarB = feeVar.b(eqgVar, eqgVar2);
        int i3 = exdVarB.e;
        defpackage.ahoz ahozVar = this.av;
        ahvr.ci(ahozVar);
        if (eqgVar2.v > ahozVar.c || eqgVar2.w > ahozVar.a) {
            i3 |= 256;
        }
        if (aP(feeVar, eqgVar2) > ahozVar.b) {
            i3 |= 64;
        }
        if (this.ad != Integer.MIN_VALUE && android.os.Build.VERSION.SDK_INT < 31 && (android.os.Build.VERSION.SDK_INT != 30 || android.os.Build.MODEL.startsWith("MiTV"))) {
            float f = eqgVar.z;
            if (f != -1.0f) {
                float f2 = eqgVar2.z;
                if (f2 != -1.0f && (!feeVar.g || !z)) {
                    float fMax = java.lang.Math.max(f2, f) / java.lang.Math.min(f2, f);
                    if (java.lang.Math.abs(fMax - java.lang.Math.round(fMax)) > 0.01f) {
                        i3 |= 65536;
                    }
                }
            }
        }
        java.lang.String str = feeVar.b;
        if (i3 != 0) {
            i2 = 0;
            i = i3;
        } else {
            i = 0;
            i2 = exdVarB.d;
        }
        return new defpackage.exd(str, eqgVar, eqgVar2, i2, i);
    }

    @Override // defpackage.fei
    protected final java.util.List ad(defpackage.fek fekVar, defpackage.eqg eqgVar, boolean z) {
        android.content.Context context = this.q;
        return defpackage.feq.e(context, bc(context, fekVar, eqgVar, z, false), eqgVar);
    }

    @Override // defpackage.fei
    protected final void ae(defpackage.ewu ewuVar) {
        java.nio.ByteBuffer byteBuffer = ewuVar.g;
        if (byteBuffer == null || byteBuffer.remaining() < 7) {
            return;
        }
        byte b = byteBuffer.get();
        short s = byteBuffer.getShort();
        short s2 = byteBuffer.getShort();
        byte b2 = byteBuffer.get();
        byte b3 = byteBuffer.get();
        byteBuffer.position(0);
        if (b == -75 && s == 60 && s2 == 1 && b2 == 4 && (b3 == 0 || b3 == 1)) {
            if (this.T) {
                byte[] bArr = new byte[byteBuffer.remaining()];
                byteBuffer.get(bArr);
                byteBuffer.position(0);
                defpackage.fea feaVar = this.v;
                ahvr.ci(feaVar);
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putByteArray("hdr10-plus-info", bArr);
                feaVar.l(bundle);
                return;
            }
            return;
        }
        if (android.os.Build.VERSION.SDK_INT < 37 || !defpackage.ete.i(byteBuffer)) {
            return;
        }
        byteBuffer.position(defpackage.ete.b);
        int iRemaining = byteBuffer.remaining();
        byte[] bArr2 = new byte[iRemaining];
        byteBuffer.get(bArr2);
        byteBuffer.position(0);
        boolean z = iRemaining > 0;
        this.U = z;
        if (z) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putByteArray("hdr-st2094-50-info", bArr2);
            defpackage.fea feaVar2 = this.v;
            ahvr.ci(feaVar2);
            feaVar2.l(bundle2);
        }
    }

    @Override // defpackage.fei
    protected final void af(java.lang.Exception exc) {
        defpackage.etr.d("MediaCodecVideoRenderer", "Video codec error", exc);
        defpackage.kvt kvtVar = this.ax;
        java.lang.Object obj = kvtVar.b;
        if (obj != null) {
            ((android.os.Handler) obj).post(new defpackage.fkh(kvtVar, 1, null));
        }
    }

    @Override // defpackage.fei
    protected final void ag(defpackage.exa exaVar) {
        defpackage.kvt kvtVar = this.ax;
        java.lang.Object obj = kvtVar.b;
        if (obj != null) {
            ((android.os.Handler) obj).post(new defpackage.gra(kvtVar, exaVar, 1));
        }
    }

    @Override // defpackage.fei
    protected final void ah(java.lang.String str) {
        defpackage.kvt kvtVar = this.ax;
        java.lang.Object obj = kvtVar.b;
        if (obj != null) {
            ((android.os.Handler) obj).post(new defpackage.fay(kvtVar, 18));
        }
    }

    @Override // defpackage.fei
    protected final void ai(defpackage.eqg eqgVar, android.media.MediaFormat mediaFormat) {
        int integer;
        int integer2;
        defpackage.fea feaVar = this.v;
        if (feaVar != null) {
            feaVar.m(this.ac);
        }
        ahvr.ci(mediaFormat);
        if (mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top")) {
            integer = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
            integer2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
        } else {
            integer = mediaFormat.getInteger("width");
            integer2 = mediaFormat.getInteger("height");
        }
        float f = eqgVar.C;
        int i = eqgVar.A;
        if (i == 90 || i == 270) {
            f = 1.0f / f;
            int i2 = integer2;
            integer2 = integer;
            integer = i2;
        }
        this.m = new defpackage.ery(integer, integer2, f);
        defpackage.fkm fkmVar = this.V;
        if (fkmVar == null || !this.as) {
            this.N.b(eqgVar.z);
        } else {
            if (integer <= 0 || integer2 <= 0) {
                return;
            }
            defpackage.eqf eqfVar = new defpackage.eqf(eqgVar);
            eqfVar.t = integer;
            eqfVar.u = integer2;
            eqfVar.A = f;
            defpackage.eqg eqgVar2 = new defpackage.eqg(eqfVar);
            int i3 = this.X;
            aify aifyVar = this.Y;
            if (aifyVar == null) {
                aifyVar = aike.a;
            }
            fkmVar.w(eqgVar2, aw(), i3, aifyVar);
            this.X = 2;
        }
        this.as = false;
    }

    @Override // defpackage.fei
    protected final void ak() {
        defpackage.fkm fkmVar = this.V;
        if (fkmVar != null) {
            fkmVar.p();
            if (this.ar == -9223372036854775807L) {
                this.ar = aw();
            }
            this.V.i(aQ());
        } else {
            this.k.f(2);
        }
        this.as = true;
    }

    @Override // defpackage.fei
    protected final void al() {
        defpackage.fkm fkmVar = this.V;
        if (fkmVar != null) {
            fkmVar.p();
        } else if (au() != -9223372036854775807L) {
            this.au = au();
        }
    }

    @Override // defpackage.fei
    protected final void am() {
        super.am();
        this.Q.clear();
        this.ah = 0;
        this.at = 0;
        this.ak = false;
        this.au = -9223372036854775807L;
        defpackage.hjx hjxVar = this.aw;
        hjxVar.a = null;
        hjxVar.a();
    }

    @Override // defpackage.fei
    protected final boolean ao(long j, long j2, defpackage.fea feaVar, java.nio.ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, defpackage.eqg eqgVar) {
        long j4 = j3;
        ahvr.ci(feaVar);
        long jAv = j4 - av();
        defpackage.fka fkaVar = this.k;
        boolean zL = fkaVar.l();
        int i4 = 0;
        int i5 = 0;
        while (true) {
            java.util.PriorityQueue priorityQueue = this.Q;
            java.lang.Long l = (java.lang.Long) priorityQueue.peek();
            if (l == null || l.longValue() >= j4) {
                break;
            }
            priorityQueue.poll();
            this.N.c(l.longValue() * 1000);
            if (l.longValue() < this.e || zL) {
                i5++;
            } else {
                i4++;
            }
        }
        aS(i4, 0);
        this.F.d += i5;
        defpackage.fji fjiVar = this.N;
        fjiVar.c(j4 * 1000);
        if (this.V != null) {
            if (z && !z2) {
                aZ(feaVar, i);
                return true;
            }
            if (this.as) {
                ai(eqgVar, feaVar.c());
                if (this.as) {
                }
            }
            return this.V.s(j4, new defpackage.fjm(this, feaVar, i));
        }
        long jAw = aw();
        long jA = fjiVar.a();
        long j5 = fjiVar.a;
        defpackage.fjy fjyVar = this.M;
        int iA = fkaVar.a(j4, j, j2, jAw, z, z2, jA, j5, false, fjyVar);
        defpackage.fkb fkbVar = this.P;
        if (fkbVar != null && iA != 5 && iA != 4) {
            fkbVar.b(j4, fjyVar.a);
        }
        if (iA != 5) {
            j4 = -9223372036854775807L;
        }
        this.au = j4;
        if (iA == 0) {
            g();
            long jNanoTime = java.lang.System.nanoTime();
            bf(jAv, jNanoTime, eqgVar);
            aW(feaVar, i, jNanoTime);
            aT(fjyVar.a);
        } else if (iA == 1) {
            ahvr.ci(feaVar);
            long j6 = fjyVar.b;
            long j7 = fjyVar.a;
            bf(jAv, j6, eqgVar);
            aW(feaVar, i, j6);
            aT(j7);
        } else if (iA == 2) {
            aV(feaVar, i);
            aT(fjyVar.a);
        } else if (iA == 3) {
            aZ(feaVar, i);
            aT(fjyVar.a);
        }
        return true;
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0065  */
    @Override // defpackage.fei
    protected final void aq(java.lang.String str, long j, long j2) {
        boolean z;
        defpackage.kvt kvtVar = this.ax;
        java.lang.Object obj = kvtVar.b;
        if (obj != null) {
            ((android.os.Handler) obj).post(new defpackage.fay(kvtVar, 17));
        }
        this.R = aU(str);
        defpackage.fee feeVar = this.y;
        ahvr.ci(feeVar);
        boolean z2 = true;
        if (!"video/x-vnd.on2.vp9".equals(feeVar.c)) {
            z = false;
            break;
        }
        android.media.MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrI = feeVar.i();
        int length = codecProfileLevelArrI.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            } else {
                if (codecProfileLevelArrI[i].profile == 16384) {
                    z = true;
                    break;
                }
                i++;
            }
        }
        this.T = z;
        if (android.os.Build.VERSION.SDK_INT < 37) {
            defpackage.fee feeVar2 = this.y;
            ahvr.ci(feeVar2);
            if (!feeVar2.c.equals("video/av01")) {
                defpackage.fee feeVar3 = this.y;
                ahvr.ci(feeVar3);
                if (!feeVar3.c.equals("video/hevc")) {
                    z2 = false;
                }
            }
        } else {
            z2 = false;
        }
        this.S = z2;
    }

    @Override // defpackage.fei
    protected final defpackage.exd ar(defpackage.hiz hizVar) throws java.lang.Throwable {
        defpackage.exd exdVarAr = super.ar(hizVar);
        this.U = false;
        ahvr.ci(hizVar.a);
        defpackage.kvt kvtVar = this.ax;
        java.lang.Object obj = kvtVar.b;
        if (obj != null) {
            ((android.os.Handler) obj).post(new defpackage.fkh(kvtVar, 2, null));
        }
        defpackage.fkb fkbVar = this.P;
        if (fkbVar != null) {
            fkbVar.c();
        }
        return exdVarAr;
    }

    @Override // defpackage.fei
    protected final defpackage.klt as(defpackage.fee feeVar, defpackage.eqg eqgVar, android.media.MediaCrypto mediaCrypto, float f) {
        defpackage.ahoz ahozVar;
        android.graphics.Point pointA;
        int i;
        android.media.MediaCodecInfo.VideoCapabilities videoCapabilities;
        defpackage.eqg[] eqgVarArr;
        int i2;
        int i3;
        int i4;
        byte[] bArr;
        int i5;
        int i6;
        android.util.Pair pairA;
        int iAO;
        defpackage.eqg[] eqgVarArrN = N();
        int length = eqgVarArrN.length;
        int iAP = aP(feeVar, eqgVar);
        int i7 = eqgVar.w;
        int i8 = eqgVar.v;
        if (length == 1) {
            if (iAP != -1 && (iAO = aO(feeVar, eqgVar)) != -1) {
                iAP = java.lang.Math.min((int) (iAP * 1.5f), iAO);
            }
            ahozVar = new defpackage.ahoz(i8, i7, iAP, (char[]) null);
        } else {
            int iMax = i7;
            int iMax2 = i8;
            int i9 = 0;
            boolean z = false;
            while (i9 < length) {
                defpackage.eqg eqgVar2 = eqgVarArrN[i9];
                defpackage.epy epyVar = eqgVar.F;
                if (epyVar != null) {
                    defpackage.epy epyVar2 = eqgVar2.F;
                    eqgVarArr = eqgVarArrN;
                    if (epyVar2 == null) {
                        i2 = length;
                    } else {
                        int i10 = epyVar2.b;
                        i2 = length;
                        if ((i10 == -1 || i10 == epyVar.b) && (((i3 = epyVar2.c) == -1 || i3 == epyVar.c) && (((i4 = epyVar2.d) == -1 || i4 == epyVar.d) && (((bArr = epyVar2.e) == null || java.util.Arrays.equals(bArr, epyVar.e)) && (((i5 = epyVar2.f) == -1 || i5 == epyVar.f) && ((i6 = epyVar2.g) == -1 || i6 == epyVar.g)))))) {
                        }
                    }
                    defpackage.eqf eqfVar = new defpackage.eqf(eqgVar2);
                    eqfVar.D = epyVar;
                    eqgVar2 = new defpackage.eqg(eqfVar);
                } else {
                    eqgVarArr = eqgVarArrN;
                    i2 = length;
                }
                if (feeVar.b(eqgVar, eqgVar2).d != 0) {
                    int i11 = eqgVar2.v;
                    z |= i11 == -1 || eqgVar2.w == -1;
                    iMax2 = java.lang.Math.max(iMax2, i11);
                    iMax = java.lang.Math.max(iMax, eqgVar2.w);
                    iAP = java.lang.Math.max(iAP, aP(feeVar, eqgVar2));
                }
                i9++;
                eqgVarArrN = eqgVarArr;
                length = i2;
            }
            if (z) {
                defpackage.etr.f("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + iMax2 + 'x' + iMax);
                boolean z2 = i7 > i8;
                int i12 = z2 ? i7 : i8;
                int i13 = true != z2 ? i7 : i8;
                int[] iArr = n;
                int i14 = 0;
                while (true) {
                    if (i14 < 9) {
                        float f2 = i13;
                        float f3 = i12;
                        int i15 = iArr[i14];
                        int[] iArr2 = iArr;
                        float f4 = i15;
                        if (i15 > i12 && (i = (int) (f4 * (f2 / f3))) > i13) {
                            int i16 = i12;
                            int i17 = true != z2 ? i15 : i;
                            int i18 = true == z2 ? i15 : i;
                            android.media.MediaCodecInfo.CodecCapabilities codecCapabilities = feeVar.e;
                            pointA = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? null : defpackage.fee.a(videoCapabilities, i17, i18);
                            float f5 = eqgVar.z;
                            if (pointA != null) {
                                if (feeVar.h(pointA.x, pointA.y, f5)) {
                                    break;
                                }
                            }
                            i14++;
                            i13 = i13;
                            i12 = i16;
                            iArr = iArr2;
                            z2 = z2;
                        }
                    }
                    pointA = null;
                    break;
                }
                if (pointA != null) {
                    iMax2 = java.lang.Math.max(iMax2, pointA.x);
                    iMax = java.lang.Math.max(iMax, pointA.y);
                    defpackage.eqf eqfVar2 = new defpackage.eqf(eqgVar);
                    eqfVar2.t = iMax2;
                    eqfVar2.u = iMax;
                    iAP = java.lang.Math.max(iAP, aO(feeVar, new defpackage.eqg(eqfVar2)));
                    defpackage.etr.f("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + iMax2 + 'x' + iMax);
                }
            }
            ahozVar = new defpackage.ahoz(iMax2, iMax, iAP, (char[]) null);
        }
        java.lang.String str = feeVar.d;
        this.av = ahozVar;
        boolean z3 = this.L;
        android.media.MediaFormat mediaFormat = new android.media.MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i8);
        mediaFormat.setInteger("height", i7);
        defpackage.hgu.aC(mediaFormat, eqgVar.s);
        float f6 = eqgVar.z;
        if (f6 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f6);
        }
        defpackage.hgu.aB(mediaFormat, "rotation-degrees", eqgVar.A);
        defpackage.epy epyVar3 = eqgVar.F;
        if (epyVar3 != null) {
            defpackage.hgu.aB(mediaFormat, "color-transfer", epyVar3.d);
            defpackage.hgu.aB(mediaFormat, "color-standard", epyVar3.b);
            defpackage.hgu.aB(mediaFormat, "color-range", epyVar3.c);
            byte[] bArr2 = epyVar3.e;
            if (bArr2 != null) {
                mediaFormat.setByteBuffer("hdr-static-info", java.nio.ByteBuffer.wrap(bArr2));
            }
        }
        if ("video/dolby-vision".equals(eqgVar.p) && (pairA = defpackage.ete.a(eqgVar)) != null) {
            defpackage.hgu.aB(mediaFormat, "profile", ((java.lang.Integer) pairA.first).intValue());
        }
        mediaFormat.setInteger("max-width", ahozVar.c);
        mediaFormat.setInteger("max-height", ahozVar.a);
        defpackage.hgu.aB(mediaFormat, "max-input-size", ahozVar.b);
        mediaFormat.setInteger("priority", 0);
        if (f != -1.0f) {
            mediaFormat.setFloat("operating-rate", f);
        }
        if (z3) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (android.os.Build.VERSION.SDK_INT >= 35) {
            mediaFormat.setInteger("importance", java.lang.Math.max(0, -this.ao));
        }
        ay(mediaFormat);
        android.view.Surface surfaceBb = bb(feeVar);
        if (this.V != null && !eum.V(this.q)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        return new defpackage.klt(feeVar, mediaFormat, eqgVar, surfaceBb, mediaCrypto, (defpackage.hjx) null);
    }

    @Override // defpackage.fei
    protected final int at(defpackage.ewu ewuVar) {
        return (android.os.Build.VERSION.SDK_INT < 34 || (!defpackage.eqe.b(6) && this.ai == null) || !bj(ewuVar) || bk(ewuVar)) ? 0 : 32;
    }

    @Override // defpackage.fei
    protected final defpackage.fec ax(java.lang.Throwable th, defpackage.fee feeVar) {
        return new defpackage.fjj(th, feeVar, this.l);
    }

    @Override // defpackage.ewz, defpackage.ezf
    public final void o() {
        defpackage.fkm fkmVar = this.V;
        if (fkmVar == null) {
            this.k.b();
            return;
        }
        int i = this.X;
        if (i == 0 || i == 1) {
            this.X = 0;
        } else {
            fkmVar.b();
        }
    }

    @Override // defpackage.fei, defpackage.ewz, defpackage.ezc
    public final void p(int i, java.lang.Object obj) throws java.lang.Throwable {
        if (i == 1) {
            bh(obj);
            return;
        }
        if (i == 7) {
            ahvr.ci(obj);
            defpackage.fjx fjxVar = (defpackage.fjx) obj;
            this.aq = fjxVar;
            defpackage.fkm fkmVar = this.V;
            if (fkmVar != null) {
                fkmVar.o(fjxVar);
                return;
            }
            return;
        }
        if (i == 10) {
            ahvr.ci(obj);
            int iIntValue = ((java.lang.Integer) obj).intValue();
            if (this.ap != iIntValue) {
                this.ap = iIntValue;
                return;
            }
            return;
        }
        if (i == 4) {
            ahvr.ci(obj);
            int iIntValue2 = ((java.lang.Integer) obj).intValue();
            this.ac = iIntValue2;
            defpackage.fea feaVar = this.v;
            if (feaVar != null) {
                feaVar.m(iIntValue2);
                return;
            }
            return;
        }
        if (i == 5) {
            ahvr.ci(obj);
            int iIntValue3 = ((java.lang.Integer) obj).intValue();
            this.ad = iIntValue3;
            defpackage.fkm fkmVar2 = this.V;
            if (fkmVar2 != null) {
                fkmVar2.j(iIntValue3);
                return;
            } else {
                this.k.h(iIntValue3);
                return;
            }
        }
        if (i == 13) {
            ahvr.ci(obj);
            java.util.List list = (java.util.List) obj;
            if (list.equals(defpackage.erw.a)) {
                defpackage.fkm fkmVar3 = this.V;
                if (fkmVar3 == null || !fkmVar3.u()) {
                    return;
                }
                fkmVar3.f();
                return;
            }
            this.Y = list;
            defpackage.fkm fkmVar4 = this.V;
            if (fkmVar4 != null) {
                fkmVar4.n(list);
                return;
            }
            return;
        }
        if (i == 14) {
            ahvr.ci(obj);
            defpackage.ety etyVar = (defpackage.ety) obj;
            if (etyVar.b == 0 || etyVar.c == 0) {
                return;
            }
            this.aa = etyVar;
            defpackage.fkm fkmVar5 = this.V;
            if (fkmVar5 != null) {
                android.view.Surface surface = this.l;
                ahvr.ci(surface);
                fkmVar5.l(surface, etyVar);
                return;
            }
            return;
        }
        switch (i) {
            case 16:
                ahvr.ci(obj);
                this.ao = ((java.lang.Integer) obj).intValue();
                defpackage.fea feaVar2 = this.v;
                if (feaVar2 != null && android.os.Build.VERSION.SDK_INT >= 35) {
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putInt("importance", java.lang.Math.max(0, -this.ao));
                    feaVar2.l(bundle);
                    break;
                }
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                android.view.Surface surface2 = this.l;
                bh(null);
                ahvr.ci(obj);
                ((defpackage.fjo) obj).p(1, surface2);
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                boolean z = this.ai != null;
                defpackage.ezj ezjVar = (defpackage.ezj) obj;
                this.ai = ezjVar;
                if (z != (ezjVar != null)) {
                    aD();
                }
                break;
            default:
                super.p(i, obj);
                break;
        }
    }

    @Override // defpackage.fei, defpackage.ewz
    protected final void s() {
        this.an = null;
        this.ab = false;
        this.ak = aH();
        this.au = -9223372036854775807L;
        try {
            super.s();
        } finally {
            defpackage.kvt kvtVar = this.ax;
            kvtVar.l(this.F);
            kvtVar.n(defpackage.ery.a);
        }
    }

    @Override // defpackage.fei, defpackage.ewz
    protected final void t(boolean z, boolean z2) {
        defpackage.fkm fkmVar;
        super.t(z, z2);
        R();
        defpackage.kvt kvtVar = this.ax;
        java.lang.Object obj = kvtVar.b;
        if (obj != null) {
            ((android.os.Handler) obj).post(new defpackage.fkh(kvtVar, 0, null));
        }
        if (!this.W) {
            if (this.Y != null && this.V == null) {
                defpackage.fjs fjsVar = new defpackage.fjs(this.q, this.k);
                fjsVar.c = true;
                fjsVar.f = -this.O;
                fjsVar.d = g();
                ahvr.bY(!fjsVar.e);
                if (fjsVar.h == null) {
                    fjsVar.h = new defpackage.oq((byte[]) null, (byte[]) null);
                }
                defpackage.fjw fjwVar = new defpackage.fjw(fjsVar);
                fjsVar.e = true;
                fjwVar.q = 1;
                android.util.SparseArray sparseArray = fjwVar.c;
                if (eum.Q(sparseArray, 0)) {
                    fkmVar = (defpackage.fkm) sparseArray.get(0);
                } else {
                    defpackage.fjt fjtVar = new defpackage.fjt(fjwVar, fjwVar.b);
                    fjwVar.g.add(fjtVar);
                    sparseArray.put(0, fjtVar);
                    fkmVar = fjtVar;
                }
                this.V = fkmVar;
            }
            this.W = true;
        }
        int i = !z2 ? 1 : 0;
        defpackage.fkm fkmVar2 = this.V;
        if (fkmVar2 == null) {
            defpackage.fka fkaVar = this.k;
            fkaVar.b = g();
            fkaVar.f(i);
            return;
        }
        fkmVar2.k(new defpackage.fjl(this), ajbm.a);
        defpackage.fjx fjxVar = this.aq;
        if (fjxVar != null) {
            this.V.o(fjxVar);
        }
        if (this.l != null && !this.aa.equals(defpackage.ety.a)) {
            this.V.l(this.l, this.aa);
        }
        this.V.j(this.ad);
        this.V.m(this.u);
        java.util.List list = this.Y;
        if (list != null) {
            this.V.n(list);
        }
        this.X = i;
    }

    @Override // defpackage.fei, defpackage.ewz
    protected final void u(long j, boolean z, boolean z2) throws java.lang.Throwable {
        defpackage.fkm fkmVar = this.V;
        if (fkmVar != null && !z) {
            fkmVar.d(true);
        }
        if (z2) {
            this.aj = j;
        }
        super.u(j, z, z2);
        if (this.V == null) {
            this.k.g();
        }
        defpackage.fkb fkbVar = this.P;
        if (fkbVar != null) {
            fkbVar.c();
        }
        if (z) {
            defpackage.fkm fkmVar2 = this.V;
            if (fkmVar2 != null) {
                fkmVar2.e(false);
            } else {
                this.k.c(false);
            }
        }
        this.ag = 0;
        this.au = -9223372036854775807L;
    }

    @Override // defpackage.ewz
    protected final void v() {
        defpackage.fkm fkmVar = this.V;
        if (fkmVar == null || !this.J) {
            return;
        }
        fkmVar.g();
    }

    @Override // defpackage.fei, defpackage.ewz
    protected final void w() {
        try {
            super.w();
        } finally {
            this.W = false;
            this.ar = -9223372036854775807L;
            this.au = -9223372036854775807L;
            this.U = false;
            bg();
        }
    }

    @Override // defpackage.ewz
    protected final void x() {
        this.af = 0;
        g();
        this.ae = android.os.SystemClock.elapsedRealtime();
        this.al = 0L;
        this.am = 0;
        defpackage.fkm fkmVar = this.V;
        if (fkmVar != null) {
            fkmVar.q();
        } else {
            this.k.d();
        }
    }

    @Override // defpackage.ewz
    protected final void y() {
        bd();
        if (this.am != 0) {
            defpackage.kvt kvtVar = this.ax;
            java.lang.Object obj = kvtVar.b;
            if (obj != null) {
                ((android.os.Handler) obj).post(new defpackage.fay(kvtVar, 20));
            }
            this.al = 0L;
            this.am = 0;
        }
        defpackage.fkm fkmVar = this.V;
        if (fkmVar != null) {
            fkmVar.r();
        } else {
            this.k.e();
        }
        defpackage.fkb fkbVar = this.P;
        if (fkbVar != null) {
            fkbVar.c();
        }
    }

    @Override // defpackage.fei, defpackage.ewz
    protected final void z(defpackage.eqg[] eqgVarArr, long j, long j2, defpackage.ffu ffuVar) {
        super.z(eqgVarArr, j, j2, ffuVar);
        defpackage.fkb fkbVar = this.P;
        if (fkbVar != null) {
            fkbVar.c();
        }
    }
}
