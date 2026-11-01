package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class uzx {
    public static defpackage.uzx b;
    public final java.lang.Object a;

    /* JADX INFO: Thrown type has an unknown type hierarchy: aajg */
    public uzx(java.lang.Class cls, android.content.Context context, android.os.Parcelable parcelable) throws aajg {
        try {
            this.a = cls.getDeclaredConstructor(android.content.Context.class, android.os.Parcelable.class).newInstance(context, parcelable);
        } catch (java.lang.Exception e) {
            throw new aajg(e);
        }
    }

    public static defpackage.uzx aV(ajex ajexVar) {
        try {
            return new defpackage.uzx(ajexVar.g(ajfj.b).p());
        } catch (java.security.GeneralSecurityException e) {
            throw new java.lang.IllegalArgumentException("Cannot create KeysetManager: key cannot be serialized", e);
        }
    }

    public static defpackage.uzx aW(byte[] bArr) {
        return new defpackage.uzx(new java.io.ByteArrayInputStream(bArr));
    }

    public static defpackage.uzx aX(emx emxVar, eoi eoiVar) {
        defpackage.ahgw ahgwVar = (defpackage.ahgw) new eog(eoiVar.S(), new defpackage.ahha(0)).a(defpackage.ahgw.class);
        if (j$.util.Map.-EL.putIfAbsent(ahgwVar.a, emxVar, new acc(0)) == null) {
            emxVar.P().c(ahgwVar);
            if (!ahgwVar.b) {
                ahgwVar.b = true;
                ahgwVar.c = emxVar;
            }
        }
        return new defpackage.uzx(ahgwVar);
    }

    public static int aY(apyr apyrVar, java.lang.Object obj, java.lang.Object obj2) {
        return apya.a(apyrVar.a, 1, obj) + apya.a(apyrVar.c, 2, obj2);
    }

    public static void aZ(apxj apxjVar, apyr apyrVar, java.lang.Object obj, java.lang.Object obj2) {
        apya.e(apxjVar, apyrVar.a, 1, obj);
        apya.e(apxjVar, apyrVar.c, 2, obj2);
    }

    public static int[] bs(java.lang.String str) {
        try {
            if (str.isEmpty()) {
                throw new java.lang.IllegalArgumentException("Version string is empty");
            }
            java.util.StringTokenizer stringTokenizer = new java.util.StringTokenizer(str, ".");
            int iCountTokens = stringTokenizer.countTokens();
            int[] iArr = new int[iCountTokens];
            for (int i = 0; i < iCountTokens; i++) {
                iArr[i] = java.lang.Integer.parseInt(stringTokenizer.nextToken());
            }
            return iArr;
        } catch (java.lang.RuntimeException e) {
            throw new java.lang.IllegalArgumentException(a.bp((byte) 96, str, "Unable to parse HTTP flags version string: `"), e);
        }
    }

    public final void A(java.lang.String str, defpackage.tvz tvzVar) {
        aooh.f(str, "key");
        aooh.f(tvzVar, "value");
        j$.util.Objects.requireNonNull(str);
        j$.util.Objects.requireNonNull(tvzVar);
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        twk twkVar = akzxVar.b;
        twk twkVar2 = twk.a;
        twkVar.b().put(str, tvzVar);
    }

    public final /* synthetic */ void B() {
        java.util.Map mapUnmodifiableMap = j$.util.DesugarCollections.unmodifiableMap(j$.util.DesugarCollections.unmodifiableMap(((akzx) this.a).b.b));
        aooh.e(mapUnmodifiableMap, "getLanguageCodeToLanguagePackInfoMap(...)");
        new alcv(mapUnmodifiableMap);
    }

    public final /* synthetic */ defpackage.twj C() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.twj) aladVarP;
    }

    public final amle D() {
        defpackage.twj twjVar = (defpackage.twj) ((akzx) this.a).b;
        amle amleVar = twjVar.b == 2 ? (amle) twjVar.c : amle.a;
        aooh.e(amleVar, "getSodaEvent(...)");
        return amleVar;
    }

    public final void E(amle amleVar) {
        aooh.f(amleVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.twj twjVar = (defpackage.twj) akzxVar.b;
        defpackage.twj twjVar2 = defpackage.twj.a;
        j$.util.Objects.requireNonNull(amleVar);
        twjVar.c = amleVar;
        twjVar.b = 2;
    }

    public final void F(java.lang.String str) {
        aooh.f(str, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.twj twjVar = (defpackage.twj) akzxVar.b;
        defpackage.twj twjVar2 = defpackage.twj.a;
        j$.util.Objects.requireNonNull(str);
        twjVar.b = 1;
        twjVar.c = str;
    }

    public final /* synthetic */ defpackage.twd G() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.twd) aladVarP;
    }

    public final void H(boolean z) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.twd twdVar = (defpackage.twd) akzxVar.b;
        defpackage.twd twdVar2 = defpackage.twd.a;
        twdVar.b |= 8;
        twdVar.f = z;
    }

    public final void I(int i) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.twd twdVar = (defpackage.twd) akzxVar.b;
        defpackage.twd twdVar2 = defpackage.twd.a;
        twdVar.b |= 2;
        twdVar.d = i;
    }

    public final void J(defpackage.twc twcVar) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.twd twdVar = (defpackage.twd) akzxVar.b;
        defpackage.twd twdVar2 = defpackage.twd.a;
        twdVar.c = twcVar.d;
        twdVar.b |= 1;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final java.lang.Class K(defpackage.aajh aajhVar) {
        return (java.lang.Class) this.a.get(aajhVar);
    }

    public final void L(int i) {
        java.lang.Object obj = this.a;
        java.lang.Object obj2 = ((aplv) obj).b;
        synchronized (obj2) {
            long j = i;
            long[] jArr = (long[]) ((android.util.LongSparseArray) obj2).get(j);
            if (jArr == null) {
                return;
            }
            long j2 = jArr[0] - 1;
            jArr[0] = j2;
            if (j2 <= 0) {
                ((android.util.LongSparseArray) obj2).delete(j);
            } else {
                long j3 = ((aplv) obj).a + 1;
                ((aplv) obj).a = j3;
                jArr[1] = j3;
            }
        }
    }

    public final /* synthetic */ defpackage.zug M() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.zug) aladVarP;
    }

    public final void N(java.lang.String str) {
        aooh.f(str, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.zug zugVar = (defpackage.zug) akzxVar.b;
        defpackage.zug zugVar2 = defpackage.zug.a;
        j$.util.Objects.requireNonNull(str);
        zugVar.b |= 2;
        zugVar.d = str;
    }

    public final void O(java.lang.String str) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.zug zugVar = (defpackage.zug) akzxVar.b;
        defpackage.zug zugVar2 = defpackage.zug.a;
        j$.util.Objects.requireNonNull(str);
        zugVar.b |= 4;
        zugVar.e = str;
    }

    public final void P() {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.zug zugVar = (defpackage.zug) akzxVar.b;
        defpackage.zug zugVar2 = defpackage.zug.a;
        zugVar.b |= 8;
        zugVar.f = 1;
    }

    public final void Q(int i) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.zug zugVar = (defpackage.zug) akzxVar.b;
        defpackage.zug zugVar2 = defpackage.zug.a;
        zugVar.c = i - 1;
        zugVar.b |= 1;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object R(java.lang.String str, java.util.List list, aoln aolnVar) {
        defpackage.zto ztoVar;
        if (aolnVar instanceof defpackage.zto) {
            ztoVar = (defpackage.zto) aolnVar;
            int i = ztoVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                ztoVar.b = i - Integer.MIN_VALUE;
            } else {
                ztoVar = new defpackage.zto(this, aolnVar);
            }
        } else {
            ztoVar = new defpackage.zto(this, aolnVar);
        }
        java.lang.Object obj = ztoVar.a;
        aolu aoluVar = aolu.a;
        int i2 = ztoVar.b;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(obj);
            return ((aoiw) obj).a;
        }
        aooc.af(obj);
        java.lang.Object obj2 = this.a;
        defpackage.ztk ztkVar = defpackage.ztk.EXPERIMENT_SYNC;
        ztoVar.b = 1;
        java.lang.Object objB = ((defpackage.ztn) obj2).b(ztkVar, str, list, ztoVar);
        return objB != aoluVar ? objB : aoluVar;
    }

    public final jxb S() {
        jxb jxbVar = ((defpackage.zsf) ((akzx) this.a).b).d;
        if (jxbVar == null) {
            jxbVar = jxb.b;
        }
        aooh.e(jxbVar, "getCallSpecificAppData(...)");
        return jxbVar;
    }

    public final /* synthetic */ defpackage.zsf T() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.zsf) aladVarP;
    }

    public final void U(boolean z) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.zsf zsfVar = (defpackage.zsf) akzxVar.b;
        defpackage.zsf zsfVar2 = defpackage.zsf.a;
        zsfVar.b |= 128;
        zsfVar.i = z;
    }

    public final void V(jxb jxbVar) {
        aooh.f(jxbVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.zsf zsfVar = (defpackage.zsf) akzxVar.b;
        defpackage.zsf zsfVar2 = defpackage.zsf.a;
        j$.util.Objects.requireNonNull(jxbVar);
        zsfVar.d = jxbVar;
        zsfVar.b |= 2;
    }

    public final void W(defpackage.abvz abvzVar) {
        aooh.f(abvzVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.zsf zsfVar = (defpackage.zsf) akzxVar.b;
        defpackage.zsf zsfVar2 = defpackage.zsf.a;
        j$.util.Objects.requireNonNull(abvzVar);
        zsfVar.o = abvzVar;
        zsfVar.b |= 1024;
    }

    public final void X(defpackage.zsc zscVar) {
        aooh.f(zscVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.zsf zsfVar = (defpackage.zsf) akzxVar.b;
        defpackage.zsf zsfVar2 = defpackage.zsf.a;
        j$.util.Objects.requireNonNull(zscVar);
        zsfVar.p = zscVar;
        zsfVar.b |= 4096;
    }

    public final void Y(java.lang.String str, boolean z) {
        ((akzx) this.a).af(str, z);
    }

    public final /* synthetic */ void Z() {
        java.util.Map mapUnmodifiableMap = j$.util.DesugarCollections.unmodifiableMap(j$.util.DesugarCollections.unmodifiableMap(((defpackage.zsf) ((akzx) this.a).b).l));
        aooh.e(mapUnmodifiableMap, "getBoolInCallUiIntentExtrasMap(...)");
        new alcv(mapUnmodifiableMap);
    }

    public final /* synthetic */ vcr a() {
        vcr vcrVarP = ((akzx) this.a).p();
        aooh.e(vcrVarP, "build(...)");
        return vcrVarP;
    }

    public final void aA(defpackage.rms rmsVar) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        aivu aivuVar = akzxVar.b;
        aivu aivuVar2 = aivu.a;
        aivuVar.q = rmsVar.B;
        aivuVar.b |= 16384;
    }

    public final void aB(rmt rmtVar) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        aivu aivuVar = akzxVar.b;
        aivu aivuVar2 = aivu.a;
        aivuVar.r = rmtVar.q;
        aivuVar.b |= 32768;
    }

    public final void aC(java.lang.String str) {
        aooh.f(str, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        aivu aivuVar = akzxVar.b;
        aivu aivuVar2 = aivu.a;
        j$.util.Objects.requireNonNull(str);
        aivuVar.b |= 8;
        aivuVar.g = str;
    }

    public final void aD(aivt aivtVar) {
        aooh.f(aivtVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        aivu aivuVar = akzxVar.b;
        aivu aivuVar2 = aivu.a;
        aivuVar.f = aivtVar.e;
        aivuVar.b |= 4;
    }

    public final void aE() {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        aivu aivuVar = akzxVar.b;
        aivu aivuVar2 = aivu.a;
        j$.util.Objects.requireNonNull("dialer");
        aivuVar.b |= 1;
        aivuVar.d = "dialer";
    }

    public final void aF(int i) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        aivu aivuVar = akzxVar.b;
        aivu aivuVar2 = aivu.a;
        aivuVar.o = i - 1;
        aivuVar.b |= 4096;
    }

    public final void aG(int i) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        aivu aivuVar = akzxVar.b;
        aivu aivuVar2 = aivu.a;
        aivuVar.i = i - 1;
        aivuVar.b |= 32;
    }

    public final /* synthetic */ aivr aH() {
        aivr aivrVarP = ((akzx) this.a).p();
        aooh.e(aivrVarP, "build(...)");
        return aivrVarP;
    }

    public final void aI(nvq nvqVar) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        aivr aivrVar = akzxVar.b;
        alal alalVar = aivr.a;
        aivrVar.j = nvqVar.e;
        aivrVar.c |= 64;
    }

    public final void aJ(boolean z) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        aivr aivrVar = akzxVar.b;
        alal alalVar = aivr.a;
        aivrVar.c |= 512;
        aivrVar.n = z;
    }

    public final void aK(int i) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        aivr aivrVar = akzxVar.b;
        alal alalVar = aivr.a;
        aivrVar.k = i - 1;
        aivrVar.c |= 128;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    public final void aL(aikb aikbVar) {
        ahvr.bR(!aikbVar.b(), "range must not be empty, but was %s", aikbVar);
        this.a.add(aikbVar);
    }

    public final /* synthetic */ defpackage.ahwh aM() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.ahwh) aladVarP;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
    
        if (r8 == r1) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [uzx] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object aN(java.lang.String r6, aonj r7, aoln r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.ahrt
            if (r0 == 0) goto L13
            r0 = r8
            ahrt r0 = (defpackage.ahrt) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ahrt r0 = new ahrt
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.b
            aolu r1 = aolu.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            java.lang.Object r5 = r0.a
            aooc.af(r8)     // Catch: java.lang.Throwable -> L67
            goto L60
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            aooc.af(r8)
            goto L66
        L38:
            aooc.af(r8)
            boolean r8 = ahns.q()
            if (r8 == 0) goto L4a
            r0.c = r4
            java.lang.Object r8 = r7.a(r0)
            if (r8 != r1) goto L66
            goto L5e
        L4a:
            java.lang.Object r5 = r5.a
            ahpz r5 = (ahpz) r5
            r8 = 1467(0x5bb, float:2.056E-42)
            ahok r5 = r5.f(r8, r6)
            r0.a = r5     // Catch: java.lang.Throwable -> L67
            r0.c = r3     // Catch: java.lang.Throwable -> L67
            java.lang.Object r8 = r7.a(r0)     // Catch: java.lang.Throwable -> L67
            if (r8 != r1) goto L60
        L5e:
            r8 = r1
            goto L66
        L60:
            gfz r8 = (gfz) r8     // Catch: java.lang.Throwable -> L67
            r6 = 0
            ajsz.ak(r5, r6)
        L66:
            return r8
        L67:
            r6 = move-exception
            throw r6     // Catch: java.lang.Throwable -> L69
        L69:
            r7 = move-exception
            ajsz.ak(r5, r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uzx.aN(java.lang.String, aonj, aoln):java.lang.Object");
    }

    public final ahpm aO(java.lang.String str, java.lang.String str2) {
        ahwt ahwtVarH;
        if (ahns.q()) {
            ahwtVarH = ahwt.a;
        } else {
            ahwtVarH = ahyn.h(((ahpz) this.a).g(1417, "Invoking ".concat(str)));
        }
        return new defpackage.ahmt((ahpm) ahvr.Z(1418, a.bE(str2, (byte) 46, str)), (java.lang.Object) ahwtVarH, 3);
    }

    public final java.lang.Object[] aP() {
        return (java.lang.Object[]) ((adag) this.a).a;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [amwu, java.lang.Object] */
    public final void aQ() {
        j$.lang.Iterable.-EL.forEach((java.util.Set) this.a.a(), new defpackage.uwm(19));
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [amwu, java.lang.Object] */
    public final void aR() {
        j$.lang.Iterable.-EL.forEach((java.util.Set) this.a.a(), new defpackage.uwm(18));
    }

    public final java.lang.Object aS(int i, emx emxVar, defpackage.ahgv ahgvVar) {
        return ((defpackage.ahgw) this.a).h(i, emxVar, ahgvVar, new defpackage.agzm(2));
    }

    public final java.lang.Object aT(int i, emx emxVar, defpackage.ahgv ahgvVar, defpackage.ahgu ahguVar) {
        return ((defpackage.ahgw) this.a).h(i, emxVar, ahgvVar, ahguVar);
    }

    public final /* synthetic */ defpackage.ahbd aU() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.ahbd) aladVarP;
    }

    public final void aa(int i) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.zsf zsfVar = (defpackage.zsf) akzxVar.b;
        defpackage.zsf zsfVar2 = defpackage.zsf.a;
        zsfVar.g = a.aT(i);
        zsfVar.b |= 32;
    }

    public final /* synthetic */ defpackage.zsc ab() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.zsc) aladVarP;
    }

    public final void ac(lvm lvmVar) {
        aooh.f(lvmVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.zsc zscVar = (defpackage.zsc) akzxVar.b;
        defpackage.zsc zscVar2 = defpackage.zsc.a;
        j$.util.Objects.requireNonNull(lvmVar);
        zscVar.c = lvmVar;
        zscVar.b |= 1;
    }

    public final boolean ad() {
        return ((java.util.concurrent.atomic.AtomicBoolean) this.a).get();
    }

    public final synchronized ajex ae() {
        return ajex.f(((akzx) this.a).p(), ajfj.b);
    }

    public final ajqb af() throws java.io.IOException {
        try {
            java.lang.Object obj = this.a;
            return alad.A(ajqb.a, (java.io.InputStream) obj, akzq.a);
        } finally {
            ((java.io.InputStream) this.a).close();
        }
    }

    public final /* synthetic */ ajds ag() {
        ajds ajdsVarP = ((akzx) this.a).p();
        aooh.e(ajdsVarP, "build(...)");
        return ajdsVarP;
    }

    public final /* synthetic */ aixo ah() {
        aixo aixoVarP = ((akzx) this.a).p();
        aooh.e(aixoVarP, "build(...)");
        return aixoVarP;
    }

    public final void ai(boolean z) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        aixo aixoVar = akzxVar.b;
        aixo aixoVar2 = aixo.a;
        aixoVar.b |= Integer.MIN_VALUE;
        aixoVar.C = z;
    }

    public final void aj(java.lang.String str) {
        aooh.f(str, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        aixo aixoVar = akzxVar.b;
        aixo aixoVar2 = aixo.a;
        j$.util.Objects.requireNonNull(str);
        aixoVar.b |= 2;
        aixoVar.e = str;
    }

    public final void ak(boolean z) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        aixo aixoVar = akzxVar.b;
        aixo aixoVar2 = aixo.a;
        aixoVar.b |= 4194304;
        aixoVar.w = z;
    }

    public final void al(java.lang.String str) {
        aooh.f(str, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        aixo aixoVar = akzxVar.b;
        aixo aixoVar2 = aixo.a;
        j$.util.Objects.requireNonNull(str);
        aixoVar.b |= 262144;
        aixoVar.s = str;
    }

    public final void am(java.lang.String str) {
        aooh.f(str, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        aixo aixoVar = akzxVar.b;
        aixo aixoVar2 = aixo.a;
        j$.util.Objects.requireNonNull(str);
        aixoVar.b |= 524288;
        aixoVar.t = str;
    }

    public final void an(aiye aiyeVar) {
        aooh.f(aiyeVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        aixo aixoVar = akzxVar.b;
        aixo aixoVar2 = aixo.a;
        j$.util.Objects.requireNonNull(aiyeVar);
        aixoVar.D = aiyeVar;
        aixoVar.c |= 1;
    }

    public final void ao(aixn aixnVar) {
        aooh.f(aixnVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        aixo aixoVar = akzxVar.b;
        aixo aixoVar2 = aixo.a;
        aixoVar.h = aixnVar.l;
        aixoVar.b |= 32;
    }

    public final void ap(boolean z) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        aixo aixoVar = akzxVar.b;
        aixo aixoVar2 = aixo.a;
        aixoVar.b |= 536870912;
        aixoVar.A = z;
    }

    public final void aq(java.lang.String str) {
        aooh.f(str, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        aixo aixoVar = akzxVar.b;
        aixo aixoVar2 = aixo.a;
        j$.util.Objects.requireNonNull(str);
        aixoVar.b |= 256;
        aixoVar.k = str;
    }

    public final void ar(boolean z) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        aixo aixoVar = akzxVar.b;
        aixo aixoVar2 = aixo.a;
        aixoVar.b |= 32768;
        aixoVar.q = z;
    }

    public final void as(java.lang.String str) {
        aooh.f(str, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        aixo aixoVar = akzxVar.b;
        aixo aixoVar2 = aixo.a;
        j$.util.Objects.requireNonNull(str);
        aixoVar.b |= 4;
        aixoVar.f = str;
    }

    public final void at(aiyi aiyiVar) {
        aooh.f(aiyiVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        aixo aixoVar = akzxVar.b;
        aixo aixoVar2 = aixo.a;
        j$.util.Objects.requireNonNull(aiyiVar);
        aixoVar.E = aiyiVar;
        aixoVar.c |= 2;
    }

    public final void au(java.lang.String str) {
        aooh.f(str, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        aixo aixoVar = akzxVar.b;
        aixo aixoVar2 = aixo.a;
        j$.util.Objects.requireNonNull(str);
        aixoVar.b |= 128;
        aixoVar.j = str;
    }

    public final void av(long j) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        aixo aixoVar = akzxVar.b;
        aixo aixoVar2 = aixo.a;
        aixoVar.b |= 8;
        aixoVar.g = j;
    }

    public final void aw() {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        aixo aixoVar = akzxVar.b;
        aixo aixoVar2 = aixo.a;
        j$.util.Objects.requireNonNull("Dialer");
        aixoVar.b |= 1;
        aixoVar.d = "Dialer";
    }

    public final /* synthetic */ aixp ax() {
        aixp aixpVarP = ((akzx) this.a).p();
        aooh.e(aixpVarP, "build(...)");
        return aixpVarP;
    }

    public final void ay(aixo aixoVar) {
        aooh.f(aixoVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        aixp aixpVar = akzxVar.b;
        aixp aixpVar2 = aixp.a;
        j$.util.Objects.requireNonNull(aixoVar);
        aixpVar.c = aixoVar;
        aixpVar.b |= 1;
    }

    public final /* synthetic */ aivu az() {
        aivu aivuVarP = ((akzx) this.a).p();
        aooh.e(aivuVarP, "build(...)");
        return aivuVarP;
    }

    public final void b(vcp vcpVar) {
        aooh.f(vcpVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        vcr vcrVar = akzxVar.b;
        vcr vcrVar2 = vcr.a;
        j$.util.Objects.requireNonNull(vcpVar);
        vcrVar.c = vcpVar;
        vcrVar.b = 2;
    }

    public final void ba(int i, boolean z) {
        ((apxj) this.a).o(i, z);
    }

    public final void bb(int i, apxo apxoVar) {
        ((apxj) this.a).p(i, apxoVar);
    }

    public final void bc(int i, double d) {
        ((apxj) this.a).h(i, d);
    }

    public final void bd(int i, int i2) {
        ((apxj) this.a).v(i, i2);
    }

    public final void be(int i, int i2) {
        ((apxj) this.a).r(i, i2);
    }

    public final void bf(int i, long j) {
        ((apxj) this.a).t(i, j);
    }

    public final void bg(int i, float f) {
        ((apxj) this.a).j(i, f);
    }

    public final void bh(int i, java.lang.Object obj, apze apzeVar) {
        int i2 = i << 3;
        apxj apxjVar = (apxj) this.a;
        apxjVar.B(i2 | 3);
        apzeVar.i((apxf) obj, this);
        apxjVar.B(i2 | 4);
    }

    public final void bi(int i, int i2) {
        ((apxj) this.a).v(i, i2);
    }

    public final void bj(int i, long j) {
        ((apxj) this.a).C(i, j);
    }

    public final void bk(int i, java.lang.Object obj, apze apzeVar) {
        apxf apxfVar = (apxf) obj;
        apxj apxjVar = (apxj) this.a;
        apxjVar.B((i << 3) | 2);
        apxjVar.B(apxfVar.b(apzeVar));
        apzeVar.i(apxfVar, this);
    }

    public final void bl(int i, int i2) {
        ((apxj) this.a).r(i, i2);
    }

    public final void bm(int i, long j) {
        ((apxj) this.a).t(i, j);
    }

    public final void bn(int i, int i2) {
        ((apxj) this.a).A(i, (i2 << 1) ^ (i2 >> 31));
    }

    public final void bo(int i, long j) {
        ((apxj) this.a).C(i, (j << 1) ^ (j >> 63));
    }

    public final void bp(int i, int i2) {
        ((apxj) this.a).A(i, i2);
    }

    public final void bq(int i, long j) {
        ((apxj) this.a).C(i, j);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final java.util.Map br() {
        return j$.util.DesugarCollections.unmodifiableMap((java.util.Map) this.a);
    }

    public final apjb bt(java.lang.Object obj) {
        aily ailpVar;
        aimg aimgVarA = ((ailw) this.a).a(aify.p(obj));
        aizh aizhVarB = aimgVarA.b(obj);
        int iA = aimgVarA.a();
        int i = aizhVarB.c;
        if (i != 0) {
            if (i != 1) {
                ailpVar = new aily(aizhVarB, iA);
            } else {
                boolean z = i == 1;
                ailq ailqVar = ailq.a;
                ahvr.bR(z, "Expected seq of length 1, found ", aizhVarB);
                ailpVar = new ailp(aizhVarB);
            }
        } else {
            ailpVar = ailq.a;
        }
        return new apjb(aimgVarA, ailpVar);
    }

    public final void c(vcq vcqVar) {
        aooh.f(vcqVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        vcr vcrVar = akzxVar.b;
        vcr vcrVar2 = vcr.a;
        j$.util.Objects.requireNonNull(vcqVar);
        vcrVar.c = vcqVar;
        vcrVar.b = 1;
    }

    public final /* synthetic */ defpackage.uwx d() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.uwx) aladVarP;
    }

    public final void e(java.lang.String str) {
        aooh.f(str, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.uwx uwxVar = (defpackage.uwx) akzxVar.b;
        defpackage.uwx uwxVar2 = defpackage.uwx.a;
        j$.util.Objects.requireNonNull(str);
        uwxVar.b |= 1;
        uwxVar.c = str;
    }

    public final void f() {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.uwx uwxVar = (defpackage.uwx) akzxVar.b;
        defpackage.uwx uwxVar2 = defpackage.uwx.a;
        uwxVar.d = 0;
    }

    public final /* synthetic */ wgi g() {
        wgi wgiVarP = ((akzx) this.a).p();
        aooh.e(wgiVarP, "build(...)");
        return wgiVarP;
    }

    public final /* synthetic */ defpackage.weh h() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.weh) aladVarP;
    }

    public final void i(java.lang.String str) {
        aooh.f(str, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.weh wehVar = (defpackage.weh) akzxVar.b;
        defpackage.weh wehVar2 = defpackage.weh.a;
        j$.util.Objects.requireNonNull(str);
        wehVar.b = str;
    }

    public final /* synthetic */ defpackage.wcn j() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.wcn) aladVarP;
    }

    public final /* synthetic */ udm k() {
        udm udmVarP = ((akzx) this.a).p();
        aooh.e(udmVarP, "build(...)");
        return udmVarP;
    }

    public final void l(udj udjVar) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        udm udmVar = akzxVar.b;
        udm udmVar2 = udm.a;
        udmVar.d = udjVar.f;
        udmVar.b |= 2;
    }

    public final void m(udk udkVar) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        udm udmVar = akzxVar.b;
        udm udmVar2 = udm.a;
        udmVar.f = udkVar.d;
        udmVar.b |= 8;
    }

    public final void n(long j) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        udm udmVar = akzxVar.b;
        udm udmVar2 = udm.a;
        udmVar.b |= 1;
        udmVar.c = j;
    }

    public final /* synthetic */ defpackage.ucq o() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.ucq) aladVarP;
    }

    public final void p(long j) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.ucq ucqVar = (defpackage.ucq) akzxVar.b;
        defpackage.ucq ucqVar2 = defpackage.ucq.a;
        ucqVar.b |= 8;
        ucqVar.f = j;
    }

    public final void q(int i) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.ucq ucqVar = (defpackage.ucq) akzxVar.b;
        defpackage.ucq ucqVar2 = defpackage.ucq.a;
        ucqVar.b |= 4;
        ucqVar.e = i;
    }

    public final void r(java.lang.String str) {
        aooh.f(str, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.ucq ucqVar = (defpackage.ucq) akzxVar.b;
        defpackage.ucq ucqVar2 = defpackage.ucq.a;
        j$.util.Objects.requireNonNull(str);
        ucqVar.b |= 2;
        ucqVar.d = str;
    }

    public final void s(aivu aivuVar) {
        aooh.f(aivuVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.ucq ucqVar = (defpackage.ucq) akzxVar.b;
        defpackage.ucq ucqVar2 = defpackage.ucq.a;
        j$.util.Objects.requireNonNull(aivuVar);
        ucqVar.c = aivuVar;
        ucqVar.b |= 1;
    }

    public final /* synthetic */ defpackage.tyw t() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.tyw) aladVarP;
    }

    public final void u(defpackage.tyv tyvVar) {
        aooh.f(tyvVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.tyw tywVar = (defpackage.tyw) akzxVar.b;
        defpackage.tyw tywVar2 = defpackage.tyw.a;
        tywVar.d = tyvVar.a();
    }

    public final void v(int i) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.tyw tywVar = (defpackage.tyw) akzxVar.b;
        defpackage.tyw tywVar2 = defpackage.tyw.a;
        tywVar.b |= 2;
        tywVar.h = i;
    }

    public final void w(java.lang.String str) {
        aooh.f(str, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.tyw tywVar = (defpackage.tyw) akzxVar.b;
        defpackage.tyw tywVar2 = defpackage.tyw.a;
        j$.util.Objects.requireNonNull(str);
        tywVar.e = str;
    }

    public final void x(boolean z) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.tyw tywVar = (defpackage.tyw) akzxVar.b;
        defpackage.tyw tywVar2 = defpackage.tyw.a;
        tywVar.f = z;
    }

    public final void y(java.lang.String str) {
        aooh.f(str, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.tyw tywVar = (defpackage.tyw) akzxVar.b;
        defpackage.tyw tywVar2 = defpackage.tyw.a;
        j$.util.Objects.requireNonNull(str);
        tywVar.c = str;
    }

    public final /* synthetic */ twk z() {
        twk twkVarP = ((akzx) this.a).p();
        aooh.e(twkVarP, "build(...)");
        return twkVarP;
    }

    public uzx(defpackage.ahji ahjiVar) {
        this.a = ahjiVar;
        ahjiVar.c = false;
    }

    public uzx(defpackage.ahji ahjiVar, byte[] bArr) {
        this.a = ahjiVar;
        ahjiVar.c = true;
    }

    public uzx(ahpz ahpzVar, byte[] bArr, byte[] bArr2) {
        aooh.f(ahpzVar, "traceCreation");
        this.a = ahpzVar;
    }

    public uzx(android.content.Context context) {
        aooh.f(context, "appContext");
        this.a = context;
    }

    public uzx(apzv apzvVar, apzv apzvVar2, java.lang.Object obj) {
        this.a = new apyr(apzvVar, apzvVar2, obj);
    }

    public uzx(java.lang.Object obj) {
        this.a = obj;
    }

    public uzx(java.lang.Object obj, byte[] bArr) {
        this.a = obj;
    }

    public uzx(java.util.regex.Matcher matcher) {
        ahvr.ci(matcher);
        this.a = matcher;
    }

    public uzx(byte[] bArr, byte[] bArr2) {
        this.a = new aplv();
    }

    public uzx(byte[] bArr, char[] cArr) {
        this.a = new java.util.ArrayList();
    }

    public uzx(char[] cArr) {
        this.a = new java.util.HashMap();
    }

    public uzx(ailw ailwVar) {
        ahvr.ci(ailwVar);
        this.a = ailwVar;
    }

    public uzx(short[] sArr) {
        this.a = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    public uzx(apxj apxjVar) {
        byte[] bArr = apyj.a;
        this.a = apxjVar;
        apxjVar.a = this;
    }

    public uzx() {
        this.a = new zzx((char[]) null);
    }

    public uzx(defpackage.aaol aaolVar) {
        new java.util.HashMap();
        new java.util.HashMap();
        aais.as(aaolVar);
        this.a = aaolVar;
    }

    public uzx(defpackage.aalb aalbVar) {
        aais.as(aalbVar);
        this.a = aalbVar;
    }
}
