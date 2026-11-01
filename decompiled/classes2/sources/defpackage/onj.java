package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class onj extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;

    public onj(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amzg amzgVar5) {
        super(amyzVar2, new amzw(defpackage.onj.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        amzs.b(amzgVar3);
        this.d = amzs.b(amzgVar4);
        this.e = amzs.b(amzgVar5);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0051  */
    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        j$.util.Optional optionalOf;
        java.util.List list = (java.util.List) obj;
        android.content.Context context = (android.content.Context) list.get(0);
        qix qixVar = (qix) list.get(1);
        boolean zBooleanValue = ((java.lang.Boolean) list.get(2)).booleanValue();
        j$.util.Optional optional = (j$.util.Optional) list.get(3);
        if (zBooleanValue) {
            int iOrdinal = ((defpackage.aayy) optional.orElseThrow()).ordinal();
            if (iOrdinal == 2) {
                int iOrdinal2 = qixVar.ordinal();
                if (iOrdinal2 == 2 || iOrdinal2 == 3) {
                    optionalOf = j$.util.Optional.of(context.getText(2132018732));
                } else {
                    optionalOf = j$.util.Optional.empty();
                }
            } else if (iOrdinal == 3 && qixVar.ordinal() == 1) {
                optionalOf = j$.util.Optional.of(context.getText(2132018732));
            } else {
                optionalOf = j$.util.Optional.empty();
            }
        } else {
            optionalOf = j$.util.Optional.empty();
        }
        return aiql.z(optionalOf);
    }

    protected final ajcq c() {
        amzg amzgVar = this.e;
        amzg amzgVar2 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar2.d(), amzgVar.d()});
    }
}
