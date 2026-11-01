package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class acgy implements defpackage.ajcb {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    public acgy(defpackage.soj sojVar, defpackage.ajcq ajcqVar, int i) {
        this.$cid = i;
        this.a = ajcqVar;
        j$.util.Objects.requireNonNull(sojVar);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [ajcq, java.lang.Object] */
    @Override // defpackage.ajcb
    public final void a(java.lang.Throwable th) {
        int i = this.$cid;
        if (i == 0) {
            java.lang.Object obj = this.a;
            synchronized (obj) {
                ((defpackage.acgz) obj).c = null;
            }
        } else {
            if (i != 1 || this.a.isCancelled()) {
                return;
            }
            android.util.Log.e("DialerPersistentLogger", "error writing message", th);
        }
    }

    @Override // defpackage.ajcb
    public final /* synthetic */ void b(java.lang.Object obj) {
        int i = this.$cid;
        if (i == 0) {
            java.lang.Object obj2 = this.a;
            java.util.Map map = (java.util.Map) obj;
            synchronized (obj2) {
                if (!((defpackage.acgz) obj2).b) {
                    ((defpackage.acgz) obj2).a = new java.util.HashMap(map);
                }
                ((defpackage.acgz) obj2).c = null;
            }
            return;
        }
        if (i == 1) {
            return;
        }
        if (i == 2) {
            defpackage.afhx afhxVar = (defpackage.afhx) this.a;
            java.lang.String str = afhxVar.g;
            java.lang.String str2 = (java.lang.String) obj;
            new java.io.File((str == null ? afhxVar.b.getDatabasePath(str2) : new java.io.File(str, str2)).getPath().concat(".bak")).delete();
            return;
        }
        if (new java.io.File(((android.database.sqlite.SQLiteDatabase) obj).getPath()).exists()) {
            return;
        }
        java.lang.Object obj3 = this.a;
        synchronized (((defpackage.afhx) obj3).i) {
            ((defpackage.afhx) obj3).d();
        }
    }

    public acgy(defpackage.acgz acgzVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(acgzVar);
        this.a = acgzVar;
    }

    public acgy(defpackage.afhx afhxVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(afhxVar);
        this.a = afhxVar;
    }

    public acgy(defpackage.afhx afhxVar, int i, byte[] bArr) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(afhxVar);
        this.a = afhxVar;
    }
}
