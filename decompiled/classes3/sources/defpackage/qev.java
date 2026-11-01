package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qev extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;
    private final amzg f;
    private final amzg g;
    private final amzg h;

    public qev(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amzg amzgVar5, amzg amzgVar6, amzg amzgVar7) {
        super(amyzVar2, new defpackage.amzw(defpackage.qev.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
        this.f = amzs.b(amzgVar5);
        this.g = amzs.b(amzgVar6);
        this.h = amzs.b(amzgVar7);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x005f A[Catch: all -> 0x006b, TRY_LEAVE, TryCatch #1 {all -> 0x006b, blocks: (B:5:0x0046, B:8:0x004c, B:9:0x005f), top: B:20:0x0046 }] */
    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        ajcq ajcqVarZ;
        java.util.List list = (java.util.List) obj;
        android.content.Context context = (android.content.Context) list.get(0);
        boolean zBooleanValue = ((java.lang.Boolean) list.get(1)).booleanValue();
        boolean zBooleanValue2 = ((java.lang.Boolean) list.get(2)).booleanValue();
        boolean zBooleanValue3 = ((java.lang.Boolean) list.get(3)).booleanValue();
        defpackage.zpo zpoVar = (defpackage.zpo) list.get(4);
        ajct ajctVar = (ajct) list.get(5);
        ahoq ahoqVarW = ahvr.W(597, "AnswerAsRttProducerModule_produceAnswerAsRttActionButton");
        amzg amzgVar = this.f;
        if (zBooleanValue || zBooleanValue2) {
            ajcqVarZ = aiql.z(j$.util.Optional.empty());
        } else {
            try {
                if (zpoVar == defpackage.zpo.d && zBooleanValue3) {
                    ajcqVarZ = ahvr.H(amzgVar.d(), new defpackage.phr(context, 17), ajctVar);
                    ahoqVarW.a(ajcqVarZ);
                } else {
                    ajcqVarZ = aiql.z(j$.util.Optional.empty());
                }
            } catch (java.lang.Throwable th) {
                try {
                    ahoqVarW.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        ahoqVarW.close();
        return ajcqVarZ;
    }

    protected final ajcq c() {
        amzg amzgVar = this.h;
        amzg amzgVar2 = this.g;
        amzg amzgVar3 = this.e;
        amzg amzgVar4 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar4.d(), amzgVar3.d(), amzgVar2.d(), amzgVar.d()});
    }
}
