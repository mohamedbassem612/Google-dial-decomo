package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gsk extends defpackage.gsz {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gsk(java.lang.Class cls) {
        super(cls);
        if (cls == null) {
            defpackage.aooh.i("workerClass");
        }
    }

    @Override // defpackage.gsz
    public final /* bridge */ /* synthetic */ defpackage.aogc a() {
        if (this.a && this.c.k.e) {
            throw new java.lang.IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
        }
        return new defpackage.aogc(this);
    }
}
