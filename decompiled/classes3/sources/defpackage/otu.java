package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class otu implements defpackage.ahas {
    private final /* synthetic */ int $cid;

    public otu(int i) {
        this.$cid = i;
    }

    @Override // defpackage.ahas
    public final ajcq a(defpackage.ahau ahauVar) {
        int i = this.$cid;
        if (i == 0) {
            aify aifyVar = ahauVar.a;
            defpackage.ahap ahapVar = defpackage.ahap.a;
            if (!aifyVar.contains(ahapVar)) {
                return aiql.z(d);
            }
            defpackage.ahaq ahaqVarA = defpackage.ahar.a();
            ahaqVarA.b(false);
            ahaqVarA.a = ahapVar;
            ahaqVarA.c(akzc.v("true", java.nio.charset.StandardCharsets.UTF_8));
            return aiql.z(ahaqVarA.a());
        }
        if (i != 1) {
            aify aifyVar2 = ahauVar.a;
            defpackage.ahap ahapVar2 = defpackage.ahap.a;
            if (!aifyVar2.contains(ahapVar2)) {
                return aiql.z(d);
            }
            defpackage.ahaq ahaqVarA2 = defpackage.ahar.a();
            ahaqVarA2.b(false);
            ahaqVarA2.a = ahapVar2;
            ahaqVarA2.c(akzc.v("true", java.nio.charset.StandardCharsets.UTF_8));
            return aiql.z(ahaqVarA2.a());
        }
        aify aifyVar3 = ahauVar.a;
        defpackage.ahap ahapVar3 = defpackage.ahap.a;
        if (!aifyVar3.contains(ahapVar3)) {
            return aiql.z(defpackage.ahas.d);
        }
        defpackage.ahaq ahaqVarA3 = defpackage.ahar.a();
        ahaqVarA3.b(false);
        ahaqVarA3.a = ahapVar3;
        ahaqVarA3.c(akzc.w(java.lang.Integer.toString(aa$.ExternalSyntheticApiModelOutline1.m())));
        return aiql.z(ahaqVarA3.a());
    }
}
