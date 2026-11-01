package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aoqk implements defpackage.aoql {
    public final defpackage.aomy a;
    public final defpackage.aonj b;

    public aoqk(defpackage.aomy aomyVar, defpackage.aonj aonjVar) {
        this.a = aomyVar;
        this.b = aonjVar;
    }

    @Override // defpackage.aoql
    public final java.util.Iterator a() {
        return new defpackage.aoqj(this);
    }
}
