package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class rtc extends defpackage.aomd {
    java.lang.Object a;
    int b;
    long c;
    /* synthetic */ java.lang.Object d;
    final /* synthetic */ defpackage.rtg e;
    int f;
    j$.time.Instant g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rtc(defpackage.rtg rtgVar, defpackage.aoln aolnVar) {
        super(aolnVar);
        this.e = rtgVar;
    }

    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.c(null, 0, this);
    }
}
