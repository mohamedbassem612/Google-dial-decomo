package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class ajyp implements defpackage.ajtr {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.String a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ ajyp(java.lang.String str, java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = str;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [ajym, java.lang.Object] */
    @Override // defpackage.ajtr
    public final java.lang.Object a(defpackage.ajtq ajtqVar) {
        if (this.$cid != 0) {
            return new defpackage.ajyl(this.a, this.b.a((android.content.Context) ajtqVar.e(android.content.Context.class)));
        }
        java.lang.Object obj = this.b;
        try {
            android.os.Trace.beginSection(this.a);
            return ((defpackage.ajtp) obj).f.a(ajtqVar);
        } finally {
            android.os.Trace.endSection();
        }
    }
}
