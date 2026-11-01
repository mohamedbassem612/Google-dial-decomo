package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class elz implements defpackage.elu {
    final /* synthetic */ float[] a;
    final /* synthetic */ android.graphics.Matrix b;

    public elz(float[] fArr, android.graphics.Matrix matrix) {
        this.a = fArr;
        this.b = matrix;
    }

    @Override // defpackage.elu
    public final long a(float f, float f2) {
        float[] fArr = this.a;
        fArr[0] = f;
        fArr[1] = f2;
        this.b.mapPoints(fArr);
        return mni.bj(fArr[0], fArr[1]);
    }
}
