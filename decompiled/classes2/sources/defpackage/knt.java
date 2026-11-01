package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class knt implements defpackage.oqx {
    private final android.content.Context a;
    private final defpackage.kmc b;

    public knt(android.content.Context context, defpackage.kmc kmcVar) {
        this.a = context;
        this.b = kmcVar;
    }

    @Override // defpackage.oqx
    public final int a() {
        return 2131231949;
    }

    @Override // defpackage.oqx
    public final java.lang.String b() {
        return this.a.getString(2132018227);
    }

    @Override // defpackage.oqx
    public final void c(az azVar) {
        java.lang.String str;
        defpackage.kmc kmcVar = this.b;
        int i = kmcVar.e;
        int iW = defpackage.hgu.w(i);
        if (iW == 0) {
            iW = 1;
        }
        if (iW - 1 == 4) {
            ahvr.cj(azVar, "FragmentActivity is required to show the dialog.");
            ((kns) agab.aH(azVar, kns.class)).bt().o(rmx.lT);
            defpackage.knp knpVar = new defpackage.knp();
            amxr.g(knpVar);
            ahgl.b(knpVar, kmcVar);
            knpVar.r(azVar.a(), defpackage.knq.a);
            return;
        }
        int iW2 = defpackage.hgu.w(i);
        if (iW2 == 0 || iW2 == 1) {
            str = "UNKNOWN";
        } else if (iW2 != 5) {
            str = iW2 != 6 ? "null" : "CONVERSATION_HISTORY_CALL_DETAILS";
        } else {
            str = "CONVERSATION_HISTORY_CALL_LOG";
        }
        throw new java.lang.IllegalStateException(java.lang.String.format("Unsupported origin: %s", str));
    }

    @Override // defpackage.oqx
    public final void e() {
        android.content.Context context = this.a;
        c(context instanceof az ? (az) context : null);
    }

    @Override // defpackage.oqx
    public final /* synthetic */ void d() {
    }
}
