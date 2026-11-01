package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ezx implements defpackage.fae {
    private static final java.util.Random d = new java.util.Random();
    public defpackage.fad c;
    private java.lang.String g;
    public final defpackage.erl a = new defpackage.erl();
    public final defpackage.erk b = new defpackage.erk();
    private final java.util.HashMap e = new java.util.HashMap();
    private defpackage.erm f = defpackage.erm.a;
    private long h = -1;

    public static java.lang.String b() {
        byte[] bArr = new byte[12];
        d.nextBytes(bArr);
        return android.util.Base64.encodeToString(bArr, 10);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x006e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0080 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    private final defpackage.ezw i(int i, defpackage.ffu ffuVar) {
        long j;
        java.util.HashMap map = this.e;
        long j2 = Long.MAX_VALUE;
        defpackage.ezw ezwVar = null;
        for (defpackage.ezw ezwVar2 : map.values()) {
            if (ezwVar2.c == -1 && i == ezwVar2.b && ffuVar != null) {
                long jA = ezwVar2.g.a();
                long j3 = ffuVar.d;
                if (j3 >= jA) {
                    ezwVar2.c = j3;
                }
            }
            if (ffuVar != null) {
                long j4 = ffuVar.d;
                if (j4 != -1) {
                    defpackage.ffu ffuVar2 = ezwVar2.d;
                    if (ffuVar2 == null) {
                        if (!ffuVar.c() && j4 == ezwVar2.c) {
                            j = ezwVar2.c;
                            if (j != -1 || j < j2) {
                                ezwVar = ezwVar2;
                                j2 = j;
                            } else if (j == j2) {
                                java.lang.String str = eum.a;
                                if (ezwVar.d != null && ezwVar2.d != null) {
                                    ezwVar = ezwVar2;
                                }
                            }
                        }
                    } else if (j4 == ffuVar2.d && ffuVar.b == ffuVar2.b && ffuVar.c == ffuVar2.c) {
                        j = ezwVar2.c;
                        if (j != -1) {
                        }
                        ezwVar = ezwVar2;
                        j2 = j;
                    }
                }
            }
            if (i == ezwVar2.b) {
                j = ezwVar2.c;
                if (j != -1) {
                }
                ezwVar = ezwVar2;
                j2 = j;
            }
        }
        if (ezwVar != null) {
            return ezwVar;
        }
        java.lang.String strB = b();
        defpackage.ezw ezwVar3 = new defpackage.ezw(this, strB, i, ffuVar);
        map.put(strB, ezwVar3);
        return ezwVar3;
    }

    private final void j(defpackage.ezw ezwVar) {
        long j = ezwVar.c;
        if (j != -1 && ezwVar.e) {
            this.h = j;
        }
        this.g = null;
    }

    private final void k(defpackage.ezm ezmVar) {
        defpackage.ffu ffuVar;
        if (ezmVar.b.n()) {
            java.lang.String str = this.g;
            if (str != null) {
                defpackage.ezw ezwVar = (defpackage.ezw) this.e.get(str);
                ahvr.ci(ezwVar);
                j(ezwVar);
                return;
            }
            return;
        }
        defpackage.ezw ezwVar2 = (defpackage.ezw) this.e.get(this.g);
        int i = ezmVar.c;
        defpackage.ffu ffuVar2 = ezmVar.d;
        this.g = i(i, ffuVar2).a;
        f(ezmVar);
        if (ffuVar2 == null || !ffuVar2.c()) {
            return;
        }
        if (ezwVar2 != null) {
            if (ezwVar2.c == ffuVar2.d && (ffuVar = ezwVar2.d) != null) {
                if (ffuVar.b == ffuVar2.b && ffuVar.c == ffuVar2.c) {
                    return;
                }
            }
        }
        i(i, new defpackage.ffu(ffuVar2.a, -1, -1, ffuVar2.d, -1));
    }

    public final long a() {
        defpackage.ezw ezwVar = (defpackage.ezw) this.e.get(this.g);
        if (ezwVar != null) {
            long j = ezwVar.c;
            if (j != -1) {
                return j;
            }
        }
        return this.h + 1;
    }

    @Override // defpackage.fae
    public final synchronized java.lang.String c() {
        return this.g;
    }

    @Override // defpackage.fae
    public final synchronized java.lang.String d(defpackage.erm ermVar, defpackage.ffu ffuVar) {
        return i(ermVar.m(ffuVar.a, this.b).c, ffuVar).a;
    }

    @Override // defpackage.fae
    public final synchronized void e(defpackage.ezm ezmVar) {
        defpackage.fad fadVar;
        java.lang.String str = this.g;
        if (str != null) {
            defpackage.ezw ezwVar = (defpackage.ezw) this.e.get(str);
            ahvr.ci(ezwVar);
            j(ezwVar);
        }
        java.util.Iterator it = this.e.values().iterator();
        while (it.hasNext()) {
            defpackage.ezw ezwVar2 = (defpackage.ezw) it.next();
            it.remove();
            if (ezwVar2.e && (fadVar = this.c) != null) {
                fadVar.g(ezmVar, ezwVar2.a);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003a A[Catch: all -> 0x00fa, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000e, B:7:0x0012, B:9:0x001a, B:11:0x0022, B:13:0x002e, B:15:0x0034, B:17:0x003a, B:19:0x0044, B:21:0x004a, B:23:0x0050, B:25:0x0065, B:26:0x0078, B:28:0x007c, B:29:0x007f, B:31:0x0089, B:33:0x008d, B:35:0x0094, B:37:0x009a, B:39:0x00b8, B:40:0x00c1, B:42:0x00ca, B:43:0x00da, B:45:0x00e1, B:46:0x00f1), top: B:55:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0044 A[Catch: all -> 0x00fa, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000e, B:7:0x0012, B:9:0x001a, B:11:0x0022, B:13:0x002e, B:15:0x0034, B:17:0x003a, B:19:0x0044, B:21:0x004a, B:23:0x0050, B:25:0x0065, B:26:0x0078, B:28:0x007c, B:29:0x007f, B:31:0x0089, B:33:0x008d, B:35:0x0094, B:37:0x009a, B:39:0x00b8, B:40:0x00c1, B:42:0x00ca, B:43:0x00da, B:45:0x00e1, B:46:0x00f1), top: B:55:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0065 A[Catch: all -> 0x00fa, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000e, B:7:0x0012, B:9:0x001a, B:11:0x0022, B:13:0x002e, B:15:0x0034, B:17:0x003a, B:19:0x0044, B:21:0x004a, B:23:0x0050, B:25:0x0065, B:26:0x0078, B:28:0x007c, B:29:0x007f, B:31:0x0089, B:33:0x008d, B:35:0x0094, B:37:0x009a, B:39:0x00b8, B:40:0x00c1, B:42:0x00ca, B:43:0x00da, B:45:0x00e1, B:46:0x00f1), top: B:55:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x007c A[Catch: all -> 0x00fa, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000e, B:7:0x0012, B:9:0x001a, B:11:0x0022, B:13:0x002e, B:15:0x0034, B:17:0x003a, B:19:0x0044, B:21:0x004a, B:23:0x0050, B:25:0x0065, B:26:0x0078, B:28:0x007c, B:29:0x007f, B:31:0x0089, B:33:0x008d, B:35:0x0094, B:37:0x009a, B:39:0x00b8, B:40:0x00c1, B:42:0x00ca, B:43:0x00da, B:45:0x00e1, B:46:0x00f1), top: B:55:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00b8 A[Catch: all -> 0x00fa, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000e, B:7:0x0012, B:9:0x001a, B:11:0x0022, B:13:0x002e, B:15:0x0034, B:17:0x003a, B:19:0x0044, B:21:0x004a, B:23:0x0050, B:25:0x0065, B:26:0x0078, B:28:0x007c, B:29:0x007f, B:31:0x0089, B:33:0x008d, B:35:0x0094, B:37:0x009a, B:39:0x00b8, B:40:0x00c1, B:42:0x00ca, B:43:0x00da, B:45:0x00e1, B:46:0x00f1), top: B:55:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00ca A[Catch: all -> 0x00fa, LOOP:0: B:41:0x00c8->B:42:0x00ca, LOOP_END, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000e, B:7:0x0012, B:9:0x001a, B:11:0x0022, B:13:0x002e, B:15:0x0034, B:17:0x003a, B:19:0x0044, B:21:0x004a, B:23:0x0050, B:25:0x0065, B:26:0x0078, B:28:0x007c, B:29:0x007f, B:31:0x0089, B:33:0x008d, B:35:0x0094, B:37:0x009a, B:39:0x00b8, B:40:0x00c1, B:42:0x00ca, B:43:0x00da, B:45:0x00e1, B:46:0x00f1), top: B:55:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00e1 A[Catch: all -> 0x00fa, LOOP:1: B:44:0x00df->B:45:0x00e1, LOOP_END, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000e, B:7:0x0012, B:9:0x001a, B:11:0x0022, B:13:0x002e, B:15:0x0034, B:17:0x003a, B:19:0x0044, B:21:0x004a, B:23:0x0050, B:25:0x0065, B:26:0x0078, B:28:0x007c, B:29:0x007f, B:31:0x0089, B:33:0x008d, B:35:0x0094, B:37:0x009a, B:39:0x00b8, B:40:0x00c1, B:42:0x00ca, B:43:0x00da, B:45:0x00e1, B:46:0x00f1), top: B:55:0x0001 }] */
    @Override // defpackage.fae
    public final synchronized void f(defpackage.ezm ezmVar) {
        int i;
        defpackage.ezw ezwVarI;
        java.lang.String str;
        android.media.metrics.PlaybackMetrics.Builder builderM;
        int i2;
        int i3;
        java.lang.Object obj;
        int i4;
        defpackage.ezw ezwVarI2;
        defpackage.ezw ezwVar;
        ahvr.ci(this.c);
        defpackage.erm ermVar = ezmVar.b;
        if (!ermVar.n()) {
            defpackage.ffu ffuVar = ezmVar.d;
            if (ffuVar != null) {
                long j = ffuVar.d;
                if ((j == -1 || j >= a()) && ((ezwVar = (defpackage.ezw) this.e.get(this.g)) == null || ezwVar.c != -1 || ezwVar.b == ezmVar.c)) {
                    i = ezmVar.c;
                    ezwVarI = i(i, ffuVar);
                    if (this.g == null) {
                        this.g = ezwVarI.a;
                    }
                    if (ffuVar != null && ffuVar.c()) {
                        obj = ffuVar.a;
                        long j2 = ffuVar.d;
                        i4 = ffuVar.b;
                        ezwVarI2 = i(i, new defpackage.ffu(obj, -1, -1, j2, i4));
                        if (!ezwVarI2.e) {
                            ezwVarI2.e = true;
                            defpackage.erk erkVar = this.b;
                            ermVar.m(obj, erkVar);
                            erkVar.k(i4);
                            eum.C(0L);
                            erkVar.f();
                        }
                    }
                    if (!ezwVarI.e) {
                        ezwVarI.e = true;
                    }
                    str = ezwVarI.a;
                    if (str.equals(this.g) && !ezwVarI.f) {
                        ezwVarI.f = true;
                        defpackage.fad fadVar = this.c;
                        if (ffuVar != null || !ffuVar.c()) {
                            fadVar.b();
                            fadVar.h = str;
                            fadVar.i = ac$.ExternalSyntheticApiModelOutline0.m$1(ac$.ExternalSyntheticApiModelOutline0.m(new android.media.metrics.PlaybackMetrics.Builder(), "AndroidXMedia3"), "1.11.1");
                            builderM = fadVar.i;
                            if (!defpackage.eqe.a) {
                                builderM = ac$.ExternalSyntheticApiModelOutline0.m(builderM, 7000000000000000000L);
                            }
                            for (int i5 : defpackage.eqe.c(true)) {
                                builderM = ac$.ExternalSyntheticApiModelOutline0.m(builderM, ((long) i5) + 7001000000000000000L);
                            }
                            for (int i6 : defpackage.eqe.c(false)) {
                                builderM = ac$.ExternalSyntheticApiModelOutline0.m(builderM, ((long) i6) + 7002000000000000000L);
                            }
                            fadVar.c(ermVar, ffuVar);
                        }
                    }
                }
            } else {
                i = ezmVar.c;
                ezwVarI = i(i, ffuVar);
                if (this.g == null) {
                    this.g = ezwVarI.a;
                }
                if (ffuVar != null) {
                    obj = ffuVar.a;
                    long j3 = ffuVar.d;
                    i4 = ffuVar.b;
                    ezwVarI2 = i(i, new defpackage.ffu(obj, -1, -1, j3, i4));
                    if (!ezwVarI2.e) {
                        ezwVarI2.e = true;
                        defpackage.erk erkVar2 = this.b;
                        ermVar.m(obj, erkVar2);
                        erkVar2.k(i4);
                        eum.C(0L);
                        erkVar2.f();
                    }
                }
                if (!ezwVarI.e) {
                    ezwVarI.e = true;
                }
                str = ezwVarI.a;
                if (str.equals(this.g)) {
                    ezwVarI.f = true;
                    defpackage.fad fadVar2 = this.c;
                    if (ffuVar != null) {
                    }
                    fadVar2.b();
                    fadVar2.h = str;
                    fadVar2.i = ac$.ExternalSyntheticApiModelOutline0.m$1(ac$.ExternalSyntheticApiModelOutline0.m(new android.media.metrics.PlaybackMetrics.Builder(), "AndroidXMedia3"), "1.11.1");
                    builderM = fadVar2.i;
                    if (!defpackage.eqe.a) {
                        builderM = ac$.ExternalSyntheticApiModelOutline0.m(builderM, 7000000000000000000L);
                    }
                    while (i3 < r4) {
                        builderM = ac$.ExternalSyntheticApiModelOutline0.m(builderM, ((long) i5) + 7001000000000000000L);
                    }
                    while (i2 < r4) {
                        builderM = ac$.ExternalSyntheticApiModelOutline0.m(builderM, ((long) i6) + 7002000000000000000L);
                    }
                    fadVar2.c(ermVar, ffuVar);
                }
            }
        }
    }

    @Override // defpackage.fae
    public final synchronized void g(defpackage.ezm ezmVar, int i) {
        ahvr.ci(this.c);
        java.util.Iterator it = this.e.values().iterator();
        while (it.hasNext()) {
            defpackage.ezw ezwVar = (defpackage.ezw) it.next();
            if (ezwVar.a(ezmVar)) {
                it.remove();
                java.lang.String str = ezwVar.a;
                boolean zEquals = str.equals(this.g);
                if (zEquals) {
                    j(ezwVar);
                }
                if (ezwVar.e) {
                    if (i == 0 && zEquals) {
                        boolean z = ezwVar.f;
                    }
                    this.c.g(ezmVar, str);
                }
            }
        }
        k(ezmVar);
    }

    @Override // defpackage.fae
    public final synchronized void h(defpackage.ezm ezmVar) {
        defpackage.ffu ffuVar;
        ahvr.ci(this.c);
        defpackage.erm ermVar = this.f;
        this.f = ezmVar.b;
        java.util.Iterator it = this.e.values().iterator();
        while (it.hasNext()) {
            defpackage.ezw ezwVar = (defpackage.ezw) it.next();
            defpackage.erm ermVar2 = this.f;
            int i = ezwVar.b;
            if (i < ermVar.c()) {
                defpackage.ezx ezxVar = ezwVar.g;
                defpackage.erl erlVar = ezxVar.a;
                ermVar.e(i, erlVar, 0L);
                int i2 = erlVar.n;
                while (true) {
                    if (i2 > erlVar.o) {
                        i = -1;
                        break;
                    }
                    int iA = ermVar2.a(ermVar.f(i2));
                    if (iA != -1) {
                        i = ermVar2.d(iA, ezxVar.b, false).c;
                        break;
                    }
                    i2++;
                }
            } else if (i >= ermVar2.c()) {
                i = -1;
                break;
            }
            ezwVar.b = i;
            if (i == -1 || (((ffuVar = ezwVar.d) != null && ermVar2.a(ffuVar.a) == -1) || ezwVar.a(ezmVar))) {
                it.remove();
                java.lang.String str = ezwVar.a;
                if (str.equals(this.g)) {
                    j(ezwVar);
                }
                if (ezwVar.e) {
                    this.c.g(ezmVar, str);
                }
            }
        }
        k(ezmVar);
    }
}
