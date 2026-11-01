package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class pvv implements java.util.function.Supplier {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ boolean a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;

    public /* synthetic */ pvv(boolean z, mfz mfzVar, zpm zpmVar, aoin aoinVar, int i) {
        this.$cid = i;
        this.a = z;
        this.b = mfzVar;
        this.d = zpmVar;
        this.c = aoinVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, mfv] */
    /* JADX WARN: Type inference failed for: r8v3, types: [aoin, java.lang.Object] */
    @Override // java.util.function.Supplier
    public final java.lang.Object get() {
        if (this.$cid == 0) {
            ?? r0 = this.b;
            if (this.a) {
                mni.aK((mfv) r0, mfy.bQ);
                return java.lang.Boolean.TRUE;
            }
            j$.util.Optional optionalG = ((zpm) this.d).g();
            if (!optionalG.isPresent()) {
                return java.lang.Boolean.FALSE;
            }
            android.telecom.Call callC = ((defpackage.pvw) ((defpackage.apqr) optionalG.orElseThrow()).a(defpackage.pvw.class)).c();
            boolean z = android.telecom.VideoProfile.isVideo(callC.getDetails().getVideoState()) && callC.getDetails().hasProperty(1) && ((long) callC.getChildren().size()) >= ((java.lang.Long) this.c.a()).longValue();
            if (z) {
                mni.aK((mfv) r0, mfy.bQ);
            }
            return java.lang.Boolean.valueOf(z);
        }
        boolean z2 = this.a;
        java.lang.Object obj = this.b;
        if (!z2) {
            return ((android.content.Context) obj).getString(2132019076);
        }
        java.lang.Object obj2 = this.d;
        if (obj2 != null) {
            int iOrdinal = ((defpackage.zmw) obj2).ordinal();
            if (iOrdinal == 1) {
                j$.util.Optional optional = (j$.util.Optional) this.c;
                return (java.lang.String) (true != optional.isPresent() ? ((android.content.Context) new idb(obj, 7).a).getString(2132017465) : optional.get());
            }
            if (iOrdinal == 2) {
                return ((android.content.Context) obj).getString(2132017466);
            }
            if (iOrdinal == 3) {
                return ((android.content.Context) obj).getString(2132017470);
            }
        }
        return ((android.content.Context) obj).getString(2132017467);
    }

    public /* synthetic */ pvv(boolean z, defpackage.zmw zmwVar, j$.util.Optional optional, android.content.Context context, int i) {
        this.$cid = i;
        this.a = z;
        this.d = zmwVar;
        this.c = optional;
        this.b = context;
    }
}
