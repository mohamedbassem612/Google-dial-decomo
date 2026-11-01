package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final /* synthetic */ class amds implements java.util.function.Function {
    public final /* synthetic */ j$.util.Optional a;
    public final /* synthetic */ int b;
    public final /* synthetic */ defpackage.amcp c;

    public /* synthetic */ amds(j$.util.Optional optional, int i, defpackage.amcp amcpVar) {
        this.a = optional;
        this.b = i;
        this.c = amcpVar;
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
        return j$.util.function.Function.-CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object obj) {
        defpackage.amet ametVar = (defpackage.amet) obj;
        defpackage.altp altpVar = ametVar.b;
        int i = defpackage.amdu.a;
        j$.util.Optional optional = this.a;
        defpackage.altp altpVar2 = ((defpackage.amet) optional.get()).b;
        int i2 = altpVar.a;
        int i3 = altpVar2.b;
        ahvr.bT(i2 <= i3, "Start: %s must be less than end: %s", i2, i3);
        alto altoVar = new alto();
        altoVar.c(i2);
        altoVar.b(i3);
        defpackage.altp altpVarA = altoVar.a();
        akzx akzxVarM = defpackage.amgc.a.m();
        java.lang.String str = ((defpackage.amet) optional.get()).a;
        akzxVarM.u();
        defpackage.amgc amgcVar = (defpackage.amgc) akzxVarM.b;
        j$.util.Objects.requireNonNull(str);
        amgcVar.b |= 1;
        amgcVar.c = str;
        java.lang.String str2 = ametVar.a;
        akzxVarM.u();
        defpackage.amgc amgcVar2 = (defpackage.amgc) akzxVarM.b;
        j$.util.Objects.requireNonNull(str2);
        amgcVar2.b |= 4;
        amgcVar2.d = str2;
        akzx akzxVarM2 = defpackage.amgb.a.m();
        int i4 = altpVarA.a;
        akzxVarM2.u();
        defpackage.amgb amgbVar = (defpackage.amgb) akzxVarM2.b;
        amgbVar.b |= 1;
        int i5 = this.b;
        amgbVar.c = i4 + i5;
        int i6 = altpVarA.b;
        akzxVarM2.u();
        defpackage.amgb amgbVar2 = (defpackage.amgb) akzxVarM2.b;
        amgbVar2.b |= 2;
        amgbVar2.d = i5 + i6;
        akzxVarM.u();
        defpackage.amgc amgcVar3 = (defpackage.amgc) akzxVarM.b;
        defpackage.amgb amgbVar3 = (defpackage.amgb) akzxVarM2.p();
        j$.util.Objects.requireNonNull(amgbVar3);
        amgcVar3.f = amgbVar3;
        amgcVar3.b |= 16;
        akzx akzxVarM3 = defpackage.amfy.a.m();
        defpackage.amcp amcpVar = this.c;
        java.lang.String strTrim = amcpVar.b.substring(i4, i6).trim();
        akzxVarM3.u();
        defpackage.amfy amfyVar = (defpackage.amfy) akzxVarM3.b;
        j$.util.Objects.requireNonNull(strTrim);
        amfyVar.b |= 1;
        amfyVar.c = strTrim;
        alto altoVar2 = new alto();
        altoVar2.c(i4);
        altoVar2.b(i6);
        akzxVarM3.bd(amcpVar.b(altoVar2.a()));
        akzxVarM.u();
        defpackage.amgc amgcVar4 = (defpackage.amgc) akzxVarM.b;
        defpackage.amfy amfyVar2 = (defpackage.amfy) akzxVarM3.p();
        j$.util.Objects.requireNonNull(amfyVar2);
        amgcVar4.e = amfyVar2;
        amgcVar4.b |= 8;
        return (defpackage.amgc) akzxVarM.p();
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
        return j$.util.function.Function.-CC.$default$compose(this, function);
    }
}
