package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class fgg extends defpackage.flq {
    final /* synthetic */ defpackage.fgm a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fgg(defpackage.fgm fgmVar, defpackage.fma fmaVar) {
        super(fmaVar);
        j$.util.Objects.requireNonNull(fgmVar);
        this.a = fgmVar;
    }

    @Override // defpackage.flq, defpackage.fma
    public final long a() {
        return this.a.m;
    }
}
