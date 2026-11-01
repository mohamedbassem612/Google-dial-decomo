package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class abmp implements crd {
    private final float a;
    private final float b;
    private final float[] c;
    private final izg d;

    public abmp(izg izgVar, float f, float f2) {
        aooh.f(izgVar, "morph");
        this.d = izgVar;
        this.a = f;
        this.b = f2;
        this.c = cqt.e();
    }

    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public final cqx a(long j, dpq dpqVar, dpf dpfVar) {
        defpackage.abmp abmpVar = this;
        aooh.f(dpqVar, "layoutDirection");
        aooh.f(dpfVar, "density");
        float[] fArr = abmpVar.c;
        cqt.c(fArr);
        cqt.g(fArr, java.lang.Float.intBitsToFloat((int) (j >> 32)) / 2.0f, java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) / 2.0f);
        cqt.h(fArr, 1.0f, 1.0f);
        cqt.d(fArr, abmpVar.b);
        android.graphics.Path path = new android.graphics.Path();
        izg izgVar = abmpVar.d;
        aooh.f(izgVar, "<this>");
        path.rewind();
        defpackage.ell ellVar = new defpackage.ell((byte[]) null);
        ?? r11 = izgVar.c;
        int size = r11.size();
        boolean z = true;
        float fE = 0.0f;
        float f = 0.0f;
        float fG = 0.0f;
        float fH = 0.0f;
        float fC = 0.0f;
        float fA = 0.0f;
        float fB = 0.0f;
        float fD = 0.0f;
        int i = 0;
        while (i < size) {
            defpackage.ell ellVar2 = (defpackage.ell) ((aoiu) r11.get(i)).a;
            int i2 = i;
            defpackage.ell ellVar3 = (defpackage.ell) ((aoiu) r11.get(i)).b;
            boolean z2 = z;
            aooh.f(ellVar2, "c1");
            aooh.f(ellVar3, "c2");
            float f2 = fE;
            int i3 = 0;
            while (i3 < 8) {
                float f3 = abmpVar.a;
                float[] fArr2 = ellVar.a;
                float f4 = ellVar2.a[i3];
                float f5 = ellVar3.a[i3];
                float f6 = defpackage.ema.a;
                fArr2[i3] = ((1.0f - f3) * f4) + (f3 * f5);
                i3++;
                abmpVar = this;
            }
            if (z2) {
                path.moveTo(ellVar.a(), ellVar.b());
                fA = ellVar.a();
                fB = ellVar.b();
            } else {
                path.cubicTo(f2, f, fG, fH, fC, fD);
            }
            fE = ellVar.e();
            f = ellVar.f();
            fG = ellVar.g();
            fH = ellVar.h();
            fC = ellVar.c();
            fD = ellVar.d();
            i = i2 + 1;
            z = false;
            abmpVar = this;
        }
        boolean z3 = z;
        float f7 = fE;
        float f8 = f;
        float f9 = fG;
        float f10 = fH;
        if (!z3) {
            path.cubicTo(f7, f8, f9, f10, fA, fB);
        }
        path.close();
        cpx cpxVar = new cpx(path);
        cpxVar.n(fArr);
        return new cqu(cpxVar);
    }
}
