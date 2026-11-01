package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class mib implements ahas {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ mib(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r3v14, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v32, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v34, types: [aoin, java.lang.Object] */
    public final ajcq a(ahau ahauVar) {
        int i = this.$cid;
        if (i == 0) {
            aify aifyVar = ahauVar.a;
            ahap ahapVar = ahap.a;
            if (!aifyVar.contains(ahapVar)) {
                return aiql.z(ahas.d);
            }
            java.lang.Object obj = this.a;
            ahaq ahaqVarA = ahar.a();
            ahaqVarA.b(false);
            ahaqVarA.a = ahapVar;
            ahaqVarA.c(akzc.w(java.lang.Integer.toString(((android.content.Context) obj).getResources().getConfiguration().densityDpi)));
            return aiql.z(ahaqVarA.a());
        }
        if (i == 1) {
            aify aifyVar2 = ahauVar.a;
            ahap ahapVar2 = ahap.a;
            if (!aifyVar2.contains(ahapVar2) || !((java.lang.Boolean) this.a.a()).booleanValue()) {
                return aiql.z(ahas.d);
            }
            ahaq ahaqVarA2 = ahar.a();
            ahaqVarA2.b(false);
            ahaqVarA2.a = ahapVar2;
            ahaqVarA2.c(akzc.v("1745408075", java.nio.charset.StandardCharsets.UTF_8));
            return aiql.z(ahaqVarA2.a());
        }
        if (i != 2) {
            if (i == 3) {
                return sns.i((aoin) this.a, ahauVar);
            }
            ?? r3 = this.a;
            return i != 4 ? sns.i((aoin) r3, ahauVar) : sns.i((aoin) r3, ahauVar);
        }
        aify aifyVar3 = ahauVar.a;
        ahap ahapVar3 = ahap.a;
        if (!aifyVar3.contains(ahapVar3)) {
            return aiql.z(ahas.d);
        }
        java.lang.Object obj2 = this.a;
        ahaq ahaqVarA3 = ahar.a();
        ahaqVarA3.b(false);
        ahaqVarA3.a = ahapVar3;
        ahaqVarA3.c(akzc.w(java.lang.Float.toString(((android.content.Context) obj2).getResources().getConfiguration().fontScale)));
        return aiql.z(ahaqVarA3.a());
    }
}
