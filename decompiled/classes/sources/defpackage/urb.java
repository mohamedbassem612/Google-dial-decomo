package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class urb implements defpackage.rvd {
    private final /* synthetic */ int $cid;
    public final android.content.Context a;
    private final defpackage.ajct b;
    private final java.lang.Object c;

    public urb(android.content.Context context, defpackage.ajct ajctVar, zlr zlrVar, int i) {
        this.$cid = i;
        this.a = context;
        this.b = ajctVar;
        this.c = zlrVar;
    }

    @Override // defpackage.rvd
    public final android.content.Intent a() {
        int i = this.$cid;
        if (i != 0) {
            return i != 1 ? new android.content.Intent("android.telecom.action.CHANGE_PHONE_ACCOUNTS").setFlags(536870912) : defpackage.afsq.bP();
        }
        return new android.content.Intent("android.telecom.action.SHOW_CALL_SETTINGS").setFlags(536870912);
    }

    @Override // defpackage.rvd
    public final defpackage.aw b() {
        int i = this.$cid;
        if (i == 0) {
            throw new java.lang.IllegalStateException("This method is not expected to be called.");
        }
        if (i == 1) {
            return new hus();
        }
        throw new java.lang.IllegalStateException("This method is not expected to be called.");
    }

    @Override // defpackage.rvd
    public final /* synthetic */ defpackage.aw c(rvq rvqVar) {
        int i = this.$cid;
        if (i != 0) {
            return i != 1 ? b() : new hus();
        }
        return b();
    }

    @Override // defpackage.rvd
    public final defpackage.ajcq d() {
        int i = this.$cid;
        if (i != 0) {
            return i != 1 ? defpackage.afsq.cb() : defpackage.afsq.bQ();
        }
        return defpackage.afsq.cb();
    }

    @Override // defpackage.rvd
    public final defpackage.ajcq e() {
        int i = this.$cid;
        if (i == 0) {
            return defpackage.ahvr.H(((zlr) this.c).l(), new uev(this, 8), this.b);
        }
        java.lang.Object obj = this.c;
        return i != 1 ? defpackage.ahvr.H(((zlr) obj).l(), new uev(this, 9), this.b) : defpackage.ahvr.H(((defpackage.huc) obj).a(), new hup(this, 0), this.b);
    }

    public urb(android.content.Context context, defpackage.huc hucVar, defpackage.ajct ajctVar, int i) {
        this.$cid = i;
        this.a = context;
        this.c = hucVar;
        this.b = ajctVar;
    }
}
