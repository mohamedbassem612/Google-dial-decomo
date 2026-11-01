package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apgx implements defpackage.alai {
    private final /* synthetic */ int $cid;
    public static final defpackage.alai d = new defpackage.apgx(3);
    public static final defpackage.alai c = new defpackage.apgx(2);
    static final defpackage.alai b = new defpackage.apgx(1);
    static final defpackage.alai a = new defpackage.apgx(0);

    private apgx(int i) {
        this.$cid = i;
    }

    @Override // defpackage.alai
    public final boolean a(int i) {
        int i2 = this.$cid;
        if (i2 != 0) {
            if (i2 == 1) {
                return defpackage.a.ax(i);
            }
            if (i2 == 2) {
                return defpackage.a.aw(i);
            }
        }
        return defpackage.a.av(i);
    }
}
