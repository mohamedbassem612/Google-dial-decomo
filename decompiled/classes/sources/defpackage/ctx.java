package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ctx extends defpackage.sl implements java.lang.Iterable, defpackage.aoow {
    public final java.lang.String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final java.util.List i;
    public final java.util.List j;

    public ctx(java.lang.String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, java.util.List list, java.util.List list2) {
        super(null);
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = f5;
        this.g = f6;
        this.h = f7;
        this.i = list;
        this.j = list2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof defpackage.ctx)) {
            defpackage.ctx ctxVar = (defpackage.ctx) obj;
            if (defpackage.aooh.n(this.a, ctxVar.a) && this.b == ctxVar.b && this.c == ctxVar.c && this.d == ctxVar.d && this.e == ctxVar.e && this.f == ctxVar.f && this.g == ctxVar.g && this.h == ctxVar.h && defpackage.aooh.n(this.i, ctxVar.i) && defpackage.aooh.n(this.j, ctxVar.j)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((((((((this.a.hashCode() * 31) + java.lang.Float.floatToIntBits(this.b)) * 31) + java.lang.Float.floatToIntBits(this.c)) * 31) + java.lang.Float.floatToIntBits(this.d)) * 31) + java.lang.Float.floatToIntBits(this.e)) * 31) + java.lang.Float.floatToIntBits(this.f)) * 31) + java.lang.Float.floatToIntBits(this.g)) * 31) + java.lang.Float.floatToIntBits(this.h)) * 31) + this.i.hashCode()) * 31) + this.j.hashCode();
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        return new ctw(this, 0);
    }

    public ctx() {
        this("", 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, defpackage.cty.a, defpackage.aokc.a);
    }
}
