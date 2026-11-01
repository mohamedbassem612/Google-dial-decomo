package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xph implements defpackage.xpn {
    public static final defpackage.xph a = new defpackage.xph(defpackage.xpa.p);
    private final defpackage.xoz b;

    public xph(defpackage.xoz xozVar) {
        this.b = xozVar;
    }

    @Override // defpackage.xpn, defpackage.xoz
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final android.os.PersistableBundle ew(java.util.List list) {
        android.os.PersistableBundle persistableBundle = new android.os.PersistableBundle();
        persistableBundle.putInt("size", list.size());
        int i = 0;
        for (java.lang.Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                ajsz.bh();
            }
            defpackage.xfh.j(persistableBundle, a.bj(i, "item_"), obj, this.b);
            i = i2;
        }
        return persistableBundle;
    }

    @Override // defpackage.xoz
    public final /* synthetic */ defpackage.xoz e() {
        return new defpackage.xoy(this);
    }
}
