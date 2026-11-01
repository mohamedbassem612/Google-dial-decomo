package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class pqt implements java.util.function.Supplier {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ boolean a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ pqt(defpackage.zmy zmyVar, boolean z, android.os.Bundle bundle, int i) {
        this.$cid = i;
        this.b = zmyVar;
        this.a = z;
        this.c = bundle;
    }

    @Override // java.util.function.Supplier
    public final java.lang.Object get() {
        java.lang.Object objValueOf;
        if (this.$cid != 0) {
            if (this.b != defpackage.zmy.b || this.a) {
                return hkw.a;
            }
            byte[] byteArray = ((android.os.Bundle) this.c).getByteArray("call_configuration");
            if (byteArray == null) {
                return hkw.a;
            }
            try {
                hhw hhwVarB = alad.B(hhw.a, byteArray, akzq.a());
                aooh.e(hhwVarB, "parseFrom(...)");
                hkw hkwVarB = hkw.b(hhwVarB.b);
                return hkwVarB == null ? hkw.a : hkwVarB;
            } catch (alaz e) {
                defpackage.phn.a.b().l("com/android/dialer/incall/callconfiguration/CallConfigurationProducerModule", "produceStartUiMode$<anonymous>", 53, "CallConfigurationProducerModule.kt").y("failed to parse callConfigurationByteArray: %s", e.getMessage());
                return hkw.a;
            }
        }
        if (this.a) {
            return java.lang.Boolean.TRUE;
        }
        java.lang.Object obj = this.c;
        java.lang.Object obj2 = this.b;
        j$.util.Optional optional = ((defpackage.zmn) obj2).i;
        idf idfVar = new idf(obj2, obj, 6, (byte[]) null);
        if (true != optional.isPresent()) {
            java.lang.Object obj3 = idfVar.b;
            java.lang.Object obj4 = idfVar.a;
            ahvr.ci(obj4);
            android.net.Uri handle = ((android.telecom.Call) obj4).getDetails().getHandle();
            defpackage.zmn zmnVar = (defpackage.zmn) obj3;
            objValueOf = java.lang.Boolean.valueOf(zmnVar.l.X(handle == null ? "" : handle.getSchemeSpecificPart()));
            zmnVar.i = j$.util.Optional.of(objValueOf);
        } else {
            objValueOf = optional.get();
        }
        java.lang.Boolean bool = (java.lang.Boolean) objValueOf;
        bool.booleanValue();
        return bool;
    }

    public /* synthetic */ pqt(boolean z, defpackage.zmn zmnVar, android.telecom.Call call, int i) {
        this.$cid = i;
        this.a = z;
        this.b = zmnVar;
        this.c = call;
    }
}
