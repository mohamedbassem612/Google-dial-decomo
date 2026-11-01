package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ni {
    public final java.lang.Object a;

    /* JADX WARN: Code duplicated, block: B:17:0x0029  */
    /* JADX WARN: Code duplicated, block: B:19:0x002c A[PHI: r9
      0x002c: PHI (r9v1 int) = (r9v0 int), (r9v3 int), (r9v4 int) binds: [B:5:0x0014, B:11:0x001e, B:13:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    public ni(int[] iArr, float[] fArr, float[][] fArr2) {
        int i;
        int length = fArr.length - 1;
        defpackage.aiz[][] aizVarArr = new defpackage.aiz[length][];
        int i2 = 0;
        int i3 = 1;
        int i4 = 1;
        while (i2 < length) {
            int i5 = iArr[i2];
            int i6 = 3;
            if (i5 == 0) {
                i = i6;
            } else if (i5 == 1) {
                i3 = 1;
                i = i3;
            } else {
                if (i5 != 2) {
                    if (i5 != 3) {
                        i6 = 4;
                        if (i5 != 4) {
                            i6 = 5;
                            if (i5 != 5) {
                                i = i4;
                            } else {
                                i = i6;
                            }
                        } else {
                            i = i6;
                        }
                    } else {
                        if (i3 != 1) {
                            i3 = 1;
                        }
                        i = i3;
                    }
                }
                i3 = 2;
                i = i3;
            }
            float[] fArr3 = fArr2[i2];
            int i7 = i2 + 1;
            float[] fArr4 = fArr2[i7];
            float f = fArr[i2];
            float f2 = fArr[i7];
            int length2 = fArr3.length;
            int i8 = (length2 & 1) + (length2 >> 1);
            defpackage.aiz[] aizVarArr2 = new defpackage.aiz[i8];
            int i9 = 0;
            while (i9 < i8) {
                int i10 = i9 << 1;
                defpackage.aiz[] aizVarArr3 = aizVarArr2;
                int i11 = i10 + 1;
                int i12 = i9;
                aizVarArr3[i12] = new defpackage.aiz(i, f, f2, fArr3[i10], fArr3[i11], fArr4[i10], fArr4[i11]);
                i9 = i12 + 1;
                i8 = i8;
                aizVarArr2 = aizVarArr3;
            }
            aizVarArr[i2] = aizVarArr2;
            i4 = i;
            i2 = i7;
        }
        this.a = aizVarArr;
    }

    public static defpackage.ni q(float f, float f2, float f3) {
        return new defpackage.ni(android.view.accessibility.AccessibilityNodeInfo.RangeInfo.obtain(1, f, f2, f3));
    }

    public static defpackage.ni r(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        return new defpackage.ni(android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z, z2));
    }

    public static defpackage.ni s(int i, int i2, boolean z) {
        return new defpackage.ni(android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z));
    }

    public static defpackage.ni t(int i, int i2, int i3) {
        return new defpackage.ni(android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, false, i3));
    }

    public final void A(defpackage.kop kopVar) {
        aooh.f(kopVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.kor korVar = (defpackage.kor) akzxVar.b;
        defpackage.kor korVar2 = defpackage.kor.a;
        j$.util.Objects.requireNonNull(kopVar);
        korVar.c = kopVar;
        korVar.b = 3;
    }

    public final void B(defpackage.koq koqVar) {
        aooh.f(koqVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.kor korVar = (defpackage.kor) akzxVar.b;
        defpackage.kor korVar2 = defpackage.kor.a;
        j$.util.Objects.requireNonNull(koqVar);
        korVar.c = koqVar;
        korVar.b = 2;
    }

    public final /* synthetic */ alct C() {
        java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(((akzx) this.a).b.b);
        aooh.e(listUnmodifiableList, "getRowList(...)");
        return new alct(listUnmodifiableList);
    }

    public final /* synthetic */ void D(alct alctVar, java.lang.Iterable iterable) {
        aooh.f(alctVar, "<this>");
        aooh.f(iterable, "values");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        kiv kivVar = akzxVar.b;
        kiv kivVar2 = kiv.a;
        kivVar.b();
        akyl.i(iterable, kivVar.b);
    }

    public final /* synthetic */ kiu E() {
        kiu kiuVarP = ((akzx) this.a).p();
        aooh.e(kiuVarP, "build(...)");
        return kiuVarP;
    }

    public final void F(defpackage.kiw kiwVar) {
        aooh.f(kiwVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        kiu kiuVar = akzxVar.b;
        kiu kiuVar2 = kiu.a;
        j$.util.Objects.requireNonNull(kiwVar);
        kiuVar.r = kiwVar;
        kiuVar.b |= 16384;
    }

    public final /* synthetic */ void G() {
        java.util.Map mapUnmodifiableMap = j$.util.DesugarCollections.unmodifiableMap(j$.util.DesugarCollections.unmodifiableMap(((akzx) this.a).b.L));
        aooh.e(mapUnmodifiableMap, "getFeatureDataMap(...)");
        new alcv(mapUnmodifiableMap);
    }

    public final /* synthetic */ defpackage.jqp H() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.jqp) aladVarP;
    }

    public final void I(ztf ztfVar) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.jqp jqpVar = (defpackage.jqp) akzxVar.b;
        defpackage.jqp jqpVar2 = defpackage.jqp.a;
        jqpVar.c = ztfVar.a();
        jqpVar.b |= 1;
    }

    public final /* synthetic */ defpackage.jmz J() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.jmz) aladVarP;
    }

    public final void K() {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.jmz jmzVar = (defpackage.jmz) akzxVar.b;
        defpackage.jmz jmzVar2 = defpackage.jmz.a;
        jmzVar.b |= 1;
        jmzVar.c = true;
    }

    public final void L(int i) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.jmz jmzVar = (defpackage.jmz) akzxVar.b;
        defpackage.jmz jmzVar2 = defpackage.jmz.a;
        jmzVar.d = i - 1;
        jmzVar.b |= 2;
    }

    public final /* synthetic */ defpackage.jlw M() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.jlw) aladVarP;
    }

    public final void N(defpackage.jmu jmuVar) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.jlw jlwVar = (defpackage.jlw) akzxVar.b;
        defpackage.jlw jlwVar2 = defpackage.jlw.a;
        jlwVar.f = jmuVar.a();
        jlwVar.b |= 32;
    }

    public final void O(int i) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.jlw jlwVar = (defpackage.jlw) akzxVar.b;
        defpackage.jlw jlwVar2 = defpackage.jlw.a;
        jlwVar.b |= 2;
        jlwVar.d = i;
    }

    public final void P(defpackage.jjx jjxVar) {
        aooh.f(jjxVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.jlw jlwVar = (defpackage.jlw) akzxVar.b;
        defpackage.jlw jlwVar2 = defpackage.jlw.a;
        j$.util.Objects.requireNonNull(jjxVar);
        jlwVar.c = jjxVar;
        jlwVar.b |= 1;
    }

    public final void Q() {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.jlw jlwVar = (defpackage.jlw) akzxVar.b;
        defpackage.jlw jlwVar2 = defpackage.jlw.a;
        jlwVar.b |= 16;
        jlwVar.e = true;
    }

    public final /* synthetic */ defpackage.ixd R() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.ixd) aladVarP;
    }

    public final void S(defpackage.ixf ixfVar) {
        aooh.f(ixfVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.ixd ixdVar = (defpackage.ixd) akzxVar.b;
        defpackage.ixd ixdVar2 = defpackage.ixd.a;
        j$.util.Objects.requireNonNull(ixfVar);
        ixdVar.c = ixfVar;
        ixdVar.b = 2;
    }

    public final ajcq T(long j) {
        return ((jys) this.a).b(aify.p(java.lang.Long.valueOf(j)));
    }

    public final /* synthetic */ defpackage.ihw U() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.ihw) aladVarP;
    }

    public final void V(boolean z) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.ihw ihwVar = (defpackage.ihw) akzxVar.b;
        defpackage.ihw ihwVar2 = defpackage.ihw.a;
        ihwVar.c = z;
    }

    public final /* synthetic */ defpackage.ihu W() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.ihu) aladVarP;
    }

    public final void X(defpackage.iht ihtVar) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.ihu ihuVar = (defpackage.ihu) akzxVar.b;
        defpackage.ihu ihuVar2 = defpackage.ihu.a;
        ihuVar.d = ihtVar.a();
        ihuVar.b |= 1;
    }

    public final void Y() {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.ihu ihuVar = (defpackage.ihu) akzxVar.b;
        defpackage.ihu ihuVar2 = defpackage.ihu.a;
        ihuVar.c = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Z(rai raiVar) {
        android.view.View view = (android.view.View) ((java.lang.ref.WeakReference) this.a).get();
        if (view != null) {
            view.animate().setUpdateListener(raiVar != null ? new defpackage.mh(raiVar, 2, 0 == true ? 1 : 0) : null);
        }
    }

    public final long a(cvf cvfVar) {
        android.view.ViewConfiguration viewConfiguration = (android.view.ViewConfiguration) this.a;
        float f = -aa$.ExternalSyntheticApiModelOutline0.m$1(viewConfiguration);
        float f2 = -aa$.ExternalSyntheticApiModelOutline0.m(viewConfiguration);
        cpm cpmVar = new cpm(0L);
        java.util.List list = cvfVar.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            cpmVar = new cpm(mni.bl(cpmVar.a, ((defpackage.cvm) list.get(i)).j));
        }
        long j = cpmVar.a;
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32)) * f2;
        float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) * f;
        return (((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    public final float b() {
        return ((android.graphics.PathMeasure) this.a).getLength();
    }

    public final void c(cpx cpxVar, boolean z) {
        ((android.graphics.PathMeasure) this.a).setPath(cpxVar.a, z);
    }

    public final void d(float f, float f2, cpx cpxVar) {
        if (!(cpxVar instanceof cpx)) {
            throw new java.lang.UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        ((android.graphics.PathMeasure) this.a).getSegment(f, f2, cpxVar.a, true);
    }

    public final void e(int i) {
        ((defpackage.eav) this.a).b(i);
    }

    public final void f(boolean z) {
        ((defpackage.eav) this.a).c(z);
    }

    public final void g(boolean z) {
        ((defpackage.eav) this.a).d(z);
    }

    public final void h(int i) {
        ((defpackage.eav) this.a).e(i);
    }

    public final void i(int i) {
        ((defpackage.eav) this.a).f(i);
    }

    public final void j() {
        android.view.View view = (android.view.View) ((java.lang.ref.WeakReference) this.a).get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void k(float f) {
        android.view.View view = (android.view.View) ((java.lang.ref.WeakReference) this.a).get();
        if (view != null) {
            view.animate().alpha(f);
        }
    }

    public final void l(long j) {
        android.view.View view = (android.view.View) ((java.lang.ref.WeakReference) this.a).get();
        if (view != null) {
            view.animate().setDuration(j);
        }
    }

    public final void m(defpackage.dzz dzzVar) {
        android.view.View view = (android.view.View) ((java.lang.ref.WeakReference) this.a).get();
        if (view != null) {
            if (dzzVar != null) {
                view.animate().setListener(new defpackage.dzy(dzzVar));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void n(float f) {
        android.view.View view = (android.view.View) ((java.lang.ref.WeakReference) this.a).get();
        if (view != null) {
            view.animate().translationY(f);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [dze, java.lang.Object] */
    public final void o(int i, int i2, int i3, boolean z) {
        this.a.a(i, i2, i3, z);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [dze, java.lang.Object] */
    public final void p(int i, int i2, int i3, int i4) {
        this.a.b(i, i2, i3, i4);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    public final defpackage.kqb u(yse yseVar) {
        aooh.f(yseVar, "feature");
        java.lang.Object objComputeIfAbsent = j$.util.concurrent.ConcurrentMap.-EL.computeIfAbsent((java.util.concurrent.ConcurrentMap) this.a, yseVar, new defpackage.jil(new defpackage.kbz(10), 6));
        aooh.e(objComputeIfAbsent, "computeIfAbsent(...)");
        return (defpackage.kqb) objComputeIfAbsent;
    }

    public final /* synthetic */ defpackage.kov v() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.kov) aladVarP;
    }

    public final /* synthetic */ defpackage.koq w() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.koq) aladVarP;
    }

    public final /* synthetic */ defpackage.kop x() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.kop) aladVarP;
    }

    public final /* synthetic */ defpackage.kor y() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.kor) aladVarP;
    }

    public final void z(defpackage.kqy kqyVar) {
        aooh.f(kqyVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.kor korVar = (defpackage.kor) akzxVar.b;
        defpackage.kor korVar2 = defpackage.kor.a;
        j$.util.Objects.requireNonNull(kqyVar);
        korVar.c = kqyVar;
        korVar.b = 1;
    }

    public ni(java.lang.Object obj, byte[] bArr) {
        this.a = obj;
    }

    public ni(byte[] bArr) {
        akzx akzxVarM = defpackage.knb.a.m();
        aooh.e(akzxVarM, "newBuilder(...)");
        this.a = akzxVarM;
    }

    public ni(java.lang.Object obj) {
        this.a = obj;
    }

    public ni() {
        this.a = new j$.util.concurrent.ConcurrentHashMap();
    }

    public ni(long[] jArr) {
        acw acwVar;
        if (jArr != null) {
            long[] jArrCopyOf = java.util.Arrays.copyOf(jArr, jArr.length);
            int length = jArrCopyOf.length;
            acwVar = new acw(length);
            int i = acwVar.b;
            if (jArrCopyOf == null) {
                aooh.i("elements");
            }
            if (i < 0 || i > acwVar.b) {
                un.c("");
            }
            if (length != 0) {
                acwVar.a(acwVar.b + length);
                long[] jArr2 = acwVar.a;
                int i2 = acwVar.b;
                if (i != i2) {
                    ajsz.dc(jArr2, jArr2, i + length, i, i2);
                }
                ajsz.dg(jArrCopyOf, jArr2, i);
                acwVar.b += length;
            }
        } else {
            acwVar = new acw(16);
        }
        this.a = acwVar;
    }

    public ni(android.view.View view, byte[] bArr) {
        if (android.os.Build.VERSION.SDK_INT >= 35) {
            this.a = new dzc(view);
        } else {
            this.a = new defpackage.dzd();
        }
    }

    public ni(android.view.View view) {
        this.a = new java.lang.ref.WeakReference(view);
    }

    public ni(android.view.Window window) {
        dzk dzkVar = new dzk();
        if (android.os.Build.VERSION.SDK_INT >= 35) {
            this.a = new defpackage.eba(window, dzkVar);
        } else {
            this.a = new defpackage.eay(window);
        }
    }
}
