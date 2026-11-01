package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class aotn extends defpackage.aotp {
    final /* synthetic */ aotr a;
    private final aosb c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aotn(aotr aotrVar, long j, aosb aosbVar) {
        super(j);
        this.a = aotrVar;
        this.c = aosbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.f(this.a, aojh.a);
    }

    @Override // defpackage.aotp
    public final java.lang.String toString() {
        java.lang.String string = super.toString();
        aosb aosbVar = this.c;
        java.util.Objects.toString(aosbVar);
        return string.concat(aosbVar.toString());
    }
}
