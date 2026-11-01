package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class haw extends defpackage.haf {
    private final defpackage.hef d;
    private final java.lang.String e;
    private final boolean f;
    private final defpackage.hbd g;
    private defpackage.hbd h;

    public haw(defpackage.gzs gzsVar, defpackage.hef hefVar, defpackage.hec hecVar) {
        super(gzsVar, hefVar, defpackage.hgt.n(hecVar.i), defpackage.hgt.m(hecVar.j), hecVar.g, hecVar.e, hecVar.f, hecVar.c, hecVar.b);
        this.d = hefVar;
        this.e = hecVar.a;
        this.f = hecVar.h;
        defpackage.hbd hbdVarA = hecVar.d.a();
        this.g = hbdVarA;
        hbdVarA.h(this);
        hefVar.i(hbdVarA);
    }

    @Override // defpackage.haf, defpackage.hcx
    public final void a(java.lang.Object obj, defpackage.hgp hgpVar) {
        super.a(obj, hgpVar);
        if (obj == defpackage.gzx.b) {
            this.g.d = hgpVar;
            return;
        }
        if (obj == defpackage.gzx.K) {
            defpackage.hbd hbdVar = this.h;
            if (hbdVar != null) {
                this.d.k(hbdVar);
            }
            if (hgpVar == null) {
                this.h = null;
                return;
            }
            defpackage.hbu hbuVar = new defpackage.hbu(hgpVar, null);
            this.h = hbuVar;
            hbuVar.h(this);
            this.d.i(this.g);
        }
    }

    @Override // defpackage.haf, defpackage.hai
    public final void b(android.graphics.Canvas canvas, android.graphics.Matrix matrix, int i) {
        if (this.f) {
            return;
        }
        android.graphics.Paint paint = this.b;
        paint.setColor(((defpackage.hbe) this.g).k());
        defpackage.hbd hbdVar = this.h;
        if (hbdVar != null) {
            paint.setColorFilter((android.graphics.ColorFilter) hbdVar.e());
        }
        super.b(canvas, matrix, i);
    }

    @Override // defpackage.hag
    public final java.lang.String g() {
        return this.e;
    }
}
