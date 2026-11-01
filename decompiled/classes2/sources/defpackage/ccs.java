package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ccs implements defpackage.cal {
    private final aomy a;
    private final civ b = new civ();

    public ccs(aomy aomyVar) {
        this.a = aomyVar;
    }

    @Override // defpackage.cal
    public final void a() {
        if (this.b.compareAndSet(1, 1)) {
            return;
        }
        this.a.a();
    }
}
