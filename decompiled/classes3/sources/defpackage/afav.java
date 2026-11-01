package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afav {
    public java.lang.Boolean a;
    private final aift c = new aift(4);
    private final aift d = new aift(4);
    public boolean b = false;

    public final defpackage.afaw a() {
        ahvr.cj(this.a, "Must call internal() or external() when building a SourcePolicy.");
        return new defpackage.afaw(this.a.booleanValue(), this.b, this.c.h(), this.d.h());
    }

    public final void b(defpackage.afay afayVar) {
        ahvr.cj(this.a, "Must call internal() or external() before appending rules.");
        this.c.i(afayVar);
    }

    public final void c() {
        ahvr.bZ(this.a == null, "A SourcePolicy can only set internal() or external() once.");
        this.a = java.lang.Boolean.FALSE;
    }
}
