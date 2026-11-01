package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cbb implements defpackage.cdl, defpackage.cay {
    private final defpackage.adw A;
    public final defpackage.caz a;
    public final java.util.concurrent.atomic.AtomicReference b = new java.util.concurrent.atomic.AtomicReference(null);
    public final java.lang.Object c = new java.lang.Object();
    public final java.util.Set d;
    public final defpackage.ced e;
    public int f;
    public final defpackage.ckj g;
    public ceb h;
    public ccy i;
    public defpackage.cbb j;
    public int k;
    public final defpackage.cjh l;
    public final defpackage.ccb m;
    public defpackage.cbg n;
    public final defpackage.adw o;
    public final defpackage.adw p;
    public defpackage.adw q;
    public final defpackage.den r;
    private final defpackage.cah s;
    private final defpackage.can t;
    private final defpackage.can u;
    private boolean v;
    private int w;
    private defpackage.aonn x;
    private final defpackage.ady y;
    private final defpackage.ady z;

    public cbb(defpackage.caz cazVar, defpackage.cah cahVar) {
        this.a = cazVar;
        this.s = cahVar;
        defpackage.ady adyVar = new defpackage.ady(6);
        java.util.Set adlVar = adyVar.e;
        if (adlVar == null) {
            adlVar = new defpackage.adl(adyVar);
            adyVar.e = adlVar;
        }
        java.util.Set set = adlVar;
        this.d = set;
        defpackage.cfm cfmVar = new defpackage.cfm();
        if (cazVar.l()) {
            cfmVar.a();
        }
        if (cazVar.n()) {
            cfmVar.b();
        }
        this.e = cfmVar;
        long[] jArr = defpackage.adx.a;
        this.o = new defpackage.adw(6);
        this.y = new defpackage.ady(6);
        this.z = new defpackage.ady(6);
        this.p = new defpackage.adw(6);
        this.g = new defpackage.cli(this, 1);
        defpackage.can canVar = new defpackage.can(null);
        this.t = canVar;
        defpackage.can canVar2 = new defpackage.can(null);
        this.u = canVar2;
        this.A = new defpackage.adw(6);
        this.q = new defpackage.adw(6);
        defpackage.den denVar = new defpackage.den(cazVar);
        this.r = denVar;
        this.l = new defpackage.cjh();
        defpackage.cbt cbtVar = new defpackage.cbt(cahVar, cazVar, cfmVar, set, canVar, canVar2, denVar, this);
        cazVar.h(cbtVar);
        this.m = cbtVar;
        this.x = defpackage.cao.a;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00f2 A[PHI: r22 r25 r28 r29
      0x00f2: PHI (r22v8 long) = (r22v7 long), (r22v10 long) binds: [B:43:0x00f0, B:37:0x00d4] A[DONT_GENERATE, DONT_INLINE]
      0x00f2: PHI (r25v4 int) = (r25v3 int), (r25v7 int) binds: [B:43:0x00f0, B:37:0x00d4] A[DONT_GENERATE, DONT_INLINE]
      0x00f2: PHI (r28v6 long[]) = (r28v5 long[]), (r28v9 long[]) binds: [B:43:0x00f0, B:37:0x00d4] A[DONT_GENERATE, DONT_INLINE]
      0x00f2: PHI (r29v3 int) = (r29v2 int), (r29v6 int) binds: [B:43:0x00f0, B:37:0x00d4] A[DONT_GENERATE, DONT_INLINE]] */
    private final void A() {
        long j;
        char c;
        long j2;
        long j3;
        long[] jArr;
        int i;
        long[] jArr2;
        int i2;
        long j4;
        char c2;
        long j5;
        int i3;
        int i4;
        long[] jArr3;
        int i5;
        int i6;
        defpackage.adw adwVar = this.p;
        long[] jArr4 = adwVar.a;
        int length = jArr4.length - 2;
        long j6 = 255;
        char c3 = 7;
        long j7 = -9187201950435737472L;
        int i7 = 8;
        if (length >= 0) {
            int i8 = 0;
            while (true) {
                long j8 = jArr4[i8];
                j3 = 128;
                if ((((~j8) << c3) & j8 & j7) != j7) {
                    int i9 = 8 - ((~(i8 - length)) >>> 31);
                    int i10 = 0;
                    while (i10 < i9) {
                        if ((j8 & j6) < 128) {
                            j4 = j6;
                            int i11 = (i8 << 3) + i10;
                            java.lang.Object obj = adwVar.b[i11];
                            java.lang.Object obj2 = adwVar.c[i11];
                            c2 = c3;
                            if (obj2 instanceof defpackage.ady) {
                                if (obj2 == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                                    obj2 = null;
                                }
                                defpackage.ady adyVar = (defpackage.ady) obj2;
                                java.lang.Object[] objArr = adyVar.b;
                                j5 = j7;
                                long[] jArr5 = adyVar.a;
                                int length2 = jArr5.length - 2;
                                if (length2 >= 0) {
                                    int i12 = i7;
                                    i3 = i8;
                                    int i13 = 0;
                                    while (true) {
                                        long j9 = jArr5[i13];
                                        java.lang.Object[] objArr2 = objArr;
                                        long[] jArr6 = jArr5;
                                        if ((((~j9) << c2) & j9 & j5) != j5) {
                                            int i14 = 8 - ((~(i13 - length2)) >>> 31);
                                            int i15 = 0;
                                            while (i15 < i14) {
                                                if ((j9 & j4) < 128) {
                                                    jArr3 = jArr4;
                                                    int i16 = (i13 << 3) + i15;
                                                    i5 = i10;
                                                    i6 = i15;
                                                    if (!defpackage.adw.f(this.o, (defpackage.ckg) objArr2[i16])) {
                                                        adyVar.i(i16);
                                                    }
                                                } else {
                                                    jArr3 = jArr4;
                                                    i5 = i10;
                                                    i6 = i15;
                                                }
                                                j9 >>= i12;
                                                i15 = i6 + 1;
                                                jArr4 = jArr3;
                                                i10 = i5;
                                            }
                                            jArr2 = jArr4;
                                            i2 = i10;
                                            if (i14 != i12) {
                                                break;
                                            }
                                        } else {
                                            jArr2 = jArr4;
                                            i2 = i10;
                                        }
                                        if (i13 == length2) {
                                            break;
                                        }
                                        i13++;
                                        objArr = objArr2;
                                        jArr5 = jArr6;
                                        jArr4 = jArr2;
                                        i10 = i2;
                                        i12 = 8;
                                    }
                                } else {
                                    jArr2 = jArr4;
                                    i2 = i10;
                                    i3 = i8;
                                }
                                if (adyVar.b()) {
                                    adwVar.j(i11);
                                }
                            } else {
                                jArr2 = jArr4;
                                i2 = i10;
                                j5 = j7;
                                i3 = i8;
                                if (obj2 == null) {
                                    defpackage.aooh.h("null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                    obj2 = null;
                                }
                                if (!defpackage.adw.f(this.o, (defpackage.ckg) obj2)) {
                                    adwVar.j(i11);
                                }
                            }
                            i4 = 8;
                        } else {
                            jArr2 = jArr4;
                            i2 = i10;
                            j4 = j6;
                            c2 = c3;
                            j5 = j7;
                            i3 = i8;
                            i4 = i7;
                        }
                        j8 >>= i4;
                        i10 = i2 + 1;
                        i7 = i4;
                        c3 = c2;
                        j6 = j4;
                        j7 = j5;
                        i8 = i3;
                        jArr4 = jArr2;
                    }
                    jArr = jArr4;
                    j = j6;
                    c = c3;
                    j2 = j7;
                    int i17 = i8;
                    if (i9 != i7) {
                        break;
                    } else {
                        i = i17;
                    }
                } else {
                    jArr = jArr4;
                    j = j6;
                    c = c3;
                    j2 = j7;
                    i = i8;
                }
                if (i == length) {
                    break;
                }
                i8 = i + 1;
                c3 = c;
                j6 = j;
                j7 = j2;
                jArr4 = jArr;
                i7 = 8;
            }
        } else {
            j = 255;
            c = 7;
            j2 = -9187201950435737472L;
            j3 = 128;
        }
        defpackage.ady adyVar2 = this.z;
        if (!adyVar2.c()) {
            return;
        }
        java.lang.Object[] objArr3 = adyVar2.b;
        long[] jArr7 = adyVar2.a;
        int length3 = jArr7.length - 2;
        if (length3 < 0) {
            return;
        }
        int i18 = 0;
        while (true) {
            long j10 = jArr7[i18];
            if ((((~j10) << c) & j10 & j2) != j2) {
                int i19 = 8 - ((~(i18 - length3)) >>> 31);
                for (int i20 = 0; i20 < i19; i20++) {
                    if ((j10 & j) < j3) {
                        int i21 = (i18 << 3) + i20;
                        if (!((defpackage.cdk) objArr3[i21]).q()) {
                            adyVar2.i(i21);
                        }
                    }
                    j10 >>= 8;
                }
                if (i19 != 8) {
                    return;
                }
            }
            if (i18 == length3) {
                return;
            } else {
                i18++;
            }
        }
    }

    private final void B(defpackage.aonn aonnVar) {
        this.x = aonnVar;
        this.a.q(this, aonnVar);
    }

    private final void C(java.lang.Object obj) {
        int i;
        java.lang.Object objA = this.o.a(obj);
        if (objA == null) {
            return;
        }
        if (!(objA instanceof defpackage.ady)) {
            defpackage.cdk cdkVar = (defpackage.cdk) objA;
            if (cdkVar.s(obj) != 4 || (obj instanceof defpackage.ckg)) {
                return;
            }
            defpackage.cfg.a(this.A, obj, cdkVar);
            return;
        }
        defpackage.ady adyVar = (defpackage.ady) objA;
        java.lang.Object[] objArr = adyVar.b;
        long[] jArr = adyVar.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j = jArr[i2];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = i2 - length;
                int i4 = 0;
                while (true) {
                    i = 8 - ((~i3) >>> 31);
                    if (i4 >= i) {
                        break;
                    }
                    if ((255 & j) < 128) {
                        defpackage.cdk cdkVar2 = (defpackage.cdk) objArr[(i2 << 3) + i4];
                        if (cdkVar2.s(obj) == 4 && !(obj instanceof defpackage.ckg)) {
                            defpackage.cfg.a(this.A, obj, cdkVar2);
                        }
                    }
                    j >>= 8;
                    i4++;
                }
                if (i != 8) {
                    return;
                }
            }
            if (i2 == length) {
                return;
            } else {
                i2++;
            }
        }
    }

    private final boolean D(defpackage.cdk cdkVar, java.lang.Object obj) {
        return u() && this.m.ae(cdkVar, obj);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0048  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x00b7 A[Catch: all -> 0x00dc, LOOP:0: B:36:0x0080->B:48:0x00b7, LOOP_END, TryCatch #0 {, blocks: (B:4:0x0009, B:6:0x000f, B:8:0x001a, B:9:0x001f, B:11:0x0026, B:12:0x002b, B:14:0x0038, B:19:0x004b, B:25:0x0056, B:26:0x005e, B:28:0x0064, B:29:0x006a, B:31:0x0070, B:33:0x0074, B:36:0x0080, B:38:0x0090, B:39:0x0093, B:41:0x009c, B:43:0x00a6, B:45:0x00af, B:48:0x00b7, B:49:0x00ba, B:51:0x00be), top: B:63:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00be A[Catch: all -> 0x00dc, EDGE_INSN: B:51:0x00be->B:52:0x00c3 BREAK  A[LOOP:0: B:36:0x0080->B:48:0x00b7], TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0009, B:6:0x000f, B:8:0x001a, B:9:0x001f, B:11:0x0026, B:12:0x002b, B:14:0x0038, B:19:0x004b, B:25:0x0056, B:26:0x005e, B:28:0x0064, B:29:0x006a, B:31:0x0070, B:33:0x0074, B:36:0x0080, B:38:0x0090, B:39:0x0093, B:41:0x009c, B:43:0x00a6, B:45:0x00af, B:48:0x00b7, B:49:0x00ba, B:51:0x00be), top: B:63:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x00be A[SYNTHETIC] */
    private final int E(defpackage.cdk cdkVar, defpackage.cfh cfhVar, java.lang.Object obj) {
        synchronized (this.c) {
            defpackage.cbb cbbVar = this.j;
            if (cbbVar != null) {
                defpackage.ced cedVar = this.e;
                int i = this.k;
                if (((defpackage.cfm) cedVar).f) {
                    defpackage.cax.b("Writer is active");
                }
                if (i >= ((defpackage.cfm) cedVar).b) {
                    defpackage.cax.b("Invalid group index");
                }
                defpackage.cfh cfhVarC = defpackage.cfd.c(cfhVar);
                if (((defpackage.cfm) cedVar).h(cfhVarC)) {
                    int i2 = ((defpackage.cfm) cedVar).a[(i * 5) + 3] + i;
                    int i3 = cfhVarC.a;
                    if (i > i3 || i3 >= i2) {
                        cbbVar = null;
                    }
                } else {
                    cbbVar = null;
                }
            } else {
                cbbVar = null;
            }
            if (cbbVar == null) {
                if (!D(cdkVar, obj)) {
                    if (obj != null) {
                        boolean z = obj instanceof defpackage.ckg;
                        defpackage.adw adwVar = this.q;
                        if (z) {
                            java.lang.Object objA = adwVar.a(cdkVar);
                            if (objA != null) {
                                if (!(objA instanceof defpackage.ady)) {
                                    if (objA != defpackage.cea.a) {
                                        defpackage.cfg.a(this.q, cdkVar, obj);
                                        break;
                                    }
                                } else {
                                    defpackage.ady adyVar = (defpackage.ady) objA;
                                    java.lang.Object[] objArr = adyVar.b;
                                    long[] jArr = adyVar.a;
                                    int length = jArr.length - 2;
                                    if (length < 0) {
                                        defpackage.cfg.a(this.q, cdkVar, obj);
                                        break;
                                    }
                                    int i4 = 0;
                                    loop0: while (true) {
                                        long j = jArr[i4];
                                        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                                            if (i4 == length) {
                                                defpackage.cfg.a(this.q, cdkVar, obj);
                                                break;
                                            }
                                            i4++;
                                        } else {
                                            int i5 = i4 - length;
                                            int i6 = 0;
                                            while (true) {
                                                int i7 = 8 - ((~i5) >>> 31);
                                                if (i6 >= i7) {
                                                    if (i7 == 8) {
                                                        if (i4 == length) {
                                                            i4++;
                                                        }
                                                    }
                                                    defpackage.cfg.a(this.q, cdkVar, obj);
                                                    break;
                                                }
                                                if ((j & 255) < 128 && objArr[(i4 << 3) + i6] == defpackage.cea.a) {
                                                    break loop0;
                                                }
                                                j >>= 8;
                                                i6++;
                                            }
                                        }
                                    }
                                }
                            } else {
                                defpackage.cfg.a(this.q, cdkVar, obj);
                                break;
                            }
                        } else {
                            adwVar.n(cdkVar, defpackage.cea.a);
                        }
                    } else {
                        this.q.n(cdkVar, defpackage.cea.a);
                    }
                } else {
                    return 4;
                }
            }
            if (cbbVar != null) {
                return cbbVar.E(cdkVar, cfhVar, obj);
            }
            this.a.r(this);
            return u() ? 3 : 2;
        }
    }

    private final void y(java.lang.Object obj, boolean z) {
        int i;
        java.lang.Object objA = this.o.a(obj);
        if (objA == null) {
            return;
        }
        if (!(objA instanceof defpackage.ady)) {
            defpackage.cdk cdkVar = (defpackage.cdk) objA;
            if (defpackage.cfg.c(this.A, obj, cdkVar) || cdkVar.s(obj) == 1) {
                return;
            }
            if (!cdkVar.q() || z) {
                this.y.j(cdkVar);
                return;
            } else {
                this.z.j(cdkVar);
                return;
            }
        }
        defpackage.ady adyVar = (defpackage.ady) objA;
        java.lang.Object[] objArr = adyVar.b;
        long[] jArr = adyVar.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j = jArr[i2];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = i2 - length;
                int i4 = 0;
                while (true) {
                    i = 8 - ((~i3) >>> 31);
                    if (i4 >= i) {
                        break;
                    }
                    if ((255 & j) < 128) {
                        defpackage.cdk cdkVar2 = (defpackage.cdk) objArr[(i2 << 3) + i4];
                        if (!defpackage.cfg.c(this.A, obj, cdkVar2) && cdkVar2.s(obj) != 1) {
                            if (!cdkVar2.q() || z) {
                                this.y.j(cdkVar2);
                            } else {
                                this.z.j(cdkVar2);
                            }
                        }
                    }
                    j >>= 8;
                    i4++;
                }
                if (i != 8) {
                    return;
                }
            }
            if (i2 == length) {
                return;
            } else {
                i2++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:120:0x0167 A[EDGE_INSN: B:120:0x0167->B:83:0x0167 BREAK  A[LOOP:0: B:37:0x0083->B:82:0x0162], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:0x0120 A[EDGE_INSN: B:124:0x0120->B:67:0x0120 BREAK  A[LOOP:2: B:51:0x00d1->B:65:0x0113], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0111 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x0113 A[Catch: all -> 0x016e, LOOP:2: B:51:0x00d1->B:65:0x0113, LOOP_END, TryCatch #4 {all -> 0x016e, blocks: (B:34:0x0077, B:37:0x0083, B:39:0x0093, B:40:0x0096, B:42:0x009f, B:44:0x00a9, B:48:0x00be, B:49:0x00c2, B:51:0x00d1, B:53:0x00e1, B:55:0x00eb, B:57:0x00f1, B:59:0x0101, B:61:0x0107, B:67:0x0120, B:75:0x013f, B:78:0x0150, B:65:0x0113, B:72:0x0133, B:73:0x0137, B:82:0x0162, B:83:0x0167), top: B:117:0x0077, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x0160 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x0162 A[Catch: all -> 0x016e, LOOP:0: B:37:0x0083->B:82:0x0162, LOOP_END, TryCatch #4 {all -> 0x016e, blocks: (B:34:0x0077, B:37:0x0083, B:39:0x0093, B:40:0x0096, B:42:0x009f, B:44:0x00a9, B:48:0x00be, B:49:0x00c2, B:51:0x00d1, B:53:0x00e1, B:55:0x00eb, B:57:0x00f1, B:59:0x0101, B:61:0x0107, B:67:0x0120, B:75:0x013f, B:78:0x0150, B:65:0x0113, B:72:0x0133, B:73:0x0137, B:82:0x0162, B:83:0x0167), top: B:117:0x0077, outer: #1 }] */
    private final void z(defpackage.can canVar) throws java.lang.Throwable {
        int i;
        long j;
        int i2;
        int i3;
        char c;
        long j2;
        char c2;
        int i4;
        this.m.P();
        defpackage.cjh cjhVar = this.l;
        cjhVar.i(this.d, null);
        try {
            try {
                if (!canVar.k()) {
                    ccy ccyVar = this.i;
                    cdt cdtVar = ccyVar != null ? ccyVar.g : this.s;
                    android.os.Trace.beginSection(defpackage.aooh.n(cdtVar, ccyVar != null ? ccyVar.g : null) ? "Compose:recordChanges" : "Compose:applyChanges");
                    try {
                        ccy ccyVar2 = this.i;
                        defpackage.cjh cjhVar2 = ccyVar2 != null ? ccyVar2.f : this.l;
                        defpackage.ced cedVar = this.e;
                        this.m.P();
                        defpackage.cfp cfpVarF = ((defpackage.cfm) cedVar).f();
                        int i5 = 0;
                        try {
                            canVar.l(cdtVar, cfpVarF, cjhVar2, null);
                            cfpVarF.x(true);
                            cdtVar.f();
                            android.os.Trace.endSection();
                            defpackage.cjh cjhVar3 = this.l;
                            cjhVar3.c();
                            cjhVar3.d();
                            if (this.v) {
                                android.os.Trace.beginSection("Compose:unobserve");
                                try {
                                    this.v = false;
                                    defpackage.adw adwVar = this.o;
                                    long[] jArr = adwVar.a;
                                    int length = jArr.length - 2;
                                    if (length >= 0) {
                                        int i6 = 0;
                                        while (true) {
                                            long j3 = jArr[i6];
                                            char c3 = 7;
                                            long j4 = -9187201950435737472L;
                                            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) == -9187201950435737472L) {
                                                if (i6 != length) {
                                                    break;
                                                    break;
                                                } else {
                                                    i6++;
                                                    i5 = 0;
                                                }
                                            } else {
                                                int i7 = i6 - length;
                                                int i8 = i5;
                                                while (true) {
                                                    int i9 = 8;
                                                    i = 8 - ((~i7) >>> 31);
                                                    if (i8 >= i) {
                                                        break;
                                                    }
                                                    if ((j3 & 255) < 128) {
                                                        int i10 = (i6 << 3) + i8;
                                                        java.lang.Object obj = adwVar.b[i10];
                                                        java.lang.Object obj2 = adwVar.c[i10];
                                                        c = c3;
                                                        if (obj2 instanceof defpackage.ady) {
                                                            if (obj2 == null) {
                                                                defpackage.aooh.h("null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                                                                obj2 = null;
                                                            }
                                                            defpackage.ady adyVar = (defpackage.ady) obj2;
                                                            java.lang.Object[] objArr = adyVar.b;
                                                            j2 = j4;
                                                            long[] jArr2 = adyVar.a;
                                                            int length2 = jArr2.length - 2;
                                                            j = j3;
                                                            if (length2 >= 0) {
                                                                while (true) {
                                                                    long j5 = jArr2[i5];
                                                                    i2 = i7;
                                                                    i3 = i8;
                                                                    if ((((~j5) << c) & j5 & j2) == j2) {
                                                                        if (i5 != length2) {
                                                                            break;
                                                                            break;
                                                                        }
                                                                        i5++;
                                                                        i7 = i2;
                                                                        i8 = i3;
                                                                        i9 = 8;
                                                                    } else {
                                                                        int i11 = 8 - ((~(i5 - length2)) >>> 31);
                                                                        int i12 = 0;
                                                                        while (i12 < i11) {
                                                                            if ((j5 & 255) < 128) {
                                                                                i4 = i9;
                                                                                int i13 = (i5 << 3) + i12;
                                                                                if (!((defpackage.cdk) objArr[i13]).p()) {
                                                                                    adyVar.i(i13);
                                                                                }
                                                                            } else {
                                                                                i4 = i9;
                                                                            }
                                                                            j5 >>= i4;
                                                                            i12++;
                                                                            i9 = i4;
                                                                        }
                                                                        if (i11 != i9) {
                                                                            break;
                                                                        }
                                                                        if (i5 != length2) {
                                                                            break;
                                                                        }
                                                                        i5++;
                                                                        i7 = i2;
                                                                        i8 = i3;
                                                                        i9 = 8;
                                                                    }
                                                                }
                                                            } else {
                                                                i2 = i7;
                                                                i3 = i8;
                                                            }
                                                            if (adyVar.b()) {
                                                                adwVar.j(i10);
                                                            }
                                                        } else {
                                                            j = j3;
                                                            i2 = i7;
                                                            i3 = i8;
                                                            j2 = j4;
                                                            if (obj2 == null) {
                                                                defpackage.aooh.h("null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                                                obj2 = null;
                                                            }
                                                            if (!((defpackage.cdk) obj2).p()) {
                                                                adwVar.j(i10);
                                                            }
                                                        }
                                                        c2 = '\b';
                                                    } else {
                                                        j = j3;
                                                        i2 = i7;
                                                        i3 = i8;
                                                        c = c3;
                                                        j2 = j4;
                                                        c2 = '\b';
                                                    }
                                                    j3 = j >> c2;
                                                    i8 = i3 + 1;
                                                    c3 = c;
                                                    j4 = j2;
                                                    i7 = i2;
                                                    i5 = 0;
                                                }
                                                if (i != 8) {
                                                    break;
                                                }
                                                if (i6 != length) {
                                                    break;
                                                }
                                                i6++;
                                                i5 = 0;
                                            }
                                        }
                                    }
                                    A();
                                    android.os.Trace.endSection();
                                } catch (java.lang.Throwable th) {
                                    android.os.Trace.endSection();
                                    throw th;
                                }
                            }
                            if (this.u.k() && this.i == null) {
                                cjhVar = this.l;
                                cjhVar.b();
                            }
                        } catch (java.lang.Throwable th2) {
                            cfpVarF.x(false);
                            throw th2;
                        }
                    } catch (java.lang.Throwable th3) {
                        android.os.Trace.endSection();
                        throw th3;
                    }
                } else if (this.u.k() && this.i == null) {
                    cjhVar.b();
                }
                this.l.a();
            } catch (java.lang.Throwable th4) {
                th = th4;
                if (this.u.k() && this.i == null) {
                    this.l.b();
                }
                this.l.a();
                throw th;
            }
        } catch (java.lang.Throwable th5) {
            th = th5;
            this.l.a();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:41:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:51:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:53:0x0102  */
    /* JADX WARN: Code duplicated, block: B:55:0x0112  */
    /* JADX WARN: Code duplicated, block: B:56:0x011c  */
    /* JADX WARN: Code duplicated, block: B:58:0x0122  */
    /* JADX WARN: Code duplicated, block: B:63:0x0132  */
    /* JADX WARN: Code duplicated, block: B:65:0x0138 A[LOOP:2: B:47:0x00e4->B:65:0x0138, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:67:0x0147  */
    /* JADX WARN: Code duplicated, block: B:69:0x014b  */
    /* JADX WARN: Code duplicated, block: B:79:0x013e A[EDGE_INSN: B:79:0x013e->B:66:0x013e BREAK  A[LOOP:2: B:47:0x00e4->B:65:0x0138], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x013e A[EDGE_INSN: B:80:0x013e->B:66:0x013e BREAK  A[LOOP:2: B:47:0x00e4->B:65:0x0138], SYNTHETIC] */
    @Override // defpackage.cdl
    public final void a(java.lang.Object obj) {
        defpackage.cdk cdkVarO;
        defpackage.adw adwVar;
        java.lang.Object[] objArr;
        int[] iArr;
        long[] jArr;
        int length;
        int i;
        long j;
        int i2;
        long[] jArr2;
        int i3;
        int i4;
        int i5;
        defpackage.clr clrVar;
        defpackage.cbg cbgVar = this.n;
        int i6 = 8;
        if (cbgVar == null) {
            defpackage.ccb ccbVar = this.m;
            if (((defpackage.cbt) ccbVar).m > 0 || this.f != 0 || (cdkVarO = ccbVar.O()) == null) {
                return;
            }
            cdkVarO.r();
            if ((cdkVarO.b & 32) != 0) {
                if (obj instanceof defpackage.cls) {
                    ((defpackage.cls) obj).i(1);
                }
                defpackage.cfg.a(this.o, obj, cdkVarO);
                if (obj instanceof defpackage.cbk) {
                    defpackage.cbj cbjVarF = ((defpackage.cbk) obj).f();
                    adwVar = this.p;
                    defpackage.cfg.b(adwVar, obj);
                    defpackage.ado adoVar = cbjVarF.d;
                    objArr = adoVar.b;
                    iArr = adoVar.c;
                    jArr = adoVar.a;
                    length = jArr.length - 2;
                    if (length >= 0) {
                        i = 0;
                        while (true) {
                            j = jArr[i];
                            i2 = i6;
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                i4 = 8 - ((~(i - length)) >>> 31);
                                i5 = 0;
                                while (i5 < i4) {
                                    if ((j & 255) < 128) {
                                        int i7 = (i << 3) + i5;
                                        java.lang.Object obj2 = objArr[i7];
                                        int i8 = iArr[i7];
                                        clrVar = (defpackage.clr) obj2;
                                        if (clrVar instanceof defpackage.cls) {
                                            ((defpackage.cls) clrVar).i(1);
                                        }
                                        defpackage.cfg.a(adwVar, clrVar, obj);
                                    } else {
                                        jArr = jArr;
                                    }
                                    j >>= i2;
                                    i5++;
                                    jArr = jArr;
                                }
                                jArr2 = jArr;
                                i3 = i2;
                                if (i4 == i3) {
                                    break;
                                }
                            } else {
                                jArr2 = jArr;
                                i3 = i2;
                            }
                            if (i != length) {
                                break;
                            }
                            i++;
                            i6 = i3;
                            jArr = jArr2;
                        }
                    }
                    cdkVarO.b((defpackage.ckg) obj, cbjVarF.e);
                } else if (obj instanceof defpackage.cbg) {
                    defpackage.cfg.b(this.p, obj);
                }
            } else {
                defpackage.ado adoVar2 = cdkVarO.f;
                if (adoVar2 == null) {
                    adoVar2 = new defpackage.ado(6);
                    cdkVarO.f = adoVar2;
                }
                if (adoVar2.i(obj, cdkVarO.d) != cdkVarO.d) {
                    if (obj instanceof defpackage.cls) {
                        ((defpackage.cls) obj).i(1);
                    }
                    defpackage.cfg.a(this.o, obj, cdkVarO);
                    if (obj instanceof defpackage.cbk) {
                        defpackage.cbj cbjVarF2 = ((defpackage.cbk) obj).f();
                        adwVar = this.p;
                        defpackage.cfg.b(adwVar, obj);
                        defpackage.ado adoVar3 = cbjVarF2.d;
                        objArr = adoVar3.b;
                        iArr = adoVar3.c;
                        jArr = adoVar3.a;
                        length = jArr.length - 2;
                        if (length >= 0) {
                            i = 0;
                            while (true) {
                                j = jArr[i];
                                i2 = i6;
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    i4 = 8 - ((~(i - length)) >>> 31);
                                    i5 = 0;
                                    while (i5 < i4) {
                                        if ((j & 255) < 128) {
                                            int i9 = (i << 3) + i5;
                                            java.lang.Object obj3 = objArr[i9];
                                            int i10 = iArr[i9];
                                            clrVar = (defpackage.clr) obj3;
                                            if (clrVar instanceof defpackage.cls) {
                                                ((defpackage.cls) clrVar).i(1);
                                            }
                                            defpackage.cfg.a(adwVar, clrVar, obj);
                                        } else {
                                            jArr = jArr;
                                        }
                                        j >>= i2;
                                        i5++;
                                        jArr = jArr;
                                    }
                                    jArr2 = jArr;
                                    i3 = i2;
                                    if (i4 == i3) {
                                        break;
                                        break;
                                    }
                                } else {
                                    jArr2 = jArr;
                                    i3 = i2;
                                }
                                if (i != length) {
                                    break;
                                    break;
                                } else {
                                    i++;
                                    i6 = i3;
                                    jArr = jArr2;
                                }
                            }
                        }
                        cdkVarO.b((defpackage.ckg) obj, cbjVarF2.e);
                    } else if (obj instanceof defpackage.cbg) {
                        defpackage.cfg.b(this.p, obj);
                    }
                }
            }
            if (obj instanceof defpackage.cbg) {
                this.n = (defpackage.cbg) obj;
                return;
            }
            return;
        }
        if (obj instanceof defpackage.cls) {
            ((defpackage.cls) obj).i(1);
        }
        defpackage.adw adwVar2 = this.p;
        defpackage.cfg.a(adwVar2, obj, cbgVar);
        if (!(obj instanceof defpackage.cbk)) {
            return;
        }
        defpackage.ado adoVar4 = ((defpackage.cbk) obj).f().d;
        java.lang.Object[] objArr2 = adoVar4.b;
        int[] iArr2 = adoVar4.c;
        long[] jArr3 = adoVar4.a;
        int length2 = jArr3.length - 2;
        if (length2 < 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            long j2 = jArr3[i11];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i11 - length2)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((j2 & 255) < 128) {
                        int i14 = (i11 << 3) + i13;
                        java.lang.Object obj4 = objArr2[i14];
                        int i15 = iArr2[i14];
                        defpackage.clr clrVar2 = (defpackage.clr) obj4;
                        if (clrVar2 instanceof defpackage.cls) {
                            ((defpackage.cls) clrVar2).i(1);
                        }
                        defpackage.cfg.a(adwVar2, clrVar2, cbgVar);
                    }
                    j2 >>= 8;
                }
                if (i12 != 8) {
                    return;
                }
            }
            if (i11 == length2) {
                return;
            } else {
                i11++;
            }
        }
    }

    @Override // defpackage.cdl
    public final void b() {
        this.v = true;
    }

    @Override // defpackage.cdl
    public final int c(defpackage.cdk cdkVar, java.lang.Object obj) {
        defpackage.cbb cbbVar;
        if ((cdkVar.b & 2) != 0) {
            cdkVar.d(true);
        }
        defpackage.cfh cfhVar = cdkVar.e;
        if (cfhVar == null || !cfhVar.a()) {
            return 1;
        }
        if (((defpackage.cfm) this.e).h(defpackage.cfd.c(cfhVar))) {
            if (cdkVar.c != null) {
                return E(cdkVar, cfhVar, obj);
            }
            return 1;
        }
        synchronized (this.c) {
            cbbVar = this.j;
        }
        return (cbbVar == null || !cbbVar.D(cdkVar, obj)) ? 1 : 4;
    }

    @Override // defpackage.cay
    public final void d() {
        synchronized (this.c) {
            defpackage.ccb ccbVar = this.m;
            if (((defpackage.cbt) ccbVar).o) {
                defpackage.cdh.b("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
            }
            if (this.w != 3) {
                this.w = 3;
                this.x = defpackage.cao.b;
                defpackage.can canVar = ((defpackage.cbt) ccbVar).A;
                if (canVar != null) {
                    z(canVar);
                }
                defpackage.ced cedVar = this.e;
                boolean zC = cedVar.c();
                if (!zC || !this.d.isEmpty()) {
                    defpackage.cjh cjhVar = this.l;
                    java.util.Set set = this.d;
                    ccbVar.P();
                    try {
                        cjhVar.i(set, null);
                        if (!zC) {
                            defpackage.cah cahVar = this.s;
                            defpackage.cfp cfpVarF = ((defpackage.cfm) cedVar).f();
                            try {
                                defpackage.cax.c(cfpVarF, cjhVar);
                                cfpVarF.x(true);
                                cahVar.c();
                                cahVar.f();
                                cjhVar.c();
                            } catch (java.lang.Throwable th) {
                                cfpVarF.x(false);
                                throw th;
                            }
                        }
                        cjhVar.b();
                        cjhVar.a();
                    } catch (java.lang.Throwable th2) {
                        cjhVar.a();
                        throw th2;
                    }
                }
                this.A.k();
                defpackage.ccb ccbVar2 = this.m;
                android.os.Trace.beginSection("Compose:Composer.dispose");
                try {
                    ((defpackage.cbt) ccbVar2).b.k(ccbVar2);
                    ((defpackage.cbt) ccbVar2).V();
                    ((defpackage.cbt) ccbVar2).a.c();
                    android.os.Trace.endSection();
                } catch (java.lang.Throwable th3) {
                    android.os.Trace.endSection();
                    throw th3;
                }
            }
        }
        this.a.t(this);
    }

    @Override // defpackage.cay
    public final void e(defpackage.aonn aonnVar) {
        boolean zT = t();
        p();
        if (zT) {
            l(aonnVar);
        } else {
            B(aonnVar);
        }
    }

    public final ceb f(ceb cebVar) {
        ceb cebVar2 = this.h;
        this.h = cebVar;
        return cebVar2;
    }

    public final void g() {
        this.b.set(null);
        this.t.i();
        this.u.i();
        java.util.Set set = this.d;
        if (set.isEmpty()) {
            return;
        }
        defpackage.cjh cjhVar = this.l;
        this.m.P();
        try {
            cjhVar.i(set, null);
            cjhVar.b();
        } finally {
            cjhVar.a();
        }
    }

    /* JADX WARN: Code duplicated, block: B:124:0x0261 A[PHI: r27 r29 r36
      0x0261: PHI (r27v7 java.lang.String) = (r27v6 java.lang.String), (r27v6 java.lang.String), (r27v9 java.lang.String) binds: [B:121:0x0259, B:123:0x025f, B:115:0x0244] A[DONT_GENERATE, DONT_INLINE]
      0x0261: PHI (r29v11 long) = (r29v10 long), (r29v10 long), (r29v13 long) binds: [B:121:0x0259, B:123:0x025f, B:115:0x0244] A[DONT_GENERATE, DONT_INLINE]
      0x0261: PHI (r36v8 java.lang.String) = (r36v7 java.lang.String), (r36v7 java.lang.String), (r36v9 java.lang.String) binds: [B:121:0x0259, B:123:0x025f, B:115:0x0244] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:195:0x00c2 A[EDGE_INSN: B:195:0x00c2->B:36:0x00c2 BREAK  A[LOOP:2: B:23:0x0076->B:34:0x00b2], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:236:0x0113 A[EDGE_INSN: B:236:0x0113->B:231:0x0113 BREAK  A[LOOP:13: B:61:0x0143->B:72:0x0177], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x00b0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x00b2 A[LOOP:2: B:23:0x0076->B:34:0x00b2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:71:0x0175 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x0177 A[LOOP:13: B:61:0x0143->B:72:0x0177, LOOP_END] */
    public final void h(java.util.Set set, boolean z) {
        char c;
        long j;
        long j2;
        long j3;
        long[] jArr;
        int i;
        long[] jArr2;
        int i2;
        int i3;
        long j4;
        boolean zA;
        long[] jArr3;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        long j5;
        int i4;
        char c2;
        long j6;
        int i5;
        int i6;
        java.lang.Object obj = null;
        char c3 = 7;
        long j7 = -9187201950435737472L;
        int i7 = 8;
        if (set instanceof defpackage.cff) {
            defpackage.ady adyVar = ((defpackage.cff) set).a;
            java.lang.Object[] objArr = adyVar.b;
            long[] jArr4 = adyVar.a;
            int length = jArr4.length - 2;
            if (length >= 0) {
                int i8 = 0;
                j2 = 128;
                while (true) {
                    long j8 = jArr4[i8];
                    j3 = 255;
                    if ((((~j8) << c3) & j8 & j7) != j7) {
                        int i9 = 8 - ((~(i8 - length)) >>> 31);
                        int i10 = 0;
                        while (i10 < i9) {
                            if ((j8 & 255) < 128) {
                                c2 = c3;
                                java.lang.Object obj2 = objArr[(i8 << 3) + i10];
                                j6 = j7;
                                if (obj2 instanceof defpackage.cdk) {
                                    ((defpackage.cdk) obj2).s(obj);
                                    j8 = j8;
                                    i6 = i7;
                                    i5 = length;
                                } else {
                                    y(obj2, z);
                                    java.lang.Object objA = this.p.a(obj2);
                                    if (objA != null) {
                                        if (objA instanceof defpackage.ady) {
                                            defpackage.ady adyVar2 = (defpackage.ady) objA;
                                            java.lang.Object[] objArr2 = adyVar2.b;
                                            long[] jArr5 = adyVar2.a;
                                            int length2 = jArr5.length - 2;
                                            if (length2 >= 0) {
                                                j8 = j8;
                                                int i11 = 0;
                                                while (true) {
                                                    long j9 = jArr5[i11];
                                                    int i12 = i7;
                                                    i5 = length;
                                                    if ((((~j9) << c2) & j9 & j6) != j6) {
                                                        int i13 = 8 - ((~(i11 - length2)) >>> 31);
                                                        int i14 = 0;
                                                        while (i14 < i13) {
                                                            if ((j9 & 255) < 128) {
                                                                y((defpackage.ckg) objArr2[(i11 << 3) + i14], z);
                                                            }
                                                            j9 >>= i12;
                                                            i14++;
                                                            i12 = i12;
                                                        }
                                                        if (i13 != i12) {
                                                            break;
                                                        }
                                                        if (i11 != length2) {
                                                            break;
                                                        }
                                                        i11++;
                                                        length = i5;
                                                        i7 = 8;
                                                    } else if (i11 != length2) {
                                                        break;
                                                        break;
                                                    } else {
                                                        i11++;
                                                        length = i5;
                                                        i7 = 8;
                                                    }
                                                }
                                            }
                                        } else {
                                            j8 = j8;
                                            i5 = length;
                                            y((defpackage.ckg) objA, z);
                                        }
                                        i6 = 8;
                                    }
                                }
                                i10++;
                                length = i5;
                                i7 = i6;
                                c3 = c2;
                                j7 = j6;
                                j8 >>= i6;
                                obj = null;
                            } else {
                                c2 = c3;
                                j6 = j7;
                            }
                            i5 = length;
                            i6 = i7;
                            i10++;
                            length = i5;
                            i7 = i6;
                            c3 = c2;
                            j7 = j6;
                            j8 >>= i6;
                            obj = null;
                        }
                        c = c3;
                        j = j7;
                        int i15 = length;
                        if (i9 != i7) {
                            break;
                        } else {
                            length = i15;
                        }
                    } else {
                        c = c3;
                        j = j7;
                    }
                    if (i8 == length) {
                        break;
                    }
                    i8++;
                    c3 = c;
                    j7 = j;
                    obj = null;
                    i7 = 8;
                }
            } else {
                c = 7;
                j = -9187201950435737472L;
                j2 = 128;
                j3 = 255;
            }
        } else {
            c = 7;
            j = -9187201950435737472L;
            j2 = 128;
            j3 = 255;
            for (java.lang.Object obj3 : set) {
                if (obj3 instanceof defpackage.cdk) {
                    ((defpackage.cdk) obj3).s(null);
                } else {
                    y(obj3, z);
                    java.lang.Object objA2 = this.p.a(obj3);
                    if (objA2 != null) {
                        if (objA2 instanceof defpackage.ady) {
                            defpackage.ady adyVar3 = (defpackage.ady) objA2;
                            java.lang.Object[] objArr3 = adyVar3.b;
                            long[] jArr6 = adyVar3.a;
                            int length3 = jArr6.length - 2;
                            if (length3 >= 0) {
                                int i16 = 0;
                                while (true) {
                                    long j10 = jArr6[i16];
                                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i16 != length3) {
                                            break;
                                            break;
                                        }
                                        i16++;
                                    } else {
                                        int i17 = 8 - ((~(i16 - length3)) >>> 31);
                                        for (int i18 = 0; i18 < i17; i18++) {
                                            if ((j10 & 255) < 128) {
                                                y((defpackage.ckg) objArr3[(i16 << 3) + i18], z);
                                            }
                                            j10 >>= 8;
                                        }
                                        if (i17 != 8) {
                                            break;
                                        } else if (i16 != length3) {
                                            break;
                                        } else {
                                            i16++;
                                        }
                                    }
                                }
                            }
                        } else {
                            y((defpackage.ckg) objA2, z);
                        }
                    }
                }
            }
        }
        defpackage.ady adyVar4 = this.z;
        defpackage.ady adyVar5 = this.y;
        java.lang.String str5 = "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>";
        java.lang.String str6 = "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap";
        if (z && adyVar4.c()) {
            defpackage.adw adwVar = this.o;
            long[] jArr7 = adwVar.a;
            int length4 = jArr7.length - 2;
            if (length4 >= 0) {
                int i19 = 0;
                while (true) {
                    long j11 = jArr7[i19];
                    if ((((~j11) << c) & j11 & j) != j) {
                        int i20 = 8 - ((~(i19 - length4)) >>> 31);
                        int i21 = 0;
                        while (i21 < i20) {
                            if ((j11 & j3) < j2) {
                                int i22 = (i19 << 3) + i21;
                                java.lang.Object obj4 = adwVar.b[i22];
                                java.lang.Object obj5 = adwVar.c[i22];
                                if (obj5 instanceof defpackage.ady) {
                                    if (obj5 == null) {
                                        defpackage.aooh.h(str5);
                                        obj5 = null;
                                    }
                                    defpackage.ady adyVar6 = (defpackage.ady) obj5;
                                    java.lang.Object[] objArr4 = adyVar6.b;
                                    str3 = str5;
                                    long[] jArr8 = adyVar6.a;
                                    int length5 = jArr8.length - 2;
                                    if (length5 >= 0) {
                                        int i23 = length5;
                                        str4 = str6;
                                        int i24 = 0;
                                        while (true) {
                                            long j12 = jArr8[i24];
                                            j5 = j11;
                                            if ((((~j12) << c) & j12 & j) != j) {
                                                int i25 = 8 - ((~(i24 - i23)) >>> 31);
                                                long j13 = j12;
                                                int i26 = 0;
                                                while (i26 < i25) {
                                                    if ((j13 & j3) < j2) {
                                                        int i27 = (i24 << 3) + i26;
                                                        i4 = i26;
                                                        defpackage.cdk cdkVar = (defpackage.cdk) objArr4[i27];
                                                        if (adyVar4.a(cdkVar) || adyVar5.a(cdkVar)) {
                                                            adyVar6.i(i27);
                                                        }
                                                    } else {
                                                        i4 = i26;
                                                    }
                                                    j13 >>= 8;
                                                    i26 = i4 + 1;
                                                }
                                                if (i25 != 8) {
                                                    break;
                                                }
                                            }
                                            if (i24 == i23) {
                                                break;
                                            }
                                            i24++;
                                            i23 = i23;
                                            j11 = j5;
                                        }
                                    } else {
                                        str4 = str6;
                                        j5 = j11;
                                    }
                                    if (adyVar6.b()) {
                                        adwVar.j(i22);
                                    }
                                } else {
                                    str3 = str5;
                                    str4 = str6;
                                    j5 = j11;
                                    if (obj5 == null) {
                                        defpackage.aooh.h(str4);
                                        obj5 = null;
                                    }
                                    defpackage.cdk cdkVar2 = (defpackage.cdk) obj5;
                                    if (adyVar4.a(cdkVar2) || adyVar5.a(cdkVar2)) {
                                        adwVar.j(i22);
                                    }
                                }
                            } else {
                                str3 = str5;
                                str4 = str6;
                                j5 = j11;
                            }
                            j11 = j5 >> 8;
                            i21++;
                            str5 = str3;
                            str6 = str4;
                        }
                        str = str5;
                        str2 = str6;
                        if (i20 != 8) {
                            break;
                        }
                    } else {
                        str = str5;
                        str2 = str6;
                    }
                    if (i19 == length4) {
                        break;
                    }
                    i19++;
                    str5 = str;
                    str6 = str2;
                }
            }
            adyVar4.d();
            A();
            return;
        }
        if (adyVar5.c()) {
            defpackage.adw adwVar2 = this.o;
            long[] jArr9 = adwVar2.a;
            int length6 = jArr9.length - 2;
            if (length6 >= 0) {
                int i28 = 0;
                while (true) {
                    long j14 = jArr9[i28];
                    if ((((~j14) << c) & j14 & j) != j) {
                        int i29 = 8 - ((~(i28 - length6)) >>> 31);
                        int i30 = 0;
                        while (i30 < i29) {
                            if ((j14 & j3) < j2) {
                                int i31 = (i28 << 3) + i30;
                                java.lang.Object obj6 = adwVar2.b[i31];
                                java.lang.Object obj7 = adwVar2.c[i31];
                                if (obj7 instanceof defpackage.ady) {
                                    if (obj7 == null) {
                                        defpackage.aooh.h("null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                                        obj7 = null;
                                    }
                                    defpackage.ady adyVar7 = (defpackage.ady) obj7;
                                    java.lang.Object[] objArr5 = adyVar7.b;
                                    long[] jArr10 = adyVar7.a;
                                    int length7 = jArr10.length - 2;
                                    if (length7 >= 0) {
                                        j4 = j14;
                                        int i32 = 0;
                                        while (true) {
                                            long j15 = jArr10[i32];
                                            i2 = length6;
                                            i3 = i28;
                                            if ((((~j15) << c) & j15 & j) != j) {
                                                int i33 = 8 - ((~(i32 - length7)) >>> 31);
                                                int i34 = 0;
                                                while (i34 < i33) {
                                                    if ((j15 & j3) < j2) {
                                                        int i35 = (i32 << 3) + i34;
                                                        jArr3 = jArr9;
                                                        if (adyVar5.a((defpackage.cdk) objArr5[i35])) {
                                                            adyVar7.i(i35);
                                                        }
                                                    } else {
                                                        jArr3 = jArr9;
                                                    }
                                                    j15 >>= 8;
                                                    i34++;
                                                    jArr9 = jArr3;
                                                }
                                                jArr2 = jArr9;
                                                if (i33 != 8) {
                                                    break;
                                                }
                                            } else {
                                                jArr2 = jArr9;
                                            }
                                            if (i32 == length7) {
                                                break;
                                            }
                                            i32++;
                                            length6 = i2;
                                            i28 = i3;
                                            jArr9 = jArr2;
                                        }
                                    } else {
                                        jArr2 = jArr9;
                                        i2 = length6;
                                        i3 = i28;
                                        j4 = j14;
                                    }
                                    zA = adyVar7.b();
                                } else {
                                    jArr2 = jArr9;
                                    i2 = length6;
                                    i3 = i28;
                                    j4 = j14;
                                    if (obj7 == null) {
                                        defpackage.aooh.h("null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                        obj7 = null;
                                    }
                                    zA = adyVar5.a((defpackage.cdk) obj7);
                                }
                                if (zA) {
                                    adwVar2.j(i31);
                                }
                            } else {
                                jArr2 = jArr9;
                                i2 = length6;
                                i3 = i28;
                                j4 = j14;
                            }
                            j14 = j4 >> 8;
                            i30++;
                            length6 = i2;
                            i28 = i3;
                            jArr9 = jArr2;
                        }
                        jArr = jArr9;
                        int i36 = length6;
                        int i37 = i28;
                        if (i29 != 8) {
                            break;
                        }
                        length6 = i36;
                        i = i37;
                    } else {
                        jArr = jArr9;
                        i = i28;
                    }
                    if (i == length6) {
                        break;
                    }
                    i28 = i + 1;
                    jArr9 = jArr;
                }
            }
            A();
            adyVar5.d();
        }
    }

    public final void i() {
        synchronized (this.c) {
            try {
                z(this.t);
                o();
            } catch (java.lang.Throwable th) {
                try {
                    java.util.Set set = this.d;
                    if (!set.isEmpty()) {
                        defpackage.cjh cjhVar = this.l;
                        this.m.P();
                        try {
                            cjhVar.i(set, null);
                            cjhVar.b();
                        } finally {
                            cjhVar.a();
                        }
                    }
                    throw th;
                } catch (java.lang.Throwable th2) {
                    g();
                    throw th2;
                }
            }
        }
    }

    public final void j() {
        synchronized (this.c) {
            try {
                defpackage.can canVar = this.u;
                if (canVar.h()) {
                    z(canVar);
                }
            } catch (java.lang.Throwable th) {
                try {
                    java.util.Set set = this.d;
                    if (!set.isEmpty()) {
                        defpackage.cjh cjhVar = this.l;
                        this.m.P();
                        try {
                            cjhVar.i(set, null);
                            cjhVar.b();
                        } finally {
                            cjhVar.a();
                        }
                    }
                    throw th;
                } catch (java.lang.Throwable th2) {
                    g();
                    throw th2;
                }
            }
        }
    }

    public final void k() {
        synchronized (this.c) {
            try {
                defpackage.ccb ccbVar = this.m;
                ((defpackage.cbt) ccbVar).y = null;
                java.util.Set set = this.d;
                if (!set.isEmpty()) {
                    defpackage.cjh cjhVar = this.l;
                    ccbVar.P();
                    try {
                        cjhVar.i(set, null);
                        cjhVar.b();
                        cjhVar.a();
                    } catch (java.lang.Throwable th) {
                        cjhVar.a();
                        throw th;
                    }
                }
            } catch (java.lang.Throwable th2) {
                try {
                    java.util.Set set2 = this.d;
                    if (!set2.isEmpty()) {
                        defpackage.cjh cjhVar2 = this.l;
                        this.m.P();
                        try {
                            cjhVar2.i(set2, null);
                            cjhVar2.b();
                        } finally {
                            cjhVar2.a();
                        }
                    }
                    throw th2;
                } catch (java.lang.Throwable th3) {
                    g();
                    throw th3;
                }
            }
        }
    }

    public final void l(defpackage.aonn aonnVar) {
        this.m.aa();
        B(aonnVar);
        this.m.X();
    }

    public final void m() {
        synchronized (this.c) {
            if (this.i != null) {
                defpackage.cdh.b("Deactivate is not supported while pausable composition is in progress");
            }
            defpackage.ced cedVar = this.e;
            boolean zC = cedVar.c();
            if (!zC || !this.d.isEmpty()) {
                android.os.Trace.beginSection("Compose:deactivate");
                try {
                    defpackage.cjh cjhVar = this.l;
                    java.util.Set set = this.d;
                    this.m.P();
                    try {
                        cjhVar.i(set, null);
                        if (!zC) {
                            defpackage.cah cahVar = this.s;
                            defpackage.cfp cfpVarF = ((defpackage.cfm) cedVar).f();
                            try {
                                defpackage.cbu.h(cfpVarF, cjhVar);
                                cfpVarF.x(true);
                                cahVar.f();
                                cjhVar.c();
                            } catch (java.lang.Throwable th) {
                                cfpVarF.x(false);
                                throw th;
                            }
                        }
                        cjhVar.b();
                        cjhVar.a();
                        android.os.Trace.endSection();
                    } catch (java.lang.Throwable th2) {
                        cjhVar.a();
                        throw th2;
                    }
                } catch (java.lang.Throwable th3) {
                    android.os.Trace.endSection();
                    throw th3;
                }
            }
            this.o.k();
            this.p.k();
            this.q.k();
            this.t.i();
            this.u.i();
            this.m.V();
            this.w = 1;
        }
    }

    public final void n() {
        java.util.concurrent.atomic.AtomicReference atomicReference = this.b;
        java.lang.Object obj = defpackage.cbc.a;
        java.lang.Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (defpackage.aooh.n(andSet, obj)) {
                defpackage.cax.a("pending composition has not been applied");
                throw new defpackage.aoiq();
            }
            if (andSet instanceof java.util.Set) {
                h((java.util.Set) andSet, true);
                return;
            }
            if (!(andSet instanceof java.lang.Object[])) {
                java.util.Objects.toString(atomicReference);
                defpackage.cax.a("corrupt pendingModifications drain: ".concat(atomicReference.toString()));
                throw new defpackage.aoiq();
            }
            for (java.util.Set set : (java.util.Set[]) andSet) {
                h(set, true);
            }
        }
    }

    public final void o() {
        java.util.concurrent.atomic.AtomicReference atomicReference = this.b;
        java.lang.Object andSet = atomicReference.getAndSet(null);
        if (defpackage.aooh.n(andSet, defpackage.cbc.a)) {
            return;
        }
        if (andSet instanceof java.util.Set) {
            h((java.util.Set) andSet, false);
            return;
        }
        if (andSet instanceof java.lang.Object[]) {
            for (java.util.Set set : (java.util.Set[]) andSet) {
                h(set, false);
            }
            return;
        }
        if (andSet != null) {
            java.util.Objects.toString(atomicReference);
            defpackage.cax.a("corrupt pendingModifications drain: ".concat(atomicReference.toString()));
            throw new defpackage.aoiq();
        }
        if (this.i == null) {
            defpackage.cax.b("calling recordModificationsOf and applyChanges concurrently is not supported");
        }
    }

    public final void p() {
        java.lang.String str;
        int i = this.w;
        if (i != 0) {
            if (i != 1) {
                str = i != 2 ? "The composition is disposed" : "A previous pausable composition for this composition was cancelled. This composition must be disposed.";
            } else {
                str = "The composition should be activated before setting content.";
            }
            defpackage.cdh.b(str);
        }
        if (this.i != null) {
            defpackage.cdh.b("A pausable composition is in progress");
        }
    }

    public final void q(defpackage.ady adyVar) {
        this.i = null;
        if (adyVar != null) {
            this.l.g = adyVar;
            this.w = 2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void r(java.util.Set set) {
        java.util.concurrent.atomic.AtomicReference atomicReference;
        java.lang.Object obj;
        java.lang.Object objCB;
        do {
            atomicReference = this.b;
            obj = atomicReference.get();
            if (obj == null || defpackage.aooh.n(obj, defpackage.cbc.a)) {
                objCB = set;
            } else if (obj instanceof java.util.Set) {
                objCB = new java.util.Set[]{obj, set};
            } else {
                if (!(obj instanceof java.lang.Object[])) {
                    java.util.concurrent.atomic.AtomicReference atomicReference2 = this.b;
                    java.util.Objects.toString(atomicReference2);
                    throw new java.lang.IllegalStateException("corrupt pendingModifications: ".concat(atomicReference2.toString()));
                }
                objCB = defpackage.ajsz.cB((java.util.Set[]) obj, set);
            }
        } while (!defpackage.anty.Q(atomicReference, obj, objCB));
        if (obj == null) {
            synchronized (this.c) {
                o();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0058 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x005a A[Catch: all -> 0x0064, LOOP:0: B:11:0x0023->B:22:0x005a, LOOP_END, TryCatch #0 {, blocks: (B:4:0x0005, B:6:0x0012, B:8:0x0016, B:11:0x0023, B:13:0x0033, B:14:0x0036, B:16:0x003f, B:18:0x0048, B:19:0x0052, B:22:0x005a, B:23:0x005d), top: B:29:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0062 A[EDGE_INSN: B:31:0x0062->B:24:0x0062 BREAK  A[LOOP:0: B:11:0x0023->B:22:0x005a], SYNTHETIC] */
    public final void s(java.lang.Object obj) {
        int i;
        synchronized (this.c) {
            C(obj);
            java.lang.Object objA = this.p.a(obj);
            if (objA != null) {
                if (objA instanceof defpackage.ady) {
                    defpackage.ady adyVar = (defpackage.ady) objA;
                    java.lang.Object[] objArr = adyVar.b;
                    long[] jArr = adyVar.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i2 = 0;
                        while (true) {
                            long j = jArr[i2];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                                if (i2 != length) {
                                    break;
                                    break;
                                }
                                i2++;
                            } else {
                                int i3 = i2 - length;
                                int i4 = 0;
                                while (true) {
                                    i = 8 - ((~i3) >>> 31);
                                    if (i4 >= i) {
                                        break;
                                    }
                                    if ((255 & j) < 128) {
                                        C((defpackage.ckg) objArr[(i2 << 3) + i4]);
                                    }
                                    j >>= 8;
                                    i4++;
                                }
                                if (i != 8) {
                                    break;
                                } else if (i2 != length) {
                                    break;
                                } else {
                                    i2++;
                                }
                            }
                        }
                    }
                } else {
                    C((defpackage.ckg) objA);
                }
            }
        }
    }

    public final boolean t() {
        boolean z;
        synchronized (this.c) {
            z = this.w == 1;
            if (z) {
                this.w = 0;
            }
        }
        return z;
    }

    public final boolean u() {
        return ((defpackage.cbt) this.m).o;
    }

    public final boolean v() {
        return this.w == 3;
    }

    public final ccy w(boolean z, defpackage.aonn aonnVar) {
        if (this.i != null) {
            defpackage.cdh.b("A pausable composition is in progress");
        }
        ccy ccyVar = new ccy(this, this.a, this.m, this.d, aonnVar, z, this.s, this.c);
        this.i = ccyVar;
        return ccyVar;
    }

    public final defpackage.adw x() {
        defpackage.adw adwVar = this.q;
        long[] jArr = defpackage.adx.a;
        this.q = new defpackage.adw(6);
        return adwVar;
    }
}
