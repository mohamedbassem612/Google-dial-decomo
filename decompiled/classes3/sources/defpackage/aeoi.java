package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class aeoi implements defpackage.aeob {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    public aeoi(aeog aeogVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(aeogVar);
        this.a = aeogVar;
    }

    @Override // defpackage.aeob
    public final boolean a(akzx akzxVar) {
        if (this.$cid != 0) {
            return false;
        }
        akzx akzxVarM = defpackage.aeny.a.m();
        aeoj aeojVar = (aeoj) this.a;
        aoin aoinVar = aeojVar.a;
        if (aoinVar.a() != null) {
            java.lang.String str = (java.lang.String) aoinVar.a();
            akzxVarM.u();
            defpackage.aeny aenyVar = (defpackage.aeny) akzxVarM.b;
            j$.util.Objects.requireNonNull(str);
            aenyVar.b |= 1;
            aenyVar.c = str;
        }
        aoin aoinVar2 = aeojVar.b;
        if (((java.lang.Integer) aoinVar2.a()).intValue() > 0) {
            int iIntValue = ((java.lang.Integer) aoinVar2.a()).intValue();
            akzxVarM.u();
            defpackage.aeny aenyVar2 = (defpackage.aeny) akzxVarM.b;
            aenyVar2.b |= 2;
            aenyVar2.d = iIntValue;
        }
        aoin aoinVar3 = aeojVar.c;
        if (((java.lang.Integer) aoinVar3.a()).intValue() > 0) {
            int iIntValue2 = ((java.lang.Integer) aoinVar3.a()).intValue();
            akzxVarM.u();
            defpackage.aeny aenyVar3 = (defpackage.aeny) akzxVarM.b;
            aenyVar3.b |= 4;
            aenyVar3.e = iIntValue2;
        }
        int i = android.os.Build.VERSION.SDK_INT;
        akzxVarM.u();
        defpackage.aeny aenyVar4 = (defpackage.aeny) akzxVarM.b;
        aenyVar4.b |= 8;
        aenyVar4.f = i;
        akzx akzxVarM2 = defpackage.aenv.a.m();
        akzxVarM2.u();
        defpackage.aenv aenvVar = (defpackage.aenv) akzxVarM2.b;
        defpackage.aeny aenyVar5 = (defpackage.aeny) akzxVarM.p();
        j$.util.Objects.requireNonNull(aenyVar5);
        aenvVar.c = aenyVar5;
        aenvVar.b = 4;
        defpackage.aenv aenvVar2 = (defpackage.aenv) akzxVarM2.p();
        akzxVar.u();
        defpackage.aenz aenzVar = (defpackage.aenz) akzxVar.b;
        defpackage.aenz aenzVar2 = defpackage.aenz.a;
        j$.util.Objects.requireNonNull(aenvVar2);
        aenzVar.b();
        aenzVar.e.add(aenvVar2);
        return true;
    }

    public aeoi(aeoj aeojVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(aeojVar);
        this.a = aeojVar;
    }
}
