package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class ide implements java.util.function.Function {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ ide(android.telecom.PhoneAccountHandle phoneAccountHandle, veo veoVar, vjb vjbVar, int i) {
        this.$cid = i;
        this.a = phoneAccountHandle;
        this.c = veoVar;
        this.b = vjbVar;
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
        int i = this.$cid;
        if (i != 0) {
            return i != 1 ? j$.util.function.Function.-CC.$default$andThen(this, function) : j$.util.function.Function.-CC.$default$andThen(this, function);
        }
        return j$.util.function.Function.-CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object obj) {
        defpackage.hxf hxfVarB;
        int i = this.$cid;
        if (i == 0) {
            java.lang.Object obj2 = this.a;
            defpackage.idh idhVar = (defpackage.idh) obj2;
            idhVar.e.a(qbc.hs);
            java.lang.String str = (java.lang.String) this.b;
            hxfVarB = ((defpackage.iax) obj).b(str);
            idhVar.i(hxfVarB, (j$.util.Optional) this.c, ruc.bG);
            idhVar.k(str);
        } else {
            if (i != 1) {
                aimz aimzVar = vfo.a;
                java.lang.Object obj3 = this.b;
                return ((vjc) obj).b((android.telecom.PhoneAccountHandle) this.a, (veo) this.c, (vjb) obj3);
            }
            java.lang.Object obj4 = this.a;
            defpackage.idh idhVar2 = (defpackage.idh) obj4;
            idhVar2.e.a(qbc.hs);
            java.lang.String str2 = (java.lang.String) this.b;
            hxfVarB = ((defpackage.iax) obj).a(str2);
            idhVar2.i(hxfVarB, (j$.util.Optional) this.c, ruc.bF);
            idhVar2.k(str2);
        }
        return hxfVarB;
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
        int i = this.$cid;
        if (i != 0) {
            return i != 1 ? j$.util.function.Function.-CC.$default$compose(this, function) : j$.util.function.Function.-CC.$default$compose(this, function);
        }
        return j$.util.function.Function.-CC.$default$compose(this, function);
    }

    public /* synthetic */ ide(defpackage.idh idhVar, java.lang.String str, j$.util.Optional optional, int i) {
        this.$cid = i;
        this.a = idhVar;
        this.b = str;
        this.c = optional;
    }
}
