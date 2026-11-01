package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ycx extends defpackage.yco implements defpackage.xxb {
    public ycx(defpackage.ycv ycvVar) {
        super(ycvVar);
    }

    @Override // defpackage.xxe
    public final int a() {
        defpackage.yda ydaVar = ((defpackage.ycv) this.a).a.a;
        defpackage.xtl xtlVar = (defpackage.xtl) ydaVar.a;
        return xtlVar.a.limit() + xtlVar.c.length + (xtlVar.d.length << 2) + ydaVar.j;
    }

    @Override // defpackage.xxe
    public final java.lang.Class b() {
        return defpackage.ycv.class;
    }

    @Override // defpackage.yco, defpackage.xxb
    public final void d() {
        ((defpackage.ycv) this.a).a().prepareToDraw();
    }

    @Override // defpackage.xxe
    public final void e() {
        java.lang.Object obj;
        defpackage.ycv ycvVar = (defpackage.ycv) this.a;
        ycvVar.stop();
        ycvVar.b = true;
        defpackage.yda ydaVar = ycvVar.a.a;
        ydaVar.b.clear();
        ydaVar.d();
        ydaVar.f();
        defpackage.ycz yczVar = ydaVar.e;
        if (yczVar != null) {
            ydaVar.c.h(yczVar);
            ydaVar.e = null;
        }
        defpackage.ycz yczVar2 = ydaVar.g;
        if (yczVar2 != null) {
            ydaVar.c.h(yczVar2);
            ydaVar.g = null;
        }
        defpackage.ycz yczVar3 = ydaVar.i;
        if (yczVar3 != null) {
            ydaVar.c.h(yczVar3);
            ydaVar.i = null;
        }
        defpackage.xtl xtlVar = (defpackage.xtl) ydaVar.a;
        xtlVar.f = null;
        byte[] bArr = xtlVar.c;
        if (bArr != null) {
            xtlVar.j.i(bArr);
        }
        int[] iArr = xtlVar.d;
        if (iArr != null && (obj = xtlVar.j.b) != null) {
            ((defpackage.xxt) obj).c(iArr);
        }
        android.graphics.Bitmap bitmap = xtlVar.g;
        if (bitmap != null) {
            xtlVar.j.h(bitmap);
        }
        xtlVar.g = null;
        xtlVar.a = null;
        xtlVar.h = null;
        byte[] bArr2 = xtlVar.b;
        if (bArr2 != null) {
            xtlVar.j.i(bArr2);
        }
        ydaVar.f = true;
    }
}
