package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class ah extends defpackage.ab {
    public final java.lang.Object b;
    public final boolean c;
    public final java.lang.Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code duplicated, block: B:14:0x0032  */
    public ah(cj cjVar, boolean z, boolean z2) {
        java.lang.Object objW;
        at atVar;
        java.lang.Object obj;
        super(cjVar);
        aooh.f(cjVar, "operation");
        boolean z3 = false;
        java.lang.Object obj2 = null;
        if (cjVar.h == 2) {
            if (z) {
                aw awVar = cjVar.a;
                at atVar2 = awVar.T;
                if (atVar2 != null) {
                    objW = atVar2.l;
                    if (objW == aw.f) {
                        objW = awVar.W();
                    }
                } else {
                    objW = null;
                }
                z3 = true;
            } else {
                objW = cjVar.a.V();
            }
        } else if (z) {
            aw awVar2 = cjVar.a;
            at atVar3 = awVar2.T;
            if (atVar3 == null) {
                objW = null;
            } else {
                objW = atVar3.j;
                if (objW == aw.f) {
                    objW = awVar2.V();
                }
            }
            z3 = true;
        } else {
            objW = cjVar.a.W();
        }
        this.b = objW;
        if (cjVar.h == 2) {
            at atVar4 = cjVar.a.T;
        }
        this.c = true;
        if (z2) {
            aw awVar3 = cjVar.a;
            if (z3 && (atVar = awVar3.T) != null && (obj = atVar.m) != aw.f) {
                obj2 = obj;
            }
        }
        this.d = obj2;
    }

    private final defpackage.ce d(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        defpackage.ce ceVar = defpackage.bx.a;
        defpackage.ce ceVar2 = defpackage.bx.a;
        if ((obj instanceof android.transition.Transition) || ((ceVar2 = defpackage.bx.b) != null && ceVar2.l(obj))) {
            return ceVar2;
        }
        throw new java.lang.IllegalArgumentException("Transition " + obj + " for fragment " + this.a.a + " is not a valid framework Transition or AndroidX Transition");
    }

    public final defpackage.ce a() {
        java.lang.Object obj = this.d;
        java.lang.Object obj2 = this.b;
        defpackage.ce ceVarD = d(obj2);
        defpackage.ce ceVarD2 = d(obj);
        if (ceVarD == null || ceVarD2 == null || ceVarD == ceVarD2) {
            return ceVarD == null ? ceVarD2 : ceVarD;
        }
        throw new java.lang.IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + this.a.a + " returned Transition " + obj2 + " which uses a different Transition  type than its shared element transition " + obj);
    }

    public final boolean c() {
        return this.d != null;
    }
}
