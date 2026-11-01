package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class xpk implements defpackage.xpn {
    public static final defpackage.xpj a = new defpackage.xpj();
    private final defpackage.xoz b;
    private final defpackage.xoz c;

    public xpk(defpackage.xoz xozVar, defpackage.xoz xozVar2) {
        this.b = xozVar;
        this.c = xozVar2;
    }

    @Override // defpackage.xpn, defpackage.xoz
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final android.os.PersistableBundle ew(java.util.Map map) {
        aooh.f(map, "value");
        android.os.PersistableBundle persistableBundle = new android.os.PersistableBundle();
        persistableBundle.putInt("size", map.size());
        int i = 0;
        for (java.util.Map.Entry entry : map.entrySet()) {
            defpackage.xfh.j(persistableBundle, a.bj(i, "key_"), entry.getKey(), this.b);
            defpackage.xfh.j(persistableBundle, a.bj(i, "item_"), entry.getValue(), this.c);
            i++;
        }
        return persistableBundle;
    }

    @Override // defpackage.xoz
    public final /* synthetic */ defpackage.xoz e() {
        return new defpackage.xoy(this);
    }
}
