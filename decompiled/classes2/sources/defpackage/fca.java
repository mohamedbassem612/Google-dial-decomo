package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fca extends defpackage.fei implements defpackage.eyp {
    private final android.content.Context J;
    private final java.util.IdentityHashMap K;
    private int L;
    private boolean M;
    private defpackage.eqg N;
    private defpackage.eqg O;
    private long P;
    private boolean Q;
    private int R;
    private boolean S;
    private long T;
    private long U;
    private boolean V;
    private defpackage.eqg W;
    private int X;
    public final java.util.concurrent.atomic.AtomicBoolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public final defpackage.fbw o;
    public final defpackage.hjx p;
    public final ils q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fca(android.content.Context context, defpackage.fdz fdzVar, defpackage.fek fekVar, android.os.Handler handler, defpackage.exy exyVar, defpackage.fbw fbwVar) {
        super(context.getApplicationContext(), 1, fdzVar, fekVar);
        defpackage.hjx hjxVar = android.os.Build.VERSION.SDK_INT >= 35 ? new defpackage.hjx((byte[]) null) : null;
        this.K = new java.util.IdentityHashMap();
        this.J = context.getApplicationContext();
        this.o = fbwVar;
        this.p = hjxVar;
        this.R = -1000;
        this.q = new ils(handler, exyVar);
        this.k = new java.util.concurrent.atomic.AtomicBoolean();
        this.X = -1;
        this.T = -9223372036854775807L;
        this.U = -9223372036854775807L;
        this.V = false;
    }

    private final void aO() {
        this.X = -1;
        this.K.clear();
    }

    private final void aP() {
        long j;
        long jMax;
        java.util.ArrayDeque arrayDeque;
        long j2;
        W();
        defpackage.fbw fbwVar = this.o;
        if (!fbwVar.v()) {
            j = Long.MIN_VALUE;
            jMax = Long.MIN_VALUE;
        } else if (fbwVar.w) {
            jMax = Long.MIN_VALUE;
            j = Long.MIN_VALUE;
        } else {
            long jMin = java.lang.Math.min(fbwVar.R.c(), fbwVar.k.a(fbwVar.c()));
            while (true) {
                arrayDeque = fbwVar.g;
                if (arrayDeque.isEmpty() || jMin < ((anwx) arrayDeque.getFirst()).a) {
                    break;
                } else {
                    fbwVar.T = (anwx) arrayDeque.remove();
                }
            }
            anwx anwxVar = fbwVar.T;
            long jZ = jMin - anwxVar.a;
            long jU = eum.u(jZ, ((defpackage.erc) anwxVar.d).b);
            if (arrayDeque.isEmpty()) {
                defpackage.esp espVar = (defpackage.esp) fbwVar.U.b;
                if (!espVar.g()) {
                    j = Long.MIN_VALUE;
                } else if (espVar.i >= 1024) {
                    long j3 = espVar.h;
                    defpackage.eso esoVar = espVar.g;
                    ahvr.ci(esoVar);
                    long jB = j3 - ((long) esoVar.b());
                    int i = espVar.e.b;
                    int i2 = espVar.d.b;
                    if (i == i2) {
                        jZ = eum.z(jZ, jB, espVar.i);
                        j = Long.MIN_VALUE;
                    } else {
                        j = Long.MIN_VALUE;
                        jZ = eum.z(jZ, jB * ((long) i), espVar.i * ((long) i2));
                    }
                } else {
                    j = Long.MIN_VALUE;
                    jZ = (long) (((double) espVar.b) * jZ);
                }
                anwx anwxVar2 = fbwVar.T;
                j2 = anwxVar2.b + jZ;
                anwxVar2.c = jZ - jU;
            } else {
                j = Long.MIN_VALUE;
                anwx anwxVar3 = fbwVar.T;
                j2 = anwxVar3.b + jU + anwxVar3.c;
            }
            long j4 = ((defpackage.fcc) fbwVar.U.a).e;
            jMax = j2 + fbwVar.k.a(j4);
            long j5 = fbwVar.O;
            if (j4 > j5) {
                long jA = fbwVar.k.a(j4 - j5);
                fbwVar.O = j4;
                fbwVar.P += jA;
                if (fbwVar.Q == null) {
                    fbwVar.Q = new android.os.Handler(android.os.Looper.myLooper());
                }
                fbwVar.Q.removeCallbacksAndMessages(null);
                fbwVar.Q.postDelayed(new defpackage.fay(fbwVar, 3), 100L);
            }
        }
        if (jMax != j) {
            if (!this.l) {
                jMax = java.lang.Math.max(this.P, jMax);
            }
            this.P = jMax;
            this.l = false;
        }
    }

    private static java.util.List aQ(defpackage.fek fekVar, defpackage.eqg eqgVar, boolean z, defpackage.fbw fbwVar) {
        defpackage.fee feeVarG;
        if (eqgVar.p == null) {
            return aike.a;
        }
        return (!fbwVar.w(eqgVar) || (feeVarG = defpackage.feq.g()) == null) ? defpackage.feq.j(eqgVar, z, false) : aify.p(feeVarG);
    }

    @Override // defpackage.ezf, defpackage.ezg
    public final java.lang.String U() {
        return "MediaCodecAudioRenderer";
    }

    @Override // defpackage.fei, defpackage.ezf
    public final boolean W() {
        if (this.D) {
            defpackage.fbw fbwVar = this.o;
            if (!fbwVar.v() || (fbwVar.C && !fbwVar.u())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.fei, defpackage.ezf
    public final boolean X() {
        if (this.o.u()) {
            this.U = -9223372036854775807L;
            this.V = true;
            return true;
        }
        if (this.V && this.S && L() && !J()) {
            g();
            long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
            long j = this.U;
            if (j == -9223372036854775807L) {
                this.U = jElapsedRealtime;
                return true;
            }
            if (jElapsedRealtime - j < 100) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.fei
    protected final float Z(float f, defpackage.eqg eqgVar, defpackage.eqg[] eqgVarArr) {
        int integer = -1;
        for (defpackage.eqg eqgVar2 : eqgVarArr) {
            int i = eqgVar2.J;
            if (i != -1) {
                integer = java.lang.Math.max(integer, i);
            }
        }
        if (integer == -1) {
            android.media.MediaFormat mediaFormat = this.x;
            integer = (mediaFormat == null || !mediaFormat.containsKey("sample-rate")) ? -1 : mediaFormat.getInteger("sample-rate");
        }
        if (integer == -1) {
            return -1.0f;
        }
        return integer * f;
    }

    @Override // defpackage.eyp
    public final long a() {
        if (this.b == 2) {
            aP();
        }
        return this.P;
    }

    @Override // defpackage.fei
    protected final int aa(defpackage.fek fekVar, defpackage.eqg eqgVar) {
        int i;
        boolean z;
        defpackage.fan fanVarE;
        java.lang.String str = eqgVar.p;
        if (!defpackage.eqz.f(str)) {
            return 128;
        }
        int i2 = eqgVar.Q;
        boolean zAL = aL(eqgVar);
        if (!zAL || (i2 != 0 && defpackage.feq.g() == null)) {
            i = 0;
        } else {
            defpackage.fbw fbwVar = this.o;
            if (fbwVar.M) {
                fanVarE = defpackage.fan.a;
            } else {
                defpackage.fat fatVarA = fbwVar.m.a(fbwVar.y(eqgVar));
                xwe xweVar = new xwe();
                xweVar.b = fatVarA.a;
                xweVar.c = fatVarA.b;
                xweVar.a = fatVarA.c;
                fanVarE = xweVar.e();
            }
            if (fanVarE.b) {
                i = true != fanVarE.c ? 512 : 1536;
                if (fanVarE.d) {
                    i |= 2048;
                }
            } else {
                i = 0;
            }
            if (fbwVar.w(eqgVar)) {
                return i | 172;
            }
        }
        if (!"audio/raw".equals(str) || this.o.w(eqgVar)) {
            defpackage.fbw fbwVar2 = this.o;
            if (fbwVar2.w(eum.F(2, eqgVar.H, eqgVar.J))) {
                aike aikeVarAQ = aQ(fekVar, eqgVar, false, fbwVar2);
                if (!aikeVarAQ.isEmpty()) {
                    if (!zAL) {
                        return 130;
                    }
                    defpackage.fee feeVar = (defpackage.fee) aikeVarAQ.get(0);
                    android.content.Context context = this.J;
                    boolean zE = feeVar.e(context, eqgVar);
                    if (!zE) {
                        int i3 = 1;
                        while (true) {
                            if (i3 >= aikeVarAQ.d) {
                                z = true;
                                break;
                            }
                            defpackage.fee feeVar2 = (defpackage.fee) aikeVarAQ.get(i3);
                            if (feeVar2.e(context, eqgVar)) {
                                z = false;
                                zE = true;
                                feeVar = feeVar2;
                                break;
                            }
                            i3++;
                        }
                    } else {
                        z = true;
                        break;
                    }
                    int i4 = true != zE ? 3 : 4;
                    int i5 = 8;
                    if (zE && feeVar.g(eqgVar)) {
                        i5 = 16;
                    }
                    return i4 | i5 | 32 | (true != feeVar.h ? 0 : 64) | (true != z ? 0 : 128) | i;
                }
            }
        }
        return 129;
    }

    @Override // defpackage.fei
    protected final long ab(long j, long j2, boolean z) {
        long jA;
        defpackage.fbw fbwVar = this.o;
        boolean z2 = fbwVar.u() && this.T != -9223372036854775807L;
        if (!this.S) {
            return (z2 || this.D) ? 1000000L : 10000L;
        }
        if (!fbwVar.v()) {
            jA = -9223372036854775807L;
        } else if (fbwVar.k.c()) {
            jA = fbwVar.k.a(fbwVar.R.b());
        } else {
            long jB = fbwVar.R.b();
            int iAk = defpackage.hgu.ak(fbwVar.k.e.a);
            ahvr.bY(iAk != -2147483647);
            jA = eum.A(jB, 1000000L, iAk, java.math.RoundingMode.DOWN);
        }
        if (this.n && z2 && jA != -9223372036854775807L) {
            return java.lang.Math.max(10000L, (long) ((java.lang.Math.min(jA, this.T - j) / (b() != null ? b().b : 1.0f)) / 2.0f));
        }
        return 10000L;
    }

    @Override // defpackage.fei
    protected final defpackage.exd ac(defpackage.fee feeVar, defpackage.eqg eqgVar, defpackage.eqg eqgVar2, boolean z) {
        int i;
        int i2;
        defpackage.exd exdVarB = feeVar.b(eqgVar, eqgVar2);
        int i3 = exdVarB.e;
        if (aF(eqgVar2)) {
            i3 |= 32768;
        }
        if (eqgVar2.q > this.L) {
            i3 |= 64;
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
        return defpackage.feq.e(this.J, aQ(fekVar, eqgVar, z, this.o), eqgVar);
    }

    @Override // defpackage.fei
    protected final void ae(defpackage.ewu ewuVar) {
        int iT;
        defpackage.fbn fbnVar;
        defpackage.eqg eqgVar = ewuVar.b;
        if (eqgVar == null || !j$.util.Objects.equals(eqgVar.p, "audio/opus")) {
            return;
        }
        java.nio.ByteBuffer byteBuffer = ewuVar.g;
        ahvr.ci(byteBuffer);
        if (byteBuffer.remaining() == 8) {
            long j = byteBuffer.order(java.nio.ByteOrder.LITTLE_ENDIAN).getLong(byteBuffer.position());
            if (j <= 0 || (iT = aiql.T(eum.A(j, 48000L, 1000000000L, java.math.RoundingMode.HALF_UP))) <= 0) {
                return;
            }
            if (!this.A) {
                if (eqgVar == this.W) {
                    this.X = iT;
                    this.o.p(iT);
                    return;
                } else {
                    if (this.O == null) {
                        this.K.put(eqgVar, java.lang.Integer.valueOf(iT));
                        return;
                    }
                    return;
                }
            }
            int i = eqgVar.L;
            defpackage.fbw fbwVar = this.o;
            defpackage.fbu fbuVar = fbwVar.j;
            if (fbuVar == null) {
                fbuVar = fbwVar.k;
            }
            if (fbuVar == null || fbuVar.c()) {
                return;
            }
            fbuVar.i = i;
            fbuVar.j = iT;
            if (fbuVar == fbwVar.k && (fbnVar = fbwVar.R) != null && fbnVar.f()) {
                defpackage.faw fawVar = fbwVar.k.e;
            }
        }
    }

    @Override // defpackage.fei
    protected final void af(java.lang.Exception exc) {
        defpackage.etr.d("MediaCodecAudioRenderer", "Audio codec error", exc);
        ils ilsVar = this.q;
        java.lang.Object obj = ilsVar.b;
        if (obj != null) {
            ((android.os.Handler) obj).post(new defpackage.drn(ilsVar, 18));
        }
    }

    @Override // defpackage.fei
    protected final void ag(defpackage.exa exaVar) {
        ils ilsVar = this.q;
        java.lang.Object obj = ilsVar.b;
        if (obj != null) {
            ((android.os.Handler) obj).post(new defpackage.esz(ilsVar, exaVar, 11, null));
        }
    }

    @Override // defpackage.fei
    protected final void ah(java.lang.String str) {
        ils ilsVar = this.q;
        java.lang.Object obj = ilsVar.b;
        if (obj != null) {
            ((android.os.Handler) obj).post(new defpackage.fay(ilsVar, 0));
        }
    }

    @Override // defpackage.fei
    protected final void ai(defpackage.eqg eqgVar, android.media.MediaFormat mediaFormat) throws defpackage.exl {
        defpackage.aizh aizhVar;
        int iJ;
        defpackage.eqg eqgVar2;
        defpackage.ese eseVar;
        int i;
        java.lang.Object obj;
        int iO;
        int integer;
        defpackage.eqg eqgVar3 = this.O;
        if (eqgVar3 != null) {
            aizhVar = null;
        } else {
            if (this.v == null) {
                eqgVar3 = eqgVar;
            } else {
                ahvr.ci(mediaFormat);
                if ("audio/raw".equals(eqgVar.p)) {
                    iO = eqgVar.K;
                } else if (mediaFormat.containsKey("pcm-encoding")) {
                    iO = mediaFormat.getInteger("pcm-encoding");
                } else {
                    iO = mediaFormat.containsKey("v-bits-per-sample") ? eum.o(mediaFormat.getInteger("v-bits-per-sample")) : 2;
                }
                int integer2 = mediaFormat.getInteger("channel-count");
                int i2 = eqgVar.I;
                if (i2 == -1 || eqgVar.H != integer2) {
                    i2 = -1;
                }
                if (mediaFormat.containsKey("channel-mask") && (integer = mediaFormat.getInteger("channel-mask")) != 0 && java.lang.Integer.bitCount(integer) == integer2) {
                    i2 = integer;
                }
                defpackage.eqf eqfVar = new defpackage.eqf();
                eqfVar.c("audio/raw");
                eqfVar.I = iO;
                eqfVar.J = eqgVar.L;
                eqfVar.K = eqgVar.M;
                eqfVar.k = eqgVar.l;
                java.lang.Object obj2 = eqgVar.m;
                eqfVar.a = eqgVar.a;
                eqfVar.b = eqgVar.b;
                eqfVar.c = aify.n(eqgVar.c);
                eqfVar.d = eqgVar.d;
                eqfVar.e = eqgVar.e;
                eqfVar.f = eqgVar.f;
                eqfVar.F = integer2;
                eqfVar.G = i2;
                eqfVar.H = mediaFormat.getInteger("sample-rate");
                eqgVar3 = new defpackage.eqg(eqfVar);
                if (this.M) {
                    int i3 = eqgVar3.H;
                    defpackage.aizh aizhVar2 = defpackage.fmm.a;
                    if (i3 == 3) {
                        aizhVar = defpackage.fmm.a;
                    } else if (i3 == 5) {
                        aizhVar = defpackage.fmm.b;
                    } else if (i3 == 6) {
                        aizhVar = defpackage.fmm.c;
                    } else if (i3 == 7) {
                        aizhVar = defpackage.fmm.d;
                    } else if (i3 == 8) {
                        aizhVar = defpackage.fmm.e;
                    }
                }
            }
            aizhVar = null;
        }
        try {
            if (this.A) {
                R();
            }
            defpackage.fbw fbwVar = this.o;
            defpackage.fbo fboVar = new defpackage.fbo(eqgVar3);
            fboVar.b = aizhVar;
            fboVar.c = this.g;
            fboVar.d = this.h;
            if (!((defpackage.erm) fboVar.c).n() && (obj = fboVar.d) != null) {
                ahvr.bM(((defpackage.erm) fboVar.c).a(((defpackage.ffu) obj).a) != -1);
            }
            defpackage.faz fazVar = new defpackage.faz(fboVar);
            if (fbwVar.X == null && fbwVar.a != null) {
                fbwVar.X = new rai(fbwVar);
                fbwVar.m.g(fbwVar.X);
            }
            defpackage.eqg eqgVar4 = fazVar.a;
            if ("audio/raw".equals(eqgVar4.p)) {
                int i4 = eqgVar4.K;
                ahvr.bM(eum.U(i4));
                int i5 = eqgVar4.H;
                int iJ2 = eum.j(i4) * i5;
                aift aiftVar = new aift(4);
                aiftVar.k(fbwVar.f);
                aiftVar.i(fbwVar.d);
                aiftVar.j((java.lang.Object[]) fbwVar.U.c);
                defpackage.ese eseVar2 = new defpackage.ese(aiftVar.h());
                if (eseVar2.equals(fbwVar.l)) {
                    eseVar2 = fbwVar.l;
                }
                fbwVar.b.d = fazVar.c;
                defpackage.esf esfVar = new defpackage.esf(eqgVar4);
                try {
                    defpackage.esf esfVar2 = defpackage.esf.a;
                    if (esfVar.equals(esfVar2)) {
                        throw new defpackage.esi("Unhandled input format:", esfVar);
                    }
                    int i6 = 0;
                    while (true) {
                        aike aikeVar = eseVar2.a;
                        if (i6 >= aikeVar.d) {
                            break;
                        }
                        defpackage.esj esjVar = (defpackage.esj) aikeVar.get(i6);
                        defpackage.esf esfVarB = esjVar.b(esfVar);
                        if (esjVar.g()) {
                            ahvr.bY(!esfVarB.equals(esfVar2));
                            esfVar = esfVarB;
                        }
                        i6++;
                    }
                    eseVar2.d = esfVar;
                    defpackage.eqf eqfVar2 = new defpackage.eqf(eqgVar4);
                    int i7 = esfVar.d;
                    eqfVar2.I = i7;
                    eqfVar2.H = esfVar.b;
                    int i8 = esfVar.c;
                    eqfVar2.F = i8;
                    eqfVar2.G = i8 == i5 ? eqgVar4.I : -1;
                    defpackage.eqg eqgVar5 = new defpackage.eqg(eqfVar2);
                    iJ = eum.j(i7) * i8;
                    eqgVar2 = eqgVar5;
                    eseVar = eseVar2;
                    i = iJ2;
                } catch (defpackage.esi e) {
                    throw new defpackage.fba(e, eqgVar4);
                }
            } else {
                iJ = -1;
                eqgVar2 = eqgVar4;
                eseVar = new defpackage.ese(aike.a);
                i = -1;
            }
            defpackage.far farVarY = fbwVar.y(eqgVar2);
            try {
                defpackage.faw fawVarB = fbwVar.m.b(farVarY);
                if (fawVarB.a == 0) {
                    throw new defpackage.fba("Invalid output encoding (isOffload=" + fawVarB.d + ')', farVarY.a);
                }
                if (fawVarB.c == 0) {
                    throw new defpackage.fba("Invalid output channel config (isOffload=" + fawVarB.d + ')', farVarY.a);
                }
                fbwVar.M = false;
                defpackage.erm ermVar = fazVar.d;
                defpackage.ffu ffuVar = fazVar.e;
                defpackage.fbu fbuVar = new defpackage.fbu(eqgVar4, eqgVar2, i, iJ, fawVarB, eseVar, ermVar, ffuVar != null ? ffuVar.a : null);
                if (fbwVar.v()) {
                    fbwVar.j = fbuVar;
                } else {
                    fbwVar.k = fbuVar;
                    fbwVar.e();
                }
                if (this.v != null && this.O == null) {
                    if (eqgVar != this.W) {
                        this.W = eqgVar;
                        java.lang.Integer num = (java.lang.Integer) this.K.remove(eqgVar);
                        this.X = num != null ? num.intValue() : -1;
                    }
                    int i9 = this.X;
                    if (i9 != -1) {
                        this.o.p(i9);
                    }
                }
                aD();
            } catch (defpackage.fap e2) {
                throw new defpackage.fba(e2, eqgVar4);
            }
        } catch (defpackage.fba e3) {
            throw h(e3, e3.a, false, 5001);
        }
    }

    @Override // defpackage.fei
    protected final void aj(long j) {
        this.o.y = j;
    }

    @Override // defpackage.fei
    protected final void ak() {
        this.W = null;
        this.X = -1;
        this.o.h();
    }

    @Override // defpackage.fei
    protected final void al() throws defpackage.exl {
        try {
            defpackage.fbw fbwVar = this.o;
            if (!fbwVar.C && fbwVar.v() && fbwVar.s()) {
                fbwVar.k();
                fbwVar.C = true;
            }
            if (au() != -9223372036854775807L) {
                this.T = au();
            }
        } catch (defpackage.fbd e) {
            throw h(e, e.c, e.b, true != this.A ? 5002 : 5003);
        }
    }

    @Override // defpackage.fei
    protected final void am() {
        super.am();
        aO();
    }

    @Override // defpackage.fei
    protected final void an() {
        super.an();
        this.W = null;
        aO();
    }

    @Override // defpackage.fei
    protected final boolean ao(long j, long j2, defpackage.fea feaVar, final java.nio.ByteBuffer byteBuffer, int i, int i2, final int i3, final long j3, boolean z, boolean z2, defpackage.eqg eqgVar) throws defpackage.exl {
        final defpackage.fca fcaVar;
        ahvr.ci(byteBuffer);
        this.T = -9223372036854775807L;
        if (this.O != null && (i2 & 2) != 0) {
            ahvr.ci(feaVar);
            feaVar.s(i);
            return true;
        }
        if (z) {
            if (feaVar != null) {
                feaVar.s(i);
            }
            this.F.f += i3;
            this.o.h();
            return true;
        }
        try {
            try {
                fcaVar = this;
                try {
                    defpackage.eui euiVar = new defpackage.eui() { // from class: fbz
                        /* JADX WARN: Code duplicated, block: B:100:0x021b  */
                        /* JADX WARN: Code duplicated, block: B:102:0x0223  */
                        /* JADX WARN: Code duplicated, block: B:103:0x0225  */
                        /* JADX WARN: Code duplicated, block: B:106:0x022f  */
                        /* JADX WARN: Code duplicated, block: B:108:0x0237  */
                        /* JADX WARN: Code duplicated, block: B:114:0x024d  */
                        /* JADX WARN: Code duplicated, block: B:116:0x0253  */
                        /* JADX WARN: Code duplicated, block: B:117:0x0258  */
                        /* JADX WARN: Code duplicated, block: B:119:0x0262  */
                        /* JADX WARN: Code duplicated, block: B:120:0x026d  */
                        /* JADX WARN: Code duplicated, block: B:123:0x0283  */
                        /* JADX WARN: Code duplicated, block: B:127:0x0294  */
                        /* JADX WARN: Code duplicated, block: B:131:0x02a2  */
                        /* JADX WARN: Code duplicated, block: B:134:0x02a9  */
                        /* JADX WARN: Code duplicated, block: B:136:0x02b9  */
                        /* JADX WARN: Code duplicated, block: B:141:0x02cd  */
                        /* JADX WARN: Code duplicated, block: B:142:0x02d8  */
                        /* JADX WARN: Code duplicated, block: B:144:0x02f0  */
                        /* JADX WARN: Code duplicated, block: B:146:0x02fb  */
                        /* JADX WARN: Code duplicated, block: B:147:0x0301  */
                        /* JADX WARN: Code duplicated, block: B:151:0x0078 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                        /* JADX WARN: Code duplicated, block: B:155:0x0070 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                        /* JADX WARN: Code duplicated, block: B:18:0x0049  */
                        /* JADX WARN: Code duplicated, block: B:20:0x0056  */
                        /* JADX WARN: Code duplicated, block: B:22:0x005c  */
                        /* JADX WARN: Code duplicated, block: B:25:0x0064  */
                        /* JADX WARN: Code duplicated, block: B:56:0x011e A[Catch: fbb -> 0x01e8, TryCatch #2 {fbb -> 0x01e8, blocks: (B:28:0x0070, B:54:0x0100, B:56:0x011e, B:57:0x0122, B:59:0x0126, B:61:0x012e, B:63:0x013c, B:64:0x0141, B:66:0x014c, B:67:0x0151, B:69:0x0163, B:71:0x0171, B:73:0x017f, B:75:0x019d, B:76:0x01b3, B:78:0x01bd, B:80:0x01c5, B:81:0x01c8, B:83:0x01d2, B:34:0x0084, B:36:0x0093, B:43:0x00b8, B:48:0x00d5, B:50:0x00df, B:51:0x00e2, B:85:0x01df, B:86:0x01e4, B:87:0x01e7, B:37:0x009d, B:39:0x00a5, B:40:0x00a8, B:30:0x0078, B:52:0x00f3), top: B:155:0x0070, inners: #0, #1 }] */
                        /* JADX WARN: Code duplicated, block: B:59:0x0126 A[Catch: fbb -> 0x01e8, TryCatch #2 {fbb -> 0x01e8, blocks: (B:28:0x0070, B:54:0x0100, B:56:0x011e, B:57:0x0122, B:59:0x0126, B:61:0x012e, B:63:0x013c, B:64:0x0141, B:66:0x014c, B:67:0x0151, B:69:0x0163, B:71:0x0171, B:73:0x017f, B:75:0x019d, B:76:0x01b3, B:78:0x01bd, B:80:0x01c5, B:81:0x01c8, B:83:0x01d2, B:34:0x0084, B:36:0x0093, B:43:0x00b8, B:48:0x00d5, B:50:0x00df, B:51:0x00e2, B:85:0x01df, B:86:0x01e4, B:87:0x01e7, B:37:0x009d, B:39:0x00a5, B:40:0x00a8, B:30:0x0078, B:52:0x00f3), top: B:155:0x0070, inners: #0, #1 }] */
                        /* JADX WARN: Code duplicated, block: B:61:0x012e A[Catch: fbb -> 0x01e8, TryCatch #2 {fbb -> 0x01e8, blocks: (B:28:0x0070, B:54:0x0100, B:56:0x011e, B:57:0x0122, B:59:0x0126, B:61:0x012e, B:63:0x013c, B:64:0x0141, B:66:0x014c, B:67:0x0151, B:69:0x0163, B:71:0x0171, B:73:0x017f, B:75:0x019d, B:76:0x01b3, B:78:0x01bd, B:80:0x01c5, B:81:0x01c8, B:83:0x01d2, B:34:0x0084, B:36:0x0093, B:43:0x00b8, B:48:0x00d5, B:50:0x00df, B:51:0x00e2, B:85:0x01df, B:86:0x01e4, B:87:0x01e7, B:37:0x009d, B:39:0x00a5, B:40:0x00a8, B:30:0x0078, B:52:0x00f3), top: B:155:0x0070, inners: #0, #1 }] */
                        /* JADX WARN: Code duplicated, block: B:63:0x013c A[Catch: fbb -> 0x01e8, TryCatch #2 {fbb -> 0x01e8, blocks: (B:28:0x0070, B:54:0x0100, B:56:0x011e, B:57:0x0122, B:59:0x0126, B:61:0x012e, B:63:0x013c, B:64:0x0141, B:66:0x014c, B:67:0x0151, B:69:0x0163, B:71:0x0171, B:73:0x017f, B:75:0x019d, B:76:0x01b3, B:78:0x01bd, B:80:0x01c5, B:81:0x01c8, B:83:0x01d2, B:34:0x0084, B:36:0x0093, B:43:0x00b8, B:48:0x00d5, B:50:0x00df, B:51:0x00e2, B:85:0x01df, B:86:0x01e4, B:87:0x01e7, B:37:0x009d, B:39:0x00a5, B:40:0x00a8, B:30:0x0078, B:52:0x00f3), top: B:155:0x0070, inners: #0, #1 }] */
                        /* JADX WARN: Code duplicated, block: B:66:0x014c A[Catch: fbb -> 0x01e8, TryCatch #2 {fbb -> 0x01e8, blocks: (B:28:0x0070, B:54:0x0100, B:56:0x011e, B:57:0x0122, B:59:0x0126, B:61:0x012e, B:63:0x013c, B:64:0x0141, B:66:0x014c, B:67:0x0151, B:69:0x0163, B:71:0x0171, B:73:0x017f, B:75:0x019d, B:76:0x01b3, B:78:0x01bd, B:80:0x01c5, B:81:0x01c8, B:83:0x01d2, B:34:0x0084, B:36:0x0093, B:43:0x00b8, B:48:0x00d5, B:50:0x00df, B:51:0x00e2, B:85:0x01df, B:86:0x01e4, B:87:0x01e7, B:37:0x009d, B:39:0x00a5, B:40:0x00a8, B:30:0x0078, B:52:0x00f3), top: B:155:0x0070, inners: #0, #1 }] */
                        /* JADX WARN: Code duplicated, block: B:69:0x0163 A[Catch: fbb -> 0x01e8, TryCatch #2 {fbb -> 0x01e8, blocks: (B:28:0x0070, B:54:0x0100, B:56:0x011e, B:57:0x0122, B:59:0x0126, B:61:0x012e, B:63:0x013c, B:64:0x0141, B:66:0x014c, B:67:0x0151, B:69:0x0163, B:71:0x0171, B:73:0x017f, B:75:0x019d, B:76:0x01b3, B:78:0x01bd, B:80:0x01c5, B:81:0x01c8, B:83:0x01d2, B:34:0x0084, B:36:0x0093, B:43:0x00b8, B:48:0x00d5, B:50:0x00df, B:51:0x00e2, B:85:0x01df, B:86:0x01e4, B:87:0x01e7, B:37:0x009d, B:39:0x00a5, B:40:0x00a8, B:30:0x0078, B:52:0x00f3), top: B:155:0x0070, inners: #0, #1 }] */
                        /* JADX WARN: Code duplicated, block: B:71:0x0171 A[Catch: fbb -> 0x01e8, TryCatch #2 {fbb -> 0x01e8, blocks: (B:28:0x0070, B:54:0x0100, B:56:0x011e, B:57:0x0122, B:59:0x0126, B:61:0x012e, B:63:0x013c, B:64:0x0141, B:66:0x014c, B:67:0x0151, B:69:0x0163, B:71:0x0171, B:73:0x017f, B:75:0x019d, B:76:0x01b3, B:78:0x01bd, B:80:0x01c5, B:81:0x01c8, B:83:0x01d2, B:34:0x0084, B:36:0x0093, B:43:0x00b8, B:48:0x00d5, B:50:0x00df, B:51:0x00e2, B:85:0x01df, B:86:0x01e4, B:87:0x01e7, B:37:0x009d, B:39:0x00a5, B:40:0x00a8, B:30:0x0078, B:52:0x00f3), top: B:155:0x0070, inners: #0, #1 }] */
                        /* JADX WARN: Code duplicated, block: B:73:0x017f A[Catch: fbb -> 0x01e8, TryCatch #2 {fbb -> 0x01e8, blocks: (B:28:0x0070, B:54:0x0100, B:56:0x011e, B:57:0x0122, B:59:0x0126, B:61:0x012e, B:63:0x013c, B:64:0x0141, B:66:0x014c, B:67:0x0151, B:69:0x0163, B:71:0x0171, B:73:0x017f, B:75:0x019d, B:76:0x01b3, B:78:0x01bd, B:80:0x01c5, B:81:0x01c8, B:83:0x01d2, B:34:0x0084, B:36:0x0093, B:43:0x00b8, B:48:0x00d5, B:50:0x00df, B:51:0x00e2, B:85:0x01df, B:86:0x01e4, B:87:0x01e7, B:37:0x009d, B:39:0x00a5, B:40:0x00a8, B:30:0x0078, B:52:0x00f3), top: B:155:0x0070, inners: #0, #1 }] */
                        /* JADX WARN: Code duplicated, block: B:75:0x019d A[Catch: fbb -> 0x01e8, TryCatch #2 {fbb -> 0x01e8, blocks: (B:28:0x0070, B:54:0x0100, B:56:0x011e, B:57:0x0122, B:59:0x0126, B:61:0x012e, B:63:0x013c, B:64:0x0141, B:66:0x014c, B:67:0x0151, B:69:0x0163, B:71:0x0171, B:73:0x017f, B:75:0x019d, B:76:0x01b3, B:78:0x01bd, B:80:0x01c5, B:81:0x01c8, B:83:0x01d2, B:34:0x0084, B:36:0x0093, B:43:0x00b8, B:48:0x00d5, B:50:0x00df, B:51:0x00e2, B:85:0x01df, B:86:0x01e4, B:87:0x01e7, B:37:0x009d, B:39:0x00a5, B:40:0x00a8, B:30:0x0078, B:52:0x00f3), top: B:155:0x0070, inners: #0, #1 }] */
                        /* JADX WARN: Code duplicated, block: B:78:0x01bd A[Catch: fbb -> 0x01e8, TryCatch #2 {fbb -> 0x01e8, blocks: (B:28:0x0070, B:54:0x0100, B:56:0x011e, B:57:0x0122, B:59:0x0126, B:61:0x012e, B:63:0x013c, B:64:0x0141, B:66:0x014c, B:67:0x0151, B:69:0x0163, B:71:0x0171, B:73:0x017f, B:75:0x019d, B:76:0x01b3, B:78:0x01bd, B:80:0x01c5, B:81:0x01c8, B:83:0x01d2, B:34:0x0084, B:36:0x0093, B:43:0x00b8, B:48:0x00d5, B:50:0x00df, B:51:0x00e2, B:85:0x01df, B:86:0x01e4, B:87:0x01e7, B:37:0x009d, B:39:0x00a5, B:40:0x00a8, B:30:0x0078, B:52:0x00f3), top: B:155:0x0070, inners: #0, #1 }] */
                        /* JADX WARN: Code duplicated, block: B:83:0x01d2 A[Catch: fbb -> 0x01e8, TryCatch #2 {fbb -> 0x01e8, blocks: (B:28:0x0070, B:54:0x0100, B:56:0x011e, B:57:0x0122, B:59:0x0126, B:61:0x012e, B:63:0x013c, B:64:0x0141, B:66:0x014c, B:67:0x0151, B:69:0x0163, B:71:0x0171, B:73:0x017f, B:75:0x019d, B:76:0x01b3, B:78:0x01bd, B:80:0x01c5, B:81:0x01c8, B:83:0x01d2, B:34:0x0084, B:36:0x0093, B:43:0x00b8, B:48:0x00d5, B:50:0x00df, B:51:0x00e2, B:85:0x01df, B:86:0x01e4, B:87:0x01e7, B:37:0x009d, B:39:0x00a5, B:40:0x00a8, B:30:0x0078, B:52:0x00f3), top: B:155:0x0070, inners: #0, #1 }] */
                        /* JADX WARN: Code duplicated, block: B:93:0x01f5  */
                        /* JADX WARN: Code duplicated, block: B:95:0x0200  */
                        /* JADX WARN: Code duplicated, block: B:97:0x0214  */
                        /* JADX WARN: Code restructure failed: missing block: B:111:0x0247, code lost:
                        
                            if (r0 != 0) goto L112;
                         */
                        @Override // defpackage.eui
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void a() throws java.lang.Exception {
                            /*
                                Method dump skipped, instruction units count: 785
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: defpackage.fbz.a():void");
                        }
                    };
                    if (feaVar != null) {
                        feaVar.p(euiVar);
                    } else {
                        euiVar.a();
                        feaVar = null;
                    }
                    if (!fcaVar.k.get()) {
                        fcaVar.T = j3;
                        return false;
                    }
                    if (feaVar != null) {
                        feaVar.s(i);
                    }
                    fcaVar.F.e += i3;
                    return true;
                } catch (defpackage.fbb e) {
                    e = e;
                    defpackage.fbb fbbVar = e;
                    defpackage.eqg eqgVar2 = fcaVar.N;
                    if (fcaVar.A) {
                        fcaVar.R();
                    }
                    throw fcaVar.h(fbbVar, eqgVar2, fbbVar.a, 5001);
                } catch (defpackage.fbd e2) {
                    e = e2;
                    defpackage.fbd fbdVar = e;
                    if (fcaVar.A) {
                        fcaVar.R();
                    }
                    throw fcaVar.h(fbdVar, eqgVar, fbdVar.b, 5002);
                }
            } catch (java.lang.RuntimeException e3) {
                throw e3;
            } catch (java.lang.Exception e4) {
                throw new java.lang.IllegalStateException(e4);
            }
        } catch (defpackage.fbb e5) {
            e = e5;
            fcaVar = this;
        } catch (defpackage.fbd e6) {
            e = e6;
            fcaVar = this;
        }
    }

    @Override // defpackage.fei
    protected final boolean ap(defpackage.eqg eqgVar) {
        R();
        return this.o.w(eqgVar);
    }

    @Override // defpackage.fei
    protected final void aq(java.lang.String str, long j, long j2) {
        ils ilsVar = this.q;
        java.lang.Object obj = ilsVar.b;
        if (obj != null) {
            ((android.os.Handler) obj).post(new defpackage.fay(ilsVar, 1));
        }
    }

    @Override // defpackage.fei
    protected final defpackage.exd ar(defpackage.hiz hizVar) throws java.lang.Throwable {
        java.lang.Object obj = hizVar.a;
        ahvr.ci(obj);
        defpackage.eqg eqgVar = new defpackage.eqg(new defpackage.eqf((defpackage.eqg) obj));
        hizVar.a = eqgVar;
        this.N = eqgVar;
        defpackage.exd exdVarAr = super.ar(hizVar);
        ils ilsVar = this.q;
        java.lang.Object obj2 = ilsVar.b;
        if (obj2 != null) {
            ((android.os.Handler) obj2).post(new defpackage.drn(ilsVar, 20));
        }
        return exdVarAr;
    }

    @Override // defpackage.fei
    protected final defpackage.klt as(defpackage.fee feeVar, defpackage.eqg eqgVar, android.media.MediaCrypto mediaCrypto, float f) {
        android.util.Pair pairA;
        defpackage.eqg[] eqgVarArrN = N();
        int length = eqgVarArrN.length;
        int iMax = eqgVar.q;
        boolean z = true;
        if (length != 1) {
            for (defpackage.eqg eqgVar2 : eqgVarArrN) {
                if (feeVar.b(eqgVar, eqgVar2).d != 0) {
                    iMax = java.lang.Math.max(iMax, eqgVar2.q);
                }
            }
        }
        this.L = iMax;
        java.lang.String str = feeVar.b;
        if (!str.equals("OMX.google.opus.decoder") && !str.equals("c2.android.opus.decoder") && !str.equals("OMX.google.vorbis.decoder") && !str.equals("c2.android.vorbis.decoder")) {
            z = false;
        }
        this.M = z;
        java.lang.String str2 = feeVar.d;
        android.media.MediaFormat mediaFormat = new android.media.MediaFormat();
        mediaFormat.setString("mime", str2);
        int i = eqgVar.H;
        mediaFormat.setInteger("channel-count", i);
        int i2 = eqgVar.J;
        mediaFormat.setInteger("sample-rate", i2);
        defpackage.hgu.aC(mediaFormat, eqgVar.s);
        defpackage.hgu.aB(mediaFormat, "max-input-size", iMax);
        mediaFormat.setInteger("priority", 0);
        if (f != -1.0f) {
            mediaFormat.setFloat("operating-rate", f);
        }
        java.lang.String str3 = eqgVar.p;
        if ("audio/ac4".equals(str3) && (pairA = defpackage.ete.a(eqgVar)) != null) {
            defpackage.hgu.aB(mediaFormat, "profile", ((java.lang.Integer) pairA.first).intValue());
            defpackage.hgu.aB(mediaFormat, "level", ((java.lang.Integer) pairA.second).intValue());
        }
        defpackage.fbw fbwVar = this.o;
        if (fbwVar.a(eum.F(4, i, i2)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (android.os.Build.VERSION.SDK_INT >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        if (android.os.Build.VERSION.SDK_INT >= 35) {
            mediaFormat.setInteger("importance", java.lang.Math.max(0, -this.R));
        }
        defpackage.eqg eqgVar3 = null;
        if (j$.util.Objects.equals(str3, "audio/iamf")) {
            defpackage.fax faxVar = fbwVar.m;
            defpackage.fai faiVar = faxVar instanceof defpackage.fbp ? ((defpackage.fbp) faxVar).b : null;
            int i3 = 12;
            if (faiVar == null) {
                defpackage.etr.f("MediaCodecAudioRenderer", "AudioCapabilities from the AudioSink are null, using default stereo output layout.");
                mediaFormat.setInteger("channel-mask", 12);
                mediaFormat.setInteger("max-output-channel-count", 2);
            } else {
                int iA = defpackage.fby.a(faiVar.d);
                if (iA != 0) {
                    i3 = iA;
                } else {
                    int iA2 = defpackage.fby.a(faiVar.c);
                    if (iA2 != 0) {
                        i3 = iA2;
                    }
                }
                int iBitCount = java.lang.Integer.bitCount(i3);
                mediaFormat.setInteger("channel-mask", i3);
                mediaFormat.setInteger("max-output-channel-count", iBitCount);
            }
        }
        ay(mediaFormat);
        if ("audio/raw".equals(feeVar.c) && !"audio/raw".equals(str3)) {
            eqgVar3 = eqgVar;
        }
        this.O = eqgVar3;
        return new defpackage.klt(feeVar, mediaFormat, eqgVar, (android.view.Surface) null, mediaCrypto, this.p);
    }

    @Override // defpackage.eyp
    public final defpackage.erc b() {
        return this.o.o;
    }

    @Override // defpackage.eyp
    public final void d(defpackage.erc ercVar) {
        defpackage.erc ercVar2 = new defpackage.erc(eum.a(ercVar.b, 0.1f, 8.0f), eum.a(ercVar.c, 0.1f, 8.0f));
        defpackage.fbw fbwVar = this.o;
        fbwVar.o = ercVar2;
        fbwVar.o(fbwVar.o);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x007b  */
    @Override // defpackage.fei, defpackage.ewz, defpackage.ezc
    public final void p(int i, java.lang.Object obj) {
        defpackage.hjx hjxVar;
        if (i == 2) {
            defpackage.fbw fbwVar = this.o;
            ahvr.ci(obj);
            float fFloatValue = ((java.lang.Float) obj).floatValue();
            if (fbwVar.z != fFloatValue) {
                fbwVar.z = fFloatValue;
                fbwVar.q();
                return;
            }
            return;
        }
        if (i == 3) {
            defpackage.epu epuVar = (defpackage.epu) obj;
            defpackage.fbw fbwVar2 = this.o;
            ahvr.ci(epuVar);
            if (fbwVar2.n.equals(epuVar)) {
                return;
            }
            fbwVar2.n = epuVar;
            fbwVar2.m();
            return;
        }
        if (i == 6) {
            defpackage.epv epvVar = (defpackage.epv) obj;
            defpackage.fbw fbwVar3 = this.o;
            ahvr.ci(epvVar);
            if (fbwVar3.I.equals(epvVar)) {
                return;
            }
            if (fbwVar3.R != null) {
                int i2 = fbwVar3.I.a;
            }
            fbwVar3.I = epvVar;
            return;
        }
        if (i == 12) {
            defpackage.fbw fbwVar4 = this.o;
            fbwVar4.J = (android.media.AudioDeviceInfo) obj;
            defpackage.fbn fbnVar = fbwVar4.R;
            if (fbnVar != null) {
                fbnVar.e(fbwVar4.J);
                return;
            }
            return;
        }
        if (i == 16) {
            ahvr.ci(obj);
            this.R = ((java.lang.Integer) obj).intValue();
            defpackage.fea feaVar = this.v;
            if (feaVar == null || android.os.Build.VERSION.SDK_INT < 35) {
                return;
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("importance", java.lang.Math.max(0, -this.R));
            feaVar.l(bundle);
            return;
        }
        if (i == 9) {
            defpackage.fbw fbwVar5 = this.o;
            ahvr.ci(obj);
            fbwVar5.p = ((java.lang.Boolean) obj).booleanValue();
            fbwVar5.o(fbwVar5.o);
            return;
        }
        if (i == 10) {
            ahvr.ci(obj);
            int iIntValue = ((java.lang.Integer) obj).intValue();
            defpackage.fbw fbwVar6 = this.o;
            if (fbwVar6.H) {
                if (fbwVar6.G == iIntValue) {
                    fbwVar6.H = false;
                    if (fbwVar6.G != iIntValue) {
                        fbwVar6.G = iIntValue;
                        fbwVar6.m();
                    }
                }
            } else if (fbwVar6.G != iIntValue) {
                fbwVar6.G = iIntValue;
                fbwVar6.m();
            }
            if (android.os.Build.VERSION.SDK_INT < 35 || (hjxVar = this.p) == null) {
                return;
            }
            hjxVar.e(iIntValue);
            return;
        }
        if (i == 19) {
            defpackage.fbw fbwVar7 = this.o;
            ahvr.ci(obj);
            int iB = defpackage.fbw.b(((java.lang.Integer) obj).intValue());
            if (fbwVar7.K != iB) {
                fbwVar7.K = iB;
                fbwVar7.m();
                return;
            }
            return;
        }
        if (i != 20) {
            super.p(i, obj);
            return;
        }
        defpackage.fbw fbwVar8 = this.o;
        ahvr.ci(obj);
        defpackage.fax faxVar = (defpackage.fax) obj;
        if (faxVar.equals(fbwVar8.m)) {
            return;
        }
        fbwVar8.m.c();
        fbwVar8.m = faxVar;
        rai raiVar = fbwVar8.X;
        if (raiVar != null) {
            faxVar.g(raiVar);
        }
        fbwVar8.m();
    }

    @Override // defpackage.fei, defpackage.ewz
    protected final void s() {
        this.Q = true;
        this.N = null;
        this.W = null;
        aO();
        this.T = -9223372036854775807L;
        this.n = false;
        try {
            this.o.f(true);
            super.s();
        } catch (java.lang.Throwable th) {
            super.s();
            throw th;
        } finally {
            this.q.k(this.F);
        }
    }

    @Override // defpackage.fei, defpackage.ewz
    protected final void t(boolean z, boolean z2) {
        super.t(z, z2);
        ils ilsVar = this.q;
        java.lang.Object obj = ilsVar.b;
        if (obj != null) {
            ((android.os.Handler) obj).post(new defpackage.drn(ilsVar, 13));
        }
        R();
        defpackage.fbw fbwVar = this.o;
        fbwVar.i = k();
        fbwVar.m.d(g());
        fbwVar.V = new rai(this);
    }

    @Override // defpackage.fei, defpackage.ewz
    protected final void u(long j, boolean z, boolean z2) throws java.lang.Throwable {
        super.u(j, z, z2);
        aO();
        this.o.f(true);
        this.P = j;
        this.T = -9223372036854775807L;
        this.U = -9223372036854775807L;
        this.V = false;
        this.m = false;
        this.n = false;
        this.l = true;
    }

    @Override // defpackage.ewz
    protected final void v() {
        defpackage.hjx hjxVar;
        this.o.m.c();
        if (android.os.Build.VERSION.SDK_INT < 35 || (hjxVar = this.p) == null) {
            return;
        }
        ((java.util.HashSet) hjxVar.b).clear();
        java.lang.Object obj = hjxVar.a;
        if (obj != null) {
            mp$.ExternalSyntheticApiModelOutline1.m(mp$.ExternalSyntheticApiModelOutline1.m(obj));
        }
    }

    @Override // defpackage.fei, defpackage.ewz
    protected final void w() {
        this.m = false;
        this.n = false;
        this.T = -9223372036854775807L;
        this.N = null;
        try {
            super.w();
        } finally {
            if (this.Q) {
                this.Q = false;
                this.o.n();
            }
        }
    }

    @Override // defpackage.ewz
    protected final void x() {
        this.o.j();
        this.S = true;
    }

    @Override // defpackage.ewz
    protected final void y() {
        aP();
        this.S = false;
        defpackage.fbw fbwVar = this.o;
        fbwVar.F = false;
        if (fbwVar.v()) {
            defpackage.fbn fbnVar = fbwVar.R;
            defpackage.fbq fbqVar = fbnVar.h;
            fbqVar.e();
            if (fbqVar.q == -9223372036854775807L) {
                fbqVar.g.c(0);
            }
            fbqVar.s = fbqVar.a();
            if (!fbnVar.l || fbnVar.f()) {
                fbnVar.d.pause();
            }
        }
        this.n = false;
        this.U = -9223372036854775807L;
        this.V = false;
    }

    @Override // defpackage.ewz, defpackage.ezf
    public final defpackage.eyp i() {
        return this;
    }
}
