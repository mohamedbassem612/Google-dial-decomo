package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class cek extends defpackage.cls implements defpackage.clb, defpackage.ccp, defpackage.cer {
    private defpackage.cej a;

    public cek(long j) {
        defpackage.cko ckoVarB = defpackage.ckw.b();
        defpackage.cej cejVar = new defpackage.cej(ckoVarB.v(), j);
        if (!(ckoVarB instanceof defpackage.ckf)) {
            cejVar.h = new defpackage.cej(1L, j);
        }
        this.a = cejVar;
    }

    @Override // defpackage.ccp, defpackage.cer
    public final /* synthetic */ java.lang.Object a() {
        return java.lang.Long.valueOf(c());
    }

    @Override // defpackage.ccp
    public final /* synthetic */ void b(java.lang.Object obj) {
        h(((java.lang.Number) obj).longValue());
    }

    public final long c() {
        return ((defpackage.cej) defpackage.ckw.i(this.a, this)).a;
    }

    @Override // defpackage.clr
    public final defpackage.clt d() {
        return this.a;
    }

    @Override // defpackage.clr
    public final void e(defpackage.clt cltVar) {
        if (cltVar == null) {
            defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        }
        this.a = (defpackage.cej) cltVar;
    }

    @Override // defpackage.clb
    public final defpackage.cen f() {
        return defpackage.cdu.c;
    }

    @Override // defpackage.cls, defpackage.clr
    public final defpackage.clt g(defpackage.clt cltVar, defpackage.clt cltVar2, defpackage.clt cltVar3) {
        if (((defpackage.cej) cltVar2).a != ((defpackage.cej) cltVar3).a) {
            return null;
        }
        return cltVar2;
    }

    public final void h(long j) {
        defpackage.cko ckoVarB;
        defpackage.cej cejVar = (defpackage.cej) defpackage.ckw.f(this.a, this);
        if (cejVar.a != j) {
            defpackage.cej cejVar2 = this.a;
            synchronized (defpackage.ckw.b) {
                ckoVarB = defpackage.ckw.b();
                ((defpackage.cej) defpackage.ckw.h(cejVar2, this, ckoVarB, cejVar)).a = j;
            }
            defpackage.ckw.r(ckoVarB, this);
        }
    }

    public final java.lang.String toString() {
        return "MutableLongState(value=" + ((defpackage.cej) defpackage.ckw.f(this.a, this)).a + ")@" + hashCode();
    }
}
