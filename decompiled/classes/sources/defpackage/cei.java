package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class cei extends defpackage.cls implements defpackage.clb, defpackage.ccp, defpackage.cer {
    private defpackage.ceh a;

    public cei(int i) {
        defpackage.cko ckoVarB = defpackage.ckw.b();
        defpackage.ceh cehVar = new defpackage.ceh(ckoVarB.v(), i);
        if (!(ckoVarB instanceof defpackage.ckf)) {
            cehVar.h = new defpackage.ceh(1L, i);
        }
        this.a = cehVar;
    }

    @Override // defpackage.ccp, defpackage.cer
    public final /* synthetic */ java.lang.Object a() {
        return java.lang.Integer.valueOf(c());
    }

    @Override // defpackage.ccp
    public final /* synthetic */ void b(java.lang.Object obj) {
        h(((java.lang.Number) obj).intValue());
    }

    public final int c() {
        return ((defpackage.ceh) defpackage.ckw.i(this.a, this)).a;
    }

    @Override // defpackage.clr
    public final defpackage.clt d() {
        return this.a;
    }

    @Override // defpackage.clr
    public final void e(defpackage.clt cltVar) {
        if (cltVar == null) {
            defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        }
        this.a = (defpackage.ceh) cltVar;
    }

    @Override // defpackage.clb
    public final defpackage.cen f() {
        return defpackage.cdu.c;
    }

    @Override // defpackage.cls, defpackage.clr
    public final defpackage.clt g(defpackage.clt cltVar, defpackage.clt cltVar2, defpackage.clt cltVar3) {
        if (((defpackage.ceh) cltVar2).a != ((defpackage.ceh) cltVar3).a) {
            return null;
        }
        return cltVar2;
    }

    public final void h(int i) {
        defpackage.cko ckoVarB;
        defpackage.ceh cehVar = (defpackage.ceh) defpackage.ckw.f(this.a, this);
        if (cehVar.a != i) {
            defpackage.ceh cehVar2 = this.a;
            synchronized (defpackage.ckw.b) {
                ckoVarB = defpackage.ckw.b();
                ((defpackage.ceh) defpackage.ckw.h(cehVar2, this, ckoVarB, cehVar)).a = i;
            }
            defpackage.ckw.r(ckoVarB, this);
        }
    }

    public final java.lang.String toString() {
        return "MutableIntState(value=" + ((defpackage.ceh) defpackage.ckw.f(this.a, this)).a + ")@" + hashCode();
    }
}
