package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class iav implements ajat {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ boolean a;

    public /* synthetic */ iav(boolean z, int i) {
        this.$cid = i;
        this.a = z;
    }

    public final ajcq a(java.lang.Object obj) {
        int i = this.$cid;
        if (i == 0) {
            return ((defpackage.hzi) obj).c().d().e(this.a);
        }
        if (i != 1) {
            return i != 2 ? ((defpackage.adnj) obj).d(this.a) : ((defpackage.hzi) obj).c().c().a(this.a);
        }
        return this.a != ((java.lang.Boolean) obj).booleanValue() ? aiql.y(new defpackage.hxd("overridden by another mute")) : aiql.z((java.lang.Object) null);
    }
}
