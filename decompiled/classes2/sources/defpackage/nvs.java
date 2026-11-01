package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class nvs extends aomh implements aonn {
    int a;
    final /* synthetic */ android.telephony.ims.ImsManager b;
    final /* synthetic */ int c;
    final /* synthetic */ defpackage.nvw d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nvs(android.telephony.ims.ImsManager imsManager, int i, defpackage.nvw nvwVar, aoln aolnVar) {
        super(2, aolnVar);
        this.b = imsManager;
        this.c = i;
        this.d = nvwVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        android.telephony.ims.ImsMmTelManager imsMmTelManagerM;
        aolu aoluVar = aolu.a;
        int i = this.a;
        aooc.af(obj);
        if (i != 0) {
            return obj;
        }
        try {
            imsMmTelManagerM = baa$.ExternalSyntheticApiModelOutline1.m(this.b, this.c);
        } catch (java.util.concurrent.CancellationException e) {
            throw e;
        } catch (java.lang.Exception e2) {
            defpackage.nvw.a.d().k(e2).l("com/android/dialer/dualsim/canselect/CanSelectSim", "isImsRegistered$<anonymous>", 181, "CanSelectSim.kt").w("Failed to get ImsMmTelManager for subId %d.", this.c);
            imsMmTelManagerM = null;
        }
        if (imsMmTelManagerM == null) {
            return java.lang.Boolean.FALSE;
        }
        defpackage.nvw nvwVar = this.d;
        int i2 = this.c;
        this.a = 1;
        java.lang.Object objC = nvwVar.c(imsMmTelManagerM, i2, this);
        return objC == aoluVar ? aoluVar : objC;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.nvs(this.b, this.c, this.d, aolnVar);
    }
}
