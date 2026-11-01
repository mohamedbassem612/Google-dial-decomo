package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class cqm {
    public static final defpackage.cqm a = new defpackage.cqm();

    public final android.graphics.LinearGradient a(long j, long j2, long[] jArr, float[] fArr, int i) {
        return new android.graphics.LinearGradient(java.lang.Float.intBitsToFloat((int) (j >> 32)), java.lang.Float.intBitsToFloat((int) (4294967295L & j)), java.lang.Float.intBitsToFloat((int) (j2 >> 32)), java.lang.Float.intBitsToFloat((int) (j2 & 4294967295L)), jArr, fArr, i == 0 ? android.graphics.Shader.TileMode.CLAMP : android.graphics.Shader.TileMode.REPEAT);
    }

    public final android.graphics.RadialGradient b(long j, float f, long[] jArr, float[] fArr, int i) {
        return new android.graphics.RadialGradient(java.lang.Float.intBitsToFloat((int) (j >> 32)), java.lang.Float.intBitsToFloat((int) (4294967295L & j)), f, jArr, fArr, android.graphics.Shader.TileMode.CLAMP);
    }
}
