package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class jl implements java.lang.Runnable {
    public static final java.lang.ThreadLocal a = new java.lang.ThreadLocal();
    static final java.util.Comparator b = new defpackage.agl(1);
    long d;
    public long e;
    public final java.util.ArrayList c = new java.util.ArrayList();
    private final java.util.ArrayList f = new java.util.ArrayList();

    /* JADX WARN: Code duplicated, block: B:18:0x003e  */
    private static final defpackage.ld b(android.support.v7.widget.RecyclerView recyclerView, int i, long j) throws java.lang.Throwable {
        boolean z;
        int iB = recyclerView.h.b();
        for (int i2 = 0; i2 < iB; i2++) {
            defpackage.ld ldVarI = android.support.v7.widget.RecyclerView.i(recyclerView.h.e(i2));
            if (ldVarI.c == i && !ldVarI.t()) {
                return null;
            }
        }
        defpackage.kt ktVar = recyclerView.e;
        if (j == Long.MAX_VALUE) {
            try {
                if (da$.ExternalSyntheticApiModelOutline0.m()) {
                    z = true;
                    try {
                        android.os.Trace.beginSection("RV Prefetch forced - needed next frame");
                    } catch (java.lang.Throwable th) {
                        th = th;
                        recyclerView.P(false);
                        if (z) {
                            android.os.Trace.endSection();
                        }
                        throw th;
                    }
                } else {
                    z = false;
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                z = false;
            }
        } else {
            z = false;
        }
        recyclerView.O();
        defpackage.ld ldVarO = ktVar.o(i, j);
        if (ldVarO != null) {
            if (!ldVarO.s() || ldVarO.t()) {
                ktVar.b(ldVarO, false);
            } else {
                ktVar.i(ldVarO.a);
            }
        }
        recyclerView.P(false);
        if (z) {
            android.os.Trace.endSection();
        }
        return ldVarO;
    }

    public final void a(android.support.v7.widget.RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.q && this.d == 0) {
            this.d = java.lang.System.nanoTime();
            recyclerView.post(this);
        }
        defpackage.jj jjVar = recyclerView.K;
        jjVar.a = i;
        jjVar.b = i2;
    }

    @Override // java.lang.Runnable
    public final void run() throws java.lang.Throwable {
        jk jkVar;
        android.support.v7.widget.RecyclerView recyclerView;
        java.lang.ref.WeakReference weakReference;
        android.support.v7.widget.RecyclerView recyclerView2;
        jk jkVar2;
        long j = 0;
        try {
            android.os.Trace.beginSection("RV Prefetch");
            java.util.ArrayList arrayList = this.c;
            if (!arrayList.isEmpty()) {
                try {
                    int size = arrayList.size();
                    int i = 0;
                    long jMax = 0;
                    for (int i2 = 0; i2 < size; i2++) {
                        android.support.v7.widget.RecyclerView recyclerView3 = (android.support.v7.widget.RecyclerView) arrayList.get(i2);
                        if (recyclerView3.getWindowVisibility() == 0) {
                            jMax = java.lang.Math.max(recyclerView3.getDrawingTime(), jMax);
                        }
                    }
                    if (jMax != 0) {
                        long nanos = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(jMax) + this.e;
                        int size2 = arrayList.size();
                        int i3 = 0;
                        for (int i4 = 0; i4 < size2; i4++) {
                            android.support.v7.widget.RecyclerView recyclerView4 = (android.support.v7.widget.RecyclerView) arrayList.get(i4);
                            if (recyclerView4.getWindowVisibility() == 0) {
                                recyclerView4.K.c(recyclerView4, false);
                                i3 += recyclerView4.K.d;
                            }
                        }
                        java.util.ArrayList arrayList2 = this.f;
                        arrayList2.ensureCapacity(i3);
                        int i5 = 0;
                        int i6 = 0;
                        while (true) {
                            boolean z = true;
                            if (i5 >= size2) {
                                break;
                            }
                            android.support.v7.widget.RecyclerView recyclerView5 = (android.support.v7.widget.RecyclerView) arrayList.get(i5);
                            if (recyclerView5.getWindowVisibility() == 0) {
                                defpackage.jj jjVar = recyclerView5.K;
                                int iAbs = java.lang.Math.abs(jjVar.a) + java.lang.Math.abs(jjVar.b);
                                int i7 = i;
                                while (i7 < (jjVar.d << (z ? 1 : 0))) {
                                    if (i6 >= arrayList2.size()) {
                                        jkVar2 = new jk();
                                        arrayList2.add(jkVar2);
                                    } else {
                                        jkVar2 = (jk) arrayList2.get(i6);
                                    }
                                    int[] iArr = jjVar.c;
                                    int i8 = iArr[i7 + 1];
                                    if (i8 > iAbs) {
                                        z = false;
                                    }
                                    jkVar2.a = z;
                                    jkVar2.b = iAbs;
                                    jkVar2.c = i8;
                                    jkVar2.d = recyclerView5;
                                    jkVar2.e = iArr[i7];
                                    i6++;
                                    i7 += 2;
                                    z = true;
                                }
                            }
                            i5++;
                            i = 0;
                        }
                        java.util.Collections.sort(arrayList2, b);
                        for (int i9 = 0; i9 < arrayList2.size() && (recyclerView = (jkVar = (jk) arrayList2.get(i9)).d) != null; i9++) {
                            defpackage.ld ldVarB = b(recyclerView, jkVar.e, true != jkVar.a ? nanos : Long.MAX_VALUE);
                            if (ldVarB != null && (weakReference = ldVarB.b) != null && ldVarB.s() && !ldVarB.t() && (recyclerView2 = (android.support.v7.widget.RecyclerView) weakReference.get()) != null) {
                                if (recyclerView2.y && recyclerView2.h.b() != 0) {
                                    recyclerView2.T();
                                }
                                defpackage.jj jjVar2 = recyclerView2.K;
                                jjVar2.c(recyclerView2, true);
                                if (jjVar2.d != 0) {
                                    try {
                                        android.os.Trace.beginSection(nanos == Long.MAX_VALUE ? "RV Nested Prefetch" : "RV Nested Prefetch forced - needed next frame");
                                        defpackage.la laVar = recyclerView2.L;
                                        defpackage.kh khVar = recyclerView2.m;
                                        laVar.d = 1;
                                        laVar.e = khVar.a();
                                        laVar.g = false;
                                        laVar.h = false;
                                        laVar.i = false;
                                        for (int i10 = 0; i10 < (jjVar2.d << 1); i10 += 2) {
                                            b(recyclerView2, jjVar2.c[i10], nanos);
                                        }
                                        android.os.Trace.endSection();
                                    } catch (java.lang.Throwable th) {
                                        android.os.Trace.endSection();
                                        throw th;
                                    }
                                }
                            }
                            jkVar.a = false;
                            jkVar.b = 0;
                            jkVar.c = 0;
                            jkVar.d = null;
                            jkVar.e = 0;
                        }
                        j = 0;
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    j = 0;
                    this.d = j;
                    android.os.Trace.endSection();
                    throw th;
                }
            }
            this.d = j;
            android.os.Trace.endSection();
        } catch (java.lang.Throwable th3) {
            th = th3;
        }
    }
}
