package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class whv implements java.util.concurrent.Callable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ whv(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x014c  */
    /* JADX WARN: Type inference failed for: r0v100, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v131, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v133, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v37, types: [ahzi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v89, types: [java.lang.Object, java.util.concurrent.Callable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v70, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v77, types: [java.lang.Object, wvs] */
    /* JADX WARN: Type inference failed for: r1v81, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v95, types: [java.lang.Object, java.util.Map] */
    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() throws java.io.IOException {
        boolean z;
        defpackage.wxp wxpVar;
        int i = 8;
        int i2 = 4;
        byte[] bArr = null;
        boolean z2 = true;
        int i3 = 0;
        switch (this.$cid) {
            case 0:
                akzx akzxVarM = defpackage.whw.a.m();
                ?? r2 = ((defpackage.voc) this.a).a;
                java.lang.Object obj = this.b;
                defpackage.whw whwVar = (defpackage.whw) ((akzx) j$.util.Map.-EL.getOrDefault((java.util.Map) r2, obj, akzxVarM)).p();
                r2.remove(obj);
                return whwVar;
            case 1:
                ((defpackage.wsk) this.a).c.remove(this.b);
                return null;
            case 2:
                ?? r1 = this.a;
                aigf aigfVar = defpackage.whz.a;
                int size = r1.size();
                while (true) {
                    java.lang.Object obj2 = this.b;
                    if (i3 >= size) {
                        return new amms(((defpackage.ahwh) ((akzx) obj2).p()).i());
                    }
                    defpackage.whx whxVar = (defpackage.whx) r1.get(i3);
                    akzx akzxVarM2 = defpackage.ahwg.a.m();
                    java.lang.String str = whxVar.a;
                    akzxVarM2.u();
                    defpackage.ahwg ahwgVar = (defpackage.ahwg) akzxVarM2.b;
                    j$.util.Objects.requireNonNull(str);
                    ahwgVar.b |= 1;
                    ahwgVar.c = str;
                    akzc akzcVar = whxVar.b;
                    akzxVarM2.u();
                    defpackage.ahwg ahwgVar2 = (defpackage.ahwg) akzxVarM2.b;
                    j$.util.Objects.requireNonNull(akzcVar);
                    ahwgVar2.b |= 2;
                    ahwgVar2.d = akzcVar;
                    ((akzx) obj2).at((defpackage.ahwg) akzxVarM2.p());
                    i3++;
                }
                break;
            case 3:
                java.util.LinkedHashMap linkedHashMap = ((defpackage.wjb) this.a).b;
                linkedHashMap.clear();
                ailk ailkVarY = ((aify) this.b).y(0);
                while (ailkVarY.hasNext()) {
                    defpackage.wmz wmzVar = (defpackage.wmz) ailkVarY.next();
                    linkedHashMap.put(java.lang.Long.valueOf(wmzVar.e), wmzVar);
                }
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                hkd hkdVar = (hkd) this.a;
                if (!hkdVar.e) {
                    defpackage.wkh.a.b().l("com/android/dialer/xatu/impl/service/CachedIvrDataFetcher", "queryXatuInfoLookupApi", 127, "CachedIvrDataFetcher.java").v("phone number not valid");
                    return null;
                }
                java.lang.String str2 = hkdVar.c;
                if (str2.isEmpty()) {
                    defpackage.wkh.a.b().l("com/android/dialer/xatu/impl/service/CachedIvrDataFetcher", "queryXatuInfoLookupApi", 132, "CachedIvrDataFetcher.java").v("normalized number is empty");
                    return null;
                }
                java.lang.Object obj3 = this.b;
                defpackage.aknc akncVar = defpackage.aknc.a;
                akzx akzxVarM3 = akncVar.m();
                akzxVarM3.u();
                defpackage.aknc akncVar2 = (defpackage.aknc) akzxVarM3.b;
                j$.util.Objects.requireNonNull(str2);
                akncVar2.b = str2;
                defpackage.wkh wkhVar = (defpackage.wkh) obj3;
                long jLongValue = ((java.lang.Long) wkhVar.h.a()).longValue();
                akzxVarM3.u();
                ((defpackage.aknc) akzxVarM3.b).c = jLongValue;
                defpackage.aknc akncVar3 = (defpackage.aknc) akzxVarM3.p();
                akmq akmqVarI = ((akmq) wkhVar.i.a()).j(new anme[]{wkhVar.b, wkhVar.c}).k(defpackage.zcv.a, defpackage.zcv.a()).i(7000L, java.util.concurrent.TimeUnit.MILLISECONDS);
                anmc anmcVar = ((aohh) akmqVarI).a;
                anpk anpkVar = defpackage.akmr.a;
                if (anpkVar == null) {
                    synchronized (defpackage.akmr.class) {
                        anpkVar = defpackage.akmr.a;
                        if (anpkVar == null) {
                            aal aalVarD = anpk.d();
                            aalVarD.b = anpj.a;
                            aalVarD.d = anpk.c("google.internal.dialer.v1.DialerCallInfoLookupService", "GetXatuInfo");
                            aalVarD.b();
                            akzq akzqVar = aohd.a;
                            aalVarD.e = new aohc(akncVar);
                            aalVarD.c = new aohc(defpackage.aknd.a);
                            anpk anpkVarA = aalVarD.a();
                            defpackage.akmr.a = anpkVarA;
                            anpkVar = anpkVarA;
                        }
                        break;
                    }
                }
                wkhVar.j = ahrv.g(aohp.a(anmcVar.b(anpkVar, ((aohh) akmqVarI).b), akncVar3)).e(java.lang.Exception.class, new defpackage.wkb(i2), wkhVar.f);
                return null;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return j$.util.Optional.ofNullable((nzb) ((defpackage.wmy) this.a).i.get(this.b));
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                defpackage.wqo wqoVar = (defpackage.wqo) this.a;
                int iIntValue = ((java.lang.Integer) wqoVar.c.eZ()).intValue();
                java.lang.Object obj4 = this.b;
                j$.util.Optional optional = (j$.util.Optional) obj4;
                java.lang.Object objOfNullable = obj4;
                if (true == optional.isPresent()) {
                    objOfNullable = j$.util.Optional.ofNullable(java.lang.Integer.valueOf(defpackage.wqo.a(((java.lang.Integer) optional.get()).intValue())));
                }
                ahzi ahziVar = wqoVar.b;
                j$.util.Objects.requireNonNull(ahziVar);
                j$.util.Optional optional2 = (j$.util.Optional) objOfNullable;
                wqoVar.c(wqoVar.d.e(0, java.lang.Math.max(0, wqoVar.d.c() - java.lang.Math.min(iIntValue, ((java.lang.Integer) (true != optional2.isPresent() ? (java.lang.Integer) new idb(ahziVar, 11).a.eZ() : optional2.get())).intValue()))));
                return wqoVar.b();
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                defpackage.wqo wqoVar2 = (defpackage.wqo) this.a;
                if (!wqoVar2.e.isPresent()) {
                    wqoVar2.e = j$.util.Optional.of(java.lang.Long.valueOf(j$.time.Instant.now().toEpochMilli()));
                    akzx akzxVar = wqoVar2.f;
                    akzxVar.u();
                    defpackage.wqn wqnVar = (defpackage.wqn) akzxVar.b;
                    defpackage.wqn wqnVar2 = defpackage.wqn.a;
                    wqnVar.b |= 16;
                    wqnVar.g = 16000;
                    long jLongValue2 = ((java.lang.Long) wqoVar2.e.orElseThrow()).longValue();
                    akzxVar.u();
                    defpackage.wqn wqnVar3 = (defpackage.wqn) akzxVar.b;
                    wqnVar3.b |= 2;
                    wqnVar3.d = jLongValue2;
                }
                wqoVar2.d = wqoVar2.d.r((akzc) this.b);
                int iC = wqoVar2.d.c() - ((java.lang.Integer) wqoVar2.c.eZ()).intValue();
                if (iC <= 0) {
                    return null;
                }
                akzc akzcVarE = wqoVar2.d.e(0, iC);
                wqoVar2.d = wqoVar2.d.x(iC);
                wqoVar2.c(akzcVarE);
                return null;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                defpackage.wrc wrcVar = (defpackage.wrc) this.a;
                java.io.File file = new java.io.File(((defpackage.wrh) this.b).f.getCacheDir(), java.lang.String.format(java.util.Locale.US, "xatu_session_logs_%d", java.lang.Long.valueOf(wrcVar.d)));
                java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file);
                wrcVar.g.h(fileOutputStream);
                fileOutputStream.close();
                return j$.util.Optional.of(file.getAbsolutePath());
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                defpackage.wrc wrcVar2 = (defpackage.wrc) this.a;
                defpackage.wre wreVar = wrcVar2.h;
                java.lang.Object obj5 = this.b;
                defpackage.wre wreVar2 = defpackage.wre.AGENT_DETECTED;
                aify aifyVar = wrcVar2.b;
                if (wreVar == wreVar2) {
                    long j = wrcVar2.f;
                    long j2 = wrcVar2.e;
                    j$.util.Optional optionalA = defpackage.wrh.a(wrcVar2);
                    defpackage.wrh wrhVar = (defpackage.wrh) obj5;
                    final long j3 = j - j2;
                    final long jMin = java.lang.Math.min(((java.lang.Long) wrhVar.i.a()).longValue(), optionalA.isPresent() ? ((java.lang.Integer) optionalA.orElseThrow()).intValue() : ((java.lang.Long) wrhVar.h.a()).longValue());
                    aifyVar = (aify) j$.util.Collection.-EL.stream(aifyVar).filter(new java.util.function.Predicate() { // from class: wrg
                        @Override // java.util.function.Predicate
                        public final /* synthetic */ java.util.function.Predicate and(java.util.function.Predicate predicate) {
                            return j$.util.function.Predicate.-CC.$default$and(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        public final /* synthetic */ java.util.function.Predicate negate() {
                            return j$.util.function.Predicate.-CC.$default$negate(this);
                        }

                        @Override // java.util.function.Predicate
                        public final /* synthetic */ java.util.function.Predicate or(java.util.function.Predicate predicate) {
                            return j$.util.function.Predicate.-CC.$default$or(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        public final boolean test(java.lang.Object obj6) {
                            return j3 - ((long) ((altn) obj6).d) > jMin * 1000;
                        }
                    }).collect(aido.a);
                }
                akzx akzxVarM4 = defpackage.wqu.a.m();
                akzxVarM4.u();
                defpackage.wqu wquVar = (defpackage.wqu) akzxVarM4.b;
                alat alatVar = wquVar.b;
                if (!alatVar.c()) {
                    wquVar.b = alad.J(alatVar);
                }
                akyl.i(aifyVar, wquVar.b);
                defpackage.wqu wquVar2 = (defpackage.wqu) akzxVarM4.p();
                java.io.File file2 = new java.io.File(((defpackage.wrh) obj5).f.getCacheDir(), java.lang.String.format(java.util.Locale.US, "xatu_duplex_logs_%d", java.lang.Long.valueOf(wrcVar2.d)));
                java.io.FileOutputStream fileOutputStream2 = new java.io.FileOutputStream(file2);
                wquVar2.h(fileOutputStream2);
                fileOutputStream2.close();
                return j$.util.Optional.of(file2.getAbsolutePath());
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                defpackage.wrc wrcVar3 = (defpackage.wrc) this.a;
                long j4 = wrcVar3.d;
                defpackage.wrh wrhVar2 = (defpackage.wrh) this.b;
                java.io.File file3 = new java.io.File(wrhVar2.f.getCacheDir(), java.lang.String.format(java.util.Locale.US, "xatu_tree_%d", java.lang.Long.valueOf(j4)));
                java.io.FileOutputStream fileOutputStream3 = new java.io.FileOutputStream(file3);
                (wrcVar3.h == defpackage.wre.AGENT_DETECTED ? defpackage.wqw.a((amgq) wrcVar3.a.orElseThrow(), ((java.lang.Long) wrhVar2.g.a.a()).intValue()) : defpackage.wqw.a((amgq) wrcVar3.a.orElseThrow(), 0)).h(fileOutputStream3);
                fileOutputStream3.close();
                return j$.util.Optional.of(file3.getAbsolutePath());
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                defpackage.wvn wvnVar = (defpackage.wvn) this.b;
                ahvr.bY(wvnVar.h.isPresent());
                aiql.H((java.util.concurrent.Future) wvnVar.h.orElseThrow());
                if (wvnVar.g.get()) {
                    return null;
                }
                java.lang.Object obj6 = this.a;
                defpackage.wvx wvxVar = wvnVar.b;
                hgb.h(defpackage.wwj.a.b(), "submitting data", "com/android/incallui/atlas/detection/techniques/composite/CompositeModelRunner", "submitData", (char) 215, "CompositeModelRunner.java", (byte) 1, zct.a, java.util.concurrent.TimeUnit.MINUTES);
                defpackage.wwj wwjVar = (defpackage.wwj) wvxVar.c;
                final defpackage.wxj wxjVar = wwjVar.f;
                final defpackage.wvg wvgVar = (defpackage.wvg) obj6;
                agsm.i(1138, wxjVar.j.d(ahqx.i(new java.util.concurrent.Callable() { // from class: wxi
                    /* JADX WARN: Type inference failed for: r2v16, types: [aoin, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r2v27, types: [ahzi, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r2v9, types: [aoin, java.lang.Object] */
                    @Override // java.util.concurrent.Callable
                    public final java.lang.Object call() {
                        int iIntValue2;
                        float[] fArr;
                        j$.util.Optional optionalOf;
                        j$.util.OptionalLong optionalLongEmpty;
                        float[] fArr2;
                        float[] fArr3;
                        int i4;
                        defpackage.wxj wxjVar2 = wxjVar;
                        if (wxjVar2.g.get()) {
                            defpackage.wvg wvgVar2 = wvgVar;
                            int i5 = wvgVar2.c;
                            int i6 = 1;
                            if (i5 == 1) {
                                defpackage.wvf wvfVar = i5 == 1 ? (defpackage.wvf) wvgVar2.d : defpackage.wvf.a;
                                final defpackage.wvq wvqVar = wxjVar2.f;
                                final long j5 = wvgVar2.e;
                                final long jC = wvfVar.c.c();
                                agsm.i(1116, wvqVar.a(new java.util.concurrent.Callable() { // from class: wvp
                                    @Override // java.util.concurrent.Callable
                                    public final java.lang.Object call() {
                                        wvqVar.d(j5, j$.util.Optional.of(java.lang.Long.valueOf(jC)), j$.util.Optional.empty());
                                        return null;
                                    }
                                }), "failed to record received bytes", new java.lang.Object[0]);
                                if (wvfVar.d != 16000) {
                                    hgb.c(defpackage.wxj.a.d(), "input sample rate different from required window sample rate; consider resampling input", "com/android/incallui/atlas/detection/techniques/soundeventdetection/SoundEventDetectionModelRunner", "submitData", 'y', "SoundEventDetectionModelRunner.java", (byte) 10, java.util.concurrent.TimeUnit.SECONDS);
                                }
                                defpackage.wvr wvrVar = wxjVar2.c;
                                if (wvfVar.d == 0 || wvfVar.e == 0) {
                                    hgb.c(defpackage.wvr.a.d(), "invalid sample rate or frame size", "com/android/incallui/atlas/detection/processors/DetectionTimer", "tick", (char) 23, "DetectionTimer.java", (byte) 10, java.util.concurrent.TimeUnit.SECONDS);
                                } else {
                                    wvrVar.b.getAndAdd(((((long) wvfVar.c.c()) * 1000) / ((long) wvfVar.d)) / ((long) wvfVar.e));
                                }
                                defpackage.wyw wywVar = wxjVar2.i;
                                java.util.List listM = ajee.m(wvfVar.c.D());
                                java.util.concurrent.ArrayBlockingQueue arrayBlockingQueue = (java.util.concurrent.ArrayBlockingQueue) wywVar.a;
                                arrayBlockingQueue.addAll(listM);
                                char c = 2;
                                if (arrayBlockingQueue.size() < 31200) {
                                    optionalOf = j$.util.Optional.empty();
                                    fArr = null;
                                } else {
                                    int iAN = a.aN(wvfVar.f);
                                    if (iAN == 0) {
                                        iAN = 1;
                                    }
                                    int i7 = iAN - 1;
                                    if (i7 == 1) {
                                        iIntValue2 = ((java.lang.Long) wywVar.b.a()).intValue();
                                    } else if (i7 != 2) {
                                        if (i7 != 3) {
                                            throw new java.lang.IllegalStateException("unsupported audio mode");
                                        }
                                        iIntValue2 = ((java.lang.Long) wywVar.b.a()).intValue();
                                    } else {
                                        iIntValue2 = ((java.lang.Long) wywVar.c.a()).intValue();
                                    }
                                    byte[] bArr2 = new byte[31200];
                                    java.util.Iterator it = arrayBlockingQueue.iterator();
                                    fArr = null;
                                    for (int i8 = 0; i8 < 31200; i8++) {
                                        bArr2[i8] = ((java.lang.Byte) it.next()).byteValue();
                                    }
                                    for (int i9 = 0; i9 < iIntValue2; i9++) {
                                        arrayBlockingQueue.poll();
                                    }
                                    optionalOf = j$.util.Optional.of(java.nio.ByteBuffer.wrap(bArr2));
                                }
                                if (!optionalOf.isPresent()) {
                                    return fArr;
                                }
                                defpackage.wxh wxhVar = defpackage.wxh.a;
                                akzx akzxVarM5 = wxhVar.m();
                                long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
                                akzxVarM5.u();
                                defpackage.wxh wxhVar2 = (defpackage.wxh) akzxVarM5.b;
                                wxhVar2.b |= 4;
                                wxhVar2.f = jElapsedRealtime;
                                long jA = wvrVar.a();
                                akzxVarM5.u();
                                defpackage.wxh wxhVar3 = (defpackage.wxh) akzxVarM5.b;
                                wxhVar3.b |= 16;
                                wxhVar3.h = jA;
                                long j6 = wvgVar2.e;
                                akzxVarM5.u();
                                defpackage.wxh wxhVar4 = (defpackage.wxh) akzxVarM5.b;
                                wxhVar4.b |= 32;
                                wxhVar4.i = j6;
                                defpackage.wvf wvfVar2 = wvgVar2.c == 1 ? (defpackage.wvf) wvgVar2.d : defpackage.wvf.a;
                                if (wvfVar2.d == 0 || wvfVar2.e == 0) {
                                    hgb.c(defpackage.wxj.a.d(), "unable to calculate audio duration: invalid audio data", "com/android/incallui/atlas/detection/techniques/soundeventdetection/SoundEventDetectionModelRunner", "getAudioDurationMillis", (char) 197, "SoundEventDetectionModelRunner.java", (byte) 10, java.util.concurrent.TimeUnit.SECONDS);
                                    optionalLongEmpty = j$.util.OptionalLong.empty();
                                } else {
                                    optionalLongEmpty = j$.util.OptionalLong.of(((((long) wvfVar2.c.c()) * 1000) / ((long) wvfVar2.d)) / ((long) wvfVar2.e));
                                }
                                j$.util.Objects.requireNonNull(akzxVarM5);
                                optionalLongEmpty.ifPresent(new defpackage.vpo(akzxVarM5, 2));
                                short[] sArr = new short[15600];
                                ((java.nio.ByteBuffer) optionalOf.orElseThrow()).order(java.nio.ByteOrder.nativeOrder()).asShortBuffer().get(sArr);
                                aqan aqanVar = (aqan) wxjVar2.k.a.eZ();
                                if (aqanVar == null) {
                                    fArr2 = fArr;
                                } else {
                                    float[] fArr4 = new float[15600];
                                    for (int i10 = 0; i10 < 15600; i10++) {
                                        fArr4[i10] = sArr[i10] / 32768.0f;
                                    }
                                    float[][] fArr5 = (float[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Float.TYPE, 1, 527);
                                    aqanVar.b(fArr4, fArr5);
                                    fArr2 = fArr5[0];
                                }
                                defpackage.wxk wxkVar = defpackage.wxk.UNKNOWN_SOUND_EVENT_TYPE;
                                float f = 0.0f;
                                int i11 = -1;
                                defpackage.wxk wxkVar2 = wxkVar;
                                int i12 = 0;
                                while (i12 < fArr2.length) {
                                    aigf aigfVar2 = defpackage.wxj.b;
                                    char c2 = c;
                                    java.lang.Integer numValueOf = java.lang.Integer.valueOf(i12);
                                    if (aigfVar2.containsKey(numValueOf)) {
                                        defpackage.wxk wxkVar3 = (defpackage.wxk) aigfVar2.get(numValueOf);
                                        akzx akzxVarM6 = defpackage.wxg.a.m();
                                        i4 = i6;
                                        float f2 = fArr2[i12];
                                        akzxVarM6.u();
                                        defpackage.wxg wxgVar = (defpackage.wxg) akzxVarM6.b;
                                        fArr3 = fArr2;
                                        wxgVar.b |= 2;
                                        wxgVar.d = f2;
                                        akzxVarM6.u();
                                        defpackage.wxg wxgVar2 = (defpackage.wxg) akzxVarM6.b;
                                        wxgVar2.c = wxkVar3.f;
                                        wxgVar2.b |= 1;
                                        akzxVarM5.az(akzxVarM6);
                                        if (((java.lang.Float) wxjVar2.e.get(wxkVar3)).floatValue() <= fArr3[i12]) {
                                            wxkVar2 = wxkVar3;
                                        }
                                    } else {
                                        fArr3 = fArr2;
                                        i4 = i6;
                                        float f3 = fArr3[i12];
                                        if (f < f3) {
                                            f = f3;
                                            i11 = i12;
                                        }
                                    }
                                    i12++;
                                    c = c2;
                                    i6 = i4;
                                    fArr2 = fArr3;
                                }
                                int i13 = i6;
                                agsm.i(1121, wvqVar.a(new defpackage.vgq(wvqVar, wvgVar2.e, wxkVar2, 2)), "failed to record sound event", new java.lang.Object[0]);
                                defpackage.wvs wvsVar = wxjVar2.h;
                                akzxVarM5.u();
                                defpackage.wxh wxhVar5 = (defpackage.wxh) akzxVarM5.b;
                                wxhVar5.c = wxkVar2.f;
                                wxhVar5.b |= 1;
                                akzx akzxVarM7 = defpackage.wxg.a.m();
                                akzxVarM7.u();
                                defpackage.wxg wxgVar3 = (defpackage.wxg) akzxVarM7.b;
                                wxgVar3.c = wxkVar.f;
                                wxgVar3.b |= 1;
                                akzxVarM7.u();
                                defpackage.wxg wxgVar4 = (defpackage.wxg) akzxVarM7.b;
                                wxgVar4.b |= 2;
                                wxgVar4.d = f;
                                akzxVarM5.az(akzxVarM7);
                                akzxVarM5.u();
                                defpackage.wxh wxhVar6 = (defpackage.wxh) akzxVarM5.b;
                                wxhVar6.b |= 2;
                                wxhVar6.e = i11;
                                long jElapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
                                akzxVarM5.u();
                                defpackage.wxh wxhVar7 = (defpackage.wxh) akzxVarM5.b;
                                wxhVar7.b |= 8;
                                wxhVar7.g = jElapsedRealtime2;
                                long jA2 = wvrVar.a();
                                akzxVarM5.u();
                                defpackage.wxh wxhVar8 = (defpackage.wxh) akzxVarM5.b;
                                wxhVar8.b |= 16;
                                wxhVar8.h = jA2;
                                defpackage.wxh wxhVar9 = (defpackage.wxh) akzxVarM5.p();
                                defpackage.wwh wwhVar = (defpackage.wwh) wvsVar;
                                defpackage.wwj wwjVar2 = wwhVar.a;
                                defpackage.wvs wvsVar2 = wwhVar.b;
                                agsm.i(1131, ahrv.g(wwjVar2.d.a()).h(new defpackage.wrn(wxhVar9, 7), wwjVar2.b), "failed to relay sound event", new java.lang.Object[0]);
                                defpackage.wxk wxkVarB = defpackage.wxk.b(wxhVar9.c);
                                if (wxkVarB == null) {
                                    wxkVarB = wxkVar;
                                }
                                if ((wxkVarB != defpackage.wxk.MUSIC && wxkVarB != defpackage.wxk.SILENCE) || wxkVarB == wwjVar2.g) {
                                    return fArr;
                                }
                                akzx akzxVarM8 = defpackage.wwf.a.m();
                                akzx akzxVarM9 = wxhVar.m();
                                akzxVarM9.u();
                                defpackage.wxh wxhVar10 = (defpackage.wxh) akzxVarM9.b;
                                wxhVar10.c = wxkVarB.f;
                                wxhVar10.b |= 1;
                                defpackage.wxh wxhVar11 = (defpackage.wxh) akzxVarM9.p();
                                akzxVarM8.u();
                                defpackage.wwf wwfVar = (defpackage.wwf) akzxVarM8.b;
                                j$.util.Objects.requireNonNull(wxhVar11);
                                wwfVar.c = wxhVar11;
                                wwfVar.b = i13;
                                wvsVar2.a((defpackage.wwf) akzxVarM8.p());
                                wwjVar2.g = wxkVarB;
                                return fArr;
                            }
                        }
                        return null;
                    }
                }), wxjVar.d), "failed to submit data", new java.lang.Object[0]);
                defpackage.wxc wxcVar = wwjVar.c;
                agsm.i(1137, wxcVar.i.d(ahqx.i(new defpackage.whv(wxcVar, obj6, 17, bArr)), wxcVar.d), "failed to submit data", new java.lang.Object[0]);
                agsm.i(1132, ahrv.g(wwjVar.d.a()).h(new defpackage.wrn(obj6, i), wwjVar.b), "failed to submit data to HoldDetectionModel", new java.lang.Object[0]);
                if (!wwjVar.h) {
                    return null;
                }
                defpackage.wwd wwdVar = wwjVar.e;
                agsm.i(1128, wwdVar.j.e(ahqx.b(new defpackage.wwg(wwdVar, obj6, z2 ? 1 : 0)), wwdVar.c), "Failed to submit data.", new java.lang.Object[0]);
                return null;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                defpackage.wvq wvqVar = (defpackage.wvq) this.a;
                wvqVar.d.b(wvqVar.g.getAsLong(), (defpackage.alex) this.b);
                return null;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                java.lang.Object obj7 = this.a;
                defpackage.wvh wvhVar = (defpackage.wvh) obj7;
                if ((wvhVar.b & 1) != 0) {
                    defpackage.wwf wwfVar = wvhVar.c;
                    if (wwfVar == null) {
                        wwfVar = defpackage.wwf.a;
                    }
                    if ((wwfVar.b == 3 ? (defpackage.wwa) wwfVar.c : defpackage.wwa.a).c == 5) {
                        return null;
                    }
                    defpackage.wxk wxkVarB = defpackage.wxk.b((wwfVar.b == 1 ? (defpackage.wxh) wwfVar.c : defpackage.wxh.a).c);
                    if (wxkVarB == null) {
                        wxkVarB = defpackage.wxk.UNKNOWN_SOUND_EVENT_TYPE;
                    }
                    if (wxkVarB.equals(defpackage.wxk.SILENCE)) {
                        return null;
                    }
                }
                akzx akzxVar2 = ((defpackage.wvq) this.b).h;
                akzxVar2.u();
                defpackage.wvi wviVar = (defpackage.wvi) akzxVar2.b;
                defpackage.wvi wviVar2 = defpackage.wvi.a;
                j$.util.Objects.requireNonNull(obj7);
                alat alatVar2 = wviVar.c;
                if (!alatVar2.c()) {
                    wviVar.c = alad.J(alatVar2);
                }
                wviVar.c.add(obj7);
                long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
                akzxVar2.u();
                defpackage.wvi wviVar3 = (defpackage.wvi) akzxVar2.b;
                wviVar3.b |= 8;
                wviVar3.f = jElapsedRealtime;
                return null;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                if (((defpackage.wvq) this.a).f) {
                    return (java.lang.Void) this.b.call();
                }
                defpackage.wvq.a.c().m(aioa.b).l("com/android/incallui/atlas/detection/processors/DetectionMetricsLogger", "schedule", 416, "DetectionMetricsLogger.java").v("logger not initialized, do nothing");
                return null;
            case 15:
                defpackage.wvq wvqVar2 = (defpackage.wvq) this.a;
                long asLong = wvqVar2.g.getAsLong();
                aimw aimwVarL = defpackage.wxm.a.b().l("com/android/incallui/atlas/logger/AtlasCallMetricsLogger", "logOffHoldModelVersion", 157, "AtlasCallMetricsLogger.java");
                java.lang.Object obj8 = this.b;
                aimwVarL.y("hold for me model version:%s", obj8);
                wvqVar2.d.d(asLong, new defpackage.who(obj8, 9));
                return null;
            case 16:
                if (((java.lang.Boolean) aiql.H((java.util.concurrent.Future) this.a)).booleanValue()) {
                    defpackage.tvy tvyVarB = defpackage.tvy.b(((defpackage.tvz) aiql.H((java.util.concurrent.Future) this.b)).c);
                    if (tvyVarB == null) {
                        tvyVarB = defpackage.tvy.UNKNOWN;
                    }
                    z = tvyVarB == defpackage.tvy.ON_DEVICE;
                }
                return java.lang.Boolean.valueOf(z);
            case 17:
                defpackage.wxc wxcVar2 = (defpackage.wxc) this.b;
                if (!wxcVar2.g.get()) {
                    return null;
                }
                java.lang.Object obj9 = this.a;
                if (!wxcVar2.f.isPresent()) {
                    wxcVar2.f = j$.util.OptionalLong.of(((defpackage.wvg) obj9).e);
                }
                defpackage.wvg wvgVar2 = (defpackage.wvg) obj9;
                defpackage.wvf wvfVar = wvgVar2.c == 1 ? (defpackage.wvf) wvgVar2.d : defpackage.wvf.a;
                wxcVar2.h += (long) wvfVar.c.c();
                long jElapsedRealtime2 = android.os.SystemClock.elapsedRealtime() - wxcVar2.f.getAsLong();
                int i4 = wvfVar.e * wvfVar.d;
                long j5 = jElapsedRealtime2 / 1000;
                if (j5 <= ((java.lang.Long) wxcVar2.a.a()).longValue()) {
                    return null;
                }
                long j6 = ((long) i4) * j5;
                double d = j6;
                if (wxcVar2.h >= ((java.lang.Double) wxcVar2.b.a()).doubleValue() * d) {
                    return null;
                }
                long j7 = wxcVar2.h;
                double d2 = j6 < j7 ? 0.0d : (j6 - j7) / d;
                defpackage.wvs wvsVar = wxcVar2.e;
                akzx akzxVarM5 = defpackage.wxd.a.m();
                akzxVarM5.u();
                defpackage.wxd wxdVar = (defpackage.wxd) akzxVarM5.b;
                wxdVar.b |= 1;
                wxdVar.c = d2;
                defpackage.wxd wxdVar2 = (defpackage.wxd) akzxVarM5.p();
                defpackage.wvs wvsVar2 = ((defpackage.wwi) wvsVar).a;
                akzx akzxVarM6 = defpackage.wwf.a.m();
                akzxVarM6.u();
                defpackage.wwf wwfVar2 = (defpackage.wwf) akzxVarM6.b;
                j$.util.Objects.requireNonNull(wxdVar2);
                wwfVar2.c = wxdVar2;
                wwfVar2.b = 4;
                wvsVar2.a((defpackage.wwf) akzxVarM6.p());
                wxcVar2.c.c(defpackage.alex.ATLAS_TOO_MANY_MISSING_BYTES);
                wxcVar2.f = j$.util.OptionalLong.of(android.os.SystemClock.elapsedRealtime());
                return null;
            case 18:
                ?? r3 = this.a;
                defpackage.wxc wxcVar3 = (defpackage.wxc) this.b;
                wxcVar3.e = r3;
                wxcVar3.h = 0L;
                wxcVar3.f = j$.util.OptionalLong.empty();
                wxcVar3.g.set(true);
                return null;
            case 19:
                aift aiftVar = new aift(4);
                aiftVar.k(this.a.entrySet());
                aiftVar.k(this.b.entrySet());
                return aiftVar.h();
            default:
                aify aifyVar2 = (aify) aiql.H((java.util.concurrent.Future) this.a);
                aigf aigfVar2 = (aigf) aiql.H((java.util.concurrent.Future) this.b);
                int size2 = aifyVar2.size();
                while (i3 < size2) {
                    java.util.Map.Entry entry = (java.util.Map.Entry) aifyVar2.get(i3);
                    java.lang.Long asLong2 = ((android.content.ContentValues) entry.getValue()).getAsLong("timestamp");
                    defpackage.wyz wyzVar = asLong2 == null ? null : (defpackage.wyz) aigfVar2.get(asLong2);
                    if (wyzVar != null && (wxpVar = wyzVar.c) != null) {
                        ((android.content.ContentValues) entry.getValue()).put("atlas_call_details", wxpVar.i());
                    }
                    i3++;
                }
                return null;
        }
    }

    public /* synthetic */ whv(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
