package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yfd implements defpackage.yfj {
    private final int a;
    private defpackage.yfe b;

    public yfd(int i) {
        this.a = i;
    }

    @Override // defpackage.yfj
    public final defpackage.yfi a(defpackage.xuc xucVar) {
        if (xucVar == defpackage.xuc.e) {
            return defpackage.yfg.a;
        }
        defpackage.yfe yfeVar = this.b;
        if (yfeVar != null) {
            return yfeVar;
        }
        defpackage.yfe yfeVar2 = new defpackage.yfe(this.a);
        this.b = yfeVar2;
        return yfeVar2;
    }
}
