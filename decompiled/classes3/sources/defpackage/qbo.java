package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qbo extends amzm {
    private final amzg b;

    public qbo(amyz amyzVar, amyz amyzVar2, amzg amzgVar) {
        super(amyzVar2, new defpackage.amzw(defpackage.qbo.class), amyzVar);
        this.b = amzs.b(amzgVar);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        defpackage.amoq amoqVar;
        int iOrdinal = ((defpackage.zmy) obj).ordinal();
        if (iOrdinal != 0) {
            amoqVar = iOrdinal != 1 ? defpackage.amoq.UNKNOWN_CALL_TYPE : defpackage.amoq.OUTGOING_CALL;
        } else {
            amoqVar = defpackage.amoq.INCOMING_CALL;
        }
        return aiql.z(amoqVar);
    }

    protected final ajcq c() {
        return this.b.d();
    }
}
