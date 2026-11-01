package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class oft implements znu {
    public final aoss a;
    public final aolr b;
    public final android.media.AudioManager c;
    public boolean d;
    public boolean e;
    public int f;
    public final defpackage.ogj g;
    public defpackage.ogj h;
    public final ahda i;
    private final aoss j;
    private final rwi k;

    public oft(aoss aossVar, android.content.Context context, aoss aossVar2, aolr aolrVar, android.media.AudioManager audioManager, oju ojuVar, rwi rwiVar, defpackage.ogj ogjVar) {
        aooh.f(aossVar, "lwScope");
        aooh.f(context, "appContext");
        aooh.f(aossVar2, "blockingScope");
        aooh.f(aolrVar, "backgroundContext");
        aooh.f(ojuVar, "dialerAudioManager");
        aooh.f(rwiVar, "dialerNotificationManager");
        this.j = aossVar;
        this.a = aossVar2;
        this.b = aolrVar;
        this.c = audioManager;
        this.k = rwiVar;
        this.g = ogjVar;
        this.i = new ahda((byte[]) null);
        this.f = -1;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0083  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(boolean z, boolean z2, aoln aolnVar) {
        defpackage.ofr ofrVar;
        java.lang.Boolean boolValueOf;
        if (aolnVar instanceof defpackage.ofr) {
            ofrVar = (defpackage.ofr) aolnVar;
            int i = ofrVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                ofrVar.e = i - Integer.MIN_VALUE;
            } else {
                ofrVar = new defpackage.ofr(this, aolnVar);
            }
        } else {
            ofrVar = new defpackage.ofr(this, aolnVar);
        }
        java.lang.Object objD = ofrVar.c;
        java.lang.Boolean bool = aolu.a;
        int i2 = ofrVar.e;
        if (i2 == 0) {
            aooc.af(objD);
            ajcq ajcqVarG = this.k.g();
            ofrVar.a = z;
            ofrVar.b = z2;
            ofrVar.e = 1;
            objD = aosv.D(ajcqVarG, ofrVar);
            if (objD != bool) {
            }
            return bool;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objD);
            return objD;
        }
        z2 = ofrVar.b;
        z = ofrVar.a;
        aooc.af(objD);
        if (!((java.lang.Boolean) objD).booleanValue()) {
            return java.lang.Boolean.TRUE;
        }
        ofrVar.e = 2;
        android.app.NotificationManager.Policy policyB = this.k.b();
        if ((policyB.priorityCategories & 16) != 0 && z2) {
            boolValueOf = java.lang.Boolean.TRUE;
        } else if ((policyB.priorityCategories & 8) == 0) {
            boolValueOf = java.lang.Boolean.FALSE;
        } else {
            int i3 = policyB.priorityCallSenders;
            if (i3 == 0 || i3 == 1) {
                boolValueOf = java.lang.Boolean.TRUE;
            } else if (i3 == 2) {
                boolValueOf = java.lang.Boolean.valueOf(z);
            } else {
                boolValueOf = java.lang.Boolean.FALSE;
            }
        }
        java.lang.Boolean bool2 = boolValueOf;
        if (bool2 != bool) {
            return bool2;
        }
        return bool;
    }

    public final ajcq c() {
        return aosv.F(this.j, 0, new nto(this, (aoln) null, 19), 3);
    }
}
