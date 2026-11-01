package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class afhn extends defpackage.afhq {
    final /* synthetic */ java.lang.Object[] a;
    final /* synthetic */ java.lang.String b;
    final /* synthetic */ defpackage.afhr c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afhn(defpackage.afhr afhrVar, java.lang.Object[] objArr, java.lang.String str) {
        super(afhrVar);
        this.a = objArr;
        this.b = str;
        j$.util.Objects.requireNonNull(afhrVar);
        this.c = afhrVar;
    }

    @Override // defpackage.afhz
    public final android.database.Cursor a(android.os.CancellationSignal cancellationSignal) {
        defpackage.afhr afhrVar = this.c;
        afhrVar.d.f();
        try {
            return afhrVar.a.rawQueryWithFactory(new defpackage.afif(this.a), this.b, null, null, cancellationSignal);
        } finally {
            this.c.d.e();
        }
    }

    @Override // defpackage.afhz
    public final java.lang.String b() {
        return this.b;
    }
}
