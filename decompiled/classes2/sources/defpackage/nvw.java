package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class nvw {
    public static final aimz a = aimz.i("com/android/dialer/dualsim/canselect/CanSelectSim");
    public static final android.content.ComponentName b = new android.content.ComponentName("com.android.phone", "com.android.services.telephony.TelephonyConnectionService");
    public final android.content.Context c;
    public final aolr d;
    public final aolr e;
    public final java.util.concurrent.Executor f;
    public final zjs g;
    public final oko h;
    public final okj i;
    public final aoin j;
    public final zjm k;
    public final defpackage.kvt l;

    public nvw(android.content.Context context, aolr aolrVar, aolr aolrVar2, java.util.concurrent.Executor executor, zjs zjsVar, oko okoVar, okj okjVar, defpackage.kvt kvtVar, zjm zjmVar, aoin aoinVar) {
        aooh.f(context, "context");
        aooh.f(aolrVar, "blockingContext");
        aooh.f(aolrVar2, "lightweightContext");
        aooh.f(executor, "blockingExecutor");
        aooh.f(zjsVar, "dialerTelecom");
        aooh.f(kvtVar, "activeCalls");
        aooh.f(aoinVar, "enableBackupCallingSimSelection");
        this.c = context;
        this.d = aolrVar;
        this.e = aolrVar2;
        this.f = executor;
        this.g = zjsVar;
        this.h = okoVar;
        this.i = okjVar;
        this.l = kvtVar;
        this.k = zjmVar;
        this.j = aoinVar;
    }

    public final java.lang.Object a(android.telecom.PhoneAccountHandle phoneAccountHandle, boolean z, aoln aolnVar) {
        return aoov.aj(this.e, new yrw(this, phoneAccountHandle, z, (aoln) null, 1), aolnVar);
    }

    public final java.lang.Object b(android.telecom.PhoneAccountHandle phoneAccountHandle, int i, aoln aolnVar) {
        return aoov.aj(this.e, new defpackage.kgx(this, phoneAccountHandle, i, (aoln) null, 4), aolnVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(android.telephony.ims.ImsMmTelManager imsMmTelManager, int i, aoln aolnVar) {
        defpackage.nvt nvtVar;
        if (aolnVar instanceof defpackage.nvt) {
            nvtVar = (defpackage.nvt) aolnVar;
            int i2 = nvtVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nvtVar.d = i2 - Integer.MIN_VALUE;
            } else {
                nvtVar = new defpackage.nvt(this, aolnVar);
            }
        } else {
            nvtVar = new defpackage.nvt(this, aolnVar);
        }
        java.lang.Object objM = nvtVar.b;
        aolu aoluVar = aolu.a;
        int i3 = nvtVar.d;
        boolean z = false;
        try {
            if (i3 == 0) {
                aooc.af(objM);
                defpackage.nvv nvvVar = new defpackage.nvv(imsMmTelManager, this, null);
                nvtVar.a = i;
                nvtVar.d = 1;
                objM = aooh.M(50L, nvvVar, nvtVar);
                if (objM == aoluVar) {
                    return aoluVar;
                }
            } else {
                if (i3 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = nvtVar.a;
                aooc.af(objM);
            }
            java.lang.Boolean bool = (java.lang.Boolean) objM;
            if (bool != null && bool.booleanValue()) {
                z = true;
            }
        } catch (java.util.concurrent.CancellationException e) {
            throw e;
        } catch (java.lang.Exception e2) {
            a.d().k(e2).l("com/android/dialer/dualsim/canselect/CanSelectSim", "isRegistered", 208, "CanSelectSim.kt").w("Failed to get IMS registration state for subId %d.", i);
        }
        return java.lang.Boolean.valueOf(z);
    }
}
