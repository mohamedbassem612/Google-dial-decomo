package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class xgi implements defpackage.xpb {
    private final /* synthetic */ int $cid;

    public /* synthetic */ xgi(int i) {
        this.$cid = i;
    }

    @Override // defpackage.xpb
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ java.lang.Object b(android.os.PersistableBundle persistableBundle) {
        int i = this.$cid;
        if (i == 0) {
            return defpackage.xfh.d(this, persistableBundle);
        }
        if (i == 1) {
            return defpackage.xfh.d(this, persistableBundle);
        }
        if (i != 2) {
            return i != 3 ? defpackage.xfh.d(this, persistableBundle) : defpackage.xfh.d(this, persistableBundle);
        }
        return defpackage.xfh.d(this, persistableBundle);
    }

    @Override // defpackage.xhf
    public final /* synthetic */ java.lang.Object b(java.lang.Object obj) {
        int i = this.$cid;
        if (i != 0 && i != 1 && i != 2 && i == 3) {
            return b((android.os.PersistableBundle) obj);
        }
        return b((android.os.PersistableBundle) obj);
    }

    @Override // defpackage.xpb
    public final java.lang.Object c(android.os.PersistableBundle persistableBundle) {
        int i = this.$cid;
        if (i == 0) {
            aooh.f(persistableBundle, "it");
            return defpackage.xer.j(persistableBundle);
        }
        if (i == 1) {
            aooh.f(persistableBundle, "it");
            defpackage.xfz xfzVar = defpackage.xfz.USER_CANCELLED;
            return defpackage.xer.d(persistableBundle);
        }
        if (i == 2) {
            aooh.f(persistableBundle, "it");
            return defpackage.xgf.h(persistableBundle);
        }
        if (i != 3) {
            aooh.f(persistableBundle, "it");
            return defpackage.xgf.i(persistableBundle);
        }
        aooh.f(persistableBundle, "it");
        return defpackage.xnn.a.c(persistableBundle);
    }
}
