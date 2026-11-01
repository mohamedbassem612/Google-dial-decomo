package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xzy implements defpackage.xzq, defpackage.xzz {
    private final /* synthetic */ int $cid;
    private final android.content.ContentResolver a;
    private final boolean b;

    public xzy(android.content.ContentResolver contentResolver, boolean z, int i) {
        this.$cid = i;
        this.a = contentResolver;
        this.b = z;
    }

    @Override // defpackage.xzz
    public final defpackage.xvb a(android.net.Uri uri) {
        int i = this.$cid;
        if (i != 0) {
            return i != 1 ? new defpackage.xvr(this.a, uri, this.b) : new defpackage.xux(this.a, uri, this.b);
        }
        return new defpackage.xvj(this.a, uri, this.b);
    }

    @Override // defpackage.xzq
    public final defpackage.xzp b(defpackage.xzu xzuVar) {
        int i = this.$cid;
        if (i != 0) {
            return i != 1 ? new defpackage.yaa(this) : new defpackage.yaa(this);
        }
        return new defpackage.yaa(this);
    }
}
