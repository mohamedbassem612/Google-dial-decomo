package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apnt {
    public final /* synthetic */ java.lang.Object a;

    public apnt(defpackage.hia hiaVar) {
        j$.util.Objects.requireNonNull(hiaVar);
        this.a = hiaVar;
    }

    public final void A(int i, int i2) {
        android.support.v7.widget.RecyclerView recyclerView = (android.support.v7.widget.RecyclerView) this.a;
        int iB = recyclerView.h.b();
        for (int i3 = 0; i3 < iB; i3++) {
            defpackage.ld ldVarI = android.support.v7.widget.RecyclerView.i(recyclerView.h.e(i3));
            if (ldVarI != null && !ldVarI.A() && ldVarI.c >= i) {
                ldVarI.k(i2, false);
                recyclerView.L.f = true;
            }
        }
        java.util.ArrayList arrayList = recyclerView.e.c;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            defpackage.ld ldVar = (defpackage.ld) arrayList.get(i4);
            if (ldVar != null && ldVar.c >= i) {
                ldVar.k(i2, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.N = true;
    }

    public final void B(int i, int i2) {
        int i3;
        int i4;
        int i5;
        android.support.v7.widget.RecyclerView recyclerView = (android.support.v7.widget.RecyclerView) this.a;
        int iB = recyclerView.h.b();
        int i6 = 0;
        while (true) {
            if (i6 >= iB) {
                break;
            }
            defpackage.ld ldVarI = android.support.v7.widget.RecyclerView.i(recyclerView.h.e(i6));
            if (ldVarI != null) {
                int i7 = i < i2 ? i : i2;
                int i8 = ldVarI.c;
                if (i8 >= i7) {
                    if (i8 <= (i < i2 ? i2 : i)) {
                        if (i8 == i) {
                            ldVarI.k(i2 - i, false);
                        } else {
                            ldVarI.k(i >= i2 ? 1 : -1, false);
                        }
                        recyclerView.L.f = true;
                    }
                }
            }
            i6++;
        }
        defpackage.kt ktVar = recyclerView.e;
        if (i < i2) {
            i4 = i;
            i3 = i2;
        } else {
            i3 = i;
            i4 = i2;
        }
        java.util.ArrayList arrayList = ktVar.c;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            defpackage.ld ldVar = (defpackage.ld) arrayList.get(i9);
            if (ldVar != null && (i5 = ldVar.c) >= i4 && i5 <= i3) {
                if (i5 == i) {
                    ldVar.k(i2 - i, false);
                } else {
                    ldVar.k(i < i2 ? -1 : 1, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.N = true;
    }

    public final void C(int i, int i2) {
        android.support.v7.widget.RecyclerView recyclerView = (android.support.v7.widget.RecyclerView) this.a;
        recyclerView.N(i, i2, true);
        recyclerView.N = true;
        recyclerView.L.c += i2;
    }

    public final int D() {
        return ((android.support.v7.widget.RecyclerView) this.a).getChildCount();
    }

    public final int E(android.view.View view) {
        return ((android.support.v7.widget.RecyclerView) this.a).indexOfChild(view);
    }

    public final android.view.View F(int i) {
        return ((android.support.v7.widget.RecyclerView) this.a).getChildAt(i);
    }

    public final void G(android.view.View view) {
        defpackage.ld ldVarI = android.support.v7.widget.RecyclerView.i(view);
        if (ldVarI != null) {
            ((android.support.v7.widget.RecyclerView) this.a).ap(ldVarI, ldVarI.o);
            ldVarI.o = 0;
        }
    }

    public final void H(int i) {
        android.support.v7.widget.RecyclerView recyclerView = (android.support.v7.widget.RecyclerView) this.a;
        android.view.View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            recyclerView.z(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }

    public final void I(defpackage.ld ldVar, kl klVar, kl klVar2) {
        ldVar.n(false);
        android.support.v7.widget.RecyclerView recyclerView = (android.support.v7.widget.RecyclerView) this.a;
        if (recyclerView.E.n(ldVar, klVar, klVar2)) {
            recyclerView.Q();
        }
    }

    public final void J(defpackage.ld ldVar, kl klVar, kl klVar2) {
        android.support.v7.widget.RecyclerView recyclerView = (android.support.v7.widget.RecyclerView) this.a;
        recyclerView.e.l(ldVar);
        recyclerView.r(ldVar);
        ldVar.n(false);
        if (recyclerView.E.p(ldVar, klVar, klVar2)) {
            recyclerView.Q();
        }
    }

    public final void K(defpackage.ld ldVar) {
        android.support.v7.widget.RecyclerView recyclerView = (android.support.v7.widget.RecyclerView) this.a;
        recyclerView.n.aT(ldVar.a, recyclerView.e);
    }

    public final boolean a(javax.net.ssl.SSLSocket sSLSocket) {
        defpackage.aooh.f(sSLSocket, "sslSocket");
        java.lang.String name = sSLSocket.getClass().getName();
        defpackage.aooh.e(name, "getName(...)");
        return defpackage.aoov.ad(name, ((java.lang.String) this.a).concat("."));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    public final defpackage.ahbb b(java.lang.String str, java.lang.String str2) {
        defpackage.ahcz ahczVar;
        defpackage.ahbq ahbqVar = (defpackage.ahbq) this.a;
        java.lang.String strC = ((defpackage.apnt) ahbqVar.c).c(str);
        ?? r0 = ahbqVar.b;
        java.lang.Object obj = r0.get(strC);
        if (obj == null) {
            defpackage.aooh.g();
        }
        defpackage.ahce ahceVar = (defpackage.ahce) obj;
        defpackage.ahda ahdaVarE = ahceVar.e();
        defpackage.mdr mdrVar = new defpackage.mdr(ahceVar, 17);
        defpackage.ahcz ahczVar2 = null;
        while (true) {
            java.util.concurrent.atomic.AtomicReference atomicReference = (java.util.concurrent.atomic.AtomicReference) ahdaVarE.a;
            ahczVar = (defpackage.ahcz) atomicReference.get();
            if (ahczVar == null) {
                defpackage.aooh.g();
            }
            boolean z = ahczVar.b;
            if (z) {
                break;
            }
            if (ahczVar2 == null) {
                ahczVar2 = new defpackage.ahcz(ahczVar.c, ahczVar.a, true);
            } else {
                defpackage.aigf aigfVar = ahczVar.c;
                if (aigfVar == null) {
                    defpackage.aooh.i("<set-?>");
                }
                ahczVar2.c = aigfVar;
                defpackage.ahcd ahcdVar = ahczVar.a;
                if (ahcdVar == null) {
                    defpackage.aooh.i("<set-?>");
                }
                ahczVar2.a = ahcdVar;
            }
            if (defpackage.anty.Q(atomicReference, ahczVar, ahczVar2)) {
                if (!z) {
                    mdrVar.a(ahczVar.a);
                }
                ahczVar = ahczVar2;
                break;
            }
        }
        java.lang.Object objAN = defpackage.ajsz.aN(ahczVar.c, str2);
        defpackage.aooh.e(objAN, "getValue(...)");
        defpackage.ahbb ahbbVar = (defpackage.ahbb) objAN;
        defpackage.ailj it = ((defpackage.aikn) ahbqVar.a).iterator();
        while (it.hasNext()) {
            ((defpackage.ahbw) it.next()).a();
        }
        defpackage.ahyn ahynVar = (defpackage.ahyn) ahbqVar.d;
        if (!ahynVar.f()) {
            return ahbbVar;
        }
        java.lang.Object obj2 = r0.get(strC);
        if (obj2 == null) {
            defpackage.aooh.g();
        }
        return defpackage.ahbq.m((defpackage.ahce) obj2, str2, (defpackage.xtq) ahynVar.b());
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final java.lang.String c(java.lang.String str) {
        defpackage.aooh.f(str, "mendelPackage");
        java.lang.String str2 = (java.lang.String) this.a.get(str);
        if (str2 != null) {
            return str2;
        }
        throw new java.lang.IllegalStateException("Unknown package ".concat(java.lang.String.valueOf(str)));
    }

    public final defpackage.afzz d(defpackage.afzz afzzVar) {
        return !(afzzVar instanceof defpackage.agai) ? new afzx(-((defpackage.agaf) this.a).A(), afzzVar) : afzzVar;
    }

    public final void e() {
        java.lang.Object obj = this.a;
        synchronized (((defpackage.afhx) obj).i) {
            int i = ((defpackage.afhx) obj).l;
            defpackage.ahvr.ca(i > 0, "Refcount went negative!", i);
            ((defpackage.afhx) obj).l--;
            ((defpackage.afhx) obj).c();
        }
    }

    public final void f() {
        java.lang.Object obj = this.a;
        synchronized (((defpackage.afhx) obj).i) {
            int i = ((defpackage.afhx) obj).l;
            if (i == 0) {
                throw new java.util.concurrent.CancellationException("database is closed");
            }
            defpackage.ahvr.ca(i > 0, "Refcount went negative!", i);
            ((defpackage.afhx) obj).l++;
        }
    }

    public final boolean g(java.lang.String str, java.lang.String str2) {
        return ((defpackage.zzx) ((defpackage.aeyx) this.a).b.get(str)) != null && str2.equals("");
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Map] */
    public final com.google.android.libraries.micore.superpacks.base.BasePriority h(java.lang.String str) {
        com.google.android.libraries.micore.superpacks.base.BasePriority basePriority = (com.google.android.libraries.micore.superpacks.base.BasePriority) ((defpackage.adlt) this.a).i.get(str);
        return basePriority == null ? com.google.android.libraries.micore.superpacks.base.BasePriority.a : basePriority;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Iterable, java.lang.Object] */
    public final java.lang.Iterable i() {
        ?? r0;
        java.lang.Object obj = this.a;
        synchronized (obj) {
            r0 = ((defpackage.adlt) obj).c;
        }
        return r0;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Iterable, java.lang.Object] */
    public final java.lang.Iterable j() {
        ?? r0;
        java.lang.Object obj = this.a;
        synchronized (obj) {
            r0 = ((defpackage.adlt) obj).d;
        }
        return r0;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Iterable, java.lang.Object] */
    public final java.lang.Iterable k() {
        ?? r0;
        java.lang.Object obj = this.a;
        synchronized (obj) {
            r0 = ((defpackage.adlt) obj).e;
        }
        return r0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aafi, java.lang.Object] */
    public final void l(com.google.android.gms.common.ConnectionResult connectionResult) {
        this.a.i(connectionResult);
    }

    public final void m(int i) {
        int i2 = i - 1;
        if (i2 == 2) {
            ((defpackage.aimw) defpackage.iez.a.b().l("com/android/dialer/audioplayback/impl/player/AudioPlayer$audioFocusCallBack$<anonymous>", "onAudioFocusChange", 222, "AudioPlayer.kt")).v("pause playback due to lost audio focus transient");
            androidx.media3.exoplayer.ExoPlayer exoPlayer = ((defpackage.iez) this.a).j;
            if (exoPlayer != null) {
                exoPlayer.a();
                return;
            }
            return;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                defpackage.iez iezVar = (defpackage.iez) this.a;
                iezVar.d.e(iezVar.l, false);
                return;
            }
            return;
        }
        ((defpackage.aimw) defpackage.iez.a.b().l("com/android/dialer/audioplayback/impl/player/AudioPlayer$audioFocusCallBack$<anonymous>", "onAudioFocusChange", 226, "AudioPlayer.kt")).v("pause playback due to lost audio focus permanently");
        androidx.media3.exoplayer.ExoPlayer exoPlayer2 = ((defpackage.iez) this.a).j;
        if (exoPlayer2 != null) {
            exoPlayer2.a();
        }
    }

    public final long n() {
        return ((defpackage.csg) this.a).a();
    }

    public final void o(float f, float f2, float f3, float f4, int i) {
        ((defpackage.csg) this.a).b().a(f, f2, f3, f4, i);
    }

    public final void p(float f, long j) {
        defpackage.cqf cqfVarB = ((defpackage.csg) this.a).b();
        int i = (int) (4294967295L & j);
        int i2 = (int) (j >> 32);
        cqfVarB.i(java.lang.Float.intBitsToFloat(i2), java.lang.Float.intBitsToFloat(i));
        cqfVarB.f(f);
        cqfVarB.i(-java.lang.Float.intBitsToFloat(i2), -java.lang.Float.intBitsToFloat(i));
    }

    public final void q(float f, float f2, long j) {
        defpackage.cqf cqfVarB = ((defpackage.csg) this.a).b();
        int i = (int) (4294967295L & j);
        int i2 = (int) (j >> 32);
        cqfVarB.i(java.lang.Float.intBitsToFloat(i2), java.lang.Float.intBitsToFloat(i));
        cqfVarB.h(f, f2);
        cqfVarB.i(-java.lang.Float.intBitsToFloat(i2), -java.lang.Float.intBitsToFloat(i));
    }

    public final void r(float f, float f2) {
        ((defpackage.csg) this.a).b().i(f, f2);
    }

    public final void s(float f, float f2) {
        defpackage.csg csgVar = (defpackage.csg) this.a;
        defpackage.cqf cqfVarB = csgVar.b();
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (n() >> 32)) - (f + 0.0f);
        float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (n() & 4294967295L)) - (f2 + 0.0f);
        long jFloatToRawIntBits = (((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
        if (java.lang.Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) < 0.0f || java.lang.Float.intBitsToFloat((int) (4294967295L & jFloatToRawIntBits)) < 0.0f) {
            defpackage.cqp.a("Width and height must be greater than or equal to zero");
        }
        csgVar.h(jFloatToRawIntBits);
        cqfVarB.i(0.0f, 0.0f);
    }

    public final void t(defpackage.cpx cpxVar) {
        ((defpackage.csg) this.a).b().q(cpxVar);
    }

    public final void u() {
        java.lang.Object obj = defpackage.ckw.b;
        java.lang.Object obj2 = this.a;
        synchronized (obj) {
            java.util.List list = defpackage.ckw.f;
            if (list == null) {
                defpackage.aooh.i("<this>");
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.ajsz.bl(list, 10));
            boolean z = false;
            for (java.lang.Object obj3 : list) {
                boolean z2 = true;
                if (!z && defpackage.aooh.n(obj3, obj2)) {
                    z = true;
                    z2 = false;
                }
                if (z2) {
                    arrayList.add(obj3);
                }
            }
            defpackage.ckw.f = arrayList;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:103:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:105:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:106:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:109:0x0201  */
    /* JADX WARN: Code duplicated, block: B:111:0x0206  */
    /* JADX WARN: Code duplicated, block: B:113:0x020e  */
    /* JADX WARN: Code duplicated, block: B:114:0x0212  */
    /* JADX WARN: Code duplicated, block: B:116:0x0215 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:118:0x0219  */
    /* JADX WARN: Code duplicated, block: B:121:0x021e  */
    /* JADX WARN: Code duplicated, block: B:126:0x023e  */
    /* JADX WARN: Code duplicated, block: B:136:0x0262  */
    /* JADX WARN: Code duplicated, block: B:146:0x0286  */
    /* JADX WARN: Code duplicated, block: B:156:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:160:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:162:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ee A[PHI: r19 r21
      0x00ee: PHI (r19v2 long) = (r19v1 long), (r19v5 long) binds: [B:51:0x00e7, B:41:0x00b6] A[DONT_GENERATE, DONT_INLINE]
      0x00ee: PHI (r21v1 float) = (r21v0 float), (r21v2 float) binds: [B:51:0x00e7, B:41:0x00b6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:66:0x012a  */
    /* JADX WARN: Code duplicated, block: B:68:0x0130  */
    /* JADX WARN: Code duplicated, block: B:76:0x0159 A[PHI: r5
      0x0159: PHI (r5v13 float) = (r5v11 float), (r5v15 float) binds: [B:74:0x0152, B:64:0x0123] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:77:0x015b  */
    /* JADX WARN: Code duplicated, block: B:80:0x016f  */
    /* JADX WARN: Code duplicated, block: B:91:0x01be  */
    /* JADX WARN: Code duplicated, block: B:97:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:99:0x01d5  */
    public final long v(long j, int i) {
        long j2;
        float fA;
        float fIntBitsToFloat;
        int i2;
        float fIntBitsToFloat2;
        long jFloatToRawIntBits;
        long jAM;
        long jAM2;
        defpackage.ang angVar;
        boolean z;
        defpackage.ang angVar2;
        boolean zL;
        int i3;
        boolean z2;
        int i4;
        boolean z3;
        defpackage.ang angVar3;
        float fC;
        defpackage.ato atoVar = (defpackage.ato) this.a;
        atoVar.h = i;
        defpackage.amn amnVar = atoVar.k;
        if (amnVar == null || !atoVar.j()) {
            return atoVar.c(atoVar.i, j, i);
        }
        int i5 = atoVar.h;
        defpackage.aonj aonjVar = atoVar.j;
        if (defpackage.cpp.d(amnVar.e)) {
            return ((defpackage.cpm) aonjVar.a(new defpackage.cpm(j))).a;
        }
        long j3 = j & 4294967295L;
        long j4 = j >> 32;
        boolean z4 = true;
        if (!amnVar.d) {
            defpackage.ang angVar4 = amnVar.b;
            if (angVar4.n()) {
                amnVar.b(0L);
            }
            if (angVar4.q()) {
                amnVar.c(0L);
            }
            if (angVar4.t()) {
                amnVar.d(0L);
            }
            if (angVar4.k()) {
                amnVar.a(0L);
            }
            amnVar.d = true;
        }
        int i6 = defpackage.amp.a;
        float f = i5 == 2 ? 4.0f : 1.0f;
        long jBm = defpackage.mni.bm(j, f);
        int i7 = (int) j3;
        if (java.lang.Float.intBitsToFloat(i7) != 0.0f) {
            defpackage.ang angVar5 = amnVar.b;
            if (!angVar5.t() || java.lang.Float.intBitsToFloat(i7) >= 0.0f) {
                j2 = 0;
                if (angVar5.k() && java.lang.Float.intBitsToFloat(i7) > 0.0f) {
                    long j5 = jBm & 4294967295L;
                    fA = amnVar.a(jBm);
                    if (!angVar5.k()) {
                        angVar5.a().finish();
                    }
                    if (fA == java.lang.Float.intBitsToFloat((int) j5)) {
                        fIntBitsToFloat = java.lang.Float.intBitsToFloat(i7);
                    } else {
                        fIntBitsToFloat = fA / f;
                    }
                }
            } else {
                j2 = 0;
                long j6 = jBm & 4294967295L;
                fA = amnVar.d(jBm);
                if (!angVar5.t()) {
                    angVar5.g().finish();
                }
                if (fA == java.lang.Float.intBitsToFloat((int) j6)) {
                    fIntBitsToFloat = java.lang.Float.intBitsToFloat(i7);
                } else {
                    fIntBitsToFloat = fA / f;
                }
            }
            i2 = (int) j4;
            if (java.lang.Float.intBitsToFloat(i2) != 0.0f) {
                angVar3 = amnVar.b;
                if (!angVar3.n() && java.lang.Float.intBitsToFloat(i2) < 0.0f) {
                    long j7 = jBm >> 32;
                    fC = amnVar.b(jBm);
                    if (!angVar3.n()) {
                        angVar3.c().finish();
                    }
                    if (fC == java.lang.Float.intBitsToFloat((int) j7)) {
                        fIntBitsToFloat2 = java.lang.Float.intBitsToFloat(i2);
                    } else {
                        fIntBitsToFloat2 = fC / f;
                    }
                } else if (angVar3.q() || java.lang.Float.intBitsToFloat(i2) <= 0.0f) {
                    fIntBitsToFloat2 = 0.0f;
                } else {
                    long j8 = jBm >> 32;
                    fC = amnVar.c(jBm);
                    if (!angVar3.q()) {
                        angVar3.e().finish();
                    }
                    if (fC == java.lang.Float.intBitsToFloat((int) j8)) {
                        fIntBitsToFloat2 = java.lang.Float.intBitsToFloat(i2);
                    } else {
                        fIntBitsToFloat2 = fC / f;
                    }
                }
            } else {
                fIntBitsToFloat2 = 0.0f;
            }
            jFloatToRawIntBits = (((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L);
            if (jFloatToRawIntBits != j2) {
                amnVar.h();
            }
            jAM = defpackage.mni.aM(j, jFloatToRawIntBits);
            long j9 = ((defpackage.cpm) aonjVar.a(new defpackage.cpm(jAM))).a;
            jAM2 = defpackage.mni.aM(jAM, j9);
            if ((java.lang.Float.intBitsToFloat((int) (jAM >> 32)) == 0.0f || java.lang.Float.intBitsToFloat((int) (jAM & 4294967295L)) != 0.0f) && (java.lang.Float.intBitsToFloat((int) (j9 >> 32)) != 0.0f || java.lang.Float.intBitsToFloat((int) (j9 & 4294967295L)) != 0.0f)) {
                angVar = amnVar.b;
                if (angVar.n() || angVar.t() || angVar.q() || angVar.k()) {
                    amnVar.g();
                }
            }
            if (i5 == 1) {
                i3 = (int) (jAM2 >> 32);
                if (java.lang.Float.intBitsToFloat(i3) > 0.5f) {
                    amnVar.b(jAM2);
                } else {
                    if (java.lang.Float.intBitsToFloat(i3) < -0.5f) {
                        amnVar.c(jAM2);
                    } else {
                        z2 = false;
                    }
                    i4 = (int) (jAM2 & 4294967295L);
                    if (java.lang.Float.intBitsToFloat(i4) > 0.5f) {
                        amnVar.d(jAM2);
                    } else {
                        if (java.lang.Float.intBitsToFloat(i4) < -0.5f) {
                            amnVar.a(jAM2);
                        } else {
                            z3 = false;
                        }
                        if (!z2 || z3) {
                            z = true;
                        } else {
                            z = false;
                        }
                    }
                    z3 = true;
                    if (z2) {
                    }
                    z = true;
                }
                z2 = true;
                i4 = (int) (jAM2 & 4294967295L);
                if (java.lang.Float.intBitsToFloat(i4) > 0.5f) {
                    amnVar.d(jAM2);
                } else {
                    if (java.lang.Float.intBitsToFloat(i4) < -0.5f) {
                        amnVar.a(jAM2);
                    } else {
                        z3 = false;
                    }
                    if (z2) {
                    }
                    z = true;
                }
                z3 = true;
                if (z2) {
                }
                z = true;
            } else {
                z = false;
            }
            if (jAM != j2) {
                angVar2 = amnVar.b;
                if (angVar2.l() || java.lang.Float.intBitsToFloat(i2) >= 0.0f) {
                    zL = false;
                } else {
                    zb.d(angVar2.c(), java.lang.Float.intBitsToFloat(i2));
                    zL = angVar2.l();
                }
                if (angVar2.o() && java.lang.Float.intBitsToFloat(i2) > 0.0f) {
                    zb.d(angVar2.e(), java.lang.Float.intBitsToFloat(i2));
                    if (!zL || angVar2.o()) {
                        zL = true;
                    } else {
                        zL = false;
                    }
                }
                if (angVar2.r() && java.lang.Float.intBitsToFloat(i7) < 0.0f) {
                    zb.d(angVar2.g(), java.lang.Float.intBitsToFloat(i7));
                    if (!zL || angVar2.r()) {
                        zL = true;
                    } else {
                        zL = false;
                    }
                }
                if (angVar2.i() && java.lang.Float.intBitsToFloat(i7) > 0.0f) {
                    zb.d(angVar2.a(), java.lang.Float.intBitsToFloat(i7));
                    if (!zL || angVar2.i()) {
                        zL = true;
                    } else {
                        zL = false;
                    }
                }
                if (!zL && !z) {
                    z4 = false;
                }
            } else {
                z4 = z;
            }
            if (z4) {
                amnVar.h();
            }
            return defpackage.mni.bl(jFloatToRawIntBits, j9);
        }
        j2 = 0;
        fIntBitsToFloat = 0.0f;
        i2 = (int) j4;
        if (java.lang.Float.intBitsToFloat(i2) != 0.0f) {
            angVar3 = amnVar.b;
            if (!angVar3.n()) {
                if (angVar3.q()) {
                    fIntBitsToFloat2 = 0.0f;
                } else {
                    fIntBitsToFloat2 = 0.0f;
                }
            } else if (angVar3.q()) {
                fIntBitsToFloat2 = 0.0f;
            } else {
                fIntBitsToFloat2 = 0.0f;
            }
        } else {
            fIntBitsToFloat2 = 0.0f;
        }
        jFloatToRawIntBits = (((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L);
        if (jFloatToRawIntBits != j2) {
            amnVar.h();
        }
        jAM = defpackage.mni.aM(j, jFloatToRawIntBits);
        long j10 = ((defpackage.cpm) aonjVar.a(new defpackage.cpm(jAM))).a;
        jAM2 = defpackage.mni.aM(jAM, j10);
        if (java.lang.Float.intBitsToFloat((int) (jAM >> 32)) == 0.0f) {
            angVar = amnVar.b;
            if (angVar.n()) {
                amnVar.g();
            } else {
                amnVar.g();
            }
        } else {
            angVar = amnVar.b;
            if (angVar.n()) {
                amnVar.g();
            } else {
                amnVar.g();
            }
        }
        if (i5 == 1) {
            i3 = (int) (jAM2 >> 32);
            if (java.lang.Float.intBitsToFloat(i3) > 0.5f) {
                amnVar.b(jAM2);
            } else {
                if (java.lang.Float.intBitsToFloat(i3) < -0.5f) {
                    amnVar.c(jAM2);
                } else {
                    z2 = false;
                }
                i4 = (int) (jAM2 & 4294967295L);
                if (java.lang.Float.intBitsToFloat(i4) > 0.5f) {
                    amnVar.d(jAM2);
                } else {
                    if (java.lang.Float.intBitsToFloat(i4) < -0.5f) {
                        amnVar.a(jAM2);
                    } else {
                        z3 = false;
                    }
                    if (z2) {
                    }
                    z = true;
                }
                z3 = true;
                if (z2) {
                }
                z = true;
            }
            z2 = true;
            i4 = (int) (jAM2 & 4294967295L);
            if (java.lang.Float.intBitsToFloat(i4) > 0.5f) {
                amnVar.d(jAM2);
            } else {
                if (java.lang.Float.intBitsToFloat(i4) < -0.5f) {
                    amnVar.a(jAM2);
                } else {
                    z3 = false;
                }
                if (z2) {
                }
                z = true;
            }
            z3 = true;
            if (z2) {
            }
            z = true;
        } else {
            z = false;
        }
        if (jAM != j2) {
            angVar2 = amnVar.b;
            if (angVar2.l()) {
                zL = false;
            } else {
                zL = false;
            }
            if (angVar2.o()) {
                zb.d(angVar2.e(), java.lang.Float.intBitsToFloat(i2));
                if (zL) {
                    zL = true;
                } else {
                    zL = true;
                }
            }
            if (angVar2.r()) {
                zb.d(angVar2.g(), java.lang.Float.intBitsToFloat(i7));
                if (zL) {
                    zL = true;
                } else {
                    zL = true;
                }
            }
            if (angVar2.i()) {
                zb.d(angVar2.a(), java.lang.Float.intBitsToFloat(i7));
                if (zL) {
                    zL = true;
                } else {
                    zL = true;
                }
            }
            if (!zL) {
                z4 = false;
            }
        } else {
            z4 = z;
        }
        if (z4) {
            amnVar.h();
        }
        return defpackage.mni.bl(jFloatToRawIntBits, j10);
    }

    public final long w(long j) {
        defpackage.ato atoVar = (defpackage.ato) this.a;
        return atoVar.c(atoVar.i, j, 1);
    }

    public final defpackage.ld x(int i) {
        android.support.v7.widget.RecyclerView recyclerView = (android.support.v7.widget.RecyclerView) this.a;
        defpackage.ld ldVarG = recyclerView.g(i, true);
        if (ldVarG == null || recyclerView.h.k(ldVarG.a)) {
            return null;
        }
        return ldVarG;
    }

    public final void y(hf hfVar) {
        int i = hfVar.a;
        if (i == 1) {
            ((android.support.v7.widget.RecyclerView) this.a).n.y(hfVar.b, hfVar.d);
            return;
        }
        if (i == 2) {
            ((android.support.v7.widget.RecyclerView) this.a).n.B(hfVar.b, hfVar.d);
            return;
        }
        if (i != 4) {
            if (i == 8) {
                ((android.support.v7.widget.RecyclerView) this.a).n.A(hfVar.b, hfVar.d);
            }
        } else {
            defpackage.kp kpVar = ((android.support.v7.widget.RecyclerView) this.a).n;
            int i2 = hfVar.b;
            int i3 = hfVar.d;
            java.lang.Object obj = hfVar.c;
            kpVar.C(i2, i3);
        }
    }

    public final void z(int i, int i2, java.lang.Object obj) {
        int i3;
        int i4;
        int i5;
        android.support.v7.widget.RecyclerView recyclerView = (android.support.v7.widget.RecyclerView) this.a;
        int iB = recyclerView.h.b();
        int i6 = 0;
        while (true) {
            i3 = i + i2;
            if (i6 >= iB) {
                break;
            }
            android.view.View viewE = recyclerView.h.e(i6);
            defpackage.ld ldVarI = android.support.v7.widget.RecyclerView.i(viewE);
            if (ldVarI != null && !ldVarI.A() && (i5 = ldVarI.c) >= i && i5 < i3) {
                ldVarI.f(2);
                ldVarI.e(obj);
                ((defpackage.kq) viewE.getLayoutParams()).e = true;
            }
            i6++;
        }
        defpackage.kt ktVar = recyclerView.e;
        java.util.ArrayList arrayList = ktVar.c;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                recyclerView.O = true;
                return;
            }
            defpackage.ld ldVar = (defpackage.ld) arrayList.get(size);
            if (ldVar != null && (i4 = ldVar.c) >= i && i4 < i3) {
                ldVar.f(2);
                ktVar.h(size);
            }
        }
    }

    public /* synthetic */ apnt(java.lang.Object obj) {
        this.a = obj;
    }

    public apnt(java.lang.Object obj, byte[] bArr) {
        this.a = obj;
    }

    public apnt() {
        this.a = "com.google.android.gms.org.conscrypt";
    }

    public apnt(defpackage.hkv hkvVar) {
        j$.util.Objects.requireNonNull(hkvVar);
        this.a = hkvVar;
    }

    public apnt(defpackage.aafl aaflVar) {
        j$.util.Objects.requireNonNull(aaflVar);
        this.a = aaflVar;
    }

    public apnt(defpackage.zzx zzxVar) {
        j$.util.Objects.requireNonNull(zzxVar);
        this.a = zzxVar;
    }

    public apnt(defpackage.ajje ajjeVar, android.content.Context context) {
        this.a = context;
        j$.util.Objects.requireNonNull(ajjeVar);
    }

    public apnt(defpackage.adjz adjzVar) {
        j$.util.Objects.requireNonNull(adjzVar);
        this.a = adjzVar;
    }

    public apnt(defpackage.adlt adltVar) {
        j$.util.Objects.requireNonNull(adltVar);
        this.a = adltVar;
    }

    public apnt(defpackage.afhf afhfVar) {
        j$.util.Objects.requireNonNull(afhfVar);
        this.a = afhfVar;
    }

    public apnt(defpackage.afhx afhxVar) {
        j$.util.Objects.requireNonNull(afhxVar);
        this.a = afhxVar;
    }

    public apnt(defpackage.agaf agafVar, byte[] bArr) {
        j$.util.Objects.requireNonNull(agafVar);
        this.a = agafVar;
    }

    public apnt(defpackage.agaf agafVar) {
        j$.util.Objects.requireNonNull(agafVar);
        this.a = agafVar;
    }

    public apnt(agfh agfhVar) {
        j$.util.Objects.requireNonNull(agfhVar);
        this.a = agfhVar;
    }
}
