package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wdc extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;

    public wdc(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3) {
        super(amyzVar2, new defpackage.amzw(defpackage.wdc.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
    }

    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        j$.util.Optional optionalOfNullable = (j$.util.Optional) list.get(0);
        boolean zBooleanValue = ((java.lang.Boolean) list.get(1)).booleanValue();
        j$.util.Optional optional = (j$.util.Optional) list.get(2);
        if (!zBooleanValue && !optional.isPresent()) {
            return aiql.z(j$.util.Optional.empty());
        }
        idg idgVar = new idg(zBooleanValue, optional, 2);
        if (true == optionalOfNullable.isPresent()) {
            java.lang.Object obj2 = optionalOfNullable.get();
            boolean z = idgVar.a;
            java.lang.Object obj3 = idgVar.b;
            java.lang.String str = (java.lang.String) obj2;
            akzx akzxVarM = defpackage.zue.a.m();
            akzxVarM.u();
            defpackage.zue zueVar = (defpackage.zue) akzxVarM.b;
            j$.util.Objects.requireNonNull(str);
            zueVar.b |= 4;
            zueVar.e = str;
            akzxVarM.u();
            defpackage.zue zueVar2 = (defpackage.zue) akzxVarM.b;
            zueVar2.b |= 1;
            zueVar2.c = z;
            defpackage.vxc vxcVar = new defpackage.vxc(akzxVarM, 11);
            j$.util.Optional optional2 = (j$.util.Optional) obj3;
            if (true == optional2.isPresent()) {
                java.lang.Object obj4 = optional2.get();
                java.lang.Object obj5 = vxcVar.a;
                java.lang.String str2 = (java.lang.String) obj4;
                akzx akzxVarM2 = defpackage.zud.a.m();
                akzxVarM2.u();
                defpackage.zud zudVar = (defpackage.zud) akzxVarM2.b;
                j$.util.Objects.requireNonNull(str2);
                zudVar.b |= 1;
                zudVar.c = str2;
                defpackage.zud zudVar2 = (defpackage.zud) akzxVarM2.p();
                akzx akzxVar = (akzx) obj5;
                akzxVar.u();
                defpackage.zue zueVar3 = (defpackage.zue) akzxVar.b;
                j$.util.Objects.requireNonNull(zudVar2);
                zueVar3.d = zudVar2;
                zueVar3.b |= 2;
            }
            optionalOfNullable = j$.util.Optional.ofNullable(aiql.z(j$.util.Optional.of((defpackage.zue) akzxVarM.p())));
        }
        return (ajcq) (true != optionalOfNullable.isPresent() ? aiql.z(j$.util.Optional.empty()) : optionalOfNullable.get());
    }

    protected final ajcq c() {
        amzg amzgVar = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar.d()});
    }
}
