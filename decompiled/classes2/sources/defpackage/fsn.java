package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fsn implements defpackage.frt {
    private final defpackage.etx a = new defpackage.etx();
    private final defpackage.etx b = new defpackage.etx();
    private final defpackage.fsm c = new defpackage.fsm();
    private java.util.zip.Inflater d;

    @Override // defpackage.frt
    public final /* synthetic */ defpackage.frj a(byte[] bArr, int i, int i2) {
        return defpackage.fsu.a(this, bArr, i2);
    }

    @Override // defpackage.frt
    public final void b(byte[] bArr, int i, int i2, defpackage.frs frsVar, java.util.function.Consumer consumer) {
        defpackage.ess essVarA;
        defpackage.etx etxVar;
        int i3;
        int i4;
        defpackage.etx etxVar2;
        int i5;
        int i6;
        int iP;
        defpackage.etx etxVar3 = this.a;
        etxVar3.O(bArr, i + i2);
        etxVar3.Q(i);
        java.util.zip.Inflater inflater = this.d;
        if (inflater == null) {
            inflater = new java.util.zip.Inflater();
            this.d = inflater;
        }
        defpackage.etx etxVar4 = this.b;
        if (eum.Y(etxVar3, etxVar4, inflater)) {
            etxVar3.O(etxVar4.b, etxVar4.d);
        }
        defpackage.fsm fsmVar = this.c;
        fsmVar.a();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (etxVar3.d() >= 3) {
            int i7 = etxVar3.d;
            int iN = etxVar3.n();
            int iS = etxVar3.s();
            int i8 = etxVar3.c + iS;
            if (i8 > i7) {
                etxVar3.Q(i7);
                essVarA = null;
            } else {
                if (iN != 128) {
                    switch (iN) {
                        case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_RIGHT /* 20 */:
                            if (iS % 5 == 2) {
                                etxVar3.R(2);
                                int[] iArr = fsmVar.b;
                                java.util.Arrays.fill(iArr, 0);
                                int i9 = iS / 5;
                                int i10 = 0;
                                while (i10 < i9) {
                                    int iN2 = etxVar3.n();
                                    int iN3 = etxVar3.n();
                                    double d = iN3;
                                    double dN = etxVar3.n() - 128;
                                    int[] iArr2 = iArr;
                                    double dN2 = etxVar3.n() - 128;
                                    iArr2[iN2] = (etxVar3.n() << 24) | (eum.c((int) (d + (1.402d * dN)), 0, 255) << 16) | (eum.c((int) ((d - (0.34414d * dN2)) - (dN * 0.71414d)), 0, 255) << 8) | eum.c((int) (d + (dN2 * 1.772d)), 0, 255);
                                    i10++;
                                    iArr = iArr2;
                                }
                                fsmVar.c = true;
                            }
                            break;
                        case androidx.car.app.navigation.model.Maneuver.TYPE_OFF_RAMP_SLIGHT_LEFT /* 21 */:
                            if (iS >= 4) {
                                etxVar3.R(3);
                                int i11 = iS - 4;
                                if ((etxVar3.n() & 128) == 0) {
                                    etxVar2 = fsmVar.a;
                                    i5 = etxVar2.c;
                                    i6 = etxVar2.d;
                                    if (i5 < i6 && i11 > 0) {
                                        int iMin = java.lang.Math.min(i11, i6 - i5);
                                        etxVar3.L(etxVar2.b, i5, iMin);
                                        etxVar2.Q(i5 + iMin);
                                    }
                                } else if (i11 >= 7 && (iP = etxVar3.p()) >= 4) {
                                    fsmVar.h = etxVar3.s();
                                    fsmVar.i = etxVar3.s();
                                    fsmVar.a.M(iP - 4);
                                    i11 = iS - 11;
                                    etxVar2 = fsmVar.a;
                                    i5 = etxVar2.c;
                                    i6 = etxVar2.d;
                                    if (i5 < i6) {
                                        int iMin2 = java.lang.Math.min(i11, i6 - i5);
                                        etxVar3.L(etxVar2.b, i5, iMin2);
                                        etxVar2.Q(i5 + iMin2);
                                    }
                                }
                            }
                            break;
                        case androidx.car.app.navigation.model.Maneuver.TYPE_OFF_RAMP_SLIGHT_RIGHT /* 22 */:
                            if (iS >= 19) {
                                fsmVar.d = etxVar3.s();
                                fsmVar.e = etxVar3.s();
                                etxVar3.R(11);
                                fsmVar.f = etxVar3.s();
                                fsmVar.g = etxVar3.s();
                            }
                            break;
                    }
                    essVarA = null;
                } else {
                    if (fsmVar.d == 0 || fsmVar.e == 0 || fsmVar.h == 0 || fsmVar.i == 0 || (i3 = (etxVar = fsmVar.a).d) == 0 || etxVar.c != i3 || !fsmVar.c) {
                        essVarA = null;
                    } else {
                        etxVar.Q(0);
                        int i12 = fsmVar.h * fsmVar.i;
                        int[] iArr3 = new int[i12];
                        int i13 = 0;
                        while (i13 < i12) {
                            int iN4 = etxVar.n();
                            if (iN4 != 0) {
                                i4 = i13 + 1;
                                iArr3[i13] = fsmVar.b[iN4];
                            } else {
                                int iN5 = etxVar.n();
                                if (iN5 != 0) {
                                    int iN6 = iN5 & 63;
                                    if ((iN5 & 64) != 0) {
                                        iN6 = (iN6 << 8) | etxVar.n();
                                    }
                                    i4 = iN6 + i13;
                                    java.util.Arrays.fill(iArr3, i13, i4, (iN5 & 128) == 0 ? fsmVar.b[0] : fsmVar.b[etxVar.n()]);
                                }
                            }
                            i13 = i4;
                        }
                        android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(iArr3, fsmVar.h, fsmVar.i, android.graphics.Bitmap.Config.ARGB_8888);
                        defpackage.esr esrVar = new defpackage.esr();
                        esrVar.b(bitmapCreateBitmap);
                        esrVar.e = fsmVar.f / fsmVar.d;
                        esrVar.f = 0;
                        esrVar.c(fsmVar.g / fsmVar.e, 0);
                        esrVar.d = 0;
                        esrVar.g = fsmVar.h / fsmVar.d;
                        esrVar.h = fsmVar.i / fsmVar.e;
                        essVarA = esrVar.a();
                    }
                    fsmVar.a();
                }
                etxVar3.Q(i8);
            }
            if (essVarA != null) {
                arrayList.add(essVarA);
            }
        }
        aa$.ExternalSyntheticApiModelOutline1.m(consumer, new defpackage.frf(arrayList, -9223372036854775807L, -9223372036854775807L));
    }

    @Override // defpackage.frt
    public final /* synthetic */ void c() {
    }
}
