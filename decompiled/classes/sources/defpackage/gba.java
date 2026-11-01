package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class gba extends defpackage.aomd {
    java.lang.Object a;
    java.lang.Object b;
    java.lang.Object c;
    boolean d;
    /* synthetic */ java.lang.Object e;
    final /* synthetic */ defpackage.gbl f;
    int g;
    defpackage.apdp h;
    defpackage.aogc i;
    defpackage.aogc j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gba(defpackage.gbl gblVar, defpackage.aoln aolnVar) {
        super(aolnVar);
        this.f = gblVar;
    }

    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.c(this);
    }
}
