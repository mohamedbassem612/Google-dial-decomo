package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hbg implements defpackage.hay {
    private final defpackage.hay a;
    private final defpackage.hbd b;
    private final defpackage.hbd c;
    private final defpackage.hbd d;
    private final defpackage.hbd e;
    private final defpackage.hbd f;
    private boolean g = true;

    public hbg(defpackage.hay hayVar, defpackage.hef hefVar, defpackage.hwv hwvVar) {
        this.a = hayVar;
        defpackage.hbd hbdVarA = ((defpackage.hda) hwvVar.b).a();
        this.b = hbdVarA;
        hbdVarA.h(this);
        hefVar.i(hbdVarA);
        defpackage.hbd hbdVarA2 = ((defpackage.hdb) hwvVar.c).a();
        this.c = hbdVarA2;
        hbdVarA2.h(this);
        hefVar.i(hbdVarA2);
        defpackage.hbd hbdVarA3 = ((defpackage.hdb) hwvVar.d).a();
        this.d = hbdVarA3;
        hbdVarA3.h(this);
        hefVar.i(hbdVarA3);
        defpackage.hbd hbdVarA4 = ((defpackage.hdb) hwvVar.e).a();
        this.e = hbdVarA4;
        hbdVarA4.h(this);
        hefVar.i(hbdVarA4);
        defpackage.hbd hbdVarA5 = ((defpackage.hdb) hwvVar.a).a();
        this.f = hbdVarA5;
        hbdVarA5.h(this);
        hefVar.i(hbdVarA5);
    }

    public final void a(android.graphics.Paint paint) {
        if (this.g) {
            this.g = false;
            double dFloatValue = ((java.lang.Float) this.d.e()).floatValue();
            float fFloatValue = ((java.lang.Float) this.e.e()).floatValue();
            double d = dFloatValue * 0.017453292519943295d;
            float fSin = ((float) java.lang.Math.sin(d)) * fFloatValue;
            float fCos = ((float) java.lang.Math.cos(d + 3.141592653589793d)) * fFloatValue;
            int iIntValue = ((java.lang.Integer) this.b.e()).intValue();
            paint.setShadowLayer(((java.lang.Float) this.f.e()).floatValue(), fSin, fCos, android.graphics.Color.argb(java.lang.Math.round(((java.lang.Float) this.c.e()).floatValue()), android.graphics.Color.red(iIntValue), android.graphics.Color.green(iIntValue), android.graphics.Color.blue(iIntValue)));
        }
    }

    public final void b(defpackage.hgp hgpVar) {
        this.b.d = hgpVar;
    }

    public final void c(defpackage.hgp hgpVar) {
        this.d.d = hgpVar;
    }

    @Override // defpackage.hay
    public final void d() {
        this.g = true;
        this.a.d();
    }

    public final void e(defpackage.hgp hgpVar) {
        this.e.d = hgpVar;
    }

    public final void f(defpackage.hgp hgpVar) {
        defpackage.hbd hbdVar = this.c;
        if (hgpVar == null) {
            hbdVar.d = null;
        } else {
            hbdVar.d = new defpackage.hbf(this, hgpVar);
        }
    }

    public final void g(defpackage.hgp hgpVar) {
        this.f.d = hgpVar;
    }
}
