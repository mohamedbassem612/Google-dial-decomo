package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class allb implements java.lang.AutoCloseable {
    public static final aimz a = aimz.i("com/google/quality/views/extraction/kcube/bg/ondevice/core/infra/ModelClient");
    public final alic b;
    public final boolean c;
    public final defpackage.alkx d;
    private final aify e;
    private final int f;
    private final java.lang.String g;
    private final java.lang.String h;
    private final aify i;
    private final int j;
    private final int k;

    public allb(defpackage.alkx alkxVar, int i, aigf aigfVar, aify aifyVar, defpackage.aloa aloaVar) {
        this.d = alkxVar;
        this.f = i;
        this.e = aifyVar;
        int iAN = a.aN(aloaVar.g);
        this.j = iAN == 0 ? 1 : iAN;
        int iAQ = a.aQ(aloaVar.o);
        this.k = iAQ != 0 ? iAQ : 1;
        this.c = aloaVar.j;
        boolean z = aloaVar.i;
        java.lang.String str = z ? "EOS" : aloaVar.k;
        this.g = str;
        java.lang.String str2 = z ? "CLS" : aloaVar.l;
        this.h = str2;
        this.i = aify.n(aloaVar.m);
        alib alibVarB = alic.b();
        alibVarB.d(i);
        alibVarB.c();
        alibVarB.b = aigfVar;
        alibVarB.e(str);
        alibVarB.b(str2);
        this.b = alibVarB.a();
    }

    public final aigf a(defpackage.alia aliaVar) {
        int i = this.f;
        int[][] iArr = (int[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Integer.TYPE, 1, i);
        int[][] iArr2 = (int[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Integer.TYPE, 1, i);
        int[][] iArr3 = (int[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Integer.TYPE, 1, i);
        for (int i2 = 0; i2 < i; i2++) {
            iArr[0][i2] = aliaVar.b.a(i2);
            iArr2[0][i2] = aliaVar.c.a(i2);
        }
        return aigf.m("input_word_ids", iArr, "input_mask", iArr2, "input_type_ids", iArr3);
    }

    public final defpackage.alla b(java.lang.String str, defpackage.aljq aljqVar) {
        j$.util.stream.Stream streamFilter = j$.util.Collection.-EL.stream(aljqVar.a()).filter(new defpackage.alks(anty.y(this.i), 1));
        j$.util.stream.Collector collector = aido.a;
        final aify aifyVar = (aify) streamFilter.collect(collector);
        if (this.k - 1 == 2) {
            aifyVar = (aify) j$.util.Collection.-EL.stream(aifyVar).skip(j$.util.stream.IntStream.-CC.range(0, aifyVar.size()).map(new java.util.function.IntUnaryOperator() { // from class: alkl
                @Override // java.util.function.IntUnaryOperator
                public final /* synthetic */ java.util.function.IntUnaryOperator andThen(java.util.function.IntUnaryOperator intUnaryOperator) {
                    return j$.util.function.IntUnaryOperator.-CC.$default$andThen(this, intUnaryOperator);
                }

                @Override // java.util.function.IntUnaryOperator
                public final int applyAsInt(int i) {
                    return (aifyVar.size() - i) - 1;
                }

                @Override // java.util.function.IntUnaryOperator
                public final /* synthetic */ java.util.function.IntUnaryOperator compose(java.util.function.IntUnaryOperator intUnaryOperator) {
                    return j$.util.function.IntUnaryOperator.-CC.$default$compose(this, intUnaryOperator);
                }
            }).filter(new defpackage.altq(aifyVar, 1)).findFirst().orElse(-1) + 1).filter(new zun(19)).collect(collector);
        }
        java.lang.String str2 = this.g;
        java.lang.String str3 = (java.lang.String) j$.util.Collection.-EL.stream(aifyVar).map(new defpackage.alki(2)).flatMap(new defpackage.alki(3)).filter(new zun(18)).collect(j$.util.stream.Collectors.joining(defpackage.alpv.g(str2)));
        int i = this.j - 1;
        if (i == 2) {
            return new defpackage.alla(str, j$.util.Optional.of(str3));
        }
        if (i != 3) {
            return defpackage.alla.a(str);
        }
        java.lang.String strG = defpackage.alpv.g(str2);
        java.lang.String str4 = (java.lang.String) j$.util.stream.Stream.-CC.of(new java.lang.String[]{str3, str}).filter(new zun(17)).collect(j$.util.stream.Collectors.joining(strG));
        java.lang.String strTrim = str4.isEmpty() ? "" : str4.concat(strG).trim();
        if (!strTrim.isEmpty()) {
            java.lang.String str5 = this.h;
            if (!str5.isEmpty()) {
                strTrim = str5.concat(" ").concat(strTrim);
            }
        }
        return defpackage.alla.a(strTrim);
    }

    public final synchronized defpackage.allf c(defpackage.amas amasVar) {
        defpackage.allf allfVar;
        defpackage.aqag aqagVar;
        aigf aigfVar = (aigf) j$.util.Collection.-EL.stream(j$.util.DesugarCollections.unmodifiableMap((amasVar.b == 2 ? (defpackage.amap) amasVar.c : defpackage.amap.a).c).entrySet()).collect(aido.b(new defpackage.alki(10), new defpackage.alki(11)));
        aimz aimzVar = a;
        aimzVar.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/core/infra/ModelClient", "predict", 218, "ModelClient.java").v("TFLite model run interpreter");
        defpackage.alkx alkxVar = this.d;
        aify aifyVar = this.e;
        alkxVar.b.e(aigf.i(aigfVar), aikj.b);
        aigf aigfVar2 = (aigf) j$.util.Collection.-EL.stream(aifyVar).collect(aido.b(new defpackage.alki(7), new defpackage.aite(alkxVar, 8)));
        aimzVar.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/core/infra/ModelClient", "predict", 221, "ModelClient.java").v("Convert answers...");
        int i = 4;
        final aigb aigbVar = new aigb(4);
        final aigb aigbVar2 = new aigb(4);
        final aigb aigbVar3 = new aigb(4);
        j$.util.Map.-EL.forEach(aigfVar2, new java.util.function.BiConsumer() { // from class: alky
            @Override // java.util.function.BiConsumer
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                java.lang.String str = (java.lang.String) obj;
                org.tensorflow.lite.TensorImpl tensorImpl = (org.tensorflow.lite.TensorImpl) obj2;
                java.nio.ByteBuffer byteBufferD = tensorImpl.d();
                defpackage.aqaj aqajVar = tensorImpl.a;
                if (aqajVar == defpackage.aqaj.e) {
                    aigbVar.i(str, defpackage.alpr.a(byteBufferD));
                }
                if (aqajVar == defpackage.aqaj.a) {
                    aigb aigbVar4 = aigbVar2;
                    java.nio.FloatBuffer floatBufferAsFloatBuffer = byteBufferD.asFloatBuffer();
                    float[] fArr = new float[floatBufferAsFloatBuffer.remaining()];
                    floatBufferAsFloatBuffer.get(fArr);
                    aigbVar4.i(str, aify.n(ajee.k(fArr)));
                }
                if (aqajVar == defpackage.aqaj.d) {
                    aigb aigbVar5 = aigbVar3;
                    java.nio.IntBuffer intBufferAsIntBuffer = byteBufferD.asIntBuffer();
                    int[] iArr = new int[intBufferAsIntBuffer.remaining()];
                    intBufferAsIntBuffer.get(iArr);
                    aigbVar5.i(str, aify.n(aiql.U(iArr)));
                }
            }

            @Override // java.util.function.BiConsumer
            public final /* synthetic */ java.util.function.BiConsumer andThen(java.util.function.BiConsumer biConsumer) {
                return j$.util.function.BiConsumer.-CC.$default$andThen(this, biConsumer);
            }
        });
        boolean z = true;
        aigf aigfVarE = aigbVar2.e(true);
        aigf aigfVarE2 = aigbVar.e(true);
        aigf aigfVarE3 = aigbVar3.e(true);
        akzx akzxVarM = defpackage.amaw.a.m();
        akzx akzxVarM2 = defpackage.amat.a.m();
        int i2 = defpackage.alpr.a;
        aigb aigbVar4 = new aigb(4);
        ailj ailjVarK = aigfVar2.e().k();
        while (ailjVarK.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) ailjVarK.next();
            org.tensorflow.lite.TensorImpl tensorImpl = (org.tensorflow.lite.TensorImpl) entry.getValue();
            java.lang.String str = (java.lang.String) entry.getKey();
            defpackage.aqaj aqajVar = tensorImpl.a;
            akzx akzxVarB = defpackage.alpr.b(aqajVar, tensorImpl.b);
            java.nio.ByteBuffer byteBufferD = tensorImpl.d();
            int iOrdinal = aqajVar.ordinal();
            if (iOrdinal == 0) {
                java.nio.FloatBuffer floatBufferAsFloatBuffer = byteBufferD.asFloatBuffer();
                float[] fArr = new float[floatBufferAsFloatBuffer.remaining()];
                floatBufferAsFloatBuffer.get(fArr);
                java.util.List listK = ajee.k(fArr);
                j$.util.Objects.requireNonNull(akzxVarB);
                j$.lang.Iterable.-EL.forEach(listK, new defpackage.alkh(akzxVarB, 8));
                aqagVar = (defpackage.aqag) akzxVarB.p();
            } else if (iOrdinal == z || iOrdinal == 3) {
                java.nio.IntBuffer intBufferAsIntBuffer = byteBufferD.asIntBuffer();
                int[] iArr = new int[intBufferAsIntBuffer.remaining()];
                intBufferAsIntBuffer.get(iArr);
                java.util.List listU = aiql.U(iArr);
                j$.util.Objects.requireNonNull(akzxVarB);
                j$.lang.Iterable.-EL.forEach(listU, new defpackage.alkh(akzxVarB, 7));
                aqagVar = (defpackage.aqag) akzxVarB.p();
            } else if (iOrdinal != i) {
                if (iOrdinal != 7) {
                    throw new java.lang.UnsupportedOperationException("Creating a TensorProto from a Tesnor of unsupported type");
                }
                java.nio.IntBuffer intBufferAsIntBuffer2 = byteBufferD.asIntBuffer();
                int[] iArr2 = new int[intBufferAsIntBuffer2.remaining()];
                intBufferAsIntBuffer2.get(iArr2);
                java.util.List listU2 = aiql.U(iArr2);
                j$.util.Objects.requireNonNull(akzxVarB);
                j$.lang.Iterable.-EL.forEach(listU2, new defpackage.alkh(akzxVarB, 7));
                aqagVar = (defpackage.aqag) akzxVarB.p();
            } else {
                j$.lang.Iterable.-EL.forEach(defpackage.alpr.a(byteBufferD), new defpackage.alkh(akzxVarB, 9));
                aqagVar = (defpackage.aqag) akzxVarB.p();
            }
            aigbVar4.i(str, aqagVar);
            i = 4;
            z = true;
        }
        aigf aigfVarE4 = aigbVar4.e(z);
        akzxVarM2.u();
        defpackage.amat amatVar = (defpackage.amat) akzxVarM2.b;
        albe albeVar = amatVar.b;
        if (!albeVar.b) {
            amatVar.b = albeVar.a();
        }
        amatVar.b.putAll(aigfVarE4);
        akzxVarM.u();
        defpackage.amaw amawVar = (defpackage.amaw) akzxVarM.b;
        defpackage.amat amatVar2 = (defpackage.amat) akzxVarM2.p();
        j$.util.Objects.requireNonNull(amatVar2);
        amawVar.c = amatVar2;
        amawVar.b = 2;
        defpackage.amaw amawVar2 = (defpackage.amaw) akzxVarM.p();
        if (amawVar2 == null) {
            throw new java.lang.NullPointerException("Null modelOutput");
        }
        allfVar = new defpackage.allf(aigfVarE, aigfVarE2, aigfVarE3, amawVar2);
        aimzVar.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/core/infra/ModelClient", "predict", 223, "ModelClient.java").v("Finish.");
        return allfVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.d.close();
    }
}
