package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yda {
    public final defpackage.xth a;
    public final java.util.List b;
    public final defpackage.xsx c;
    public boolean d;
    public defpackage.ycz e;
    public boolean f;
    public defpackage.ycz g;
    public android.graphics.Bitmap h;
    public defpackage.ycz i;
    public int j;
    public int k;
    public int l;
    private final android.os.Handler m;
    private final defpackage.xxm n;
    private boolean o;
    private defpackage.xsv p;

    public yda(defpackage.xrr xrrVar, defpackage.xth xthVar, int i, int i2, defpackage.xuw xuwVar, android.graphics.Bitmap bitmap) {
        defpackage.xxm xxmVar = xrrVar.b;
        defpackage.xsx xsxVarC = defpackage.xrr.c(xrrVar.a());
        defpackage.xsv xsvVarB = defpackage.xrr.c(xrrVar.a()).b().i(((defpackage.yep) ((defpackage.yep) defpackage.yep.b(defpackage.xwm.c).O()).N()).z(i, i2));
        this.b = new java.util.ArrayList();
        this.c = xsxVarC;
        android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper(), new etz(this, 2));
        this.n = xxmVar;
        this.m = handler;
        this.p = xsvVarB;
        this.a = xthVar;
        e(xuwVar, bitmap);
    }

    final int a() {
        return ((defpackage.xtl) this.a).f.c;
    }

    public final void b() {
        int i;
        if (!this.d || this.o) {
            return;
        }
        defpackage.ycz yczVar = this.i;
        if (yczVar != null) {
            this.i = null;
            c(yczVar);
            return;
        }
        this.o = true;
        defpackage.xth xthVar = this.a;
        defpackage.xtl xtlVar = (defpackage.xtl) xthVar;
        defpackage.xtj xtjVar = xtlVar.f;
        int i2 = xtjVar.c;
        int i3 = 0;
        if (i2 > 0 && (i = xtlVar.e) >= 0) {
            i3 = i < i2 ? ((defpackage.xti) xtjVar.e.get(i)).i : -1;
        }
        long jUptimeMillis = android.os.SystemClock.uptimeMillis() + ((long) i3);
        xthVar.b();
        this.g = new defpackage.ycz(this.m, xtlVar.e, jUptimeMillis);
        this.p.i((defpackage.yep) new defpackage.yep().E(new defpackage.yfn(java.lang.Double.valueOf(java.lang.Math.random())))).f(xthVar).k(this.g);
    }

    public final void c(defpackage.ycz yczVar) {
        this.o = false;
        if (this.f) {
            this.m.obtainMessage(2, yczVar).sendToTarget();
            return;
        }
        if (!this.d) {
            this.i = yczVar;
            return;
        }
        if (yczVar.b != null) {
            d();
            defpackage.ycz yczVar2 = this.e;
            this.e = yczVar;
            java.util.List list = this.b;
            for (int size = list.size() - 1; size >= 0; size--) {
                defpackage.ycv ycvVar = (defpackage.ycv) list.get(size);
                java.lang.Object callback = ycvVar.getCallback();
                while (callback instanceof android.graphics.drawable.Drawable) {
                    callback = ((android.graphics.drawable.Drawable) callback).getCallback();
                }
                if (callback == null) {
                    ycvVar.stop();
                    ycvVar.invalidateSelf();
                } else {
                    ycvVar.invalidateSelf();
                    defpackage.yda ydaVar = ycvVar.a.a;
                    defpackage.ycz yczVar3 = ydaVar.e;
                    if ((yczVar3 != null ? yczVar3.a : -1) == ydaVar.a() - 1) {
                        ycvVar.c++;
                    }
                    if (ycvVar.d != -1 && ycvVar.c >= 0) {
                        ycvVar.stop();
                    }
                }
            }
            if (yczVar2 != null) {
                this.m.obtainMessage(2, yczVar2).sendToTarget();
            }
        }
        b();
    }

    public final void d() {
        android.graphics.Bitmap bitmap = this.h;
        if (bitmap != null) {
            this.n.d(bitmap);
            this.h = null;
        }
    }

    final void e(defpackage.xuw xuwVar, android.graphics.Bitmap bitmap) {
        anty.aI(bitmap, "Argument must not be null");
        this.h = bitmap;
        this.p = this.p.i(new defpackage.yep().H(xuwVar, true));
        this.j = defpackage.ygc.a(bitmap);
        this.k = bitmap.getWidth();
        this.l = bitmap.getHeight();
    }

    public final void f() {
        this.d = false;
    }
}
