package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xwf implements java.lang.Runnable, java.lang.Comparable, defpackage.xwb, defpackage.ygh {
    public static final defpackage.xur a = new defpackage.xur("glide_thread_priority_override", null, defpackage.xur.a);
    private defpackage.xuo A;
    private java.lang.Object B;
    private defpackage.xuc C;
    private defpackage.xvb D;
    private volatile boolean E;
    private boolean F;
    private int G;
    public defpackage.xsk d;
    public defpackage.xuo e;
    public defpackage.xsm f;
    public defpackage.xww g;
    public int h;
    public int i;
    public defpackage.xwm j;
    public defpackage.xus k;
    public int l;
    public java.util.function.Supplier m;
    public defpackage.xuo n;
    public volatile defpackage.xwc o;
    public volatile boolean p;
    public int q;
    public final defpackage.xwo r;
    public defpackage.xwu s;
    public xtq t;
    private final dxz x;
    private long y;
    private java.lang.Thread z;
    public final defpackage.xwd b = new defpackage.xwd();
    private final java.util.List v = new java.util.ArrayList();
    private final defpackage.ygk w = new defpackage.ygk();
    public final defpackage.aliq u = new defpackage.aliq((byte[]) null);
    public final defpackage.xwe c = new defpackage.xwe();

    public xwf(defpackage.xwo xwoVar, dxz dxzVar) {
        this.r = xwoVar;
        this.x = dxzVar;
    }

    public static boolean e(defpackage.xxe xxeVar) {
        android.graphics.Bitmap bitmap;
        java.lang.Object objC = xxeVar.c();
        if (objC instanceof android.graphics.Bitmap) {
            bitmap = (android.graphics.Bitmap) objC;
        } else {
            bitmap = objC instanceof android.graphics.drawable.BitmapDrawable ? ((android.graphics.drawable.BitmapDrawable) objC).getBitmap() : null;
        }
        return bitmap != null && bitmap.getConfig() == android.graphics.Bitmap.Config.HARDWARE;
    }

    private final defpackage.xwc h() {
        int i = this.G;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 1) {
            return new defpackage.xxf(this.b, this);
        }
        if (i2 == 2) {
            defpackage.xwd xwdVar = this.b;
            return new defpackage.xvz(xwdVar.d(), xwdVar, this);
        }
        if (i2 == 3) {
            return new defpackage.xxj(this.b, this);
        }
        if (i2 != 5) {
            throw new java.lang.IllegalStateException("Unrecognized stage: ".concat(defpackage.xff.u(i)));
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:127:0x02d4 A[LOOP:1: B:40:0x00f7->B:127:0x02d4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:133:0x02ee A[Catch: all -> 0x0327, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x0327, blocks: (B:133:0x02ee, B:145:0x0321, B:146:0x0326), top: B:236:0x00dc }] */
    /* JADX WARN: Code duplicated, block: B:136:0x02ff A[Catch: all -> 0x0332, TRY_LEAVE, TryCatch #11 {all -> 0x0332, blocks: (B:134:0x02f3, B:136:0x02ff, B:151:0x032e, B:152:0x0331), top: B:244:0x00d0 }] */
    /* JADX WARN: Code duplicated, block: B:139:0x030d A[Catch: all -> 0x031a, TRY_ENTER, TryCatch #17 {all -> 0x031a, blocks: (B:66:0x017b, B:68:0x0182, B:80:0x01cb, B:82:0x01d1, B:83:0x01d4, B:85:0x01e8, B:87:0x01fa, B:91:0x020b, B:93:0x021a, B:98:0x0233, B:100:0x023d, B:102:0x0247, B:105:0x024f, B:107:0x0253, B:109:0x027e, B:108:0x0275, B:111:0x0293, B:112:0x02a0, B:110:0x028a, B:139:0x030d, B:140:0x0319, B:96:0x022f, B:88:0x01ff, B:89:0x0208, B:125:0x02cf, B:76:0x01aa, B:119:0x02ac, B:120:0x02bd), top: B:228:0x017b }] */
    /* JADX WARN: Code duplicated, block: B:165:0x0352  */
    /* JADX WARN: Code duplicated, block: B:167:0x0358  */
    /* JADX WARN: Code duplicated, block: B:170:0x0366  */
    /* JADX WARN: Code duplicated, block: B:171:0x036c  */
    /* JADX WARN: Code duplicated, block: B:174:0x0377  */
    /* JADX WARN: Code duplicated, block: B:182:0x038f A[Catch: all -> 0x044c, TryCatch #9 {, blocks: (B:180:0x0386, B:182:0x038f, B:183:0x0397, B:185:0x0399, B:187:0x03a1, B:189:0x03a5, B:190:0x03c8, B:214:0x043a, B:215:0x0441, B:216:0x0442, B:217:0x0449), top: B:241:0x0386 }] */
    /* JADX WARN: Code duplicated, block: B:185:0x0399 A[Catch: all -> 0x044c, TryCatch #9 {, blocks: (B:180:0x0386, B:182:0x038f, B:183:0x0397, B:185:0x0399, B:187:0x03a1, B:189:0x03a5, B:190:0x03c8, B:214:0x043a, B:215:0x0441, B:216:0x0442, B:217:0x0449), top: B:241:0x0386 }] */
    /* JADX WARN: Code duplicated, block: B:187:0x03a1 A[Catch: all -> 0x044c, TryCatch #9 {, blocks: (B:180:0x0386, B:182:0x038f, B:183:0x0397, B:185:0x0399, B:187:0x03a1, B:189:0x03a5, B:190:0x03c8, B:214:0x043a, B:215:0x0441, B:216:0x0442, B:217:0x0449), top: B:241:0x0386 }] */
    /* JADX WARN: Code duplicated, block: B:189:0x03a5 A[Catch: all -> 0x044c, TryCatch #9 {, blocks: (B:180:0x0386, B:182:0x038f, B:183:0x0397, B:185:0x0399, B:187:0x03a1, B:189:0x03a5, B:190:0x03c8, B:214:0x043a, B:215:0x0441, B:216:0x0442, B:217:0x0449), top: B:241:0x0386 }] */
    /* JADX WARN: Code duplicated, block: B:194:0x03d8 A[LOOP:0: B:192:0x03d2->B:194:0x03d8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:199:0x03fb A[Catch: all -> 0x0433, TRY_LEAVE, TryCatch #12 {all -> 0x0433, blocks: (B:197:0x03f3, B:199:0x03fb, B:201:0x0411, B:203:0x041a, B:204:0x0421, B:200:0x03ff), top: B:245:0x03f3, inners: #16 }] */
    /* JADX WARN: Code duplicated, block: B:206:0x0424  */
    /* JADX WARN: Code duplicated, block: B:209:0x042f  */
    /* JADX WARN: Code duplicated, block: B:214:0x043a A[Catch: all -> 0x044c, TRY_ENTER, TryCatch #9 {, blocks: (B:180:0x0386, B:182:0x038f, B:183:0x0397, B:185:0x0399, B:187:0x03a1, B:189:0x03a5, B:190:0x03c8, B:214:0x043a, B:215:0x0441, B:216:0x0442, B:217:0x0449), top: B:241:0x0386 }] */
    /* JADX WARN: Code duplicated, block: B:216:0x0442 A[Catch: all -> 0x044c, TryCatch #9 {, blocks: (B:180:0x0386, B:182:0x038f, B:183:0x0397, B:185:0x0399, B:187:0x03a1, B:189:0x03a5, B:190:0x03c8, B:214:0x043a, B:215:0x0441, B:216:0x0442, B:217:0x0449), top: B:241:0x0386 }] */
    /* JADX WARN: Code duplicated, block: B:226:0x0452  */
    /* JADX WARN: Code duplicated, block: B:241:0x0386 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:242:0x0380 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:264:0x02ea A[EDGE_INSN: B:264:0x02ea->B:131:0x02ea BREAK  A[LOOP:1: B:40:0x00f7->B:127:0x02d4], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:267:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v76, types: [java.lang.Object, xuo] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, xuo] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, xue] */
    private final void i() throws java.lang.Throwable {
        boolean z;
        defpackage.xxe xxeVar;
        defpackage.xuc xucVar;
        defpackage.xxd xxdVarD;
        defpackage.xwu xwuVar;
        defpackage.xwt xwtVar;
        defpackage.aliq aliqVar;
        defpackage.xvb xvbVar;
        int i;
        int i2;
        int i3;
        int i4;
        java.util.List list;
        defpackage.xus xusVar;
        defpackage.xxe xxeVarD;
        defpackage.xuw xuwVar;
        int iB;
        defpackage.xuv xuvVarL;
        boolean z2;
        java.lang.Boolean bool;
        java.util.function.Supplier supplier;
        if (android.util.Log.isLoggable("DecodeJob", 2)) {
            j("Retrieved data", this.y, "data: " + java.lang.String.valueOf(this.B) + ", cache key: " + java.lang.String.valueOf(this.n) + ", fetcher: " + java.lang.String.valueOf(this.D));
        }
        if (this.t.a(defpackage.xsc.class) && (supplier = this.m) != null && aa$.ExternalSyntheticApiModelOutline1.m(supplier) != null) {
            try {
                android.os.Process.setThreadPriority(android.os.Process.myTid(), ((java.lang.Integer) aa$.ExternalSyntheticApiModelOutline1.m(this.m)).intValue());
            } catch (java.lang.IllegalArgumentException | java.lang.SecurityException e) {
                this.m = null;
                if (android.util.Log.isLoggable("DecodeJob", 2)) {
                    android.util.Log.v("DecodeJob", "Failed to set thread priority; using default priority for any subsequent jobs.", e);
                }
            }
        }
        try {
            defpackage.xvb xvbVar2 = this.D;
            java.lang.Object obj = this.B;
            defpackage.xuc xucVar2 = this.C;
            try {
                if (obj == null) {
                    xvbVar2.e();
                    xxeVar = null;
                    z = true;
                } else {
                    try {
                        int i5 = defpackage.yfx.a;
                        long jElapsedRealtimeNanos = android.os.SystemClock.elapsedRealtimeNanos();
                        defpackage.xwd xwdVar = this.b;
                        defpackage.xxc xxcVarB = xwdVar.b(obj.getClass());
                        defpackage.xus xusVar2 = this.k;
                        boolean z3 = xucVar2 == defpackage.xuc.d || xwdVar.q;
                        defpackage.xur xurVar = defpackage.ybh.d;
                        java.lang.Boolean bool2 = (java.lang.Boolean) xusVar2.b(xurVar);
                        if (bool2 == null) {
                            xusVar2 = new defpackage.xus();
                            xusVar2.c(this.k);
                            xusVar2.d(xurVar, java.lang.Boolean.valueOf(z3));
                        } else if (bool2.booleanValue() && !z3) {
                            z3 = false;
                            xusVar2 = new defpackage.xus();
                            xusVar2.c(this.k);
                            xusVar2.d(xurVar, java.lang.Boolean.valueOf(z3));
                        }
                        try {
                            defpackage.xus xusVar3 = xusVar2;
                            defpackage.xvd xvdVarA = this.d.a().a(obj);
                            try {
                                try {
                                    int i6 = this.h;
                                    int i7 = this.i;
                                    j$.util.Objects.requireNonNull(this);
                                    java.util.List list2 = (java.util.List) xxcVarB.a.a();
                                    try {
                                        java.util.List list3 = xxcVarB.b;
                                        int size = list3.size();
                                        defpackage.xxe xxeVarA = null;
                                        int i8 = 0;
                                        z = true;
                                        while (true) {
                                            if (i8 >= size) {
                                                xvbVar = xvbVar2;
                                                break;
                                            }
                                            try {
                                                defpackage.xwg xwgVar = (defpackage.xwg) list3.get(i8);
                                                try {
                                                    java.util.List list4 = (java.util.List) xwgVar.b.a();
                                                    java.util.List list5 = list3;
                                                    i2 = i6;
                                                    i3 = i7;
                                                    try {
                                                        defpackage.xxe xxeVarA2 = xwgVar.a(xvdVarA, i2, i3, xusVar3, list4);
                                                        xusVar = xusVar3;
                                                        try {
                                                            xwgVar.b.b(list4);
                                                            java.lang.Class<?> cls = xxeVarA2.c().getClass();
                                                            if (xucVar2 != defpackage.xuc.d) {
                                                                defpackage.xuw xuwVarA = this.b.a(cls);
                                                                list = list5;
                                                                try {
                                                                    java.lang.Boolean bool3 = (java.lang.Boolean) this.k.b(defpackage.ybh.e);
                                                                    if (bool3 != null && bool3.booleanValue() && (bool = (java.lang.Boolean) this.k.b(defpackage.ybh.d)) != null && bool.booleanValue() && e(xxeVarA2)) {
                                                                        if (android.util.Log.isLoggable("DecodeJob", 2)) {
                                                                            java.lang.String strValueOf = java.lang.String.valueOf(xxeVarA2.c());
                                                                            i = i8;
                                                                            try {
                                                                                java.lang.String string = xuwVarA.toString();
                                                                                xvbVar = xvbVar2;
                                                                                try {
                                                                                    try {
                                                                                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                                                                        i4 = size;
                                                                                        try {
                                                                                            sb.append("Bypassing software transformations for resource: ");
                                                                                            sb.append(strValueOf);
                                                                                            sb.append(" with transformation: ");
                                                                                            sb.append(string);
                                                                                            android.util.Log.v("DecodeJob", sb.toString());
                                                                                        } catch (defpackage.xxa e2) {
                                                                                            e = e2;
                                                                                            list2.add(e);
                                                                                        }
                                                                                    } catch (defpackage.xxa e3) {
                                                                                        e = e3;
                                                                                        i4 = size;
                                                                                        list2.add(e);
                                                                                        if (xxeVarA == null) {
                                                                                            break;
                                                                                            xxeVar = xxeVarA;
                                                                                            if (xxeVar != null) {
                                                                                                throw new defpackage.xxa(xxcVarB.c, new java.util.ArrayList(list2));
                                                                                            }
                                                                                            xxcVarB.a.b(list2);
                                                                                            xvdVarA.b();
                                                                                            if (android.util.Log.isLoggable("DecodeJob", 2)) {
                                                                                                j(hgb.k(xxeVar, "Decoded result "), jElapsedRealtimeNanos, null);
                                                                                            }
                                                                                            xvbVar.e();
                                                                                            if (xxeVar != null) {
                                                                                                m();
                                                                                                return;
                                                                                            }
                                                                                            xucVar = this.C;
                                                                                            if (xxeVar instanceof defpackage.xxb) {
                                                                                                ((defpackage.xxb) xxeVar).d();
                                                                                            }
                                                                                            if (this.u.u()) {
                                                                                                xxdVarD = defpackage.xxd.d(xxeVar);
                                                                                                xxeVar = xxdVarD;
                                                                                            } else {
                                                                                                xxdVarD = null;
                                                                                            }
                                                                                            if (this.t.a(defpackage.xsc.class)) {
                                                                                                l();
                                                                                            }
                                                                                            n();
                                                                                            xwuVar = this.s;
                                                                                            synchronized (xwuVar) {
                                                                                                xwuVar.g = xxeVar;
                                                                                                xwuVar.h = xucVar;
                                                                                                synchronized (xwuVar) {
                                                                                                    xwuVar.b.a();
                                                                                                    if (xwuVar.m) {
                                                                                                        xwuVar.g.e();
                                                                                                        xwuVar.f();
                                                                                                    } else {
                                                                                                        xwtVar = xwuVar.a;
                                                                                                        if (!xwtVar.d()) {
                                                                                                            throw new java.lang.IllegalStateException("Received a resource without any callbacks to notify");
                                                                                                        }
                                                                                                        if (!xwuVar.i) {
                                                                                                            throw new java.lang.IllegalStateException("Already have resource");
                                                                                                        }
                                                                                                        xwuVar.l = new defpackage.xwy(xwuVar.g, xwuVar.f, xwuVar.e, xwuVar.c);
                                                                                                        boolean z4 = z;
                                                                                                        xwuVar.i = z4;
                                                                                                        defpackage.xwt<defpackage.xws> xwtVarB = xwtVar.b();
                                                                                                        xwuVar.e(xwtVarB.a() + (z4 ? 1 : 0));
                                                                                                        xwuVar.d.c(xwuVar, xwuVar.e, xwuVar.l);
                                                                                                        for (defpackage.xws xwsVar : xwtVarB) {
                                                                                                            xwsVar.b.execute(new defpackage.xwr(xwuVar, xwsVar.a, 2, null));
                                                                                                        }
                                                                                                        xwuVar.d();
                                                                                                    }
                                                                                                    this.G = 5;
                                                                                                    try {
                                                                                                        aliqVar = this.u;
                                                                                                        if (aliqVar.u()) {
                                                                                                            try {
                                                                                                                this.r.a().c(aliqVar.b, new defpackage.rju((defpackage.xue) aliqVar.c, aliqVar.a, this.k));
                                                                                                                ((defpackage.xxd) aliqVar.a).f();
                                                                                                            } catch (java.lang.Throwable th) {
                                                                                                                ((defpackage.xxd) aliqVar.a).f();
                                                                                                                throw th;
                                                                                                            }
                                                                                                        }
                                                                                                        if (xxdVarD != null) {
                                                                                                            xxdVarD.f();
                                                                                                        }
                                                                                                        if (this.c.b()) {
                                                                                                            b();
                                                                                                        }
                                                                                                    } catch (java.lang.Throwable th2) {
                                                                                                        if (xxdVarD != null) {
                                                                                                            xxdVarD.f();
                                                                                                        }
                                                                                                        throw th2;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        i8 = i + 1;
                                                                                        xusVar3 = xusVar;
                                                                                        i6 = i2;
                                                                                        i7 = i3;
                                                                                        list3 = list;
                                                                                        xvbVar2 = xvbVar;
                                                                                        size = i4;
                                                                                    }
                                                                                } catch (java.lang.Throwable th3) {
                                                                                    th = th3;
                                                                                    xxcVarB.a.b(list2);
                                                                                    throw th;
                                                                                }
                                                                            } catch (defpackage.xxa e4) {
                                                                                e = e4;
                                                                                xvbVar = xvbVar2;
                                                                                i4 = size;
                                                                                list2.add(e);
                                                                                if (xxeVarA == null) {
                                                                                    break;
                                                                                    xxeVar = xxeVarA;
                                                                                    if (xxeVar != null) {
                                                                                        throw new defpackage.xxa(xxcVarB.c, new java.util.ArrayList(list2));
                                                                                    }
                                                                                    xxcVarB.a.b(list2);
                                                                                    xvdVarA.b();
                                                                                    if (android.util.Log.isLoggable("DecodeJob", 2)) {
                                                                                        j(hgb.k(xxeVar, "Decoded result "), jElapsedRealtimeNanos, null);
                                                                                    }
                                                                                    xvbVar.e();
                                                                                    if (xxeVar != null) {
                                                                                        m();
                                                                                        return;
                                                                                    }
                                                                                    xucVar = this.C;
                                                                                    if (xxeVar instanceof defpackage.xxb) {
                                                                                        ((defpackage.xxb) xxeVar).d();
                                                                                    }
                                                                                    if (this.u.u()) {
                                                                                        xxdVarD = defpackage.xxd.d(xxeVar);
                                                                                        xxeVar = xxdVarD;
                                                                                    } else {
                                                                                        xxdVarD = null;
                                                                                    }
                                                                                    if (this.t.a(defpackage.xsc.class)) {
                                                                                        l();
                                                                                    }
                                                                                    n();
                                                                                    xwuVar = this.s;
                                                                                    synchronized (xwuVar) {
                                                                                        xwuVar.g = xxeVar;
                                                                                        xwuVar.h = xucVar;
                                                                                        synchronized (xwuVar) {
                                                                                            xwuVar.b.a();
                                                                                            if (xwuVar.m) {
                                                                                                xwuVar.g.e();
                                                                                                xwuVar.f();
                                                                                            } else {
                                                                                                xwtVar = xwuVar.a;
                                                                                                if (!xwtVar.d()) {
                                                                                                    throw new java.lang.IllegalStateException("Received a resource without any callbacks to notify");
                                                                                                }
                                                                                                if (!xwuVar.i) {
                                                                                                    throw new java.lang.IllegalStateException("Already have resource");
                                                                                                }
                                                                                                xwuVar.l = new defpackage.xwy(xwuVar.g, xwuVar.f, xwuVar.e, xwuVar.c);
                                                                                                boolean z5 = z;
                                                                                                xwuVar.i = z5;
                                                                                                defpackage.xwt<defpackage.xws> xwtVarB2 = xwtVar.b();
                                                                                                xwuVar.e(xwtVarB2.a() + (z5 ? 1 : 0));
                                                                                                xwuVar.d.c(xwuVar, xwuVar.e, xwuVar.l);
                                                                                                while (r0.hasNext()) {
                                                                                                    xwsVar.b.execute(new defpackage.xwr(xwuVar, xwsVar.a, 2, null));
                                                                                                }
                                                                                                xwuVar.d();
                                                                                            }
                                                                                            this.G = 5;
                                                                                            aliqVar = this.u;
                                                                                            if (aliqVar.u()) {
                                                                                                this.r.a().c(aliqVar.b, new defpackage.rju((defpackage.xue) aliqVar.c, aliqVar.a, this.k));
                                                                                                ((defpackage.xxd) aliqVar.a).f();
                                                                                            }
                                                                                            if (xxdVarD != null) {
                                                                                                xxdVarD.f();
                                                                                            }
                                                                                            if (this.c.b()) {
                                                                                                b();
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                i8 = i + 1;
                                                                                xusVar3 = xusVar;
                                                                                i6 = i2;
                                                                                i7 = i3;
                                                                                list3 = list;
                                                                                xvbVar2 = xvbVar;
                                                                                size = i4;
                                                                            }
                                                                        } else {
                                                                            i = i8;
                                                                            xvbVar = xvbVar2;
                                                                            i4 = size;
                                                                        }
                                                                        xxeVarD = xxeVarA2;
                                                                    } else {
                                                                        i = i8;
                                                                        xvbVar = xvbVar2;
                                                                        i4 = size;
                                                                        xxeVarD = xuwVarA.b(this.d, xxeVarA2, this.h, this.i);
                                                                    }
                                                                    xuwVar = xuwVarA;
                                                                } catch (defpackage.xxa e5) {
                                                                    e = e5;
                                                                    i = i8;
                                                                    xvbVar = xvbVar2;
                                                                    i4 = size;
                                                                    list2.add(e);
                                                                    if (xxeVarA == null) {
                                                                        break;
                                                                        xxeVar = xxeVarA;
                                                                        if (xxeVar != null) {
                                                                            throw new defpackage.xxa(xxcVarB.c, new java.util.ArrayList(list2));
                                                                        }
                                                                        xxcVarB.a.b(list2);
                                                                        xvdVarA.b();
                                                                        if (android.util.Log.isLoggable("DecodeJob", 2)) {
                                                                            j(hgb.k(xxeVar, "Decoded result "), jElapsedRealtimeNanos, null);
                                                                        }
                                                                        xvbVar.e();
                                                                        if (xxeVar != null) {
                                                                            m();
                                                                            return;
                                                                        }
                                                                        xucVar = this.C;
                                                                        if (xxeVar instanceof defpackage.xxb) {
                                                                            ((defpackage.xxb) xxeVar).d();
                                                                        }
                                                                        if (this.u.u()) {
                                                                            xxdVarD = defpackage.xxd.d(xxeVar);
                                                                            xxeVar = xxdVarD;
                                                                        } else {
                                                                            xxdVarD = null;
                                                                        }
                                                                        if (this.t.a(defpackage.xsc.class)) {
                                                                            l();
                                                                        }
                                                                        n();
                                                                        xwuVar = this.s;
                                                                        synchronized (xwuVar) {
                                                                            xwuVar.g = xxeVar;
                                                                            xwuVar.h = xucVar;
                                                                            synchronized (xwuVar) {
                                                                                xwuVar.b.a();
                                                                                if (xwuVar.m) {
                                                                                    xwuVar.g.e();
                                                                                    xwuVar.f();
                                                                                } else {
                                                                                    xwtVar = xwuVar.a;
                                                                                    if (!xwtVar.d()) {
                                                                                        throw new java.lang.IllegalStateException("Received a resource without any callbacks to notify");
                                                                                    }
                                                                                    if (!xwuVar.i) {
                                                                                        throw new java.lang.IllegalStateException("Already have resource");
                                                                                    }
                                                                                    xwuVar.l = new defpackage.xwy(xwuVar.g, xwuVar.f, xwuVar.e, xwuVar.c);
                                                                                    boolean z6 = z;
                                                                                    xwuVar.i = z6;
                                                                                    defpackage.xwt<defpackage.xws> xwtVarB3 = xwtVar.b();
                                                                                    xwuVar.e(xwtVarB3.a() + (z6 ? 1 : 0));
                                                                                    xwuVar.d.c(xwuVar, xwuVar.e, xwuVar.l);
                                                                                    while (r0.hasNext()) {
                                                                                        xwsVar.b.execute(new defpackage.xwr(xwuVar, xwsVar.a, 2, null));
                                                                                    }
                                                                                    xwuVar.d();
                                                                                }
                                                                                this.G = 5;
                                                                                aliqVar = this.u;
                                                                                if (aliqVar.u()) {
                                                                                    this.r.a().c(aliqVar.b, new defpackage.rju((defpackage.xue) aliqVar.c, aliqVar.a, this.k));
                                                                                    ((defpackage.xxd) aliqVar.a).f();
                                                                                }
                                                                                if (xxdVarD != null) {
                                                                                    xxdVarD.f();
                                                                                }
                                                                                if (this.c.b()) {
                                                                                    b();
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    i8 = i + 1;
                                                                    xusVar3 = xusVar;
                                                                    i6 = i2;
                                                                    i7 = i3;
                                                                    list3 = list;
                                                                    xvbVar2 = xvbVar;
                                                                    size = i4;
                                                                }
                                                            } else {
                                                                list = list5;
                                                                i = i8;
                                                                xvbVar = xvbVar2;
                                                                i4 = size;
                                                                xxeVarD = xxeVarA2;
                                                                xuwVar = null;
                                                            }
                                                            if (!xxeVarA2.equals(xxeVarD)) {
                                                                xxeVarA2.e();
                                                            }
                                                            defpackage.xwd xwdVar2 = this.b;
                                                            if (xwdVar2.c.a().c.l(xxeVarD.b()) != null) {
                                                                xuvVarL = xwdVar2.c.a().c.l(xxeVarD.b());
                                                                if (xuvVarL == null) {
                                                                    throw new defpackage.xsq(xxeVarD.b());
                                                                }
                                                                iB = xuvVarL.b();
                                                            } else {
                                                                iB = 3;
                                                                xuvVarL = null;
                                                            }
                                                            defpackage.xuo xuoVar = this.n;
                                                            java.util.List listE = xwdVar2.e();
                                                            int size2 = listE.size();
                                                            int i9 = 0;
                                                            while (true) {
                                                                if (i9 >= size2) {
                                                                    z2 = false;
                                                                    break;
                                                                }
                                                                int i10 = i9;
                                                                if (((ucm) listE.get(i9)).a.equals(xuoVar)) {
                                                                    z2 = true;
                                                                    break;
                                                                }
                                                                i9 = i10 + 1;
                                                            }
                                                            if (this.j.d(!z2, xucVar2, iB) && (!this.t.a(defpackage.xrs.class) || !e(xxeVarD))) {
                                                                if (xuvVarL == null) {
                                                                    throw new defpackage.xsq(xxeVarD.c().getClass());
                                                                }
                                                                java.lang.Object xxgVar = iB + (-1) != 0 ? new defpackage.xxg(xwdVar2.h(), this.n, this.e, this.h, this.i, xuwVar, cls, this.k) : new defpackage.xwa(this.n, this.e);
                                                                xxeVarD = defpackage.xxd.d(xxeVarD);
                                                                defpackage.aliq aliqVar2 = this.u;
                                                                aliqVar2.b = xxgVar;
                                                                aliqVar2.c = xuvVarL;
                                                                aliqVar2.a = xxeVarD;
                                                            }
                                                            xxeVarA = xwgVar.a.a(xxeVarD, xusVar);
                                                        } catch (defpackage.xxa e6) {
                                                            e = e6;
                                                            list = list5;
                                                        }
                                                    } catch (java.lang.Throwable th4) {
                                                        xwgVar.b.b(list4);
                                                        throw th4;
                                                    }
                                                } catch (defpackage.xxa e7) {
                                                    e = e7;
                                                    i = i8;
                                                    xvbVar = xvbVar2;
                                                    i2 = i6;
                                                    i3 = i7;
                                                    i4 = size;
                                                    list = list3;
                                                    xusVar = xusVar3;
                                                }
                                                if (xxeVarA == null) {
                                                    break;
                                                }
                                                i8 = i + 1;
                                                xusVar3 = xusVar;
                                                i6 = i2;
                                                i7 = i3;
                                                list3 = list;
                                                xvbVar2 = xvbVar;
                                                size = i4;
                                            } catch (java.lang.Throwable th5) {
                                                th = th5;
                                            }
                                        }
                                        xxeVar = xxeVarA;
                                        if (xxeVar != null) {
                                            throw new defpackage.xxa(xxcVarB.c, new java.util.ArrayList(list2));
                                        }
                                        xxcVarB.a.b(list2);
                                        xvdVarA.b();
                                        if (android.util.Log.isLoggable("DecodeJob", 2)) {
                                            j(hgb.k(xxeVar, "Decoded result "), jElapsedRealtimeNanos, null);
                                        }
                                        xvbVar.e();
                                    } catch (java.lang.Throwable th6) {
                                        th = th6;
                                    }
                                } catch (java.lang.Throwable th7) {
                                    th = th7;
                                    xvdVarA.b();
                                    throw th;
                                }
                            } catch (java.lang.Throwable th8) {
                                th = th8;
                                xvdVarA.b();
                                throw th;
                            }
                        } catch (java.lang.Throwable th9) {
                            th = th9;
                            xvbVar2.e();
                            throw th;
                        }
                    } catch (java.lang.Throwable th10) {
                        th = th10;
                    }
                }
            } catch (defpackage.xxa e8) {
                e = e8;
                e.b(this.A, this.C, null);
                this.v.add(e);
                xxeVar = null;
            }
        } catch (defpackage.xxa e9) {
            e = e9;
            z = true;
        }
        if (xxeVar != null) {
            m();
            return;
        }
        xucVar = this.C;
        if (xxeVar instanceof defpackage.xxb) {
            ((defpackage.xxb) xxeVar).d();
        }
        if (this.u.u()) {
            xxdVarD = defpackage.xxd.d(xxeVar);
            xxeVar = xxdVarD;
        } else {
            xxdVarD = null;
        }
        if (this.t.a(defpackage.xsc.class)) {
            l();
        }
        n();
        xwuVar = this.s;
        synchronized (xwuVar) {
            xwuVar.g = xxeVar;
            xwuVar.h = xucVar;
        }
        synchronized (xwuVar) {
            xwuVar.b.a();
            if (xwuVar.m) {
                xwuVar.g.e();
                xwuVar.f();
            } else {
                xwtVar = xwuVar.a;
                if (!xwtVar.d()) {
                    throw new java.lang.IllegalStateException("Received a resource without any callbacks to notify");
                }
                if (!xwuVar.i) {
                    throw new java.lang.IllegalStateException("Already have resource");
                }
                xwuVar.l = new defpackage.xwy(xwuVar.g, xwuVar.f, xwuVar.e, xwuVar.c);
                boolean z7 = z;
                xwuVar.i = z7;
                defpackage.xwt<defpackage.xws> xwtVarB4 = xwtVar.b();
                xwuVar.e(xwtVarB4.a() + (z7 ? 1 : 0));
                xwuVar.d.c(xwuVar, xwuVar.e, xwuVar.l);
                while (r0.hasNext()) {
                    xwsVar.b.execute(new defpackage.xwr(xwuVar, xwsVar.a, 2, null));
                }
                xwuVar.d();
            }
        }
        this.G = 5;
        aliqVar = this.u;
        if (aliqVar.u()) {
            this.r.a().c(aliqVar.b, new defpackage.rju((defpackage.xue) aliqVar.c, aliqVar.a, this.k));
            ((defpackage.xxd) aliqVar.a).f();
        }
        if (xxdVarD != null) {
            xxdVarD.f();
        }
        if (this.c.b()) {
            b();
        }
    }

    private final void j(java.lang.String str, long j, java.lang.String str2) {
        double dA = defpackage.yfx.a(j);
        java.lang.String strValueOf = java.lang.String.valueOf(this.g);
        java.lang.String strConcat = str2 != null ? ", ".concat(str2) : "";
        android.util.Log.v("DecodeJob", str + " in " + dA + ", load key: " + strValueOf + strConcat + ", thread: " + java.lang.Thread.currentThread().getName());
    }

    private final void k() {
        if (this.t.a(defpackage.xsc.class)) {
            l();
        }
        n();
        defpackage.xxa xxaVar = new defpackage.xxa("Failed to load resource", new java.util.ArrayList(this.v));
        defpackage.xwu xwuVar = this.s;
        synchronized (xwuVar) {
            xwuVar.j = xxaVar;
        }
        synchronized (xwuVar) {
            xwuVar.b.a();
            if (xwuVar.m) {
                xwuVar.f();
            } else {
                defpackage.xwt xwtVar = xwuVar.a;
                if (xwtVar.d()) {
                    throw new java.lang.IllegalStateException("Received an exception without any callbacks to notify");
                }
                if (xwuVar.k) {
                    throw new java.lang.IllegalStateException("Already failed once");
                }
                xwuVar.k = true;
                defpackage.xuo xuoVar = xwuVar.e;
                defpackage.xwt<defpackage.xws> xwtVarB = xwtVar.b();
                xwuVar.e(xwtVarB.a() + 1);
                xwuVar.d.c(xwuVar, xuoVar, null);
                for (defpackage.xws xwsVar : xwtVarB) {
                    xwsVar.b.execute(new defpackage.xwr(xwuVar, xwsVar.a, 0));
                }
                xwuVar.d();
            }
        }
        if (this.c.c()) {
            b();
        }
    }

    private final void l() {
        if (!this.t.a(defpackage.xsc.class)) {
            throw new java.lang.IllegalStateException("OverrideGlideThreadPriority experiment is not enabled.");
        }
        java.util.function.Supplier supplier = this.m;
        if (supplier == null || aa$.ExternalSyntheticApiModelOutline1.m(supplier) == null) {
            return;
        }
        try {
            android.os.Process.setThreadPriority(android.os.Process.myTid(), 9);
        } catch (java.lang.IllegalArgumentException | java.lang.SecurityException e) {
            this.m = null;
            if (android.util.Log.isLoggable("DecodeJob", 2)) {
                android.util.Log.v("DecodeJob", "Failed to set thread priority; using default priority for any subsequent jobs.", e);
            }
        }
    }

    private final void m() {
        this.z = java.lang.Thread.currentThread();
        int i = defpackage.yfx.a;
        this.y = android.os.SystemClock.elapsedRealtimeNanos();
        boolean zB = false;
        while (!this.p && this.o != null && !(zB = this.o.b())) {
            this.G = f(this.G);
            this.o = h();
            if (this.G == 4) {
                g(2);
                return;
            }
        }
        if ((this.G == 6 || this.p) && !zB) {
            k();
        }
    }

    private final void n() {
        this.w.a();
        if (this.E) {
            java.util.List list = this.v;
            throw new java.lang.IllegalStateException("Already notified", list.isEmpty() ? null : (java.lang.Throwable) list.get(list.size() - 1));
        }
        this.E = true;
    }

    public final void b() {
        this.c.a();
        defpackage.aliq aliqVar = this.u;
        aliqVar.b = null;
        aliqVar.c = null;
        aliqVar.a = null;
        defpackage.xwd xwdVar = this.b;
        xwdVar.c = null;
        xwdVar.d = null;
        xwdVar.m = null;
        xwdVar.g = null;
        xwdVar.j = null;
        xwdVar.h = null;
        xwdVar.n = null;
        xwdVar.i = null;
        xwdVar.o = null;
        xwdVar.a.clear();
        xwdVar.k = false;
        xwdVar.b.clear();
        xwdVar.l = false;
        this.E = false;
        this.d = null;
        this.e = null;
        this.k = null;
        this.f = null;
        this.g = null;
        this.s = null;
        this.G = 0;
        this.o = null;
        this.z = null;
        this.n = null;
        this.B = null;
        this.C = null;
        this.D = null;
        this.y = 0L;
        this.p = false;
        this.v.clear();
        this.x.b(this);
    }

    @Override // defpackage.xwb
    public final void c(defpackage.xuo xuoVar, java.lang.Exception exc, defpackage.xvb xvbVar, defpackage.xuc xucVar) {
        xvbVar.e();
        defpackage.xxa xxaVar = new defpackage.xxa("Fetching data failed", exc);
        xxaVar.b(xuoVar, xucVar, xvbVar.a());
        this.v.add(xxaVar);
        if (java.lang.Thread.currentThread() != this.z) {
            g(2);
        } else {
            m();
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object obj) {
        defpackage.xwf xwfVar = (defpackage.xwf) obj;
        int iCompareTo = this.f.compareTo(xwfVar.f);
        return iCompareTo == 0 ? this.l - xwfVar.l : iCompareTo;
    }

    @Override // defpackage.xwb
    public final void d(defpackage.xuo xuoVar, java.lang.Object obj, defpackage.xvb xvbVar, defpackage.xuc xucVar, defpackage.xuo xuoVar2) throws java.lang.Throwable {
        this.n = xuoVar;
        this.B = obj;
        this.D = xvbVar;
        this.C = xucVar;
        this.A = xuoVar2;
        this.F = xuoVar != this.b.d().get(0);
        if (java.lang.Thread.currentThread() == this.z) {
            i();
        } else {
            g(3);
        }
    }

    @Override // defpackage.ygh
    public final defpackage.ygk ez() {
        return this.w;
    }

    public final int f(int i) {
        if (i == 0) {
            throw null;
        }
        int i2 = i - 1;
        if (i2 == 0) {
            if (this.j.b()) {
                return 2;
            }
            return f(2);
        }
        if (i2 == 1) {
            if (this.j.a()) {
                return 3;
            }
            return f(3);
        }
        if (i2 == 2) {
            return 4;
        }
        if (i2 == 3 || i2 == 5) {
            return 6;
        }
        throw new java.lang.IllegalArgumentException("Unrecognized stage: ".concat(defpackage.xff.u(i)));
    }

    public final void g(int i) {
        this.q = i;
        this.s.b().execute(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        defpackage.xvb xvbVar = this.D;
        try {
            try {
                if (this.p) {
                    k();
                } else {
                    int i = this.q;
                    int i2 = i - 1;
                    if (i == 0) {
                        throw null;
                    }
                    if (i2 == 0) {
                        this.G = f(1);
                        this.o = h();
                        m();
                    } else if (i2 == 1) {
                        m();
                    } else {
                        if (i2 != 2) {
                            if (i != 1) {
                                str = i != 2 ? "DECODE_DATA" : "SWITCH_TO_SOURCE_SERVICE";
                            } else {
                                str = "INITIALIZE";
                            }
                            throw new java.lang.IllegalStateException("Unrecognized run reason: ".concat(str));
                        }
                        i();
                    }
                }
                if (xvbVar != null) {
                    xvbVar.e();
                }
            } catch (java.lang.Throwable th) {
                if (xvbVar != null) {
                    xvbVar.e();
                }
                throw th;
            }
        } catch (defpackage.xvy e) {
            throw e;
        } catch (java.lang.Throwable th2) {
            if (android.util.Log.isLoggable("DecodeJob", 3)) {
                android.util.Log.d("DecodeJob", "DecodeJob threw unexpectedly, isCancelled: " + this.p + ", stage: " + defpackage.xff.u(this.G), th2);
            }
            if (this.G != 5) {
                this.v.add(th2);
                k();
            }
            if (!this.p) {
                throw th2;
            }
            throw th2;
        }
    }
}
