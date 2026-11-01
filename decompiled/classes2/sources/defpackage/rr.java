package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class rr {
    public static java.util.List a(android.app.appsearch.AppSearchSchema appSearchSchema) {
        return mp$.ExternalSyntheticApiModelOutline1.m(appSearchSchema);
    }

    public static androidx.car.app.SessionInfo b(android.content.Intent intent) {
        android.os.Bundle extras = intent.getExtras();
        if (extras == null) {
            throw new java.lang.IllegalArgumentException("Expected the SessionInfo to be encoded in the bind intent extras, but the extras were null.");
        }
        android.os.Bundle bundle = extras.getBundle("androidx.car.app.extra.SESSION_INFO_BUNDLE");
        return new androidx.car.app.SessionInfo(bundle.getInt("display-type"), bundle.getString("session-id"));
    }

    public static boolean c(android.content.Intent intent) {
        android.os.Bundle extras = intent.getExtras();
        if (extras == null) {
            return false;
        }
        return extras.containsKey("androidx.car.app.extra.SESSION_INFO_BUNDLE");
    }

    public static boolean d(ato atoVar, float f) {
        float fA = atoVar.a(f);
        if (fA < 0.0f) {
            return atoVar.a.f();
        }
        if (fA <= 0.0f) {
            return false;
        }
        return atoVar.a.g();
    }

    public static cer e(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, aonn aonnVar, cav cavVar) {
        cbt cbtVar = (cbt) cavVar;
        java.lang.Object objR = cbtVar.R();
        java.lang.Object obj4 = cau.a;
        if (objR == obj4) {
            androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState = new androidx.compose.runtime.ParcelableSnapshotMutableState(obj, cdu.c);
            cbtVar.ab(parcelableSnapshotMutableState);
            objR = parcelableSnapshotMutableState;
        }
        ccp ccpVar = (ccp) objR;
        boolean zD = cavVar.D(aonnVar);
        java.lang.Object objR2 = cbtVar.R();
        if (zD || objR2 == obj4) {
            defpackage.apw apwVar = new defpackage.apw(aonnVar, ccpVar, null, 9, null);
            cbtVar.ab(apwVar);
            objR2 = apwVar;
        }
        cbp.f(obj2, obj3, (aonn) objR2, cavVar);
        return ccpVar;
    }

    public static defpackage.dwc f(int i) {
        defpackage.bzc bzcVar = defpackage.bzc.a;
        float[][] fArr = defpackage.bzb.a;
        double dB = defpackage.bzb.b((i >> 16) & 255);
        float fB = defpackage.bzb.b((i >> 8) & 255);
        float fB2 = defpackage.bzb.b(i & 255);
        double[][] dArr = defpackage.bzb.d;
        double[] dArr2 = dArr[0];
        double d = dArr2[0] * dB;
        double d2 = fB;
        double d3 = dArr2[1] * d2;
        double d4 = fB2;
        double d5 = dArr2[2] * d4;
        double[] dArr3 = dArr[1];
        double d6 = dArr3[0] * dB;
        double d7 = dArr3[1] * d2;
        double d8 = dArr3[2] * d4;
        double[] dArr4 = dArr[2];
        float f = (float) ((dB * dArr4[0]) + (d2 * dArr4[1]) + (d4 * dArr4[2]));
        float[] fArr2 = {(float) (d + d3 + d5), (float) (d6 + d7 + d8), f};
        float[][] fArr3 = defpackage.bzb.a;
        float f2 = fArr2[0];
        float[] fArr4 = fArr3[0];
        float f3 = fArr4[0] * f2;
        float f4 = fArr2[1];
        float f5 = fArr4[1] * f4;
        float f6 = fArr4[2] * f;
        float[] fArr5 = fArr3[1];
        float f7 = fArr5[0] * f2;
        float f8 = fArr5[1] * f4;
        float f9 = fArr5[2] * f;
        float[] fArr6 = fArr3[2];
        float f10 = f2 * fArr6[0];
        float f11 = f4 * fArr6[1];
        float f12 = f * fArr6[2];
        float[] fArr7 = bzcVar.g;
        float f13 = fArr7[0] * (f3 + f5 + f6);
        float f14 = fArr7[1] * (f7 + f8 + f9);
        float f15 = fArr7[2] * (f10 + f11 + f12);
        float f16 = bzcVar.h;
        float fPow = (float) java.lang.Math.pow((java.lang.Math.abs(f13) * f16) / 100.0f, 0.41999998688697815d);
        float fPow2 = (float) java.lang.Math.pow((java.lang.Math.abs(f14) * f16) / 100.0f, 0.41999998688697815d);
        float fPow3 = (float) java.lang.Math.pow((f16 * java.lang.Math.abs(f15)) / 100.0f, 0.41999998688697815d);
        float fSignum = ((java.lang.Math.signum(f13) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((java.lang.Math.signum(f14) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((java.lang.Math.signum(f15) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        float f17 = ((fSignum + fSignum2) - (fSignum3 + fSignum3)) / 9.0f;
        float f18 = (((fSignum * 11.0f) + ((-12.0f) * fSignum2)) + fSignum3) / 11.0f;
        float fAtan2 = (((float) java.lang.Math.atan2(f17, f18)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f19 = fAtan2;
        float f20 = fSignum2 * 20.0f;
        float f21 = (f19 * 3.1415927f) / 180.0f;
        float f22 = (((((40.0f * fSignum) + f20) + fSignum3) / 20.0f) * bzcVar.d) / bzcVar.c;
        float f23 = bzcVar.f;
        float fPow4 = ((float) java.lang.Math.pow(f22, bzcVar.j * 0.69000006f)) * 100.0f;
        float fPow5 = ((float) java.lang.Math.pow((((((((float) java.lang.Math.cos((((((double) f19) < 20.14d ? 360.0f + f19 : f19) * 3.1415927f) / 180.0f) + 2.0f)) + 3.8f) * 0.25f) * 3846.1538f) * bzcVar.e) * ((float) java.lang.Math.sqrt((f18 * f18) + (f17 * f17)))) / (((((fSignum * 20.0f) + f20) + (fSignum3 * 21.0f)) / 20.0f) + 0.305f), 0.8999999761581421d)) * ((float) java.lang.Math.pow(1.64f - ((float) java.lang.Math.pow(0.28999999165534973d, bzcVar.b)), 0.7300000190734863d)) * ((float) java.lang.Math.sqrt(fPow4 / 100.0f));
        double d9 = f21;
        float fLog = ((float) java.lang.Math.log((bzcVar.i * fPow5 * 0.0228f) + 1.0f)) * 43.85965f;
        return new defpackage.dwc(f19, fPow5, fPow4, (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f), fLog * ((float) java.lang.Math.cos(d9)), fLog * ((float) java.lang.Math.sin(d9)));
    }

    public static defpackage.dwc g(float f, float f2, float f3) {
        defpackage.bzc bzcVar = defpackage.bzc.a;
        float f4 = bzcVar.i * f2;
        float f5 = bzcVar.f;
        float f6 = bzcVar.c;
        float fLog = (float) java.lang.Math.log((((double) f4) * 0.0228d) + 1.0d);
        double d = (3.1415927f * f3) / 180.0f;
        float f7 = fLog * 43.85965f;
        return new defpackage.dwc(f3, f2, f, (1.7f * f) / ((0.007f * f) + 1.0f), f7 * ((float) java.lang.Math.cos(d)), f7 * ((float) java.lang.Math.sin(d)));
    }
}
