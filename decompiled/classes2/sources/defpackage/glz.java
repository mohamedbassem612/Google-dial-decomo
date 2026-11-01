package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class glz extends defpackage.gmb {
    public int[] a;
    float b;
    float c;
    float d;
    float e;
    float f;
    float g;
    android.graphics.Paint.Cap h;
    android.graphics.Paint.Join i;
    float j;
    akbx k;
    akbx l;

    public glz(defpackage.glz glzVar) {
        super(glzVar);
        this.b = 0.0f;
        this.c = 1.0f;
        this.d = 1.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 0.0f;
        this.h = android.graphics.Paint.Cap.BUTT;
        this.i = android.graphics.Paint.Join.MITER;
        this.j = 4.0f;
        int[] iArr = glzVar.a;
        this.a = null;
        this.k = glzVar.k;
        this.b = glzVar.b;
        this.c = glzVar.c;
        this.l = glzVar.l;
        this.o = glzVar.o;
        this.d = glzVar.d;
        this.e = glzVar.e;
        this.f = glzVar.f;
        this.g = glzVar.g;
        this.h = glzVar.h;
        this.i = glzVar.i;
        this.j = glzVar.j;
    }

    @Override // defpackage.fsu
    public final boolean F() {
        return this.l.g() || this.k.g();
    }

    @Override // defpackage.fsu
    public final boolean G(int[] iArr) {
        return this.l.h(iArr) | this.k.h(iArr);
    }

    float getFillAlpha() {
        return this.d;
    }

    int getFillColor() {
        return this.l.b;
    }

    float getStrokeAlpha() {
        return this.c;
    }

    int getStrokeColor() {
        return this.k.b;
    }

    float getStrokeWidth() {
        return this.b;
    }

    float getTrimPathEnd() {
        return this.f;
    }

    float getTrimPathOffset() {
        return this.g;
    }

    float getTrimPathStart() {
        return this.e;
    }

    void setFillAlpha(float f) {
        this.d = f;
    }

    void setFillColor(int i) {
        this.l.b = i;
    }

    void setStrokeAlpha(float f) {
        this.c = f;
    }

    void setStrokeColor(int i) {
        this.k.b = i;
    }

    void setStrokeWidth(float f) {
        this.b = f;
    }

    void setTrimPathEnd(float f) {
        this.f = f;
    }

    void setTrimPathOffset(float f) {
        this.g = f;
    }

    void setTrimPathStart(float f) {
        this.e = f;
    }

    public glz() {
        this.b = 0.0f;
        this.c = 1.0f;
        this.d = 1.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 0.0f;
        this.h = android.graphics.Paint.Cap.BUTT;
        this.i = android.graphics.Paint.Join.MITER;
        this.j = 4.0f;
    }
}
