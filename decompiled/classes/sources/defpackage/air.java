package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class air implements defpackage.cer {
    public defpackage.aiw a;
    public long b;
    public long c;
    public boolean d;
    public final defpackage.nf e;
    private final defpackage.ccp f;

    /* JADX WARN: Type inference failed for: r3v1, types: [aonj, java.lang.Object] */
    public air(defpackage.nf nfVar, java.lang.Object obj, defpackage.aiw aiwVar, long j, long j2, boolean z) {
        defpackage.aiw aiwVarBq;
        this.e = nfVar;
        this.f = new androidx.compose.runtime.ParcelableSnapshotMutableState(obj, defpackage.cdu.c);
        if (aiwVar != null) {
            aiwVarBq = defpackage.den.bq(aiwVar);
        } else {
            aiwVarBq = (defpackage.aiw) nfVar.a.a(obj);
            aiwVarBq.d();
        }
        this.a = aiwVarBq;
        this.b = j;
        this.c = j2;
        this.d = z;
    }

    @Override // defpackage.cer
    public final java.lang.Object a() {
        return this.f.a();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aonj, java.lang.Object] */
    public final java.lang.Object b() {
        return this.e.b.a(this.a);
    }

    public final void c(java.lang.Object obj) {
        this.f.b(obj);
    }

    public final java.lang.String toString() {
        return "AnimationState(value=" + a() + ", velocity=" + b() + ", isRunning=" + this.d + ", lastFrameTimeNanos=" + this.b + ", finishedTimeNanos=" + this.c + ')';
    }
}
