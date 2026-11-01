package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class amzs {
    public static final defpackage.ahyc a = new defpackage.amzp();
    public static final defpackage.ajat b = new defpackage.amzq(0);
    public static final defpackage.amzg c = defpackage.aooc.am(defpackage.aikj.b);

    public static defpackage.amzg a(defpackage.amzg amzgVar, amzo amzoVar) {
        if (amzgVar instanceof defpackage.amzn) {
            return ((defpackage.amzn) amzgVar).dT(amzoVar);
        }
        java.util.Objects.toString(amzgVar);
        throw new java.lang.IllegalArgumentException("entryPointViewOf called with non-CancellableProducer: ".concat(java.lang.String.valueOf(amzgVar)));
    }

    public static defpackage.amzg b(defpackage.amzg amzgVar) {
        if (amzgVar instanceof defpackage.amzn) {
            return ((defpackage.amzn) amzgVar).dR();
        }
        java.util.Objects.toString(amzgVar);
        throw new java.lang.IllegalArgumentException("nonCancellationPropagatingViewOf called with non-CancellableProducer: ".concat(java.lang.String.valueOf(amzgVar)));
    }

    public static defpackage.amzg c(defpackage.amyz amyzVar) {
        amyzVar.getClass();
        return new defpackage.amzr(amyzVar);
    }

    public static void d(defpackage.amzg amzgVar, boolean z) {
        if (amzgVar instanceof defpackage.amzn) {
            ((defpackage.amzn) amzgVar).dU(z);
        } else {
            java.util.Objects.toString(amzgVar);
            throw new java.lang.IllegalArgumentException("cancel called with non-CancellableProducer: ".concat(java.lang.String.valueOf(amzgVar)));
        }
    }
}
