package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zdt implements defpackage.zdu {
    public static final aimz a = aimz.i("com/google/android/callingshared/peertopeer/capabilities/CapabilityDataCommander");
    public final aoss b;
    public final defpackage.zdv c;
    public final java.util.Set d;
    public final ahda e = new ahda((byte[]) null);
    public final apni f;
    private final defpackage.zdu g;
    private final aowv h;

    public zdt(aoss aossVar, apni apniVar, defpackage.zdv zdvVar, defpackage.zdu zduVar, aowv aowvVar) {
        this.b = aossVar;
        this.f = apniVar;
        this.c = zdvVar;
        this.g = zduVar;
        this.h = aowvVar;
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        this.d = linkedHashSet;
        if (aowvVar != null) {
            linkedHashSet.add(new defpackage.zdr(null, null, aowvVar));
        }
    }

    @Override // defpackage.zdu
    public final java.lang.Object a(byte[] bArr, aoln aolnVar) {
        return this.g.a(bArr, aolnVar);
    }

    @Override // defpackage.zdu
    public final java.lang.Object b(albh albhVar, aoln aolnVar) {
        return this.g.b(albhVar, aolnVar);
    }

    @Override // defpackage.zdu
    public final java.lang.Object c(aoln aolnVar) {
        return this.g.c(aolnVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Object d(defpackage.zff zffVar, defpackage.zfd zfdVar, albh albhVar, aoln aolnVar) {
        defpackage.zds zdsVar;
        java.lang.Object obj;
        if (aolnVar instanceof defpackage.zds) {
            zdsVar = (defpackage.zds) aolnVar;
            int i = zdsVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                zdsVar.d = i - Integer.MIN_VALUE;
            } else {
                zdsVar = new defpackage.zds(this, aolnVar);
            }
        } else {
            zdsVar = new defpackage.zds(this, aolnVar);
        }
        java.lang.Object objC = zdsVar.b;
        aolu aoluVar = aolu.a;
        int i2 = zdsVar.d;
        if (i2 == 0) {
            aooc.af(objC);
            zdsVar.e = zffVar;
            zdsVar.f = zfdVar;
            zdsVar.a = albhVar;
            zdsVar.d = 1;
            objC = c(zdsVar);
            if (objC != aoluVar) {
            }
            obj = albhVar;
            return aoluVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objC);
            return objC;
        }
        java.lang.Object obj2 = zdsVar.a;
        zfdVar = zdsVar.f;
        zffVar = zdsVar.e;
        aooc.af(objC);
        obj = obj2;
        obj = albhVar;
        defpackage.zff zffVar2 = zffVar;
        defpackage.zfd zfdVar2 = zfdVar;
        albh albhVar2 = obj;
        if (!((java.lang.Boolean) objC).booleanValue()) {
            return java.lang.Boolean.FALSE;
        }
        aosy aosyVarAg = ahvr.ag(this.b, this.e, new isf(this, zffVar2, zfdVar2, albhVar2, (aoln) null, 5));
        zdsVar.e = null;
        zdsVar.f = null;
        zdsVar.a = null;
        zdsVar.d = 2;
        java.lang.Object objA = aosyVarAg.a(zdsVar);
        if (objA != aoluVar) {
            return objA;
        }
        obj = albhVar;
        return aoluVar;
    }
}
