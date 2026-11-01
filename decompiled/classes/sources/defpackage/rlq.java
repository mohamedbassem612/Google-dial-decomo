package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class rlq extends defpackage.aomd {
    public /* synthetic */ java.lang.Object a;
    public int b;
    final /* synthetic */ defpackage.rsr c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rlq(defpackage.rsr rsrVar, defpackage.aoln aolnVar) {
        super(aolnVar);
        this.c = rsrVar;
    }

    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.c(this);
    }
}
