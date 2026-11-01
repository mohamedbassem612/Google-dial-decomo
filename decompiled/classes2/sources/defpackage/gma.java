package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class gma extends defpackage.fsu {
    final android.graphics.Matrix a;
    final java.util.ArrayList b;
    float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    final android.graphics.Matrix j;
    int k;
    public int[] l;
    public java.lang.String m;

    public gma(defpackage.gma gmaVar, aca acaVar) {
        defpackage.gmb glyVar;
        super((short[]) null);
        this.a = new android.graphics.Matrix();
        this.b = new java.util.ArrayList();
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        this.j = matrix;
        this.m = null;
        this.c = gmaVar.c;
        this.d = gmaVar.d;
        this.e = gmaVar.e;
        this.f = gmaVar.f;
        this.g = gmaVar.g;
        this.h = gmaVar.h;
        this.i = gmaVar.i;
        int[] iArr = gmaVar.l;
        this.l = null;
        java.lang.String str = gmaVar.m;
        this.m = str;
        int i = gmaVar.k;
        this.k = 0;
        if (str != null) {
            acaVar.put(str, this);
        }
        matrix.set(gmaVar.j);
        java.util.ArrayList arrayList = gmaVar.b;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            java.lang.Object obj = arrayList.get(i2);
            if (obj instanceof defpackage.gma) {
                this.b.add(new defpackage.gma((defpackage.gma) obj, acaVar));
            } else {
                if (obj instanceof defpackage.glz) {
                    glyVar = new defpackage.glz((defpackage.glz) obj);
                } else {
                    if (!(obj instanceof defpackage.gly)) {
                        throw new java.lang.IllegalStateException("Unknown object in the tree!");
                    }
                    glyVar = new defpackage.gly((defpackage.gly) obj);
                }
                this.b.add(glyVar);
                java.lang.String str2 = glyVar.n;
                if (str2 != null) {
                    acaVar.put(str2, glyVar);
                }
            }
        }
    }

    @Override // defpackage.fsu
    public final boolean F() {
        int i = 0;
        while (true) {
            java.util.ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((defpackage.fsu) arrayList.get(i)).F()) {
                return true;
            }
            i++;
        }
    }

    @Override // defpackage.fsu
    public final boolean G(int[] iArr) {
        int i = 0;
        boolean zG = false;
        while (true) {
            java.util.ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return zG;
            }
            zG |= ((defpackage.fsu) arrayList.get(i)).G(iArr);
            i++;
        }
    }

    public final void N() {
        android.graphics.Matrix matrix = this.j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.e);
        matrix.postScale(this.f, this.g);
        matrix.postRotate(this.c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.i + this.e);
    }

    public java.lang.String getGroupName() {
        return this.m;
    }

    public android.graphics.Matrix getLocalMatrix() {
        return this.j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.e;
    }

    public float getRotation() {
        return this.c;
    }

    public float getScaleX() {
        return this.f;
    }

    public float getScaleY() {
        return this.g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.i;
    }

    public void setPivotX(float f) {
        if (f != this.d) {
            this.d = f;
            N();
        }
    }

    public void setPivotY(float f) {
        if (f != this.e) {
            this.e = f;
            N();
        }
    }

    public void setRotation(float f) {
        if (f != this.c) {
            this.c = f;
            N();
        }
    }

    public void setScaleX(float f) {
        if (f != this.f) {
            this.f = f;
            N();
        }
    }

    public void setScaleY(float f) {
        if (f != this.g) {
            this.g = f;
            N();
        }
    }

    public void setTranslateX(float f) {
        if (f != this.h) {
            this.h = f;
            N();
        }
    }

    public void setTranslateY(float f) {
        if (f != this.i) {
            this.i = f;
            N();
        }
    }

    public gma() {
        super((short[]) null);
        this.a = new android.graphics.Matrix();
        this.b = new java.util.ArrayList();
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = new android.graphics.Matrix();
        this.m = null;
    }
}
