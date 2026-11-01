package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jdi extends aomh implements aonj {
    final /* synthetic */ long a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jdi(long j, aoln aolnVar) {
        super(1, aolnVar);
        this.a = j;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        return new defpackage.jdi(this.a, (aoln) obj).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        aooc.af(obj);
        return ajsz.aO(new aoiu[]{new aoiu("country", "all"), new aoiu("version", java.lang.String.valueOf(this.a))});
    }
}
