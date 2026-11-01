package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hvg extends amzm {
    private final amzg b;
    private final amzg c;

    public hvg(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2) {
        super(amyzVar2, new amzw(defpackage.hvg.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0050  */
    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        defpackage.hux huxVar;
        java.util.List list = (java.util.List) obj;
        j$.util.Optional optional = (j$.util.Optional) list.get(0);
        android.os.Bundle bundle = (android.os.Bundle) list.get(1);
        aooh.f(optional, "autoAssistedEmergencyCallDataParser");
        aooh.f(bundle, "callIntentExtras");
        if (optional.isPresent()) {
            java.lang.Object objOrElseThrow = optional.orElseThrow();
            aooh.e(objOrElseThrow, "orElseThrow(...)");
            j$.util.Optional optionalA = ((defpackage.iny) objOrElseThrow).a(bundle);
            defpackage.inz inzVarB = null;
            defpackage.ioa ioaVar = (defpackage.ioa) optionalA.orElse((java.lang.Object) null);
            if (ioaVar != null && (inzVarB = defpackage.inz.b(ioaVar.b)) == null) {
                inzVarB = defpackage.inz.UNSPECIFIED;
            }
            if (inzVarB == null) {
                huxVar = defpackage.hux.VOICE_ASSIST_EMERGENCY_TYPE_UNSPECIFIED;
            } else {
                int iOrdinal = inzVarB.ordinal();
                if (iOrdinal == 1) {
                    huxVar = defpackage.hux.CAR_CRASH;
                } else if (iOrdinal != 2) {
                    huxVar = defpackage.hux.VOICE_ASSIST_EMERGENCY_TYPE_UNSPECIFIED;
                } else {
                    huxVar = defpackage.hux.EMERGENCY_SOS;
                }
            }
        } else {
            huxVar = defpackage.hux.VOICE_ASSIST_EMERGENCY_TYPE_UNSPECIFIED;
        }
        return aiql.z(huxVar);
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.b.d(), this.c.d()});
    }
}
