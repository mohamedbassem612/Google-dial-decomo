package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jyb {
    public static final aimz a = aimz.i("com/android/dialer/calllog/CallLogDeleter");
    public final rlv b;
    public final gpd c;
    private final ajct d;
    private final jys e;
    private final ojo f;
    private final android.net.Uri g;

    public jyb(android.content.Context context, ajct ajctVar, jys jysVar, ojo ojoVar, rlv rlvVar, gpd gpdVar) {
        aooh.f(context, "context");
        aooh.f(ajctVar, "lightweightExecutor");
        aooh.f(ojoVar, "dialerContentResolver");
        aooh.f(rlvVar, "loggingBindings");
        aooh.f(gpdVar, "cuiSemanticLoggerFactory");
        this.d = ajctVar;
        this.e = jysVar;
        this.f = ojoVar;
        this.b = rlvVar;
        this.c = gpdVar;
        android.net.Uri uriBuild = android.provider.CallLog.Calls.CONTENT_URI.buildUpon().appendQueryParameter("include_voip_calls", "true").build();
        aooh.e(uriBuild, "build(...)");
        this.g = uriBuild;
    }

    public final void a(defpackage.kmc kmcVar) {
        aooh.f(kmcVar, "deleteCallsContext");
        ahvr.bS(defpackage.hgu.x(kmcVar.c) != 1, "nothing set to delete", new java.lang.Object[0]);
        int i = kmcVar.c;
        if (i == 2) {
            ahvr.J(aiql.w(new ajcq[]{this.e.a(), this.f.e(this.g, (java.lang.String) null, (java.lang.String[]) null)}), new defpackage.jya(0), this.d);
            return;
        }
        kiu kiuVar = i == 3 ? (kiu) kmcVar.d : kiu.a;
        aooh.e(kiuVar, "getRowToDelete(...)");
        defpackage.kis kisVar = kiuVar.u;
        if (kisVar == null) {
            kisVar = defpackage.kis.a;
        }
        alan alanVar = kisVar.b;
        aooh.e(alanVar, "getCoalescedIdList(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl(alanVar, 10));
        java.util.Iterator it = alanVar.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.String.valueOf((java.lang.Long) it.next()));
        }
        rsr rsrVar = new rsr();
        rsrVar.aC(new kaw("_id").aF(arrayList));
        rsr rsrVarAB = rsrVar.aB();
        ahvr.J(this.f.e(this.g, (java.lang.String) rsrVarAB.b, (java.lang.String[]) rsrVarAB.a), new defpackage.kxp(kiuVar, this, 1), this.d);
    }
}
