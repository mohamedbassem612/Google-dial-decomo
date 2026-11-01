package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apkn extends defpackage.apjz {
    final /* synthetic */ defpackage.apkz e;
    final /* synthetic */ defpackage.apko f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apkn(java.lang.String str, defpackage.apkz apkzVar, defpackage.apko apkoVar) {
        super(str, true);
        this.e = apkzVar;
        this.f = apkoVar;
    }

    @Override // defpackage.apjz
    public final long a() throws java.lang.InterruptedException {
        defpackage.apky apkyVar;
        try {
            apkyVar = this.e.c();
        } catch (java.lang.Throwable th) {
            apkyVar = new defpackage.apky(this.e, null, th);
        }
        defpackage.apko apkoVar = this.f;
        if (!apkoVar.d.contains(this.e)) {
            return -1L;
        }
        apkoVar.e.put(apkyVar);
        return -1L;
    }
}
