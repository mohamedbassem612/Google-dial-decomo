package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zij {
    public static final aimz a = aimz.i("com/google/android/dialershared/crosssurfacefeature/relay/CrossSurfaceRelay");
    public final aoss b;
    public final zzx c;
    public final apni d;
    private final zzx e;
    private final ahda f;

    public zij(zzx zzxVar, zzx zzxVar2, apni apniVar, aoss aossVar) {
        aooh.f(apniVar, "androidJobs");
        aooh.f(aossVar, "lightweightScope");
        this.c = zzxVar;
        this.e = zzxVar2;
        this.d = apniVar;
        this.b = aossVar;
        this.f = new ahda((byte[]) null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Object a(albh albhVar, aoln aolnVar) {
        aoln ziiVar;
        java.lang.Object objK;
        albh albhVar2;
        defpackage.zik zikVar;
        if (aolnVar instanceof defpackage.zii) {
            ziiVar = (defpackage.zii) aolnVar;
            int i = ziiVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                ziiVar.e = i - Integer.MIN_VALUE;
            } else {
                ziiVar = new defpackage.zii(this, aolnVar);
            }
        } else {
            ziiVar = new defpackage.zii(this, aolnVar);
        }
        java.lang.Object obj = ziiVar.c;
        java.lang.Object obj2 = aolu.a;
        int i2 = ziiVar.e;
        if (i2 == 0) {
            aooc.af(obj);
            a.b().l("com/google/android/dialershared/crosssurfacefeature/relay/CrossSurfaceRelay", "relayCrossSurfaceEventToListeners", 89, "CrossSurfaceRelay.kt").y("Relaying cross surface event: %s", albhVar);
            objK = this.e.e().k();
            aooh.e(objK, "iterator(...)");
            albhVar2 = albhVar;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objK = ziiVar.b;
            java.lang.Object obj3 = ziiVar.a;
            aooc.af(obj);
            albhVar2 = obj3;
        }
        do {
            ailj ailjVar = (ailj) objK;
            if (!ailjVar.hasNext()) {
                return aojh.a;
            }
            zikVar = (defpackage.zik) ailjVar.next();
            ziiVar.a = albhVar2;
            ziiVar.b = objK;
            ziiVar.e = 1;
        } while (zikVar.b(albhVar2, ziiVar) != obj2);
        return obj2;
    }

    public final void b(aonj aonjVar) {
        this.d.i(ahvr.ag(this.b, this.f, new defpackage.xtn(aonjVar, (aoln) null, 10, (char[]) null)));
    }

    public final void c(albh albhVar) {
        aooh.f(albhVar, "outboundEvent");
        b(new nhv(albhVar, this, (aoln) null, 12, (byte[]) null));
    }
}
