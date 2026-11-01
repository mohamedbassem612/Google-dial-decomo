package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class anzq {
    static final anma a = new anma("io.grpc.internal.ManagedChannelServiceConfig.MethodInfo", (java.lang.Object) null);
    final java.lang.Long b;
    final java.lang.Boolean c;
    final java.lang.Integer d;
    final java.lang.Integer e;
    final defpackage.aobv f;
    final defpackage.anxp g;

    /* JADX WARN: Type inference failed for: r3v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v18, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v9, types: [boolean, int] */
    public anzq(java.util.Map map, boolean z) {
        long j;
        boolean z2;
        defpackage.aobv aobvVar;
        defpackage.anxp anxpVar;
        this.b = aodc.e(map, "timeout");
        this.c = aodc.b(map, "waitForReady");
        java.lang.Integer numD = aodc.d(map, "maxResponseMessageBytes");
        this.d = numD;
        if (numD != null) {
            ahvr.bR((boolean) ((numD.intValue() ^ (-1)) >>> 31), "maxInboundMessageSize %s exceeds bounds", numD);
        }
        java.lang.Integer numD2 = aodc.d(map, "maxRequestMessageBytes");
        this.e = numD2;
        if (numD2 != null) {
            ahvr.bR((boolean) ((numD2.intValue() ^ (-1)) >>> 31), "maxOutboundMessageSize %s exceeds bounds", numD2);
        }
        java.util.Map mapJ = z ? aodc.j(map, "retryPolicy") : null;
        if (mapJ == null) {
            aobvVar = null;
            j = 0;
            z2 = true;
        } else {
            java.lang.Integer numD3 = aodc.d(mapJ, "maxAttempts");
            ahvr.cj(numD3, "maxAttempts cannot be empty");
            int iIntValue = numD3.intValue();
            ahvr.bP(iIntValue >= 2, "maxAttempts must be greater than 1: %s", iIntValue);
            int iMin = java.lang.Math.min(iIntValue, 5);
            java.lang.Long lE = aodc.e(mapJ, "initialBackoff");
            ahvr.cj(lE, "initialBackoff cannot be empty");
            j = 0;
            long jLongValue = lE.longValue();
            ahvr.bQ(jLongValue > 0, "initialBackoffNanos must be greater than 0: %s", jLongValue);
            java.lang.Long lE2 = aodc.e(mapJ, "maxBackoff");
            ahvr.cj(lE2, "maxBackoff cannot be empty");
            z2 = true;
            long jLongValue2 = lE2.longValue();
            ahvr.bQ(jLongValue2 > 0, "maxBackoff must be greater than 0: %s", jLongValue2);
            java.lang.Double dC = aodc.c(mapJ, "backoffMultiplier");
            ahvr.cj(dC, "backoffMultiplier cannot be empty");
            double dDoubleValue = dC.doubleValue();
            ahvr.bR(dDoubleValue > 0.0d, "backoffMultiplier must be greater than 0: %s", dC);
            java.lang.Long lE3 = aodc.e(mapJ, "perAttemptRecvTimeout");
            ahvr.bR(lE3 == null || lE3.longValue() >= 0, "perAttemptRecvTimeout cannot be negative: %s", lE3);
            java.util.Set setA = aodc.a(mapJ, "retryableStatusCodes");
            ahvr.bE(setA != null, "%s is required in retry policy", "retryableStatusCodes");
            ahvr.bE(!setA.contains(anqt.a), "%s must not contain OK", "retryableStatusCodes");
            ahvr.bN((lE3 == null && setA.isEmpty()) ? false : true, "retryableStatusCodes cannot be empty without perAttemptRecvTimeout");
            aobvVar = new defpackage.aobv(iMin, jLongValue, jLongValue2, dDoubleValue, lE3, setA);
        }
        this.f = aobvVar;
        java.util.Map mapJ2 = z ? aodc.j(map, "hedgingPolicy") : null;
        if (mapJ2 == null) {
            anxpVar = null;
        } else {
            java.lang.Integer numD4 = aodc.d(mapJ2, "maxAttempts");
            ahvr.cj(numD4, "maxAttempts cannot be empty");
            int iIntValue2 = numD4.intValue();
            ahvr.bP(iIntValue2 >= 2 ? z2 : false, "maxAttempts must be greater than 1: %s", iIntValue2);
            int iMin2 = java.lang.Math.min(iIntValue2, 5);
            java.lang.Long lE4 = aodc.e(mapJ2, "hedgingDelay");
            ahvr.cj(lE4, "hedgingDelay cannot be empty");
            long jLongValue3 = lE4.longValue();
            ahvr.bQ((boolean) (((jLongValue3 > j ? 1 : (jLongValue3 == j ? 0 : -1)) ^ (-1)) >>> 31), "hedgingDelay must not be negative: %s", jLongValue3);
            java.util.Set setA2 = aodc.a(mapJ2, "nonFatalStatusCodes");
            if (setA2 == null) {
                setA2 = j$.util.DesugarCollections.unmodifiableSet(java.util.EnumSet.noneOf(anqt.class));
            } else {
                ahvr.bE(!setA2.contains(anqt.a), "%s must not contain OK", "nonFatalStatusCodes");
            }
            anxpVar = new defpackage.anxp(iMin2, jLongValue3, setA2);
        }
        this.g = anxpVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.anzq)) {
            return false;
        }
        defpackage.anzq anzqVar = (defpackage.anzq) obj;
        return j$.util.Objects.equals(this.b, anzqVar.b) && j$.util.Objects.equals(this.c, anzqVar.c) && j$.util.Objects.equals(this.d, anzqVar.d) && j$.util.Objects.equals(this.e, anzqVar.e) && j$.util.Objects.equals(this.f, anzqVar.f) && j$.util.Objects.equals(this.g, anzqVar.g);
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.b, this.c, this.d, this.e, this.f, this.g});
    }

    public final java.lang.String toString() {
        ahym ahymVarL = ahvr.l(this);
        ahymVarL.b("timeoutNanos", this.b);
        ahymVarL.b("waitForReady", this.c);
        ahymVarL.b("maxInboundMessageSize", this.d);
        ahymVarL.b("maxOutboundMessageSize", this.e);
        ahymVarL.b("retryPolicy", this.f);
        ahymVarL.b("hedgingPolicy", this.g);
        return ahymVarL.toString();
    }
}
