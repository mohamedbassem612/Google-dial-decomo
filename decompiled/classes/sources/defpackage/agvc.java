package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class agvc implements defpackage.agvb {
    private final /* synthetic */ int $cid;
    private final java.lang.Object a;

    public agvc(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.agvb
    public final defpackage.ajcq a(java.lang.String str) {
        int i = this.$cid;
        java.lang.Object obj = this.a;
        return i != 0 ? ((defpackage.gzd) obj).b() : defpackage.agab.aW(((defpackage.gsp) ((defpackage.gsy) obj).a(str)).c);
    }

    @Override // defpackage.agvb
    public final defpackage.ajcq b(java.util.UUID uuid) {
        int i = this.$cid;
        java.lang.Object obj = this.a;
        return i != 0 ? ((defpackage.gzd) obj).c() : defpackage.agab.aW(((defpackage.gsp) ((defpackage.gsy) obj).b(uuid)).c);
    }

    @Override // defpackage.agvb
    public final defpackage.ajcq c(defpackage.ipc ipcVar) {
        int i = this.$cid;
        java.lang.Object obj = this.a;
        return i != 0 ? ((defpackage.gzd) obj).g() : ((defpackage.gsy) obj).e(ipcVar);
    }

    @Override // defpackage.agvb
    public final defpackage.ajcq d(defpackage.aogc aogcVar) {
        int i = this.$cid;
        java.lang.Object obj = this.a;
        return i != 0 ? ((defpackage.gzd) obj).d() : defpackage.agab.aW(((defpackage.gsp) ((defpackage.gsy) obj).f(aogcVar)).c);
    }

    @Override // defpackage.agvb
    public final defpackage.ajcq e(java.lang.String str, int i, defpackage.aogc aogcVar) {
        int i2 = this.$cid;
        java.lang.Object obj = this.a;
        if (i2 != 0) {
            return ((defpackage.gzd) obj).e();
        }
        defpackage.ajcq ajcqVar = ((defpackage.gsp) ((defpackage.gsy) obj).g(str, i, aogcVar)).c;
        defpackage.agqh agqhVar = new defpackage.agqh(2);
        defpackage.ajbm ajbmVar = defpackage.ajbm.INSTANCE;
        long j = defpackage.ahqx.a;
        defpackage.ahqv ahqvVar = new defpackage.ahqv(defpackage.ahns.c(false), agqhVar);
        int i3 = defpackage.ajan.c;
        defpackage.ajam ajamVar = new defpackage.ajam(ajcqVar, ahqvVar);
        ajcqVar.c(ajamVar, defpackage.aiql.t(ajbmVar, ajamVar));
        return ajamVar;
    }

    @Override // defpackage.agvb
    public final /* synthetic */ defpackage.ajcq f(java.lang.String str, int i, defpackage.aogc aogcVar) {
        if (this.$cid != 0) {
            java.util.Collections.singletonList(aogcVar);
            return ((defpackage.gzd) this.a).f();
        }
        defpackage.ajcq ajcqVar = ((defpackage.gsp) ((defpackage.gsy) this.a).d(str, i, java.util.Collections.singletonList(aogcVar))).c;
        defpackage.agqh agqhVar = new defpackage.agqh(2);
        defpackage.ajbm ajbmVar = defpackage.ajbm.INSTANCE;
        long j = defpackage.ahqx.a;
        defpackage.ahqv ahqvVar = new defpackage.ahqv(defpackage.ahns.c(false), agqhVar);
        int i2 = defpackage.ajan.c;
        defpackage.ajam ajamVar = new defpackage.ajam(ajcqVar, ahqvVar);
        ajcqVar.c(ajamVar, defpackage.aiql.t(ajbmVar, ajamVar));
        return ajamVar;
    }
}
