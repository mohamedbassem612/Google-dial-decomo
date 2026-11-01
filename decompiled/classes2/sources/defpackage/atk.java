package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class atk implements asv {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;
    final /* synthetic */ java.lang.Object b;

    public atk(defpackage.apt aptVar, defpackage.apx apxVar, int i) {
        this.$cid = i;
        this.b = aptVar;
        this.a = apxVar;
    }

    public final float a(float f) {
        int i = this.$cid;
        if (i == 0) {
            if (java.lang.Math.abs(f) != 0.0f && !((java.lang.Boolean) ((ato) this.a).f.a()).booleanValue()) {
                throw new defpackage.art();
            }
            ato atoVar = (ato) this.a;
            return atoVar.a(atoVar.b(((apnt) this.b).v(atoVar.d(atoVar.f(f)), 2)));
        }
        if (i != 1) {
            defpackage.btt bttVar = (defpackage.btt) this.a;
            float fS = aooc.s((java.lang.Float.isNaN(bttVar.a()) ? 0.0f : bttVar.a()) + f, bttVar.d.p().b(), bttVar.d.p().a());
            float fA = fS - bttVar.a();
            ((defpackage.apx) this.b).a(fS, 0.0f);
            return fA;
        }
        defpackage.apt aptVar = (defpackage.apt) this.b;
        float fD = aptVar.a.d(f);
        float fC = fD - aptVar.a.c();
        ((defpackage.apx) this.a).a(fD, 0.0f);
        return fC;
    }

    public atk(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }
}
