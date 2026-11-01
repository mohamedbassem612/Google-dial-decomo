package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class elx implements defpackage.elu {
    final /* synthetic */ float a;
    final /* synthetic */ float b;
    final /* synthetic */ float c;

    public elx(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    @Override // defpackage.elu
    public final long a(float f, float f2) {
        float f3 = f + this.a;
        float f4 = f2 + this.c;
        float f5 = this.b;
        return mni.bj(f3 / f5, f4 / f5);
    }
}
