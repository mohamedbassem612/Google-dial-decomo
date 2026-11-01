package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class eln {
    public final defpackage.acf a;
    public final defpackage.acf b;

    static {
        java.lang.Float fValueOf = java.lang.Float.valueOf(0.0f);
        java.lang.Float fValueOf2 = java.lang.Float.valueOf(0.5f);
        new defpackage.eln(new aoiu(fValueOf, fValueOf), new aoiu(fValueOf2, fValueOf2));
    }

    public eln(aoiu... aoiuVarArr) {
        aooh.f(aoiuVarArr, "mappings");
        int length = aoiuVarArr.length;
        this.a = new defpackage.acf(length);
        this.b = new defpackage.acf(length);
        int i = 0;
        while (true) {
            defpackage.acf acfVar = this.a;
            if (i >= length) {
                defpackage.aaf.f(acfVar);
                defpackage.aaf.f(this.b);
                return;
            } else {
                acfVar.c(((java.lang.Number) aoiuVarArr[i].a).floatValue());
                this.b.c(((java.lang.Number) aoiuVarArr[i].b).floatValue());
                i++;
            }
        }
    }

    public final float a(float f) {
        return defpackage.aaf.d(this.a, this.b, f);
    }
}
