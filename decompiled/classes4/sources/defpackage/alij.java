package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alij implements java.lang.AutoCloseable {
    public static final aimz a = aimz.i("com/google/quality/views/extraction/kcube/bg/ondevice/bert/ml/TaggingModelClient");
    private static final aigf c;
    private static final aigf d;
    private int g;
    private alic h;
    private final defpackage.amey k;
    private final java.util.Map e = new java.util.HashMap();
    private boolean f = false;
    private j$.util.Optional i = j$.util.Optional.empty();
    private defpackage.alim j = defpackage.alim.a;
    public aify b = aike.a;

    static {
        aigb aigbVar = new aigb(4);
        aigbVar.i("1", "one");
        aigbVar.i("2", "two");
        aigbVar.i("3", "three");
        aigbVar.i("4", "four");
        aigbVar.i("5", "five");
        aigbVar.i("6", "six");
        aigbVar.i("7", "seven");
        aigbVar.i("8", "eight");
        aigbVar.i("9", "nine");
        aigbVar.i("0", "zero");
        aigbVar.i("#", "pound");
        aigbVar.i("*", "star");
        c = aigbVar.e(true);
        aigb aigbVar2 = new aigb(4);
        aigbVar2.i(defpackage.aqaj.f, defpackage.aqaf.DT_BOOL);
        aigbVar2.i(defpackage.aqaj.a, defpackage.aqaf.DT_FLOAT);
        aigbVar2.i(defpackage.aqaj.g, defpackage.aqaf.DT_INT16);
        aigbVar2.i(defpackage.aqaj.b, defpackage.aqaf.DT_INT32);
        aigbVar2.i(defpackage.aqaj.d, defpackage.aqaf.DT_INT64);
        aigbVar2.i(defpackage.aqaj.h, defpackage.aqaf.DT_INT8);
        aigbVar2.i(defpackage.aqaj.e, defpackage.aqaf.DT_STRING);
        aigbVar2.i(defpackage.aqaj.c, defpackage.aqaf.DT_UINT8);
        d = aigbVar2.e(true);
    }

    public alij(defpackage.amey ameyVar) {
        this.k = ameyVar;
    }

    public static java.lang.Integer c(java.util.Map map, int i, java.lang.String str) {
        java.lang.Integer num = (java.lang.Integer) map.get(java.lang.Integer.valueOf(i));
        if (num != null) {
            return num;
        }
        throw new java.lang.IllegalArgumentException(str);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Iterable, java.lang.Object] */
    private final synchronized defpackage.alie f(aigf aigfVar, final aify aifyVar) {
        defpackage.antt anttVar;
        aigf aigfVar2 = (aigf) j$.util.Collection.-EL.stream(aigfVar.e()).collect(aido.b(new defpackage.ailg(6), new pgq(this, aifyVar, 20)));
        anttVar = new defpackage.antt();
        for (final int i = 0; i < ((aike) aifyVar).d; i++) {
            final aifz aifzVar = new aifz();
            j$.util.Map.-EL.forEach(aigfVar2, new java.util.function.BiConsumer() { // from class: alih
                @Override // java.util.function.BiConsumer
                public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                    aimz aimzVar = defpackage.alij.a;
                    int i2 = i;
                    aify aifyVar2 = (aify) j$.util.Collection.-EL.stream((aify) ((aify) obj2).get(i2)).map(new defpackage.aite((defpackage.alia) aifyVar.get(i2), 6)).collect(aido.a);
                    aifzVar.d((java.lang.String) obj, aifyVar2);
                }

                @Override // java.util.function.BiConsumer
                public final /* synthetic */ java.util.function.BiConsumer andThen(java.util.function.BiConsumer biConsumer) {
                    return j$.util.function.BiConsumer.-CC.$default$andThen(this, biConsumer);
                }
            });
            aiga aigaVarA = aifzVar.a();
            aliq aliqVar = new aliq((byte[]) null);
            aliqVar.a = aigaVarA;
            aliqVar.f(defpackage.amas.a);
            aliqVar.g(defpackage.amaw.a);
            alid alidVarE = aliqVar.e();
            if (anttVar.a == null) {
                if (anttVar.b == null) {
                    anttVar.a = new aift(4);
                } else {
                    anttVar.a = new aift(4);
                    ((aift) anttVar.a).k((java.lang.Iterable) anttVar.b);
                    anttVar.b = null;
                }
            }
            ((aift) anttVar.a).i(alidVarE);
        }
        return anttVar.g();
    }

    private final defpackage.aqan g() {
        return (defpackage.aqan) this.i.orElseThrow(new defpackage.ahuq(5));
    }

    public final aify a() {
        return (aify) j$.util.Collection.-EL.stream(this.j.c).map(new defpackage.ailg(7)).collect(aido.a);
    }

    public final synchronized defpackage.alie b(java.lang.String str, aify aifyVar) {
        defpackage.antt anttVar;
        aigf aigfVarE;
        boolean z = this.f;
        aimz aimzVar = a;
        if (!z) {
            aimzVar.c().l("com/google/quality/views/extraction/kcube/bg/ondevice/bert/ml/TaggingModelClient", "predict", 313, "TaggingModelClient.java").y("%s", "load() must be called and successfully complete before first predict.");
            throw new java.lang.AssertionError("load() must be called and successfully complete before first predict.");
        }
        aimzVar.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/bert/ml/TaggingModelClient", "predict", 316, "TaggingModelClient.java").v("TFLite model running...");
        defpackage.alia aliaVarA = this.h.a(str);
        int i = this.g;
        char c2 = 2;
        boolean z2 = true;
        int[][] iArr = (int[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Integer.TYPE, 1, i);
        int[][] iArr2 = (int[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Integer.TYPE, 1, i);
        int[][] iArr3 = (int[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Integer.TYPE, 1, i);
        for (int i2 = 0; i2 < this.g; i2++) {
            iArr[0][i2] = aliaVarA.b.a(i2);
            iArr2[0][i2] = aliaVarA.c.a(i2);
            iArr3[0][i2] = aliaVarA.d.a(i2);
        }
        int i3 = 4;
        aigb aigbVar = new aigb(4);
        aigbVar.i("input_word_ids", iArr);
        aigbVar.i("input_mask", iArr2);
        aigbVar.i("input_type_ids", iArr3);
        aigf aigfVarE2 = aigbVar.e(true);
        aimzVar.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/bert/ml/TaggingModelClient", "predict", 319, "TaggingModelClient.java").v("TFLite model run interpreter");
        aigb aigbVar2 = new aigb(4);
        int i4 = ((aike) aifyVar).d;
        int i5 = 0;
        while (i5 < i4) {
            java.lang.String str2 = (java.lang.String) aifyVar.get(i5);
            int i6 = this.g;
            char c3 = c2;
            int[] iArr4 = new int[3];
            iArr4[c3] = 3;
            iArr4[1] = i6;
            iArr4[0] = 1;
            aigbVar2.i(str2, (float[][][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Float.TYPE, iArr4));
            i5++;
            c2 = c3;
        }
        aigf aigfVarE3 = aigbVar2.e(true);
        aimzVar.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/bert/ml/TaggingModelClient", "runInterpreter", 376, "TaggingModelClient.java").v("Calling runSignature...");
        int i7 = 6;
        if (!this.i.isEmpty()) {
            g().e(aigfVarE2, (java.util.Map) j$.util.Collection.-EL.stream(aigfVarE3.e()).collect(aido.b(new defpackage.ailg(6), new defpackage.ailg(8))));
            aimzVar.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/bert/ml/TaggingModelClient", "runInterpreter", 385, "TaggingModelClient.java").v("runSignature done.");
        }
        aimzVar.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/bert/ml/TaggingModelClient", "predict", 321, "TaggingModelClient.java").v("Convert answers...");
        defpackage.alie alieVarF = f(aigfVarE3, aify.p(aliaVarA));
        anttVar = new defpackage.antt(alieVarF);
        aift aiftVar = new aift(4);
        int i8 = 0;
        while (true) {
            aike aikeVar = alieVarF.a;
            if (i8 >= aikeVar.d) {
                break;
            }
            alid alidVar = (alid) aikeVar.get(i8);
            aigf aigfVar = (aigf) j$.util.Collection.-EL.stream(aigfVarE2.e()).collect(aido.b(new defpackage.ailg(i7), new defpackage.exw(i8, 5)));
            aigf aigfVar2 = (aigf) j$.util.Collection.-EL.stream(aigfVarE3.e()).collect(aido.b(new defpackage.ailg(i7), new defpackage.exw(i8, i7)));
            aliq aliqVar = new aliq(alidVar);
            akzx akzxVarM = defpackage.amas.a.m();
            akzx akzxVarM2 = defpackage.amar.a.m();
            boolean z3 = z2;
            aigb aigbVar3 = new aigb(i3);
            org.tensorflow.lite.TensorImpl tensorImplF = g().f("input_word_ids");
            java.util.Iterator itK = aigfVar.e().k();
            while (itK.hasNext()) {
                java.util.Map.Entry entry = (java.util.Map.Entry) itK.next();
                aigf aigfVar3 = aigfVarE3;
                akzx akzxVarM3 = defpackage.aqag.a.m();
                defpackage.alie alieVar = alieVarF;
                akzx akzxVarM4 = defpackage.aqai.a.m();
                aimz aimzVar2 = aimzVar;
                akzx akzxVarM5 = defpackage.aqah.a.m();
                java.util.Iterator it = itK;
                long j = this.g;
                akzxVarM5.u();
                ((defpackage.aqah) akzxVarM5.b).b = j;
                akzxVarM4.bP(akzxVarM5);
                akzxVarM3.u();
                defpackage.aqag aqagVar = (defpackage.aqag) akzxVarM3.b;
                defpackage.aqai aqaiVar = (defpackage.aqai) akzxVarM4.p();
                j$.util.Objects.requireNonNull(aqaiVar);
                aqagVar.d = aqaiVar;
                aqagVar.b |= 1;
                defpackage.aqaf aqafVar = (defpackage.aqaf) d.getOrDefault(tensorImplF.a, defpackage.aqaf.DT_INVALID);
                akzxVarM3.u();
                ((defpackage.aqag) akzxVarM3.b).c = aqafVar.a();
                j$.util.stream.IntStream intStreamStream = j$.util.DesugarArrays.stream((int[]) entry.getValue());
                j$.util.Objects.requireNonNull(akzxVarM3);
                intStreamStream.forEach(new qgy(akzxVarM3, 6));
                aigbVar3.i((java.lang.String) entry.getKey(), (defpackage.aqag) akzxVarM3.p());
                aigfVarE2 = aigfVarE2;
                aigfVarE3 = aigfVar3;
                alieVarF = alieVar;
                aimzVar = aimzVar2;
                i8 = i8;
                itK = it;
            }
            aigf aigfVar4 = aigfVarE3;
            defpackage.alie alieVar2 = alieVarF;
            aimz aimzVar3 = aimzVar;
            aigf aigfVar5 = aigfVarE2;
            int i9 = i8;
            aigf aigfVarE4 = aigbVar3.e(z3);
            akzxVarM2.u();
            defpackage.amar amarVar = (defpackage.amar) akzxVarM2.b;
            albe albeVar = amarVar.f;
            if (!albeVar.b) {
                amarVar.f = albeVar.a();
            }
            amarVar.f.putAll(aigfVarE4);
            akzxVarM.u();
            defpackage.amas amasVar = (defpackage.amas) akzxVarM.b;
            defpackage.amar amarVar2 = (defpackage.amar) akzxVarM2.p();
            j$.util.Objects.requireNonNull(amarVar2);
            amasVar.c = amarVar2;
            amasVar.b = 1;
            aliqVar.f((defpackage.amas) akzxVarM.p());
            akzx akzxVarM6 = defpackage.amaw.a.m();
            akzx akzxVarM7 = defpackage.amav.a.m();
            aigb aigbVar4 = new aigb(4);
            if (this.i.isEmpty()) {
                aigfVarE = aigbVar4.e(true);
            } else {
                org.tensorflow.lite.TensorImpl tensorImplC = g().c("output_dest");
                ailj ailjVarK = aigfVar2.e().k();
                while (ailjVarK.hasNext()) {
                    java.util.Map.Entry entry2 = (java.util.Map.Entry) ailjVarK.next();
                    akzx akzxVarM8 = defpackage.aqag.a.m();
                    akzx akzxVarM9 = defpackage.aqai.a.m();
                    defpackage.aqah aqahVar = defpackage.aqah.a;
                    akzx akzxVarM10 = aqahVar.m();
                    akzxVarM10.u();
                    ((defpackage.aqah) akzxVarM10.b).b = 3L;
                    akzxVarM9.bP(akzxVarM10);
                    akzx akzxVarM11 = aqahVar.m();
                    long j2 = this.g;
                    akzxVarM11.u();
                    ((defpackage.aqah) akzxVarM11.b).b = j2;
                    akzxVarM9.bP(akzxVarM11);
                    akzxVarM8.u();
                    defpackage.aqag aqagVar2 = (defpackage.aqag) akzxVarM8.b;
                    defpackage.aqai aqaiVar2 = (defpackage.aqai) akzxVarM9.p();
                    j$.util.Objects.requireNonNull(aqaiVar2);
                    aqagVar2.d = aqaiVar2;
                    aqagVar2.b |= 1;
                    org.tensorflow.lite.TensorImpl tensorImpl = tensorImplC;
                    defpackage.aqaf aqafVar2 = (defpackage.aqaf) d.getOrDefault(tensorImpl.a, defpackage.aqaf.DT_INVALID);
                    akzxVarM8.u();
                    ((defpackage.aqag) akzxVarM8.b).c = aqafVar2.a();
                    float[][] fArr = (float[][]) entry2.getValue();
                    int length = fArr.length;
                    int i10 = 0;
                    while (i10 < length) {
                        org.tensorflow.lite.TensorImpl tensorImpl2 = tensorImpl;
                        for (float f : fArr[i10]) {
                            akzxVarM8.bN(f);
                        }
                        i10++;
                        tensorImpl = tensorImpl2;
                    }
                    aigbVar4.i((java.lang.String) entry2.getKey(), (defpackage.aqag) akzxVarM8.p());
                    tensorImplC = tensorImpl;
                }
                aigfVarE = aigbVar4.e(true);
            }
            akzxVarM7.u();
            defpackage.amav amavVar = (defpackage.amav) akzxVarM7.b;
            albe albeVar2 = amavVar.c;
            if (!albeVar2.b) {
                amavVar.c = albeVar2.a();
            }
            amavVar.c.putAll(aigfVarE);
            akzxVarM6.u();
            defpackage.amaw amawVar = (defpackage.amaw) akzxVarM6.b;
            defpackage.amav amavVar2 = (defpackage.amav) akzxVarM7.p();
            j$.util.Objects.requireNonNull(amavVar2);
            amawVar.c = amavVar2;
            z2 = true;
            amawVar.b = 1;
            aliqVar.g((defpackage.amaw) akzxVarM6.p());
            aiftVar.i(aliqVar.e());
            i8 = i9 + 1;
            aigfVarE2 = aigfVar5;
            aigfVarE3 = aigfVar4;
            alieVarF = alieVar2;
            aimzVar = aimzVar3;
            i7 = 6;
            i3 = 4;
        }
        aimz aimzVar4 = aimzVar;
        aify aifyVarH = aiftVar.h();
        if (aifyVarH == null) {
            throw new java.lang.NullPointerException("Null samples");
        }
        if (anttVar.a != null) {
            throw new java.lang.IllegalStateException("Cannot set samples after calling samplesBuilder()");
        }
        anttVar.b = aifyVarH;
        aimzVar4.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/bert/ml/TaggingModelClient", "populateInputsAndOuputs", 344, "TaggingModelClient.java").v("Finish.");
        return anttVar.g();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.i.isPresent()) {
            ((defpackage.aqan) this.i.get()).close();
            this.i = j$.util.Optional.empty();
        }
        this.e.clear();
        this.f = false;
    }

    public final synchronized void d() {
        java.lang.Object obj;
        java.lang.Object bufferedReader;
        defpackage.alim alimVar;
        java.lang.Object obj2;
        try {
            java.io.BufferedReader bufferedReader2 = null;
            boolean z = false;
            defpackage.aqam aqamVar = new defpackage.aqam(null);
            aqamVar.a = 1;
            defpackage.amey ameyVar = this.k;
            java.lang.String str = (java.lang.String) ameyVar.c.orElse("model.tflite");
            try {
                j$.util.Optional optionalOfNullable = ameyVar.b;
                defpackage.allq allqVar = new defpackage.allq(ameyVar, str, 5, z ? 1 : 0);
                if (true == optionalOfNullable.isPresent()) {
                    optionalOfNullable = j$.util.Optional.ofNullable((byte[]) ahzq.c(new defpackage.amex((alqd) optionalOfNullable.get(), (java.lang.String) allqVar.a, 3)));
                }
                int i = 0;
                if (true == optionalOfNullable.isPresent()) {
                    obj = optionalOfNullable.get();
                } else {
                    defpackage.amey.a.d().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/VcAssetsModelsRepository", "loadModelFileToByteArray", 197, "VcAssetsModelsRepository.java").v("FileGetter missing.");
                    obj = new byte[0];
                }
                byte[] bArr = (byte[]) obj;
                java.nio.ByteBuffer byteBufferAllocateDirect = java.nio.ByteBuffer.allocateDirect(bArr.length);
                byteBufferAllocateDirect.put(bArr);
                this.i = j$.util.Optional.of(new defpackage.aqan(byteBufferAllocateDirect, aqamVar));
                aimz aimzVar = a;
                aimzVar.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/bert/ml/TaggingModelClient", "loadTFLiteModel", 180, "TaggingModelClient.java").v("TFLite model loaded.");
                if (this.i.isPresent()) {
                    this.b = aify.o(((defpackage.aqan) this.i.get()).d());
                }
                java.util.Map map = this.e;
                aigb aigbVar = new aigb(4);
                try {
                    try {
                        j$.util.Optional optionalOfNullable2 = ameyVar.b;
                        defpackage.amck amckVar = new defpackage.amck(ameyVar, 3);
                        if (true == optionalOfNullable2.isPresent()) {
                            optionalOfNullable2 = j$.util.Optional.ofNullable((java.io.BufferedReader) ahzq.c(new defpackage.amex((defpackage.amey) amckVar.a, (alqd) optionalOfNullable2.get(), 1)));
                        }
                        if (true == optionalOfNullable2.isPresent()) {
                            bufferedReader = optionalOfNullable2.get();
                        } else {
                            defpackage.amey.a.d().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/VcAssetsModelsRepository", "ivrParsingModelVocab", 132, "VcAssetsModelsRepository.java").v("FileGetter missing.");
                            bufferedReader = new java.io.BufferedReader(ae$.ExternalSyntheticApiModelOutline0.m());
                        }
                        java.io.BufferedReader bufferedReader3 = (java.io.BufferedReader) bufferedReader;
                        try {
                            j$.util.Optional optionalOfNullable3 = j$.util.Optional.ofNullable(bufferedReader3.readLine());
                            while (optionalOfNullable3.isPresent()) {
                                int i2 = i + 1;
                                aigbVar.i((java.lang.String) optionalOfNullable3.get(), java.lang.Integer.valueOf(i));
                                optionalOfNullable3 = j$.util.Optional.ofNullable(bufferedReader3.readLine());
                                i = i2;
                            }
                            bufferedReader3.close();
                            map.putAll(aigbVar.e(true));
                            aimzVar.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/bert/ml/TaggingModelClient", "loadVocabulary", 172, "TaggingModelClient.java").w("dict size: %d", map.size());
                            this.g = g().f("input_word_ids").b[1];
                            alib alibVarB = alic.b();
                            alibVarB.b = map;
                            alibVarB.c();
                            alibVarB.d(this.g);
                            alibVarB.f(c);
                            this.h = alibVarB.a();
                            try {
                                j$.util.Optional optionalOfNullable4 = ameyVar.b;
                                defpackage.amck amckVar2 = new defpackage.amck(ameyVar, 5);
                                if (true == optionalOfNullable4.isPresent()) {
                                    optionalOfNullable4 = j$.util.Optional.ofNullable((defpackage.alim) ahzq.c(new afgu(amckVar2.a, optionalOfNullable4.get(), 20)));
                                }
                                if (true == optionalOfNullable4.isPresent()) {
                                    obj2 = optionalOfNullable4.get();
                                } else {
                                    defpackage.amey.a.d().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/VcAssetsModelsRepository", "ivrParsingModelInfo", 73, "VcAssetsModelsRepository.java").v("FileGetter missing.");
                                    obj2 = defpackage.alim.a;
                                }
                                alimVar = (defpackage.alim) obj2;
                            } catch (ahzq e) {
                                defpackage.amey.a.d().k((java.io.IOException) e.b(java.io.IOException.class)).l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/VcAssetsModelsRepository", "ivrParsingModelInfo", 78, "VcAssetsModelsRepository.java").v("No model info file.");
                                alimVar = defpackage.alim.a;
                            }
                            this.j = alimVar;
                            aimzVar.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/bert/ml/TaggingModelClient", "load", 162, "TaggingModelClient.java").y("Loaded model version: %s", this.j.b);
                            this.f = true;
                        } catch (ahzq e2) {
                            e = e2;
                            throw e.d(java.io.IOException.class);
                        } catch (java.lang.Throwable th) {
                            th = th;
                            bufferedReader2 = bufferedReader3;
                            if (bufferedReader2 != null) {
                                bufferedReader2.close();
                            }
                            throw th;
                        }
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                    }
                } catch (ahzq e3) {
                    e = e3;
                }
            } catch (ahzq e4) {
                throw e4.d(java.io.IOException.class);
            }
        } catch (java.io.IOException e5) {
            a.by(a.c(), "Failed loading model/vocab resourse.", "com/google/quality/views/extraction/kcube/bg/ondevice/bert/ml/TaggingModelClient", "load", (char) 165, "TaggingModelClient.java", e5);
        }
    }

    public final synchronized int[][] e(float[][][] fArr) {
        int[][] iArr;
        iArr = (int[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Integer.TYPE, fArr.length, this.g);
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = new int[this.g];
            for (int i2 = 0; i2 < this.g; i2++) {
                int[] iArr2 = iArr[i];
                float[] fArr2 = fArr[i][i2];
                int i3 = 0;
                for (int i4 = 1; i4 < fArr2.length; i4++) {
                    if (fArr2[i4] > fArr2[i3]) {
                        i3 = i4;
                    }
                }
                iArr2[i2] = i3;
            }
        }
        return iArr;
    }
}
