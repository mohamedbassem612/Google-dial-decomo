package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class ucf implements defpackage.quq {
    final /* synthetic */ android.content.Context a;
    final /* synthetic */ aoin b;
    final /* synthetic */ aoin c;

    public ucf(android.content.Context context, aoin aoinVar, aoin aoinVar2) {
        this.a = context;
        this.b = aoinVar;
        this.c = aoinVar2;
    }

    @Override // defpackage.quq
    public final aw a() {
        akzx akzxVarM = defpackage.ubz.a.m();
        android.content.Context context = this.a;
        java.lang.String string = context.getString(2132020204);
        akzxVarM.u();
        defpackage.ubz ubzVar = (defpackage.ubz) akzxVarM.b;
        j$.util.Objects.requireNonNull(string);
        ubzVar.b |= 1;
        ubzVar.c = string;
        java.lang.String string2 = context.getString(2132020198);
        akzxVarM.u();
        defpackage.ubz ubzVar2 = (defpackage.ubz) akzxVarM.b;
        j$.util.Objects.requireNonNull(string2);
        ubzVar2.b |= 2;
        ubzVar2.d = string2;
        java.lang.String string3 = context.getString(2132020197);
        akzxVarM.u();
        defpackage.ubz ubzVar3 = (defpackage.ubz) akzxVarM.b;
        j$.util.Objects.requireNonNull(string3);
        ubzVar3.b |= 4;
        ubzVar3.e = string3;
        defpackage.ubz ubzVar4 = (defpackage.ubz) akzxVarM.p();
        defpackage.uby ubyVar = new defpackage.uby();
        amxr.g(ubyVar);
        ahgl.b(ubyVar, ubzVar4);
        return ubyVar;
    }

    @Override // defpackage.quq
    public final defpackage.qun b() {
        akzx akzxVarM = defpackage.qun.a.m();
        akzx akzxVarM2 = defpackage.qul.a.m();
        akzxVarM2.u();
        defpackage.qul qulVar = (defpackage.qul) akzxVarM2.b;
        j$.util.Objects.requireNonNull("sonic");
        qulVar.b |= 1;
        qulVar.c = "sonic";
        long jLongValue = ((java.lang.Long) this.b.a()).longValue();
        akzxVarM2.u();
        defpackage.qul qulVar2 = (defpackage.qul) akzxVarM2.b;
        qulVar2.b |= 2;
        qulVar2.d = jLongValue;
        long jLongValue2 = ((java.lang.Long) this.c.a()).longValue();
        akzxVarM2.u();
        defpackage.qul qulVar3 = (defpackage.qul) akzxVarM2.b;
        qulVar3.b |= 4;
        qulVar3.e = jLongValue2;
        qbc qbcVar = qbc.hx;
        akzxVarM2.u();
        defpackage.qul qulVar4 = (defpackage.qul) akzxVarM2.b;
        qulVar4.f = qbcVar.pk;
        qulVar4.b |= 8;
        defpackage.qul qulVar5 = (defpackage.qul) akzxVarM2.p();
        akzxVarM.u();
        defpackage.qun qunVar = (defpackage.qun) akzxVarM.b;
        j$.util.Objects.requireNonNull(qulVar5);
        qunVar.c = qulVar5;
        qunVar.b = 3;
        return (defpackage.qun) akzxVarM.p();
    }

    @Override // defpackage.quq
    public final defpackage.qup c() {
        return defpackage.qup.a;
    }

    @Override // defpackage.quq
    public final /* synthetic */ boolean d() {
        return true;
    }
}
