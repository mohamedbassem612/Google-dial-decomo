package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class ahmg implements defpackage.ajas {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ ahmg(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r3v6, types: [ahmi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [ajcq, java.lang.Object] */
    @Override // defpackage.ajas
    public final defpackage.ajcq a() {
        int i = this.$cid;
        if (i == 0) {
            return this.a;
        }
        if (i == 1) {
            java.lang.Object obj = this.a;
            return defpackage.ahvr.F(new agqr(obj, 2), ((defpackage.apdi) obj).b);
        }
        if (i == 2) {
            return this.a.b();
        }
        if (i == 3) {
            return this.a;
        }
        if (i != 4) {
            defpackage.aiof aiofVar = defpackage.ajzh.a;
            return defpackage.aiql.A(((defpackage.agtc) this.a).a());
        }
        defpackage.aiof aiofVar2 = defpackage.ajzh.a;
        return defpackage.aiql.z((org.chromium.net.CronetEngine) ((defpackage.ajzd) this.a).d.a());
    }
}
