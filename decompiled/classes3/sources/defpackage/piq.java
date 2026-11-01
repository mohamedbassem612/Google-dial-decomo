package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class piq implements java.util.function.Supplier {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ boolean a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ piq(java.lang.Object obj, boolean z, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = z;
    }

    @Override // java.util.function.Supplier
    public final java.lang.Object get() {
        int i = this.$cid;
        if (i == 0) {
            return this.a ? j$.util.Optional.ofNullable(((android.telecom.GatewayInfo) ((j$.util.Optional) this.b).orElseThrow()).getGatewayAddress().getSchemeSpecificPart()) : j$.util.Optional.empty();
        }
        if (i == 1) {
            j$.util.Optional optional = (j$.util.Optional) this.b;
            if (optional.isPresent() && !android.text.TextUtils.isEmpty(((android.telecom.PhoneAccount) optional.orElseThrow()).getLabel()) && this.a) {
                return j$.util.Optional.of(dxt.a().d(((android.telecom.PhoneAccount) optional.orElseThrow()).getLabel().toString(), dxv.a));
            }
            return j$.util.Optional.empty();
        }
        if (i == 2) {
            if (this.a) {
                return java.lang.Boolean.TRUE;
            }
            j$.util.Optional optionalG = ((zpm) this.b).g();
            return !optionalG.isPresent() ? java.lang.Boolean.FALSE : java.lang.Boolean.valueOf(defpackage.zcy.a(((defpackage.pvw) ((defpackage.apqr) optionalG.orElseThrow()).a(defpackage.pvw.class)).c()).d());
        }
        if (i == 3) {
            return this.a ? java.lang.Boolean.FALSE : java.lang.Boolean.valueOf(!((defpackage.qrv) this.b).i.get());
        }
        if (i == 4) {
            if (this.a) {
                return j$.util.Optional.empty();
            }
            return ((defpackage.qrv) this.b).b(defpackage.qrt.b);
        }
        if (i == 5) {
            return ((defpackage.qrv) this.b).k.get() ? java.lang.Boolean.FALSE : java.lang.Boolean.valueOf(this.a);
        }
        if (this.a) {
            return j$.util.Optional.empty();
        }
        return ((defpackage.qrv) this.b).b(defpackage.qrt.a);
    }

    public /* synthetic */ piq(boolean z, java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = z;
        this.b = obj;
    }
}
