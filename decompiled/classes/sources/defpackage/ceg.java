package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class ceg extends defpackage.cls implements defpackage.clb, defpackage.ccp, defpackage.cer {
    private defpackage.cef a;

    public ceg(float f) {
        defpackage.cko ckoVarB = defpackage.ckw.b();
        defpackage.cef cefVar = new defpackage.cef(ckoVarB.v(), f);
        if (!(ckoVarB instanceof defpackage.ckf)) {
            cefVar.h = new defpackage.cef(1L, f);
        }
        this.a = cefVar;
    }

    @Override // defpackage.ccp, defpackage.cer
    public final /* synthetic */ java.lang.Object a() {
        return java.lang.Float.valueOf(c());
    }

    @Override // defpackage.ccp
    public final /* synthetic */ void b(java.lang.Object obj) {
        h(((java.lang.Number) obj).floatValue());
    }

    public final float c() {
        return ((defpackage.cef) defpackage.ckw.i(this.a, this)).a;
    }

    @Override // defpackage.clr
    public final defpackage.clt d() {
        return this.a;
    }

    @Override // defpackage.clr
    public final void e(defpackage.clt cltVar) {
        if (cltVar == null) {
            defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        }
        this.a = (defpackage.cef) cltVar;
    }

    @Override // defpackage.clb
    public final defpackage.cen f() {
        return defpackage.cdu.c;
    }

    @Override // defpackage.cls, defpackage.clr
    public final defpackage.clt g(defpackage.clt cltVar, defpackage.clt cltVar2, defpackage.clt cltVar3) {
        if (((defpackage.cef) cltVar2).a != ((defpackage.cef) cltVar3).a) {
            return null;
        }
        return cltVar2;
    }

    public final void h(float f) {
        defpackage.cko ckoVarB;
        defpackage.cef cefVar = (defpackage.cef) defpackage.ckw.f(this.a, this);
        if (cefVar.a != f) {
            defpackage.cef cefVar2 = this.a;
            synchronized (defpackage.ckw.b) {
                ckoVarB = defpackage.ckw.b();
                ((defpackage.cef) defpackage.ckw.h(cefVar2, this, ckoVarB, cefVar)).a = f;
            }
            defpackage.ckw.r(ckoVarB, this);
        }
    }

    public final java.lang.String toString() {
        return "MutableFloatState(value=" + ((defpackage.cef) defpackage.ckw.f(this.a, this)).a + ")@" + hashCode();
    }
}
