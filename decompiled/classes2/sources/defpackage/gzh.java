package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class gzh {
    public java.util.Map a;
    public java.util.Map b;
    public float c;
    public java.util.Map d;
    public java.util.List e;
    public aed f;
    public adb g;
    public java.util.List h;
    public android.graphics.Rect i;
    public float j;
    public float k;
    public float l;
    public final defpackage.hgt n = new defpackage.hgt((byte[]) null);
    private final java.util.HashSet o = new java.util.HashSet();
    public int m = 0;

    public final float a() {
        return (long) ((b() / this.l) * 1000.0f);
    }

    public final float b() {
        return this.k - this.j;
    }

    public final defpackage.hei c(long j) {
        return (defpackage.hei) this.g.d(j);
    }

    public final java.util.Map d() {
        java.lang.ThreadLocal threadLocal = defpackage.hgm.a;
        float f = android.content.res.Resources.getSystem().getDisplayMetrics().density;
        if (f != this.c) {
            for (java.util.Map.Entry entry : this.b.entrySet()) {
                java.util.Map map = this.b;
                java.lang.String str = (java.lang.String) entry.getKey();
                defpackage.gzt gztVar = (defpackage.gzt) entry.getValue();
                float f2 = this.c / f;
                defpackage.gzt gztVar2 = new defpackage.gzt((int) (gztVar.a * f2), (int) (gztVar.b * f2), gztVar.c, gztVar.d, gztVar.e);
                android.graphics.Bitmap bitmap = gztVar.f;
                if (bitmap != null) {
                    gztVar2.f = android.graphics.Bitmap.createScaledBitmap(bitmap, gztVar2.a, gztVar2.b, true);
                }
                map.put(str, gztVar2);
            }
        }
        this.c = f;
        return this.b;
    }

    public final void e(java.lang.String str) {
        defpackage.hge.a(str);
        this.o.add(str);
    }

    public final void f(int i) {
        this.m += i;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LottieComposition:\n");
        java.util.Iterator it = this.h.iterator();
        while (it.hasNext()) {
            sb.append(((defpackage.hei) it.next()).a("\t"));
        }
        return sb.toString();
    }
}
