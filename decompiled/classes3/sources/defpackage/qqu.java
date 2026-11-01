package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class qqu implements java.util.function.Supplier {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ j$.util.Optional a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ java.lang.Object d;
    public final /* synthetic */ java.lang.Object e;

    public /* synthetic */ qqu(j$.util.Optional optional, zjm zjmVar, boolean z, defpackage.qrv qrvVar, boolean z2, int i) {
        this.$cid = i;
        this.a = optional;
        this.d = zjmVar;
        this.b = z;
        this.e = qrvVar;
        this.c = z2;
    }

    @Override // java.util.function.Supplier
    public final java.lang.Object get() {
        if (this.$cid == 0) {
            j$.util.Optional optionalOfNullable = this.a;
            if (true == optionalOfNullable.isPresent()) {
                optionalOfNullable = j$.util.Optional.ofNullable(java.lang.Boolean.valueOf(((android.os.PersistableBundle) optionalOfNullable.get()).getBoolean("show_video_call_charges_alert_dialog_bool", false)));
            }
            return java.lang.Boolean.valueOf((((zjm) this.d).g().isPresent() || this.b || ((defpackage.qrv) this.e).j.get() || !((java.lang.Boolean) optionalOfNullable.orElse(java.lang.Boolean.FALSE)).booleanValue() || !this.c) ? false : true);
        }
        if (this.b || this.c || this.d != defpackage.zmy.a) {
            return java.lang.Boolean.FALSE;
        }
        int iAR = a.aR(((defpackage.pls) this.a.orElse(defpackage.pls.a)).c);
        if (iAR == 0) {
            iAR = 1;
        }
        if (iAR != 2) {
            return java.lang.Boolean.valueOf(iAR == 3);
        }
        return java.lang.Boolean.valueOf(((defpackage.sql) this.e).c() == udj.c);
    }

    public /* synthetic */ qqu(boolean z, boolean z2, defpackage.zmy zmyVar, j$.util.Optional optional, defpackage.sql sqlVar, int i) {
        this.$cid = i;
        this.b = z;
        this.c = z2;
        this.d = zmyVar;
        this.a = optional;
        this.e = sqlVar;
    }
}
