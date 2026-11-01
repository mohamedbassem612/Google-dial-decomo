package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class idg implements java.util.function.Function {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ boolean a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ idg(defpackage.idh idhVar, boolean z, int i) {
        this.$cid = i;
        this.b = idhVar;
        this.a = z;
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
        int i = this.$cid;
        if (i == 0) {
            ((defpackage.idh) this.b).e.a(qbc.hs);
            return ((defpackage.iax) obj).h(this.a);
        }
        if (i == 1) {
            ((defpackage.idh) this.b).e.a(qbc.hs);
            return ((defpackage.iax) obj).g(this.a);
        }
        java.lang.String str = (java.lang.String) obj;
        akzx akzxVarM = zue.a.m();
        akzxVarM.u();
        zue zueVar = akzxVarM.b;
        j$.util.Objects.requireNonNull(str);
        zueVar.b |= 4;
        zueVar.e = str;
        akzxVarM.u();
        zue zueVar2 = akzxVarM.b;
        zueVar2.b |= 1;
        zueVar2.c = this.a;
        vxc vxcVar = new vxc(akzxVarM, 11);
        j$.util.Optional optional = (j$.util.Optional) this.b;
        if (true == optional.isPresent()) {
            java.lang.Object obj2 = optional.get();
            java.lang.Object obj3 = vxcVar.a;
            java.lang.String str2 = (java.lang.String) obj2;
            akzx akzxVarM2 = zud.a.m();
            akzxVarM2.u();
            zud zudVar = akzxVarM2.b;
            j$.util.Objects.requireNonNull(str2);
            zudVar.b |= 1;
            zudVar.c = str2;
            zud zudVarP = akzxVarM2.p();
            akzx akzxVar = (akzx) obj3;
            akzxVar.u();
            zue zueVar3 = akzxVar.b;
            j$.util.Objects.requireNonNull(zudVarP);
            zueVar3.d = zudVarP;
            zueVar3.b |= 2;
        }
        return aiql.z(j$.util.Optional.of(akzxVarM.p()));
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
        int i = this.$cid;
        if (i != 0) {
            return i != 1 ? j$.util.function.Function.-CC.$default$compose(this, function) : j$.util.function.Function.-CC.$default$compose(this, function);
        }
        return j$.util.function.Function.-CC.$default$compose(this, function);
    }

    public /* synthetic */ idg(boolean z, j$.util.Optional optional, int i) {
        this.$cid = i;
        this.a = z;
        this.b = optional;
    }
}
