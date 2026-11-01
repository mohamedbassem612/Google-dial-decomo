package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aomc implements defpackage.aoln {
    public static final defpackage.aomc a = new defpackage.aomc();

    public final java.lang.String toString() {
        return "This continuation is already complete";
    }

    @Override // defpackage.aoln
    public final defpackage.aolr u() {
        throw new java.lang.IllegalStateException("This continuation is already complete");
    }

    @Override // defpackage.aoln
    public final void w(java.lang.Object obj) {
        throw new java.lang.IllegalStateException("This continuation is already complete");
    }
}
