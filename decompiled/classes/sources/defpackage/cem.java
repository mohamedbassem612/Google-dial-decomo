package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class cem extends defpackage.cls implements defpackage.clb {
    public final defpackage.cen a;
    private defpackage.cel b;

    public cem(java.lang.Object obj, defpackage.cen cenVar) {
        this.a = cenVar;
        defpackage.cko ckoVarB = defpackage.ckw.b();
        defpackage.cel celVar = new defpackage.cel(ckoVarB.v(), obj);
        if (!(ckoVarB instanceof defpackage.ckf)) {
            celVar.h = new defpackage.cel(1L, obj);
        }
        this.b = celVar;
    }

    @Override // defpackage.ccp, defpackage.cer
    public final java.lang.Object a() {
        return ((defpackage.cel) defpackage.ckw.i(this.b, this)).a;
    }

    @Override // defpackage.ccp
    public final void b(java.lang.Object obj) {
        defpackage.cko ckoVarB;
        defpackage.cel celVar = (defpackage.cel) defpackage.ckw.f(this.b, this);
        if (this.a.a(celVar.a, obj)) {
            return;
        }
        defpackage.cel celVar2 = this.b;
        synchronized (defpackage.ckw.b) {
            ckoVarB = defpackage.ckw.b();
            ((defpackage.cel) defpackage.ckw.h(celVar2, this, ckoVarB, celVar)).a = obj;
        }
        defpackage.ckw.r(ckoVarB, this);
    }

    @Override // defpackage.clr
    public final defpackage.clt d() {
        return this.b;
    }

    @Override // defpackage.clr
    public final void e(defpackage.clt cltVar) {
        if (cltVar == null) {
            defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        }
        this.b = (defpackage.cel) cltVar;
    }

    @Override // defpackage.clb
    public final defpackage.cen f() {
        return this.a;
    }

    @Override // defpackage.cls, defpackage.clr
    public final defpackage.clt g(defpackage.clt cltVar, defpackage.clt cltVar2, defpackage.clt cltVar3) {
        java.lang.Object obj = ((defpackage.cel) cltVar2).a;
        java.lang.Object obj2 = ((defpackage.cel) cltVar3).a;
        defpackage.cen cenVar = this.a;
        if (cenVar.a(obj, obj2)) {
            return cltVar2;
        }
        cenVar.b();
        return null;
    }

    public final java.lang.String toString() {
        return "MutableState(value=" + ((defpackage.cel) defpackage.ckw.f(this.b, this)).a + ")@" + hashCode();
    }
}
