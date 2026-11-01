package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final /* synthetic */ class agzo implements java.util.function.Consumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ agzo(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        int i = 2;
        int i2 = 1;
        switch (this.$cid) {
            case 0:
                ((agzq) this.a).b((amdx) this.b, (ajcq) obj);
                return;
            case 1:
                aimz aimzVar = zms.a;
                ((zmt) obj).f((android.telecom.CallAudioState) this.a, (android.telecom.CallAudioState) this.b);
                return;
            case 2:
                ((agzq) this.a).b((amdx) this.b, (ajcq) obj);
                return;
            case 3:
                defpackage.aqan aqanVar = (defpackage.aqan) obj;
                int i3 = 20;
                float[][][] fArr = (float[][][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Float.TYPE, 1, 20, 513);
                int i4 = 1024;
                if (!defpackage.allz.a.contains(1024)) {
                    throw new java.lang.IllegalArgumentException("computePowerSpectrogram must be called with supported fftLength");
                }
                float[] fArr2 = new float[1024];
                for (int i5 = 0; i5 < 1024; i5++) {
                    fArr2[i5] = (float) (0.54d - (java.lang.Math.cos((((double) i5) * 6.283185307179586d) / 1024.0d) * 0.46d));
                }
                float[][] fArr3 = (float[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Float.TYPE, 20, 513);
                double[] dArr = new double[1024];
                int i6 = 0;
                while (i6 < i3) {
                    int i7 = i6 << 9;
                    int i8 = 0;
                    while (true) {
                        int i9 = i2;
                        if (i8 < i4) {
                            dArr[i8] = ((float[]) this.a)[i7 + i8] * fArr2[i8];
                            i8++;
                            i2 = i9;
                            fArr = fArr;
                        } else {
                            float[][][] fArr4 = fArr;
                            java.util.Arrays.fill(dArr, i4, i4, 0.0d);
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            for (int i10 = 0; i10 < i4; i10++) {
                                arrayList.add(java.lang.Double.valueOf(dArr[i10]));
                            }
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            int size = arrayList.size();
                            int i11 = 0;
                            while (i11 < size) {
                                arrayList2.add(new defpackage.ally(((java.lang.Double) arrayList.get(i11)).doubleValue(), 0.0d));
                                i11++;
                                i = i;
                                i3 = i3;
                            }
                            int i12 = i;
                            int i13 = i3;
                            java.util.List<defpackage.ally> listSubList = defpackage.alpv.f(arrayList2).subList(0, (arrayList.size() / 2) + 1);
                            java.util.ArrayList arrayList3 = new java.util.ArrayList();
                            for (defpackage.ally allyVar : listSubList) {
                                double d = allyVar.a;
                                double d2 = allyVar.b;
                                double d3 = (d * d) + (d2 * d2);
                                java.lang.Double.valueOf(d3).getClass();
                                arrayList3.add(java.lang.Double.valueOf(java.lang.Math.sqrt(d3)));
                            }
                            for (int i14 = 0; i14 < 513; i14++) {
                                fArr3[i6][i14] = (float) ((java.lang.Double) arrayList3.get(i14)).doubleValue();
                            }
                            i6++;
                            i2 = i9;
                            fArr = fArr4;
                            i = i12;
                            i3 = i13;
                            i4 = 1024;
                        }
                    }
                }
                int i15 = i2;
                float[][][] fArr5 = fArr;
                int i16 = i3;
                fArr5[0] = fArr3;
                int[] iArr = new int[i];
                iArr[i15] = 512;
                iArr[0] = i16;
                float[][] fArr6 = (float[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Float.TYPE, iArr);
                int i17 = 0;
                for (int i18 = i16; i17 < i18; i18 = 20) {
                    int i19 = 0;
                    while (i19 < fArr6[0].length) {
                        int i20 = i19 + 1;
                        fArr6[i17][i19] = fArr5[0][i17][i20];
                        i19 = i20;
                    }
                    i17++;
                }
                java.lang.Object obj2 = this.b;
                int[] iArr2 = new int[3];
                iArr2[2] = 512;
                iArr2[i15] = 20;
                iArr2[0] = i15;
                float[][][] fArr7 = (float[][][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Float.TYPE, iArr2);
                fArr7[0] = fArr6;
                aqanVar.b(fArr7, obj2);
                return;
            case 4:
                ((aifz) this.a).b(this.b, (defpackage.alnb) obj);
                return;
            case 5:
                defpackage.alnr alnrVar = (defpackage.alnr) obj;
                akzz akzzVarM = defpackage.almz.a.m();
                defpackage.alnb alnbVar = defpackage.alnb.EVENT_AVAILABLE_LLM_FEATURES;
                akzzVarM.u();
                defpackage.almz almzVar = akzzVarM.b;
                almzVar.c = alnbVar.aN;
                almzVar.b |= 1;
                apdi apdiVar = defpackage.almg.d;
                akzx akzxVarM = defpackage.almg.a.m();
                akzxVarM.u();
                defpackage.almg almgVar = (defpackage.almg) akzxVarM.b;
                j$.util.Objects.requireNonNull(alnrVar);
                almgVar.b();
                almgVar.b.add(alnrVar);
                akzzVarM.bV(apdiVar, (defpackage.almg) akzxVarM.p());
                ((defpackage.alkv) this.a).a.a(akzzVarM.p(), (defpackage.almy) this.b);
                return;
            case 6:
                ((defpackage.alkv) this.a).i((defpackage.almy) this.b, (defpackage.alnu) obj);
                return;
            case 7:
                ((defpackage.alkv) this.a).i((defpackage.almy) this.b, (defpackage.alnu) obj);
                return;
            case 8:
                ((defpackage.alvp) this.b).g((defpackage.almz) obj, (defpackage.almy) this.a);
                return;
            case org.chromium.net.NetworkException.ERROR_ADDRESS_UNREACHABLE /* 9 */:
                ((defpackage.alvp) this.b).a.a((defpackage.almz) obj, (defpackage.almy) this.a);
                return;
            case org.chromium.net.NetworkException.ERROR_QUIC_PROTOCOL_FAILED /* 10 */:
                defpackage.alws alwsVar = (defpackage.alws) obj;
                defpackage.alwq alwqVarB = defpackage.alwq.b(alwsVar.b);
                if (alwqVarB == null) {
                    alwqVarB = defpackage.alwq.TYPE_UNSET;
                }
                ((aigb) this.a).i(alwqVarB, ((defpackage.alza) this.b).c(alwsVar.c));
                return;
            case org.chromium.net.NetworkException.ERROR_OTHER /* 11 */:
                defpackage.almy almyVar = (defpackage.almy) obj;
                defpackage.almz almzVar2 = ((defpackage.almy) this.a).h;
                if (almzVar2 == null) {
                    almzVar2 = defpackage.almz.a;
                }
                apdi apdiVar2 = defpackage.aloi.e;
                almzVar2.c(apdiVar2);
                java.lang.Object objJ = ((alaa) almzVar2).n.j((alac) apdiVar2.a);
                if (objJ == null) {
                    objJ = apdiVar2.b;
                } else {
                    apdiVar2.c(objJ);
                }
                ((defpackage.alzd) this.b).l(almyVar, (defpackage.aloi) objJ);
                return;
            case 12:
                ((defpackage.alzn) this.b).a.m((defpackage.almz) obj, (defpackage.almy) this.a);
                return;
            case 13:
                defpackage.alzs alzsVar = (defpackage.alzs) this.b;
                defpackage.alvx alvxVar = alzsVar.e;
                java.lang.Object obj3 = this.a;
                defpackage.alsz alszVar = defpackage.alsz.BOT;
                defpackage.almy almyVar2 = (defpackage.almy) obj3;
                alvxVar.c(2, almyVar2, alszVar);
                alzsVar.a.j("CustomGreeting", almyVar2, j$.util.Optional.empty(), alszVar, j$.util.Optional.of((defpackage.alxa) obj));
                alzsVar.d = true;
                return;
            default:
                ((defpackage.alzs) this.b).h((defpackage.almz) obj, (defpackage.almy) this.a);
                return;
        }
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        switch (this.$cid) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case org.chromium.net.NetworkException.ERROR_ADDRESS_UNREACHABLE /* 9 */:
                break;
            case org.chromium.net.NetworkException.ERROR_QUIC_PROTOCOL_FAILED /* 10 */:
                break;
            case org.chromium.net.NetworkException.ERROR_OTHER /* 11 */:
                break;
            case 12:
                break;
            case 13:
                break;
            default:
                break;
        }
        return j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
    }

    public /* synthetic */ agzo(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
