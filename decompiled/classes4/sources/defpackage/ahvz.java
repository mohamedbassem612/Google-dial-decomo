package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class ahvz implements ajcb {
    private final defpackage.anyd a;

    public ahvz(defpackage.anyd anydVar) {
        this.a = anydVar;
    }

    public final void a(java.lang.Throwable th) {
        if (th instanceof java.util.concurrent.ExecutionException) {
            th = th.getCause();
        }
        defpackage.anyd anydVar = this.a;
        if ((th instanceof defpackage.ahvt) && ((defpackage.ahvt) th).a()) {
            ((defpackage.anly) anydVar.a).a(anqw.l.f("Credentials failed to obtain metadata").e(th));
        } else {
            ((defpackage.anly) anydVar.a).a(anqw.g.f("Failed computing credential metadata").e(th));
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x00d8 */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ec, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void b(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahvz.b(java.lang.Object):void");
    }
}
