package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class exz implements defpackage.fjx, defpackage.ezc {
    private final java.util.concurrent.CopyOnWriteArraySet a = new java.util.concurrent.CopyOnWriteArraySet();

    @Override // defpackage.fjx
    public final void a(long j, long j2, defpackage.eqg eqgVar, android.media.MediaFormat mediaFormat) {
        java.util.Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((defpackage.fjx) it.next()).a(j, j2, eqgVar, mediaFormat);
        }
    }

    @Override // defpackage.ezc
    public final void p(int i, java.lang.Object obj) {
        throw null;
    }
}
