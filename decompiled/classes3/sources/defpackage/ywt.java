package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ywt implements defpackage.ywu {
    private final zzx a;

    public ywt(zzx zzxVar) {
        this.a = zzxVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.ywu
    public final java.lang.Object c(defpackage.yuw yuwVar, defpackage.taq taqVar, aoln aolnVar) {
        defpackage.yws ywsVar;
        java.lang.Throwable th;
        ahoq ahoqVar;
        if (aolnVar instanceof defpackage.yws) {
            ywsVar = (defpackage.yws) aolnVar;
            int i = ywsVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ywsVar.c = i - Integer.MIN_VALUE;
            } else {
                ywsVar = new defpackage.yws(this, aolnVar);
            }
        } else {
            ywsVar = new defpackage.yws(this, aolnVar);
        }
        java.lang.Object obj = ywsVar.a;
        aolu aoluVar = aolu.a;
        int i2 = ywsVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            if (!ahvr.R(ywsVar.u())) {
                throw new java.lang.IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
            }
            ahoq ahoqVarZ = ahvr.Z(1189, "SharpieConfigPreconditions_checkDevice");
            try {
                defpackage.yxa yxaVar = (defpackage.yxa) wsc.D(this.a, yuwVar.a.b);
                if (yxaVar != null) {
                    ywsVar.d = ahoqVarZ;
                    ywsVar.c = 1;
                    java.lang.Object objA = yxaVar.a(taqVar, ywsVar);
                    if (objA != aoluVar) {
                        obj = objA;
                        ahoqVar = ahoqVarZ;
                    }
                } else {
                    ahoqVar = ahoqVarZ;
                    ajsz.ak(ahoqVar, (java.lang.Throwable) null);
                }
                return aoluVar;
            } catch (java.lang.Throwable th2) {
                th = th2;
                ahoqVar = ahoqVarZ;
                throw th;
            }
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ahoqVar = ywsVar.d;
        try {
            aooc.af(obj);
        } catch (java.lang.Throwable th3) {
            th = th3;
            try {
                throw th;
            } catch (java.lang.Throwable th4) {
                ajsz.ak(ahoqVar, th);
                throw th4;
            }
        }
        aolu aoluVar2 = (defpackage.ywz) obj;
        aoluVar = aoluVar2 != null ? aoluVar2 : defpackage.ywv.a;
        ajsz.ak(ahoqVar, (java.lang.Throwable) null);
        return aoluVar;
    }
}
