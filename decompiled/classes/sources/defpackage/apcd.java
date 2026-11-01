package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class apcd {
    private final defpackage.aorq a;
    public final defpackage.aorq e;
    public final defpackage.aorq f;

    public apcd() {
        defpackage.aorr aorrVar = defpackage.aorr.a;
        this.e = new defpackage.aorq(this, aorrVar);
        this.f = new defpackage.aorq(this, aorrVar);
        this.a = new defpackage.aorq(null, aorrVar);
    }

    private final defpackage.apcd a() {
        defpackage.apcd apcdVar;
        java.lang.Object obj;
        while (true) {
            defpackage.aorq aorqVar = this.f;
            defpackage.apcd apcdVar2 = (defpackage.apcd) aorqVar.a;
            apcdVar = apcdVar2;
            while (true) {
                defpackage.apcd apcdVar3 = null;
                while (true) {
                    obj = apcdVar.e.a;
                    if (obj == this) {
                        if (apcdVar2 != apcdVar && !aorqVar.d(apcdVar2, apcdVar)) {
                            break;
                        }
                        break;
                    }
                    if (fC()) {
                        return null;
                    }
                    if (!(obj instanceof defpackage.apch)) {
                        if (obj == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                        }
                        apcdVar3 = apcdVar;
                        apcdVar = (defpackage.apcd) obj;
                    } else {
                        if (apcdVar3 != null) {
                            break;
                        }
                        apcdVar = (defpackage.apcd) apcdVar.f.a;
                    }
                }
                if (!apcdVar3.e.d(apcdVar, ((defpackage.apch) obj).a)) {
                    break;
                }
                apcdVar = apcdVar3;
            }
        }
        return apcdVar;
    }

    public final java.lang.Object f() {
        return this.e.a;
    }

    public boolean fC() {
        return f() instanceof defpackage.apch;
    }

    public final defpackage.apcd g() {
        java.lang.Object objF = f();
        defpackage.apch apchVar = objF instanceof defpackage.apch ? (defpackage.apch) objF : null;
        if (apchVar != null) {
            return apchVar.a;
        }
        if (objF == null) {
            defpackage.aooh.h("null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        }
        return (defpackage.apcd) objF;
    }

    public final defpackage.apcd h() {
        defpackage.apcd apcdVarA = a();
        if (apcdVarA == null) {
            apcdVarA = (defpackage.apcd) this.f.a;
            while (apcdVarA.fC()) {
                apcdVarA = (defpackage.apcd) apcdVarA.f.a;
            }
        }
        return apcdVarA;
    }

    public final defpackage.apch i() {
        defpackage.aorq aorqVar = this.a;
        defpackage.apch apchVar = (defpackage.apch) aorqVar.a;
        if (apchVar != null) {
            return apchVar;
        }
        defpackage.apch apchVar2 = new defpackage.apch(this);
        aorqVar.b(apchVar2);
        return apchVar2;
    }

    public final void j(int i) {
        l(new defpackage.apca(i), i);
    }

    public final void k(defpackage.apcd apcdVar) {
        defpackage.aorq aorqVar;
        defpackage.apcd apcdVar2;
        do {
            aorqVar = apcdVar.f;
            apcdVar2 = (defpackage.apcd) aorqVar.a;
            if (f() != apcdVar) {
                return;
            }
        } while (!aorqVar.d(apcdVar2, this));
        if (fC()) {
            apcdVar.a();
        }
    }

    public final boolean l(defpackage.apcd apcdVar, int i) {
        defpackage.apcd apcdVarH;
        do {
            apcdVarH = h();
            if (apcdVarH instanceof defpackage.apca) {
                return (((defpackage.apca) apcdVarH).a & i) == 0 && apcdVarH.l(apcdVar, i);
            }
            apcdVar.f.b(apcdVarH);
            apcdVar.e.b(this);
        } while (!apcdVarH.e.d(this, apcdVar));
        apcdVar.k(this);
        return true;
    }

    public final void m() {
        java.lang.Object objF;
        defpackage.apcd apcdVar;
        do {
            objF = f();
            if (objF instanceof defpackage.apch) {
                defpackage.apcd apcdVar2 = ((defpackage.apch) objF).a;
                return;
            } else {
                if (objF == this) {
                    return;
                }
                if (objF == null) {
                    defpackage.aooh.h("null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                }
                apcdVar = (defpackage.apcd) objF;
            }
        } while (!this.e.d(objF, apcdVar.i()));
        apcdVar.a();
    }

    public java.lang.String toString() {
        return new apcc(this) + '@' + defpackage.aosv.b(this);
    }
}
