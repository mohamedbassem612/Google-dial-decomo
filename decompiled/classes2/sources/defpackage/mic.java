package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mic implements ahas {
    private final /* synthetic */ int $cid;
    private final java.lang.Object a;

    public mic(android.content.Context context, int i) {
        this.$cid = i;
        this.a = context;
    }

    public final ajcq a(ahau ahauVar) {
        ahar aharVarA;
        int i = this.$cid;
        if (i == 0) {
            aify aifyVar = ahauVar.a;
            ahap ahapVar = ahap.a;
            if (!aifyVar.contains(ahapVar)) {
                return aiql.z(d);
            }
            android.content.Context context = (android.content.Context) this.a;
            int i2 = context.getApplicationInfo().flags & 1;
            int i3 = context.getApplicationInfo().flags & 128;
            ahaq ahaqVarA = ahar.a();
            ahaqVarA.b(false);
            ahaqVarA.a = ahapVar;
            ahaqVarA.c(akzc.v(java.lang.Boolean.toString(i2 == 0 && i3 == 0), java.nio.charset.StandardCharsets.UTF_8));
            return aiql.z(ahaqVarA.a());
        }
        if (i != 1) {
            aify aifyVar2 = ahauVar.a;
            ahap ahapVar2 = ahap.a;
            if (aifyVar2.contains(ahapVar2)) {
                ahaq ahaqVarA2 = ahar.a();
                ahaqVarA2.b(false);
                ahaqVarA2.a = ahapVar2;
                ahaqVarA2.c(akzc.v(java.lang.Boolean.toString(((swq) this.a).a()), java.nio.charset.StandardCharsets.UTF_8));
                aharVarA = ahaqVarA2.a();
            } else {
                aharVarA = d;
            }
            return aiql.z(aharVarA);
        }
        aify aifyVar3 = ahauVar.a;
        ahap ahapVar3 = ahap.a;
        if (!aifyVar3.contains(ahapVar3)) {
            return aiql.z(d);
        }
        j$.util.Optional optionalG = ((zjm) this.a).g();
        boolean z = optionalG.isPresent() && ((kva) optionalG.orElseThrow()).a();
        ahaq ahaqVarA3 = ahar.a();
        ahaqVarA3.b(false);
        ahaqVarA3.a = ahapVar3;
        ahaqVarA3.c(akzc.v(java.lang.Boolean.toString(z), java.nio.charset.StandardCharsets.UTF_8));
        return aiql.z(ahaqVarA3.a());
    }

    public mic(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }
}
