package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ggs extends defpackage.aomd {
    /* synthetic */ java.lang.Object a;
    int b;
    java.lang.Object c;
    final /* synthetic */ defpackage.ggt d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ggs(defpackage.ggt ggtVar, defpackage.aoln aolnVar) {
        super(aolnVar);
        this.d = ggtVar;
    }

    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
